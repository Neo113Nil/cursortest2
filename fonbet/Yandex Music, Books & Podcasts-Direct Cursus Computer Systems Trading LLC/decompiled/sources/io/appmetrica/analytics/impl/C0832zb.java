package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0832zb extends AbstractC0594r3 {
    public final Cb b;

    public C0832zb(int i, Cb cb) {
        super(i);
        this.b = cb;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0594r3, io.appmetrica.analytics.impl.Cb
    @NonNull
    public final Rq a(List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.a && this.b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.a) {
                    Cb cb = this.b;
                    if (cb != null) {
                        Rq a = cb.a(obj);
                        Object obj2 = a.a;
                        i += a.b.getBytesTruncated();
                        AbstractC0734vr.a(obj, a.a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new Rq(list, new C0221e5(i2, i));
    }

    public final Cb b() {
        return this.b;
    }

    public int b(Object obj) {
        return 0;
    }

    public C0832zb(int i) {
        this(i, null);
    }
}
