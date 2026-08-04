package com.gamericefishpro.space.qa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.gamericefishpro.space.sa.l;
import com.gamericefishpro.space.sa.n;
import com.gamericefishpro.space.sa.o;
import com.gamericefishpro.space.sa.p;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p {
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Long i;
    public final /* synthetic */ com.gamericefishpro.space.r9.h v;
    public final /* synthetic */ IntegrityTokenRequest w;
    public final /* synthetic */ g y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, com.gamericefishpro.space.r9.h hVar, byte[] bArr, Long l, com.gamericefishpro.space.r9.h hVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(hVar);
        this.y = gVar;
        this.e = bArr;
        this.i = l;
        this.v = hVar2;
        this.w = integrityTokenRequest;
    }

    @Override // com.gamericefishpro.space.sa.p
    public final void a(Exception exc) {
        if (exc instanceof com.gamericefishpro.space.sa.e) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.gamericefishpro.space.sa.p
    public final void b() {
        com.gamericefishpro.space.r9.h hVar = this.v;
        g gVar = this.y;
        try {
            n nVar = gVar.d.n;
            Bundle bundleA = g.a(gVar, this.e, this.i);
            f fVar = new f(gVar, hVar);
            l lVar = (l) nVar;
            lVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i = com.gamericefishpro.space.sa.j.a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(fVar);
            try {
                lVar.d.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            o oVar = gVar.a;
            Object[] objArr = {this.w};
            oVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", o.b(oVar.a, "requestIntegrityToken(%s)", objArr), e);
            }
            hVar.b(new a(-100, e));
        }
    }
}
