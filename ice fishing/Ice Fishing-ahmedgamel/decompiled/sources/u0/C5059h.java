package u0;

import K0.l;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import m.R0;
import v0.AbstractC5095a;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5059h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40977b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f40981f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f40982g;

    /* renamed from: h, reason: collision with root package name */
    public l f40983h;
    public boolean i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40986l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f40990p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40978c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f40979d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f40980e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f40984j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40985k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f40987m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final R0 f40988n = new R0();

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f40989o = new LinkedHashSet();

    public C5059h(Context context, String str) {
        this.f40976a = context;
        this.f40977b = str;
    }

    public final void a(AbstractC5095a... abstractC5095aArr) {
        if (this.f40990p == null) {
            this.f40990p = new HashSet();
        }
        for (AbstractC5095a abstractC5095a : abstractC5095aArr) {
            HashSet hashSet = this.f40990p;
            kotlin.jvm.internal.h.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC5095a.f41078a));
            HashSet hashSet2 = this.f40990p;
            kotlin.jvm.internal.h.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC5095a.f41079b));
        }
        this.f40988n.a((AbstractC5095a[]) Arrays.copyOf(abstractC5095aArr, abstractC5095aArr.length));
    }
}
