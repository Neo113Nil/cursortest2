package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;

/* loaded from: classes6.dex */
public final class zg40 {
    public static final zg40 g = new zg40((String) null, (String) null, (String) null, (Map) null, (MtScheduleScenario) null, HProv.PP_DELETE_SAVED_PASSWD);
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final MtScheduleScenario e;
    public final boolean f;

    public /* synthetic */ zg40(String str, String str2, String str3, Map map, MtScheduleScenario mtScheduleScenario, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 16) != 0 ? b.f() : map, (i & 32) != 0 ? MtScheduleScenario.UNKNOWN : mtScheduleScenario, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    public static zg40 a(zg40 zg40Var, String str, String str2, String str3, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            str = zg40Var.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = zg40Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = zg40Var.c;
        }
        String str6 = str3;
        zg40Var.getClass();
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i & 16) != 0) {
            linkedHashMap2 = zg40Var.d;
        }
        MtScheduleScenario mtScheduleScenario = zg40Var.e;
        boolean z = zg40Var.f;
        zg40Var.getClass();
        return new zg40(str4, str5, str6, linkedHashMap2, mtScheduleScenario, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg40)) {
            return false;
        }
        zg40 zg40Var = (zg40) obj;
        return jl40.l(this.a, zg40Var.a) && jl40.l(this.b, zg40Var.b) && jl40.l(this.c, zg40Var.c) && jl40.l(this.d, zg40Var.d) && this.e == zg40Var.e && this.f == zg40Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + unr0.d((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 961, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainSchedulerRequestPayload(date=", this.a, ", startingStopId=", this.b, ", destinationStopId=");
        v.append(this.c);
        v.append(", lineId=null, selectedFilterIds=");
        v.append(this.d);
        v.append(", scenario=");
        v.append(this.e);
        v.append(", includeUnpurchasableTrips=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public zg40(String str, String str2, String str3, Map map, MtScheduleScenario mtScheduleScenario, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = mtScheduleScenario;
        this.f = z;
    }
}
