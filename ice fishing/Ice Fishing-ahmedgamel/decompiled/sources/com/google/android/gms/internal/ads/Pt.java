package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class Pt implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27664b;

    public /* synthetic */ Pt(String str) {
        this.f27663a = 0;
        this.f27664b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Object obj = this.f27664b;
        switch (this.f27663a) {
            case 0:
                String str = AbstractC3182eu.f30782a;
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
        this.f27663a = 1;
        this.f27664b = Executors.defaultThreadFactory();
    }
}
