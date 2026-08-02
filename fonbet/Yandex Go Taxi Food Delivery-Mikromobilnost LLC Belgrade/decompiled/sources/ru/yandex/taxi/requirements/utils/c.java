package ru.yandex.taxi.requirements.utils;

import defpackage.f6v;
import defpackage.g8e;
import defpackage.h6v;
import defpackage.i6v;
import defpackage.j73;
import defpackage.jiu;
import defpackage.jst;
import defpackage.ny61;
import defpackage.wls;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f6v[] f6vVarArr, boolean z, wls wlsVar, Continuation continuation) {
        IndentifiableFlowKt$checkIdentifiable$1 indentifiableFlowKt$checkIdentifiable$1;
        int i;
        if (continuation instanceof IndentifiableFlowKt$checkIdentifiable$1) {
            indentifiableFlowKt$checkIdentifiable$1 = (IndentifiableFlowKt$checkIdentifiable$1) continuation;
            int i2 = indentifiableFlowKt$checkIdentifiable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                indentifiableFlowKt$checkIdentifiable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = indentifiableFlowKt$checkIdentifiable$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = indentifiableFlowKt$checkIdentifiable$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    for (f6v f6vVar : f6vVarArr) {
                        h6v h6vVar = f6vVar.a;
                        if (h6vVar == null || !h6vVar.b) {
                            t.add(f6vVar);
                        }
                    }
                    int size = t.size();
                    if (size <= 1) {
                        jst.e.A("IDENTIFIABLE").s(new Exception("Found useless identifiable using. Remove or add more identifiable flows"));
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = t.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        h6v h6vVar2 = ((f6v) next).a;
                        if (hashSet.add(h6vVar2 != null ? h6vVar2.a : null)) {
                            arrayList.add(next);
                        }
                    }
                    int size2 = arrayList.size();
                    if (size2 > 1) {
                        if (z) {
                            jst.e.A("IDENTIFIABLE");
                            j73.L(f6vVarArr, "\n", null, new jiu(25), 30);
                        }
                        return new i6v(null, false);
                    }
                    if (z) {
                        jst.e.A("IDENTIFIABLE");
                    }
                    f6v f6vVar2 = (f6v) kotlin.collections.a.R(t);
                    if (f6vVar2 == null) {
                        f6vVar2 = (f6v) j73.C(f6vVarArr);
                    }
                    Object obj3 = f6vVar2.a;
                    indentifiableFlowKt$checkIdentifiable$1.L$0 = null;
                    indentifiableFlowKt$checkIdentifiable$1.L$1 = null;
                    indentifiableFlowKt$checkIdentifiable$1.L$2 = null;
                    indentifiableFlowKt$checkIdentifiable$1.L$3 = null;
                    indentifiableFlowKt$checkIdentifiable$1.Z$0 = z;
                    indentifiableFlowKt$checkIdentifiable$1.I$0 = size;
                    indentifiableFlowKt$checkIdentifiable$1.I$1 = size2;
                    indentifiableFlowKt$checkIdentifiable$1.label = 1;
                    obj = wlsVar.invoke(obj3, indentifiableFlowKt$checkIdentifiable$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new i6v(obj, true);
            }
        }
        indentifiableFlowKt$checkIdentifiable$1 = new IndentifiableFlowKt$checkIdentifiable$1(continuation);
        Object obj4 = indentifiableFlowKt$checkIdentifiable$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = indentifiableFlowKt$checkIdentifiable$1.label;
        if (i != 0) {
        }
        return new i6v(obj4, true);
    }

    public static final f6v b(Object obj, Object obj2) {
        return new f6v(new h6v(obj2, false), obj);
    }
}
