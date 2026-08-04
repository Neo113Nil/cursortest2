package com.gamericefishpro.space.d8;

import android.content.Context;
import com.gamericefishpro.space.u6.l;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final l a;
    public final com.gamericefishpro.space.a8.c b;
    public final HashMap c;

    public d(Context context, com.gamericefishpro.space.a8.c cVar) {
        l lVar = new l();
        lVar.e = null;
        lVar.d = context;
        this.c = new HashMap();
        this.a = lVar;
        this.b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryG = this.a.g(str);
        if (cctBackendFactoryG == null) {
            return null;
        }
        com.gamericefishpro.space.a8.c cVar = this.b;
        e eVarCreate = cctBackendFactoryG.create(new b((Context) cVar.e, (com.gamericefishpro.space.l8.a) cVar.i, (com.gamericefishpro.space.l8.a) cVar.v, str));
        this.c.put(str, eVarCreate);
        return eVarCreate;
    }
}
