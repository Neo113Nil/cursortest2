package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public static final List a(String str) {
        List listSingletonList = Collections.singletonList(str);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
