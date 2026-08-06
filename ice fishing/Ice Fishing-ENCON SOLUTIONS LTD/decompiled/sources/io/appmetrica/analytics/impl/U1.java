package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U1 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0809v2 f5146a;

    public U1() {
        this(new C0809v2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 fromModel(T1 t12) {
        X1 x12 = new X1();
        x12.f5343a = new W1[t12.f5083a.size()];
        int i2 = 0;
        int i3 = 0;
        for (PermissionState permissionState : t12.f5083a) {
            W1[] w1Arr = x12.f5343a;
            W1 w12 = new W1();
            w12.f5275a = permissionState.name;
            w12.f5276b = permissionState.granted;
            w1Arr[i3] = w12;
            i3++;
        }
        C0861x2 c0861x2 = t12.f5084b;
        if (c0861x2 != null) {
            x12.f5344b = this.f5146a.fromModel(c0861x2);
        }
        x12.f5345c = new String[t12.f5085c.size()];
        Iterator it = t12.f5085c.iterator();
        while (it.hasNext()) {
            x12.f5345c[i2] = (String) it.next();
            i2++;
        }
        return x12;
    }

    public U1(C0809v2 c0809v2) {
        this.f5146a = c0809v2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T1 toModel(X1 x12) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            W1[] w1Arr = x12.f5343a;
            if (i3 >= w1Arr.length) {
                break;
            }
            W1 w12 = w1Arr[i3];
            arrayList.add(new PermissionState(w12.f5275a, w12.f5276b));
            i3++;
        }
        V1 v12 = x12.f5344b;
        C0861x2 model = v12 != null ? this.f5146a.toModel(v12) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = x12.f5345c;
            if (i2 < strArr.length) {
                arrayList2.add(strArr[i2]);
                i2++;
            } else {
                return new T1(arrayList, model, arrayList2);
            }
        }
    }
}
