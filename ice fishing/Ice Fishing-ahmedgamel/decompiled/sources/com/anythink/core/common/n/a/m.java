package com.anythink.core.common.n.a;

import java.net.InetAddress;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress[] f15643a;

    /* renamed from: b, reason: collision with root package name */
    private final i f15644b;

    public m(InetAddress[] inetAddressArr, i iVar) {
        this.f15643a = inetAddressArr;
        this.f15644b = iVar;
    }

    private i c() {
        return this.f15644b;
    }

    public final InetAddress[] a() {
        return this.f15643a;
    }

    public final f b() {
        i iVar = this.f15644b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }
}
