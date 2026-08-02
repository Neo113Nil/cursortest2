package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class G2 implements ProtobufConverter {
    public final C0363j3 a;

    public G2() {
        this(new C0363j3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J2 fromModel(@NonNull F2 f2) {
        J2 j2 = new J2();
        j2.a = new I2[f2.a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : f2.a) {
            I2[] i2Arr = j2.a;
            I2 i22 = new I2();
            i22.a = permissionState.name;
            i22.b = permissionState.granted;
            i2Arr[i2] = i22;
            i2++;
        }
        C0421l3 c0421l3 = f2.b;
        if (c0421l3 != null) {
            j2.b = this.a.fromModel(c0421l3);
        }
        j2.c = new String[f2.c.size()];
        Iterator it = f2.c.iterator();
        while (it.hasNext()) {
            j2.c[i] = (String) it.next();
            i++;
        }
        return j2;
    }

    public G2(C0363j3 c0363j3) {
        this.a = c0363j3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F2 toModel(@NonNull J2 j2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            I2[] i2Arr = j2.a;
            if (i2 >= i2Arr.length) {
                break;
            }
            I2 i22 = i2Arr[i2];
            arrayList.add(new PermissionState(i22.a, i22.b));
            i2++;
        }
        H2 h2 = j2.b;
        C0421l3 model = h2 != null ? this.a.toModel(h2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = j2.c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new F2(arrayList, model, arrayList2);
            }
        }
    }
}
