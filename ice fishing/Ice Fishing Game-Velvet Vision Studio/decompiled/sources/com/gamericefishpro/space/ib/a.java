package com.gamericefishpro.space.ib;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.jb.f;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.gamericefishpro.space.gb.d {
    public final /* synthetic */ int a;

    @Override // com.gamericefishpro.space.gb.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new com.gamericefishpro.space.gb.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                com.gamericefishpro.space.gb.e eVar = (com.gamericefishpro.space.gb.e) obj2;
                eVar.a(f.g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                throw new com.gamericefishpro.space.gb.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
