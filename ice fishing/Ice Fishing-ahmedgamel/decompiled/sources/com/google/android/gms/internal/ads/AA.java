package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class AA {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f24420a;

    /* renamed from: b, reason: collision with root package name */
    public String f24421b;

    /* renamed from: c, reason: collision with root package name */
    public int f24422c;

    /* renamed from: d, reason: collision with root package name */
    public float f24423d;

    /* renamed from: e, reason: collision with root package name */
    public int f24424e;

    /* renamed from: f, reason: collision with root package name */
    public String f24425f;

    /* renamed from: g, reason: collision with root package name */
    public byte f24426g;

    public final BA a() {
        IBinder iBinder;
        if (this.f24426g == 63 && (iBinder = this.f24420a) != null) {
            return new BA(iBinder, this.f24421b, this.f24422c, this.f24423d, this.f24424e, this.f24425f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24420a == null) {
            sb.append(" windowToken");
        }
        if ((this.f24426g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f24426g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f24426g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f24426g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f24426g & 16) == 0) {
            sb.append(" theme");
        }
        if ((this.f24426g & 32) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
