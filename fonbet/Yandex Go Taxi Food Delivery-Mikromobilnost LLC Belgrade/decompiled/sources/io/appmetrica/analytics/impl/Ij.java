package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class Ij implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        Lh y = Jb.I.y();
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
            Map i = kotlin.collections.b.i(pair, pair2, pair3, new Pair("version", sb.toString()));
            C0313en c0313en = Cm.a;
            c0313en.getClass();
            c0313en.a(new C0285dn("kotlin_version", i));
            y.a(systemTimeProvider.currentTimeMillis());
        }
    }
}
