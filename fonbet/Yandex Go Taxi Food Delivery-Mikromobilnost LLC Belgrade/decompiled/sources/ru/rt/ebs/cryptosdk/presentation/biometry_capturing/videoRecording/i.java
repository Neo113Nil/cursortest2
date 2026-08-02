package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import defpackage.cm31;
import defpackage.ny61;
import defpackage.o4w;
import defpackage.s2v;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yn31;
import defpackage.zy11;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.NegotiateHandler;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;

/* loaded from: classes4.dex */
public final class i extends SuspendLambda implements wls {
    public Object a;
    public int b;
    public final /* synthetic */ yn31 c;
    public final /* synthetic */ JSONObject d;
    public final /* synthetic */ s2v e;
    public final /* synthetic */ VideoResolutionRestrictions f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yn31 yn31Var, JSONObject jSONObject, s2v s2vVar, VideoResolutionRestrictions videoResolutionRestrictions, Continuation continuation) {
        super(2, continuation);
        this.c = yn31Var;
        this.d = jSONObject;
        this.e = s2vVar;
        this.f = videoResolutionRestrictions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r12 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            IFlow Z = this.c.Z();
            this.b = 1;
            obj = Z.getValue(NegotiateHandler.class, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Optional optional = (Optional) obj;
        if (optional.hasValue()) {
            Object extractValue = optional.extractValue();
            yn31 yn31Var = this.c;
            JSONObject jSONObject = this.d;
            s2v s2vVar = this.e;
            VideoResolutionRestrictions videoResolutionRestrictions = this.f;
            NegotiateHandler negotiateHandler = (NegotiateHandler) extractValue;
            yn31Var.G = new o4w(negotiateHandler.getInstructionsHandlerBody(), negotiateHandler.getNegotiate().getNegotiate(), jSONObject);
            cm31 cm31Var = yn31Var.F;
            File bioSampleFile = negotiateHandler.getBioSampleFile();
            this.a = extractValue;
            this.b = 2;
            Object k0 = tje.k0(cm31Var.a.io(), new ru.rt.ebs.cryptosdk.common.video.b(cm31Var, s2vVar, bioSampleFile, videoResolutionRestrictions, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
