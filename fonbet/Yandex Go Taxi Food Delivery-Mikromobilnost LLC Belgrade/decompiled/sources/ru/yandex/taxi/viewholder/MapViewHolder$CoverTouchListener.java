package ru.yandex.taxi.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.kf00;
import defpackage.orb1;
import defpackage.qt00;
import defpackage.ssu;
import defpackage.te61;
import defpackage.vez0;
import defpackage.y6i0;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.map_common.ZoomCatcher$CatchResult;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"ru/yandex/taxi/viewholder/MapViewHolder$CoverTouchListener", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "<init>", "(Lru/yandex/taxi/viewholder/b;Landroid/content/Context;)V", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "e", "onSingleTapConfirmed", "(Landroid/view/MotionEvent;)Z", "onDoubleTapEvent", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "map_fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
final class MapViewHolder$CoverTouchListener extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    private final GestureDetector gestureDetector;
    final /* synthetic */ b this$0;

    public MapViewHolder$CoverTouchListener(b bVar, Context context) {
        this.this$0 = bVar;
        this.gestureDetector = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent e) {
        b bVar = this.this$0;
        Iterator it = bVar.p.iterator();
        while (it.hasNext()) {
            ((qt00) it.next()).onMapExpanded();
            bVar.q = true;
        }
        return super.onDoubleTapEvent(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent e) {
        boolean z;
        Iterator it = this.this$0.p.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                if (((qt00) it.next()).onMapTapped(e.getX(), e.getY()) || z) {
                    z = true;
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onSingleTapConfirmed(e);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        ZoomCatcher$CatchResult zoomCatcher$CatchResult;
        TaxiMapView d;
        if (this.this$0.d() == null) {
            return false;
        }
        te61 te61Var = this.this$0.d;
        ah00 ah00Var = te61Var.b;
        if (event.getPointerCount() > 1) {
            zoomCatcher$CatchResult = ZoomCatcher$CatchResult.SKIPPED;
        } else {
            int action = event.getAction();
            if (action == 0) {
                te61Var.d = event.getX();
                te61Var.e = event.getY();
                te61Var.f = event.getX();
                te61Var.g = event.getY();
                float f = te61Var.k;
                TaxiMapView h = ((gh00) ah00Var).h();
                boolean z = ((float) (h != null ? h.getWidth() : 0)) - event.getX() <= f;
                if (event.getX() > f && !z) {
                    te61Var.j = false;
                } else {
                    te61Var.j = true;
                    te61Var.i = z;
                }
                zoomCatcher$CatchResult = ZoomCatcher$CatchResult.SKIPPED;
            } else if (action != 2) {
                if (te61Var.c) {
                    event.setLocation(te61Var.f, te61Var.g);
                    Float f2 = te61Var.h;
                    if (f2 != null) {
                        float floatValue = f2.floatValue();
                        float j = ((gh00) ah00Var).j();
                        kf00 kf00Var = te61Var.a;
                        double d2 = floatValue;
                        double d3 = j;
                        String str = te61Var.i ? "right" : "left";
                        kf00Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("side", str);
                        hashMap.put("start_zoom", Double.valueOf(d2));
                        hashMap.put("stop_zoom", Double.valueOf(d3));
                        kf00Var.a.a("Map.ZoomScrolled", hashMap, 1, new HashMap());
                    }
                    te61Var.h = null;
                    te61Var.j = false;
                    te61Var.c = false;
                }
                zoomCatcher$CatchResult = ZoomCatcher$CatchResult.SKIPPED;
            } else if (!te61Var.j && !te61Var.c) {
                zoomCatcher$CatchResult = ZoomCatcher$CatchResult.SKIPPED;
            } else if (te61Var.c || orb1.c(te61Var.d, te61Var.e, event.getX(), event.getY(), te61Var.n)) {
                float abs = Math.abs(event.getX() - te61Var.d);
                float abs2 = Math.abs(event.getY() - te61Var.e);
                if (te61Var.j) {
                    if (abs2 > abs * te61Var.m) {
                        float j2 = ((gh00) ah00Var).j();
                        te61Var.c = true;
                        te61Var.h = Float.valueOf(j2);
                    }
                    te61Var.j = false;
                }
                if (te61Var.c) {
                    gh00 gh00Var = (gh00) ah00Var;
                    float floatValue2 = ((Number) y6i0.h(Float.valueOf((vez0.R(event.getY() - te61Var.e, Resources.getSystem().getDisplayMetrics()) / te61Var.l) + gh00Var.j()), gh00Var.k())).floatValue();
                    te61Var.e = event.getY();
                    gh00Var.J(floatValue2);
                    zoomCatcher$CatchResult = ZoomCatcher$CatchResult.CATCHED;
                } else {
                    zoomCatcher$CatchResult = ZoomCatcher$CatchResult.SKIPPED;
                }
            } else {
                zoomCatcher$CatchResult = ZoomCatcher$CatchResult.TOUCH_SLOP;
            }
        }
        if (zoomCatcher$CatchResult != ZoomCatcher$CatchResult.TOUCH_SLOP && zoomCatcher$CatchResult != ZoomCatcher$CatchResult.CATCHED && (d = this.this$0.d()) != null && d.isEnabled()) {
            this.this$0.q = false;
            this.gestureDetector.onTouchEvent(event);
            int actionMasked = event.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        b bVar = this.this$0;
                        bVar.r = true;
                        if (bVar.s) {
                            bVar.e();
                        }
                    } else if (actionMasked != 3 && actionMasked != 4) {
                        b bVar2 = this.this$0;
                        bVar2.r = false;
                        Iterator it = bVar2.p.iterator();
                        while (it.hasNext()) {
                            ((qt00) it.next()).onMapReleased();
                        }
                        b bVar3 = this.this$0;
                        Handler handler = bVar3.l;
                        ssu ssuVar = bVar3.n;
                        handler.removeCallbacks(ssuVar);
                        handler.postDelayed(ssuVar, 700L);
                    }
                }
                b bVar4 = this.this$0;
                bVar4.r = false;
                Iterator it2 = bVar4.p.iterator();
                while (it2.hasNext()) {
                    ((qt00) it2.next()).onMapReleased();
                }
                b bVar5 = this.this$0;
                Handler handler2 = bVar5.l;
                ssu ssuVar2 = bVar5.n;
                handler2.removeCallbacks(ssuVar2);
                handler2.postDelayed(ssuVar2, 700L);
            } else {
                Iterator it3 = this.this$0.p.iterator();
                while (it3.hasNext()) {
                    ((qt00) it3.next()).onMapPressed();
                }
                b bVar6 = this.this$0;
                bVar6.l.removeCallbacks(bVar6.n);
                this.this$0.h();
                b bVar7 = this.this$0;
                bVar7.s = false;
                bVar7.r = false;
            }
            TaxiMapView d4 = this.this$0.d();
            if (d4 != null) {
                d4.dispatchTouchEvent(event);
            }
        }
        return true;
    }
}
