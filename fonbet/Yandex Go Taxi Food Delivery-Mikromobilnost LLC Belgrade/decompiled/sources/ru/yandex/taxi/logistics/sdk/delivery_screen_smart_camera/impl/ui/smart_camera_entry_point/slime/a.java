package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.fwi;
import defpackage.hwd0;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ c a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fwi c;
    public final /* synthetic */ oz40 d;
    public final /* synthetic */ tse e;
    public final /* synthetic */ sls f;

    public a(c cVar, float f, fwi fwiVar, oz40 oz40Var, tse tseVar, sls slsVar) {
        this.a = cVar;
        this.b = f;
        this.c = fwiVar;
        this.d = oz40Var;
        this.e = tseVar;
        this.f = slsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object l = androidx.compose.foundation.gestures.c.l(hwd0Var, new SlimeKt$Slime$2$3$1$1(this.a, this.b, this.c, this.d, this.e, this.f, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }
}
