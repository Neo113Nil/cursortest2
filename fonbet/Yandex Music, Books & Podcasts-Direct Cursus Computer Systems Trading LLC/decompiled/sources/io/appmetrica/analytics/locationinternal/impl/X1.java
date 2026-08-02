package io.appmetrica.analytics.locationinternal.impl;

import defpackage.uz0;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class X1 implements ProtobufConverter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 toModel(@NotNull X0 x0) {
        int[] iArr = x0.a;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            arrayList.add(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ChargeType.UNKNOWN : ChargeType.AC : ChargeType.WIRELESS : ChargeType.USB : ChargeType.NONE);
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = uz0.c(ChargeType.values());
        }
        int[] iArr2 = x0.b;
        ArrayList arrayList3 = new ArrayList(iArr2.length);
        int length2 = iArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = iArr2[i3];
            arrayList3.add(i4 != 0 ? i4 != 2 ? ApplicationState.UNKNOWN : ApplicationState.VISIBLE : ApplicationState.BACKGROUND);
        }
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = arrayList3;
        if (isEmpty2) {
            arrayList4 = uz0.c(ApplicationState.values());
        }
        return new V1(arrayList2, arrayList4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X0 fromModel(@NotNull V1 v1) {
        X0 x0 = new X0();
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
        x0.a = iArr;
        int size2 = v1.b.size();
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            int i5 = W1.b[((ApplicationState) v1.b.get(i4)).ordinal()];
            iArr2[i4] = i5 != 1 ? i5 != 2 ? 3 : 2 : 0;
        }
        x0.b = iArr2;
        return x0;
    }
}
