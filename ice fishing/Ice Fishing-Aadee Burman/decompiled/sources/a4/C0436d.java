package a4;

import K.o;
import android.content.Context;
import c4.InterfaceC0542a;
import j3.m;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0436d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final O3.c f4342a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4343b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0542a f4344c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4345d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4346e;

    public C0436d(Context context, String str, Set set, InterfaceC0542a interfaceC0542a, Executor executor) {
        this.f4342a = new O3.c(context, str);
        this.f4345d = set;
        this.f4346e = executor;
        this.f4344c = interfaceC0542a;
        this.f4343b = context;
    }

    public final m a() {
        return !o.a(this.f4343b) ? S0.f.i("") : S0.f.d(new CallableC0435c(this, 0), this.f4346e);
    }

    public final void b() {
        if (this.f4345d.size() <= 0) {
            S0.f.i(null);
        } else if (o.a(this.f4343b)) {
            S0.f.d(new CallableC0435c(this, 1), this.f4346e);
        } else {
            S0.f.i(null);
        }
    }
}
