package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.ww, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4143ww implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35092a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f35093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35094c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35095d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C4143ww(byte[] bArr, int i, int i4, String str) {
        char c4;
        byte b9;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 == 0) {
            if (i4 == 23) {
                if (bArr.length == 4) {
                    i4 = 23;
                    PA.n(r4);
                } else {
                    i4 = 23;
                }
            }
            r4 = false;
            PA.n(r4);
        } else if (c4 == 1 || c4 == 2) {
            if (i4 == 78) {
                if (bArr.length == 8) {
                    i4 = 78;
                    PA.n(r4);
                } else {
                    i4 = 78;
                }
            }
            r4 = false;
            PA.n(r4);
        } else if (c4 == 3) {
            PA.n(i4 == 0);
        } else if (c4 == 4) {
            if (i4 == 75) {
                if (bArr.length == 1 && ((b9 = bArr[0]) == 0 || b9 == 1)) {
                    i4 = 75;
                    PA.n(r4);
                } else {
                    i4 = 75;
                }
            }
            r4 = false;
            PA.n(r4);
        }
        this.f35092a = str;
        this.f35093b = bArr;
        this.f35094c = i;
        this.f35095d = i4;
    }

    public final ArrayList b() {
        PA.U("Metadata is not an auxiliary tracks map", this.f35092a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f35093b;
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
        if (obj != null && C4143ww.class == obj.getClass()) {
            C4143ww c4143ww = (C4143ww) obj;
            if (this.f35092a.equals(c4143ww.f35092a) && Arrays.equals(this.f35093b, c4143ww.f35093b) && this.f35094c == c4143ww.f35094c && this.f35095d == c4143ww.f35095d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f35093b) + ((this.f35092a.hashCode() + 527) * 31)) * 31) + this.f35094c) * 31) + this.f35095d;
    }

    public final String toString() {
        String sb;
        String str = this.f35092a;
        byte[] bArr = this.f35093b;
        int i = this.f35095d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList b9 = b();
                StringBuilder b10 = AbstractC5088e.b("track types = ");
                AbstractC2655Lg.t(b10, b9.iterator(), ",");
                sb = b10.toString();
            }
            String str2 = AbstractC3548lu.f32613a;
            sb = HC.f25322f.f().g(bArr.length, bArr);
        } else if (i == 1) {
            String str3 = AbstractC3548lu.f32613a;
            sb = new String(bArr, StandardCharsets.UTF_8);
        } else if (i == 23) {
            int length = bArr.length;
            if (length < 4) {
                throw new IllegalArgumentException(AbstractC3194fG.u("array too small: %s < %s", Integer.valueOf(length), 4));
            }
            sb = String.valueOf(Float.intBitsToFloat(AbstractC3194fG.w(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            int length2 = bArr.length;
            if (length2 < 4) {
                throw new IllegalArgumentException(AbstractC3194fG.u("array too small: %s < %s", Integer.valueOf(length2), 4));
            }
            sb = String.valueOf(AbstractC3194fG.w(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new Lr(bArr).j());
            }
            String str22 = AbstractC3548lu.f32613a;
            sb = HC.f25322f.f().g(bArr.length, bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(sb).length()), "mdta: key=", str, ", value=", sb);
    }
}
