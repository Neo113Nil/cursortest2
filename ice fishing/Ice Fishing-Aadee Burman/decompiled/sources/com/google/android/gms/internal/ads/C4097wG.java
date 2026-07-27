package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.wG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4097wG implements InterfaceC4259zG {

    /* renamed from: a, reason: collision with root package name */
    public final String f34818a;

    /* renamed from: b, reason: collision with root package name */
    public final C3240gK f34819b;

    /* renamed from: c, reason: collision with root package name */
    public final JK f34820c;

    /* renamed from: d, reason: collision with root package name */
    public final C3879sE f34821d;

    /* renamed from: e, reason: collision with root package name */
    public final C3933tE f34822e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f34823f;

    public C4097wG(String str, C3240gK c3240gK, JK jk, C3879sE c3879sE, C3933tE c3933tE, Integer num) {
        this.f34818a = str;
        this.f34819b = c3240gK;
        this.f34820c = jk;
        this.f34821d = c3879sE;
        this.f34822e = c3933tE;
        this.f34823f = num;
    }

    public static C4097wG a(String str, JK jk, C3879sE c3879sE, C3933tE c3933tE, Integer num) {
        if (c3933tE.equals(C3933tE.f34232f)) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C4097wG(str, DG.b(str), jk, c3879sE, c3933tE, num);
    }
}
