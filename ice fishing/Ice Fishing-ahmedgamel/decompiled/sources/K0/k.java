package K0;

import J0.r;
import J0.w;
import S0.s;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends Z2.d {

    /* renamed from: l, reason: collision with root package name */
    public static final String f1627l = r.f("WorkContinuationImpl");

    /* renamed from: e, reason: collision with root package name */
    public final p f1628e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1629f;

    /* renamed from: g, reason: collision with root package name */
    public final List f1630g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1631h;
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f1632j;

    /* renamed from: k, reason: collision with root package name */
    public s f1633k;

    public k(p pVar, String str, List list) {
        this.f1628e = pVar;
        this.f1629f = str;
        this.f1630g = list;
        this.f1631h = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((J0.s) list.get(i)).f1434a.toString();
            kotlin.jvm.internal.h.d(uuid, "id.toString()");
            this.f1631h.add(uuid);
            this.i.add(uuid);
        }
    }

    public static HashSet t(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final w s() {
        if (this.f1632j) {
            r.d().g(f1627l, "Already enqueued work ids (" + TextUtils.join(", ", this.f1631h) + ")");
        } else {
            T0.d dVar = new T0.d(this);
            this.f1628e.f1644d.h(dVar);
            this.f1633k = dVar.f3114u;
        }
        return this.f1633k;
    }
}
