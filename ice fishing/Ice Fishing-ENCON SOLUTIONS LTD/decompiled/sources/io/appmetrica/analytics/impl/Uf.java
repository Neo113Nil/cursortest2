package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes.dex */
public final class Uf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f5166a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f5167b;

    public Uf(File file, C0425g6 c0425g6) {
        this.f5166a = file;
        this.f5167b = c0425g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f5166a.exists() || !this.f5166a.isDirectory() || (listFiles = this.f5166a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f5167b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
