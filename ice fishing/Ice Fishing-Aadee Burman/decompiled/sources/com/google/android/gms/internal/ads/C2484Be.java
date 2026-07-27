package com.google.android.gms.internal.ads;

import java.lang.Thread;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2484Be implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f23912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2501Ce f23913c;

    public C2484Be(C2501Ce c2501Ce, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f23911a = i;
        switch (i) {
            case 1:
                this.f23912b = uncaughtExceptionHandler;
                Objects.requireNonNull(c2501Ce);
                this.f23913c = c2501Ce;
                break;
            default:
                this.f23912b = uncaughtExceptionHandler;
                Objects.requireNonNull(c2501Ce);
                this.f23913c = c2501Ce;
                break;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f23911a) {
            case 0:
                uncaughtExceptionHandler = this.f23912b;
                try {
                    try {
                        this.f23913c.g(th);
                    } finally {
                    }
                } catch (Throwable unused) {
                    v2.i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            default:
                uncaughtExceptionHandler = this.f23912b;
                try {
                    try {
                        this.f23913c.g(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    v2.i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
