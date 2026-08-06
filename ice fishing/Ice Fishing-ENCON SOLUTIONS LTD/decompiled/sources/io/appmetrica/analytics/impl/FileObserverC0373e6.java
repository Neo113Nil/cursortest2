package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0373e6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f5865a;

    /* renamed from: b, reason: collision with root package name */
    public final File f5866b;

    /* renamed from: c, reason: collision with root package name */
    public final C0274aa f5867c;

    public FileObserverC0373e6(File file, C0425g6 c0425g6, C0274aa c0274aa) {
        super(file.getAbsolutePath(), 8);
        this.f5865a = c0425g6;
        this.f5866b = file;
        this.f5867c = c0274aa;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i2, String str) {
        if (i2 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f5865a;
        C0274aa c0274aa = this.f5867c;
        File file = this.f5866b;
        c0274aa.getClass();
        consumer.consume(new File(file, str));
    }
}
