package ru.yandex.taxi.banners.data.remote;

import android.content.Context;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final tt2 b;

    public a(Context context, tt2 tt2Var) {
        this.a = context;
        this.b = tt2Var;
    }

    public final Object a(String str, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new LottieAnimationLoader$load$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
