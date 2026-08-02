package yads;

import android.content.Context;
import defpackage.a081;
import defpackage.ge71;
import defpackage.gg81;
import defpackage.kd71;
import defpackage.kn1;
import defpackage.mj71;
import defpackage.s881;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wvb1;
import defpackage.y381;
import defpackage.z371;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class ih extends SuspendLambda implements wls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ ge71 c;
    public final /* synthetic */ tse d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, ge71 ge71Var, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = ge71Var;
        this.d = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ih(this.b, this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ih) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        try {
            if (mj71.b != null) {
                zy11 zy11Var = zy11.a;
                mj71.a.set(false);
                return zy11Var;
            }
            a081 a081Var = a081.g;
            if (a081Var == null) {
                synchronized (a081.f) {
                    a081Var = a081.g;
                    if (a081Var == null) {
                        a081Var = new a081();
                        a081.g = a081Var;
                    }
                }
            }
            gg81 a = a081Var.a(this.b);
            if (a != null && a.l0) {
                Object obj2 = a.q0;
                if (obj2 == null) {
                    obj2 = EmptySet.a;
                }
                Integer num = a.m0;
                int intValue = num != null ? num.intValue() : 10;
                Integer num2 = a.n0;
                int intValue2 = num2 != null ? num2.intValue() : 91;
                Boolean bool = a.o0;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                kn1 kn1Var = new kn1(obj2, intValue, intValue2, 10);
                z371 z371Var = new z371(this.b);
                wvb1 wvb1Var = new wvb1(this.c, booleanValue);
                y381 y381Var = new y381(s881.a(this.b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = mj71.a;
                mj71.b = new kd71(kn1Var, this.d, z371Var, wvb1Var, y381Var, this.c);
                kd71 kd71Var = mj71.b;
                if (kd71Var != null && !kd71Var.h.getAndSet(true)) {
                    tje.N(kd71Var.b, kd71Var.f, null, new gh(kd71Var, null), 2);
                }
            }
            mj71.a.set(false);
            return zy11.a;
        } catch (Throwable th) {
            mj71.a.set(false);
            throw th;
        }
    }
}
