package ru.yandex.taxi.notification;

import android.content.Context;
import defpackage.d6i;
import defpackage.h55;
import defpackage.qq80;
import defpackage.tj60;
import defpackage.tje;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final Context D;
    public final tj60 E;
    public final d6i F;

    public a(Context context, tj60 tj60Var, d6i d6iVar) {
        super(null);
        this.D = context;
        this.E = tj60Var;
        this.F = d6iVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new SaveToFavoriteNotificationRouter$onLaunch$1(this, (qq80) obj, null), 3);
    }
}
