package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class c42 extends ezc implements Function1 {
    public static final c42 a = new c42(1, rsr.class, "inTransaction", "inTransaction()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rsr rsrVar = (rsr) obj;
        rsrVar.getClass();
        return Boolean.valueOf(rsrVar.inTransaction());
    }
}
