package com.yandex.passport.data.network;

import defpackage.avf;
import defpackage.btf;
import defpackage.eg7;
import defpackage.jyr;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ohp;
import defpackage.q5f;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.w4f;
import defpackage.x4f;
import defpackage.xq0;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a implements t9f {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public a(com.yandex.plus.bdui.flex.factory.b bVar) {
        this.a = 1;
        this.b = btf.b(bVar);
        this.c = btf.b(new com.yandex.passport.sloth.command.data.k0(14));
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        w4f f;
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
                if (s4fVar == null || (f = s4fVar.f()) == null) {
                    xq0.q("Can be deserialized only by JSON");
                    return null;
                }
                com.yandex.passport.data.models.v vVar = com.yandex.passport.data.models.w.Companion;
                String obj = f.toString();
                ((com.yandex.passport.common.a) this.c).getClass();
                long a = com.yandex.passport.common.a.a();
                vVar.getClass();
                return com.yandex.passport.data.models.v.a(a, obj, null);
            case 1:
                eg7Var.getClass();
                return new com.yandex.plus.bdui.flex.action.e((com.yandex.plus.bdui.action.a) ((t9f) ((jyr) this.b).getValue()).deserialize(eg7Var), ((com.yandex.plus.bdui.flex.action.i) ((t9f) ((jyr) this.c).getValue()).deserialize(eg7Var)).a);
            default:
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.b;
                eg7Var.getClass();
                s4f s4fVar2 = eg7Var instanceof s4f ? (s4f) eg7Var : null;
                if (s4fVar2 == null) {
                    return null;
                }
                q5f f2 = x4f.f(s4fVar2.f());
                w4f w4fVar = (w4f) f2.get("payload");
                w4f w4fVar2 = (w4f) f2.get("type");
                String a2 = w4fVar2 != null ? x4f.g(w4fVar2).a() : null;
                if (a2 == null) {
                    return null;
                }
                switch (a2.hashCode()) {
                    case 77848963:
                        if (a2.equals("READY")) {
                            return com.yandex.plus.pay.ui.webview.family.domain.c.a;
                        }
                        return null;
                    case 1186731358:
                        if (a2.equals("READY_FOR_MESSAGES")) {
                            return com.yandex.plus.pay.ui.webview.family.domain.d.a;
                        }
                        return null;
                    case 1259672361:
                        if (!a2.equals("OPEN_NATIVE_SHARING") || w4fVar == null) {
                            return null;
                        }
                        q5f f3 = x4f.f(w4fVar);
                        w4f w4fVar3 = (w4f) f3.get("title");
                        String a3 = w4fVar3 != null ? x4f.g(w4fVar3).a() : null;
                        w4f w4fVar4 = (w4f) f3.get("text");
                        String a4 = w4fVar4 != null ? x4f.g(w4fVar4).a() : null;
                        w4f w4fVar5 = (w4f) f3.get("mimeType");
                        String a5 = w4fVar5 != null ? x4f.g(w4fVar5).a() : null;
                        if (a4 != null && !StringsKt.U(a4) && a5 != null && !StringsKt.U(a5)) {
                            return new com.yandex.plus.pay.ui.webview.family.domain.b(a3, a4, a5);
                        }
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                        if (!bVar.b(aVar)) {
                            return null;
                        }
                        bVar.c(aVar, "FamilyWebMessageDeserializer", "Expected text and mimeType to be not blank and not null for native sharing message");
                        return null;
                    case 1629401836:
                        if (!a2.equals("SEND_METRICS") || w4fVar == null) {
                            return null;
                        }
                        q5f f4 = x4f.f(w4fVar);
                        w4f w4fVar6 = (w4f) f4.get("EventName");
                        String a6 = w4fVar6 != null ? x4f.g(w4fVar6).a() : null;
                        w4f w4fVar7 = (w4f) f4.get("EventValue");
                        String a7 = w4fVar7 != null ? x4f.g(w4fVar7).a() : null;
                        if (a6 != null && !StringsKt.U(a6) && a7 != null && !StringsKt.U(a7)) {
                            return new com.yandex.plus.pay.ui.webview.family.domain.e(a6, a7);
                        }
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                        if (!bVar.b(aVar2)) {
                            return null;
                        }
                        bVar.c(aVar2, "FamilyWebMessageDeserializer", "Expected eventName and eventValue to be not blank and not null for send metrics message");
                        return null;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
            case 0:
                return (mhp) this.b;
            case 1:
                return ((t9f) ((jyr) this.b).getValue()).getDescriptor();
            default:
                return (ohp) this.c;
        }
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        switch (this.a) {
            case 0:
                com.yandex.passport.data.models.w wVar = (com.yandex.passport.data.models.w) obj;
                l6bVar.getClass();
                wVar.getClass();
                com.yandex.passport.data.models.w.Companion.serializer().serialize(l6bVar, wVar);
                return;
            case 1:
                com.yandex.plus.bdui.flex.action.e eVar = (com.yandex.plus.bdui.flex.action.e) obj;
                l6bVar.getClass();
                eVar.getClass();
                ((t9f) ((jyr) this.b).getValue()).serialize(l6bVar, eVar.a);
                t9f t9fVar = (t9f) ((jyr) this.c).getValue();
                Map map = eVar.b;
                t9fVar.serialize(l6bVar, new com.yandex.plus.bdui.flex.action.i(map != null ? com.yandex.plus.bdui.plus.analytics.b.L(map) : null));
                return;
            default:
                l6bVar.getClass();
                throw new UnsupportedOperationException("FamilyWebMessageDeserializer does not support serialization");
        }
    }

    public a(com.yandex.plus.log.api.b bVar) {
        this.a = 2;
        bVar.getClass();
        this.b = bVar;
        this.c = avf.w("FamilyWebMessage", new mhp[0]);
    }

    public a() {
        this.a = 0;
        this.b = com.yandex.passport.data.models.w.Companion.serializer().getDescriptor();
        this.c = new com.yandex.passport.common.a();
    }
}
