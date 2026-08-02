package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording;

import android.graphics.Bitmap;
import defpackage.bhb0;
import defpackage.dvw;
import defpackage.j18;
import defpackage.lgb0;
import defpackage.lib0;
import defpackage.ny61;
import defpackage.oib0;
import defpackage.r1s;
import defpackage.s8v;
import defpackage.w8v;
import defpackage.wls;
import defpackage.y4a0;
import defpackage.zy11;
import java.io.File;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;

/* loaded from: classes4.dex */
public final class i extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ oib0 b;
    public final /* synthetic */ Bitmap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(oib0 oib0Var, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.b = oib0Var;
        this.c = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File file;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            oib0 oib0Var = this.b;
            lib0 a = lib0.a((lib0) oib0Var.a0(), new lgb0(this.c), null, false, false, false, 0, 62);
            r0 r0Var = (r0) oib0Var.c0();
            r0Var.getClass();
            r0Var.m(null, a);
            bhb0 bhb0Var = this.b.F;
            this.a = 1;
            bhb0Var.getClass();
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            y4a0 y4a0Var = new y4a0(bhb0Var, j18Var, false, 7);
            w8v w8vVar = bhb0Var.b;
            if (w8vVar != null && (file = bhb0Var.d) != null) {
                r1s r1sVar = new r1s(file, (OutputStream) null, (s8v) null);
                ExecutorService executorService = bhb0Var.e;
                if (executorService != null) {
                    w8vVar.O(r1sVar, executorService, y4a0Var);
                }
            }
            Object s = j18Var.s();
            if (s != coroutineSingletons) {
                s = zy11Var;
            }
            if (s == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.b.Z().emit(new Event.Process(null, 1, null));
        return zy11Var;
    }
}
