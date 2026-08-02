package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.nw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3668nw implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33595a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f33596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33597c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33598d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C3668nw(byte[] bArr, int i, int i4, String str) {
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
            if (i4 == 23) {
                if (bArr.length == 4) {
                    i4 = 23;
                    AbstractC2792Sd.i(r4);
                } else {
                    i4 = 23;
                }
            }
            r4 = false;
            AbstractC2792Sd.i(r4);
        } else if (c9 == 1 || c9 == 2) {
            if (i4 == 78) {
                if (bArr.length == 8) {
                    i4 = 78;
                    AbstractC2792Sd.i(r4);
                } else {
                    i4 = 78;
                }
            }
            r4 = false;
            AbstractC2792Sd.i(r4);
        } else if (c9 == 3) {
            AbstractC2792Sd.i(i4 == 0);
        } else if (c9 == 4) {
            if (i4 == 75) {
                if (bArr.length == 1 && ((b9 = bArr[0]) == 0 || b9 == 1)) {
                    i4 = 75;
                    AbstractC2792Sd.i(r4);
                } else {
                    i4 = 75;
                }
            }
            r4 = false;
            AbstractC2792Sd.i(r4);
        }
        this.f33595a = str;
        this.f33596b = bArr;
        this.f33597c = i;
        this.f33598d = i4;
    }

    public final ArrayList b() {
        AbstractC2792Sd.I("Metadata is not an auxiliary tracks map", this.f33595a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f33596b;
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
        if (obj != null && C3668nw.class == obj.getClass()) {
            C3668nw c3668nw = (C3668nw) obj;
            if (this.f33595a.equals(c3668nw.f33595a) && Arrays.equals(this.f33596b, c3668nw.f33596b) && this.f33597c == c3668nw.f33597c && this.f33598d == c3668nw.f33598d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f33596b) + ((this.f33595a.hashCode() + 527) * 31)) * 31) + this.f33597c) * 31) + this.f33598d;
    }

    public final String toString() {
        String sb;
        String str = this.f33595a;
        byte[] bArr = this.f33596b;
        int i = this.f33598d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList b9 = b();
                StringBuilder b10 = AbstractC5050e.b("track types = ");
                AbstractC2991bG.z(b10, b9.iterator(), ",");
                sb = b10.toString();
            }
            String str2 = AbstractC3182eu.f30782a;
            sb = EC.f25318f.f().g(bArr.length, bArr);
        } else if (i == 1) {
            String str3 = AbstractC3182eu.f30782a;
            sb = new String(bArr, StandardCharsets.UTF_8);
        } else if (i == 23) {
            int length = bArr.length;
            if (length < 4) {
                throw new IllegalArgumentException(AbstractC2659Kg.x("array too small: %s < %s", Integer.valueOf(length), 4));
            }
            sb = String.valueOf(Float.intBitsToFloat(UC.m(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            int length2 = bArr.length;
            if (length2 < 4) {
                throw new IllegalArgumentException(AbstractC2659Kg.x("array too small: %s < %s", Integer.valueOf(length2), 4));
            }
            sb = String.valueOf(UC.m(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new Cr(bArr).j());
            }
            String str22 = AbstractC3182eu.f30782a;
            sb = EC.f25318f.f().g(bArr.length, bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(sb).length()), "mdta: key=", str, ", value=", sb);
    }
}
