package defpackage;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tef {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final CurrentAddressModalExperiment.OnMapClickActionType e;
    public final s6u0 f;
    public final sef g;

    public tef(String str, String str2, String str3, String str4, CurrentAddressModalExperiment.OnMapClickActionType onMapClickActionType, s6u0 s6u0Var, sef sefVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = onMapClickActionType;
        this.f = s6u0Var;
        this.g = sefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tef)) {
            return false;
        }
        tef tefVar = (tef) obj;
        return this.a.equals(tefVar.a) && this.b.equals(tefVar.b) && this.c.equals(tefVar.c) && this.d.equals(tefVar.d) && this.e == tefVar.e && this.f.equals(tefVar.f) && this.g.equals(tefVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CurrentAddressModalContent(header=", this.a, ", saveLocationTitle=", this.b, ", changeLocationTitle=");
        g8e.D(v, this.c, ", shareLocationTitle=", this.d, ", onMapClickActionType=");
        v.append(this.e);
        v.append(", mapConfig=");
        v.append(this.f);
        v.append(", shareLocationInfo=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
