package com.yandex.plus.bdui.plus.action;

import defpackage.b6e;
import defpackage.k32;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class y {
    public final ArrayList a;

    public y(List list) {
        list.getClass();
        List<t> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (t tVar : list2) {
            Function1 function1 = tVar.a;
            Function2 function2 = tVar.b;
            Function1 function12 = tVar.c;
            k32 k32Var = new k32(12, function1);
            function2 = function2 == null ? null : function2;
            if (function12 == null) {
                function12 = null;
            }
            arrayList.add(new u(k32Var, function2, function12));
        }
        this.a = arrayList;
    }

    public final boolean a(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        Iterator it = this.a.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            u uVar = (u) it.next();
            k32 k32Var = uVar.a;
            Function2 function2 = uVar.b;
            x xVar = (x) k32Var.invoke(obj);
            x xVar2 = (x) k32Var.invoke(obj2);
            if ((xVar instanceof v) && (xVar2 instanceof v)) {
                if (((v) xVar).a == ((v) xVar2).a) {
                }
                z = false;
            } else {
                if ((xVar instanceof w) && (xVar2 instanceof w)) {
                    Object obj4 = ((w) xVar).a;
                    if (obj4 != null && (obj3 = ((w) xVar2).a) != null) {
                        z = function2 != null ? ((Boolean) function2.invoke(obj4, obj3)).booleanValue() : obj4.equals(obj3);
                    } else if (obj4 == null && ((w) xVar2).a == null) {
                    }
                }
                z = false;
            }
        } while (z);
        return false;
    }

    public final int b(int i, Object obj) {
        int hashCode;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            k32 k32Var = uVar.a;
            Function1 function1 = uVar.c;
            x xVar = (x) k32Var.invoke(obj);
            if (xVar instanceof v) {
                hashCode = ((v) xVar).a.hashCode();
            } else {
                if (!(xVar instanceof w)) {
                    b6e.s();
                    return 0;
                }
                if (function1 != null) {
                    hashCode = ((Number) function1.invoke(((w) xVar).a)).intValue();
                } else {
                    Object obj2 = ((w) xVar).a;
                    hashCode = obj2 != null ? obj2.hashCode() : 0;
                }
            }
            i = (i * 31) + hashCode;
        }
        return i;
    }
}
