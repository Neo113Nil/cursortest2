package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording;

import android.content.Context;
import defpackage.bhb0;
import defpackage.i5f0;
import defpackage.kib0;
import defpackage.lib0;
import defpackage.ngb0;
import defpackage.ny61;
import defpackage.oib0;
import defpackage.s3v;
import defpackage.v5a1;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.Executors;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.PhotoHandler;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;

/* loaded from: classes4.dex */
public final class g extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ oib0 b;
    public final /* synthetic */ s3v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(oib0 oib0Var, s3v s3vVar, Continuation continuation) {
        super(2, continuation);
        this.b = oib0Var;
        this.c = s3vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r2 == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            IFlow Z = this.b.Z();
            this.a = 1;
            value = Z.getValue(PhotoHandler.class, this);
        } else if (i == 1) {
            b.b(obj);
            value = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                oib0 oib0Var = this.b;
                lib0 a = lib0.a((lib0) oib0Var.a0(), new ngb0(oib0Var.G), null, false, false, false, 0, 62);
                r0 r0Var = (r0) oib0Var.c0();
                r0Var.getClass();
                r0Var.m(null, a);
                return zy11Var;
            }
            b.b(obj);
            oib0 oib0Var2 = this.b;
            bhb0 bhb0Var = oib0Var2.F;
            CameraType cameraType = ((lib0) oib0Var2.a0()).b;
            this.a = 3;
            bhb0Var.a(cameraType);
        }
        Optional optional = (Optional) value;
        if (optional.hasValue()) {
            File bioSampleFile = ((PhotoHandler) optional.extractValue()).getBioSampleFile();
            this.b.G = ((PhotoHandler) optional.extractValue()).getInstructionsHandlerBody();
            bhb0 bhb0Var2 = this.b.F;
            s3v s3vVar = this.c;
            this.a = 2;
            bhb0Var2.a = s3vVar;
            bhb0Var2.d = bioSampleFile;
            if (s3vVar != null && (context = ((kib0) s3vVar).a.getContext()) != null) {
                i5f0 i5f0Var = i5f0.b;
                bhb0Var2.f = v5a1.c(context.getApplicationContext());
            }
            bhb0Var2.e = Executors.newSingleThreadExecutor();
        }
        return zy11Var;
    }
}
