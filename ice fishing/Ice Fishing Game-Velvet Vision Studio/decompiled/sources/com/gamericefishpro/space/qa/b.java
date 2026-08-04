package com.gamericefishpro.space.qa;

import android.util.Base64;
import com.gamericefishpro.space.sa.r;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements IntegrityManager {
    public final g a;

    public b(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        g gVar = this.a;
        com.gamericefishpro.space.sa.d dVar = gVar.d;
        if (dVar == null) {
            return com.gamericefishpro.space.d9.h.v(new a(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof i) {
            }
            gVar.a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
            dVar.a().post(new r(dVar, hVar, hVar, new e(gVar, hVar, bArrDecode, lA, hVar, integrityTokenRequest)));
            return hVar.a;
        } catch (IllegalArgumentException e) {
            return com.gamericefishpro.space.d9.h.v(new a(-13, e));
        }
    }
}
