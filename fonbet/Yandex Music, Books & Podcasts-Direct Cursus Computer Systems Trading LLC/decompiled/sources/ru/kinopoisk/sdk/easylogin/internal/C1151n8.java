package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ic4;
import defpackage.r7o;
import defpackage.un4;
import defpackage.z7o;
import defpackage.zt3;
import kotlin.Unit;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.n8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1151n8 implements ic4 {
    public final /* synthetic */ C1109k8 a;
    public final /* synthetic */ zt3 b;

    public C1151n8(C1109k8 c1109k8, zt3 zt3Var) {
        this.a = c1109k8;
        this.b = zt3Var;
    }

    @Override // defpackage.ic4
    public final void onClientConnect(un4 un4Var) {
        Timber.INSTANCE.tag(this.a.g).d("OnClientConnectListener onClientConnect", new Object[0]);
        this.a.l.set(false);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Unit.a);
        }
    }
}
