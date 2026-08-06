package io.appmetrica.analytics.impl;

import android.content.Context;
import h1.C0237g;
import h1.InterfaceC0233c;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383eg {

    /* renamed from: a, reason: collision with root package name */
    public final C0564lg f5936a;

    /* renamed from: b, reason: collision with root package name */
    public final C0921za f5937b;

    /* renamed from: c, reason: collision with root package name */
    public final C0849wg f5938c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0233c f5939d = R1.d.y(new C0306bg(this));

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0233c f5940e = R1.d.y(new Zf(this));

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0233c f5941f = R1.d.y(new C0358dg(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5942g = new ArrayList();

    public C0383eg(C0564lg c0564lg, C0823vg c0823vg, C0921za c0921za, C0849wg c0849wg) {
        this.f5936a = c0564lg;
        this.f5937b = c0921za;
        this.f5938c = c0849wg;
    }

    public static final Wf a(C0383eg c0383eg) {
        return (Wf) ((C0237g) c0383eg.f5939d).a();
    }

    public static final void a(C0383eg c0383eg, C0616ng c0616ng, Wf wf) {
        boolean a2;
        c0383eg.f5942g.add(c0616ng);
        C0849wg c0849wg = c0383eg.f5938c;
        if (c0616ng == null) {
            c0849wg.getClass();
        } else {
            SafePackageManager safePackageManager = c0849wg.f7110b;
            Context context = c0849wg.f7109a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0616ng.f6627d.ordinal();
            if (ordinal == 1) {
                a2 = kotlin.jvm.internal.i.a(c0849wg.f7114f, installerPackageName);
            } else if (ordinal == 2) {
                a2 = kotlin.jvm.internal.i.a(c0849wg.f7115g, installerPackageName);
            }
            if (a2) {
                c0383eg.a(c0616ng);
                return;
            }
        }
        wf.a();
    }

    public final void a(C0616ng c0616ng) {
        C0564lg c0564lg = this.f5936a;
        synchronized (c0564lg) {
            c0564lg.f6455b = c0616ng;
            c0564lg.f6456c = true;
            c0564lg.f6457d.a(c0616ng);
            c0564lg.f6457d.d();
            c0564lg.a(c0564lg.f6455b);
        }
    }
}
