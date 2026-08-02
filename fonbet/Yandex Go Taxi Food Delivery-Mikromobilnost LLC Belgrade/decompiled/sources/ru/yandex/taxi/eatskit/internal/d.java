package ru.yandex.taxi.eatskit.internal;

import android.net.Uri;
import defpackage.ccn;
import defpackage.f0t;
import defpackage.l0t;
import defpackage.vmx;
import kotlin.Pair;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;

/* loaded from: classes5.dex */
public final class d extends ccn {
    public final /* synthetic */ int f = 1;

    public d(f0t f0tVar) {
        super("geoPoint", new l0t(f0tVar, GeoPointSource.FROM_GEO), EatsEvent$SetGeoPoint$1.b);
    }

    @Override // defpackage.ccn
    public Pair a() {
        int i = this.f;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new Pair("superappPushData", vmx.a.a().c(obj, ExternalServiceData.Companion.serializer()));
            case 1:
            default:
                return super.a();
            case 2:
                return new Pair("themeVariantKey", obj);
        }
    }

    @Override // defpackage.ccn
    public void b(Uri.Builder builder) {
        switch (this.f) {
            case 1:
                Object obj = this.b;
                if (((l0t) obj).b != null && ((l0t) obj).c != null) {
                    builder.appendQueryParameter("lat", String.valueOf(((l0t) obj).b.doubleValue()));
                    builder.appendQueryParameter("lon", String.valueOf(((l0t) obj).c.doubleValue()));
                    break;
                }
                break;
            default:
                super.b(builder);
                break;
        }
    }

    public d(ExternalServiceData externalServiceData) {
        super("pushData", externalServiceData, EatsEvent$Push$1.b);
    }

    public d(String str) {
        super("themeState", str, EatsEvent$SetTheme$1.b);
    }
}
