package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class nn implements defpackage.pj {
    public static final List a = u75.h("__typename", ConnectableDevice.KEY_ID, "name", "actions", "iconUrl", "title", "subtitle", "textStyle", C0479n3.g, "commonOverlays", "additionalData");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r4.getClass();
        r5.getClass();
        r6.getClass();
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.in(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static in c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        hn hnVar = null;
        en enVar = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 2:
                    str3 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 3:
                    jn jnVar = jn.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(jnVar, true);
                    a7fVar.m();
                    ArrayList arrayList3 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList3.add(qhjVar.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList = arrayList3;
                    break;
                case 4:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 5:
                    str5 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 6:
                    str6 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 7:
                    on onVar = on.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(onVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar2.b(a7fVar, fx6Var);
                    }
                    hnVar = (hn) obj;
                    break;
                case 8:
                    kn knVar = kn.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(knVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar3.b(a7fVar, fx6Var);
                    }
                    enVar = (en) obj2;
                    break;
                case 9:
                    mn mnVar = mn.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    j8g j8gVar = new j8g(new qhj(mnVar, true), 0);
                    if (a7fVar.peek() != 10) {
                        arrayList2 = j8gVar.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList2 = null;
                        break;
                    }
                case 10:
                    str7 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
            }
        }
    }
}
