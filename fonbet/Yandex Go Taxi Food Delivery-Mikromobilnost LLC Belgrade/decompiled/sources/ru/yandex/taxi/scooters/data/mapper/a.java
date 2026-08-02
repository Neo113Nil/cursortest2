package ru.yandex.taxi.scooters.data.mapper;

import com.yandex.go.scooters.api.domain.model.ScootersSessionType;
import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.cno0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.kqm0;
import defpackage.qqm0;
import defpackage.rhf;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vws0;
import defpackage.w511;
import defpackage.w6z;
import defpackage.y3b1;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.model.SessionOfferType;
import ru.yandex.taxi.scooters.data.model.VehicleType;

/* loaded from: classes9.dex */
public final class a {
    public final tt2 a;
    public final zuj0 b;
    public final cno0 c;
    public final h d;
    public final kqm0 e;

    public a(tt2 tt2Var, zuj0 zuj0Var, cno0 cno0Var, h hVar, kqm0 kqm0Var) {
        this.a = tt2Var;
        this.b = zuj0Var;
        this.c = cno0Var;
        this.d = hVar;
        this.e = kqm0Var;
    }

    public static zzs c(w6z w6zVar) {
        if (w6zVar == null) {
            w6zVar = null;
        }
        if (w6zVar == null || w6zVar.getA() == null || w6zVar.getB() == null) {
            return null;
        }
        return new zzs(w6zVar.getA().doubleValue(), w6zVar.getB().doubleValue(), 0, null, null, 28);
    }

    public static zzs d(String str) {
        List Y = evu0.Y(str, new char[]{HexString.CHAR_SPACE}, 0, 6);
        if (Y.size() != 2) {
            Y = null;
        }
        if (Y != null) {
            return new zzs(Double.parseDouble((String) kotlin.collections.a.Z(Y)), Double.parseDouble((String) kotlin.collections.a.P(Y)), 0, null, null, 28);
        }
        return null;
    }

    public static ScootersSessionType e(SessionOfferType sessionOfferType) {
        int i = sessionOfferType == null ? -1 : qqm0.b[sessionOfferType.ordinal()];
        return i != 1 ? i != 2 ? ScootersSessionType.UNKNOWN : ScootersSessionType.FIX_POINT : ScootersSessionType.STANDART_OFFER;
    }

    public static List f(List list) {
        if (list == null) {
            return EmptyList.a;
        }
        List<vws0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (vws0 vws0Var : list2) {
            int a = vws0Var.getA();
            com.yandex.go.scooters.api.domain.model.a aVar = ScootersSlowdown.Reason.Companion;
            String b = vws0Var.getB();
            aVar.getClass();
            arrayList.add(new ScootersSlowdown(a, com.yandex.go.scooters.api.domain.model.a.a(b)));
        }
        return arrayList;
    }

    public static ScootersVehicleType g(VehicleType vehicleType) {
        int i = vehicleType == null ? -1 : qqm0.c[vehicleType.ordinal()];
        if (i == -1) {
            return ScootersVehicleType.SCOOTER;
        }
        if (i == 1) {
            return ScootersVehicleType.BIKE;
        }
        if (i == 2) {
            return ScootersVehicleType.SCOOTER;
        }
        w511.b();
        return null;
    }

    public final Object a(rhf rhfVar, ContinuationImpl continuationImpl) {
        this.a.getClass();
        return tje.k0(uyj.a, new ScootersActiveOrdersMapper$mapCurrentSessionResponse$2(this, rhfVar, null), continuationImpl);
    }

    public final String b(fef fefVar, Integer num, String str) {
        if (fefVar == null || num == null) {
            return str;
        }
        return this.c.b(fefVar, "%s", y3b1.e(num));
    }
}
