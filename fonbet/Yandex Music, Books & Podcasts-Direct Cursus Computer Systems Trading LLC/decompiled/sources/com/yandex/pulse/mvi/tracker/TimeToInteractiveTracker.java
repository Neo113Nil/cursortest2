package com.yandex.pulse.mvi.tracker;

import androidx.annotation.Keep;
import defpackage.bai;
import defpackage.h5n;
import defpackage.l30;
import defpackage.nkk;
import defpackage.pwg;
import defpackage.x3o;
import defpackage.yav;

/* loaded from: classes5.dex */
public class TimeToInteractiveTracker {
    public final bai a;
    public final pwg b;
    public final long c;
    public final long d;
    public final boolean e;
    public nkk f;
    public nkk g;
    public final h5n h = new h5n(26, this);
    public final l30 i;
    public long j;
    public long k;

    @Keep
    private final yav mHandlerCallback;

    public TimeToInteractiveTracker(bai baiVar, pwg pwgVar, long j, long j2, boolean z) {
        x3o x3oVar = new x3o(1, this);
        this.mHandlerCallback = x3oVar;
        this.i = new l30(x3oVar);
        this.j = -1L;
        this.a = baiVar;
        this.b = pwgVar;
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    public final void a() {
        this.b.a(null);
        this.i.removeMessages(0);
        this.f = null;
        this.g = null;
        this.j = -1L;
        this.k = 0L;
    }
}
