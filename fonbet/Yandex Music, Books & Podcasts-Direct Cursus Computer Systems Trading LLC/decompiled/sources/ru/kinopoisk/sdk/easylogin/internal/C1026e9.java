package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.u1g;
import defpackage.vci;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.e9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1026e9 implements InterfaceC1012d9 {

    @NotNull
    public final EnumC1087j0 a;

    public C1026e9(@NotNull EnumC1087j0 enumC1087j0) {
        enumC1087j0.getClass();
        this.a = enumC1087j0;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1012d9
    public final void a(@NotNull String str, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-59507230);
        C1101k0.a(this.a, oq5Var, 0);
        float a = C1101k0.a(this.a);
        vci vciVar = vci.a;
        u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar, a));
        C1115l0.a(str, this.a, oq5Var, i & 14);
        vz1.B(vciVar, 4, oq5Var, false);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1012d9
    public final void b(@NotNull String str, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1947724668);
        float f = 4;
        vci vciVar = vci.a;
        u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar, f));
        C1115l0.a(str, this.a, oq5Var, i & 14);
        vz1.B(vciVar, f, oq5Var, false);
    }
}
