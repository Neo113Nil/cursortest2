package com.yandex.plus.divkit.impl;

import android.net.Uri;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.bd8;
import defpackage.eg8;
import defpackage.fb1;
import defpackage.ln1;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.w0a;
import defpackage.wj9;
import defpackage.xzb;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c extends eg8 {
    public final com.yandex.plus.bdui.plus.content.controller.j a;
    public final com.yandex.plus.log.api.b b;

    public c(com.yandex.plus.bdui.plus.content.controller.j jVar, com.yandex.plus.log.api.b bVar) {
        jVar.getClass();
        bVar.getClass();
        this.a = jVar;
        this.b = bVar;
    }

    @Override // defpackage.eg8
    public final boolean a(bd8 bd8Var, w0a w0aVar, xzb xzbVar) {
        bd8Var.getClass();
        w0aVar.getClass();
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DivActionHandlerImpl", "handleAction(action=" + r1.s(bd8Var, xzbVar) + ')');
        }
        return f(xzbVar, w0aVar, new com.yandex.plus.bdui.content.b(10, bd8Var, xzbVar)) || super.a(bd8Var, w0aVar, xzbVar);
    }

    @Override // defpackage.eg8
    public final boolean b(wj9 wj9Var, w0a w0aVar, xzb xzbVar) {
        w0aVar.getClass();
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DivActionHandlerImpl", "handleAction(sightAction=" + r1.t(wj9Var, xzbVar) + ')');
        }
        return f(xzbVar, w0aVar, new com.yandex.plus.bdui.content.b(11, wj9Var, xzbVar)) || super.b(wj9Var, w0aVar, xzbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(xzb xzbVar, w0a w0aVar, Function0 function0) {
        Object t7oVar;
        Object obj;
        com.yandex.plus.divkit.api.a aVar;
        int hashCode;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (com.yandex.plus.divkit.api.a) function0.invoke();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        com.yandex.plus.bdui.plus.content.controller.j jVar = this.a;
        if (a != null) {
            com.yandex.plus.divkit.api.b bVar = a instanceof com.yandex.plus.divkit.api.b ? (com.yandex.plus.divkit.api.b) a : null;
            if (bVar != null) {
                w0aVar.getView().getClass();
                jVar.getClass();
                com.yandex.plus.bdui.plus.content.controller.r rVar = jVar.a.o;
                if (rVar != null) {
                    com.yandex.passport.internal.entities.j jVar2 = jVar.b;
                    com.yandex.plus.bdui.content.d dVar = rVar.a;
                    dVar.getClass();
                    String str = bVar.a;
                    com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) jVar2.e;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusDivContentController.ActionHandler", "handelError(); urlExpression = " + str);
                    }
                    if (str != null) {
                        if (str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            Uri parse = Uri.parse(str);
                            String scheme = parse.getScheme();
                            if (scheme == null || ((hashCode = scheme.hashCode()) == -1742751287 ? !scheme.equals("plus-action") : !(hashCode == -631075305 && scheme.equals("plus-handler")))) {
                                obj = null;
                                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                                if (bVar2.b(aVar3)) {
                                    bVar2.c(aVar3, "PlusDivContentController.ActionHandler", "handleError(); unknown action uri scheme = " + parse.getScheme());
                                }
                            } else {
                                com.yandex.plus.bdui.action.a a2 = ((com.yandex.plus.bdui.plus.checkout.o) jVar2.b).a(bVar);
                                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                                if (bVar2.b(aVar4)) {
                                    bVar2.c(aVar4, "PlusDivContentController.ActionHandler", "handleError(); dispatch onErrorAction = " + a2);
                                }
                                com.yandex.plus.bdui.action.c cVar = ((com.yandex.plus.bdui.m) jVar2.a).a;
                                com.yandex.plus.bdui.action.h hVar = new com.yandex.plus.bdui.action.h(dVar.c);
                                obj = null;
                                cVar.a(a2, hVar, null);
                            }
                            if (t7oVar instanceof t7o) {
                                t7oVar = obj;
                            }
                            aVar = (com.yandex.plus.divkit.api.a) t7oVar;
                            if (aVar != null) {
                                return false;
                            }
                            n K = u.K(xzbVar, this.b, "DivActionHandlerImpl");
                            w0aVar.getView().getClass();
                            jVar.getClass();
                            com.yandex.plus.bdui.plus.content.controller.l lVar = jVar.a;
                            com.yandex.plus.bdui.plus.content.controller.r rVar2 = lVar.o;
                            if (rVar2 == null) {
                                return false;
                            }
                            com.yandex.passport.internal.entities.j jVar3 = jVar.b;
                            com.yandex.plus.bdui.plus.content.controller.e eVar = lVar.n;
                            com.yandex.plus.bdui.content.d dVar2 = rVar2.a;
                            tf6 tf6Var = rVar2.c;
                            dVar2.getClass();
                            String scheme2 = aVar.a.getScheme();
                            if (scheme2 == null) {
                                return false;
                            }
                            int hashCode2 = scheme2.hashCode();
                            if (hashCode2 != -1742751287) {
                                if (hashCode2 != -631075305 || !scheme2.equals("plus-handler")) {
                                    return false;
                                }
                                jVar3.v(eVar, aVar.a, aVar.b, K, new ln1(jVar3, dVar2, aVar, K, tf6Var));
                            } else {
                                if (!scheme2.equals("plus-action")) {
                                    return false;
                                }
                                jVar3.v(eVar, aVar.a, aVar.b, K, new fb1(18, jVar3, dVar2, aVar));
                            }
                            return true;
                        }
                    }
                }
            }
        }
        obj = null;
        if (t7oVar instanceof t7o) {
        }
        aVar = (com.yandex.plus.divkit.api.a) t7oVar;
        if (aVar != null) {
        }
    }
}
