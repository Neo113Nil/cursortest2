package androidx.compose.ui.text;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.work.impl.WorkLauncherImpl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final List annotations;
    public final ArrayList paragraphStylesOrNull;
    public final ArrayList spanStylesOrNull;
    public final String text;

    public interface Annotation {
    }

    static {
        WorkLauncherImpl workLauncherImpl = SaversKt.AnnotatedStringSaver;
    }

    public AnnotatedString(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) list.get(i2);
                Object obj = range.item;
                if (obj instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (obj instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List sortedWith = arrayList2 != null ? CollectionsKt.sortedWith(arrayList2, new AnnotatedString$special$$inlined$sortedBy$1(i)) : null;
        List list2 = sortedWith;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i3 = ((Range) CollectionsKt.first(sortedWith)).end;
        MutableIntList mutableIntList = IntListKt.EmptyIntList;
        MutableIntList mutableIntList2 = new MutableIntList(1);
        mutableIntList2.add(i3);
        int size2 = sortedWith.size();
        for (int i4 = 1; i4 < size2; i4++) {
            Range range2 = (Range) sortedWith.get(i4);
            while (true) {
                if (mutableIntList2._size != 0) {
                    int last = mutableIntList2.last();
                    int i5 = range2.start;
                    int i6 = range2.end;
                    if (i5 >= last) {
                        mutableIntList2.removeAt(mutableIntList2._size - 1);
                    } else if (i6 > last) {
                        InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + last);
                    }
                }
            }
            mutableIntList2.add(range2.end);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.text.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public final List getLinkAnnotations(int i, int i2) {
        List list;
        List list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list2.get(i3);
                Range range = (Range) obj;
                if ((range.item instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i, i2, range.start, range.end)) {
                    list.add(obj);
                }
            }
        } else {
            list = EmptyList.INSTANCE;
        }
        list.getClass();
        return list;
    }

    public final List getSpanStyles() {
        ArrayList arrayList = this.spanStylesOrNull;
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    public final List getStringAnnotations(int i, String str) {
        List list = this.annotations;
        if (list == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) list.get(i2);
            if ((range.item instanceof StringAnnotation) && str.equals(range.tag) && AnnotatedStringKt.intersect(0, i, range.start, range.end)) {
                arrayList.add(TextPainterKt.unbox(range));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final List getTtsAnnotations(int i) {
        ?? r0;
        List list = this.annotations;
        if (list != null) {
            r0 = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Range range = (Range) obj;
                if ((range.item instanceof VerbatimTtsAnnotation) && AnnotatedStringKt.intersect(0, i, range.start, range.end)) {
                    r0.add(obj);
                }
            }
        } else {
            r0 = EmptyList.INSTANCE;
        }
        r0.getClass();
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final List getUrlAnnotations(int i) {
        ?? r0;
        List list = this.annotations;
        if (list != null) {
            r0 = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Range range = (Range) obj;
                if ((range.item instanceof UrlAnnotation) && AnnotatedStringKt.intersect(0, i, range.start, range.end)) {
                    r0.add(obj);
                }
            }
        } else {
            r0 = EmptyList.INSTANCE;
        }
        r0.getClass();
        return r0;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List list = this.annotations;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.text.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r0.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnnotatedString subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.text;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        AnnotatedString annotatedString = AnnotatedStringKt.EmptyAnnotatedString;
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.annotations;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range range = (Range) list.get(i3);
                int i4 = range.start;
                int i5 = range.end;
                if (AnnotatedStringKt.intersect(i, i2, i4, i5)) {
                    arrayList.add(new Range(range.item, Math.max(i, range.start) - i, Math.min(i2, i5) - i, range.tag));
                }
            }
        }
        arrayList = null;
        return new AnnotatedString(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.text;
    }

    /* loaded from: classes3.dex */
    public final class Builder implements Appendable {
        public final ArrayList annotations;
        public final ArrayList styleStack;
        public final StringBuilder text;

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            new ArrayList();
        }

        public final void addLink(LinkAnnotation.Url url, int i, int i2) {
            this.annotations.add(new MutableRange(url, i, i2, 8));
        }

        public final void addStringAnnotation(String str, int i, int i2, String str2) {
            this.annotations.add(new MutableRange(new StringAnnotation(str2), i, i2, str));
        }

        public final void addStyle(SpanStyle spanStyle, int i, int i2) {
            this.annotations.add(new MutableRange(spanStyle, i, i2, 8));
        }

        public final void append(AnnotatedString annotatedString, int i, int i2) {
            StringBuilder sb = this.text;
            int length = sb.length();
            sb.append((CharSequence) annotatedString.text, i, i2);
            List localAnnotations = AnnotatedStringKt.getLocalAnnotations(annotatedString, i, i2, null);
            if (localAnnotations != null) {
                int size = localAnnotations.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Range range = (Range) localAnnotations.get(i3);
                    this.annotations.add(new MutableRange(range.item, range.start + length, range.end + length, range.tag));
                }
            }
        }

        public final void pop(int i) {
            ArrayList arrayList = this.styleStack;
            if (i >= arrayList.size()) {
                InlineClassHelperKt.throwIllegalStateException(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                pop();
            }
        }

        public final int pushLink(LinkAnnotation linkAnnotation) {
            MutableRange mutableRange = new MutableRange(linkAnnotation, this.text.length(), 0, 12);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return r5.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange mutableRange = new MutableRange(spanStyle, this.text.length(), 0, 12);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return r5.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            StringBuilder sb = this.text;
            String sb2 = sb.toString();
            ArrayList arrayList = this.annotations;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((MutableRange) arrayList.get(i)).toRange(sb.length()));
            }
            return new AnnotatedString(sb2, (List) arrayList2);
        }

        public final class MutableRange {
            public int end;
            public final Object item;
            public final int start;
            public final String tag;

            public /* synthetic */ MutableRange(Object obj, int i, int i2, int i3) {
                this(obj, i, (i3 & 4) != 0 ? PKIFailureInfo.systemUnavail : i2, (i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public final int hashCode() {
                Object obj = this.item;
                return this.tag.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.end, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.start, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
            }

            public final Range toRange(int i) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range(this.item, this.start, i, this.tag);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.item);
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                sb.append(", tag=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.tag, ')');
            }

            public MutableRange(Object obj, int i, int i2, String str) {
                this.item = obj;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }
        }

        public /* synthetic */ Builder() {
            this(16);
        }

        public Builder(String str) {
            this();
            append(str);
        }

        public Builder(AnnotatedString annotatedString) {
            this();
            append(annotatedString);
        }

        public final void pop() {
            ArrayList arrayList = this.styleStack;
            if (arrayList.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            ((MutableRange) arrayList.remove(arrayList.size() - 1)).end = this.text.length();
        }

        public final void append(String str) {
            this.text.append(str);
        }

        @Override // java.lang.Appendable
        public final void append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
            } else {
                this.text.append(charSequence);
            }
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i, i2);
                return this;
            }
            this.text.append(charSequence, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.text.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final void append(char c) {
            this.text.append(c);
        }

        public final void append(AnnotatedString annotatedString) {
            StringBuilder sb = this.text;
            int length = sb.length();
            sb.append(annotatedString.text);
            List list = annotatedString.annotations;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) list.get(i);
                    this.annotations.add(new MutableRange(range.item, range.start + length, range.end + length, range.tag));
                }
            }
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            append(charSequence);
            return this;
        }
    }

    public final class Range {
        public final int end;
        public final Object item;
        public final int start;
        public final String tag;

        public Range(Object obj, int i, int i2, String str) {
            this.item = obj;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        public static Range copy$default(Range range, ParagraphStyle paragraphStyle, int i, int i2, int i3) {
            Object obj = paragraphStyle;
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            return new Range(obj, i, i2, range.tag);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public final int hashCode() {
            Object obj = this.item;
            return this.tag.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.end, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.start, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.item);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", tag=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.tag, ')');
        }

        public Range(Object obj, int i, int i2) {
            this(obj, i, i2, "");
        }
    }

    public final List getStringAnnotations(int i) {
        List list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) list.get(i2);
                if ((range.item instanceof StringAnnotation) && AnnotatedStringKt.intersect(0, i, range.start, range.end)) {
                    arrayList.add(TextPainterKt.unbox(range));
                }
            }
            return arrayList;
        }
        return EmptyList.INSTANCE;
    }

    public AnnotatedString(String str) {
        this(str, EmptyList.INSTANCE);
    }

    public AnnotatedString(String str, ArrayList arrayList) {
        this(str, arrayList, EmptyList.INSTANCE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotatedString(String str, List list, List list2) {
        this(list, str);
        AnnotatedString annotatedString = AnnotatedStringKt.EmptyAnnotatedString;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add((Range) list.get(i));
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add((Range) list2.get(i2));
                }
                list = arrayList;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotatedString(String str, List list) {
        this(r3.isEmpty() ? null : r3, str);
        List list2 = list;
    }
}
