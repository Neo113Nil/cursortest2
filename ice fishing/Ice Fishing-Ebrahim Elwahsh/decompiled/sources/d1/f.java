package d1;

import N1.p;
import O2.w;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k1.C4628a;
import q2.E0;
import q2.R0;
import u2.i;
import v1.g;
import y1.C5221A;
import y1.C5228c;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;

/* loaded from: classes.dex */
public abstract class f implements e, InterfaceC5245t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37199n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f37200u;

    public /* synthetic */ f(int i, Object obj) {
        this.f37199n = i;
        this.f37200u = obj;
    }

    @Override // d1.e
    public List b() {
        return (List) this.f37200u;
    }

    @Override // d1.e
    public boolean c() {
        List list = (List) this.f37200u;
        return list.isEmpty() || (list.size() == 1 && ((C4628a) list.get(0)).c());
    }

    public void d(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            i.f(sb.toString());
        }
        ((E0) this.f37200u).f39922e.putString(str, str2);
    }

    public f e(Bundle bundle) {
        E0 e02 = (E0) this.f37200u;
        e02.getClass();
        e02.f39919b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            e02.f39921d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return g();
    }

    public void f(g gVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f37200u;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(gVar);
        }
    }

    public abstract f g();

    public void h(String str) {
        w.i(str, "Content URL must be non-null.");
        w.f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length > 512) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((E0) this.f37200u).f39924g = str;
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        return new C5228c(2, (C5221A) this.f37200u);
    }

    public void j(List list) {
        ArrayList arrayList = ((E0) this.f37200u).f39925h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                i.f("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    public abstract void k();

    public J3.a l() {
        return AbstractC3212fg.f30738a.a((R0) this.f37200u);
    }

    public String toString() {
        switch (this.f37199n) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f37200u;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(int i) {
        this.f37199n = i;
        switch (i) {
            case 2:
                this.f37200u = new R0(this);
                break;
            case 3:
                char[] cArr = p.f1976a;
                this.f37200u = new ArrayDeque(20);
                break;
            default:
                E0 e02 = new E0();
                this.f37200u = e02;
                e02.f39921d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
        }
    }
}
