package p4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o4.p;
import o4.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends a.a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f5479j = o4.o.f("WorkContinuationImpl");

    /* renamed from: c, reason: collision with root package name */
    public final n f5480c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5481d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5482e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5483f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5484g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f5485h;

    /* renamed from: i, reason: collision with root package name */
    public x4.e f5486i;

    public j(n nVar, String str, List list) {
        this.f5480c = nVar;
        this.f5481d = str;
        this.f5482e = list;
        this.f5483f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((p) list.get(i10)).f5219a.toString();
            pc.j.d(uuid, "id.toString()");
            this.f5483f.add(uuid);
            this.f5484g.add(uuid);
        }
    }

    public static HashSet O(j jVar) {
        HashSet hashSet = new HashSet();
        jVar.getClass();
        return hashSet;
    }

    public final t N() {
        if (this.f5485h) {
            o4.o.d().g(f5479j, "Already enqueued work ids (" + TextUtils.join(", ", this.f5483f) + ")");
        } else {
            y4.c cVar = new y4.c(this);
            this.f5480c.f5496d.a(cVar);
            this.f5486i = cVar.f8739h;
        }
        return this.f5486i;
    }
}
