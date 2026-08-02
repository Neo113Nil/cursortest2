package defpackage;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yac0 {
    public final boolean a;
    public final String b;
    public final float c;
    public final int d;
    public final long e;
    public final boolean f;
    public final String g;
    public final String h;
    public final List i;

    public yac0(boolean z, String str, float f, int i, long j, boolean z2, String str2, String str3, List list) {
        this.a = z;
        this.b = str;
        this.c = f;
        this.d = i;
        this.e = j;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = list;
    }

    public final wac0 a(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName) {
        Object obj = null;
        if (!this.a) {
            return null;
        }
        Iterator it = this.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((wac0) next).a == placesMapConfig$PlacesMapScreenName) {
                obj = next;
                break;
            }
        }
        return (wac0) obj;
    }

    public final boolean b(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName) {
        xac0 xac0Var;
        wac0 a = a(placesMapConfig$PlacesMapScreenName);
        return (a == null || (xac0Var = a.i) == null || !xac0Var.c) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yac0)) {
            return false;
        }
        yac0 yac0Var = (yac0) obj;
        return this.a == yac0Var.a && jl40.l(this.b, yac0Var.b) && Float.compare(this.c, yac0Var.c) == 0 && this.d == yac0Var.d && this.e == yac0Var.e && this.f == yac0Var.f && this.g.equals(yac0Var.g) && this.h.equals(yac0Var.h) && this.i.equals(yac0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + unr0.b(unr0.b(unr0.e(qv10.c(oyr.b(this.d, g8e.c(this.c, unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder v = ly3.v("PlacesMapConfig(isMapEnabled=", ", mapStyle=", this.b, ", defaultMapZoom=", this.a);
        v.append(this.c);
        v.append(", pinsQueueSize=");
        v.append(this.d);
        v.append(", mapDebounceIntervalMs=");
        v.append(this.e);
        v.append(", isOrganizationCardMapEnabled=");
        v.append(this.f);
        g8e.D(v, ", locationPermissionRequestTitle=", this.g, ", locationPermissionRequestBackButtonTitle=", this.h);
        v.append(", screenConfigs=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
