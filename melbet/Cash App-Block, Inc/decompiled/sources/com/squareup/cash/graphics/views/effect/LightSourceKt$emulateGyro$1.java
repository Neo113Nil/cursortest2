package com.squareup.cash.graphics.views.effect;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LightSourceKt$emulateGyro$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $callback;
    public float F$0;
    public float F$1;
    public float F$2;
    public float F$3;
    public float F$4;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Ref$ObjectRef L$1;
    public Function1 L$3;
    public Iterator L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightSourceKt$emulateGyro$1(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LightSourceKt$emulateGyro$1 lightSourceKt$emulateGyro$1 = new LightSourceKt$emulateGyro$1(this.$callback, continuation);
        lightSourceKt$emulateGyro$1.L$0 = obj;
        return lightSourceKt$emulateGyro$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LightSourceKt$emulateGyro$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00f5 -> B:5:0x00f6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef m;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        float f = 3.1415927f;
        float f2 = 1.0f;
        int i2 = 1;
        if (i == 0) {
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
            m.element = LightSource.Default;
            if (JobKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            float f3 = this.F$4;
            float f4 = this.F$3;
            float f5 = this.F$2;
            float f6 = this.F$1;
            float f7 = this.F$0;
            Iterator it = this.L$4;
            Function1 function1 = this.L$3;
            Ref$ObjectRef ref$ObjectRef = this.L$1;
            SafeTrace.throwOnFailure(obj);
            int i4 = i3;
            m = ref$ObjectRef;
            float f8 = 1.0f;
            int i5 = 1;
            i2 = i5;
            f2 = f8;
            f = 3.1415927f;
            if (it.hasNext()) {
                f8 = f2;
                float cos = f8 - ((((float) Math.cos((((Number) it.next()).intValue() * f) / 300.0f)) * (-0.5f)) + 0.5f);
                float f9 = f3;
                LightSource lightSource = new LightSource(f6 - (cos * f4), f5 - (cos * f3), 0L);
                m.element = lightSource;
                function1.invoke(lightSource);
                this.L$0 = coroutineScope;
                this.L$1 = m;
                this.L$3 = function1;
                this.L$4 = it;
                this.F$0 = f7;
                this.F$1 = f6;
                this.F$2 = f5;
                this.F$3 = f4;
                this.F$4 = f9;
                this.I$0 = i4;
                i5 = 1;
                this.label = 1;
                if (JobKt.delay(16L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                f3 = f9;
                i2 = i5;
                f2 = f8;
                f = 3.1415927f;
                if (it.hasNext()) {
                }
            }
            if (JobKt.isActive(coroutineScope)) {
                float f10 = ((LightSource) m.element).xAngle - 1.5707964f;
                if (f10 == RecyclerView.DECELERATION_RATE) {
                    float f11 = 0.5235988f + 1.5707964f;
                    Random.Default.getClass();
                    float nextFloat = ((((Random.defaultRandom.nextFloat() * 2.0f) - f2) * f) / 8.0f) + 1.5707964f;
                    LightSource lightSource2 = (LightSource) m.element;
                    float f12 = f11 - lightSource2.xAngle;
                    float f13 = nextFloat - lightSource2.yAngle;
                    i4 = 0;
                    it = new IntRange(0, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, i2).iterator();
                    function1 = this.$callback;
                    f7 = f10;
                    f3 = f13;
                    f4 = f12;
                    f6 = f11;
                    f5 = nextFloat;
                } else {
                    float f14 = ((-1.0f) * f10) + 1.5707964f;
                    Random.Default.getClass();
                    float nextFloat2 = ((((Random.defaultRandom.nextFloat() * 2.0f) - f2) * f) / 8.0f) + 1.5707964f;
                    LightSource lightSource3 = (LightSource) m.element;
                    float f15 = f14 - lightSource3.xAngle;
                    float f16 = nextFloat2 - lightSource3.yAngle;
                    i4 = 0;
                    it = new IntRange(0, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, i2).iterator();
                    function1 = this.$callback;
                    f7 = f10;
                    f3 = f16;
                    f4 = f15;
                    f6 = f14;
                    f5 = nextFloat2;
                }
                if (it.hasNext()) {
                }
                if (JobKt.isActive(coroutineScope)) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
