package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892y7 {

    /* renamed from: a, reason: collision with root package name */
    public final Ia f7226a;

    /* renamed from: b, reason: collision with root package name */
    public String f7227b = "";

    public C0892y7(Ia ia) {
        this.f7226a = ia;
    }

    public final void a(String str, boolean z2) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.i.a(this.f7227b, str)) {
                return;
            }
            this.f7227b = str;
            this.f7226a.a(str, z2);
        }
    }
}
