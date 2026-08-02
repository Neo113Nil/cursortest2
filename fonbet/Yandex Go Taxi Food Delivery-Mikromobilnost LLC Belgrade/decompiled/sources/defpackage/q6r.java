package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

@gsq0
/* loaded from: classes9.dex */
public final class q6r {
    public static final p6r Companion = new p6r();
    public static final i3y[] n;
    public final Action a;
    public final zzs b;
    public final String c;
    public final LocationProvider d;
    public final PositionInitAction e;
    public final v03 f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final kd7 m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{a.b(lazyThreadSafetyMode, new wmq(28)), null, null, a.b(lazyThreadSafetyMode, new wmq(29)), a.b(lazyThreadSafetyMode, new n6r(0)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ q6r(int i, Action action, zzs zzsVar, String str, LocationProvider locationProvider, PositionInitAction positionInitAction, v03 v03Var, String str2, String str3, boolean z, String str4, String str5, boolean z2, kd7 kd7Var) {
        if (959 != (i & 959)) {
            qje.Z(i, 959, o6r.a.getDescriptor());
            throw null;
        }
        this.a = action;
        this.b = zzsVar;
        this.c = str;
        this.d = locationProvider;
        this.e = positionInitAction;
        this.f = v03Var;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        this.h = str3;
        this.i = z;
        this.j = str4;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        this.l = (i & 2048) == 0 ? false : z2;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = kd7Var;
        }
    }

    public static q6r a(q6r q6rVar, kd7 kd7Var) {
        Action action = q6rVar.a;
        zzs zzsVar = q6rVar.b;
        String str = q6rVar.c;
        LocationProvider locationProvider = q6rVar.d;
        PositionInitAction positionInitAction = q6rVar.e;
        v03 v03Var = q6rVar.f;
        String str2 = q6rVar.g;
        String str3 = q6rVar.h;
        boolean z = q6rVar.i;
        String str4 = q6rVar.j;
        String str5 = q6rVar.k;
        boolean z2 = q6rVar.l;
        q6rVar.getClass();
        return new q6r(action, zzsVar, str, locationProvider, positionInitAction, v03Var, str2, str3, z, str4, str5, z2, kd7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6r)) {
            return false;
        }
        q6r q6rVar = (q6r) obj;
        return this.a == q6rVar.a && jl40.l(this.b, q6rVar.b) && jl40.l(this.c, q6rVar.c) && this.d == q6rVar.d && this.e == q6rVar.e && jl40.l(this.f, q6rVar.f) && jl40.l(this.g, q6rVar.g) && jl40.l(this.h, q6rVar.h) && this.i == q6rVar.i && jl40.l(this.j, q6rVar.j) && jl40.l(this.k, q6rVar.k) && this.l == q6rVar.l && jl40.l(this.m, q6rVar.m);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        LocationProvider locationProvider = this.d;
        int hashCode2 = (hashCode + (locationProvider == null ? 0 : locationProvider.hashCode())) * 31;
        PositionInitAction positionInitAction = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (positionInitAction == null ? 0 : positionInitAction.hashCode())) * 31)) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int b2 = unr0.b(unr0.e((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.j);
        String str4 = this.k;
        int e = unr0.e((b2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l);
        kd7 kd7Var = this.m;
        return e + (kd7Var != null ? kd7Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinalSuggestParams(action=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", positionUpdateTime=");
        sb.append(this.c);
        sb.append(", positionLocationProvider=");
        sb.append(this.d);
        sb.append(", positionInitAction=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", entrance=");
        g8e.D(sb, this.g, ", prevLog=", this.h, ", sticky=");
        unr0.A(", type=", this.j, ", layersLog=", sb, this.i);
        tse0.y(this.k, ", geoTap=", ", typedExperiments=", sb, this.l);
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public q6r(Action action, zzs zzsVar, String str, LocationProvider locationProvider, PositionInitAction positionInitAction, v03 v03Var, String str2, String str3, boolean z, String str4, String str5, boolean z2, kd7 kd7Var) {
        this.a = action;
        this.b = zzsVar;
        this.c = str;
        this.d = locationProvider;
        this.e = positionInitAction;
        this.f = v03Var;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = str4;
        this.k = str5;
        this.l = z2;
        this.m = kd7Var;
    }
}
