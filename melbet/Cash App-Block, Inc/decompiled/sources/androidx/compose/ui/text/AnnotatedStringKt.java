package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public abstract class AnnotatedStringKt {
    public static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("");

    public static AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle) {
        return new AnnotatedString(str, CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(spanStyle, 0, str.length())), EmptyList.INSTANCE);
    }

    public static final List getLocalAnnotations(AnnotatedString annotatedString, int i, int i2, SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2) {
        List list;
        if (i == i2 || (list = annotatedString.annotations) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= annotatedString.text.length()) {
            if (saversKt$$ExternalSyntheticLambda2 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) saversKt$$ExternalSyntheticLambda2.invoke(((AnnotatedString.Range) obj).item)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
            if (saversKt$$ExternalSyntheticLambda2 != null ? ((Boolean) saversKt$$ExternalSyntheticLambda2.invoke(range.item)).booleanValue() : true) {
                int i4 = range.start;
                int i5 = range.end;
                if (intersect(i, i2, i4, i5)) {
                    arrayList2.add(new AnnotatedString.Range((AnnotatedString.Annotation) range.item, RangesKt___RangesKt.coerceIn(range.start, i, i2) - i, RangesKt___RangesKt.coerceIn(i5, i, i2) - i, range.tag));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
