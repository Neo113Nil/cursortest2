package com.google.firebase.concurrent;

import S3.a;
import S3.c;
import S3.d;
import T3.b;
import T3.f;
import T3.n;
import T3.r;
import android.annotation.SuppressLint;
import com.bumptech.glide.g;
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
    public static final n f36950a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f36951b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f36952c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f36953d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            g.g(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new D0.n(15), hashSet3);
        r rVar3 = new r(S3.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(S3.b.class, ExecutorService.class), new r(S3.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            g.g(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new D0.n(16), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            g.g(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new D0.n(17), hashSet9);
        T3.a a9 = b.a(new r(d.class, Executor.class));
        a9.f3168z = new D0.n(18);
        return Arrays.asList(bVar, bVar2, bVar3, a9.b());
    }
}
