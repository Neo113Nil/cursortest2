package P2;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2547a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376f f2549c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2550d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376f f2552f;

    public u(AbstractC0376f abstractC0376f, int i, Bundle bundle) {
        Objects.requireNonNull(abstractC0376f);
        this.f2552f = abstractC0376f;
        Boolean bool = Boolean.TRUE;
        this.f2549c = abstractC0376f;
        this.f2547a = bool;
        this.f2548b = false;
        this.f2550d = i;
        this.f2551e = bundle;
    }

    public abstract boolean a();

    public abstract void b(M2.b bVar);
}
