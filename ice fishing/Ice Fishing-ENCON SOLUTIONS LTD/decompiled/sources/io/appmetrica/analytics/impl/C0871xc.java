package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871xc extends C0463hi implements Ia {
    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void c() {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final List<String> f() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C0463hi, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.C0463hi, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Da
    public final void b(String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Da
    public final void b(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Da
    public final boolean b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Ho ho) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(EnumC0599n enumC0599n) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(String str, boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
    }
}
