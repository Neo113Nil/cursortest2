package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y0 implements XA {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Y0 f28627u = new Y0(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Y0 f28628v = new Y0(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Y0 f28629w = new Y0(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Y0 f28630x = new Y0(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ Y0 f28631y = new Y0(4);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28632n;

    public /* synthetic */ Y0(int i) {
        this.f28632n = i;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final /* synthetic */ boolean a(Object obj) {
        switch (this.f28632n) {
            case 0:
                C3061d2 c3061d2 = (C3061d2) obj;
                if (c3061d2.f29662b.equals("com.apple.iTunes") && c3061d2.f29663c.equals("iTunSMPB")) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                int i = U2.f27849G;
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
