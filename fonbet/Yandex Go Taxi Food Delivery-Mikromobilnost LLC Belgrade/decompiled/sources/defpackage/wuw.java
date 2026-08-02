package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwuw;", "Lj530;", "Lxuw;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class wuw extends j530 {
    public final IntrinsicSize a;
    public final boolean b = true;
    public final tls c;

    public wuw(IntrinsicSize intrinsicSize, tls tlsVar) {
        this.a = intrinsicSize;
        this.c = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        xuw xuwVar = new xuw();
        xuwVar.a = this.a;
        xuwVar.b = this.b;
        return xuwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wuw wuwVar = obj instanceof wuw ? (wuw) obj : null;
        return wuwVar != null && this.a == wuwVar.a && this.b == wuwVar.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        xuw xuwVar = (xuw) e530Var;
        xuwVar.a = this.a;
        xuwVar.b = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
