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
    public final Context f41014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41015b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f41019f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f41020g;

    /* renamed from: h, reason: collision with root package name */
    public l f41021h;
    public boolean i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41024l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f41028p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f41016c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f41017d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41018e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f41022j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41023k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f41025m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final C4986A f41026n = new C4986A(1);

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f41027o = new LinkedHashSet();

    public C5058h(Context context, String str) {
        this.f41014a = context;
        this.f41015b = str;
    }

    public final void a(AbstractC5103a... abstractC5103aArr) {
        if (this.f41028p == null) {
            this.f41028p = new HashSet();
        }
        for (AbstractC5103a abstractC5103a : abstractC5103aArr) {
            HashSet hashSet = this.f41028p;
            kotlin.jvm.internal.h.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC5103a.f41358a));
            HashSet hashSet2 = this.f41028p;
            kotlin.jvm.internal.h.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC5103a.f41359b));
        }
        this.f41026n.b((AbstractC5103a[]) Arrays.copyOf(abstractC5103aArr, abstractC5103aArr.length));
    }
}
