package ru.yandex.taxi.altpins.models;

import defpackage.jl40;
import defpackage.q47;
import defpackage.qy1;
import defpackage.svc;
import defpackage.unr0;
import defpackage.vy1;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map.WalkingRouteUiState;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final qy1 b;
    public final qy1 c;
    public final vy1 d;
    public final a e;
    public final WalkingRouteUiState f;
    public final OptionType g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(int i) {
        this("", r2, r2, vy1.e, new a(0), new WalkingRouteUiState(null, null, 0.0f, null, null, null, null, HProv.PP_VERSION_TIMESTAMP), OptionType.ORIGINAL);
        qy1 qy1Var = qy1.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d) && jl40.l(this.e, bVar.e) && jl40.l(this.f, bVar.f) && this.g == bVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ConfirmationScreen(title=" + this.a + ", alternativeBubble=" + this.b + ", destinationBubble=" + this.c + ", sourceBubble=" + this.d + ", modal=" + this.e + ", walkingRouteState=" + this.f + ", selectedOptionType=" + this.g + Extension.C_BRAKE;
    }

    public static final class a {
        public final q47 a;
        public final String b;
        public final svc c;

        public /* synthetic */ a(int i) {
            this(new q47((List) null, 3), "", svc.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Modal(buttons=" + this.a + ", title=" + this.b + ", comparisonBlock=" + this.c + Extension.C_BRAKE;
        }

        public a(q47 q47Var, String str, svc svcVar) {
            this.a = q47Var;
            this.b = str;
            this.c = svcVar;
        }

        public a() {
            this(0);
        }
    }

    public b(String str, qy1 qy1Var, qy1 qy1Var2, vy1 vy1Var, a aVar, WalkingRouteUiState walkingRouteUiState, OptionType optionType) {
        this.a = str;
        this.b = qy1Var;
        this.c = qy1Var2;
        this.d = vy1Var;
        this.e = aVar;
        this.f = walkingRouteUiState;
        this.g = optionType;
    }

    public b() {
        this(0);
    }
}
