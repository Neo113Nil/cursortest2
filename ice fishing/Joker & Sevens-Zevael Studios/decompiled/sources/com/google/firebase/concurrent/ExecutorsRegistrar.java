package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import i7.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import k7.a;
import k7.c;
import k7.d;
import l7.f;
import l7.n;
import l7.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n f1451a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f1452b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f1453c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f1454d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            b.p(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        l7.b bVar = new l7.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new d6.f(22), hashSet3);
        r rVar3 = new r(k7.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(k7.b.class, ExecutorService.class), new r(k7.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            b.p(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        l7.b bVar2 = new l7.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new d6.f(23), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            b.p(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        l7.b bVar3 = new l7.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new d6.f(24), hashSet9);
        l7.a a6 = l7.b.a(new r(d.class, Executor.class));
        a6.f4212g = new d6.f(25);
        return Arrays.asList(bVar, bVar2, bVar3, a6.c());
    }
}
