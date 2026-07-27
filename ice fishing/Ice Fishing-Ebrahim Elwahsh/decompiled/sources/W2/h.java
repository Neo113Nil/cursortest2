package W2;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.CL;

/* loaded from: classes.dex */
public final class h extends Z2.a {
    public final V2.a R0(V2.b bVar, int i) {
        Parcel A02 = A0();
        b3.h.b(A02, bVar);
        A02.writeString(ModuleDescriptor.MODULE_ID);
        A02.writeInt(i);
        return CL.f(u0(A02, 2));
    }

    public final V2.a f1(V2.b bVar, int i) {
        Parcel A02 = A0();
        b3.h.b(A02, bVar);
        A02.writeString(ModuleDescriptor.MODULE_ID);
        A02.writeInt(i);
        return CL.f(u0(A02, 4));
    }

    public final V2.a o1(V2.b bVar, boolean z8, long j9) {
        Parcel A02 = A0();
        b3.h.b(A02, bVar);
        A02.writeString(ModuleDescriptor.MODULE_ID);
        A02.writeInt(z8 ? 1 : 0);
        A02.writeLong(j9);
        return CL.f(u0(A02, 7));
    }

    public final V2.a y1(V2.b bVar, int i, V2.b bVar2) {
        Parcel A02 = A0();
        b3.h.b(A02, bVar);
        A02.writeString(ModuleDescriptor.MODULE_ID);
        A02.writeInt(i);
        b3.h.b(A02, bVar2);
        return CL.f(u0(A02, 8));
    }
}
