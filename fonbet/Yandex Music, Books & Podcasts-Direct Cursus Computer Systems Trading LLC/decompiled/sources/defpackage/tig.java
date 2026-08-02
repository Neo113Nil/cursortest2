package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tig implements r04 {
    public final nrf a;
    public final String b;
    public final o43 c;
    public final ArrayList d;

    public tig(nrf nrfVar, String str, o43 o43Var, ArrayList arrayList) {
        gos gosVar = f73.b;
        this.a = nrfVar;
        this.b = str;
        this.c = o43Var;
        this.d = arrayList;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.r04
    public final o43 b() {
        return this.c;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return f73.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tig)) {
            return false;
        }
        tig tigVar = (tig) obj;
        if (!this.a.equals(tigVar.a)) {
            return false;
        }
        gos gosVar = f73.b;
        return Intrinsics.d(this.b, tigVar.b) && this.c.equals(tigVar.c) && this.d.equals(tigVar.d);
    }

    @Override // defpackage.r04
    public final String getDescription() {
        return null;
    }

    @Override // defpackage.r04
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int b = eta.b(f73.c, this.a.hashCode() * 31, 31);
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 961)) * 31);
    }

    public final String toString() {
        f73 f73Var = f73.c;
        StringBuilder sb = new StringBuilder("LocalCarouselBlock(meta=");
        sb.append(this.a);
        sb.append(", showPolicy=");
        sb.append(f73Var);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=null, viewAllAction=");
        sb.append(this.c);
        sb.append(", entities=");
        return vz1.t(sb, this.d, ")");
    }
}
