package ru.yandex.taxi.masstransit.utils;

import defpackage.a3v;
import defpackage.ah00;
import defpackage.b01;
import defpackage.bvf0;
import defpackage.sls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class a {
    public final ah00 a;
    public final a3v b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final b01 d = new b01(8, this);

    public a(ah00 ah00Var, a3v a3vVar) {
        this.a = ah00Var;
        this.b = a3vVar;
    }

    public final Object a(sls slsVar, SuspendLambda suspendLambda) {
        Object n = bvf0.n(new FocusRectWithUserInteractionDelegate$attach$2(this, slsVar, null), suspendLambda);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
