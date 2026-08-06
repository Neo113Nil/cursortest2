package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271a7 {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f5559a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5560b;

    public C0271a7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f5560b = arrayList;
        if (file != null) {
            this.f5559a = new C0692qe(file, new N6());
            arrayList.add(new C0692qe(file, new C0510je()));
        } else {
            this.f5559a = new J6(new N6());
        }
        arrayList.add(new J6(new C0510je()));
    }
}
