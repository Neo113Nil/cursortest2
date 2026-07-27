package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class BG implements EG {

    /* renamed from: a, reason: collision with root package name */
    public final String f24012a;

    /* renamed from: b, reason: collision with root package name */
    public final C3791qK f24013b;

    /* renamed from: c, reason: collision with root package name */
    public final SK f24014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24015d;

    /* renamed from: e, reason: collision with root package name */
    public final EI f24016e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f24017f;

    public BG(String str, C3791qK c3791qK, SK sk, int i, EI ei, Integer num) {
        this.f24012a = str;
        this.f24013b = c3791qK;
        this.f24014c = sk;
        this.f24015d = i;
        this.f24016e = ei;
        this.f24017f = num;
    }

    public static BG a(String str, SK sk, int i, EI ei, Integer num) {
        String str2;
        if (ei == EI.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        C3791qK b9 = IG.b(str);
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0 || d2 == 1 || d2 == 2 || d2 == 3 || d2 == 4) {
            int ordinal = ei.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                return new BG(str, b9, sk, i, ei, num);
            }
            throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(String.valueOf(ei)));
        }
        switch (i) {
            case 1:
                str2 = "UNKNOWN_KEYMATERIAL";
                break;
            case 2:
                str2 = "SYMMETRIC";
                break;
            case 3:
                str2 = "ASYMMETRIC_PRIVATE";
                break;
            case 4:
                str2 = "ASYMMETRIC_PUBLIC";
                break;
            case 5:
                str2 = "REMOTE";
                break;
            case 6:
                str2 = "UNRECOGNIZED";
                break;
            default:
                str2 = "null";
                break;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType ".concat(str2));
    }
}
