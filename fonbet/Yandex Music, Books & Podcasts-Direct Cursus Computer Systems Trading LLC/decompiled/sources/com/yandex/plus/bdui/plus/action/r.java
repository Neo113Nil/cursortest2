package com.yandex.plus.bdui.plus.action;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.my1;
import java.util.Map;

/* loaded from: classes4.dex */
public final class r implements com.yandex.plus.bdui.action.d {
    public final /* synthetic */ int a = 1;
    public final com.yandex.plus.log.api.b b;
    public final Object c;

    public r(Context context, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.c = context;
        this.b = bVar;
    }

    @Override // com.yandex.plus.bdui.action.d
    public final void a(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.i iVar) {
        com.yandex.plus.bdui.action.a a;
        Map a2;
        switch (this.a) {
            case 0:
                q qVar = (q) aVar;
                qVar.getClass();
                com.yandex.plus.bdui.action.h hVar = iVar.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar = this.b;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "PlusSharedActionHandler", "handle()");
                }
                Map map = iVar.d;
                com.yandex.plus.bdui.shared.b bVar2 = hVar.a;
                String str = qVar.a;
                try {
                    a2 = r1.a(bVar2);
                } catch (Throwable th) {
                    a = ((com.yandex.plus.bdui.plus.checkout.o) this.c).a(th);
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar3)) {
                        bVar.a(aVar3, "PlusSharedActionHandler", "getSharedAction(); shared action not found! Use onErrorAction = " + a + " instead", th);
                    }
                }
                if (a2 == null) {
                    throw new my1("Shared actions not found in shared data!");
                }
                a = (com.yandex.plus.bdui.action.a) a2.get(str);
                if (a == null) {
                    throw new my1("Shared action \"" + str + "\" not found in shared actions!");
                }
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "PlusSharedActionHandler", "getSharedAction(); shared action = " + a + " found");
                }
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar4)) {
                    bVar.c(aVar4, "PlusSharedActionHandler", "handle(); dispatch action = " + a + " with payload = " + map);
                }
                iVar.a.a.a(a, hVar, map);
                return;
            default:
                com.yandex.plus.bdui.plus.checkout.action.g gVar = (com.yandex.plus.bdui.plus.checkout.action.g) aVar;
                gVar.getClass();
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar3 = this.b;
                if (bVar3.b(aVar5)) {
                    bVar3.c(aVar5, "PlusPayShareActionHandler", "handle(); start sharing " + gVar);
                }
                Context context = (Context) this.c;
                String str2 = gVar.a;
                String str3 = gVar.b;
                String str4 = gVar.c;
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType(str4);
                    intent.putExtra("android.intent.extra.TITLE", str2);
                    intent.putExtra("android.intent.extra.TEXT", str3);
                    Intent createChooser = Intent.createChooser(intent, null);
                    createChooser.addFlags(268435456);
                    context.startActivity(createChooser);
                    return;
                } catch (ActivityNotFoundException e) {
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.e;
                    if (bVar3.b(aVar6)) {
                        bVar3.a(aVar6, "PlusPayShareActionHandler", "There is no intent handler for sharing", e);
                        return;
                    }
                    return;
                }
        }
    }

    public r(com.yandex.plus.bdui.plus.checkout.o oVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.c = oVar;
        this.b = bVar;
    }
}
