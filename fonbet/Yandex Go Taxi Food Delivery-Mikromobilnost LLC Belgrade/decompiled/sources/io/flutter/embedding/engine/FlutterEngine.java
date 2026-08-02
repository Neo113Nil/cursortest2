package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import defpackage.bxj0;
import defpackage.c6f0;
import defpackage.dxc0;
import defpackage.epy0;
import defpackage.fix;
import defpackage.gw31;
import defpackage.h7r0;
import defpackage.hdu;
import defpackage.ixc0;
import defpackage.jsr;
import defpackage.kbs;
import defpackage.ke4;
import defpackage.lw31;
import defpackage.ndl0;
import defpackage.opt0;
import defpackage.pg;
import defpackage.pgp0;
import defpackage.poh;
import defpackage.psr;
import defpackage.sxs;
import defpackage.trr;
import defpackage.ufg;
import defpackage.uk10;
import defpackage.urr;
import defpackage.xjg;
import defpackage.xrr;
import defpackage.y4a0;
import defpackage.y5z;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.f;
import io.flutter.embedding.engine.systemchannels.b;
import io.flutter.plugin.platform.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class FlutterEngine implements gw31 {
    public static long y = 1;
    public static final HashMap z = new HashMap();
    public final FlutterJNI a;
    public final f b;
    public final ufg c;
    public final xrr d;
    public final y5z e;
    public final pg f;
    public final xjg g;
    public final b h;
    public final uk10 i;
    public final ke4 j;
    public final ke4 k;
    public final bxj0 l;
    public final y4a0 m;
    public final pgp0 n;
    public final ndl0 o;
    public final h7r0 p;
    public final opt0 q;
    public final fix r;
    public final epy0 s;
    public final d t;
    public final dxc0 u;
    public final long w;
    public final HashSet v = new HashSet();
    public final trr x = new trr(this);

    public FlutterEngine(Context context, FlutterJNI flutterJNI, d dVar, String[] strArr, boolean z2, boolean z3) {
        AssetManager assets;
        long j = y;
        y = 1 + j;
        this.w = j;
        z.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        jsr d = jsr.d();
        if (flutterJNI == null) {
            d.c().getClass();
            flutterJNI = FlutterJNI.a.a();
        }
        this.a = flutterJNI;
        ufg ufgVar = new ufg(flutterJNI, assets, this.w);
        this.c = ufgVar;
        ufgVar.b();
        poh a = jsr.d().a();
        this.f = new pg(ufgVar, flutterJNI);
        xjg xjgVar = new xjg(ufgVar);
        this.g = xjgVar;
        this.h = new b(ufgVar);
        hdu hduVar = new hdu(ufgVar);
        this.i = new uk10(ufgVar);
        this.j = new ke4(ufgVar, 1);
        this.k = new ke4(ufgVar, 0);
        this.m = new y4a0(ufgVar, 12);
        y4a0 y4a0Var = new y4a0(ufgVar, context.getPackageManager());
        this.l = new bxj0(ufgVar, z3);
        this.n = new pgp0(ufgVar);
        this.o = new ndl0(ufgVar);
        this.p = new h7r0(ufgVar);
        this.q = new opt0(ufgVar);
        this.r = new fix(ufgVar);
        this.s = new epy0(ufgVar);
        if (a != null) {
            ((ixc0) a).d(xjgVar);
        }
        y5z y5zVar = new y5z(context, hduVar);
        this.e = y5zVar;
        psr b = d.b();
        if (!flutterJNI.isAttached()) {
            b.d(context.getApplicationContext());
            b.b(context, strArr);
        }
        dxc0 dxc0Var = new dxc0();
        dxc0Var.e(dVar.k());
        dxc0Var.c(flutterJNI);
        dVar.n(flutterJNI);
        flutterJNI.addEngineLifecycleListener(this.x);
        flutterJNI.setPlatformViewsController(dVar);
        flutterJNI.setPlatformViewsController2(dxc0Var);
        flutterJNI.setLocalizationPlugin(y5zVar);
        flutterJNI.setDeferredComponentManager(d.a());
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                kbs.g("FlutterEngine failed to attach to its native Object reference.");
                throw null;
            }
        }
        this.b = new f(flutterJNI);
        this.t = dVar;
        this.u = dxc0Var;
        xrr xrrVar = new xrr(context.getApplicationContext(), this, b);
        this.d = xrrVar;
        y5zVar.b(context.getResources().getConfiguration());
        if (z2 && b.a()) {
            sxs.a(this);
        }
        lw31.a(context, this);
        xrrVar.f(new c6f0(y4a0Var));
    }

    public final void a() {
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((urr) it.next()).a();
        }
        this.d.h();
        this.t.l();
        this.u.b();
        this.c.e();
        trr trrVar = this.x;
        FlutterJNI flutterJNI = this.a;
        flutterJNI.removeEngineLifecycleListener(trrVar);
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.detachFromNativeAndReleaseResources();
        if (jsr.d().a() != null) {
            ((ixc0) jsr.d().a()).a();
            this.g.l();
        }
        z.remove(Long.valueOf(this.w));
    }
}
