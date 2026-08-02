package ru.yandex.taxi.settings.main;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.acz;
import defpackage.bvf0;
import defpackage.dqe0;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.hit;
import defpackage.nni0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.uzs;
import defpackage.zzs;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class k {
    public final h3y a;
    public final acz b;
    public final nni0 c;
    public final ru.yandex.taxi.settings.email.a d;
    public final hit e;
    public final r0 f;
    public final gci0 g;
    public String h;
    public zzs i;
    public pzt0 j;

    public k(h3y h3yVar, acz aczVar, nni0 nni0Var, ru.yandex.taxi.settings.email.a aVar, hit hitVar) {
        this.a = h3yVar;
        this.b = aczVar;
        this.c = nni0Var;
        this.d = aVar;
        this.e = hitVar;
        r0 c = bvf0.c(NativeMenuState.CLOSED);
        this.f = c;
        this.g = kotlinx.coroutines.flow.e.d(c);
    }

    public final void a() {
        zzs zzsVar;
        ZoneAddress f = ((dqe0) this.a.get()).f();
        if (f != null) {
            Address address = f.a;
            this.h = address.getZoneName();
            this.i = address.B();
        } else {
            Location a = this.b.a();
            if (a != null) {
                zzs.Companion.getClass();
                zzsVar = uzs.b(a);
            } else {
                zzsVar = null;
            }
            this.i = zzsVar;
        }
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.j = tje.N(this.e.a, null, null, new NativeMenuStateRepositoryImpl$updateState$2(this, null), 3);
        this.d.d();
    }
}
