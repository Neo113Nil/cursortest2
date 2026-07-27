package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class AA {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f23640a;

    /* renamed from: b, reason: collision with root package name */
    public String f23641b;

    /* renamed from: c, reason: collision with root package name */
    public int f23642c;

    /* renamed from: d, reason: collision with root package name */
    public float f23643d;

    /* renamed from: e, reason: collision with root package name */
    public int f23644e;

    /* renamed from: f, reason: collision with root package name */
    public String f23645f;

    /* renamed from: g, reason: collision with root package name */
    public byte f23646g;

    public final BA a() {
        IBinder iBinder;
        if (this.f23646g == 63 && (iBinder = this.f23640a) != null) {
            return new BA(iBinder, this.f23641b, this.f23642c, this.f23643d, this.f23644e, this.f23645f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23640a == null) {
            sb.append(" windowToken");
        }
        if ((this.f23646g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f23646g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f23646g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f23646g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f23646g & 16) == 0) {
            sb.append(" theme");
        }
        if ((this.f23646g & 32) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
