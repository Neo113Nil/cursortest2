package com.gamericefishpro.space.w0;

import com.gamericefishpro.space.f1.r;
import com.gamericefishpro.space.x0.e;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends List, Collection, com.gamericefishpro.space.fi.a {
    @Override // java.util.List
    b add(int i, Object obj);

    @Override // java.util.List, java.util.Collection
    b add(Object obj);

    @Override // java.util.List, java.util.Collection
    b addAll(Collection collection);

    e builder();

    b e(r rVar);

    b g(int i);

    @Override // java.util.List
    b set(int i, Object obj);
}
