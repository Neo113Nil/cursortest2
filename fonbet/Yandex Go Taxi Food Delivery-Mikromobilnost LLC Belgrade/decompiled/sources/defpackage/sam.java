package defpackage;

import androidx.compose.ui.draw.a;
import androidx.compose.ui.draw.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsam;", "Lj530;", "Landroidx/compose/ui/draw/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class sam extends j530 {
    public final tls a;

    public sam(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new a(new b(), this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sam) {
            return this.a == ((sam) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        a aVar = (a) e530Var;
        aVar.c = this.a;
        aVar.E0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
