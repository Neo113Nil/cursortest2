package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C3112dq;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C3112dq f23594a;

    public k(C3112dq c3112dq) {
        this.f23594a = c3112dq;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        return new g((InputStream) obj, this.f23594a);
    }
}
