package ru.yandex.taxi.layers.analytics;

import defpackage.byx;
import defpackage.i3y;
import defpackage.lx4;
import defpackage.wwx;
import defpackage.zyx;
import io.appmetrica.analytics.rtm.internal.Constants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class a implements zyx {
    public final lx4 a;
    public final i3y b = kotlin.a.a(new wwx(4));
    public LayersPerformanceAnalyticsImpl$FrameTimesSnapshot c;
    public LayersPerformanceAnalyticsImpl$FrameTimesSnapshot d;
    public volatile long e;

    public a(lx4 lx4Var) {
        this.a = lx4Var;
    }

    @Override // defpackage.zyx
    public final void a() {
        LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot = this.d;
        if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot == null) {
            return;
        }
        layersPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        h("LayersPerf.MapMove", layersPerformanceAnalyticsImpl$FrameTimesSnapshot);
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.zyx
    public final void b(byx byxVar, LayersService layersService, int i, long j) {
        i("LayersPerf.Response", j, i, layersService, byxVar);
        this.e = System.currentTimeMillis() - j;
    }

    @Override // defpackage.zyx
    public final void c(byx byxVar, LayersService layersService, int i, long j) {
        i("LayersPerf.Parsing", j, i, layersService, byxVar);
    }

    @Override // defpackage.zyx
    public final void d(byx byxVar, LayersService layersService, int i, long j) {
        i("LayersPerf.Preparing", j, i, layersService, byxVar);
    }

    @Override // defpackage.zyx
    public final void e(byx byxVar, int i) {
        if (this.d != null || i == 0) {
            return;
        }
        LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot = new LayersPerformanceAnalyticsImpl$FrameTimesSnapshot(this, byxVar, i);
        layersPerformanceAnalyticsImpl$FrameTimesSnapshot.start();
        this.d = layersPerformanceAnalyticsImpl$FrameTimesSnapshot;
    }

    @Override // defpackage.zyx
    public final void f() {
        LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot = this.c;
        if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        layersPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        h("LayersPerf.MapUpdate", layersPerformanceAnalyticsImpl$FrameTimesSnapshot);
        i("LayersPerf.TotalDuration", currentTimeMillis, layersPerformanceAnalyticsImpl$FrameTimesSnapshot.getCollectionSize(), null, layersPerformanceAnalyticsImpl$FrameTimesSnapshot.getLayersCondition());
        this.c = null;
    }

    @Override // defpackage.zyx
    public final void g(byx byxVar, int i) {
        LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot = this.c;
        if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot == null && i != 0) {
            if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot != null) {
                layersPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
            }
            LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot2 = new LayersPerformanceAnalyticsImpl$FrameTimesSnapshot(this, byxVar, i);
            layersPerformanceAnalyticsImpl$FrameTimesSnapshot2.start();
            this.c = layersPerformanceAnalyticsImpl$FrameTimesSnapshot2;
        }
    }

    public final void h(String str, LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot) {
        if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot.getFrameTimes().size() == 0) {
            return;
        }
        i d = ((j) this.a).d(str);
        d.d("frameTimes", layersPerformanceAnalyticsImpl$FrameTimesSnapshot.toString());
        d.b(layersPerformanceAnalyticsImpl$FrameTimesSnapshot.getCollectionSize(), "collectionSize");
        d.d(MetaDataField.SCREEN_FIELD, layersPerformanceAnalyticsImpl$FrameTimesSnapshot.getLayersCondition().a.getAnalyticsName());
        d.d("mode", layersPerformanceAnalyticsImpl$FrameTimesSnapshot.getLayersCondition().b.a.getAnalyticsName());
        d.m();
    }

    public final void i(String str, long j, int i, LayersService layersService, byx byxVar) {
        if (i == 0) {
            return;
        }
        i d = ((j) this.a).d(str);
        if (layersService != null) {
            d.d(Constants.KEY_SERVICE, layersService.getAnalyticsName());
        }
        d.b(i, "collectionSize");
        d.c(j, "duration");
        d.d(MetaDataField.SCREEN_FIELD, byxVar.a.getAnalyticsName());
        d.d("mode", byxVar.b.a.getAnalyticsName());
        d.m();
    }

    @Override // defpackage.zyx
    public final void pause() {
        LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot = this.c;
        if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot != null) {
            layersPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        }
        this.c = null;
        LayersPerformanceAnalyticsImpl$FrameTimesSnapshot layersPerformanceAnalyticsImpl$FrameTimesSnapshot2 = this.d;
        if (layersPerformanceAnalyticsImpl$FrameTimesSnapshot2 != null) {
            layersPerformanceAnalyticsImpl$FrameTimesSnapshot2.stop();
        }
        this.d = null;
    }
}
