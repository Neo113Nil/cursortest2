package androidx.lifecycle;

import a.AbstractC0422a;
import android.os.Bundle;
import java.util.Map;
import u7.C5093k;
import x0.C5181c;
import x0.InterfaceC5180b;

/* loaded from: classes.dex */
public final class M implements InterfaceC5180b {

    /* renamed from: a, reason: collision with root package name */
    public final C5181c f5127a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5128b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5129c;

    /* renamed from: d, reason: collision with root package name */
    public final C5093k f5130d;

    public M(C5181c savedStateRegistry, Y y7) {
        kotlin.jvm.internal.h.e(savedStateRegistry, "savedStateRegistry");
        this.f5127a = savedStateRegistry;
        this.f5130d = AbstractC0422a.q(new X.r(1, y7));
    }

    @Override // x0.InterfaceC5180b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5129c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((N) this.f5130d.getValue()).f5131a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a9 = ((K) entry.getValue()).f5119e.a();
            if (!kotlin.jvm.internal.h.a(a9, Bundle.EMPTY)) {
                bundle.putBundle(str, a9);
            }
        }
        this.f5128b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5128b) {
            return;
        }
        Bundle a9 = this.f5127a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5129c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a9 != null) {
            bundle.putAll(a9);
        }
        this.f5129c = bundle;
        this.f5128b = true;
    }
}
