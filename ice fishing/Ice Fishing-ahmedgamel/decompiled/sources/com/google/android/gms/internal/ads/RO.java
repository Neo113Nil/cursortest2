package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import b0.C0515a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class RO {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27955a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27956b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27957c;

    /* renamed from: d, reason: collision with root package name */
    public int f27958d;

    /* renamed from: e, reason: collision with root package name */
    public int f27959e;

    /* renamed from: f, reason: collision with root package name */
    public int f27960f;

    public /* synthetic */ RO(RO ro) {
        this.f27955a = (DP) ro.f27955a;
        this.f27956b = (C2764Qj) ro.f27956b;
        this.f27957c = (AudioDeviceInfo) ro.f27957c;
        this.f27958d = ro.f27958d;
        this.f27959e = ro.f27959e;
        this.f27960f = ro.f27960f;
    }

    public void a() {
        this.f27958d = 1;
        this.f27956b = (androidx.emoji2.text.r) this.f27955a;
        this.f27960f = 0;
    }

    public boolean b() {
        C0515a b9 = ((androidx.emoji2.text.r) this.f27956b).f4765b.b();
        int a9 = b9.a(6);
        return !(a9 == 0 || ((ByteBuffer) b9.f2133w).get(a9 + b9.f2130n) == 0) || this.f27959e == 65039;
    }

    public RO(DP dp) {
        this.f27955a = dp;
        this.f27956b = C2764Qj.f27843b;
        this.f27958d = 0;
        this.f27959e = -1;
        this.f27960f = -1;
    }

    public RO(androidx.emoji2.text.r rVar) {
        this.f27958d = 1;
        this.f27955a = rVar;
        this.f27956b = rVar;
    }
}
