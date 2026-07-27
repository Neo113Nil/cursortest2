package u0;

import K0.l;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import v0.AbstractC5116a;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5097h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41029b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f41033f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f41034g;

    /* renamed from: h, reason: collision with root package name */
    public l f41035h;
    public boolean i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41038l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f41042p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41030c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f41031d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41032e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f41036j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41037k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f41039m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final h8.d f41040n = new h8.d(9);

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f41041o = new LinkedHashSet();

    public C5097h(Context context, String str) {
        this.f41028a = context;
        this.f41029b = str;
    }

    public final void a(AbstractC5116a... abstractC5116aArr) {
        if (this.f41042p == null) {
            this.f41042p = new HashSet();
        }
        for (AbstractC5116a abstractC5116a : abstractC5116aArr) {
            HashSet hashSet = this.f41042p;
            kotlin.jvm.internal.h.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC5116a.f41328a));
            HashSet hashSet2 = this.f41042p;
            kotlin.jvm.internal.h.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC5116a.f41329b));
        }
        this.f41040n.a((AbstractC5116a[]) Arrays.copyOf(abstractC5116aArr, abstractC5116aArr.length));
    }
}
