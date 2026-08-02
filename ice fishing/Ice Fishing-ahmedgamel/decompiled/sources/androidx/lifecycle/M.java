package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import u7.C5085k;
import x0.C5180c;
import x0.InterfaceC5179b;

/* loaded from: classes.dex */
public final class M implements InterfaceC5179b {

    /* renamed from: a, reason: collision with root package name */
    public final C5180c f5094a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5095b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5096c;

    /* renamed from: d, reason: collision with root package name */
    public final C5085k f5097d;

    public M(C5180c savedStateRegistry, Y y7) {
        kotlin.jvm.internal.h.e(savedStateRegistry, "savedStateRegistry");
        this.f5094a = savedStateRegistry;
        this.f5097d = N3.C.O(new X.r(1, y7));
    }

    @Override // x0.InterfaceC5179b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5096c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((N) this.f5097d.getValue()).f5098a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a9 = ((K) entry.getValue()).f5086e.a();
            if (!kotlin.jvm.internal.h.a(a9, Bundle.EMPTY)) {
                bundle.putBundle(str, a9);
            }
        }
        this.f5095b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5095b) {
            return;
        }
        Bundle a9 = this.f5094a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5096c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a9 != null) {
            bundle.putAll(a9);
        }
        this.f5096c = bundle;
        this.f5095b = true;
    }
}
