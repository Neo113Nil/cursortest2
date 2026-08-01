package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0781Ap implements InterfaceC2444rI {
    public final /* synthetic */ C0780Ao A00;

    public C0781Ap(C0780Ao c0780Ao) {
        this.A00 = c0780Ao;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2444rI
    public final void AFq() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC2444rI interfaceC2444rI;
        InterfaceC2444rI interfaceC2444rI2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC2444rI = this.A00.A01;
        if (interfaceC2444rI != null) {
            interfaceC2444rI2 = this.A00.A01;
            interfaceC2444rI2.AFq();
        }
    }
}
