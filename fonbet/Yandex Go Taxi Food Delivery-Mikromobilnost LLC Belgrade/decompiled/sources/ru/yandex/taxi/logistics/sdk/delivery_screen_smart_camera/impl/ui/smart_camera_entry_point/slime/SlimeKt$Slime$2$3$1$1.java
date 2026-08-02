package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.fwi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.SlimeKt$Slime$2$3$1$1", f = "Slime.kt", l = {145, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SlimeKt$Slime$2$3$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ tse $coroutineScope;
    final /* synthetic */ fwi $density;
    final /* synthetic */ oz40 $dragAmount$delegate;
    final /* synthetic */ sls $onSwipeFinished;
    final /* synthetic */ float $screenWidthPx;
    final /* synthetic */ c $state;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlimeKt$Slime$2$3$1$1(c cVar, float f, fwi fwiVar, oz40 oz40Var, tse tseVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = cVar;
        this.$screenWidthPx = f;
        this.$density = fwiVar;
        this.$dragAmount$delegate = oz40Var;
        this.$coroutineScope = tseVar;
        this.$onSwipeFinished = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlimeKt$Slime$2$3$1$1 slimeKt$Slime$2$3$1$1 = new SlimeKt$Slime$2$3$1$1(this.$state, this.$screenWidthPx, this.$density, this.$dragAmount$delegate, this.$coroutineScope, this.$onSwipeFinished, continuation);
        slimeKt$Slime$2$3$1$1.L$0 = obj;
        return slimeKt$Slime$2$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlimeKt$Slime$2$3$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (r7 != r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x003e, code lost:
    
        if (r3 == r2) goto L56;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x014d -> B:6:0x0150). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        long j;
        boolean z;
        Ref$BooleanRef ref$BooleanRef;
        boolean z2;
        Object a;
        f fVar;
        List list;
        Object obj2;
        SlimeKt$Slime$2$3$1$1 slimeKt$Slime$2$3$1$1 = this;
        f fVar2 = (f) slimeKt$Slime$2$3$1$1.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = slimeKt$Slime$2$3$1$1.label;
        int i2 = 2;
        float f = 0.0f;
        Object obj3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            slimeKt$Slime$2$3$1$1.L$0 = fVar2;
            slimeKt$Slime$2$3$1$1.label = 1;
            b = z.b(fVar2, null, slimeKt$Slime$2$3$1$1, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = slimeKt$Slime$2$3$1$1.Z$0;
                j = slimeKt$Slime$2$3$1$1.J$0;
                ref$BooleanRef = (Ref$BooleanRef) slimeKt$Slime$2$3$1$1.L$2;
                kotlin.b.b(obj);
                a = obj;
                List<zvd0> list2 = ((tvd0) a).a;
                tse tseVar = slimeKt$Slime$2$3$1$1.$coroutineScope;
                oz40 oz40Var = slimeKt$Slime$2$3$1$1.$dragAmount$delegate;
                c cVar = slimeKt$Slime$2$3$1$1.$state;
                sls slsVar = slimeKt$Slime$2$3$1$1.$onSwipeFinished;
                for (zvd0 zvd0Var : list2) {
                    float f2 = f;
                    if (zvd0Var.d) {
                        list = list2;
                        fVar = fVar2;
                        long e = wu60.e(zvd0Var.c, zvd0Var.g);
                        if (wu60.d(e) > f2) {
                            ref$BooleanRef.element = true;
                            oz40Var.setValue(new wu60(wu60.e(((wu60) oz40Var.getValue()).a, e)));
                            obj2 = null;
                            tje.N(tseVar, null, null, new SlimeKt$Slime$2$3$1$1$1$1(cVar, zvd0Var, oz40Var, null), 3);
                            zvd0Var.a();
                        } else {
                            obj2 = null;
                        }
                    } else {
                        fVar = fVar2;
                        list = list2;
                        obj2 = null;
                        if (ref$BooleanRef.element) {
                            tje.N(tseVar, null, null, new SlimeKt$Slime$2$3$1$1$1$2(cVar, slsVar, null), 3);
                        } else {
                            tje.N(tseVar, null, null, new SlimeKt$Slime$2$3$1$1$1$3(cVar, slsVar, null), 3);
                        }
                        zvd0Var.a();
                    }
                    list2 = list;
                    obj3 = obj2;
                    f = f2;
                    fVar2 = fVar;
                }
                f fVar3 = fVar2;
                float f3 = f;
                Object obj4 = obj3;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((zvd0) it.next()).d) {
                            slimeKt$Slime$2$3$1$1 = this;
                            obj3 = obj4;
                            f = f3;
                            fVar2 = fVar3;
                            i2 = 2;
                            PointerEventPass pointerEventPass = PointerEventPass.Main;
                            slimeKt$Slime$2$3$1$1.L$0 = fVar2;
                            slimeKt$Slime$2$3$1$1.L$1 = obj3;
                            slimeKt$Slime$2$3$1$1.L$2 = ref$BooleanRef;
                            slimeKt$Slime$2$3$1$1.J$0 = j;
                            slimeKt$Slime$2$3$1$1.Z$0 = z2;
                            slimeKt$Slime$2$3$1$1.label = i2;
                            a = fVar2.a(pointerEventPass, slimeKt$Slime$2$3$1$1);
                        }
                    }
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        j = ((zvd0) b).c;
        float floatValue = slimeKt$Slime$2$3$1$1.$state.f.getFloatValue();
        float c = slimeKt$Slime$2$3$1$1.$state.c();
        float f4 = slimeKt$Slime$2$3$1$1.$screenWidthPx;
        float f5 = (int) (fVar2.y.C >> 32);
        float f6 = (int) (fVar2.y.C & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        fwi fwiVar = slimeKt$Slime$2$3$1$1.$density;
        float f7 = (c * 0.92f) + 0.08f;
        float max = Math.max(0.0f, f7 <= 0.7f ? f7 : ((1.0f - f7) / 0.3f) * 0.7f) * f4;
        float w0 = fwiVar.w0(0.0f);
        float f8 = w0 * 0.5f;
        float f9 = floatValue - f8;
        float f10 = floatValue + f8;
        float max2 = Math.max(fwiVar.w0(32.0f), (f6 - w0) * 0.5f * f7 * 1.8f);
        float max3 = Math.max(f9 - max2, 0.0f);
        float min = Math.min(max2 + f10, f6);
        if (max <= f5) {
            f5 = max;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat2 = Float.intBitsToFloat(i3);
        if (intBitsToFloat < f5) {
            z = false;
            if (intBitsToFloat2 >= f9) {
            }
        }
        z = true;
        if (z) {
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            nzs.i(0L, slimeKt$Slime$2$3$1$1.$dragAmount$delegate);
            c cVar2 = slimeKt$Slime$2$3$1$1.$state;
            cVar2.d = cVar2.f.getFloatValue();
            cVar2.e = Float.intBitsToFloat(i3);
            ref$BooleanRef = ref$BooleanRef2;
            z2 = z;
            PointerEventPass pointerEventPass2 = PointerEventPass.Main;
            slimeKt$Slime$2$3$1$1.L$0 = fVar2;
            slimeKt$Slime$2$3$1$1.L$1 = obj3;
            slimeKt$Slime$2$3$1$1.L$2 = ref$BooleanRef;
            slimeKt$Slime$2$3$1$1.J$0 = j;
            slimeKt$Slime$2$3$1$1.Z$0 = z2;
            slimeKt$Slime$2$3$1$1.label = i2;
            a = fVar2.a(pointerEventPass2, slimeKt$Slime$2$3$1$1);
        }
        return zy11.a;
    }
}
