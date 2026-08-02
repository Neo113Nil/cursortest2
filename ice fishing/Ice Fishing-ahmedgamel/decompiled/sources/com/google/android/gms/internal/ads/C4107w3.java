package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4107w3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35558b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35560d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35561e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35562f;

    public /* synthetic */ C4107w3(int i, int i4, int i6, int i9, int i10, int i11) {
        this.f35557a = i;
        this.f35558b = i4;
        this.f35559c = i6;
        this.f35560d = i9;
        this.f35561e = i10;
        this.f35562f = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4107w3 a(String str) {
        char c9;
        AbstractC2792Sd.i(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i4 = -1;
        int i6 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i6 == -1 || i9 == -1 || i11 == -1) {
                    return null;
                }
                return new C4107w3(i4, i6, i9, i10, i11, length);
            }
            String f2 = AbstractC3066cl.f(split[i].trim());
            switch (f2.hashCode()) {
                case 100571:
                    if (f2.equals("end")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3556653:
                    if (f2.equals(com.anythink.basead.exoplayer.k.o.f9232c)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 102749521:
                    if (f2.equals("layer")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 109757538:
                    if (f2.equals(com.anythink.expressad.foundation.d.d.cg)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 109780401:
                    if (f2.equals(com.anythink.expressad.foundation.h.k.f20421e)) {
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
                i4 = i;
            } else if (c9 == 1) {
                i6 = i;
            } else if (c9 == 2) {
                i9 = i;
            } else if (c9 == 3) {
                i10 = i;
            } else if (c9 == 4) {
                i11 = i;
            }
            i++;
        }
    }
}
