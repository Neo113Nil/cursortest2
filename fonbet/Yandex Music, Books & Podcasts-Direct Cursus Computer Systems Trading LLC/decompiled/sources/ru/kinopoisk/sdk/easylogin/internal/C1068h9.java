package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.u1g;
import defpackage.vci;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1068h9 implements InterfaceC1054g9 {

    @NotNull
    public final EnumC1087j0 a;

    @NotNull
    public final EnumC1073i0 b;

    public C1068h9(@NotNull EnumC1087j0 enumC1087j0, @NotNull EnumC1073i0 enumC1073i0) {
        enumC1087j0.getClass();
        enumC1073i0.getClass();
        this.a = enumC1087j0;
        this.b = enumC1073i0;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1054g9
    public final void a(@NotNull String str, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-2111962000);
        int ordinal = this.b.ordinal();
        vci vciVar = vci.a;
        if (ordinal == 0) {
            oq5Var.a0(1232538112);
            C1101k0.a(this.a, oq5Var, 0);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar, C1101k0.a(this.a)));
            C1115l0.a(str, this.a, oq5Var, i & 14);
            vz1.B(vciVar, 4, oq5Var, false);
        } else if (ordinal != 1) {
            oq5Var.a0(1233155043);
            oq5Var.p(false);
        } else {
            oq5Var.a0(1232865472);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar, 4));
            C1115l0.a(str, this.a, oq5Var, i & 14);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar, C1101k0.a(this.a)));
            C1101k0.a(this.a, oq5Var, 0);
            oq5Var.p(false);
        }
        oq5Var.p(false);
    }
}
