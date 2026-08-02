package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class P6<T> {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    public P6() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 50; i++) {
            arrayList.add(null);
        }
        this.a = arrayList;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            int size = this.a.size();
            while (i2 < size) {
                Object obj = this.a.get(i2);
                if (obj != null) {
                    arrayList.add(obj);
                }
                i2++;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object obj2 = this.a.get(i4);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else if (i2 <= i) {
            while (true) {
                Object obj3 = this.a.get(i2);
                if (obj3 != null) {
                    arrayList.add(obj3);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public final String toString() {
        String joinToString$default = CollectionsKt.joinToString$default(a(), ", ", "{", "}", 0, null, null, 56);
        int i = this.d;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, " [capacity=", ", H=", ", T=");
        m107m.append(i3);
        m107m.append("]");
        return joinToString$default.concat(m107m.toString());
    }
}
