package com.gamericefishpro.space.o5;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public final MeasurementManager a;

    public c(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.a = mMeasurementManager;
    }

    public static Object b(c cVar, a aVar, com.gamericefishpro.space.th.a aVar2) {
        new h(1, com.gamericefishpro.space.uh.f.b(aVar2)).s();
        MeasurementManager measurementManager = cVar.a;
        throw null;
    }

    public static Object d(c cVar, com.gamericefishpro.space.th.a frame) {
        h hVar = new h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        cVar.a.getMeasurementApiStatus(new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.y3.b(hVar));
        Object objR = hVar.r();
        if (objR == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    public static Object g(c cVar, Uri uri, InputEvent inputEvent, com.gamericefishpro.space.th.a frame) {
        h hVar = new h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        cVar.a.registerSource(uri, inputEvent, new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.y3.b(hVar));
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.a;
    }

    public static Object h(c cVar, d dVar, com.gamericefishpro.space.th.a aVar) {
        Object objH = a0.h(new com.gamericefishpro.space.k7.e(cVar, null, 5), aVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }

    public static Object j(c cVar, Uri uri, com.gamericefishpro.space.th.a frame) {
        h hVar = new h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        cVar.a.registerTrigger(uri, new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.y3.b(hVar));
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.a;
    }

    public static Object l(c cVar, e eVar, com.gamericefishpro.space.th.a aVar) {
        new h(1, com.gamericefishpro.space.uh.f.b(aVar)).s();
        MeasurementManager measurementManager = cVar.a;
        throw null;
    }

    public static Object n(c cVar, f fVar, com.gamericefishpro.space.th.a aVar) {
        new h(1, com.gamericefishpro.space.uh.f.b(aVar)).s();
        MeasurementManager measurementManager = cVar.a;
        throw null;
    }

    public Object a(a aVar, com.gamericefishpro.space.th.a aVar2) {
        return b(this, aVar, aVar2);
    }

    public Object c(com.gamericefishpro.space.th.a aVar) {
        return d(this, aVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, com.gamericefishpro.space.th.a aVar) {
        return g(this, uri, inputEvent, aVar);
    }

    public Object f(d dVar, com.gamericefishpro.space.th.a aVar) {
        return h(this, dVar, aVar);
    }

    public Object i(Uri uri, com.gamericefishpro.space.th.a aVar) {
        return j(this, uri, aVar);
    }

    public Object k(e eVar, com.gamericefishpro.space.th.a aVar) {
        return l(this, eVar, aVar);
    }

    public Object m(f fVar, com.gamericefishpro.space.th.a aVar) {
        return n(this, fVar, aVar);
    }
}
