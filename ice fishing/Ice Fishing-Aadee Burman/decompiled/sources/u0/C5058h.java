package u0;

import K0.l;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import t0.C4986A;
import v0.AbstractC5103a;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5058h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41012b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f41016f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f41017g;

    /* renamed from: h, reason: collision with root package name */
    public l f41018h;
    public boolean i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41021l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f41025p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41013c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f41014d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41015e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f41019j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41020k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f41022m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final C4986A f41023n = new C4986A(1);

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f41024o = new LinkedHashSet();

    public C5058h(Context context, String str) {
        this.f41011a = context;
        this.f41012b = str;
    }

    public final void a(AbstractC5103a... abstractC5103aArr) {
        if (this.f41025p == null) {
            this.f41025p = new HashSet();
        }
        for (AbstractC5103a abstractC5103a : abstractC5103aArr) {
            HashSet hashSet = this.f41025p;
            kotlin.jvm.internal.h.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC5103a.f41355a));
            HashSet hashSet2 = this.f41025p;
            kotlin.jvm.internal.h.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC5103a.f41356b));
        }
        this.f41023n.b((AbstractC5103a[]) Arrays.copyOf(abstractC5103aArr, abstractC5103aArr.length));
    }
}
