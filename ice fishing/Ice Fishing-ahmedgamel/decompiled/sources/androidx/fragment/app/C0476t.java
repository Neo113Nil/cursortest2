package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0496n;
import h.AbstractActivityC4551k;
import x0.InterfaceC5180b;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0476t implements InterfaceC5180b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5071b;

    public /* synthetic */ C0476t(int i, Object obj) {
        this.f5070a = i;
        this.f5071b = obj;
    }

    @Override // x0.InterfaceC5180b
    public final Bundle a() {
        switch (this.f5070a) {
            case 0:
                AbstractActivityC4551k abstractActivityC4551k = (AbstractActivityC4551k) this.f5071b;
                abstractActivityC4551k.markFragmentsCreated();
                abstractActivityC4551k.mFragmentLifecycleRegistry.e(EnumC0496n.ON_STOP);
                return new Bundle();
            default:
                return ((N) this.f5071b).R();
        }
    }
}
