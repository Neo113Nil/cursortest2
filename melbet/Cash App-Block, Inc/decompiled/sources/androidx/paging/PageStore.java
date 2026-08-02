package androidx.paging;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.ViewportHint;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public final class PageStore {
    public static final PageStore INITIAL;
    public int dataCount;
    public final ArrayList pages;
    public int placeholdersAfter;
    public int placeholdersBefore;

    static {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new TransformablePage(0, EmptyList.INSTANCE));
        LoadState.NotLoading notLoading = LoadState.NotLoading.Incomplete;
        LoadState.NotLoading notLoading2 = LoadState.NotLoading.Complete;
        LoadStates loadStates = new LoadStates(notLoading, notLoading2, notLoading2);
        listOf.getClass();
        INITIAL = new PageStore(new PageEvent.Insert(LoadType.REFRESH, listOf, 0, 0, loadStates, null));
    }

    public PageStore(int i, int i2, List list) {
        list.getClass();
        this.pages = new ArrayList(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((TransformablePage) it.next()).data.size();
        }
        this.dataCount = i3;
        this.placeholdersBefore = i;
        this.placeholdersAfter = i2;
    }

    public final ViewportHint.Access createAccessHintForIndex(int i) {
        ArrayList arrayList;
        int i2 = 0;
        int i3 = i - this.placeholdersBefore;
        while (true) {
            arrayList = this.pages;
            if (i3 < ((TransformablePage) arrayList.get(i2)).data.size() || i2 >= CollectionsKt__CollectionsKt.getLastIndex(arrayList)) {
                break;
            }
            i3 -= ((TransformablePage) arrayList.get(i2)).data.size();
            i2++;
        }
        return new ViewportHint.Access(((TransformablePage) arrayList.get(i2)).hintOriginalPageOffset, i3, i - this.placeholdersBefore, ((getSize() - i) - this.placeholdersAfter) - 1, getOriginalPageOffsetFirst(), getOriginalPageOffsetLast());
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PageStore)) {
            return false;
        }
        PageStore pageStore = (PageStore) obj;
        return getOriginalPageOffsetFirst() == pageStore.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == pageStore.getOriginalPageOffsetLast() && this.placeholdersBefore == pageStore.placeholdersBefore && this.placeholdersAfter == pageStore.placeholdersAfter && Intrinsics.areEqual(this.pages, pageStore.pages);
    }

    public final Object getItem(int i) {
        ArrayList arrayList = this.pages;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((TransformablePage) arrayList.get(i2)).data.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((TransformablePage) arrayList.get(i2)).data.get(i);
    }

    public final int getOriginalPageOffsetFirst() {
        Integer valueOf;
        int[] iArr = ((TransformablePage) CollectionsKt.first((List) this.pages)).originalPageOffsets;
        iArr.getClass();
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i > i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf.getClass();
        return valueOf.intValue();
    }

    public final int getOriginalPageOffsetLast() {
        Integer valueOf;
        int[] iArr = ((TransformablePage) CollectionsKt.last((List) this.pages)).originalPageOffsets;
        iArr.getClass();
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf.getClass();
        return valueOf.intValue();
    }

    public final int getSize() {
        return this.placeholdersBefore + this.dataCount + this.placeholdersAfter;
    }

    public final int hashCode() {
        return (this.pages.hashCode() * 31) + (this.placeholdersAfter * 31) + (this.placeholdersBefore * 31) + (getOriginalPageOffsetLast() * 31) + (getOriginalPageOffsetFirst() * 31);
    }

    public final FlowExtKt processEvent(PageEvent pageEvent) {
        pageEvent.getClass();
        boolean z = pageEvent instanceof PageEvent.Insert;
        final int i = 0;
        ArrayList arrayList = this.pages;
        if (!z) {
            if (!(pageEvent instanceof PageEvent.Drop)) {
                a$$ExternalSyntheticBUOutline0.m$1("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            IntRange intRange = new IntRange(0, 0, 1);
            Iterator it = arrayList.iterator();
            final int i2 = 0;
            while (it.hasNext()) {
                TransformablePage transformablePage = (TransformablePage) it.next();
                int[] iArr = transformablePage.originalPageOffsets;
                int length = iArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (intRange.contains(iArr[i3])) {
                        i2 += transformablePage.data.size();
                        it.remove();
                        break;
                    }
                    i3++;
                }
            }
            int i4 = this.dataCount - i2;
            this.dataCount = i4;
            LoadType loadType = LoadType.PREPEND;
            final int i5 = this.placeholdersAfter;
            this.placeholdersAfter = 0;
            final int i6 = this.placeholdersBefore + i4;
            return new FlowExtKt(i6, i2, i, i5) { // from class: androidx.paging.PagingDataEvent$DropAppend
                public final int dropCount;
                public final int newPlaceholdersAfter;
                public final int oldPlaceholdersAfter;
                public final int startIndex;

                {
                    this.startIndex = i6;
                    this.dropCount = i2;
                    this.newPlaceholdersAfter = i;
                    this.oldPlaceholdersAfter = i5;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof PagingDataEvent$DropAppend)) {
                        return false;
                    }
                    PagingDataEvent$DropAppend pagingDataEvent$DropAppend = (PagingDataEvent$DropAppend) obj;
                    return this.startIndex == pagingDataEvent$DropAppend.startIndex && this.dropCount == pagingDataEvent$DropAppend.dropCount && this.newPlaceholdersAfter == pagingDataEvent$DropAppend.newPlaceholdersAfter && this.oldPlaceholdersAfter == pagingDataEvent$DropAppend.oldPlaceholdersAfter;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.oldPlaceholdersAfter) + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.dropCount) + Integer.hashCode(this.startIndex);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
                    int i7 = this.dropCount;
                    sb.append(i7);
                    sb.append(" items (\n                    |   startIndex: ");
                    Recorder$$ExternalSyntheticOutline1.m105m(this.startIndex, i7, "\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb);
                    sb.append(this.newPlaceholdersAfter);
                    sb.append("\n                    |   oldPlaceholdersBefore: ");
                    sb.append(this.oldPlaceholdersAfter);
                    sb.append("\n                    |)\n                    |");
                    return StringsKt__IndentKt.trimMargin$default(sb.toString());
                }
            };
        }
        PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
        List list = insert.pages;
        List list2 = list;
        Iterator it2 = list2.iterator();
        int i7 = 0;
        while (it2.hasNext()) {
            i7 += ((TransformablePage) it2.next()).data.size();
        }
        int ordinal = insert.loadType.ordinal();
        if (ordinal == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (ordinal == 1) {
            final int i8 = this.placeholdersBefore;
            arrayList.addAll(0, list);
            this.dataCount += i7;
            this.placeholdersBefore = insert.placeholdersBefore;
            final ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((TransformablePage) it3.next()).data, arrayList2);
            }
            final int i9 = this.placeholdersBefore;
            return new FlowExtKt(arrayList2, i9, i8) { // from class: androidx.paging.PagingDataEvent$Prepend
                public final ArrayList inserted;
                public final int newPlaceholdersBefore;
                public final int oldPlaceholdersBefore;

                {
                    this.inserted = arrayList2;
                    this.newPlaceholdersBefore = i9;
                    this.oldPlaceholdersBefore = i8;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof PagingDataEvent$Prepend)) {
                        return false;
                    }
                    PagingDataEvent$Prepend pagingDataEvent$Prepend = (PagingDataEvent$Prepend) obj;
                    return this.inserted.equals(pagingDataEvent$Prepend.inserted) && this.newPlaceholdersBefore == pagingDataEvent$Prepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == pagingDataEvent$Prepend.oldPlaceholdersBefore;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.oldPlaceholdersBefore) + Integer.hashCode(this.newPlaceholdersBefore) + this.inserted.hashCode();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
                    ArrayList arrayList3 = this.inserted;
                    sb.append(arrayList3.size());
                    sb.append(" items (\n                    |   first item: ");
                    sb.append(CollectionsKt.firstOrNull((List) arrayList3));
                    sb.append("\n                    |   last item: ");
                    sb.append(CollectionsKt.lastOrNull((List) arrayList3));
                    sb.append("\n                    |   newPlaceholdersBefore: ");
                    sb.append(this.newPlaceholdersBefore);
                    sb.append("\n                    |   oldPlaceholdersBefore: ");
                    sb.append(this.oldPlaceholdersBefore);
                    sb.append("\n                    |)\n                    |");
                    return StringsKt__IndentKt.trimMargin$default(sb.toString());
                }
            };
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        final int i10 = this.placeholdersAfter;
        int i11 = this.dataCount;
        arrayList.addAll(arrayList.size(), list);
        this.dataCount += i7;
        this.placeholdersAfter = insert.placeholdersAfter;
        final int i12 = this.placeholdersBefore + i11;
        final ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((TransformablePage) it4.next()).data, arrayList3);
        }
        final int i13 = this.placeholdersAfter;
        return new FlowExtKt(i12, i13, i10, arrayList3) { // from class: androidx.paging.PagingDataEvent$Append
            public final ArrayList inserted;
            public final int newPlaceholdersAfter;
            public final int oldPlaceholdersAfter;
            public final int startIndex;

            {
                this.startIndex = i12;
                this.inserted = arrayList3;
                this.newPlaceholdersAfter = i13;
                this.oldPlaceholdersAfter = i10;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof PagingDataEvent$Append)) {
                    return false;
                }
                PagingDataEvent$Append pagingDataEvent$Append = (PagingDataEvent$Append) obj;
                return this.startIndex == pagingDataEvent$Append.startIndex && this.inserted.equals(pagingDataEvent$Append.inserted) && this.newPlaceholdersAfter == pagingDataEvent$Append.newPlaceholdersAfter && this.oldPlaceholdersAfter == pagingDataEvent$Append.oldPlaceholdersAfter;
            }

            public final int hashCode() {
                return Integer.hashCode(this.oldPlaceholdersAfter) + Integer.hashCode(this.newPlaceholdersAfter) + this.inserted.hashCode() + Integer.hashCode(this.startIndex);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
                ArrayList arrayList4 = this.inserted;
                sb.append(arrayList4.size());
                sb.append(" items (\n                    |   startIndex: ");
                sb.append(this.startIndex);
                sb.append("\n                    |   first item: ");
                sb.append(CollectionsKt.firstOrNull((List) arrayList4));
                sb.append("\n                    |   last item: ");
                sb.append(CollectionsKt.lastOrNull((List) arrayList4));
                sb.append("\n                    |   newPlaceholdersBefore: ");
                sb.append(this.newPlaceholdersAfter);
                sb.append("\n                    |   oldPlaceholdersBefore: ");
                sb.append(this.oldPlaceholdersAfter);
                sb.append("\n                    |)\n                    |");
                return StringsKt__IndentKt.trimMargin$default(sb.toString());
            }
        };
    }

    public final String toString() {
        int i = this.dataCount;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(getItem(i2));
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.placeholdersBefore);
        sb.append(" placeholders), ");
        sb.append(joinToString$default);
        sb.append(", (");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholdersAfter, " placeholders)]", sb);
    }

    public PageStore(PageEvent.Insert insert) {
        this(insert.placeholdersBefore, insert.placeholdersAfter, insert.pages);
    }
}
