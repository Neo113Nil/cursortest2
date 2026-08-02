package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ah implements defpackage.pj {
    public static final List a = t75.c("metrics");

    public static yg c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        while (true) {
            ArrayList arrayList = null;
            while (a7fVar.z0(a) == 0) {
                zg zgVar = zg.a;
                defpackage.tj tjVar = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(zgVar, false), 0);
                if (a7fVar.peek() == 10) {
                    break;
                }
                arrayList = j8gVar.c(a7fVar, fx6Var);
            }
            return new yg(arrayList);
            a7fVar.w();
        }
    }
}
