package ru.yandex.taxi.preorder.map;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.runtime.image.ImageProvider;
import defpackage.f4c0;
import defpackage.get0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyb0;
import defpackage.ryb0;
import defpackage.syb0;
import defpackage.tse;
import defpackage.tyb0;
import defpackage.uyb0;
import defpackage.vyb0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wyb0;
import defpackage.xyb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$sourceIconResultFlow$3$1", f = "RouteOverlayIconHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayIconHolder$sourceIconResultFlow$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ xyb0 $confirmationState;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$sourceIconResultFlow$3$1(n nVar, xyb0 xyb0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$confirmationState = xyb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteOverlayIconHolder$sourceIconResultFlow$3$1(this.this$0, this.$confirmationState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RouteOverlayIconHolder$sourceIconResultFlow$3$1 routeOverlayIconHolder$sourceIconResultFlow$3$1 = (RouteOverlayIconHolder$sourceIconResultFlow$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routeOverlayIconHolder$sourceIconResultFlow$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        nyb0 nyb0Var = this.this$0.p;
        xyb0 xyb0Var = this.$confirmationState;
        nyb0Var.getClass();
        if (jl40.l(xyb0Var, syb0.a)) {
            nyb0Var.b();
            f4c0 f4c0Var = nyb0Var.e;
            if (f4c0Var != null) {
                f4c0Var.d();
            }
            f4c0 f4c0Var2 = nyb0Var.f;
            if (f4c0Var2 != null) {
                f4c0Var2.d();
            }
        } else {
            final int i = 0;
            if (xyb0Var instanceof vyb0) {
                final vyb0 vyb0Var = (vyb0) xyb0Var;
                uyb0 uyb0Var = vyb0Var.c;
                h3y h3yVar = nyb0Var.b;
                if (((Rect) ((get0) h3yVar.get()).e.getValue()).isEmpty()) {
                    nyb0Var.d(false);
                } else {
                    get0 get0Var = (get0) h3yVar.get();
                    f4c0 f4c0Var3 = nyb0Var.d;
                    if (f4c0Var3 != null) {
                        nyb0Var.c(f4c0Var3, (Rect) get0Var.e.getValue(), vyb0Var.a, Integer.valueOf(kyh0.common_edit), uyb0Var.b);
                    }
                    f4c0 f4c0Var4 = nyb0Var.e;
                    final int i2 = 1;
                    if (f4c0Var4 != null) {
                        Rect rect = (Rect) get0Var.a.getValue();
                        ImageProvider imageProvider = f4c0Var4.k;
                        Bitmap bitmap = imageProvider != null ? imageProvider.get$image() : null;
                        boolean z = (bitmap != null && bitmap.getHeight() == rect.height() && bitmap.getWidth() == rect.width()) ? false : true;
                        if (bitmap == null || z) {
                            f4c0Var4.x(nyb0Var.a(rect));
                        }
                        f4c0Var4.D(new IconStyle().setAnchor((PointF) get0Var.c.getValue()));
                        Rect rect2 = (Rect) get0Var.a.getValue();
                        uyb0 uyb0Var2 = vyb0Var.b;
                        nyb0Var.c(f4c0Var4, rect2, uyb0Var2.a, null, uyb0Var2.b);
                    }
                    f4c0 f4c0Var5 = nyb0Var.f;
                    if (f4c0Var5 != null) {
                        Rect rect3 = (Rect) get0Var.b.getValue();
                        ImageProvider imageProvider2 = f4c0Var5.k;
                        Bitmap bitmap2 = imageProvider2 != null ? imageProvider2.get$image() : null;
                        boolean z2 = (bitmap2 != null && bitmap2.getHeight() == rect3.height() && bitmap2.getWidth() == rect3.width()) ? false : true;
                        if (bitmap2 == null || z2) {
                            f4c0Var5.x(nyb0Var.a(rect3));
                        }
                        f4c0Var5.D(new IconStyle().setAnchor((PointF) get0Var.d.getValue()));
                        nyb0Var.c(f4c0Var5, (Rect) get0Var.b.getValue(), uyb0Var.a, null, uyb0Var.b);
                    }
                    f4c0 f4c0Var6 = nyb0Var.e;
                    if (f4c0Var6 != null) {
                        f4c0Var6.g(new MapObjectTapListener() { // from class: myb0
                            @Override // com.yandex.mapkit.map.MapObjectTapListener
                            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                                int i3 = i;
                                vyb0 vyb0Var2 = vyb0Var;
                                switch (i3) {
                                    case 0:
                                        vyb0Var2.b.b.invoke();
                                        break;
                                    default:
                                        vyb0Var2.c.b.invoke();
                                        break;
                                }
                                return true;
                            }
                        });
                    }
                    f4c0 f4c0Var7 = nyb0Var.f;
                    if (f4c0Var7 != null) {
                        f4c0Var7.g(new MapObjectTapListener() { // from class: myb0
                            @Override // com.yandex.mapkit.map.MapObjectTapListener
                            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                                int i3 = i2;
                                vyb0 vyb0Var2 = vyb0Var;
                                switch (i3) {
                                    case 0:
                                        vyb0Var2.b.b.invoke();
                                        break;
                                    default:
                                        vyb0Var2.c.b.invoke();
                                        break;
                                }
                                return true;
                            }
                        });
                    }
                    nyb0Var.f();
                    nyb0Var.d(true);
                }
            } else {
                if (!jl40.l(xyb0Var, wyb0.a) && !jl40.l(xyb0Var, tyb0.a) && !jl40.l(xyb0Var, ryb0.a)) {
                    w511.b();
                    return null;
                }
                f4c0 f4c0Var8 = nyb0Var.e;
                if (f4c0Var8 != null) {
                    f4c0Var8.g(null);
                }
                f4c0 f4c0Var9 = nyb0Var.f;
                if (f4c0Var9 != null) {
                    f4c0Var9.g(null);
                }
                nyb0Var.d(false);
            }
        }
        return zy11.a;
    }
}
