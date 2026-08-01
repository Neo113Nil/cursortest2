package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1312Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1312Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1312Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1312Vm A00(AdErrorType adErrorType) {
        return new C1312Vm(adErrorType, (String) null);
    }

    public static C1312Vm A01(AdErrorType adErrorType, String str) {
        return new C1312Vm(adErrorType, str);
    }

    public static C1312Vm A02(C1313Vn c1313Vn) {
        return new C1312Vm(c1313Vn.A00(), c1313Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
