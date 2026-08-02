package R2;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2868a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2870c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2871d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2873f;

    public u(AbstractC0380f abstractC0380f, int i, Bundle bundle) {
        Objects.requireNonNull(abstractC0380f);
        this.f2873f = abstractC0380f;
        Boolean bool = Boolean.TRUE;
        this.f2870c = abstractC0380f;
        this.f2868a = bool;
        this.f2869b = false;
        this.f2871d = i;
        this.f2872e = bundle;
    }

    public abstract boolean a();

    public abstract void b(O2.b bVar);
}
