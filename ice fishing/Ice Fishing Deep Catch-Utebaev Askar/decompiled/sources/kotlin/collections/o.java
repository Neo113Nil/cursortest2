package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class o extends n {
    public static final List b(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length <= 0) {
            return x.f177a;
        }
        Intrinsics.checkNotNullParameter(elements, "<this>");
        List listAsList = Arrays.asList(elements);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(this)");
        return listAsList;
    }
}
