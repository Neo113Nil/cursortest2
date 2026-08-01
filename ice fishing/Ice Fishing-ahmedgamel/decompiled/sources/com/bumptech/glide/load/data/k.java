package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C2941aq;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C2941aq f23438a;

    public k(C2941aq c2941aq) {
        this.f23438a = c2941aq;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        return new g((InputStream) obj, this.f23438a);
    }
}
