package com.yandex.plus.bdui.flex.ui.content;

import android.net.Uri;
import com.yandex.plus.bdui.plus.checkout.content.l;
import com.yandex.plus.bdui.plus.checkout.content.serializer.k5;
import com.yandex.plus.bdui.plus.checkout.content.serializer.z1;
import com.yandex.plus.bdui.plus.content.controller.m;
import com.yandex.plus.bdui.plus.content.i;
import com.yandex.plus.bdui.plus.content.j;
import com.yandex.plus.bdui.plus.content.k;
import com.yandex.plus.bdui.plus.content.serializer.i2;
import com.yandex.plus.bdui.plus.content.serializer.t0;
import com.yandex.plus.bdui.plus.webview.q;
import com.yandex.plus.bdui.query.h;
import com.yandex.pulse.metrics.o;
import defpackage.ee6;
import defpackage.ern;
import defpackage.jso;
import defpackage.sro;
import defpackage.t5a;
import defpackage.v3a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                ee6 ee6Var = (ee6) obj;
                ee6Var.getClass();
                return "Unsupported content type " + ern.a(ee6Var.c.getClass()) + '!';
            case 1:
                jso jsoVar = (jso) obj;
                jsoVar.getClass();
                t5a t5aVar = jsoVar.b;
                if (t5aVar != null) {
                    return com.yandex.plus.bdui.flex.utils.b.i(t5aVar);
                }
                return null;
            case 2:
                jso jsoVar2 = (jso) obj;
                jsoVar2.getClass();
                return new v3a(jsoVar2.a);
            case 3:
                jso jsoVar3 = (jso) obj;
                jsoVar3.getClass();
                sro sroVar = jsoVar3.c;
                sroVar.getClass();
                com.yandex.plus.bdui.flex.scaffold.a aVar = sroVar instanceof com.yandex.plus.bdui.flex.scaffold.a ? (com.yandex.plus.bdui.flex.scaffold.a) sroVar : null;
                com.yandex.plus.bdui.plus.scaffold.a aVar2 = aVar != null ? aVar.a : null;
                aVar2.getClass();
                return aVar2;
            case 4:
                jso jsoVar4 = (jso) obj;
                jsoVar4.getClass();
                return "Unsupported scaffold type " + ern.a(jsoVar4.c.getClass()) + '!';
            case 5:
                com.yandex.plus.bdui.plus.action.a aVar3 = (com.yandex.plus.bdui.plus.action.a) obj;
                aVar3.getClass();
                return (com.yandex.plus.bdui.query.g) aVar3.b.d(com.yandex.plus.bdui.plus.action.a.d[0]);
            case 6:
                return Integer.valueOf(h.b((com.yandex.plus.bdui.query.g) obj));
            case 7:
                ((q) obj).getClass();
                com.yandex.plus.webview.api.insets.a aVar4 = com.yandex.plus.webview.api.insets.a.c;
                return new com.yandex.plus.webview.api.contract.h(new com.yandex.plus.webview.api.insets.c(aVar4, aVar4, true));
            case 8:
                ((q) obj).getClass();
                com.yandex.plus.webview.api.insets.a aVar5 = com.yandex.plus.webview.api.insets.a.a;
                return new com.yandex.plus.webview.api.contract.h(new com.yandex.plus.webview.api.insets.c(aVar5, aVar5, true));
            case 9:
                l lVar = (l) obj;
                lVar.getClass();
                return (String) ((k5) lVar).b.d(k5.h[0]);
            case 10:
                l lVar2 = (l) obj;
                lVar2.getClass();
                return (String) ((k5) lVar2).c.d(k5.h[1]);
            case 11:
                l lVar3 = (l) obj;
                lVar3.getClass();
                return (String) ((k5) lVar3).d.d(k5.h[2]);
            case 12:
                l lVar4 = (l) obj;
                lVar4.getClass();
                return (String) ((k5) lVar4).e.d(k5.h[3]);
            case 13:
                l lVar5 = (l) obj;
                lVar5.getClass();
                return (String) ((k5) lVar5).f.d(k5.h[4]);
            case 14:
                z1 z1Var = (z1) obj;
                z1Var.getClass();
                return Boolean.valueOf(z1Var.b);
            case 15:
                z1 z1Var2 = (z1) obj;
                z1Var2.getClass();
                return z1Var2.i;
            case 16:
                return Unit.a;
            case 17:
                com.yandex.plus.bdui.plus.content.b bVar = (com.yandex.plus.bdui.plus.content.b) obj;
                bVar.getClass();
                return bVar.a();
            case 18:
                k kVar = (k) obj;
                kVar.getClass();
                return (String) ((i2) kVar).b.d(i2.f[0]);
            case 19:
                k kVar2 = (k) obj;
                kVar2.getClass();
                return (String) ((i2) kVar2).c.d(i2.f[1]);
            case 20:
                k kVar3 = (k) obj;
                kVar3.getClass();
                return (String) ((i2) kVar3).d.d(i2.f[2]);
            case 21:
                i iVar = (i) obj;
                iVar.getClass();
                return ((t0) iVar).c.a;
            case 22:
                i iVar2 = (i) obj;
                iVar2.getClass();
                return ((t0) iVar2).c.b;
            case 23:
                i iVar3 = (i) obj;
                iVar3.getClass();
                return ((t0) iVar3).c.c;
            case 24:
                com.yandex.plus.bdui.action.a aVar6 = (com.yandex.plus.bdui.action.a) obj;
                aVar6.getClass();
                if (aVar6 instanceof m) {
                    ((m) aVar6).a.invoke();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                com.yandex.plus.bdui.failure.d dVar = (com.yandex.plus.bdui.failure.d) obj;
                dVar.getClass();
                return new j(dVar);
            case 26:
                com.yandex.plus.bdui.plus.shared.e eVar = (com.yandex.plus.bdui.plus.shared.e) obj;
                eVar.getClass();
                return (Map) eVar.b.d(com.yandex.plus.bdui.plus.shared.e.d[0]);
            case 27:
                com.yandex.plus.bdui.plus.shared.g gVar = (com.yandex.plus.bdui.plus.shared.g) obj;
                gVar.getClass();
                return (Map) gVar.b.d(com.yandex.plus.bdui.plus.shared.g.d[0]);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Uri) obj).getClass();
                return Boolean.TRUE;
            default:
                com.yandex.plus.bdui.plus.webview.navigation.b bVar2 = (com.yandex.plus.bdui.plus.webview.navigation.b) obj;
                bVar2.getClass();
                return bVar2.a();
        }
    }

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
    }
}
