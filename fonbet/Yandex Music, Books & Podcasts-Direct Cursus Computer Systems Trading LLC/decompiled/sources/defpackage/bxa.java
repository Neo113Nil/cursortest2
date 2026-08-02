package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bxa extends zwa {
    public final xdr k;
    public final x0q l;
    public final x0q m;
    public final xdr n;
    public final x0q o;
    public final x0q p;

    public bxa(fva fvaVar) {
        boolean z;
        wua wuaVar;
        boolean z2 = fvaVar.a;
        boolean z3 = fvaVar.b;
        String str = fvaVar.c;
        String str2 = fvaVar.d;
        boolean z4 = fvaVar.e;
        String str3 = fvaVar.f;
        String str4 = fvaVar.g;
        eva evaVar = fvaVar.h;
        String str5 = evaVar.a;
        dva dvaVar = evaVar.b;
        wua wuaVar2 = new wua(str5, new vua(dvaVar.a, dvaVar.b), evaVar.c, evaVar.d);
        eva evaVar2 = fvaVar.i;
        if (evaVar2 != null) {
            String str6 = evaVar2.a;
            dva dvaVar2 = evaVar2.b;
            z = z2;
            wuaVar = new wua(str6, new vua(dvaVar2.a, dvaVar2.b), evaVar2.c, evaVar2.d);
        } else {
            z = z2;
            wuaVar = null;
        }
        xdr a = ydr.a(new iwa(z, z3, str, str2, z4, str3, str4, wuaVar2, wuaVar, fvaVar.j, fvaVar.k, fvaVar.l, fvaVar.m, fvaVar.n, fvaVar.o, fvaVar.p, fvaVar.q));
        this.k = a;
        x0q b = y0q.b(0, 0, null, 7);
        this.l = b;
        x0q b2 = y0q.b(0, 0, null, 7);
        this.m = b2;
        this.n = a;
        this.o = b;
        this.p = b2;
    }

    @Override // defpackage.zwa
    public final void G() {
        O(this.l, twa.a);
    }

    @Override // defpackage.zwa
    public final void H() {
        O(this.l, uwa.a);
    }

    @Override // defpackage.zwa
    public final x0q J() {
        return this.p;
    }

    @Override // defpackage.zwa
    public final xdr K() {
        return this.n;
    }

    @Override // defpackage.zwa
    public final x0q L() {
        return this.o;
    }

    @Override // defpackage.zwa
    public final void M() {
        O(this.l, vwa.a);
    }

    @Override // defpackage.zwa
    public final void N() {
        xdr xdrVar = this.k;
        xdrVar.getClass();
        xdrVar.m(null, jwa.a);
        O(this.m, yua.a);
    }

    public final void O(x0q x0qVar, Object obj) {
        x97.y(ot0.F(this), null, null, new axa(x0qVar, obj, null), 3);
    }

    @Override // defpackage.zwa
    public final void a(vua vuaVar) {
        vuaVar.getClass();
        String str = vuaVar.a;
        String str2 = vuaVar.b;
        Uri parse = Uri.parse(str);
        parse.getClass();
        G();
        boolean d = Intrinsics.d(parse.getScheme(), "dynamic-overlay");
        x0q x0qVar = this.m;
        if (!d) {
            O(x0qVar, new ava(str, str2));
            return;
        }
        O(x0qVar, new zua(str2));
        String authority = parse.getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode == -1289167206) {
                if (authority.equals("expand")) {
                    H();
                }
            } else if (hashCode == -51086988) {
                if (authority.equals("half-expand")) {
                    M();
                }
            } else if (hashCode == 94756344 && authority.equals("close")) {
                G();
            }
        }
    }
}
