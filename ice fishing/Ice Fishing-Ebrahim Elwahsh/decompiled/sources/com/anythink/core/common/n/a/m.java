package com.anythink.core.common.n.a;

import java.net.InetAddress;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress[] f15014a;

    /* renamed from: b, reason: collision with root package name */
    private final i f15015b;

    public m(InetAddress[] inetAddressArr, i iVar) {
        this.f15014a = inetAddressArr;
        this.f15015b = iVar;
    }

    private i c() {
        return this.f15015b;
    }

    public final InetAddress[] a() {
        return this.f15014a;
    }

    public final f b() {
        i iVar = this.f15015b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }
}
