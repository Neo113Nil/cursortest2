package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1528bf implements View.OnClickListener {
    public final /* synthetic */ C1531bi A00;

    public ViewOnClickListenerC1528bf(C1531bi c1531bi) {
        this.A00 = c1531bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1530bh interfaceC1530bh;
        AbstractC1374Yb abstractC1374Yb;
        List list;
        C0876Ek c0876Ek;
        C0876Ek c0876Ek2;
        C0876Ek c0876Ek3;
        AbstractC1374Yb abstractC1374Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1530bh = this.A00.A05;
            interfaceC1530bh.AEm();
            abstractC1374Yb = this.A00.A00;
            if (abstractC1374Yb != null) {
                abstractC1374Yb2 = this.A00.A00;
                YB.A0L(abstractC1374Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c0876Ek = this.A00.A06;
            if (c0876Ek == null) {
                return;
            }
            c0876Ek2 = this.A00.A06;
            YB.A0O(c0876Ek2, 0);
            c0876Ek3 = this.A00.A06;
            c0876Ek3.A0e(EnumC1726et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
