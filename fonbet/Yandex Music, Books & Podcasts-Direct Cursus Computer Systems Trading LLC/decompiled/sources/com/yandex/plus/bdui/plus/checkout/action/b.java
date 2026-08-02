package com.yandex.plus.bdui.plus.checkout.action;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.report.we;
import com.yandex.plus.bdui.action.i;
import defpackage.tf6;
import defpackage.x97;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b implements com.yandex.plus.bdui.action.d {
    public final /* synthetic */ int a;
    public final p b;
    public final tf6 c;
    public final com.yandex.plus.log.api.b d;

    public b(p pVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar, int i) {
        this.a = i;
        bVar.getClass();
        switch (i) {
            case 1:
                this.b = pVar;
                this.c = tf6Var;
                this.d = bVar;
                break;
            case 2:
                this.b = pVar;
                this.c = tf6Var;
                this.d = bVar;
                break;
            default:
                this.b = pVar;
                this.c = tf6Var;
                this.d = bVar;
                break;
        }
    }

    @Override // com.yandex.plus.bdui.action.d
    public final void a(com.yandex.plus.bdui.action.a aVar, i iVar) {
        switch (this.a) {
            case 0:
                c cVar = (c) aVar;
                cVar.getClass();
                x97.y(this.c, null, null, new we(this, cVar, iVar, (Continuation) null, 23), 3);
                break;
            case 1:
                d dVar = (d) aVar;
                dVar.getClass();
                x97.y(this.c, null, null, new we(this, dVar, iVar, (Continuation) null, 24), 3);
                break;
            default:
                e eVar = (e) aVar;
                eVar.getClass();
                x97.y(this.c, null, null, new we(this, eVar, iVar, (Continuation) null, 25), 3);
                break;
        }
    }
}
