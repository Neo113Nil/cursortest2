package ru.yandex.taxi.settings.info.interactor;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.al10;
import defpackage.dqe0;
import defpackage.evu0;
import defpackage.uzs;
import defpackage.zls;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MenuInfoInteractor$state$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Address address;
        zzs B;
        Zone zone;
        Address address2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Location location = (Location) obj2;
        a aVar = (a) this.receiver;
        ZoneAddress f = ((dqe0) aVar.b.get()).f();
        zzs zzsVar = null;
        String zoneName = (f == null || (address2 = f.a) == null) ? null : address2.getZoneName();
        if (zoneName == null || evu0.J(zoneName)) {
            zoneName = null;
        }
        if (zoneName == null) {
            zoneName = (f == null || (zone = f.b) == null) ? null : zone.a;
        }
        if (f != null && (address = f.a) != null && (B = address.B()) != null) {
            zzsVar = B;
        } else if (location != null) {
            zzs.Companion.getClass();
            zzsVar = uzs.b(location);
        }
        aVar.d.getClass();
        boolean z = true;
        boolean z2 = (zoneName == null || evu0.J(zoneName)) ? false : true;
        if (booleanValue || (zzsVar == null && (zoneName == null || evu0.J(zoneName)))) {
            z = false;
        }
        return new al10(zzsVar, zoneName, z, z2);
    }
}
