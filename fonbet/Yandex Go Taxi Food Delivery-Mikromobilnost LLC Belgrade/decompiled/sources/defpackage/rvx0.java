package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import ru.yandex.taxi.experiments.history.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class rvx0 {
    public final a a;
    public final h3y b;
    public final rs2 c;
    public final ru.yandex.taxi.settings.email.a d;
    public final h3y e;

    public rvx0(a aVar, h3y h3yVar, rs2 rs2Var, ru.yandex.taxi.settings.email.a aVar2, h3y h3yVar2) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = rs2Var;
        this.d = aVar2;
        this.e = h3yVar2;
    }

    public final void a(Uri.Builder builder) {
        Address address;
        ZoneAddress f = ((dqe0) this.e.get()).f();
        String zoneName = (f == null || (address = f.a) == null) ? null : address.getZoneName();
        String Ig = ((h) this.b.get()).Ig();
        ru.yandex.taxi.settings.email.a aVar = this.d;
        otr0.c(builder, Ig, aVar.c(), zoneName, ((Number) aVar.f.getValue(aVar, ru.yandex.taxi.settings.email.a.i[0])).intValue() == 1);
    }

    public final String b() {
        String Hg = ((h) this.b.get()).Hg();
        Uri.Builder buildUpon = Uri.parse(this.c.e()).buildUpon();
        buildUpon.appendQueryParameter("userId", Hg);
        a(buildUpon);
        return buildUpon.build().toString();
    }
}
