package com.gamericefishpro.space.v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends x {
    public final IBinder g;
    public final /* synthetic */ f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f fVar, int i, IBinder iBinder, Bundle bundle) {
        super(fVar, i, bundle);
        this.h = fVar;
        this.g = iBinder;
    }

    @Override // com.gamericefishpro.space.v8.x
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            c0.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.h;
            if (!fVar.v().equals(interfaceDescriptor)) {
                String strV = fVar.v();
                StringBuilder sb = new StringBuilder(strV.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strV);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceP = fVar.p(iBinder);
            if (iInterfaceP == null || !(fVar.y(2, 4, iInterfaceP) || fVar.y(3, 4, iInterfaceP))) {
                return false;
            }
            fVar.R = null;
            b bVar = fVar.M;
            if (bVar == null) {
                return true;
            }
            bVar.h();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.gamericefishpro.space.v8.x
    public final void b(com.gamericefishpro.space.s8.b bVar) {
        f fVar = this.h;
        c cVar = fVar.N;
        if (cVar != null) {
            cVar.onConnectionFailed(bVar);
        }
        fVar.v = bVar.e;
        fVar.w = System.currentTimeMillis();
    }
}
