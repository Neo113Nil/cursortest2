package ru.yandex.taxi.summary.personalaction.notification;

import defpackage.aq80;
import defpackage.m3b0;
import defpackage.tls;
import defpackage.v3b0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class PersonalActionNotificationComponentFactory$create$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        m3b0 m3b0Var = (m3b0) obj;
        a aVar = (a) this.receiver;
        ru.yandex.taxi.personalstate.data.remote.a aVar2 = aVar.c;
        aVar2.a.a(m3b0Var.f, m3b0Var.g, m3b0Var.h, "NotificationDismissed");
        aq80 aq80Var = aVar.b;
        ((v3b0) aq80Var.a).a.add(m3b0Var.f);
        return zy11.a;
    }
}
