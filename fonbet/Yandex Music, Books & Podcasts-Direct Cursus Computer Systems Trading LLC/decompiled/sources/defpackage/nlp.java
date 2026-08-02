package defpackage;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nlp {
    public final cee a;
    public final qsn b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public nlp(mlp mlpVar) {
        this.a = cee.a(mlpVar.a);
        this.b = mlpVar.b.f();
        String str = mlpVar.d;
        int i = dvt.a;
        this.c = str;
        this.d = mlpVar.e;
        this.e = mlpVar.f;
        this.g = mlpVar.g;
        this.h = mlpVar.h;
        this.f = mlpVar.c;
        this.i = mlpVar.i;
        this.j = mlpVar.k;
        this.k = mlpVar.l;
        this.l = mlpVar.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nlp.class != obj.getClass()) {
            return false;
        }
        nlp nlpVar = (nlp) obj;
        if (this.f != nlpVar.f) {
            return false;
        }
        cee ceeVar = nlpVar.a;
        cee ceeVar2 = this.a;
        ceeVar2.getClass();
        return gdg.v(ceeVar, ceeVar2) && this.b.equals(nlpVar.b) && Objects.equals(this.d, nlpVar.d) && Objects.equals(this.c, nlpVar.c) && Objects.equals(this.e, nlpVar.e) && Objects.equals(this.l, nlpVar.l) && Objects.equals(this.g, nlpVar.g) && Objects.equals(this.j, nlpVar.j) && Objects.equals(this.k, nlpVar.k) && Objects.equals(this.h, nlpVar.h) && Objects.equals(this.i, nlpVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31;
        String str4 = this.l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
