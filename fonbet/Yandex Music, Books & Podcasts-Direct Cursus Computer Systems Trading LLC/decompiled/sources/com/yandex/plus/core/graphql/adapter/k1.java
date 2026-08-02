package com.yandex.plus.core.graphql.adapter;

import com.connectsdk.device.ConnectableDevice;
import com.yandex.plus.core.graphql.fragment.i9;
import com.yandex.plus.core.graphql.fragment.j9;
import com.yandex.plus.core.graphql.fragment.l9;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class k1 implements pj {
    public static final k1 a = new k1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.w1 w1Var = (com.yandex.plus.core.graphql.w1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w1Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, w1Var.a);
        List list = j9.a;
        i9 i9Var = w1Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        i9Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, i9Var.a);
        r7fVar.Z("name");
        tjVar.a(r7fVar, fx6Var, i9Var.b);
        r7fVar.Z("sectionGroups");
        l9 l9Var = l9.a;
        ArrayList arrayList = i9Var.c;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            l9Var.a(r7fVar, fx6Var, obj2);
            r7fVar.p();
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        i9 c = j9.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.w1(str, c);
    }
}
