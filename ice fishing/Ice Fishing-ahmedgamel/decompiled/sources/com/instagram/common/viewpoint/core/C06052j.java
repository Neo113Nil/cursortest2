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
public final class C06052j extends Q9<C1805fp> implements T4 {
    public C1860gi A00;
    public boolean A01;

    public C06052j(C1805fp c1805fp, C1860gi c1860gi) {
        super(c1805fp);
        this.A00 = c1860gi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3v(i);
        }
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07() {
        View view;
        WeakReference weakReference;
        boolean z6;
        int i;
        int i4;
        int i6;
        C1806fq c1806fq;
        boolean wasViewable;
        Map map;
        Map map2;
        boolean z9;
        boolean z10;
        boolean z11;
        AbstractRunnableC1347Wc abstractRunnableC1347Wc;
        Handler handler;
        AbstractRunnableC1347Wc abstractRunnableC1347Wc2;
        int i9;
        boolean z12;
        boolean z13;
        Map map3;
        C1806fq c1806fq2;
        C1805fp A08 = A08();
        int i10 = 0;
        if (A08 == null) {
            A00(0);
            return;
        }
        view = A08.A0C;
        weakReference = A08.A0E;
        AbstractC1804fo abstractC1804fo = (AbstractC1804fo) weakReference.get();
        int i11 = 1;
        boolean z14 = view == null;
        if (!z14 && abstractC1804fo != null) {
            i = A08.A0A;
            C1806fq A0E = C1805fp.A0E(view, i, this.A00);
            if (A0E.A04()) {
                C1805fp.A05(A08);
            } else {
                A08.A00 = 0;
            }
            i4 = A08.A00;
            i6 = A08.A09;
            boolean z15 = i4 > i6;
            c1806fq = A08.A05;
            if (c1806fq != null) {
                c1806fq2 = A08.A05;
                if (c1806fq2.A04()) {
                    wasViewable = true;
                    if (!z15 || !A0E.A04()) {
                        A08.A05 = A0E;
                    }
                    String valueOf = String.valueOf(A0E.A01());
                    synchronized (A08) {
                        map = A08.A06;
                        if (map.containsKey(valueOf)) {
                            map3 = A08.A06;
                            i10 = ((Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A08.A06;
                        map2.put(valueOf, Integer.valueOf(i10 + 1));
                    }
                    if (z15 && !wasViewable) {
                        this.A01 = true;
                        A08.A03 = System.currentTimeMillis();
                        z12 = A08.A07;
                        if (z12) {
                            this.A00.A0F().A3w();
                        }
                        abstractC1804fo.A03();
                        if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(500L);
                            view.startAnimation(alphaAnimation);
                        }
                        z13 = A08.A0F;
                        if (!z13) {
                            return;
                        }
                    } else if (!z15 && wasViewable) {
                        this.A01 = true;
                        z10 = A08.A07;
                        if (z10) {
                            this.A00.A0F().A3S(A0E.A02());
                        }
                        abstractC1804fo.A00();
                    } else {
                        abstractC1804fo.A02();
                        if (!this.A01) {
                            z9 = A08.A07;
                            if (z9) {
                                this.A00.A0F().A3u(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    z11 = A08.A08;
                    if (z11) {
                        return;
                    }
                    abstractRunnableC1347Wc = A08.A04;
                    if (abstractRunnableC1347Wc == null) {
                        return;
                    }
                    handler = A08.A0B;
                    abstractRunnableC1347Wc2 = A08.A04;
                    i9 = A08.A02;
                    handler.postDelayed(abstractRunnableC1347Wc2, i9);
                    return;
                }
            }
            wasViewable = false;
            if (!z15) {
            }
            A08.A05 = A0E;
            String valueOf2 = String.valueOf(A0E.A01());
            synchronized (A08) {
            }
        } else {
            z6 = A08.A07;
            if (z6) {
                if (!z14) {
                    i11 = 2;
                }
                A00(i11);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.T4
    public final C1860gi A6m() {
        return this.A00;
    }
}
