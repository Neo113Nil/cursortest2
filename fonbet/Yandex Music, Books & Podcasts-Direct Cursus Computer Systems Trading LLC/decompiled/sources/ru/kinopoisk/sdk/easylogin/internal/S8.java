package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.a0g;
import defpackage.b6e;
import defpackage.d43;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.vci;
import defpackage.xmn;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* loaded from: classes5.dex */
public final class S8 {
    public static final void a(vci vciVar, @NotNull T8 t8, long j, hq5 hq5Var, int i, int i2) {
        int i3;
        float f;
        int i4;
        t8.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1468913363);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(vciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(t8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.e(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                vciVar = vci.a;
            }
            int ordinal = t8.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i4 = 20;
                } else if (ordinal == 2) {
                    i4 = 24;
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return;
                    }
                    f = 32;
                }
                f = i4;
            } else {
                f = 16;
            }
            K0.a(a0g.E(R.drawable.ic_spinner, 0, oq5Var), androidx.compose.foundation.layout.d.i(vciVar, f), 0.0f, null, null, new d43(j, 5), oq5Var, 0);
        }
        vci vciVar2 = vciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new R8(vciVar2, t8, j, i, i2);
        }
    }
}
