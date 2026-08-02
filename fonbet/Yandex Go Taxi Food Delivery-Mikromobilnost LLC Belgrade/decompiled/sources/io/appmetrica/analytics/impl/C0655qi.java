package io.appmetrica.analytics.impl;

import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/impl/qi;", "Lio/appmetrica/analytics/impl/pi;", "", "b", "a", "Ljava/lang/String;", "mProcessName", "<init>", "()V", "analytics-yandex_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0655qi implements InterfaceC0626pi {

    /* renamed from: a, reason: from kotlin metadata */
    private volatile String mProcessName;

    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th) {
            ny61.j(th);
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0626pi
    public String a() {
        if (this.mProcessName != null) {
            return this.mProcessName;
        }
        synchronized (this) {
            if (this.mProcessName == null) {
                this.mProcessName = b();
            }
        }
        return this.mProcessName;
    }
}
