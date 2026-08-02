package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r7o;
import defpackage.t7o;
import defpackage.v7o;
import defpackage.veb;
import defpackage.vjp;
import defpackage.z7o;
import defpackage.zt3;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.p8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1179p8 implements v7o {
    public final /* synthetic */ zt3 a;

    public C1179p8(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        vebVar.getClass();
        if (this.a.w()) {
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(new Exception(vebVar.a + ": " + vebVar.c)));
        }
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        vjp vjpVar = (vjp) obj;
        vjpVar.getClass();
        if (this.a.w()) {
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(vjpVar);
        }
    }
}
