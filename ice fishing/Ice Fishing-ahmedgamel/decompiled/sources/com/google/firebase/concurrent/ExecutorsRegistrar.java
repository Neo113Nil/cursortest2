package com.google.firebase.concurrent;

import B1.x;
import Q3.a;
import Q3.c;
import Q3.d;
import R3.b;
import R3.f;
import R3.n;
import R3.r;
import X2.e;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n f36183a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f36184b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f36185c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f36186d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            e.z(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new x(14), hashSet3);
        r rVar3 = new r(Q3.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(Q3.b.class, ExecutorService.class), new r(Q3.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            e.z(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new x(15), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            e.z(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new x(16), hashSet9);
        R3.a a9 = b.a(new r(d.class, Executor.class));
        a9.f2713z = new x(17);
        return Arrays.asList(bVar, bVar2, bVar3, a9.b());
    }
}
