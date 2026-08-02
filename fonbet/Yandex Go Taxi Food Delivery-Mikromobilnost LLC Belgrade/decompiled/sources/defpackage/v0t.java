package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lv0t;", "Ln96;", "Lc6z;", "Companion", "u0t", "t0t", "share_favorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class v0t extends n96 implements c6z {
    public static final u0t Companion = new u0t();
    public static final i3y[] h = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new sss(5)), null, null, null, null};
    public static final v0t i = new v0t(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    public /* synthetic */ v0t(int i2, int i3, String str, String str2, Map map, boolean z, boolean z2) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        this.c = (i2 & 2) == 0 ? b.f() : map;
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && !evu0.J(d6z.Y(this, this.d)) && !evu0.J(d6z.Y(this, this.e)) && this.f > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0t)) {
            return false;
        }
        v0t v0tVar = (v0t) obj;
        return this.b == v0tVar.b && jl40.l(this.c, v0tVar.c) && jl40.l(this.d, v0tVar.d) && jl40.l(this.e, v0tVar.e) && this.f == v0tVar.f && this.g == v0tVar.g;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + oyr.b(this.f, unr0.b(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder l = nnm.l("GeoSharingBubbleExperiment(enabled=", ", l10n=", ", titleKey=", this.c, this.b);
        g8e.D(l, this.d, ", subtitleKey=", this.e, ", bubbleShowTime=");
        l.append(this.f);
        l.append(", showBubbleByGeoButtonClick=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public v0t() {
        this(0);
    }

    public v0t(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = 0;
        this.g = false;
    }
}
