package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1616ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C1023Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1112Mt abstractC1112Mt;
        AbstractC1112Mt abstractC1112Mt2;
        boolean z6;
        C1537bT c1537bT;
        boolean z9;
        C1537bT c1537bT2;
        C1577c7 c1577c7;
        AbstractC2025jd abstractC2025jd;
        Handler handler;
        Runnable runnable;
        AbstractC2025jd abstractC2025jd2;
        C1577c7 c1577c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1112Mt = this.A00.A0W;
            if (abstractC1112Mt == null) {
                return;
            }
            abstractC1112Mt2 = this.A00.A0W;
            Uri A0M = ((AnonymousClass85) abstractC1112Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z6 = this.A00.A0D;
            if (!z6) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c1577c7 = this.A00.A0b;
                if (c1577c7.A0D() != null) {
                    c1577c72 = this.A00.A0b;
                    c1577c72.A0D().ACQ();
                }
                abstractC2025jd = this.A00.A0X;
                if (abstractC2025jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC2025jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC2025jd2.A0q());
                }
            }
            c1537bT = this.A00.A09;
            if (c1537bT != null) {
                c1537bT2 = this.A00.A09;
                c1537bT2.A0B();
                this.A00.A09 = null;
            }
            C1023Ji c1023Ji = this.A00;
            z9 = this.A00.A0D;
            c1023Ji.A0q(z9 ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC1616ck(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }
}
