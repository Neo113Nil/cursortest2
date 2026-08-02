package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import x0.C5180c;
import x0.InterfaceC5179b;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4553i implements InterfaceC5179b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37924a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37925b;

    public C4553i(C5180c registry) {
        kotlin.jvm.internal.h.e(registry, "registry");
        this.f37925b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // x0.InterfaceC5179b
    public final Bundle a() {
        switch (this.f37924a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC4555k) this.f37925b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f37925b));
                return bundle2;
        }
    }

    public C4553i(AbstractActivityC4555k abstractActivityC4555k) {
        this.f37925b = abstractActivityC4555k;
    }
}
