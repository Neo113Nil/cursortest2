package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ho implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "text", "textColor", "isBold", "isItalic");

    public static eo c(a7f a7fVar, fx6 fx6Var) {
        Boolean bool;
        Object obj;
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        fo foVar = null;
        Boolean bool3 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                bool = bool2;
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                bool = bool2;
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                Boolean bool4 = bool2;
                Boolean bool5 = bool3;
                jo joVar = jo.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(joVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar.b(a7fVar, fx6Var);
                }
                foVar = (fo) obj;
                bool2 = bool4;
                bool3 = bool5;
            } else if (z0 == 3) {
                bool2 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
            } else {
                if (z0 != 4) {
                    Boolean bool6 = bool2;
                    str.getClass();
                    str2.getClass();
                    bool6.getClass();
                    Boolean bool7 = bool3;
                    boolean booleanValue = bool6.booleanValue();
                    bool7.getClass();
                    return new eo(str, str2, foVar, booleanValue, bool7.booleanValue());
                }
                bool = bool2;
                bool3 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
            }
            bool2 = bool;
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, eo eoVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        eoVar.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, eoVar.a);
        r7fVar.Z("text");
        tjVar.a(r7fVar, fx6Var, eoVar.b);
        r7fVar.Z("textColor");
        qhj qhjVar = new qhj(jo.a, true);
        fo foVar = eoVar.c;
        if (foVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, foVar);
        }
        r7fVar.Z("isBold");
        defpackage.tj tjVar2 = defpackage.uj.f;
        tjVar2.a(r7fVar, fx6Var, Boolean.valueOf(eoVar.d));
        r7fVar.Z("isItalic");
        tjVar2.a(r7fVar, fx6Var, Boolean.valueOf(eoVar.e));
    }
}
