package ru.yandex.taxi.logistics.utils;

import com.yandex.go.navigation.screen.c;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.tje;
import defpackage.x5s0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final class a {
    public final c a;
    public final hit b;

    public a(c cVar, hit hitVar) {
        this.a = cVar;
        this.b = hitVar;
    }

    public static void a(a aVar, x5s0 x5s0Var) {
        hbp0 hbp0Var = aVar.b.a;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        aVar.getClass();
        tje.N(hbp0Var, null, coroutineStart, new ScreenChangedListener$doOnScreenChanged$1(x5s0Var, aVar, null), 1);
    }
}
