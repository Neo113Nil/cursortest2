package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1529bf implements View.OnClickListener {
    public final /* synthetic */ C1532bi A00;

    public ViewOnClickListenerC1529bf(C1532bi c1532bi) {
        this.A00 = c1532bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1531bh interfaceC1531bh;
        AbstractC1375Yb abstractC1375Yb;
        List list;
        C0877Ek c0877Ek;
        C0877Ek c0877Ek2;
        C0877Ek c0877Ek3;
        AbstractC1375Yb abstractC1375Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1531bh = this.A00.A05;
            interfaceC1531bh.AEm();
            abstractC1375Yb = this.A00.A00;
            if (abstractC1375Yb != null) {
                abstractC1375Yb2 = this.A00.A00;
                YB.A0L(abstractC1375Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c0877Ek = this.A00.A06;
            if (c0877Ek == null) {
                return;
            }
            c0877Ek2 = this.A00.A06;
            YB.A0O(c0877Ek2, 0);
            c0877Ek3 = this.A00.A06;
            c0877Ek3.A0e(EnumC1727et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
