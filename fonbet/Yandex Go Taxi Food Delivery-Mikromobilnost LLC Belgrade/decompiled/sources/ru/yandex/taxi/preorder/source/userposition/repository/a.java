package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.Location;
import defpackage.bvf0;
import defpackage.ccz;
import defpackage.cne0;
import defpackage.d8;
import defpackage.dne0;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rd7;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yw60;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class a implements yw60 {
    public final tt2 a;
    public final ccz b;
    public final cne0 d;
    public final i3y c = kotlin.a.a(new rd7(this, 0));
    public final r0 e = bvf0.c(null);
    public final fyc f = gwk0.b();
    public kotlinx.coroutines.c g = kotlinx.coroutines.a.a();
    public kotlinx.coroutines.c h = kotlinx.coroutines.a.a();

    public a(dne0 dne0Var, tt2 tt2Var, ccz cczVar) {
        this.a = tt2Var;
        this.b = cczVar;
        this.d = dne0Var.a("prefs_location");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        CachedLocationRepositoryImpl$fetch$1 cachedLocationRepositoryImpl$fetch$1;
        int i;
        Location location;
        if (continuationImpl instanceof CachedLocationRepositoryImpl$fetch$1) {
            cachedLocationRepositoryImpl$fetch$1 = (CachedLocationRepositoryImpl$fetch$1) continuationImpl;
            int i2 = cachedLocationRepositoryImpl$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cachedLocationRepositoryImpl$fetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cachedLocationRepositoryImpl$fetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cachedLocationRepositoryImpl$fetch$1.label;
                ccz cczVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc fycVar = this.f;
                    if (!fycVar.k0()) {
                        cczVar.getClass();
                    }
                    cachedLocationRepositoryImpl$fetch$1.label = 1;
                    if (fycVar.s(cachedLocationRepositoryImpl$fetch$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object value = this.e.getValue();
                location = (Location) value;
                if (location != null) {
                    location.getLatitude();
                    location.getLongitude();
                }
                cczVar.getClass();
                return value;
            }
        }
        cachedLocationRepositoryImpl$fetch$1 = new CachedLocationRepositoryImpl$fetch$1(this, continuationImpl);
        Object obj2 = cachedLocationRepositoryImpl$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cachedLocationRepositoryImpl$fetch$1.label;
        ccz cczVar2 = this.b;
        if (i != 0) {
        }
        Object value2 = this.e.getValue();
        location = (Location) value2;
        if (location != null) {
        }
        cczVar2.getClass();
        return value2;
    }

    @Override // defpackage.yw60
    public final void e() {
        hbp0 hbp0Var = (hbp0) this.c.getValue();
        this.a.getClass();
        sjh sjhVar = uyj.a;
        pzt0 e = hbp0.e(hbp0Var, mdh.b, null, new CachedLocationRepositoryImpl$onAppCreated$1(this, null), 2);
        e.w(new d8(8, this));
        this.g = e;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "CachedLocationRepositoryImpl";
    }

    public final Location i() {
        Location location = (Location) this.e.getValue();
        if (location != null) {
            location.getLatitude();
            location.getLongitude();
        }
        this.b.getClass();
        return location;
    }

    public final void j(Location location) {
        this.h.a(null);
        this.h = hbp0.e((hbp0) this.c.getValue(), null, null, new CachedLocationRepositoryImpl$save$1(this, location, null), 3);
    }

    @Override // defpackage.yw60
    public final void l() {
        this.g.a(null);
        this.h.a(null);
        ((hbp0) this.c.getValue()).b();
    }
}
