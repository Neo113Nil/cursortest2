package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0446jc extends InterfaceC0274dc, Ce {
    void a(Activity activity);

    /* synthetic */ void a(Location location);

    void a(AnrListener anrListener);

    void a(ExternalAttribution externalAttribution);

    void a(ls lsVar);

    void a(EnumC0578o enumC0578o);

    /* synthetic */ void a(String str);

    /* synthetic */ void a(String str, String str2);

    void a(String str, boolean z);

    /* synthetic */ void a(boolean z);

    /* synthetic */ void a(boolean z, boolean z2);

    void b();

    void b(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC0274dc
    /* synthetic */ void b(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC0274dc
    /* synthetic */ void b(String str, String str2);

    List<String> c();

    @Override // io.appmetrica.analytics.impl.InterfaceC0274dc
    /* synthetic */ boolean d();
}
