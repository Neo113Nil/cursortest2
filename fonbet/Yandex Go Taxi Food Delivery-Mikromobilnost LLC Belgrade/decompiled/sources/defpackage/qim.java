package defpackage;

import com.yandex.go.taxi.order.models.api.objects.Driver;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qim {
    public static final qim p = new qim(0);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;
    public final n7v h;
    public final n7v i;
    public final String j;
    public final String k;
    public final String l;
    public final Driver.KisArt m;
    public final List n;
    public final boolean o;

    public qim(String str, String str2, List list, String str3, List list2, String str4, String str5, n7v n7vVar, n7v n7vVar2, String str6, String str7, String str8, Driver.KisArt kisArt, List list3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = list2;
        this.f = str4;
        this.g = str5;
        this.h = n7vVar;
        this.i = n7vVar2;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = kisArt;
        this.n = list3;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qim)) {
            return false;
        }
        qim qimVar = (qim) obj;
        return jl40.l(this.a, qimVar.a) && jl40.l(this.b, qimVar.b) && jl40.l(this.c, qimVar.c) && jl40.l(this.d, qimVar.d) && jl40.l(this.e, qimVar.e) && jl40.l(this.f, qimVar.f) && jl40.l(this.g, qimVar.g) && jl40.l(this.h, qimVar.h) && jl40.l(this.i, qimVar.i) && jl40.l(this.j, qimVar.j) && jl40.l(this.k, qimVar.k) && jl40.l(this.l, qimVar.l) && jl40.l(this.m, qimVar.m) && jl40.l(this.n, qimVar.n) && this.o == qimVar.o;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.i.hashCode() + ((this.h.hashCode() + unr0.b(unr0.b(unr0.c(unr0.b(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k);
        String str = this.l;
        return Boolean.hashCode(this.o) + unr0.c((this.m.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("DriverModel(fullName=", this.a, ", phone=", this.b, ", profileFacts=");
        oyr.D(", rating=", this.d, ", feedbackBadges=", v, this.c);
        oyr.D(", shortName=", this.f, ", statusTitle=", v, this.e);
        v.append(this.g);
        v.append(", profilePhoto=");
        v.append(this.h);
        v.append(", avatarImage=");
        v.append(this.i);
        v.append(", carrierName=");
        v.append(this.j);
        v.append(", fullCarInfo=");
        g8e.D(v, this.k, ", carNumber=", this.l, ", kisArt=");
        v.append(this.m);
        v.append(", extraItems=");
        v.append(this.n);
        v.append(", detailsUnavailable=");
        return x4e.i(v, this.o, Extension.C_BRAKE);
    }

    public qim() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ qim(int i) {
        this("", "", r3, "", r3, "", "", r8, r8, "", "", null, r13, r3, false);
        n7v n7vVar = n7v.f;
        Driver.KisArt kisArt = Driver.KisArt.c;
        EmptyList emptyList = EmptyList.a;
    }
}
