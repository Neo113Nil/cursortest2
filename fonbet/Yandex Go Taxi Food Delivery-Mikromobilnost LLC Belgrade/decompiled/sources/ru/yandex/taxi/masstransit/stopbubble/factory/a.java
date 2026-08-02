package ru.yandex.taxi.masstransit.stopbubble.factory;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.pin.api.widget.b;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.b0c0;
import defpackage.bl00;
import defpackage.e0h0;
import defpackage.ffx;
import defpackage.gdc;
import defpackage.kj40;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.pfu0;
import defpackage.qfu0;
import defpackage.s8o;
import defpackage.sq00;
import defpackage.sy30;
import defpackage.tje;
import defpackage.tog0;
import defpackage.ty30;
import defpackage.uy30;
import defpackage.vy30;
import defpackage.w511;
import defpackage.wy30;
import defpackage.xob1;
import defpackage.zpb1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final kj40 b;
    public final b c;

    public a(Context context, kj40 kj40Var, b bVar) {
        this.a = context;
        this.b = kj40Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pfu0 pfu0Var, ContinuationImpl continuationImpl) {
        StopBubbleUiStateMapper$mapUiState$1 stopBubbleUiStateMapper$mapUiState$1;
        int i;
        String e;
        pfu0 pfu0Var2;
        if (continuationImpl instanceof StopBubbleUiStateMapper$mapUiState$1) {
            stopBubbleUiStateMapper$mapUiState$1 = (StopBubbleUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = stopBubbleUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopBubbleUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stopBubbleUiStateMapper$mapUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopBubbleUiStateMapper$mapUiState$1.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MtTransportType mtTransportType = zpb1.a(pfu0Var.b.getLine().getVehicleTypes()).b;
                    wy30 wy30Var = pfu0Var.c;
                    boolean z = wy30Var instanceof sy30;
                    kj40 kj40Var = this.b;
                    if (z) {
                        sy30 sy30Var = (sy30) wy30Var;
                        List list = sy30Var.d;
                        if (list.isEmpty()) {
                            List list2 = sy30Var.c;
                            kj40Var.getClass();
                            e = kj40.e(2, list2);
                        } else {
                            e = kj40Var.a(2, list);
                        }
                    } else if (wy30Var instanceof ty30) {
                        e = kj40Var.a(2, ((ty30) wy30Var).c);
                    } else if (wy30Var instanceof uy30) {
                        e = kj40Var.d((uy30) wy30Var);
                    } else {
                        if (!(wy30Var instanceof vy30)) {
                            w511.b();
                            return null;
                        }
                        List list3 = ((vy30) wy30Var).c;
                        kj40Var.getClass();
                        e = kj40.e(2, list3);
                    }
                    if (e == null) {
                        e = "";
                    }
                    p0c0 p0c0Var = null;
                    boolean z2 = true;
                    Integer num = null;
                    String str = null;
                    sq00 sq00Var = new sq00(p0c0Var, new b0c0(tje.y(xob1.e(mtTransportType), context), s8o.m(new gdc(tog0.mt_selected_stop_color), context)), z2, num, str, e, kj40Var.c(pfu0Var.b.getLine().getName(), mtTransportType), true, true, null, null, 0.0f, 7705);
                    stopBubbleUiStateMapper$mapUiState$1.L$0 = pfu0Var;
                    stopBubbleUiStateMapper$mapUiState$1.L$1 = null;
                    stopBubbleUiStateMapper$mapUiState$1.label = 1;
                    obj = this.c.h(sq00Var, stopBubbleUiStateMapper$mapUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pfu0Var2 = pfu0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pfu0Var2 = (pfu0) stopBubbleUiStateMapper$mapUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                return new qfu0(pfu0Var2.a, (bl00) obj, new bl00(ImageProvider.fromBitmap(ffx.d0(tje.y(e0h0.ic_selected_stop_point, context), 0, 0, 7)), new IconStyle().setAnchor(new PointF(0.5f, 0.5f))), pfu0Var2.d, pfu0Var2.e);
            }
        }
        stopBubbleUiStateMapper$mapUiState$1 = new StopBubbleUiStateMapper$mapUiState$1(this, continuationImpl);
        Object obj2 = stopBubbleUiStateMapper$mapUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopBubbleUiStateMapper$mapUiState$1.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        return new qfu0(pfu0Var2.a, (bl00) obj2, new bl00(ImageProvider.fromBitmap(ffx.d0(tje.y(e0h0.ic_selected_stop_point, context2), 0, 0, 7)), new IconStyle().setAnchor(new PointF(0.5f, 0.5f))), pfu0Var2.d, pfu0Var2.e);
    }
}
