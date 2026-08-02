package com.yandex.plus.bdui.plus.action;

import com.yandex.passport.internal.report.we;
import defpackage.dfi;
import defpackage.l1p;
import defpackage.tf6;
import defpackage.x97;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i implements com.yandex.plus.bdui.action.d {
    public final /* synthetic */ int a;
    public final tf6 b;
    public final com.yandex.plus.log.api.b c;

    public i(tf6 tf6Var, com.yandex.plus.log.api.b bVar, int i) {
        this.a = i;
        bVar.getClass();
        switch (i) {
            case 1:
                this.b = tf6Var;
                this.c = bVar;
                break;
            default:
                this.b = tf6Var;
                this.c = bVar;
                break;
        }
    }

    @Override // com.yandex.plus.bdui.action.d
    public final void a(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.i iVar) {
        switch (this.a) {
            case 0:
                h hVar = (h) aVar;
                hVar.getClass();
                long j = hVar.a;
                h hVar2 = j > 0 ? hVar : null;
                com.yandex.plus.log.api.b bVar = this.c;
                if (hVar2 == null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "PlusDelayActionHandler", dfi.e(j, "handle(); delay milliseconds = ", ", that is <= 0!"));
                        break;
                    }
                } else {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar3)) {
                        bVar.c(aVar3, "PlusDelayActionHandler", dfi.d(j, "handle(); delay milliseconds = "));
                    }
                    x97.y(this.b, null, null, new we(hVar2, this, iVar, (Continuation) null, 22), 3);
                    break;
                }
                break;
            default:
                l lVar = (l) aVar;
                lVar.getClass();
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar2 = this.c;
                if (bVar2.b(aVar4)) {
                    bVar2.c(aVar4, "PlusMultiActionHandler", "handle(); actions size = " + lVar.a().size());
                }
                Iterator it = lVar.a().iterator();
                while (it.hasNext()) {
                    com.yandex.plus.bdui.action.i iVar2 = iVar;
                    x97.y(this.b, null, null, new l1p(this, iVar2, (com.yandex.plus.bdui.action.a) it.next(), null, 26), 3);
                    iVar = iVar2;
                }
                break;
        }
    }
}
