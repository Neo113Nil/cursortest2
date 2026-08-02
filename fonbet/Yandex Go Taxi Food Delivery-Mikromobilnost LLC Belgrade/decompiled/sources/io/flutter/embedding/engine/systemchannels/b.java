package io.flutter.embedding.engine.systemchannels;

import defpackage.m2v;
import defpackage.ufg;
import defpackage.zsu0;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class b {
    public LifecycleChannel$AppLifecycleState a;
    public LifecycleChannel$AppLifecycleState b;
    public boolean c;
    public final m2v d;

    public b(ufg ufgVar) {
        m2v m2vVar = new m2v(ufgVar, "flutter/lifecycle", zsu0.b, null);
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = m2vVar;
    }

    public final void a() {
        e(LifecycleChannel$AppLifecycleState.DETACHED, this.c);
    }

    public final void b() {
        e(LifecycleChannel$AppLifecycleState.INACTIVE, this.c);
    }

    public final void c() {
        e(LifecycleChannel$AppLifecycleState.PAUSED, this.c);
    }

    public final void d() {
        e(LifecycleChannel$AppLifecycleState.RESUMED, this.c);
    }

    public final void e(LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState, boolean z) {
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState2 = this.a;
        if (lifecycleChannel$AppLifecycleState2 == lifecycleChannel$AppLifecycleState && z == this.c) {
            return;
        }
        if (lifecycleChannel$AppLifecycleState == null && lifecycleChannel$AppLifecycleState2 == null) {
            this.c = z;
            return;
        }
        int i = a.a[lifecycleChannel$AppLifecycleState.ordinal()];
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState3 = i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? lifecycleChannel$AppLifecycleState : null : z ? LifecycleChannel$AppLifecycleState.RESUMED : LifecycleChannel$AppLifecycleState.INACTIVE;
        this.a = lifecycleChannel$AppLifecycleState;
        this.c = z;
        if (lifecycleChannel$AppLifecycleState3 == this.b) {
            return;
        }
        this.d.z("AppLifecycleState." + lifecycleChannel$AppLifecycleState3.name().toLowerCase(Locale.ROOT), null);
        this.b = lifecycleChannel$AppLifecycleState3;
    }
}
