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
public abstract class g7 implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "name", "iconUrl", "actions", "textStyle", C0479n3.g, "commonOverlays", "additionalData");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r2.getClass();
        r3.getClass();
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.b7(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b7 c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        a7 a7Var = null;
        x6 x6Var = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 2:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 3:
                    c7 c7Var = c7.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(c7Var, true);
                    a7fVar.m();
                    ArrayList arrayList3 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList3.add(qhjVar.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList = arrayList3;
                    break;
                case 4:
                    h7 h7Var = h7.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(h7Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar2.b(a7fVar, fx6Var);
                    }
                    a7Var = (a7) obj;
                    break;
                case 5:
                    d7 d7Var = d7.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(d7Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar3.b(a7fVar, fx6Var);
                    }
                    x6Var = (x6) obj2;
                    break;
                case 6:
                    f7 f7Var = f7.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    j8g j8gVar = new j8g(new qhj(f7Var, true), 0);
                    if (a7fVar.peek() != 10) {
                        arrayList2 = j8gVar.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList2 = null;
                        break;
                    }
                case 7:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
            }
        }
    }
}
