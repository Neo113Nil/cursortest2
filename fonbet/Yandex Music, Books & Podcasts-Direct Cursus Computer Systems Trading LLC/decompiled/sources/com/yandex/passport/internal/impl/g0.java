package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.api.x0;
import com.yandex.passport.api.y0;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import defpackage.cxb;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class g0 implements com.yandex.passport.api.i {
    public final y a;

    public g0(y yVar) {
        yVar.getClass();
        this.a = yVar;
    }

    @Override // com.yandex.passport.api.i
    public final Intent a(Context context, com.yandex.passport.internal.properties.c cVar) {
        context.getClass();
        cVar.getClass();
        return this.a.a(context, cVar);
    }

    @Override // com.yandex.passport.api.i
    public final Intent b(Context context, com.yandex.passport.internal.properties.h hVar) {
        context.getClass();
        hVar.getClass();
        return this.a.b(context, hVar);
    }

    @Override // com.yandex.passport.api.i
    public final Intent c(Context context, com.yandex.passport.internal.properties.j0 j0Var) {
        context.getClass();
        j0Var.getClass();
        return this.a.c(context, j0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent d(Context context, x0 x0Var) {
        context.getClass();
        x0Var.getClass();
        return this.a.d(context, x0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent e(Context context, y0 y0Var) {
        context.getClass();
        y0Var.getClass();
        return this.a.e(context, y0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent f(Context context) {
        context.getClass();
        throw null;
    }

    @Override // com.yandex.passport.api.i
    public final Intent g(Context context, z1 z1Var) {
        context.getClass();
        z1Var.getClass();
        return this.a.g(context, z1Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent h(Context context) {
        context.getClass();
        throw null;
    }

    @Override // com.yandex.passport.api.i
    public final Intent i(Context context, com.yandex.passport.internal.properties.e0 e0Var) {
        context.getClass();
        e0Var.getClass();
        return this.a.i(context, e0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent j(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        return this.a.j(context, uri);
    }

    @Override // com.yandex.passport.api.i
    public final Intent k(Context context, com.yandex.passport.internal.properties.b bVar) {
        context.getClass();
        bVar.getClass();
        return this.a.k(context, bVar);
    }

    @Override // com.yandex.passport.api.i
    public final Intent l(Context context, com.yandex.passport.api.g0 g0Var) {
        context.getClass();
        g0Var.getClass();
        return this.a.l(context, g0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent m(Context context, com.yandex.passport.internal.properties.h0 h0Var) {
        context.getClass();
        h0Var.getClass();
        return this.a.m(context, h0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent n(Context context, com.yandex.passport.internal.properties.d0 d0Var) {
        context.getClass();
        d0Var.getClass();
        return this.a.n(context, d0Var);
    }

    @Override // com.yandex.passport.api.i
    public final Intent o(Context context, z1 z1Var, com.yandex.passport.internal.properties.g gVar) {
        context.getClass();
        z1Var.getClass();
        gVar.getClass();
        return this.a.o(context, z1Var, gVar);
    }

    public final Intent p(Context context, com.yandex.passport.internal.properties.g gVar, com.yandex.passport.internal.entities.w wVar, boolean z) {
        context.getClass();
        gVar.getClass();
        wVar.getClass();
        y yVar = this.a;
        yVar.a.q();
        try {
            Intent intent = new Intent(context, (Class<?>) AutoLoginRetryActivity.class);
            intent.putExtras(cxb.K(new Pair("passport-auto-login-properties", com.yandex.plus.core.locale.b.y(gVar))));
            com.yandex.passport.api.impl.b bVar = wVar.a;
            bVar.getClass();
            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(bVar);
            b.getClass();
            intent.putExtra("credentials", new com.yandex.passport.internal.entities.w(b, wVar.b, wVar.c, wVar.d));
            intent.putExtra("is_error_temporary", z);
            return intent;
        } catch (RuntimeException e) {
            yVar.a.r(e);
            throw e;
        }
    }
}
