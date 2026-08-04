package com.gamericefishpro.space.p;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {
    public c d;
    public c e;
    public final /* synthetic */ int i;

    public b(c cVar, c cVar2, int i) {
        this.i = i;
        this.d = cVar2;
        this.e = cVar;
    }

    @Override // com.gamericefishpro.space.p.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.d == cVar && cVar == this.e) {
            this.e = null;
            this.d = null;
        }
        c cVar3 = this.d;
        if (cVar3 == cVar) {
            switch (this.i) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    cVar2 = cVar3.v;
                    break;
                default:
                    cVar2 = cVar3.i;
                    break;
            }
            this.d = cVar2;
        }
        c cVar4 = this.e;
        if (cVar4 == cVar) {
            c cVar5 = this.d;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.e = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return cVar.i;
            default:
                return cVar.v;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.e;
        c cVar2 = this.d;
        this.e = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
