package com.yandex.plus.divkit.impl;

import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.axt;
import defpackage.b6e;
import defpackage.btf;
import defpackage.bxt;
import defpackage.bz9;
import defpackage.cxt;
import defpackage.dxt;
import defpackage.ext;
import defpackage.hxt;
import defpackage.ixt;
import defpackage.jyr;
import defpackage.kxt;
import defpackage.zwt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p {
    public final jyr a = btf.b(new s(14));

    public final void a(com.yandex.plus.divkit.api.p... pVarArr) {
        kxt ixtVar;
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (com.yandex.plus.divkit.api.p pVar : pVarArr) {
            pVar.getClass();
            if (pVar instanceof com.yandex.plus.divkit.api.i) {
                com.yandex.plus.divkit.api.i iVar = (com.yandex.plus.divkit.api.i) pVar;
                ixtVar = new axt(iVar.a, iVar.b);
            } else if (pVar instanceof com.yandex.plus.divkit.api.m) {
                com.yandex.plus.divkit.api.m mVar = (com.yandex.plus.divkit.api.m) pVar;
                ixtVar = new ext(mVar.a, mVar.b);
            } else if (pVar instanceof com.yandex.plus.divkit.api.l) {
                com.yandex.plus.divkit.api.l lVar = (com.yandex.plus.divkit.api.l) pVar;
                ixtVar = new dxt(lVar.a, lVar.b);
            } else if (pVar instanceof com.yandex.plus.divkit.api.n) {
                com.yandex.plus.divkit.api.n nVar = (com.yandex.plus.divkit.api.n) pVar;
                ixtVar = new hxt(nVar.a, nVar.b);
            } else if (pVar instanceof com.yandex.plus.divkit.api.h) {
                com.yandex.plus.divkit.api.h hVar = (com.yandex.plus.divkit.api.h) pVar;
                ixtVar = new zwt(hVar.a, new JSONArray((Collection) hVar.b));
            } else if (pVar instanceof com.yandex.plus.divkit.api.k) {
                com.yandex.plus.divkit.api.k kVar = (com.yandex.plus.divkit.api.k) pVar;
                ixtVar = new cxt(kVar.a, new JSONObject(kVar.b));
            } else if (pVar instanceof com.yandex.plus.divkit.api.j) {
                com.yandex.plus.divkit.api.j jVar = (com.yandex.plus.divkit.api.j) pVar;
                ixtVar = new bxt(jVar.a, jVar.b);
            } else if (!(pVar instanceof com.yandex.plus.divkit.api.o)) {
                b6e.s();
                return;
            } else {
                com.yandex.plus.divkit.api.o oVar = (com.yandex.plus.divkit.api.o) pVar;
                ixtVar = new ixt(oVar.b, oVar.a);
            }
            arrayList.add(ixtVar);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            bz9 bz9Var = (bz9) this.a.getValue();
            kxt[] kxtVarArr = (kxt[]) arrayList.toArray(new kxt[0]);
            bz9Var.f((kxt[]) Arrays.copyOf(kxtVarArr, kxtVarArr.length));
        }
    }
}
