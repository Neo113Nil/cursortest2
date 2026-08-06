package io.appmetrica.analytics.impl;

import h1.C0234d;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Yg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        Ze y2 = C0610na.f6575I.y();
        if (timePassedChecker.didTimePassMillis(y2.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            C0234d c0234d = new C0234d("major", Integer.valueOf(kotlinVersion.getMajor()));
            C0234d c0234d2 = new C0234d("minor", Integer.valueOf(kotlinVersion.getMinor()));
            C0234d c0234d3 = new C0234d("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map I2 = i1.u.I(c0234d, c0234d2, c0234d3, new C0234d("version", sb.toString()));
            Qj qj = AbstractC0645oj.f6689a;
            qj.getClass();
            qj.a(new Pj("kotlin_version", I2));
            y2.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
