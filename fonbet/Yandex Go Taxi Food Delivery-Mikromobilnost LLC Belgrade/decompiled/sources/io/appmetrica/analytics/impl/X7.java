package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class X7 {
    public final G7 a;
    public final ArrayList b;

    public X7(File file) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (file != null) {
            this.a = new C0279dh(file, new K7());
            arrayList.add(new C0279dh(file, new Xg()));
        } else {
            this.a = new H7(new K7());
        }
        arrayList.add(new H7(new Xg()));
    }
}
