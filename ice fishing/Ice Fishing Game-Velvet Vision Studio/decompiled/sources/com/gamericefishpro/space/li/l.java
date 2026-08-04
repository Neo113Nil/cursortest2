package com.gamericefishpro.space.li;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ com.gamericefishpro.space.mi.a d;

    public l(com.gamericefishpro.space.mi.a aVar) {
        this.d = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kotlin.text.b(this.d);
    }
}
