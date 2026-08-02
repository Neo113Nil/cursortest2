package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r7o;
import defpackage.t7o;
import defpackage.v7o;
import defpackage.veb;
import defpackage.vz7;
import defpackage.z7o;
import defpackage.zt3;
import java.util.Arrays;
import java.util.Locale;
import ru.kinopoisk.sdk.easylogin.internal.O8;

/* loaded from: classes5.dex */
public final class P8 implements v7o {
    public final /* synthetic */ zt3 a;

    public P8(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        vebVar.getClass();
        if (this.a.w()) {
            O8.a aVar = new O8.a(String.format(Locale.getDefault(), "Failed to get device information: %s", Arrays.copyOf(new Object[]{vebVar}, 1)));
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(aVar));
        }
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        vz7 vz7Var = (vz7) obj;
        vz7Var.getClass();
        if (this.a.w()) {
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(vz7Var);
        }
    }
}
