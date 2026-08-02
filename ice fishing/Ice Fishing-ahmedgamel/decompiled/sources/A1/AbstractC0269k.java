package A1;

import N3.InterfaceC0323a;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import h.C4543G;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m1.C4739a;
import s2.E0;

/* renamed from: A1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0269k implements y, InterfaceC0323a, f1.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f66n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f67u;

    public /* synthetic */ AbstractC0269k(int i, Object obj) {
        this.f66n = i;
        this.f67u = obj;
    }

    @Override // N3.InterfaceC0323a
    public void K(Bundle bundle) {
        ((C4543G) this.f67u).K(bundle);
    }

    @Override // N3.InterfaceC0323a
    public void O(Bundle bundle) {
        ((C4543G) this.f67u).O(bundle);
    }

    @Override // N3.InterfaceC0323a
    public void W(Bundle bundle) {
        ((C4543G) this.f67u).W(bundle);
    }

    @Override // f1.e
    public List b() {
        return (List) this.f67u;
    }

    @Override // f1.e
    public boolean c() {
        List list = (List) this.f67u;
        return list.isEmpty() || (list.size() == 1 && ((C4739a) list.get(0)).c());
    }

    public void d(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            x2.i.f(sb.toString());
        }
        ((E0) this.f67u).f40314e.putString(str, str2);
    }

    public AbstractC0269k e(Bundle bundle) {
        E0 e02 = (E0) this.f67u;
        e02.getClass();
        e02.f40311b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            e02.f40313d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return g();
    }

    public void f(x1.i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f67u;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    public abstract AbstractC0269k g();

    public void h(String str) {
        R2.w.i(str, "Content URL must be non-null.");
        R2.w.f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length > 512) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((E0) this.f67u).f40316g = str;
    }

    public void i(List list) {
        ArrayList arrayList = ((E0) this.f67u).f40317h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                x2.i.f("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    @Override // A1.y
    public x j(E e9) {
        return new C0261c(2, (H) this.f67u);
    }

    public abstract void k();

    public P3.a l() {
        return AbstractC3436jg.f32055a.a((r3.b) this.f67u);
    }

    public String toString() {
        switch (this.f66n) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f67u;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC0269k(int i) {
        this.f66n = i;
        switch (i) {
            case 4:
                this.f67u = new r3.b(this);
                break;
            case 5:
                char[] cArr = P1.p.f2376a;
                this.f67u = new ArrayDeque(20);
                break;
            default:
                E0 e02 = new E0();
                this.f67u = e02;
                e02.f40313d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
        }
    }
}
