package ru.yandex.music.push.update;

import com.yandex.metrica.push.firebase.MetricaMessagingService;
import defpackage.hag;
import defpackage.jyr;
import defpackage.l18;
import defpackage.m1i;
import defpackage.n9k;
import defpackage.p4n;
import defpackage.s1n;
import defpackage.srr;
import defpackage.x97;
import defpackage.zun;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class YaMetricaMessagingService extends MetricaMessagingService {
    public final jyr a = l18.b.b(hag.I(p4n.class), true);

    @Override // com.yandex.metrica.push.firebase.MetricaMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(zun zunVar) {
        zunVar.getClass();
        super.onMessageReceived(zunVar);
        p4n p4nVar = (p4n) this.a.getValue();
        p4nVar.getClass();
        x97.y(p4nVar.h, null, null, new s1n(p4nVar, zunVar, (Continuation) null, 5), 3);
    }

    @Override // com.yandex.metrica.push.firebase.MetricaMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        super.onNewToken(str);
        p4n p4nVar = (p4n) this.a.getValue();
        p4nVar.getClass();
        p4nVar.a.a(false);
        n9k n9kVar = (n9k) p4nVar.c.getValue();
        x97.y(n9kVar.c, null, null, new m1i(n9kVar, null, 23), 3);
        ((srr) p4nVar.d.getValue()).b().q(str);
        if (str.length() == 0) {
            return;
        }
        p4nVar.f.g();
        x97.y(p4nVar.g, null, null, new s1n(p4nVar, str, (Continuation) null, 6), 3);
    }
}
