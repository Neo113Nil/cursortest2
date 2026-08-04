package com.gamericefishpro.space.v8;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {
    public final /* synthetic */ Intent d;
    public final /* synthetic */ com.gamericefishpro.space.u8.e e;

    public r(Intent intent, com.gamericefishpro.space.u8.e eVar) {
        this.d = intent;
        this.e = eVar;
    }

    @Override // com.gamericefishpro.space.v8.s
    public final void a() {
        Intent intent = this.d;
        if (intent != null) {
            this.e.startActivityForResult(intent, 2);
        }
    }
}
