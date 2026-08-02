package c8;

import com.google.android.gms.internal.ads.Wv;
import f8.q;
import java.util.ArrayList;
import java.util.HashSet;
import v7.C5125p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5798a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5799b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5800c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5801d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5802e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5803f = new ArrayList();

    public a(String str) {
        this.f5798a = str;
    }

    public static void a(a aVar, String str, q qVar) {
        C5125p c5125p = C5125p.f41221n;
        aVar.getClass();
        if (!aVar.f5800c.add(str)) {
            StringBuilder l9 = Wv.l("Element with name '", str, "' is already registered in ");
            l9.append(aVar.f5798a);
            throw new IllegalArgumentException(l9.toString().toString());
        }
        aVar.f5799b.add(str);
        aVar.f5801d.add(qVar);
        aVar.f5802e.add(c5125p);
        aVar.f5803f.add(false);
    }
}
