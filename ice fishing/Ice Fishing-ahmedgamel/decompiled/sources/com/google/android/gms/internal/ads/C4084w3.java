package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4084w3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34788a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34789b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34790c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34792e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34793f;

    public /* synthetic */ C4084w3(int i, int i6, int i9, int i10, int i11, int i12) {
        this.f34788a = i;
        this.f34789b = i6;
        this.f34790c = i9;
        this.f34791d = i10;
        this.f34792e = i11;
        this.f34793f = i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4084w3 a(String str) {
        char c9;
        AbstractC2772Sd.i(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i6 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i9 == -1 || i10 == -1 || i12 == -1) {
                    return null;
                }
                return new C4084w3(i6, i9, i10, i11, i12, length);
            }
            String f3 = AbstractC3043cl.f(split[i].trim());
            switch (f3.hashCode()) {
                case 100571:
                    if (f3.equals("end")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3556653:
                    if (f3.equals(com.anythink.basead.exoplayer.k.o.f8446c)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 102749521:
                    if (f3.equals("layer")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 109757538:
                    if (f3.equals(com.anythink.expressad.foundation.d.d.cg)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 109780401:
                    if (f3.equals(com.anythink.expressad.foundation.h.k.f19634e)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 == 0) {
                i6 = i;
            } else if (c9 == 1) {
                i9 = i;
            } else if (c9 == 2) {
                i10 = i;
            } else if (c9 == 3) {
                i11 = i;
            } else if (c9 == 4) {
                i12 = i;
            }
            i++;
        }
    }
}
