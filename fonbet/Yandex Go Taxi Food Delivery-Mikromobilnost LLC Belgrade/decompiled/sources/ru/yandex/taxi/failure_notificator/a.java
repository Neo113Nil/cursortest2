package ru.yandex.taxi.failure_notificator;

import androidx.lifecycle.Lifecycle;
import defpackage.d9p;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = d9p.a[((Lifecycle.State) obj).ordinal()];
        b bVar = this.a;
        if (i == 1) {
            bVar.A = tje.N(bVar.x, null, null, new FailureNotificatorRepository$onCreated$1(bVar, null), 3);
        } else if (i == 2) {
            Object c = b.c(bVar, continuation);
            if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return c;
            }
        } else if (i != 3 && i != 4 && i != 5) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
