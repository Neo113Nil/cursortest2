package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.mw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3591mw implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32627a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f32628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32630d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C3591mw(byte[] bArr, int i, int i6, String str) {
        char c9;
        byte b9;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
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
            if (i6 == 23) {
                if (bArr.length == 4) {
                    i6 = 23;
                    AbstractC2772Sd.i(r4);
                } else {
                    i6 = 23;
                }
            }
            r4 = false;
            AbstractC2772Sd.i(r4);
        } else if (c9 == 1 || c9 == 2) {
            if (i6 == 78) {
                if (bArr.length == 8) {
                    i6 = 78;
                    AbstractC2772Sd.i(r4);
                } else {
                    i6 = 78;
                }
            }
            r4 = false;
            AbstractC2772Sd.i(r4);
        } else if (c9 == 3) {
            AbstractC2772Sd.i(i6 == 0);
        } else if (c9 == 4) {
            if (i6 == 75) {
                if (bArr.length == 1 && ((b9 = bArr[0]) == 0 || b9 == 1)) {
                    i6 = 75;
                    AbstractC2772Sd.i(r4);
                } else {
                    i6 = 75;
                }
            }
            r4 = false;
            AbstractC2772Sd.i(r4);
        }
        this.f32627a = str;
        this.f32628b = bArr;
        this.f32629c = i;
        this.f32630d = i6;
    }

    public final ArrayList b() {
        AbstractC2772Sd.I("Metadata is not an auxiliary tracks map", this.f32627a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f32628b;
        byte b9 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b9; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3591mw.class == obj.getClass()) {
            C3591mw c3591mw = (C3591mw) obj;
            if (this.f32627a.equals(c3591mw.f32627a) && Arrays.equals(this.f32628b, c3591mw.f32628b) && this.f32629c == c3591mw.f32629c && this.f32630d == c3591mw.f32630d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f32628b) + ((this.f32627a.hashCode() + 527) * 31)) * 31) + this.f32629c) * 31) + this.f32630d;
    }

    public final String toString() {
        String sb;
        String str = this.f32627a;
        byte[] bArr = this.f32628b;
        int i = this.f32630d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList b9 = b();
                StringBuilder b10 = AbstractC5049e.b("track types = ");
                AbstractC2968bG.z(b10, b9.iterator(), ",");
                sb = b10.toString();
            }
            String str2 = AbstractC3159eu.f29993a;
            sb = EC.f24557f.f().g(bArr.length, bArr);
        } else if (i == 1) {
            String str3 = AbstractC3159eu.f29993a;
            sb = new String(bArr, StandardCharsets.UTF_8);
        } else if (i == 23) {
            int length = bArr.length;
            if (length < 4) {
                throw new IllegalArgumentException(AbstractC2639Kg.x("array too small: %s < %s", Integer.valueOf(length), 4));
            }
            sb = String.valueOf(Float.intBitsToFloat(UC.m(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            int length2 = bArr.length;
            if (length2 < 4) {
                throw new IllegalArgumentException(AbstractC2639Kg.x("array too small: %s < %s", Integer.valueOf(length2), 4));
            }
            sb = String.valueOf(UC.m(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new Cr(bArr).j());
            }
            String str22 = AbstractC3159eu.f29993a;
            sb = EC.f24557f.f().g(bArr.length, bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(sb).length()), "mdta: key=", str, ", value=", sb);
    }
}
