package io.appmetrica.analytics.impl;

import defpackage.uah;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class Bj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C0724vh y = C0747wb.I.y();
        if (timePassedChecker.didTimePassMillis(y.f(), 86400000L, "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = new Pair("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = new Pair("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = new Pair("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map e = uah.e(pair, pair2, pair3, new Pair("version", sb.toString()));
            Om om = AbstractC0469mm.a;
            om.getClass();
            om.a(new Nm("kotlin_version", e));
            y.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
