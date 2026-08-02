package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0396k7 implements Yh {

    @NotNull
    public static final C0367j7 b = new C0367j7();
    public final Yh a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0396k7(Yh yh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yh);
        if ((i & 1) != 0) {
            b.getClass();
            yh = C0367j7.a();
        }
    }

    public final boolean a(@NotNull String str) {
        try {
            String a = this.a.a();
            if (a != null && a.length() > 0) {
                if (kotlin.text.c.n(a, StringUtils.PROCESS_POSTFIX_DELIMITER + str, false)) {
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
                return !StringsKt.M(a, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0396k7(@NotNull Yh yh) {
        this.a = yh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0396k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Yh
    public final String a() {
        return this.a.a();
    }
}
