package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1549bf implements View.OnClickListener {
    public final /* synthetic */ C1552bi A00;

    public ViewOnClickListenerC1549bf(C1552bi c1552bi) {
        this.A00 = c1552bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1551bh interfaceC1551bh;
        AbstractC1395Yb abstractC1395Yb;
        List list;
        C0897Ek c0897Ek;
        C0897Ek c0897Ek2;
        C0897Ek c0897Ek3;
        AbstractC1395Yb abstractC1395Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1551bh = this.A00.A05;
            interfaceC1551bh.AEm();
            abstractC1395Yb = this.A00.A00;
            if (abstractC1395Yb != null) {
                abstractC1395Yb2 = this.A00.A00;
                YB.A0L(abstractC1395Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c0897Ek = this.A00.A06;
            if (c0897Ek == null) {
                return;
            }
            c0897Ek2 = this.A00.A06;
            YB.A0O(c0897Ek2, 0);
            c0897Ek3 = this.A00.A06;
            c0897Ek3.A0e(EnumC1747et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
