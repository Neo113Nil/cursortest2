package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657p5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6723a;

    /* renamed from: b, reason: collision with root package name */
    public final C0495j f6724b = C0610na.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f6725c = EnumSet.of(NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f6726d = "connection based";

    public C0657p5(Context context) {
        this.f6723a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0495j c0495j = this.f6724b;
        Context context = this.f6723a;
        c0495j.getClass();
        Ce ce = Ge.f4420a;
        return !this.f6725c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f6726d;
    }
}
