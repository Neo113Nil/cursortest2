package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.b6;
import defpackage.tf6;
import defpackage.ub7;
import defpackage.zsd;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class n extends b6 {
    public final /* synthetic */ int d = 0;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.yandex.passport.internal.sloth.performers.webcard.g gVar) {
        super(6, (byte) 0);
        gVar.getClass();
        this.e = gVar;
    }

    @Override // defpackage.wc3
    public final void invoke() {
        switch (this.d) {
            case 0:
                n(k.a);
                zsd.r0((tf6) this.c, new ub7(12, ((com.yandex.passport.internal.sloth.performers.webcard.g) this.e).a, new com.yandex.passport.internal.storage.a(this, null, 25)));
                break;
            default:
                com.yandex.passport.sloth.c1 c1Var = (com.yandex.passport.sloth.c1) ((com.yandex.passport.sloth.ui.a1) this.e);
                Continuation continuation = null;
                ub7 ub7Var = new ub7(12, c1Var.b(), new com.yandex.passport.sloth.ui.q(this, continuation, 1));
                tf6 tf6Var = (tf6) this.c;
                zsd.r0(tf6Var, ub7Var);
                zsd.r0(tf6Var, new ub7(12, c1Var.b.c.b, new com.yandex.passport.sloth.ui.q(this, continuation, 2)));
                break;
        }
    }

    public n(com.yandex.passport.sloth.ui.a1 a1Var) {
        super(6, (byte) 0);
        this.e = a1Var;
    }
}
