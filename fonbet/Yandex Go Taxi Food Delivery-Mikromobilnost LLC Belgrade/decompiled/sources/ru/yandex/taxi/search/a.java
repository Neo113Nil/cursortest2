package ru.yandex.taxi.search;

import android.content.Context;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.design.utils.b c;

    public a(Context context, tt2 tt2Var, ru.yandex.taxi.design.utils.b bVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = bVar;
    }

    public final Object a(SuspendLambda suspendLambda) {
        this.b.getClass();
        return tje.k0(uyj.a, new AddressBackgroundInteractor$getShadow$2(this, null), suspendLambda);
    }
}
