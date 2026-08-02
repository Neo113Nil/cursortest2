package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.bfg;
import defpackage.hq5;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.ua5;
import defpackage.uif;
import defpackage.vci;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.H3;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0980b5 extends uif implements pyc {
    public final /* synthetic */ H3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nbt c;
    public final /* synthetic */ Function0<Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980b5(H3 h3, boolean z, nbt nbtVar, Function0 function0) {
        super(3);
        this.a = h3;
        this.b = z;
        this.c = nbtVar;
        this.d = function0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ua5) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        yci t = androidx.compose.foundation.layout.d.t(vci.a, 0.0f, 380, 1);
        if (this.a instanceof H3.a) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.a0(-46517596);
            if (this.b) {
                oq5Var2.a0(-46480644);
                oq5Var2.a0(1799616989);
                yci Q = bfg.Q(t, bfg.C(oq5Var2), false, 14);
                oq5Var2.p(false);
                S4.a(Q, this.c, oq5Var2, 0);
                oq5Var2.p(false);
            } else {
                oq5Var2.a0(-46116084);
                C1052g7.a(t, this.c, this.d, oq5Var2, 6);
                oq5Var2.p(false);
            }
            oq5Var2.p(false);
        } else {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.a0(-45883863);
            W4.a(this.a, this.c, t, oq5Var3, 3072);
            oq5Var3.p(false);
        }
        return Unit.a;
    }
}
