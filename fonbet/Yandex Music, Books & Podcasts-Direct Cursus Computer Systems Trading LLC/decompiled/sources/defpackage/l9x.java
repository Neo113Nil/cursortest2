package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class l9x extends d0x {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9x(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.d0x
    public final void a(h66 h66Var) {
        a aVar = this.h;
        knn knnVar = aVar.u;
        if (knnVar != null) {
            ((smd) knnVar.b).X(h66Var);
        }
        aVar.w(h66Var);
    }

    @Override // defpackage.d0x
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            y1g.G(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.t().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.t() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o = aVar.o(iBinder);
            if (o == null || !(a.z(aVar, 2, 4, o) || a.z(aVar, 3, 4, o))) {
                return false;
            }
            aVar.y = null;
            Bundle q = aVar.q();
            f4m f4mVar = aVar.t;
            if (f4mVar == null) {
                return true;
            }
            ((rmd) f4mVar.b).R(q);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
