package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.airplay.PListParser;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.jc3;
import defpackage.r0o;
import defpackage.u75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ym implements defpackage.pj {
    public static final List a = u75.h("__typename", "altText", PListParser.TAG_KEY);

    public static mm c(a7f a7fVar, fx6 fx6Var) {
        hm hmVar;
        im imVar;
        jm jmVar;
        km kmVar;
        a7fVar.getClass();
        fx6Var.getClass();
        lm lmVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    break;
                }
                str3 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("CheckoutTitleColorItem");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            hmVar = tm.c(a7fVar, fx6Var);
        } else {
            hmVar = null;
        }
        if (y2x.r(y2x.E("CheckoutTitleHighlightItem"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            imVar = um.c(a7fVar, fx6Var);
        } else {
            imVar = null;
        }
        if (y2x.r(y2x.E("CheckoutTitleIconItem"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            jmVar = vm.c(a7fVar, fx6Var);
        } else {
            jmVar = null;
        }
        if (y2x.r(y2x.E("CheckoutTitleLinkItem"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            kmVar = wm.c(a7fVar, fx6Var);
        } else {
            kmVar = null;
        }
        if (y2x.r(y2x.E("CheckoutTitleStrikeItem"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            lmVar = xm.c(a7fVar, fx6Var);
        }
        hm hmVar2 = hmVar;
        str2.getClass();
        str3.getClass();
        return new mm(str, str2, str3, hmVar2, imVar, jmVar, kmVar, lmVar);
    }
}
