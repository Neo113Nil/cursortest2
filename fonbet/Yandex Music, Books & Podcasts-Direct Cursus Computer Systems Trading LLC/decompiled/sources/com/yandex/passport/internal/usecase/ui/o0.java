package com.yandex.passport.internal.usecase.ui;

import defpackage.k5r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 {
    public final com.yandex.passport.internal.ui.domik.e a;
    public final boolean b;
    public final Function2 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    public o0(com.yandex.passport.internal.ui.domik.e eVar, boolean z, Function2 function2, Function1 function1, Function1 function12, Function1 function13) {
        eVar.getClass();
        this.a = eVar;
        this.b = z;
        this.c = function2;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.a, o0Var.a) && this.b == o0Var.b && this.c.equals(o0Var.c) && this.d.equals(o0Var.d) && this.e.equals(o0Var.e) && this.f.equals(o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.e(this.a.hashCode() * 961, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Params(track=" + this.a + ", country=null, authBySms=" + this.b + ", onSmsRequested=" + this.c + ", onPhoneConfirmed=" + this.d + ", onError=" + this.e + ", onProgress=" + this.f + ')';
    }
}
