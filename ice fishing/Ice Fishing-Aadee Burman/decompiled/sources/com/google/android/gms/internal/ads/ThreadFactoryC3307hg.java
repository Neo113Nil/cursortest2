package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.hg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3307hg implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30824a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f30825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30826c;

    public ThreadFactoryC3307hg(String str, int i) {
        this.f30824a = i;
        switch (i) {
            case 1:
                this.f30826c = str;
                this.f30825b = new AtomicInteger(1);
                break;
            default:
                this.f30826c = str;
                this.f30825b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f30824a) {
            case 0:
                int andIncrement = this.f30825b.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f30826c;
                StringBuilder sb = new StringBuilder(u1.h.a(12, length, str));
                sb.append("AdWorker(");
                sb.append(str);
                sb.append(") #");
                sb.append(andIncrement);
                return new Thread(runnable, sb.toString());
            default:
                int andIncrement2 = this.f30825b.getAndIncrement();
                int length2 = String.valueOf(andIncrement2).length();
                String str2 = this.f30826c;
                StringBuilder sb2 = new StringBuilder(u1.h.a(12, length2, str2));
                sb2.append("AdWorker(");
                sb2.append(str2);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
        }
    }
}
