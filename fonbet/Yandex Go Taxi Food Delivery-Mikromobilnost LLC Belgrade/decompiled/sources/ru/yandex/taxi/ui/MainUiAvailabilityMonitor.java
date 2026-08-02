package ru.yandex.taxi.ui;

import defpackage.bvf0;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class MainUiAvailabilityMonitor {
    public boolean a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final r0 c;
    public final r0 d;
    public final m0 e;

    public MainUiAvailabilityMonitor() {
        r0 c = bvf0.c(Boolean.FALSE);
        this.c = c;
        r0 c2 = bvf0.c(Boolean.TRUE);
        this.d = c2;
        this.e = new m0(c, c2, new MainUiAvailabilityMonitor$isMainUiReadyFlow$1(3, null));
    }

    public final boolean a() {
        return (this.a && this.b.isEmpty()) ? false : true;
    }
}
