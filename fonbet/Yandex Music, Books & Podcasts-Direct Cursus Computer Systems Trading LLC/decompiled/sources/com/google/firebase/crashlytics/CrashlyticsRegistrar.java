package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aec;
import defpackage.bec;
import defpackage.eg0;
import defpackage.h73;
import defpackage.iec;
import defpackage.m5n;
import defpackage.n;
import defpackage.nj2;
import defpackage.op6;
import defpackage.ox7;
import defpackage.ozf;
import defpackage.p70;
import defpackage.qqi;
import defpackage.rec;
import defpackage.vm5;
import defpackage.wec;
import defpackage.wxf;
import defpackage.yec;
import defpackage.ymp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final m5n a = new m5n(nj2.class, ExecutorService.class);
    public final m5n b = new m5n(h73.class, ExecutorService.class);
    public final m5n c = new m5n(ozf.class, ExecutorService.class);

    static {
        Map map = yec.b;
        ymp ympVar = ymp.a;
        if (map.containsKey(ympVar)) {
            Log.d("SessionsDependencies", "Dependency " + ympVar + " already added.");
            return;
        }
        map.put(ympVar, new wec(new qqi(true)));
        Log.d("SessionsDependencies", "Dependency to " + ympVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eg0 b = vm5.b(bec.class);
        b.c = "fire-cls";
        b.a(ox7.b(aec.class));
        b.a(ox7.b(iec.class));
        b.a(new ox7(this.a, 1, 0));
        b.a(new ox7(this.b, 1, 0));
        b.a(new ox7(this.c, 1, 0));
        b.a(new ox7(0, 2, op6.class));
        b.a(new ox7(0, 2, p70.class));
        b.a(new ox7(0, 2, rec.class));
        b.f = new n(21, this);
        b.j(2);
        return Arrays.asList(b.b(), wxf.q("fire-cls", "19.4.4"));
    }
}
