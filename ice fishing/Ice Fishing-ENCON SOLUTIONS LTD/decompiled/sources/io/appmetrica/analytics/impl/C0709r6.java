package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709r6 implements Cf {

    /* renamed from: b, reason: collision with root package name */
    public static final C0684q6 f6810b = new C0684q6();

    /* renamed from: a, reason: collision with root package name */
    public final Cf f6811a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0709r6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Cf
    public final String a() {
        return this.f6811a.a();
    }

    public final boolean b() {
        try {
            String a2 = this.f6811a.a();
            if (a2 != null && a2.length() > 0) {
                return !z1.g.T(a2, StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0709r6(Cf cf) {
        this.f6811a = cf;
    }

    public final boolean a(String str) {
        try {
            String a2 = this.f6811a.a();
            if (a2 == null || a2.length() <= 0) {
                return false;
            }
            StringBuilder sb = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return z1.o.M(a2, sb.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0709r6(Cf cf, int i2, kotlin.jvm.internal.e eVar) {
        this(cf);
        if ((i2 & 1) != 0) {
            f6810b.getClass();
            cf = C0684q6.a();
        }
    }
}
