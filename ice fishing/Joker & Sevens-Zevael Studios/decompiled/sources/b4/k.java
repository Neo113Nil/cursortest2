package b4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f981a;

    /* renamed from: b, reason: collision with root package name */
    public final String f982b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f986f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f987g;

    /* renamed from: h, reason: collision with root package name */
    public c6.f f988h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f989i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f992l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f996p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f983c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f984d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f985e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f990j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f991k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f993m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final l f994n = new l(0);

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f995o = new LinkedHashSet();

    public k(Context context, String str) {
        this.f981a = context;
        this.f982b = str;
    }

    public final void a(c4.a... aVarArr) {
        if (this.f996p == null) {
            this.f996p = new HashSet();
        }
        for (c4.a aVar : aVarArr) {
            HashSet hashSet = this.f996p;
            pc.j.b(hashSet);
            hashSet.add(Integer.valueOf(aVar.f1223a));
            HashSet hashSet2 = this.f996p;
            pc.j.b(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f1224b));
        }
        this.f994n.a((c4.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
