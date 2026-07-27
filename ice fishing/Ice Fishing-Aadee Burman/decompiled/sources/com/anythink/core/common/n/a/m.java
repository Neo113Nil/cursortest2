package com.anythink.core.common.n.a;

import java.net.InetAddress;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress[] f14857a;

    /* renamed from: b, reason: collision with root package name */
    private final i f14858b;

    public m(InetAddress[] inetAddressArr, i iVar) {
        this.f14857a = inetAddressArr;
        this.f14858b = iVar;
    }

    private i c() {
        return this.f14858b;
    }

    public final InetAddress[] a() {
        return this.f14857a;
    }

    public final f b() {
        i iVar = this.f14858b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }
}
