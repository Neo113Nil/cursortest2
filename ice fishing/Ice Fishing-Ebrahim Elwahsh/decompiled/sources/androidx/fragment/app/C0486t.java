package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0506n;
import h.AbstractActivityC4553l;
import x0.InterfaceC5201b;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0486t implements InterfaceC5201b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5183b;

    public /* synthetic */ C0486t(int i, Object obj) {
        this.f5182a = i;
        this.f5183b = obj;
    }

    @Override // x0.InterfaceC5201b
    public final Bundle a() {
        switch (this.f5182a) {
            case 0:
                AbstractActivityC4553l abstractActivityC4553l = (AbstractActivityC4553l) this.f5183b;
                abstractActivityC4553l.markFragmentsCreated();
                abstractActivityC4553l.mFragmentLifecycleRegistry.e(EnumC0506n.ON_STOP);
                return new Bundle();
            default:
                return ((N) this.f5183b).R();
        }
    }
}
