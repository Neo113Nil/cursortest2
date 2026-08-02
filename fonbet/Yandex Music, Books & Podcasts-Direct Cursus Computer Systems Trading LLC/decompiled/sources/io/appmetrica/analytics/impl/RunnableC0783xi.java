package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0783xi implements Runnable {
    public final File a;
    public final Consumer b;

    public RunnableC0783xi(File file, Y6 y6) {
        this.a = file;
        this.b = y6;
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
