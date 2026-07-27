package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Ay {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f23934a;

    public Ay(ExecutorService executorService) {
        this.f23934a = executorService;
    }

    public final C4307zy a(File file, byte[] bArr, XA xa) {
        return new C4307zy(file, this.f23934a, new C2478Aq(10, bArr), xa);
    }
}
