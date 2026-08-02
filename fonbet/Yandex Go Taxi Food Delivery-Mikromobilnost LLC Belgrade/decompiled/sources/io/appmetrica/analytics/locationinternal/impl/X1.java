package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class X1 implements ProtobufConverter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 toModel(W0 w0) {
        int[] iArr = w0.a;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            arrayList.add(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ChargeType.UNKNOWN : ChargeType.AC : ChargeType.WIRELESS : ChargeType.USB : ChargeType.NONE);
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = Arrays.asList(ChargeType.values());
        }
        int[] iArr2 = w0.b;
        ArrayList arrayList3 = new ArrayList(iArr2.length);
        int length2 = iArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = iArr2[i3];
            arrayList3.add(i4 != 0 ? i4 != 2 ? ApplicationState.UNKNOWN : ApplicationState.VISIBLE : ApplicationState.BACKGROUND);
        }
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = arrayList3;
        if (isEmpty2) {
            arrayList4 = Arrays.asList(ApplicationState.values());
        }
        return new V1(arrayList2, arrayList4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W0 fromModel(V1 v1) {
        W0 w0 = new W0();
        int size = v1.a.size();
        int[] iArr = new int[size];
        int i = 0;
        while (true) {
            int i2 = 3;
            if (i >= size) {
                break;
            }
            int i3 = W1.a[((ChargeType) v1.a.get(i)).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = 1;
                } else if (i3 != 3) {
                    i2 = 4;
                    if (i3 == 4) {
                        i2 = 0;
                    }
                } else {
                    i2 = 2;
                }
            }
            iArr[i] = i2;
            i++;
        }
        w0.a = iArr;
        int size2 = v1.b.size();
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            int i5 = W1.b[((ApplicationState) v1.b.get(i4)).ordinal()];
            iArr2[i4] = i5 != 1 ? i5 != 2 ? 3 : 2 : 0;
        }
        w0.b = iArr2;
        return w0;
    }
}
