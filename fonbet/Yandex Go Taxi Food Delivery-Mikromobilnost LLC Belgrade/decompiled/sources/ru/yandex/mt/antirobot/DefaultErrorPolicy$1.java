package ru.yandex.mt.antirobot;

import android.os.SystemClock;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class DefaultErrorPolicy$1 extends FunctionReferenceImpl implements sls {
    public static final DefaultErrorPolicy$1 b = new DefaultErrorPolicy$1(0, 0, SystemClock.class, "uptimeMillis", "uptimeMillis()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
