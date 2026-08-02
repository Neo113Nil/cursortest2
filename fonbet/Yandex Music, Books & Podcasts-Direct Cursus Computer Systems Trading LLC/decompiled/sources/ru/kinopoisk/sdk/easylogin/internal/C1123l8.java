package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.gw0;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v7o;
import defpackage.veb;
import defpackage.z7o;
import defpackage.zt3;
import kotlin.Unit;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC1066h7;
import ru.kinopoisk.sdk.easylogin.internal.C1109k8;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1123l8 implements v7o {
    public final /* synthetic */ zt3 a;
    public final /* synthetic */ C1109k8 b;
    public final /* synthetic */ gw0 c;

    public C1123l8(zt3 zt3Var, C1109k8 c1109k8, gw0 gw0Var) {
        this.a = zt3Var;
        this.b = c1109k8;
        this.c = gw0Var;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        C1109k8.a aVar;
        Throwable bVar;
        vebVar.getClass();
        if (this.a.w()) {
            aVar = C1109k8.p;
            if (C1109k8.a.a(aVar, vebVar)) {
                bVar = new AbstractC1066h7.a();
            } else {
                bVar = new AbstractC1066h7.b(null, new Exception(vebVar.a + ": " + vebVar.c), 1, null);
            }
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(bVar));
        }
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        if (this.a.w()) {
            Timber.INSTANCE.tag(this.b.g).d("connectToAppIfNeeded connect onSuccess isConnected = %s", Boolean.valueOf(this.c.l()));
            this.b.l.set(true);
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Unit.a);
        }
    }
}
