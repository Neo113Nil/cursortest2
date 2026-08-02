package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.io.BufferedFileWriter;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0734tb implements es {
    public static final C0705sb h = new C0705sb();
    public final Context a;
    public final String b;
    public final IHandlerExecutor c;
    public final long d;
    public final Object e;
    public volatile BufferedFileWriter f;
    public volatile boolean g;

    public C0734tb(Context context, String str, IHandlerExecutor iHandlerExecutor, long j) {
        this.a = context;
        this.b = str;
        this.c = iHandlerExecutor;
        this.d = j;
        this.e = new Object();
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void a(String str) {
        try {
            BufferedFileWriter c = c();
            if (c != null) {
                c.writeString(str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.es
    public final String b() {
        try {
            BufferedFileWriter c = c();
            if (c == null) {
                return null;
            }
            d();
            return c.readString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final BufferedFileWriter c() {
        BufferedFileWriter bufferedFileWriter = this.f;
        if (bufferedFileWriter != null) {
            return bufferedFileWriter;
        }
        synchronized (this.e) {
            BufferedFileWriter bufferedFileWriter2 = this.f;
            if (bufferedFileWriter2 != null) {
                return bufferedFileWriter2;
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, this.b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            BufferedFileWriter bufferedFileWriter3 = new BufferedFileWriter(this.c, this.d, fileFromSdkStorage);
            this.f = bufferedFileWriter3;
            return bufferedFileWriter3;
        }
    }

    public final void d() {
        File fileFromAppStorage;
        if (this.g) {
            return;
        }
        synchronized (this.e) {
            if (this.g) {
                return;
            }
            try {
                File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, this.b);
                if (fileFromSdkStorage != null && !fileFromSdkStorage.exists() && (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.a, this.b)) != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
            } catch (Throwable unused) {
            }
            this.g = true;
        }
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void flushAsync() {
        try {
            BufferedFileWriter c = c();
            if (c != null) {
                c.flushAsync();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void a() {
        try {
            BufferedFileWriter c = c();
            if (c != null) {
                c.flush();
            }
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ C0734tb(Context context, String str, IHandlerExecutor iHandlerExecutor, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, iHandlerExecutor, (i & 8) != 0 ? 1000L : j);
    }
}
