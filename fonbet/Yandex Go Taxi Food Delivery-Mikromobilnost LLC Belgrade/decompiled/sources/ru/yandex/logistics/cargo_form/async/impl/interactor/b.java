package ru.yandex.logistics.cargo_form.async.impl.interactor;

import defpackage.ike;
import defpackage.l8x;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.st2;
import defpackage.tje;
import defpackage.v6s;
import defpackage.wa3;
import defpackage.wls;
import defpackage.ynn;
import defpackage.z2s;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes9.dex */
public final class b {
    public final ru.yandex.logistics.cargo_form.async.impl.data.a a;
    public final ru.yandex.logistics.cargo_form.async.impl.polling.a b;
    public final v6s c;
    public final com.yandex.delivery.utils.dialogmanager.a d;
    public final z2s e;
    public final ru.yandex.logistics.cargo_form.async.impl.storage.b f;
    public final ike g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public b(ru.yandex.logistics.cargo_form.async.impl.data.a aVar, st2 st2Var, ru.yandex.logistics.cargo_form.async.impl.polling.a aVar2, v6s v6sVar, com.yandex.delivery.utils.dialogmanager.a aVar3, z2s z2sVar, ru.yandex.logistics.cargo_form.async.impl.storage.b bVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = v6sVar;
        this.d = aVar3;
        this.e = z2sVar;
        this.f = bVar;
        this.g = qv10.e(st2Var.b);
    }

    public final void a(String str) {
        l8x l8xVar = (l8x) this.h.remove(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.c.b(str);
        tje.N(this.g, null, null, new FormAsyncInteractorImpl$cancelTask$1(this, str, null), 3);
    }

    public final void b(wa3 wa3Var) {
        c(wa3Var.a(), new FormAsyncInteractorImpl$launchAsyncProcess$1(wa3Var, this, null));
    }

    public final void c(String str, wls wlsVar) {
        pzt0 N = tje.N(this.g, null, CoroutineStart.LAZY, wlsVar, 1);
        l8x l8xVar = (l8x) this.h.put(str, N);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        N.w(new ynn(5, this, str, N));
        N.start();
    }

    public final void d(Object obj, String str) {
        c(str, new FormAsyncInteractorImpl$startPolling$1(this, str, obj, null));
    }
}
