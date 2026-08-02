package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lszv0;", "Lvn11;", "Lc6z;", "Companion", "rzv0", "qzv0", "pzv0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class szv0 implements vn11, c6z {
    public static final qzv0 Companion = new qzv0();
    public static final i3y[] l;
    public static final szv0 m;
    public final Map b;
    public final uwq0 c;
    public final uwq0 d;
    public final uwq0 e;
    public final uwq0 f;
    public final uwq0 g;
    public final uwq0 h;
    public final String i;
    public final boolean j;
    public final List k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{a.b(lazyThreadSafetyMode, new tsv0(13)), null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new tsv0(14))};
        m = new szv0(0);
    }

    public szv0(int i, Map map, uwq0 uwq0Var, uwq0 uwq0Var2, uwq0 uwq0Var3, uwq0 uwq0Var4, uwq0 uwq0Var5, uwq0 uwq0Var6, String str, boolean z, List list) {
        this.b = (i & 1) == 0 ? b.f() : map;
        if ((i & 2) == 0) {
            uwq0.Companion.getClass();
            this.c = uwq0.L;
        } else {
            this.c = uwq0Var;
        }
        if ((i & 4) == 0) {
            uwq0.Companion.getClass();
            this.d = uwq0.L;
        } else {
            this.d = uwq0Var2;
        }
        if ((i & 8) == 0) {
            uwq0.Companion.getClass();
            this.e = uwq0.L;
        } else {
            this.e = uwq0Var3;
        }
        if ((i & 16) == 0) {
            uwq0.Companion.getClass();
            this.f = uwq0.L;
        } else {
            this.f = uwq0Var4;
        }
        if ((i & 32) == 0) {
            uwq0.Companion.getClass();
            this.g = uwq0.L;
        } else {
            this.g = uwq0Var5;
        }
        if ((i & 64) == 0) {
            uwq0.Companion.getClass();
            this.h = uwq0.L;
        } else {
            this.h = uwq0Var6;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str;
        }
        if ((i & 256) == 0) {
            this.j = true;
        } else {
            this.j = z;
        }
        if ((i & 512) == 0) {
            this.k = EmptyList.a;
        } else {
            this.k = list;
        }
    }

    public final uwq0 a(String str) {
        Object obj;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((uwq0) obj).h, str)) {
                break;
            }
        }
        return (uwq0) obj;
    }

    public final List b() {
        List list = this.k;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        return scc.g(this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szv0)) {
            return false;
        }
        szv0 szv0Var = (szv0) obj;
        return jl40.l(this.b, szv0Var.b) && jl40.l(this.c, szv0Var.c) && jl40.l(this.d, szv0Var.d) && jl40.l(this.e, szv0Var.e) && jl40.l(this.f, szv0Var.f) && jl40.l(this.g, szv0Var.g) && jl40.l(this.h, szv0Var.h) && jl40.l(this.i, szv0Var.i) && this.j == szv0Var.j && jl40.l(this.k, szv0Var.k);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public final int hashCode() {
        return this.k.hashCode() + unr0.e(unr0.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "SuperAppExperiment(l10n=" + this.b + ", eatsParams=" + this.c + ", groceryParams=" + this.d + ", pharmacyParams=" + this.e + ", shopParams=" + this.f + ", marketParams=" + this.g + ", marketViewerParams=" + this.h + ", trackingApi=" + this.i + ", ignoreShortcutTypeForAnalytics=" + this.j + ", _services=" + this.k + Extension.C_BRAKE;
    }

    public szv0() {
        this(0);
    }

    public szv0(int i) {
        Map f = b.f();
        twq0 twq0Var = uwq0.Companion;
        twq0Var.getClass();
        uwq0 uwq0Var = uwq0.L;
        twq0Var.getClass();
        twq0Var.getClass();
        twq0Var.getClass();
        twq0Var.getClass();
        twq0Var.getClass();
        this.b = f;
        this.c = uwq0Var;
        this.d = uwq0Var;
        this.e = uwq0Var;
        this.f = uwq0Var;
        this.g = uwq0Var;
        this.h = uwq0Var;
        this.i = "";
        this.j = true;
        this.k = EmptyList.a;
    }
}
