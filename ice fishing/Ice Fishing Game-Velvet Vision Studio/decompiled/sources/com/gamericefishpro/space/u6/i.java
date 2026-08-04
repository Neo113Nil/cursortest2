package com.gamericefishpro.space.u6;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d1;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.t;
import com.gamericefishpro.space.i9.v3;
import com.gamericefishpro.space.i9.v5;
import com.gamericefishpro.space.i9.w9;
import com.gamericefishpro.space.l4.c0;
import com.gamericefishpro.space.l4.q0;
import com.gamericefishpro.space.l4.t0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.s5.v;
import com.gamericefishpro.space.t.r0;
import com.gamericefishpro.space.z4.m0;
import com.gamericefishpro.space.z4.p0;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.u0;
import com.gamericefishpro.space.z4.w;
import com.gamericefishpro.space.z4.w0;
import com.gamericefishpro.space.z4.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;

    public i(int i) {
        switch (i) {
            case 3:
                t tVar = new t(0);
                this.a = tVar;
                n nVar = new n(null, tVar);
                this.c = nVar;
                this.b = nVar.e();
                v5 v5Var = new v5(1);
                this.d = v5Var;
                nVar.h("require", new w9(v5Var));
                ((HashMap) v5Var.d).put("internal.platform", d1.d);
                nVar.h("runtime.counter", new com.gamericefishpro.space.i9.g(Double.valueOf(0.0d)));
                break;
            case 4:
            default:
                this.a = new com.gamericefishpro.space.t.e(0);
                this.b = new SparseArray();
                this.c = new com.gamericefishpro.space.t.q((Object) null);
                this.d = new com.gamericefishpro.space.t.e(0);
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                this.a = new com.gamericefishpro.space.c4.b(10);
                this.b = new r0(0);
                this.c = new ArrayList();
                this.d = new HashSet();
                break;
        }
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((r0) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(com.gamericefishpro.space.vh.c cVar) {
        com.gamericefishpro.space.l4.h hVar;
        i iVar;
        com.gamericefishpro.space.l4.d dVar;
        c0 c0Var = (c0) this.d;
        if (cVar instanceof com.gamericefishpro.space.l4.h) {
            hVar = (com.gamericefishpro.space.l4.h) cVar;
            int i = hVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.v = i - Integer.MIN_VALUE;
            } else {
                hVar = new com.gamericefishpro.space.l4.h(this, cVar);
            }
        } else {
            hVar = new com.gamericefishpro.space.l4.h(this, cVar);
        }
        Object objE = hVar.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = hVar.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objE);
            List list = (List) this.c;
            if (list == null || list.isEmpty()) {
                hVar.d = this;
                hVar.v = 1;
                objE = c0.e(c0Var, false, hVar);
                if (objE != aVar) {
                    iVar = this;
                    dVar = (com.gamericefishpro.space.l4.d) objE;
                }
            } else {
                t0 t0VarF = c0Var.f();
                com.gamericefishpro.space.l4.k kVar = new com.gamericefishpro.space.l4.k(c0Var, this, null);
                hVar.d = this;
                hVar.v = 2;
                objE = t0VarF.b(kVar, hVar);
                if (objE != aVar) {
                    iVar = this;
                    dVar = (com.gamericefishpro.space.l4.d) objE;
                }
            }
            return aVar;
        }
        if (i2 == 1) {
            iVar = hVar.d;
            com.gamericefishpro.space.wa.b.P(objE);
            dVar = (com.gamericefishpro.space.l4.d) objE;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = hVar.d;
            com.gamericefishpro.space.wa.b.P(objE);
            dVar = (com.gamericefishpro.space.l4.d) objE;
        }
        ((c0) iVar.d).A.d(dVar);
        return Unit.a;
    }

    public g c(j id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String str = id.a;
        int i = id.b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        v vVarB = v.b(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            vVarB.p(1);
        } else {
            vVarB.i(1, str);
        }
        vVarB.a(2, i);
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            int iY = com.gamericefishpro.space.d9.h.y(cursorL, "work_spec_id");
            int iY2 = com.gamericefishpro.space.d9.h.y(cursorL, "generation");
            int iY3 = com.gamericefishpro.space.d9.h.y(cursorL, "system_id");
            g gVar = null;
            String string = null;
            if (cursorL.moveToFirst()) {
                if (!cursorL.isNull(iY)) {
                    string = cursorL.getString(iY);
                }
                gVar = new g(string, cursorL.getInt(iY2), cursorL.getInt(iY3));
            }
            return gVar;
        } finally {
            cursorL.close();
            vVarB.c();
        }
    }

    public s0 d(com.gamericefishpro.space.ei.g modelClass, String key) {
        s0 viewModel;
        s0 s0VarA;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((com.gamericefishpro.space.e5.c) this.d)) {
            try {
                x0 x0Var = (x0) this.a;
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                viewModel = (s0) x0Var.a.get(key);
                if (modelClass.d(viewModel)) {
                    u0 u0Var = (u0) this.b;
                    if (u0Var instanceof p0) {
                        p0 p0Var = (p0) u0Var;
                        Intrinsics.b(viewModel);
                        p0Var.getClass();
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        w wVar = p0Var.d;
                        if (wVar != null) {
                            s sVar = p0Var.e;
                            Intrinsics.b(sVar);
                            m0.a(viewModel, sVar, wVar);
                        }
                    }
                    Intrinsics.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    com.gamericefishpro.space.c5.f extras = new com.gamericefishpro.space.c5.f((com.gamericefishpro.space.c5.c) this.c);
                    extras.b(w0.b, key);
                    u0 factory = (u0) this.b;
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    try {
                        try {
                            s0VarA = factory.c(modelClass, extras);
                        } catch (AbstractMethodError unused) {
                            s0VarA = factory.b(d5.C(modelClass), extras);
                        }
                    } catch (AbstractMethodError unused2) {
                        s0VarA = factory.a(d5.C(modelClass));
                    }
                    viewModel = s0VarA;
                    x0 x0Var2 = (x0) this.a;
                    x0Var2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    s0 s0Var = (s0) x0Var2.a.put(key, viewModel);
                    if (s0Var != null) {
                        s0Var.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public void e(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.b).f(gVar);
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(com.gamericefishpro.space.vh.c cVar) throws Throwable {
        q0 q0Var;
        com.gamericefishpro.space.xi.a aVar;
        i iVar;
        com.gamericefishpro.space.xi.a aVar2;
        Throwable th;
        i iVar2;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i = q0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0Var.w = i - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object obj = q0Var.i;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = q0Var.w;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                if (((com.gamericefishpro.space.pi.n) this.b).U()) {
                    return Unit.a;
                }
                aVar = (com.gamericefishpro.space.xi.c) this.a;
                q0Var.d = this;
                q0Var.e = aVar;
                q0Var.w = 1;
                if (aVar.c(q0Var) != aVar3) {
                    iVar = this;
                }
                return aVar3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = q0Var.e;
                iVar2 = q0Var.d;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.pi.n nVar = (com.gamericefishpro.space.pi.n) iVar2.b;
                    Unit unit = Unit.a;
                    nVar.W(unit);
                    aVar2.b(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.b(null);
                    throw th;
                }
            }
            com.gamericefishpro.space.xi.a aVar4 = q0Var.e;
            iVar = q0Var.d;
            com.gamericefishpro.space.wa.b.P(obj);
            aVar = aVar4;
            if (((com.gamericefishpro.space.pi.n) iVar.b).U()) {
                Unit unit2 = Unit.a;
                aVar.b(null);
                return unit2;
            }
            q0Var.d = iVar;
            q0Var.e = aVar;
            q0Var.w = 2;
            if (iVar.b(q0Var) != aVar3) {
                aVar2 = aVar;
                iVar2 = iVar;
                com.gamericefishpro.space.pi.n nVar2 = (com.gamericefishpro.space.pi.n) iVar2.b;
                Unit unit3 = Unit.a;
                nVar2.W(unit3);
                aVar2.b(null);
                return unit3;
            }
            return aVar3;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.b(null);
            throw th;
        }
    }

    public com.gamericefishpro.space.i9.n g(n nVar, v3... v3VarArr) {
        com.gamericefishpro.space.i9.n nVarV = com.gamericefishpro.space.i9.n.j;
        for (v3 v3Var : v3VarArr) {
            nVarV = com.gamericefishpro.space.i.a.V(v3Var);
            a4.U((n) this.c);
            if ((nVarV instanceof com.gamericefishpro.space.i9.o) || (nVarV instanceof com.gamericefishpro.space.i9.m)) {
                nVarV = ((t) this.a).c(nVar, nVarV);
            }
        }
        return nVarV;
    }

    public i(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new b(database, 2);
        this.c = new h(database, 0);
        this.d = new h(database, 1);
    }

    public i(x0 store, u0 factory, com.gamericefishpro.space.c5.c defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.a = store;
        this.b = factory;
        this.c = defaultExtras;
        this.d = new com.gamericefishpro.space.e5.c();
    }

    public i(Context context, com.gamericefishpro.space.r5.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        com.gamericefishpro.space.s6.a batteryChargingTracker = new com.gamericefishpro.space.s6.a(context2, taskExecutor, 0);
        Context context3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        com.gamericefishpro.space.s6.a batteryNotLowTracker = new com.gamericefishpro.space.s6.a(context3, taskExecutor, 1);
        Context context4 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context.applicationContext");
        String str = com.gamericefishpro.space.s6.h.a;
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        com.gamericefishpro.space.s6.g networkStateTracker = new com.gamericefishpro.space.s6.g(context4, taskExecutor);
        Context context5 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context5, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        com.gamericefishpro.space.s6.a storageNotLowTracker = new com.gamericefishpro.space.s6.a(context5, taskExecutor, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.a = batteryChargingTracker;
        this.b = batteryNotLowTracker;
        this.c = networkStateTracker;
        this.d = storageNotLowTracker;
    }

    public i(c0 c0Var, List initTasksList) {
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        this.d = c0Var;
        this.a = new com.gamericefishpro.space.xi.c();
        this.b = a0.a();
        this.c = CollectionsKt.L(initTasksList);
    }
}
