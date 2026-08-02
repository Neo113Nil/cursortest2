package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.we7;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1", f = "EasyLoginActivity.kt", l = {136, 138}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmm6;", "", "<anonymous>", "(Lmm6;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    final /* synthetic */ androidx.fragment.app.t $activity;
    final /* synthetic */ androidx.fragment.app.y $fragmentManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1(androidx.fragment.app.y yVar, androidx.fragment.app.t tVar, Continuation<? super EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = yVar;
        this.$activity = tVar;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1(this.$fragmentManager, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mm6 mm6Var, Continuation<? super Unit> continuation) {
        return ((EasyLoginActivity$EasyLoginActivityNavigator$finishWhenNoFragmentsLeft$1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (defpackage.y2x.p(r5, r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (defpackage.y2x.p(r5, r7) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:8:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.label;
        if (i == 0) {
            qgg.h0(obj);
            msa msaVar = nsa.b;
            long M = yd5.M(100, ssa.MILLISECONDS);
            this.label = 1;
        } else if (i == 1) {
            qgg.h0(obj);
            if (this.$fragmentManager.c.f().size() == 0) {
                msa msaVar2 = nsa.b;
                long M2 = yd5.M(100, ssa.MILLISECONDS);
                this.label = 2;
            }
            msa msaVar3 = nsa.b;
            long M3 = yd5.M(100, ssa.MILLISECONDS);
            this.label = 1;
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            if (this.$fragmentManager.c.f().size() == 0) {
                androidx.fragment.app.t tVar = this.$activity;
                try {
                    r7o r7oVar = z7o.b;
                    tVar.finish();
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                return Unit.a;
            }
            msa msaVar32 = nsa.b;
            long M32 = yd5.M(100, ssa.MILLISECONDS);
            this.label = 1;
        }
    }
}
