package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class p2c extends ezc implements Function1 {
    public static final p2c a = new p2c(1, StringsKt.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return Boolean.valueOf(str.length() > 0);
    }
}
