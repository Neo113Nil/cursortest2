package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r7o;
import defpackage.t7o;
import defpackage.v7o;
import defpackage.veb;
import defpackage.z7o;
import defpackage.zt3;
import kotlin.Unit;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.q8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1193q8 implements v7o {
    public final /* synthetic */ C1109k8 a;
    public final /* synthetic */ zt3 b;

    public C1193q8(C1109k8 c1109k8, zt3 zt3Var) {
        this.a = c1109k8;
        this.b = zt3Var;
    }

    public final void a(boolean z) {
        Timber.INSTANCE.tag(this.a.a()).d("Got install result: " + z, new Object[0]);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            if (z) {
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(Unit.a);
            } else {
                r7o r7oVar2 = z7o.b;
                zt3Var.resumeWith(new t7o(new X4("Result was false", null, 2, null)));
            }
        }
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        Timber.INSTANCE.tag(this.a.g).i("Install error: %s", vebVar);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(new X4(vebVar != null ? C1109k8.a(vebVar) : null, null, 2, null)));
        }
    }

    @Override // defpackage.v7o
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        a(((Boolean) obj).booleanValue());
    }
}
