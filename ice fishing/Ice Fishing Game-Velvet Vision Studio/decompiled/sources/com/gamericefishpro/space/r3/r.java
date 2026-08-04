package com.gamericefishpro.space.r3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable {
    public final ArrayList d = new ArrayList();
    public final Context e;

    public r(Context context) {
        this.e = context;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }
}
