package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0500n;
import h.AbstractActivityC4555k;
import x0.InterfaceC5179b;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0480t implements InterfaceC5179b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5038b;

    public /* synthetic */ C0480t(int i, Object obj) {
        this.f5037a = i;
        this.f5038b = obj;
    }

    @Override // x0.InterfaceC5179b
    public final Bundle a() {
        switch (this.f5037a) {
            case 0:
                AbstractActivityC4555k abstractActivityC4555k = (AbstractActivityC4555k) this.f5038b;
                abstractActivityC4555k.markFragmentsCreated();
                abstractActivityC4555k.mFragmentLifecycleRegistry.e(EnumC0500n.ON_STOP);
                return new Bundle();
            default:
                return ((N) this.f5038b).R();
        }
    }
}
