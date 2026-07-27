package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class i extends c {

    /* renamed from: j, reason: collision with root package name */
    public final long f7580j;

    public i(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9, long j10) {
        super(hVar, kVar, mVar, i, obj, j6, j9);
        com.anythink.basead.exoplayer.k.a.a(mVar);
        this.f7580j = j10;
    }

    public long e() {
        long j6 = this.f7580j;
        if (j6 != -1) {
            return j6 + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
