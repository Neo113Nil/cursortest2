package com.google.android.gms.internal.ads;

import java.lang.Thread;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2504Be implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f24685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2521Ce f24686c;

    public C2504Be(C2521Ce c2521Ce, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f24684a = i;
        switch (i) {
            case 1:
                this.f24685b = uncaughtExceptionHandler;
                Objects.requireNonNull(c2521Ce);
                this.f24686c = c2521Ce;
                break;
            default:
                this.f24685b = uncaughtExceptionHandler;
                Objects.requireNonNull(c2521Ce);
                this.f24686c = c2521Ce;
                break;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f24684a) {
            case 0:
                uncaughtExceptionHandler = this.f24685b;
                try {
                    try {
                        this.f24686c.g(th);
                    } finally {
                    }
                } catch (Throwable unused) {
                    x2.i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            default:
                uncaughtExceptionHandler = this.f24685b;
                try {
                    try {
                        this.f24686c.g(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    x2.i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
