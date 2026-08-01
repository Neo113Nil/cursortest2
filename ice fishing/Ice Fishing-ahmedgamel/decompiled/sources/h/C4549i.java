package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import x0.C5181c;
import x0.InterfaceC5180b;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4549i implements InterfaceC5180b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37898a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37899b;

    public C4549i(C5181c registry) {
        kotlin.jvm.internal.h.e(registry, "registry");
        this.f37899b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // x0.InterfaceC5180b
    public final Bundle a() {
        switch (this.f37898a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC4551k) this.f37899b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f37899b));
                return bundle2;
        }
    }

    public C4549i(AbstractActivityC4551k abstractActivityC4551k) {
        this.f37899b = abstractActivityC4551k;
    }
}
