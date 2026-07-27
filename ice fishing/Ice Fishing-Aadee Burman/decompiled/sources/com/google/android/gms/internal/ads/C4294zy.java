package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.zy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4294zy {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f35481a;

    public C4294zy(ExecutorService executorService) {
        this.f35481a = executorService;
    }

    public final C4240yy a(File file, byte[] bArr, UA ua) {
        return new C4240yy(file, this.f35481a, new C4178xq(10, bArr), ua);
    }
}
