package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.VehicleType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lq531;", "", "Companion", "o531", "p531", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class q531 {
    public static final p531 Companion = new p531();
    public static final i3y[] j = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(19)), null, null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final VehicleType d;
    public final String e;
    public final zzs f;
    public final z531 g;
    public final xmp h;
    public final String i;

    public /* synthetic */ q531(int i, String str, String str2, String str3, VehicleType vehicleType, String str4, zzs zzsVar, z531 z531Var, xmp xmpVar, String str5) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = VehicleType.SCOOTER;
        } else {
            this.d = vehicleType;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = zzsVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = z531Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = xmpVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
    }

    public q531() {
        VehicleType vehicleType = VehicleType.SCOOTER;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = vehicleType;
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
