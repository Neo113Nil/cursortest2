package defpackage;

import androidx.compose.foundation.lazy.b;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class vs9 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ vs9(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        long e;
        int i = this.a;
        Object obj = null;
        b bVar = this.b;
        switch (i) {
            case 0:
                n6y n6yVar = (n6y) a.b0(bVar.j().k);
                return Integer.valueOf(n6yVar != null ? ((t6y) n6yVar).a : -1);
            case 1:
                return Float.valueOf((bVar.i() / 10000.0f) + bVar.h());
            case 2:
                return Boolean.valueOf(bVar.j.a());
            case 3:
                return bVar.j();
            case 4:
                return Boolean.valueOf(bVar.j.a());
            case 5:
                return bVar.j().k;
            case 6:
                return Integer.valueOf(bVar.j().n);
            case 7:
                return Integer.valueOf(bVar.j().n);
            case 8:
                return Integer.valueOf(bVar.j().n);
            case 9:
                return bVar.j();
            case 10:
                return Float.valueOf(bVar.b() ? 1.0f : 0.0f);
            case 11:
                if (bVar.h() == 0 && bVar.i() <= 4) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 12:
                return Integer.valueOf(bVar.i());
            case 13:
                return Boolean.valueOf(bVar.b());
            case 14:
                s6y j = bVar.j();
                int i2 = k0j0.a[j.o.ordinal()];
                if (i2 == 1) {
                    e = j.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    e = j.e() >> 32;
                }
                return Float.valueOf(((int) e) * 0.05f);
            case 15:
                return bVar.j().o;
            case 16:
                return Boolean.valueOf(bVar.h() > 0 || bVar.i() > 0);
            case 17:
                return Float.valueOf(bVar.e() ? 1.0f : 0.0f);
            case 18:
                s6y j2 = bVar.j();
                List list = j2.k;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        n6y n6yVar2 = (n6y) previous;
                        if (((t6y) n6yVar2).o + ((t6y) n6yVar2).p <= j2.m) {
                            obj = previous;
                        }
                    }
                }
                n6y n6yVar3 = (n6y) obj;
                return new Pair(Integer.valueOf(n6yVar3 != null ? ((t6y) n6yVar3).a : -1), Boolean.valueOf(bVar.j.a()));
            case 19:
                s6y j3 = bVar.j();
                n6y n6yVar4 = (n6y) a.b0(j3.k);
                if (n6yVar4 != null) {
                    t6y t6yVar = (t6y) n6yVar4;
                    if (t6yVar.a == j3.n - 1 && t6yVar.o + t6yVar.p <= j3.m) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
            case 20:
                return Boolean.valueOf(bVar.h() == 0);
            case 21:
                return Boolean.valueOf(!((((float) bVar.i()) / 10.0f) + ((float) bVar.h()) == 0.0f));
            case 22:
                if (((Boolean) bVar.j.e.getValue()).booleanValue()) {
                    return Boolean.FALSE;
                }
                if (((Boolean) bVar.j.f.getValue()).booleanValue()) {
                    return Boolean.TRUE;
                }
                return null;
            case 23:
                return Boolean.valueOf(bVar.b());
            case 24:
                return Boolean.valueOf(bVar.j.a());
            default:
                return Integer.valueOf(bVar.h());
        }
    }
}
