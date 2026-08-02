package io.appmetrica.analytics.impl;

import defpackage.unr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0252cj implements InterfaceC0309ej {
    public final String a;
    public final Throwable b;

    public /* synthetic */ C0252cj(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0309ej
    public final Ui a() {
        return null;
    }

    public final String b() {
        return this.a;
    }

    public final Throwable c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failure(message='");
        sb.append(this.a);
        sb.append("', throwable=");
        return unr0.s(sb, this.b, ')');
    }

    public C0252cj(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }
}
