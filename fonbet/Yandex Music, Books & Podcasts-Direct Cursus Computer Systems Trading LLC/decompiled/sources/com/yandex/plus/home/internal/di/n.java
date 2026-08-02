package com.yandex.plus.home.internal.di;

import defpackage.ezc;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.home.network.hosts.a b;

    public /* synthetic */ n(com.yandex.plus.home.network.hosts.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof n) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof n) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof n) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new ezc(0, 0, com.yandex.plus.home.network.hosts.a.class, this.b, "getGraphqlGatewayWeblink", "getGraphqlGatewayWeblink()Landroid/net/Uri;");
            case 1:
                return new ezc(0, 0, com.yandex.plus.home.network.hosts.a.class, this.b, "getRestGatewayWeblink", "getRestGatewayWeblink()Landroid/net/Uri;");
            default:
                return new ezc(0, 0, com.yandex.plus.home.network.hosts.a.class, this.b, "getHomeWebViewWeblink", "getHomeWebViewWeblink()Landroid/net/Uri;");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
