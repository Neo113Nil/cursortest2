package androidx.paging;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class PageEvent {

    public abstract class Drop extends PageEvent {
        public abstract int getPageCount();
    }

    public final class Insert extends PageEvent {
        public final LoadType loadType;
        public final LoadStates mediatorLoadStates;
        public final List pages;
        public final int placeholdersAfter;
        public final int placeholdersBefore;
        public final LoadStates sourceLoadStates;

        public Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            if (loadType != LoadType.APPEND && i < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
                throw null;
            }
            if (loadType != LoadType.PREPEND && i2 < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
                throw null;
            }
            if (loadType == LoadType.REFRESH && list.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.loadType == insert.loadType && Intrinsics.areEqual(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && Intrinsics.areEqual(this.sourceLoadStates, insert.sourceLoadStates) && Intrinsics.areEqual(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        public final int hashCode() {
            int hashCode = (this.sourceLoadStates.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholdersAfter, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholdersBefore, Recorder$$ExternalSyntheticOutline2.m(this.loadType.hashCode() * 31, 31, this.pages), 31), 31)) * 31;
            LoadStates loadStates = this.mediatorLoadStates;
            return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d6 -> B:10:0x00de). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0081 -> B:11:0x00a4). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object map(TaxWebAppBridge.AnonymousClass4 anonymousClass4, Continuation continuation) {
            PageEvent$Insert$map$1 pageEvent$Insert$map$1;
            int i;
            LoadType loadType;
            ArrayList arrayList;
            PageEvent$Insert$map$1 pageEvent$Insert$map$12;
            Iterator it;
            TaxWebAppBridge.AnonymousClass4 anonymousClass42;
            Insert insert = this;
            if (continuation instanceof PageEvent$Insert$map$1) {
                pageEvent$Insert$map$1 = (PageEvent$Insert$map$1) continuation;
                int i2 = pageEvent$Insert$map$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pageEvent$Insert$map$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = pageEvent$Insert$map$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pageEvent$Insert$map$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list = insert.pages;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        loadType = insert.loadType;
                        arrayList = arrayList2;
                        pageEvent$Insert$map$12 = pageEvent$Insert$map$1;
                        it = it2;
                        anonymousClass42 = anonymousClass4;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection = pageEvent$Insert$map$1.L$10;
                        Collection collection2 = pageEvent$Insert$map$1.L$9;
                        Iterator it3 = pageEvent$Insert$map$1.L$8;
                        Collection collection3 = pageEvent$Insert$map$1.L$7;
                        int[] iArr = pageEvent$Insert$map$1.L$6;
                        TransformablePage transformablePage = pageEvent$Insert$map$1.L$5;
                        Iterator it4 = pageEvent$Insert$map$1.L$4;
                        Collection collection4 = pageEvent$Insert$map$1.L$3;
                        LoadType loadType2 = pageEvent$Insert$map$1.L$2;
                        Insert insert2 = pageEvent$Insert$map$1.L$1;
                        Function function = pageEvent$Insert$map$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        PageEvent$Insert$map$1 pageEvent$Insert$map$13 = pageEvent$Insert$map$1;
                        Function function2 = function;
                        TransformablePage transformablePage2 = transformablePage;
                        LoadType loadType3 = loadType2;
                        ArrayList arrayList3 = collection3;
                        ArrayList arrayList4 = collection4;
                        Iterator it5 = it3;
                        collection2.add(obj);
                        Iterator it6 = it4;
                        Iterator it7 = it5;
                        ArrayList arrayList5 = arrayList3;
                        Insert insert3 = insert2;
                        TransformablePage transformablePage3 = transformablePage2;
                        ?? r2 = function2;
                        if (it7.hasNext()) {
                            Object next = it7.next();
                            pageEvent$Insert$map$13.L$0 = r2;
                            pageEvent$Insert$map$13.L$1 = insert3;
                            pageEvent$Insert$map$13.L$2 = loadType3;
                            pageEvent$Insert$map$13.L$3 = arrayList4;
                            pageEvent$Insert$map$13.L$4 = it6;
                            pageEvent$Insert$map$13.L$5 = transformablePage3;
                            pageEvent$Insert$map$13.L$6 = iArr;
                            ArrayList arrayList6 = arrayList5;
                            pageEvent$Insert$map$13.L$7 = arrayList6;
                            pageEvent$Insert$map$13.L$8 = it7;
                            pageEvent$Insert$map$13.L$9 = arrayList6;
                            pageEvent$Insert$map$13.L$10 = collection;
                            pageEvent$Insert$map$13.label = 1;
                            Object invoke = r2.invoke(next, pageEvent$Insert$map$13);
                            if (invoke == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            insert2 = insert3;
                            obj = invoke;
                            transformablePage2 = transformablePage3;
                            arrayList3 = arrayList5;
                            it5 = it7;
                            it4 = it6;
                            collection2 = arrayList3;
                            function2 = r2;
                            collection2.add(obj);
                            Iterator it62 = it4;
                            Iterator it72 = it5;
                            ArrayList arrayList52 = arrayList3;
                            Insert insert32 = insert2;
                            TransformablePage transformablePage32 = transformablePage2;
                            ?? r22 = function2;
                            if (it72.hasNext()) {
                                collection.add(new TransformablePage(iArr, arrayList52, transformablePage32.hintOriginalPageOffset));
                                insert = insert32;
                                anonymousClass42 = r22;
                                it = it62;
                                pageEvent$Insert$map$12 = pageEvent$Insert$map$13;
                                arrayList = arrayList4;
                                loadType = loadType3;
                                if (it.hasNext()) {
                                    return new Insert(loadType, arrayList, insert.placeholdersBefore, insert.placeholdersAfter, insert.sourceLoadStates, insert.mediatorLoadStates);
                                }
                                TransformablePage transformablePage4 = (TransformablePage) it.next();
                                int[] iArr2 = transformablePage4.originalPageOffsets;
                                List list2 = transformablePage4.data;
                                arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                it72 = list2.iterator();
                                loadType3 = loadType;
                                iArr = iArr2;
                                transformablePage32 = transformablePage4;
                                arrayList4 = arrayList;
                                pageEvent$Insert$map$13 = pageEvent$Insert$map$12;
                                it62 = it;
                                r22 = anonymousClass42;
                                insert32 = insert;
                                collection = arrayList4;
                                if (it72.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            pageEvent$Insert$map$1 = new PageEvent$Insert$map$1(insert, (ContinuationImpl) continuation);
            Object obj2 = pageEvent$Insert$map$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = pageEvent$Insert$map$1.label;
            if (i != 0) {
            }
        }

        public final String toString() {
            List list;
            List list2;
            List list3 = this.pages;
            Iterator it = list3.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((TransformablePage) it.next()).data.size();
            }
            int i2 = this.placeholdersBefore;
            String valueOf = i2 != -1 ? String.valueOf(i2) : "none";
            int i3 = this.placeholdersAfter;
            String valueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.loadType);
            sb.append(", with ");
            sb.append(i);
            sb.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt.firstOrNull(list3);
            Object obj = null;
            sb.append((transformablePage == null || (list2 = transformablePage.data) == null) ? null : CollectionsKt.firstOrNull(list2));
            sb.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.lastOrNull(list3);
            if (transformablePage2 != null && (list = transformablePage2.data) != null) {
                obj = CollectionsKt.lastOrNull(list);
            }
            sb.append(obj);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(valueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(valueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.sourceLoadStates);
            sb.append("\n                    ");
            String sb2 = sb.toString();
            LoadStates loadStates = this.mediatorLoadStates;
            if (loadStates != null) {
                sb2 = sb2 + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(sb2.concat("|)"));
        }
    }

    public final class LoadStateUpdate extends PageEvent {
        public final LoadStates mediator;
        public final LoadStates source;

        public LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2) {
            this.source = loadStates;
            this.mediator = loadStates2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) obj;
            return this.source.equals(loadStateUpdate.source) && Intrinsics.areEqual(this.mediator, loadStateUpdate.mediator);
        }

        public final int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            LoadStates loadStates = this.mediator;
            return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.source + "\n                    ";
            LoadStates loadStates = this.mediator;
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(str.concat("|)"));
        }
    }

    public final class StaticList extends PageEvent {
        public final List data;

        public StaticList(List list) {
            list.getClass();
            this.data = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StaticList) && Intrinsics.areEqual(this.data, ((StaticList) obj).data);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, this.data.hashCode() * 29791, 31);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:10:0x0077). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object map(TaxWebAppBridge.AnonymousClass4 anonymousClass4, Continuation continuation) {
            PageEvent$StaticList$map$1 pageEvent$StaticList$map$1;
            int i;
            Iterator it;
            Collection collection;
            Function2 function2;
            if (continuation instanceof PageEvent$StaticList$map$1) {
                pageEvent$StaticList$map$1 = (PageEvent$StaticList$map$1) continuation;
                int i2 = pageEvent$StaticList$map$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pageEvent$StaticList$map$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = pageEvent$StaticList$map$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pageEvent$StaticList$map$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list = this.data;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        it = list.iterator();
                        collection = arrayList;
                        function2 = anonymousClass4;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        collection = pageEvent$StaticList$map$1.L$3;
                        it = pageEvent$StaticList$map$1.L$2;
                        Collection collection2 = pageEvent$StaticList$map$1.L$1;
                        Function2 function22 = pageEvent$StaticList$map$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        collection.add(obj);
                        collection = collection2;
                        function2 = function22;
                        if (it.hasNext()) {
                            Object next = it.next();
                            pageEvent$StaticList$map$1.L$0 = function2;
                            Collection collection3 = collection;
                            pageEvent$StaticList$map$1.L$1 = collection3;
                            pageEvent$StaticList$map$1.L$2 = it;
                            pageEvent$StaticList$map$1.L$3 = collection3;
                            pageEvent$StaticList$map$1.label = 1;
                            Object invoke = function2.invoke(next, pageEvent$StaticList$map$1);
                            if (invoke == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            function22 = function2;
                            obj = invoke;
                            collection2 = collection;
                            collection.add(obj);
                            collection = collection2;
                            function2 = function22;
                            if (it.hasNext()) {
                                return new StaticList((List) collection);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$map$1 = new PageEvent$StaticList$map$1(this, (ContinuationImpl) continuation);
            Object obj2 = pageEvent$StaticList$map$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = pageEvent$StaticList$map$1.label;
            if (i != 0) {
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
            List list = this.data;
            sb.append(list.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.firstOrNull(list));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.lastOrNull(list));
            sb.append("\n                    |   sourceLoadStates: null,\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    ");
            return StringsKt__IndentKt.trimMargin$default(sb.toString().concat("|)"));
        }
    }

    public Object map(TaxWebAppBridge.AnonymousClass4 anonymousClass4, Continuation continuation) {
        return this;
    }
}
