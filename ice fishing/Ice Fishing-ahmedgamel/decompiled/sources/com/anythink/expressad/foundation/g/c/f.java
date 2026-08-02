package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    protected e f19971b;

    public f(String str) {
        e eVar = new e();
        eVar.a(str);
        eVar.a(a.AD_ROOT);
        List<e> a9 = a();
        if (a9.size() > 0) {
            eVar.a(a9);
        }
        this.f19971b = eVar;
    }

    public static e a(ArrayList<e> arrayList, a aVar, String str) {
        e eVar = new e();
        eVar.a(aVar);
        eVar.a(str);
        arrayList.add(eVar);
        return eVar;
    }

    public abstract List<e> a();

    public final e b() {
        return this.f19971b;
    }
}
