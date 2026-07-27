package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.iI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1934iI implements T5 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public Ad A09;
    public WeakReference<Ad> A0A;
    public final C1839gi A0B;
    public final U3 A0C;
    public final String A0D;

    public C1934iI(C1839gi c1839gi, String str, Ad ad, U3 u32) {
        this.A0B = c1839gi;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new WeakReference<>(ad);
        this.A0C = u32;
        c1839gi.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.T5
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final RewardedVideoAdListener A6o() {
        return this.A04;
    }

    public final C1839gi A01() {
        return this.A0B;
    }

    public final void A02(Ad ad) {
        if (ad == null && !C1289Up.A0u(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.instagram.common.viewpoint.core.T5
    public final Ad A6k() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
