package com.gamericefishpro.space.q4;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final q0 c = new q0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final c0 a = new c0();

    public final t0 a(Class cls) {
        t0 t0VarW;
        Class cls2;
        u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        t0 t0Var = (t0) concurrentHashMap.get(cls);
        if (t0Var != null) {
            return t0Var;
        }
        c0 c0Var = this.a;
        c0Var.getClass();
        Class cls3 = u0.a;
        if (!s.class.isAssignableFrom(cls) && (cls2 = u0.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        s0 s0VarA = ((b0) c0Var.a).a(cls);
        int i = s0VarA.d;
        a aVar = s0VarA.a;
        if ((i & 2) == 2) {
            if (s.class.isAssignableFrom(cls)) {
                t0VarW = new l0(u0.c, m.a, aVar);
            } else {
                z0 z0Var = u0.b;
                l lVar = m.b;
                if (lVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t0VarW = new l0(z0Var, lVar, aVar);
            }
        } else if (s.class.isAssignableFrom(cls)) {
            l lVar2 = null;
            m0 m0Var = n0.b;
            z zVar = a0.b;
            z0 z0Var2 = u0.c;
            if (com.gamericefishpro.space.i3.e.b(s0VarA.a()) != 1) {
                lVar2 = m.a;
            }
            l lVar3 = lVar2;
            g0 g0Var = h0.b;
            if (!(s0VarA instanceof s0)) {
                int[] iArr = k0.n;
                s0VarA.getClass();
                throw new ClassCastException();
            }
            t0VarW = k0.w(s0VarA, m0Var, zVar, z0Var2, lVar3, g0Var);
        } else {
            l lVar4 = null;
            m0 m0Var2 = n0.a;
            z zVar2 = a0.a;
            z0 z0Var3 = u0.b;
            if (com.gamericefishpro.space.i3.e.b(s0VarA.a()) != 1 && (lVar4 = m.b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            l lVar5 = lVar4;
            g0 g0Var2 = h0.a;
            if (!(s0VarA instanceof s0)) {
                int[] iArr2 = k0.n;
                s0VarA.getClass();
                throw new ClassCastException();
            }
            t0VarW = k0.w(s0VarA, m0Var2, zVar2, z0Var3, lVar5, g0Var2);
        }
        t0 t0Var2 = (t0) concurrentHashMap.putIfAbsent(cls, t0VarW);
        return t0Var2 != null ? t0Var2 : t0VarW;
    }
}
