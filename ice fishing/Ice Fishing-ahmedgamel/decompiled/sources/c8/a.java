package c8;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import f8.q;
import java.util.ArrayList;
import java.util.HashSet;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5622a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5623b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5624c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5625d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5626e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5627f = new ArrayList();

    public a(String str) {
        this.f5622a = str;
    }

    public static void a(a aVar, String str, q qVar) {
        C5135p c5135p = C5135p.f41442n;
        aVar.getClass();
        if (!aVar.f5624c.add(str)) {
            StringBuilder j6 = AbstractC4404f.j("Element with name '", str, "' is already registered in ");
            j6.append(aVar.f5622a);
            throw new IllegalArgumentException(j6.toString().toString());
        }
        aVar.f5623b.add(str);
        aVar.f5625d.add(qVar);
        aVar.f5626e.add(c5135p);
        aVar.f5627f.add(false);
    }
}
