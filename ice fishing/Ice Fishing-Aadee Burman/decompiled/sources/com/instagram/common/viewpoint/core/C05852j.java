package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05852j extends Q9<C1785fp> implements T4 {
    public C1840gi A00;
    public boolean A01;

    public C05852j(C1785fp c1785fp, C1840gi c1840gi) {
        super(c1785fp);
        this.A00 = c1840gi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3v(i);
        }
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07() {
        View view;
        WeakReference weakReference;
        boolean z3;
        int i;
        int i6;
        int i9;
        C1786fq c1786fq;
        boolean wasViewable;
        Map map;
        Map map2;
        boolean z6;
        boolean z9;
        boolean z10;
        AbstractRunnableC1327Wc abstractRunnableC1327Wc;
        Handler handler;
        AbstractRunnableC1327Wc abstractRunnableC1327Wc2;
        int i10;
        boolean z11;
        boolean z12;
        Map map3;
        C1786fq c1786fq2;
        C1785fp A08 = A08();
        int i11 = 0;
        if (A08 == null) {
            A00(0);
            return;
        }
        view = A08.A0C;
        weakReference = A08.A0E;
        AbstractC1784fo abstractC1784fo = (AbstractC1784fo) weakReference.get();
        int i12 = 1;
        boolean z13 = view == null;
        if (!z13 && abstractC1784fo != null) {
            i = A08.A0A;
            C1786fq A0E = C1785fp.A0E(view, i, this.A00);
            if (A0E.A04()) {
                C1785fp.A05(A08);
            } else {
                A08.A00 = 0;
            }
            i6 = A08.A00;
            i9 = A08.A09;
            boolean z14 = i6 > i9;
            c1786fq = A08.A05;
            if (c1786fq != null) {
                c1786fq2 = A08.A05;
                if (c1786fq2.A04()) {
                    wasViewable = true;
                    if (!z14 || !A0E.A04()) {
                        A08.A05 = A0E;
                    }
                    String valueOf = String.valueOf(A0E.A01());
                    synchronized (A08) {
                        map = A08.A06;
                        if (map.containsKey(valueOf)) {
                            map3 = A08.A06;
                            i11 = ((Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A08.A06;
                        map2.put(valueOf, Integer.valueOf(i11 + 1));
                    }
                    if (z14 && !wasViewable) {
                        this.A01 = true;
                        A08.A03 = System.currentTimeMillis();
                        z11 = A08.A07;
                        if (z11) {
                            this.A00.A0F().A3w();
                        }
                        abstractC1784fo.A03();
                        if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(500L);
                            view.startAnimation(alphaAnimation);
                        }
                        z12 = A08.A0F;
                        if (!z12) {
                            return;
                        }
                    } else if (!z14 && wasViewable) {
                        this.A01 = true;
                        z9 = A08.A07;
                        if (z9) {
                            this.A00.A0F().A3S(A0E.A02());
                        }
                        abstractC1784fo.A00();
                    } else {
                        abstractC1784fo.A02();
                        if (!this.A01) {
                            z6 = A08.A07;
                            if (z6) {
                                this.A00.A0F().A3u(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    z10 = A08.A08;
                    if (z10) {
                        return;
                    }
                    abstractRunnableC1327Wc = A08.A04;
                    if (abstractRunnableC1327Wc == null) {
                        return;
                    }
                    handler = A08.A0B;
                    abstractRunnableC1327Wc2 = A08.A04;
                    i10 = A08.A02;
                    handler.postDelayed(abstractRunnableC1327Wc2, i10);
                    return;
                }
            }
            wasViewable = false;
            if (!z14) {
            }
            A08.A05 = A0E;
            String valueOf2 = String.valueOf(A0E.A01());
            synchronized (A08) {
            }
        } else {
            z3 = A08.A07;
            if (z3) {
                if (!z13) {
                    i12 = 2;
                }
                A00(i12);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.T4
    public final C1840gi A6m() {
        return this.A00;
    }
}
