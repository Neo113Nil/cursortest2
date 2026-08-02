package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes5.dex */
public final class W6 extends FileObserver {
    public final Consumer a;
    public final File b;
    public final C0343ib c;

    public W6(File file, Y6 y6, C0343ib c0343ib) {
        super(file.getAbsolutePath(), 8);
        this.a = y6;
        this.b = file;
        this.c = c0343ib;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.a;
        C0343ib c0343ib = this.c;
        File file = this.b;
        c0343ib.getClass();
        consumer.consume(new File(file, str));
    }
}
