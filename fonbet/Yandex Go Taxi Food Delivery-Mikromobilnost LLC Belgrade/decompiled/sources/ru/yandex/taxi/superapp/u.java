package ru.yandex.taxi.superapp;

import android.content.Context;
import defpackage.a7z;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.i3w;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.y50;
import ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus;

/* loaded from: classes6.dex */
public final class u {
    public static final ck7 f = new ck7(new a7z(LocationAvailabilityStatus.AVAILABLE), null);
    public static final ck7 g = new ck7(new a7z(LocationAvailabilityStatus.NOT_AVAILABLE), null);
    public final Context a;
    public final tt2 b;
    public final y50 c;
    public final ru.yandex.taxi.systemrequeirements.location.f d;
    public final tse e;

    public u(Context context, tt2 tt2Var, y50 y50Var, ru.yandex.taxi.systemrequeirements.location.f fVar, tse tseVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = y50Var;
        this.d = fVar;
        this.e = tseVar;
    }

    public final void a(i3w i3wVar, gcn gcnVar) {
        tje.N(this.e, null, null, new SuperAppSystemInfoDelegate$installedApplications$1(i3wVar, this, gcnVar, null), 3);
    }

    public final void b(gcn gcnVar) {
        tje.N(this.e, null, null, new SuperAppSystemInfoDelegate$requestLocationAvailability$1(this, gcnVar, null), 3);
    }
}
