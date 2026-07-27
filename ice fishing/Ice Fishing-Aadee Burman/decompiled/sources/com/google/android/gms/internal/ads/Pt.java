package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class Pt implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26876a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26877b;

    public /* synthetic */ Pt(String str) {
        this.f26876a = 0;
        this.f26877b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Object obj = this.f26877b;
        switch (this.f26876a) {
            case 0:
                String str = AbstractC3159eu.f29993a;
                return new Thread(runnable, (String) obj);
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                if (newThread == null) {
                    throw new NullPointerException("Default ThreadFactory returned null thread");
                }
                newThread.setName("punch".concat(String.valueOf(newThread.getName())));
                return newThread;
        }
    }

    public /* synthetic */ Pt() {
        this.f26876a = 1;
        this.f26877b = Executors.defaultThreadFactory();
    }
}
