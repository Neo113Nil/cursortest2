package flex.section.divkit;

import defpackage.a5t0;
import defpackage.fjj;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.ivl;
import defpackage.jl40;
import defpackage.mw5;
import defpackage.n5o;
import defpackage.oyr;
import defpackage.q5o;
import defpackage.svl;
import defpackage.unr0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = svl.class)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lflex/section/divkit/DivkitSnippet;", "Companion", "jvl", "ivl", "divkit-section_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DivkitSnippet {
    public static final ivl Companion = new ivl();
    public final String a;
    public final n5o b;
    public final Map c;
    public final a5t0 d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final q5o j;
    public final String k;
    public final fjj l;
    public final mw5 m;

    public DivkitSnippet(String str, n5o n5oVar, Map map, a5t0 a5t0Var, List list, String str2, String str3, String str4, boolean z, q5o q5oVar, String str5, fjj fjjVar, mw5 mw5Var) {
        this.a = str;
        this.b = n5oVar;
        this.c = map;
        this.d = a5t0Var;
        this.e = list;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = q5oVar;
        this.k = str5;
        this.l = fjjVar;
        this.m = mw5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map] */
    public static DivkitSnippet a(DivkitSnippet divkitSnippet, String str, n5o n5oVar, LinkedHashMap linkedHashMap, int i) {
        String str2 = (i & 1) != 0 ? divkitSnippet.a : str;
        n5o n5oVar2 = (i & 2) != 0 ? divkitSnippet.b : n5oVar;
        LinkedHashMap linkedHashMap2 = (i & 4) != 0 ? divkitSnippet.c : linkedHashMap;
        a5t0 a5t0Var = divkitSnippet.d;
        List list = divkitSnippet.e;
        String str3 = divkitSnippet.f;
        String str4 = divkitSnippet.g;
        String str5 = divkitSnippet.h;
        boolean z = divkitSnippet.i;
        q5o q5oVar = divkitSnippet.j;
        String str6 = divkitSnippet.k;
        fjj fjjVar = divkitSnippet.l;
        mw5 mw5Var = divkitSnippet.m;
        divkitSnippet.getClass();
        return new DivkitSnippet(str2, n5oVar2, linkedHashMap2, a5t0Var, list, str3, str4, str5, z, q5oVar, str6, fjjVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DivkitSnippet.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        DivkitSnippet divkitSnippet = (DivkitSnippet) obj;
        return jl40.l(this.a, divkitSnippet.a) && jl40.l(this.b, divkitSnippet.b) && jl40.l(this.c, divkitSnippet.c) && jl40.l(this.d, divkitSnippet.d) && jl40.l(this.e, divkitSnippet.e) && jl40.l(this.f, divkitSnippet.f) && jl40.l(this.g, divkitSnippet.g) && jl40.l(this.h, divkitSnippet.h) && this.i == divkitSnippet.i && jl40.l(this.j, divkitSnippet.j) && jl40.l(this.k, divkitSnippet.k) && jl40.l(this.l, divkitSnippet.l) && jl40.l(this.m, divkitSnippet.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n5o n5oVar = this.b;
        int hashCode2 = (hashCode + (n5oVar != null ? n5oVar.hashCode() : 0)) * 31;
        Map map = this.c;
        int c = unr0.c((this.d.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31)) * 31, 31, this.e);
        String str = this.f;
        int hashCode3 = (c + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        int e = unr0.e((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i);
        q5o q5oVar = this.j;
        int hashCode5 = (e + (q5oVar != null ? q5oVar.hashCode() : 0)) * 31;
        String str4 = this.k;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        fjj fjjVar = this.l;
        int hashCode7 = (hashCode6 + (fjjVar != null ? fjjVar.hashCode() : 0)) * 31;
        mw5 mw5Var = this.m;
        return hashCode7 + (mw5Var != null ? mw5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivkitSnippet(id=");
        sb.append(this.a);
        sb.append(", divData=");
        sb.append(this.b);
        sb.append(", actions=");
        sb.append(this.c);
        sb.append(", layout=");
        sb.append(this.d);
        sb.append(", behaviour=");
        oyr.D(", divDataTag=", this.f, ", snippetRevision=", sb, this.e);
        g8e.D(sb, this.g, ", tag=", this.h, ", showOnActivate=");
        sb.append(this.i);
        sb.append(", divPatch=");
        sb.append(this.j);
        sb.append(", type=");
        sb.append(this.k);
        sb.append(", differ=");
        sb.append(this.l);
        sb.append(", bindingMethod=");
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
