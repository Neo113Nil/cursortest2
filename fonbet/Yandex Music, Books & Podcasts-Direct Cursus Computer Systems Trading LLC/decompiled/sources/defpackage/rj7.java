package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.decoder.flac.e;
import com.yandex.pulse.metrics.c;
import com.yandex.pulse.metrics.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class rj7 implements ycg, jo7, nds, c3i, myc, nn5, mag {
    public final /* synthetic */ int a;

    public /* synthetic */ rj7(int i) {
        this.a = i;
    }

    public static /* synthetic */ void f() {
        throw new fif();
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IndexOutOfBoundsException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void n(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Set l = rdkVar.l(m5n.a(ld2.class));
        sld sldVar = sld.c;
        if (sldVar == null) {
            synchronized (sld.class) {
                try {
                    sldVar = sld.c;
                    if (sldVar == null) {
                        sldVar = new sld(0);
                        sld.c = sldVar;
                    }
                } finally {
                }
            }
        }
        return new ht7(l, sldVar);
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        yvs yvsVar = (yvs) obj;
        yvsVar.getClass();
        Bundle bundle = new Bundle();
        String str = yvs.e;
        qsn qsnVar = yvsVar.b;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qsnVar.d);
        ude listIterator = qsnVar.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(((xvs) listIterator.next()).d());
        }
        bundle.putParcelableArrayList(str, arrayList);
        return bundle;
    }

    @Override // defpackage.mag
    public boolean b(List list) {
        switch (this.a) {
            case 21:
                if (list.size() >= 1) {
                }
                break;
            case 22:
                if (list.size() >= 1) {
                }
                break;
            case 23:
                if (list.size() >= 1) {
                }
                break;
            case 24:
                if (list.size() >= 1) {
                }
                break;
            case 25:
                if (list.size() >= 1) {
                }
                break;
            case 26:
                if (list.size() >= 1) {
                }
                break;
            case 27:
                if (list.size() >= 1) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (list.size() >= 1) {
                }
                break;
            default:
                if (list.size() >= 1) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.jo7
    public int c(mzb mzbVar) {
        return c.FINITE_SUM_FIELD_NUMBER;
    }

    public Constructor d() {
        switch (this.a) {
            case 1:
                Boolean bool = Boolean.TRUE;
                vm7 vm7Var = tgc.a;
                if (!bool.equals(tgc.class.getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                int i = e.k;
                return e.class.asSubclass(r2c.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r2c.class).getConstructor(null);
        }
    }

    @Override // defpackage.c3i
    public void h(u2i u2iVar) {
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        ((d80) obj).getClass();
    }

    @Override // defpackage.nds
    public void l(sv6 sv6Var) {
    }
}
