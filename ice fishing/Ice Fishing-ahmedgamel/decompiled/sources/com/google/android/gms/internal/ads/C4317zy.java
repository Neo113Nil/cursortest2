package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.zy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4317zy {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f36250a;

    public C4317zy(ExecutorService executorService) {
        this.f36250a = executorService;
    }

    public final C4263yy a(File file, byte[] bArr, UA ua) {
        return new C4263yy(file, this.f36250a, new C4201xq(10, bArr), ua);
    }
}
