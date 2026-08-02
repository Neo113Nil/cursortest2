package com.yandex.plus.home.internal.di;

import android.net.Uri;
import defpackage.ezc;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements com.yandex.plus.core.network.urls.c, zyc {
    public final /* synthetic */ com.yandex.plus.home.network.hosts.a a;

    public k(com.yandex.plus.home.network.hosts.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.yandex.plus.core.network.urls.c) && (obj instanceof zyc)) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(0, 0, com.yandex.plus.home.network.hosts.a.class, this.a, "getHomeAvatarsGatewayWeblink", "getHomeAvatarsGatewayWeblink()Landroid/net/Uri;");
    }

    @Override // com.yandex.plus.core.network.urls.c
    public final Uri getUrl() {
        return this.a.c();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
