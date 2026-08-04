package com.gamericefishpro.space.h3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final /* synthetic */ k A;

    public j(k kVar) {
        this.A = kVar;
    }

    @Override // com.gamericefishpro.space.h3.h
    public final String h() {
        i iVar = (i) this.A.d.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.a + "]";
    }
}
