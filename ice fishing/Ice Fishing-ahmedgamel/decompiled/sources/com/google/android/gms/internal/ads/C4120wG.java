package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.wG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4120wG implements InterfaceC4282zG {

    /* renamed from: a, reason: collision with root package name */
    public final String f35587a;

    /* renamed from: b, reason: collision with root package name */
    public final C3263gK f35588b;

    /* renamed from: c, reason: collision with root package name */
    public final JK f35589c;

    /* renamed from: d, reason: collision with root package name */
    public final C3902sE f35590d;

    /* renamed from: e, reason: collision with root package name */
    public final C3956tE f35591e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f35592f;

    public C4120wG(String str, C3263gK c3263gK, JK jk, C3902sE c3902sE, C3956tE c3956tE, Integer num) {
        this.f35587a = str;
        this.f35588b = c3263gK;
        this.f35589c = jk;
        this.f35590d = c3902sE;
        this.f35591e = c3956tE;
        this.f35592f = num;
    }

    public static C4120wG a(String str, JK jk, C3902sE c3902sE, C3956tE c3956tE, Integer num) {
        if (c3956tE.equals(C3956tE.f35018f)) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C4120wG(str, DG.b(str), jk, c3902sE, c3956tE, num);
    }
}
