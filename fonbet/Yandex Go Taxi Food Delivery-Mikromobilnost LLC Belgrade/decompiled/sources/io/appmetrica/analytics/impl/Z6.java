package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes9.dex */
public final class Z6 extends FileObserver {
    public final Consumer a;
    public final File b;
    public final C0676rb c;

    public Z6(File file, C0211b7 c0211b7, C0676rb c0676rb) {
        super(file.getAbsolutePath(), 8);
        this.a = c0211b7;
        this.b = file;
        this.c = c0676rb;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.a;
        C0676rb c0676rb = this.c;
        File file = this.b;
        c0676rb.getClass();
        consumer.consume(new File(file, str));
    }
}
