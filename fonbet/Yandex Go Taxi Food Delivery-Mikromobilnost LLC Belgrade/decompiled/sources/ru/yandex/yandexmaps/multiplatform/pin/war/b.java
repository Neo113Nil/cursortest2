package ru.yandex.yandexmaps.multiplatform.pin.war;

import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.maps.core.system.Time;
import defpackage.bvf0;
import defpackage.ewi;
import defpackage.exb0;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.j2c0;
import defpackage.k8c;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.owb0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uub0;
import defpackage.wrr;
import defpackage.zy11;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

/* loaded from: classes7.dex */
public abstract class b {
    public final k8c a;
    public final ike b = bvf0.b();
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public final ewi d;
    public final exb0 e;
    public final wrr f;
    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.logger.a g;
    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback.a h;
    public final a i;
    public boolean j;
    public boolean k;
    public long l;

    public b(k8c k8cVar, float f, uub0 uub0Var, owb0 owb0Var) {
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback.a aVar;
        this.a = k8cVar;
        this.d = new ewi(f, false);
        exb0 exb0Var = new exb0();
        this.e = exb0Var;
        this.f = new wrr(exb0Var);
        this.g = new ru.yandex.yandexmaps.multiplatform.pin.war.internal.logger.a();
        if (owb0Var != null) {
            aVar = new ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback.a();
            aVar.a = owb0Var;
        } else {
            aVar = null;
        }
        this.h = aVar;
        this.i = new a(this);
        this.j = true;
    }

    public static final void a(b bVar) {
        if (bVar.k) {
            bVar.k = false;
            k8c k8cVar = bVar.a;
            CameraListener cameraListener = (CameraListener) ((LinkedHashMap) k8cVar.b).remove(bVar.i);
            if (cameraListener == null) {
                return;
            }
            ((Map) k8cVar.c).removeCameraListener(cameraListener);
        }
    }

    public static void b(b bVar, Collection collection) {
        bVar.getClass();
        if (collection.isEmpty()) {
            return;
        }
        bVar.c();
        bVar.i(new PinWar$add$1(bVar, collection, null));
    }

    public abstract void c();

    public final void d() {
        i(new PinWar$deselectAll$1(this, null));
    }

    public final k8c e() {
        return this.a;
    }

    public final wrr f() {
        return this.f;
    }

    public final void g() {
        i(new PinWar$hideAll$1(this, null));
    }

    public final boolean h() {
        return this.h != null;
    }

    public final void i(tls tlsVar) {
        tje.N(this.b, null, null, new PinWar$launchWithLock$1(this, tlsVar, null), 3);
    }

    public final boolean j(boolean z) {
        long currentTimeMillis = Time.INSTANCE.currentTimeMillis();
        if (!z && this.l + 300 > currentTimeMillis) {
            return true;
        }
        this.l = currentTimeMillis;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r5 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(PinInvalidationReason pinInvalidationReason, List list, ContinuationImpl continuationImpl) {
        PinWar$notifyAboutSyncResult$1 pinWar$notifyAboutSyncResult$1;
        int i;
        j2c0 b;
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback.a aVar;
        if (continuationImpl instanceof PinWar$notifyAboutSyncResult$1) {
            pinWar$notifyAboutSyncResult$1 = (PinWar$notifyAboutSyncResult$1) continuationImpl;
            int i2 = pinWar$notifyAboutSyncResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinWar$notifyAboutSyncResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinWar$notifyAboutSyncResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinWar$notifyAboutSyncResult$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b = this.a.b();
                    pinWar$notifyAboutSyncResult$1.L$0 = pinInvalidationReason;
                    pinWar$notifyAboutSyncResult$1.L$1 = list;
                    pinWar$notifyAboutSyncResult$1.L$2 = null;
                    pinWar$notifyAboutSyncResult$1.L$3 = b;
                    pinWar$notifyAboutSyncResult$1.label = 1;
                    this.g.a(pinWar$notifyAboutSyncResult$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        if (pinWar$notifyAboutSyncResult$1.L$2 != null) {
                            ny61.u();
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    j2c0 j2c0Var = (j2c0) pinWar$notifyAboutSyncResult$1.L$3;
                    if (pinWar$notifyAboutSyncResult$1.L$2 != null) {
                        ny61.u();
                        return null;
                    }
                    list = (List) pinWar$notifyAboutSyncResult$1.L$1;
                    PinInvalidationReason pinInvalidationReason2 = (PinInvalidationReason) pinWar$notifyAboutSyncResult$1.L$0;
                    kotlin.b.b(obj);
                    b = j2c0Var;
                    pinInvalidationReason = pinInvalidationReason2;
                }
                aVar = this.h;
                if (aVar != null) {
                    pinWar$notifyAboutSyncResult$1.L$0 = null;
                    pinWar$notifyAboutSyncResult$1.L$1 = null;
                    pinWar$notifyAboutSyncResult$1.L$2 = null;
                    pinWar$notifyAboutSyncResult$1.L$3 = null;
                    pinWar$notifyAboutSyncResult$1.label = 2;
                    if (aVar.a(pinInvalidationReason, list, b, pinWar$notifyAboutSyncResult$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        pinWar$notifyAboutSyncResult$1 = new PinWar$notifyAboutSyncResult$1(this, continuationImpl);
        Object obj2 = pinWar$notifyAboutSyncResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinWar$notifyAboutSyncResult$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        aVar = this.h;
        if (aVar != null) {
        }
        return zy11Var2;
    }

    public final void l(Collection collection) {
        i(new PinWar$redraw$1(this, collection, null));
    }

    public final void m() {
        c();
        i(new PinWar$redrawAll$1(this, null));
    }

    public final void n(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        c();
        i(new PinWar$remove$1(this, collection, null));
    }

    public final void o() {
        c();
        i(new PinWar$removeAll$1(this, null));
    }

    public final void p(mwb0 mwb0Var) {
        c();
        i(new PinWar$select$1(this, mwb0Var, null));
    }

    public final void q() {
        i(new PinWar$showAll$1(this, null));
    }

    public abstract Object r(boolean z, PinInvalidationReason pinInvalidationReason, ContinuationImpl continuationImpl);
}
