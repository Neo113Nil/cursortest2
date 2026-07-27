package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0780Ap implements InterfaceC2443rI {
    public final /* synthetic */ C0779Ao A00;

    public C0780Ap(C0779Ao c0779Ao) {
        this.A00 = c0779Ao;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2443rI
    public final void AFq() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC2443rI interfaceC2443rI;
        InterfaceC2443rI interfaceC2443rI2;
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
        interfaceC2443rI = this.A00.A01;
        if (interfaceC2443rI != null) {
            interfaceC2443rI2 = this.A00.A01;
            interfaceC2443rI2.AFq();
        }
    }
}
