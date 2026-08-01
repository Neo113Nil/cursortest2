package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import b0.C0511a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class RO {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27199a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27200b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27201c;

    /* renamed from: d, reason: collision with root package name */
    public int f27202d;

    /* renamed from: e, reason: collision with root package name */
    public int f27203e;

    /* renamed from: f, reason: collision with root package name */
    public int f27204f;

    public /* synthetic */ RO(RO ro) {
        this.f27199a = (DP) ro.f27199a;
        this.f27200b = (C2744Qj) ro.f27200b;
        this.f27201c = (AudioDeviceInfo) ro.f27201c;
        this.f27202d = ro.f27202d;
        this.f27203e = ro.f27203e;
        this.f27204f = ro.f27204f;
    }

    public void a() {
        this.f27202d = 1;
        this.f27200b = (androidx.emoji2.text.r) this.f27199a;
        this.f27204f = 0;
    }

    public boolean b() {
        C0511a b9 = ((androidx.emoji2.text.r) this.f27200b).f4797b.b();
        int a9 = b9.a(6);
        return !(a9 == 0 || ((ByteBuffer) b9.f2045w).get(a9 + b9.f2042n) == 0) || this.f27203e == 65039;
    }

    public RO(DP dp) {
        this.f27199a = dp;
        this.f27200b = C2744Qj.f27058b;
        this.f27202d = 0;
        this.f27203e = -1;
        this.f27204f = -1;
    }

    public RO(androidx.emoji2.text.r rVar) {
        this.f27202d = 1;
        this.f27199a = rVar;
        this.f27200b = rVar;
    }
}
