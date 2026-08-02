package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.b;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class w3y implements g5y {
    public final b a;

    public w3y(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.g5y
    public final int a() {
        int i;
        b bVar = this.a;
        int i2 = 0;
        if (bVar.g().m.isEmpty()) {
            return 0;
        }
        i4y g = bVar.g();
        Orientation orientation = g.q;
        Orientation orientation2 = Orientation.Vertical;
        int e = (int) (orientation == orientation2 ? g.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : g.e() >> 32);
        i4y g2 = bVar.g();
        Orientation orientation3 = g2.q;
        List list = g2.m;
        boolean z = orientation3 == orientation2;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                j4y j4yVar = (j4y) ((a4y) list.get(i3));
                int i6 = z ? j4yVar.u : j4yVar.v;
                if (i6 == -1) {
                    i3++;
                } else {
                    int i7 = 0;
                    while (i3 < list.size()) {
                        j4y j4yVar2 = (j4y) ((a4y) list.get(i3));
                        if ((z ? j4yVar2.u : j4yVar2.v) != i6) {
                            break;
                        }
                        i7 = Math.max(i7, (int) (z ? ((j4y) ((a4y) list.get(i3))).s & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : ((j4y) ((a4y) list.get(i3))).s >> 32));
                        i3++;
                    }
                    i4 += i7;
                    i5++;
                }
            }
            i2 = (i4 / i5) + g2.s;
        }
        if (i2 != 0 && (i = e / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.g5y
    public final int b() {
        return this.a.d.a.getIntValue();
    }

    @Override // defpackage.g5y
    public final boolean c() {
        return !this.a.g().m.isEmpty();
    }

    @Override // defpackage.g5y
    public final int d() {
        return ((j4y) ((a4y) a.Z(this.a.g().m))).a;
    }

    @Override // defpackage.g5y
    public final int getItemCount() {
        return this.a.g().p;
    }
}
