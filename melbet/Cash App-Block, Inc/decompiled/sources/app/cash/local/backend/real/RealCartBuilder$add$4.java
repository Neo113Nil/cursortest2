package app.cash.local.backend.real;

import app.cash.local.primitives.DiscountToken;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class RealCartBuilder$add$4 implements Function1 {
    public static final RealCartBuilder$add$4 INSTANCE = new RealCartBuilder$add$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = ((DiscountToken) obj).value;
        str.getClass();
        return str;
    }
}
