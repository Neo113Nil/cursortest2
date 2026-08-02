package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y0 implements XA {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Y0 f29404u = new Y0(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Y0 f29405v = new Y0(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Y0 f29406w = new Y0(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Y0 f29407x = new Y0(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ Y0 f29408y = new Y0(4);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29409n;

    public /* synthetic */ Y0(int i) {
        this.f29409n = i;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final /* synthetic */ boolean a(Object obj) {
        switch (this.f29409n) {
            case 0:
                C3084d2 c3084d2 = (C3084d2) obj;
                if (c3084d2.f30434b.equals("com.apple.iTunes") && c3084d2.f30435c.equals("iTunSMPB")) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                int i = U2.f28646G;
                break;
            case 3:
                if (((Map.Entry) obj).getKey() != null) {
                    break;
                }
                break;
            default:
                if (((String) obj) != null) {
                    break;
                }
                break;
        }
        return true;
    }
}
