package Z;

import android.os.Bundle;
import androidx.lifecycle.EnumC0096m;
import b.C0108d;
import h.AbstractActivityC0168i;
import java.util.ArrayList;
import java.util.HashMap;
import l0.InterfaceC0232c;

/* renamed from: Z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0071t implements InterfaceC0232c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0168i f1623b;

    public /* synthetic */ C0071t(AbstractActivityC0168i abstractActivityC0168i, int i) {
        this.f1622a = i;
        this.f1623b = abstractActivityC0168i;
    }

    @Override // l0.InterfaceC0232c
    public final Bundle a() {
        switch (this.f1622a) {
            case 0:
                AbstractActivityC0168i abstractActivityC0168i = this.f1623b;
                while (AbstractActivityC0168i.n(((C0074w) abstractActivityC0168i.f3211r.f10b).f1631d)) {
                }
                abstractActivityC0168i.f3212s.d(EnumC0096m.ON_STOP);
                return new Bundle();
            default:
                AbstractActivityC0168i abstractActivityC0168i2 = this.f1623b;
                Bundle bundle = new Bundle();
                C0108d c0108d = abstractActivityC0168i2.j;
                c0108d.getClass();
                HashMap hashMap = c0108d.f2269b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0108d.f2271d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0108d.f2273g.clone());
                return bundle;
        }
    }
}
