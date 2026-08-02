package io.appmetrica.analytics.impl;

import defpackage.cvu0;
import defpackage.evu0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0615p7 implements InterfaceC0626pi {
    public static final C0586o7 b = new C0586o7();
    public final InterfaceC0626pi a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0615p7(InterfaceC0626pi interfaceC0626pi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0626pi);
        if ((i & 1) != 0) {
            b.getClass();
            interfaceC0626pi = C0586o7.a();
        }
    }

    public final boolean a(String str) {
        try {
            String a = this.a.a();
            if (a != null && a.length() > 0) {
                if (cvu0.s(a, ":" + str, false)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final boolean b() {
        try {
            String a = this.a.a();
            if (a != null && a.length() > 0) {
                if (!evu0.y(a, ":", false)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public C0615p7(InterfaceC0626pi interfaceC0626pi) {
        this.a = interfaceC0626pi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0615p7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0626pi
    public final String a() {
        return this.a.a();
    }
}
