package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.agr;
import defpackage.etn;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.ozm;
import defpackage.sn5;
import defpackage.uif;
import defpackage.xmn;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.ec, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1029ec {

    @NotNull
    public static final ozm a = new agr(a.a);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.ec$a */
    public static final class a extends uif implements Function0<N4> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return N4.Old;
        }
    }

    public static final void a(N4 n4, @NotNull sn5 sn5Var, hq5 hq5Var, int i) {
        int i2;
        sn5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1789859455);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(n4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(sn5Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            etn.l(a.a(n4), sn5Var, oq5Var, (i2 & 112) | 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1043fc(n4, sn5Var, i);
        }
    }
}
