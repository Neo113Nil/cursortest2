package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.brf;
import defpackage.eg0;
import defpackage.h73;
import defpackage.kw7;
import defpackage.m5n;
import defpackage.nj2;
import defpackage.ozf;
import defpackage.pht;
import defpackage.pn5;
import defpackage.v3g;
import defpackage.vm5;
import defpackage.xla;
import defpackage.xx6;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final brf a = new brf(new pn5(1));
    public static final brf b = new brf(new pn5(2));
    public static final brf c = new brf(new pn5(3));
    public static final brf d = new brf(new pn5(4));

    public static kw7 a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new kw7(Executors.newFixedThreadPool(4, new xx6("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        m5n m5nVar = new m5n(nj2.class, ScheduledExecutorService.class);
        m5n[] m5nVarArr = {new m5n(nj2.class, ExecutorService.class), new m5n(nj2.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(m5nVar);
        for (m5n m5nVar2 : m5nVarArr) {
            v3g.w(m5nVar2, "Null interface");
        }
        Collections.addAll(hashSet, m5nVarArr);
        vm5 vm5Var = new vm5(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new xla(17), hashSet3);
        m5n m5nVar3 = new m5n(h73.class, ScheduledExecutorService.class);
        m5n[] m5nVarArr2 = {new m5n(h73.class, ExecutorService.class), new m5n(h73.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(m5nVar3);
        for (m5n m5nVar4 : m5nVarArr2) {
            v3g.w(m5nVar4, "Null interface");
        }
        Collections.addAll(hashSet4, m5nVarArr2);
        vm5 vm5Var2 = new vm5(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new xla(18), hashSet6);
        m5n m5nVar5 = new m5n(ozf.class, ScheduledExecutorService.class);
        m5n[] m5nVarArr3 = {new m5n(ozf.class, ExecutorService.class), new m5n(ozf.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(m5nVar5);
        for (m5n m5nVar6 : m5nVarArr3) {
            v3g.w(m5nVar6, "Null interface");
        }
        Collections.addAll(hashSet7, m5nVarArr3);
        vm5 vm5Var3 = new vm5(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new xla(19), hashSet9);
        eg0 a2 = vm5.a(new m5n(pht.class, Executor.class));
        a2.f = new xla(20);
        return Arrays.asList(vm5Var, vm5Var2, vm5Var3, a2.b());
    }
}
