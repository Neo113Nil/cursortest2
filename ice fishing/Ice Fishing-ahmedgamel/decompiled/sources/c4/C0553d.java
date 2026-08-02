package c4;

import K.o;
import android.content.Context;
import e4.InterfaceC4481a;
import java.util.Set;
import java.util.concurrent.Executor;
import l3.m;

/* renamed from: c4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0553d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final Q3.c f5735a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5736b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4481a f5737c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5738d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f5739e;

    public C0553d(Context context, String str, Set set, InterfaceC4481a interfaceC4481a, Executor executor) {
        this.f5735a = new Q3.c(context, str);
        this.f5738d = set;
        this.f5739e = executor;
        this.f5737c = interfaceC4481a;
        this.f5736b = context;
    }

    public final m a() {
        return !o.a(this.f5736b) ? com.bumptech.glide.d.r("") : com.bumptech.glide.d.g(new CallableC0552c(this, 0), this.f5739e);
    }

    public final void b() {
        if (this.f5738d.size() <= 0) {
            com.bumptech.glide.d.r(null);
        } else if (o.a(this.f5736b)) {
            com.bumptech.glide.d.g(new CallableC0552c(this, 1), this.f5739e);
        } else {
            com.bumptech.glide.d.r(null);
        }
    }
}
