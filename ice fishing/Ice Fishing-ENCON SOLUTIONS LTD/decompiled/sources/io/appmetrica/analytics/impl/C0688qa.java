package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0688qa extends C2 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0765ta f6774b;

    public C0688qa(int i2) {
        this(i2, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C0688qa(int i2, InterfaceC0765ta interfaceC0765ta) {
        super(i2);
        this.f6774b = interfaceC0765ta;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0765ta
    public final Mn a(List<Object> list) {
        int i2;
        int i3 = 0;
        if (list == null || (list.size() <= this.f4253a && this.f6774b == null)) {
            i2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i2 = 0;
            int i4 = 0;
            for (Object obj : list) {
                if (i4 < this.f4253a) {
                    InterfaceC0765ta interfaceC0765ta = this.f6774b;
                    if (interfaceC0765ta != null) {
                        Mn a2 = interfaceC0765ta.a(obj);
                        Object obj2 = a2.f4785a;
                        i2 += a2.f4786b.getBytesTruncated();
                        AbstractC0572lo.a(obj, a2.f4785a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i3++;
                    i2 += b(obj);
                }
                i4++;
            }
            list = arrayList;
        }
        return new Mn(list, new C0604n4(i3, i2));
    }

    public final InterfaceC0765ta b() {
        return this.f6774b;
    }
}
