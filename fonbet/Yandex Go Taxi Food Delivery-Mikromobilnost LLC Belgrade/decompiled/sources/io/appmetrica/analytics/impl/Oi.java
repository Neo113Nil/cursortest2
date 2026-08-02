package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes9.dex */
public final class Oi implements Runnable {
    public final File a;
    public final Consumer b;

    public Oi(File file, C0211b7 c0211b7) {
        this.a = file;
        this.b = c0211b7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.a.exists() || !this.a.isDirectory() || (listFiles = this.a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
