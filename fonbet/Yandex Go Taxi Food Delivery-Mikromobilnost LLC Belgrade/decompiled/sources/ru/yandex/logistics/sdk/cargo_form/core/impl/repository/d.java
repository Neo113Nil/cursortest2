package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.at0;
import defpackage.e5s;
import defpackage.f5s;
import defpackage.g5s;
import defpackage.gw00;
import defpackage.h5s;
import defpackage.j5s;
import defpackage.l5s;
import defpackage.m5s;
import defpackage.ny61;
import defpackage.o5s;
import defpackage.qg90;
import defpackage.sr60;
import defpackage.t3s;
import defpackage.tcc;
import defpackage.v4s;
import defpackage.vpr;
import defpackage.w4s;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o5s b;

    public d(vpr vprVar, o5s o5sVar) {
        this.a = vprVar;
        this.b = o5sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FormOverrideRepositoryImpl$special$$inlined$map$1$2$1 formOverrideRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        ArrayList arrayList;
        j5s j5sVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (continuation instanceof FormOverrideRepositoryImpl$special$$inlined$map$1$2$1) {
            formOverrideRepositoryImpl$special$$inlined$map$1$2$1 = (FormOverrideRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = formOverrideRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formOverrideRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formOverrideRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formOverrideRepositoryImpl$special$$inlined$map$1$2$1.label;
                ArrayList arrayList4 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m5s m5sVar = (m5s) obj;
                    if (m5sVar != null) {
                        this.b.b.getClass();
                        l5s l5sVar = m5sVar.a;
                        ArrayList arrayList5 = m5sVar.b;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj3 : arrayList5) {
                            if (obj3 instanceof v4s) {
                                arrayList6.add(obj3);
                            }
                        }
                        int d = gw00.d(tcc.n(arrayList6, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        Iterator it = arrayList6.iterator();
                        while (it.hasNext()) {
                            v4s v4sVar = (v4s) it.next();
                            Pair pair = new Pair(v4sVar.a, v4sVar.b);
                            linkedHashMap.put(pair.c(), pair.f());
                        }
                        sr60 sr60Var = l5sVar.a;
                        List list = l5sVar.b;
                        t3s t3sVar = l5sVar.c;
                        t3s c = t3sVar != null ? w4s.c(t3sVar, linkedHashMap) : null;
                        at0 at0Var = l5sVar.d;
                        at0 a = at0Var != null ? w4s.a(at0Var, linkedHashMap) : null;
                        List<h5s> list2 = l5sVar.e;
                        ArrayList arrayList7 = new ArrayList(tcc.n(list2, 10));
                        for (h5s h5sVar : list2) {
                            if (!linkedHashMap.isEmpty()) {
                                t3s c2 = w4s.c(h5sVar.getLayout(), linkedHashMap);
                                if (h5sVar instanceof g5s) {
                                    h5sVar = new g5s(((g5s) h5sVar).a, c2);
                                } else {
                                    if (h5sVar instanceof e5s) {
                                        e5s e5sVar = (e5s) h5sVar;
                                        arrayList3 = arrayList4;
                                        h5sVar = new e5s(e5sVar.a, c2, e5sVar.c);
                                    } else {
                                        arrayList3 = arrayList4;
                                        if (!(h5sVar instanceof f5s)) {
                                            w511.b();
                                            return arrayList3;
                                        }
                                        f5s f5sVar = (f5s) h5sVar;
                                        h5sVar = new f5s(f5sVar.a, c2, f5sVar.c);
                                    }
                                    arrayList7.add(h5sVar);
                                    arrayList4 = arrayList3;
                                }
                            }
                            arrayList3 = arrayList4;
                            arrayList7.add(h5sVar);
                            arrayList4 = arrayList3;
                        }
                        ArrayList arrayList8 = arrayList4;
                        List list3 = l5sVar.f;
                        if (list3 != null) {
                            List<qg90> list4 = list3;
                            ArrayList arrayList9 = new ArrayList(tcc.n(list4, 10));
                            for (qg90 qg90Var : list4) {
                                if (!linkedHashMap.isEmpty()) {
                                    qg90Var = new qg90(w4s.a(qg90Var.a, linkedHashMap), qg90Var.b);
                                }
                                arrayList9.add(qg90Var);
                            }
                            arrayList2 = arrayList9;
                        } else {
                            arrayList2 = arrayList8;
                        }
                        j5sVar = new j5s(sr60Var, list, c, a, arrayList7, arrayList2, l5sVar.g, l5sVar.h, l5sVar.i, l5sVar.j, l5sVar.k);
                        arrayList = arrayList8;
                    } else {
                        arrayList = null;
                        j5sVar = null;
                    }
                    formOverrideRepositoryImpl$special$$inlined$map$1$2$1.L$0 = arrayList;
                    formOverrideRepositoryImpl$special$$inlined$map$1$2$1.L$1 = arrayList;
                    formOverrideRepositoryImpl$special$$inlined$map$1$2$1.L$2 = arrayList;
                    formOverrideRepositoryImpl$special$$inlined$map$1$2$1.L$3 = arrayList;
                    formOverrideRepositoryImpl$special$$inlined$map$1$2$1.I$0 = 0;
                    formOverrideRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(j5sVar, formOverrideRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        formOverrideRepositoryImpl$special$$inlined$map$1$2$1 = new FormOverrideRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = formOverrideRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formOverrideRepositoryImpl$special$$inlined$map$1$2$1.label;
        ArrayList arrayList42 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
