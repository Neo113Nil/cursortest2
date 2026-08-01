package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l0.C0233d;
import l0.InterfaceC0232c;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166g implements InterfaceC0232c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3208a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3209b;

    public C0166g(C0233d c0233d) {
        D1.i.e(c0233d, "registry");
        this.f3209b = new LinkedHashSet();
        c0233d.f("androidx.savedstate.Restarter", this);
    }

    @Override // l0.InterfaceC0232c
    public final Bundle a() {
        switch (this.f3208a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0168i) this.f3209b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f3209b));
                return bundle2;
        }
    }

    public C0166g(AbstractActivityC0168i abstractActivityC0168i) {
        this.f3209b = abstractActivityC0168i;
    }
}
