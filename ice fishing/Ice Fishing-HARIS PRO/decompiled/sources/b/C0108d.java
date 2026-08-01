package b;

import Z.C;
import android.content.Intent;
import android.os.Bundle;
import d.C0124a;
import d.C0125b;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2268a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2269b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2270c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2271d = new ArrayList();
    public final transient HashMap e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2272f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2273g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f2268a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0125b c0125b = (C0125b) this.e.get(str);
        if (c0125b != null) {
            C c2 = c0125b.f2829a;
            if (this.f2271d.contains(str)) {
                c2.a(c0125b.f2830b.e0(i2, intent));
                this.f2271d.remove(str);
                return true;
            }
        }
        this.f2272f.remove(str);
        this.f2273g.putParcelable(str, new C0124a(i2, intent));
        return true;
    }

    public final F.i b(String str, R.j jVar, C c2) {
        int i;
        HashMap hashMap;
        HashMap hashMap2 = this.f2269b;
        if (((Integer) hashMap2.get(str)) == null) {
            F1.e.f258a.getClass();
            int nextInt = F1.e.f259b.a().nextInt(2147418112);
            while (true) {
                i = nextInt + 65536;
                hashMap = this.f2268a;
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    break;
                }
                F1.e.f258a.getClass();
                nextInt = F1.e.f259b.a().nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i), str);
            hashMap2.put(str, Integer.valueOf(i));
        }
        this.e.put(str, new C0125b(c2, jVar));
        HashMap hashMap3 = this.f2272f;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            c2.a(obj);
        }
        Bundle bundle = this.f2273g;
        C0124a c0124a = (C0124a) bundle.getParcelable(str);
        if (c0124a != null) {
            bundle.remove(str);
            c2.a(jVar.e0(c0124a.f2827a, c0124a.f2828b));
        }
        return new F.i(this, str, 8, false);
    }
}
