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
            C1173Qa c1173Qa = (C1173Qa) it.next();
            this.A00.A0e(c1173Qa.A04, c1173Qa.A00, c1173Qa.A01, c1173Qa.A02, c1173Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
