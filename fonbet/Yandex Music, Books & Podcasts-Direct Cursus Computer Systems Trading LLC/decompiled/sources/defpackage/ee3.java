package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class ee3 extends xv {
    public final String k;
    public final String l;
    public final StationId m;
    public final String n;
    public final String o;
    public final d85 p;
    public final d85 q;
    public final List r;

    public ee3(String str, String str2, StationId stationId, String str3, String str4, d85 d85Var, d85 d85Var2, List list) {
        str.getClass();
        stationId.getClass();
        list.getClass();
        this.k = str;
        this.l = str2;
        this.m = stationId;
        this.n = str3;
        this.o = str4;
        this.p = d85Var;
        this.q = d85Var2;
        this.r = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee3)) {
            return false;
        }
        ee3 ee3Var = (ee3) obj;
        return Intrinsics.d(this.k, ee3Var.k) && Intrinsics.d(this.l, ee3Var.l) && Intrinsics.d(this.m, ee3Var.m) && Intrinsics.d(this.n, ee3Var.n) && Intrinsics.d(this.o, ee3Var.o) && Intrinsics.d(this.p, ee3Var.p) && Intrinsics.d(this.q, ee3Var.q) && Intrinsics.d(this.r, ee3Var.r);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.k.hashCode() * 31;
        int i = 0;
        String str = this.l;
        int hashCode3 = (this.m.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d85 d85Var = this.p;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i2 = (hashCode5 + hashCode) * 31;
        d85 d85Var2 = this.q;
        if (d85Var2 != null) {
            long j2 = d85Var2.a;
            met metVar2 = net.b;
            i = Long.hashCode(j2);
        }
        return this.r.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveButton(title=", this.k, ", header=", this.l, ", stationId=");
        m.append(this.m);
        m.append(", imageUrl=");
        m.append(this.n);
        m.append(", bgImageUrl=");
        m.append(this.o);
        m.append(", bgColor=");
        m.append(this.p);
        m.append(", waveText=");
        m.append(this.q);
        m.append(", seeds=");
        m.append(this.r);
        m.append(")");
        return m.toString();
    }
}
