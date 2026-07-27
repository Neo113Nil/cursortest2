package L3;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import g1.C4522b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k1.C4629a;
import q2.E0;
import y1.C5208c;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;

/* loaded from: classes2.dex */
public abstract class o implements InterfaceC0315a, d1.f, InterfaceC5224s {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1719n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1720u;

    public /* synthetic */ o(int i, Object obj) {
        this.f1719n = i;
        this.f1720u = obj;
    }

    @Override // L3.InterfaceC0315a
    public void L(Bundle bundle) {
        ((C4522b) this.f1720u).L(bundle);
    }

    @Override // L3.InterfaceC0315a
    public void O(Bundle bundle) {
        ((C4522b) this.f1720u).O(bundle);
    }

    @Override // L3.InterfaceC0315a
    public void W(Bundle bundle) {
        ((C4522b) this.f1720u).W(bundle);
    }

    @Override // d1.f
    public List b() {
        return (List) this.f1720u;
    }

    @Override // d1.f
    public boolean c() {
        List list = (List) this.f1720u;
        return list.isEmpty() || (list.size() == 1 && ((C4629a) list.get(0)).c());
    }

    public void d(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            v2.i.f(sb.toString());
        }
        ((E0) this.f1720u).f40012e.putString(str, str2);
    }

    public o e(Bundle bundle) {
        E0 e02 = (E0) this.f1720u;
        e02.getClass();
        e02.f40009b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            e02.f40011d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return g();
    }

    public void f(v1.g gVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1720u;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(gVar);
        }
    }

    public abstract o g();

    public void h(String str) {
        P2.w.i(str, "Content URL must be non-null.");
        P2.w.f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length > 512) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((E0) this.f1720u).f40014g = str;
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(y1.x xVar) {
        return new C5208c(2, (y1.z) this.f1720u);
    }

    public void j(List list) {
        ArrayList arrayList = ((E0) this.f1720u).f40015h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                v2.i.f("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    public abstract void k();

    public N3.a l() {
        return AbstractC3413jg.f31268a.a((p3.b) this.f1720u);
    }

    public String toString() {
        switch (this.f1719n) {
            case 1:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f1720u;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o(int i) {
        this.f1719n = i;
        switch (i) {
            case 3:
                this.f1720u = new p3.b(this);
                break;
            case 4:
                char[] cArr = N1.p.f1932a;
                this.f1720u = new ArrayDeque(20);
                break;
            default:
                E0 e02 = new E0();
                this.f1720u = e02;
                e02.f40011d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
        }
    }
}
