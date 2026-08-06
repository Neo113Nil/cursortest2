package p0;

import android.os.Bundle;

/* renamed from: p0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1018o {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f8399a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8401c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8402d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8404f;

    public AbstractC1018o(com.google.android.gms.common.internal.a aVar, int i2, Bundle bundle) {
        this.f8404f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f8401c = aVar;
        this.f8399a = bool;
        this.f8400b = false;
        this.f8402d = i2;
        this.f8403e = bundle;
    }

    public abstract void a(m0.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f8399a = null;
        }
        synchronized (this.f8401c.f2695k) {
            this.f8401c.f2695k.remove(this);
        }
    }
}
