package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public class QR implements Runnable {
    public final /* synthetic */ C7P A00;
    public final /* synthetic */ ArrayList A01;

    public QR(C7P c7p, ArrayList arrayList) {
        this.A00 = c7p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C1193Qa c1193Qa = (C1193Qa) it.next();
            this.A00.A0e(c1193Qa.A04, c1193Qa.A00, c1193Qa.A01, c1193Qa.A02, c1193Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
