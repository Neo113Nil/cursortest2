package ru.yandex.taxi.order.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ej60;
import defpackage.h6r;
import defpackage.hst;
import defpackage.i5m;
import defpackage.jc4;
import defpackage.jst;
import defpackage.ky2;
import defpackage.lx4;
import defpackage.pho;
import defpackage.qv10;
import defpackage.r8h;
import defpackage.rgx;
import defpackage.rqo;
import defpackage.s66;
import defpackage.tgx;
import defpackage.v180;
import defpackage.wwg;
import defpackage.xby;
import defpackage.zzf;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/order/services/AbstractKeepAliveService;", "Landroid/app/Service;", "Lrgx;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lzy11;", "onCreate", "onDestroy", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lv180;", "notification", "", "withLocation", "startForeground", "(Lv180;Z)V", "stopForeground", "stopService", "Lru/yandex/taxi/order/services/d;", "presenter", "Lru/yandex/taxi/order/services/d;", "Ljava/util/concurrent/atomic/AtomicReference;", "startIdRef", "Ljava/util/concurrent/atomic/AtomicReference;", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AbstractKeepAliveService extends Service implements rgx {
    private d presenter;
    private final AtomicReference<Integer> startIdRef = new AtomicReference<>(null);

    @Override // defpackage.rgx
    public abstract /* synthetic */ String getServiceName();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzf zzfVar = (zzf) ((h6r) wwg.e(this, h6r.class));
        d dVar = new d((c) zzfVar.M4.get(), (ky2) zzfVar.b0.get(), zzfVar.i1(), (r8h) zzfVar.s.get(), (ej60) zzfVar.Hd.get(), new tgx((lx4) zzfVar.Y.get(), new jc4((pho) zzfVar.d0.get())), i5m.a(zzfVar.r6), new s66((rqo) zzfVar.C.get(), 5));
        this.presenter = dVar;
        dVar.d(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        d dVar = this.presenter;
        if (dVar != null) {
            dVar.g();
        }
        this.presenter = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        qv10.C(new Object[]{Integer.valueOf(startId)}, 1, "KeepAliveServicePresenter::onStart[%s]", jst.e);
        this.startIdRef.set(Integer.valueOf(startId));
        d dVar = this.presenter;
        return (dVar == null || !dVar.h(intent)) ? 2 : 3;
    }

    @Override // defpackage.rgx
    public void startForeground(v180 notification, boolean withLocation) {
        androidx.core.app.e.m(this, notification.a(), notification.c(), withLocation ? 8 : 1);
    }

    @Override // defpackage.rgx
    public void stopForeground() {
        stopForeground(1);
    }

    @Override // defpackage.rgx
    public void stopService() {
        hst hstVar = jst.e;
        qv10.C(new Object[]{this.startIdRef.get()}, 1, "KeepAliveServicePresenter::stopService[%s]", hstVar);
        Integer andSet = this.startIdRef.getAndSet(null);
        if (andSet != null) {
            stopSelfResult(andSet.intValue());
        } else {
            xby.l(hstVar, "KEEP_ALIVE_SERVICE:MISSING_START_ID", null, null, "Stop service without startId", 6);
            stopSelf();
        }
    }
}
