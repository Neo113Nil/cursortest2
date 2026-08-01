package androidx.navigation;

import D1.h;
import D1.i;
import S0.e;
import android.os.Bundle;
import f0.C0134C;
import f0.C0141f;
import f0.C0144i;
import f0.M;
import f0.N;
import f0.O;
import f0.w;
import f0.y;
import f0.z;
import h0.f;
import java.util.Iterator;
import java.util.List;

@M("navigation")
/* loaded from: classes.dex */
public class NavGraphNavigator extends N {

    /* renamed from: c, reason: collision with root package name */
    public final O f2069c;

    public NavGraphNavigator(O o2) {
        this.f2069c = o2;
    }

    @Override // f0.N
    public final w a() {
        return new y(this);
    }

    @Override // f0.N
    public final void d(List list, C0134C c0134c) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0141f c0141f = (C0141f) it.next();
            w wVar = c0141f.f2920b;
            i.c(wVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            y yVar = (y) wVar;
            Bundle e = c0141f.e();
            int i = yVar.f3000l;
            if (i == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = yVar.f2994h;
                if (i2 != 0) {
                    str = yVar.f2990c;
                    if (str == null) {
                        str = String.valueOf(i2);
                    }
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            w wVar2 = (w) yVar.f2999k.b(i);
            if (wVar2 == null) {
                if (yVar.f3001m == null) {
                    yVar.f3001m = String.valueOf(yVar.f3000l);
                }
                String str2 = yVar.f3001m;
                i.b(str2);
                throw new IllegalArgumentException(h.g("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            N b2 = this.f2069c.b(wVar2.f2988a);
            C0144i b3 = b();
            Bundle a2 = wVar2.a(e);
            z zVar = b3.f2939h;
            b2.d(f.s(e.e(zVar.f3005a, wVar2, a2, zVar.i(), zVar.f3016o)), c0134c);
        }
    }
}
