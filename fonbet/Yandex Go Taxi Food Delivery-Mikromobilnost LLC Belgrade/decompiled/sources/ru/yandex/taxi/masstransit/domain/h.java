package ru.yandex.taxi.masstransit.domain;

import android.content.Context;
import com.yandex.go.masstransit.design.ui_components.IconNotificationComponent;
import defpackage.dzg0;
import defpackage.fq30;
import defpackage.tje;
import defpackage.u8b1;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class h {
    public final fq30 a;

    public h(fq30 fq30Var) {
        this.a = fq30Var;
    }

    public final void a(CharSequence charSequence) {
        fq30 fq30Var = this.a;
        fq30Var.getClass();
        Context context = fq30Var.a;
        String uuid = UUID.randomUUID().toString();
        fq30Var.f.add(uuid);
        CharSequence charSequence2 = null;
        tje.N(fq30Var.d, null, null, new MtNotificationsRepository$showNotification$2(0L, fq30Var, new IconNotificationComponent(context, uuid, u8b1.h(dzg0.ic_check, fq30Var.a), charSequence, charSequence2, 16, null), 6000L, null), 3);
    }
}
