package com.google.firebase.concurrent;

import com.gamericefishpro.space.ab.a;
import com.gamericefishpro.space.ab.d;
import com.gamericefishpro.space.bb.b;
import com.gamericefishpro.space.bb.f;
import com.gamericefishpro.space.bb.q;
import com.gamericefishpro.space.bb.s;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.hj.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final q a = new q(new f(2));
    public static final q b = new q(new f(3));
    public static final q c = new q(new f(4));
    public static final q d = new q(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        v vVar = new v(a.class, ScheduledExecutorService.class);
        v[] vVarArr = {new v(a.class, ExecutorService.class), new v(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(vVar);
        for (v vVar2 : vVarArr) {
            c.m(vVar2, "Null interface");
        }
        Collections.addAll(hashSet, vVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s(2), hashSet3);
        v vVar3 = new v(com.gamericefishpro.space.ab.b.class, ScheduledExecutorService.class);
        v[] vVarArr2 = {new v(com.gamericefishpro.space.ab.b.class, ExecutorService.class), new v(com.gamericefishpro.space.ab.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(vVar3);
        for (v vVar4 : vVarArr2) {
            c.m(vVar4, "Null interface");
        }
        Collections.addAll(hashSet4, vVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new s(3), hashSet6);
        v vVar5 = new v(com.gamericefishpro.space.ab.c.class, ScheduledExecutorService.class);
        v[] vVarArr3 = {new v(com.gamericefishpro.space.ab.c.class, ExecutorService.class), new v(com.gamericefishpro.space.ab.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(vVar5);
        for (v vVar6 : vVarArr3) {
            c.m(vVar6, "Null interface");
        }
        Collections.addAll(hashSet7, vVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new s(4), hashSet9);
        com.gamericefishpro.space.bb.a aVarA = b.a(new v(d.class, Executor.class));
        aVarA.g = new s(5);
        return Arrays.asList(bVar, bVar2, bVar3, aVarA.c());
    }
}
