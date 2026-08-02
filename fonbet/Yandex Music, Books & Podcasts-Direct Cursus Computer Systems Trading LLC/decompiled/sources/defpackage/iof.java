package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class iof {
    public final List a;
    public final ayg b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final mk0 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final gk0 q;
    public final pt0 r;
    public final hk0 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final ozw w;
    public final gs4 x;
    public final int y;

    public iof(List list, ayg aygVar, String str, long j, int i, long j2, String str2, List list2, mk0 mk0Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, gk0 gk0Var, pt0 pt0Var, List list3, int i5, hk0 hk0Var, boolean z, ozw ozwVar, gs4 gs4Var, int i6) {
        this.a = list;
        this.b = aygVar;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = mk0Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = gk0Var;
        this.r = pt0Var;
        this.t = list3;
        this.u = i5;
        this.s = hk0Var;
        this.v = z;
        this.w = ozwVar;
        this.x = gs4Var;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder k = dfi.k(str);
        k.append(this.c);
        k.append(StringUtil.LF);
        long j = this.f;
        ayg aygVar = this.b;
        iof iofVar = (iof) aygVar.i.c(j);
        if (iofVar != null) {
            k.append("\t\tParents: ");
            k.append(iofVar.c);
            for (iof iofVar2 = (iof) aygVar.i.c(iofVar.f); iofVar2 != null; iofVar2 = (iof) aygVar.i.c(iofVar2.f)) {
                k.append("->");
                k.append(iofVar2.c);
            }
            k.append(str);
            k.append(StringUtil.LF);
        }
        List list = this.h;
        if (!list.isEmpty()) {
            k.append(str);
            k.append("\tMasks: ");
            k.append(list.size());
            k.append(StringUtil.LF);
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            k.append(str);
            k.append("\tBackground: ");
            k.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            k.append(str);
            k.append("\tShapes:\n");
            for (Object obj : list2) {
                k.append(str);
                k.append("\t\t");
                k.append(obj);
                k.append(StringUtil.LF);
            }
        }
        return k.toString();
    }

    public final String toString() {
        return a("");
    }
}
