package com.yandex.passport.internal.report.diary;

import android.os.Bundle;
import defpackage.gld;
import defpackage.tf6;
import defpackage.x97;
import defpackage.y7b;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m0 {
    public final com.yandex.passport.internal.flags.i a;
    public final com.yandex.passport.common.a b;
    public final e0 c;
    public final b0 d;
    public final tf6 e;

    public m0(com.yandex.passport.internal.flags.i iVar, com.yandex.passport.common.a aVar, e0 e0Var, b0 b0Var, com.yandex.passport.common.coroutine.a aVar2) {
        iVar.getClass();
        aVar.getClass();
        e0Var.getClass();
        b0Var.getClass();
        aVar2.getClass();
        this.a = iVar;
        this.b = aVar;
        this.c = e0Var;
        this.d = b0Var;
        this.e = gld.e(((com.yandex.passport.common.coroutine.b) aVar2).e);
    }

    public final void a(l0 l0Var, Bundle bundle, String str) {
        if (((Boolean) this.a.b(com.yandex.passport.internal.flags.o.G)).booleanValue()) {
            x97.y(this.e, null, null, new y7b(str, this, l0Var, bundle, (Continuation) null), 3);
        }
    }
}
