package X2;

import a3.AbstractC0432a;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.icefishing.icefishinglive2.AbstractC4404f;

/* loaded from: classes.dex */
public final class i extends AbstractC0432a {
    public final W2.a B1(W2.b bVar, int i, W2.b bVar2) {
        Parcel w02 = w0();
        c3.h.b(w02, bVar);
        w02.writeString(ModuleDescriptor.MODULE_ID);
        w02.writeInt(i);
        c3.h.b(w02, bVar2);
        return AbstractC4404f.c(e0(w02, 3));
    }

    public final W2.a t1(W2.b bVar, int i, W2.b bVar2) {
        Parcel w02 = w0();
        c3.h.b(w02, bVar);
        w02.writeString(ModuleDescriptor.MODULE_ID);
        w02.writeInt(i);
        c3.h.b(w02, bVar2);
        return AbstractC4404f.c(e0(w02, 2));
    }
}
