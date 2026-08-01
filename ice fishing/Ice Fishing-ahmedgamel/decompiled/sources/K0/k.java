package K0;

import J0.s;
import J0.t;
import J0.x;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends com.bumptech.glide.e {

    /* renamed from: p, reason: collision with root package name */
    public static final String f1518p = s.f("WorkContinuationImpl");
    public final p i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1519j;

    /* renamed from: k, reason: collision with root package name */
    public final List f1520k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1521l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1522m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f1523n;

    /* renamed from: o, reason: collision with root package name */
    public C2991bm f1524o;

    public k(p pVar, String str, List list) {
        this.i = pVar;
        this.f1519j = str;
        this.f1520k = list;
        this.f1521l = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((t) list.get(i)).f1406a.toString();
            kotlin.jvm.internal.h.d(uuid, "id.toString()");
            this.f1521l.add(uuid);
            this.f1522m.add(uuid);
        }
    }

    public static HashSet p(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final x o() {
        if (this.f1523n) {
            s.d().g(f1518p, "Already enqueued work ids (" + TextUtils.join(", ", this.f1521l) + ")");
        } else {
            T0.d dVar = new T0.d(this);
            this.i.f1535d.i(dVar);
            this.f1524o = dVar.f3031u;
        }
        return this.f1524o;
    }
}
