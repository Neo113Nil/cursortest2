package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425g6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6052a;

    /* renamed from: b, reason: collision with root package name */
    public final Ug f6053b;

    public C0425g6(Context context, InterfaceC0348d6 interfaceC0348d6, EnumC0301bb enumC0301bb, InterfaceC0285al interfaceC0285al, Executor executor, String str) {
        this.f6052a = executor;
        this.f6053b = new Ug(context, interfaceC0348d6, enumC0301bb, interfaceC0285al);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f6052a;
        Ug ug = this.f6053b;
        C0611nb c0611nb = ug.f5170c;
        Consumer consumer = ug.f5172e;
        Context context = ug.f5168a;
        if (Z9.f5490c == null) {
            synchronized (kotlin.jvm.internal.q.a(Z9.class)) {
                if (Z9.f5490c == null) {
                    Z9.f5490c = new Z9(context);
                }
            }
        }
        Z9 z9 = Z9.f5490c;
        if (z9 != null) {
            executor.execute(new Tf(file, c0611nb, c0611nb, consumer, z9, ug.f5169b));
        } else {
            kotlin.jvm.internal.i.i("INSTANCE");
            throw null;
        }
    }
}
