package kotlinx.coroutines.flow.internal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.ci9;
import defpackage.f73;
import defpackage.hrv;
import defpackage.jb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, HProv.ALG_SID_GR3410_12_256, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $arrayFactory;
    final /* synthetic */ tpr[] $flows;
    final /* synthetic */ vpr $this_combineInternal;
    final /* synthetic */ zls $transform;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend", v = 1)
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tpr[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ ci9 $resultChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr[] tprVarArr, int i, AtomicInteger atomicInteger, ci9 ci9Var, Continuation continuation) {
            super(2, continuation);
            this.$flows = tprVarArr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = ci9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.$flows;
                    int i2 = this.$i;
                    tpr tprVar = tprVarArr[i2];
                    i iVar = new i(this.$resultChannel, i2);
                    this.label = 1;
                    if (tprVar.collect(iVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.$resultChannel.l(null);
                }
                return zy11.a;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.l(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(vpr vprVar, sls slsVar, zls zlsVar, Continuation continuation, tpr[] tprVarArr) {
        super(2, continuation);
        this.$flows = tprVarArr;
        this.$arrayFactory = slsVar;
        this.$transform = zlsVar;
        this.$this_combineInternal = vprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        tpr[] tprVarArr = this.$flows;
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$this_combineInternal, this.$arrayFactory, this.$transform, continuation, tprVarArr);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0149, code lost:
    
        if (r8.invoke(r14, r11, r19) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0172, code lost:
    
        if (r14.invoke(r15, r8, r19) == r3) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc A[LOOP:0: B:17:0x00fc->B:24:0x011d, LOOP_START, PHI: r4 r14
      0x00fc: PHI (r4v4 int) = (r4v3 int), (r4v5 int) binds: [B:13:0x00f7, B:24:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r14v6 hrv) = (r14v5 hrv), (r14v12 hrv) binds: [B:13:0x00f7, B:24:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0149 -> B:7:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0172 -> B:7:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0175 -> B:8:0x014c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        byte[] bArr;
        byte b;
        Object[] objArr;
        ci9 ci9Var;
        int i;
        Object obj2;
        int i2;
        int i3;
        hrv hrvVar;
        jb20 jb20Var = vez0.c;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        byte b2 = 1;
        if (i4 == 0) {
            kotlin.b.b(obj);
            length = this.$flows.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                Arrays.fill(objArr2, 0, length, jb20Var);
                kotlinx.coroutines.channels.a a = sb2.a(length, null, null, 6);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i5 = 0; i5 < length; i5++) {
                    tje.N(tseVar, null, null, new AnonymousClass1(this.$flows, i5, atomicInteger, a, null), 3);
                }
                bArr = new byte[length];
                b = 0;
                objArr = objArr2;
                ci9Var = a;
                i = length;
                b = (byte) (b + b2);
                this.L$0 = null;
                this.L$1 = objArr;
                this.L$2 = ci9Var;
                this.L$3 = null;
                this.L$4 = bArr;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = length;
                this.I$1 = i;
                this.I$2 = b;
                this.label = b2;
                obj2 = ci9Var.h(this);
                if (obj2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return zy11.a;
        }
        if (i4 == 1) {
            ?? r2 = this.I$2;
            i3 = this.I$1;
            i2 = this.I$0;
            byte[] bArr2 = (byte[]) this.L$4;
            ci9Var = (ci9) this.L$2;
            Object[] objArr3 = (Object[]) this.L$1;
            kotlin.b.b(obj);
            obj2 = ((oi9) obj).a;
            b = r2;
            bArr = bArr2;
            objArr = objArr3;
            hrvVar = (hrv) oi9.b(obj2);
            if (hrvVar != null) {
            }
            return zy11.a;
        }
        if (i4 == 2) {
            ?? r22 = this.I$2;
            i3 = this.I$1;
            i2 = this.I$0;
            byte[] bArr3 = (byte[]) this.L$4;
            ci9Var = (ci9) this.L$2;
            Object[] objArr4 = (Object[]) this.L$1;
            kotlin.b.b(obj);
            b = r22;
            bArr = bArr3;
            objArr = objArr4;
        } else {
            if (i4 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r23 = this.I$2;
            i3 = this.I$1;
            i2 = this.I$0;
            byte[] bArr4 = (byte[]) this.L$4;
            ci9Var = (ci9) this.L$2;
            Object[] objArr5 = (Object[]) this.L$1;
            kotlin.b.b(obj);
            b = r23;
            bArr = bArr4;
            objArr = objArr5;
        }
        int i6 = i2;
        i = i3;
        length = i6;
        b2 = 1;
        b = (byte) (b + b2);
        this.L$0 = null;
        this.L$1 = objArr;
        this.L$2 = ci9Var;
        this.L$3 = null;
        this.L$4 = bArr;
        this.L$5 = null;
        this.L$6 = null;
        this.I$0 = length;
        this.I$1 = i;
        this.I$2 = b;
        this.label = b2;
        obj2 = ci9Var.h(this);
        if (obj2 != coroutineSingletons) {
            int i7 = i;
            i2 = length;
            i3 = i7;
            hrvVar = (hrv) oi9.b(obj2);
            if (hrvVar != null) {
                do {
                    int i8 = hrvVar.a;
                    Object obj3 = objArr[i8];
                    objArr[i8] = hrvVar.b;
                    if (obj3 == jb20Var) {
                        i3--;
                    }
                    if (bArr[i8] == b) {
                        break;
                    }
                    bArr[i8] = b;
                    hrvVar = (hrv) oi9.b(ci9Var.g());
                } while (hrvVar != null);
                if (i3 != 0) {
                    int i9 = i2;
                    i = i3;
                    length = i9;
                    b2 = 1;
                    b = (byte) (b + b2);
                    this.L$0 = null;
                    this.L$1 = objArr;
                    this.L$2 = ci9Var;
                    this.L$3 = null;
                    this.L$4 = bArr;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = length;
                    this.I$1 = i;
                    this.I$2 = b;
                    this.label = b2;
                    obj2 = ci9Var.h(this);
                    if (obj2 != coroutineSingletons) {
                    }
                } else {
                    Object[] objArr6 = (Object[]) this.$arrayFactory.invoke();
                    if (objArr6 == null) {
                        zls zlsVar = this.$transform;
                        vpr vprVar = this.$this_combineInternal;
                        this.L$0 = null;
                        this.L$1 = objArr;
                        this.L$2 = ci9Var;
                        this.L$3 = null;
                        this.L$4 = bArr;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.I$2 = b;
                        this.label = 2;
                    } else {
                        f73.l(objArr, 0, objArr6, 0, 14);
                        zls zlsVar2 = this.$transform;
                        vpr vprVar2 = this.$this_combineInternal;
                        this.L$0 = null;
                        this.L$1 = objArr;
                        this.L$2 = ci9Var;
                        this.L$3 = null;
                        this.L$4 = bArr;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.I$2 = b;
                        this.label = 3;
                    }
                    b2 = 1;
                    b = (byte) (b + b2);
                    this.L$0 = null;
                    this.L$1 = objArr;
                    this.L$2 = ci9Var;
                    this.L$3 = null;
                    this.L$4 = bArr;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = length;
                    this.I$1 = i;
                    this.I$2 = b;
                    this.label = b2;
                    obj2 = ci9Var.h(this);
                    if (obj2 != coroutineSingletons) {
                    }
                }
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
