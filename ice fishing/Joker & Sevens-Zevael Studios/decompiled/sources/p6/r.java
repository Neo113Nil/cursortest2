package p6;

import android.os.Bundle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5636a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f5638c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5639d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f5640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f5641f;

    public r(com.google.android.gms.common.internal.a aVar, int i10, Bundle bundle) {
        this.f5641f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f5638c = aVar;
        this.f5636a = bool;
        this.f5637b = false;
        this.f5639d = i10;
        this.f5640e = bundle;
    }

    public abstract void a(m6.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f5636a = null;
        }
        synchronized (this.f5638c.f1440p) {
            this.f5638c.f1440p.remove(this);
        }
    }
}
