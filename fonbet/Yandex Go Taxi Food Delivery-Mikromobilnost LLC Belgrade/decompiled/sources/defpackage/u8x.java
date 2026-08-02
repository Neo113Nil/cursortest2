package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.job.model.JobNetworkType;

/* loaded from: classes5.dex */
public final class u8x {
    public final String a;
    public final String b;
    public final Map c;
    public final JobNetworkType d;

    public u8x(String str, String str2, Map map, JobNetworkType jobNetworkType) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = jobNetworkType;
    }

    public static u8x a(u8x u8xVar, Map map) {
        return new u8x(u8xVar.a, u8xVar.b, map, u8xVar.d);
    }

    public final Map b() {
        return this.c;
    }

    public final JobNetworkType c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8x)) {
            return false;
        }
        u8x u8xVar = (u8x) obj;
        return this.a.equals(u8xVar.a) && this.b.equals(u8xVar.b) && this.c.equals(u8xVar.c) && this.d == u8xVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(unr0.b(qv10.c(this.a.hashCode() * 31, 31, 0L), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("JobScheduleRequest(tag=", this.a, ", delayMs=0, uniqueWorkName=", this.b, ", inputData=");
        v.append(this.c);
        v.append(", requiredNetworkType=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
