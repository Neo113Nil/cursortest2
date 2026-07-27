package O2;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2475a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2477c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2478d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0369f f2480f;

    public u(AbstractC0369f abstractC0369f, int i, Bundle bundle) {
        Objects.requireNonNull(abstractC0369f);
        this.f2480f = abstractC0369f;
        Boolean bool = Boolean.TRUE;
        this.f2477c = abstractC0369f;
        this.f2475a = bool;
        this.f2476b = false;
        this.f2478d = i;
        this.f2479e = bundle;
    }

    public abstract boolean a();

    public abstract void b(L2.b bVar);
}
