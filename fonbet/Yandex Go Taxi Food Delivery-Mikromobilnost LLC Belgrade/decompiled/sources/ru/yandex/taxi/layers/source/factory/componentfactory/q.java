package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.PointF;
import com.yandex.mapkit.geometry.Point;
import defpackage.f0k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.ym00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class q implements tpr {
    public final /* synthetic */ String A;
    public final /* synthetic */ Point B;
    public final /* synthetic */ vm00 C;
    public final /* synthetic */ o a;
    public final /* synthetic */ r b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f0k w;
    public final /* synthetic */ PointF x;
    public final /* synthetic */ PointF y;
    public final /* synthetic */ ym00 z;

    public q(o oVar, r rVar, int i, f0k f0kVar, PointF pointF, PointF pointF2, ym00 ym00Var, String str, Point point, vm00 vm00Var) {
        this.a = oVar;
        this.b = rVar;
        this.c = i;
        this.w = f0kVar;
        this.x = pointF;
        this.y = pointF2;
        this.z = ym00Var;
        this.A = str;
        this.B = point;
        this.C = vm00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BubbleComponentFactory$createBubbles$$inlined$map$2$1 bubbleComponentFactory$createBubbles$$inlined$map$2$1;
        int i;
        if (continuation instanceof BubbleComponentFactory$createBubbles$$inlined$map$2$1) {
            bubbleComponentFactory$createBubbles$$inlined$map$2$1 = (BubbleComponentFactory$createBubbles$$inlined$map$2$1) continuation;
            int i2 = bubbleComponentFactory$createBubbles$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bubbleComponentFactory$createBubbles$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bubbleComponentFactory$createBubbles$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bubbleComponentFactory$createBubbles$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
                    bubbleComponentFactory$createBubbles$$inlined$map$2$1.L$0 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$1.L$1 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$1.L$2 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$1.label = 1;
                    if (this.a.collect(pVar, bubbleComponentFactory$createBubbles$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        bubbleComponentFactory$createBubbles$$inlined$map$2$1 = new BubbleComponentFactory$createBubbles$$inlined$map$2$1(this, continuation);
        Object obj2 = bubbleComponentFactory$createBubbles$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bubbleComponentFactory$createBubbles$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
