package Z2;

import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class g extends AbstractC0549a {
    public final Y2.a G1(Y2.b bVar, boolean z6, long j6) {
        Parcel t02 = t0();
        e3.h.b(t02, bVar);
        t02.writeString(ModuleDescriptor.MODULE_ID);
        t02.writeInt(z6 ? 1 : 0);
        t02.writeLong(j6);
        return Wv.e(e0(t02, 7));
    }

    public final Y2.a Q1(Y2.b bVar, int i, Y2.b bVar2) {
        Parcel t02 = t0();
        e3.h.b(t02, bVar);
        t02.writeString(ModuleDescriptor.MODULE_ID);
        t02.writeInt(i);
        e3.h.b(t02, bVar2);
        return Wv.e(e0(t02, 8));
    }

    public final Y2.a r1(Y2.b bVar, int i) {
        Parcel t02 = t0();
        e3.h.b(t02, bVar);
        t02.writeString(ModuleDescriptor.MODULE_ID);
        t02.writeInt(i);
        return Wv.e(e0(t02, 2));
    }

    public final Y2.a u1(Y2.b bVar, int i) {
        Parcel t02 = t0();
        e3.h.b(t02, bVar);
        t02.writeString(ModuleDescriptor.MODULE_ID);
        t02.writeInt(i);
        return Wv.e(e0(t02, 4));
    }
}
