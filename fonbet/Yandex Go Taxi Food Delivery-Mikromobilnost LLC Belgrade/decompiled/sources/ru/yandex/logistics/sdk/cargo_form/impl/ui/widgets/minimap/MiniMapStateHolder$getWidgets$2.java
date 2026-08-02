package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap;

import android.graphics.Bitmap;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bi20;
import defpackage.doe;
import defpackage.fi20;
import defpackage.gi20;
import defpackage.mvg;
import defpackage.ntb0;
import defpackage.ny61;
import defpackage.o690;
import defpackage.t6u0;
import defpackage.vpr;
import defpackage.x2s;
import defpackage.yh20;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Ln351;", "Lyh20;", "staticMapParams", "Lzy11;", "<anonymous>", "(Lvpr;Lyh20;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.MiniMapStateHolder$getWidgets$2", f = "MiniMapStateHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MiniMapStateHolder$getWidgets$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniMapStateHolder$getWidgets$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MiniMapStateHolder$getWidgets$2 miniMapStateHolder$getWidgets$2 = new MiniMapStateHolder$getWidgets$2(this.this$0, (Continuation) obj3);
        miniMapStateHolder$getWidgets$2.L$0 = (vpr) obj;
        miniMapStateHolder$getWidgets$2.L$1 = (yh20) obj2;
        return miniMapStateHolder$getWidgets$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r4 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r1.emit(r4, r21) == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        vpr vprVar = (vpr) this.L$0;
        yh20 yh20Var = (yh20) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        EmptyList emptyList = EmptyList.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (yh20Var == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(emptyList, this) == coroutineSingletons) {
                }
            } else {
                List singletonList = Collections.singletonList(new fi20(yh20Var.a));
                this.L$0 = vprVar;
                this.L$1 = yh20Var;
                this.label = 2;
            }
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i == 2) {
            kotlin.b.b(obj);
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            a = obj;
            Bitmap bitmap = (Bitmap) a;
            if (bitmap == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                return vprVar.emit(emptyList, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            ntb0 ntb0Var = yh20Var.d;
            x2s x2sVar = yh20Var.f;
            o690 o690Var = yh20Var.e;
            String str = yh20Var.a;
            this.this$0.getClass();
            List singletonList2 = Collections.singletonList(new gi20(str, bitmap, ntb0Var, o690Var, x2sVar, new bi20(yh20Var.g, yh20Var.h, x2sVar), yh20Var.i));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 5;
            if (vprVar.emit(singletonList2, this) == coroutineSingletons) {
            }
        }
        ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.domain.a aVar = this.this$0.e;
        doe doeVar = yh20Var.b;
        t6u0 t6u0Var = yh20Var.c;
        this.L$0 = vprVar;
        this.L$1 = yh20Var;
        this.label = 3;
        a = aVar.a(doeVar, t6u0Var, this);
    }
}
