package defpackage;

import kotlin.Pair;

/* loaded from: classes2.dex */
public final class vsv extends zij {
    public static final vsv a = new vsv();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return ((Pair) obj).equals((Pair) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return jl40.l(((Pair) obj).c(), ((Pair) obj2).c());
    }
}
