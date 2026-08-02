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

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0622pe extends Uk implements InterfaceC0446jc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final List<String> c() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final boolean d() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Uk, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Uk, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ls lsVar) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(EnumC0578o enumC0578o) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(String str, boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z, boolean z2) {
    }
}
