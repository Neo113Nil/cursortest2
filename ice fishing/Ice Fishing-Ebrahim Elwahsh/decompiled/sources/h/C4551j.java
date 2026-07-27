package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import x0.C5202c;
import x0.InterfaceC5201b;

/* renamed from: h.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4551j implements InterfaceC5201b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38113a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38114b;

    public C4551j(C5202c registry) {
        kotlin.jvm.internal.h.e(registry, "registry");
        this.f38114b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // x0.InterfaceC5201b
    public final Bundle a() {
        switch (this.f38113a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC4553l) this.f38114b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f38114b));
                return bundle2;
        }
    }

    public C4551j(AbstractActivityC4553l abstractActivityC4553l) {
        this.f38114b = abstractActivityC4553l;
    }
}
