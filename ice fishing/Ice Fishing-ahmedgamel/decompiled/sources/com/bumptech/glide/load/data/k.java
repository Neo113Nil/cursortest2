package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C2964aq;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C2964aq f24225a;

    public k(C2964aq c2964aq) {
        this.f24225a = c2964aq;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        return new g((InputStream) obj, this.f24225a);
    }
}
