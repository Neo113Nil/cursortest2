package com.gamericefishpro.space.y0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ph.o;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o {
    public final /* synthetic */ int e;
    public final com.gamericefishpro.space.ph.i i;

    public /* synthetic */ g(com.gamericefishpro.space.ph.i iVar, int i) {
        this.e = i;
        this.i = iVar;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b) this.i).c();
            case 1:
                return ((b) this.i).c();
            default:
                return this.i.c();
        }
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                b bVar = (b) this.i;
                Object obj2 = bVar.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && bVar.containsKey(entry.getKey());
            case 1:
                return ((b) this.i).containsKey(obj);
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // com.gamericefishpro.space.ph.o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = ((b) this.i).v;
                j[] jVarArr = new j[8];
                for (int i = 0; i < 8; i++) {
                    jVarArr[i] = new k(0);
                }
                return new h(iVar, jVarArr);
            case 1:
                i iVar2 = ((b) this.i).v;
                j[] jVarArr2 = new j[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    jVarArr2[i2] = new k(1);
                }
                return new h(iVar2, jVarArr2);
            default:
                return new com.gamericefishpro.space.ph.h(((g) this.i.a()).iterator(), 0);
        }
    }
}
