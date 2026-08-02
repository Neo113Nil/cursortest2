package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.morphlex.data.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qhr implements rhr {
    public final vlr a;
    public final tpr b;
    public final tpr c;
    public final boolean d;
    public final Integer e;
    public final tls f;
    public final boolean g;
    public final boolean h;
    public final Integer i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Integer m;
    public final String n;
    public final boolean o;

    public qhr(vlr vlrVar, tpr tprVar, d dVar, boolean z, Integer num, tls tlsVar, boolean z2, Integer num2, boolean z3, boolean z4, Integer num3, String str, phr phrVar, phr phrVar2, int i) {
        d dVar2 = (i & 8) != 0 ? null : dVar;
        boolean z5 = (i & 64) != 0 ? true : z;
        Integer num4 = (i & 128) != 0 ? null : num;
        tls dsgVar = (i & 512) != 0 ? new dsg(21) : tlsVar;
        boolean z6 = (i & 2048) == 0;
        boolean z7 = (i & 4096) != 0 ? false : z2;
        Integer num5 = (i & 8192) != 0 ? null : num2;
        boolean z8 = (i & 16384) != 0 ? true : z3;
        boolean z9 = (32768 & i) == 0;
        boolean z10 = (65536 & i) != 0 ? true : z4;
        Integer num6 = (131072 & i) != 0 ? null : num3;
        String str2 = (i & 262144) == 0 ? str : null;
        boolean z11 = (i & 524288) == 0;
        this.a = vlrVar;
        this.b = tprVar;
        this.c = dVar2;
        this.d = z5;
        this.e = num4;
        this.f = dsgVar;
        this.g = z6;
        this.h = z7;
        this.i = num5;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = num6;
        this.n = str2;
        this.o = z11;
    }

    @Override // defpackage.rhr
    public final tls b() {
        return this.f;
    }

    @Override // defpackage.rhr
    public final String c() {
        return this.n;
    }

    @Override // defpackage.rhr
    public final RecyclerView.g d() {
        return null;
    }

    @Override // defpackage.rhr
    public final boolean e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhr)) {
            return false;
        }
        qhr qhrVar = (qhr) obj;
        return this.a.equals(qhrVar.a) && jl40.l(this.b, qhrVar.b) && jl40.l(this.c, qhrVar.c) && Float.compare(1.0f, 1.0f) == 0 && this.d == qhrVar.d && jl40.l(this.e, qhrVar.e) && jl40.l(this.f, qhrVar.f) && this.g == qhrVar.g && this.h == qhrVar.h && jl40.l(this.i, qhrVar.i) && this.j == qhrVar.j && this.k == qhrVar.k && this.l == qhrVar.l && jl40.l(this.m, qhrVar.m) && jl40.l(this.n, qhrVar.n) && this.o == qhrVar.o && jl40.l(null, null) && jl40.l(null, null);
    }

    @Override // defpackage.rhr
    public final vlr f() {
        return this.a;
    }

    @Override // defpackage.rhr
    public final tpr getActions() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        tpr tprVar = this.c;
        int e = unr0.e(g8e.c(1.0f, (hashCode + (tprVar == null ? 0 : tprVar.hashCode())) * 961, 31), 31, this.d);
        Integer num = this.e;
        int e2 = unr0.e(unr0.e((msb1.H.hashCode() + ly3.a((e + (num == null ? 0 : num.hashCode())) * 961, 31, this.f)) * 31, 31, this.g), 31, this.h);
        Integer num2 = this.i;
        int e3 = unr0.e(unr0.e(unr0.e((e2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        Integer num3 = this.m;
        int hashCode2 = (e3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.n;
        return ((unr0.e((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.o) + 0) * 31) + 0;
    }

    public final String toString() {
        msb1 msb1Var = msb1.H;
        StringBuilder sb = new StringBuilder("Slidable(flexSdkConfig=");
        sb.append(this.a);
        sb.append(", onScrollListener=null, actions=");
        sb.append(this.b);
        sb.append(", isStatusBarLightFlow=");
        sb.append(this.c);
        sb.append(", contentBackgroundDrawable=null, anchorModalRatio=1.0, canDragToExpandFromAnchored=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        sb.append(this.e);
        sb.append(", closeButtonColor=null, actionHandler=");
        sb.append(this.f);
        sb.append(", closeButtonType=");
        sb.append(msb1Var);
        sb.append(", isArrowHidden=");
        sb.append(this.g);
        sb.append(", isMaxHeight=");
        sb.append(this.h);
        sb.append(", cornerRadius=");
        sb.append(this.i);
        sb.append(", closeOnTapOutside=");
        nnm.v(", passThroughTouchesOutsideSheet=", ", closeOnSlideDown=", sb, this.j, this.k);
        sb.append(this.l);
        sb.append(", minHeightPx=");
        sb.append(this.m);
        sb.append(", screenName=");
        tse0.y(this.n, ", canHandleScreenTracking=", ", startFab=", sb, this.o);
        sb.append((Object) null);
        sb.append(", endFab=");
        sb.append((Object) null);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
