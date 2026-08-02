package defpackage;

import com.yandex.go.shortcuts.impl.next.button.NextButtonAnalytics$ProceedButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u660 {
    public final NextButtonAnalytics$ProceedButtonType a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public u660(NextButtonAnalytics$ProceedButtonType nextButtonAnalytics$ProceedButtonType, boolean z, String str, boolean z2, String str2) {
        this.a = nextButtonAnalytics$ProceedButtonType;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = str2;
    }

    public final NextButtonAnalytics$ProceedButtonType a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u660)) {
            return false;
        }
        u660 u660Var = (u660) obj;
        return this.a == u660Var.a && this.b == u660Var.b && jl40.l(this.c, u660Var.c) && this.d == u660Var.d && jl40.l(this.e, u660Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsData(buttonType=");
        sb.append(this.a);
        sb.append(", skipReqDestinationInZone=");
        sb.append(this.b);
        sb.append(", mainScreenVersion=");
        tse0.y(this.c, ", isFlex=", ", screen=", sb, this.d);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
