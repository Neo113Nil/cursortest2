package ru.yandex.taxi.surge.mapper;

import android.graphics.drawable.Drawable;
import defpackage.btw0;
import defpackage.cau;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uqw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcau;", "<anonymous>", "(Ltse;)Lcau;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$headerModel$2", f = "SurgeInfoStateMapper.kt", l = {437, 440, 441}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$headerModel$2 extends SuspendLambda implements wls {
    final /* synthetic */ btw0 $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$headerModel$2(btw0 btw0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.$response = btw0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$headerModel$2 surgeInfoStateMapper$headerModel$2 = new SurgeInfoStateMapper$headerModel$2(this.$response, continuation, this.this$0);
        surgeInfoStateMapper$headerModel$2.L$0 = obj;
        return surgeInfoStateMapper$headerModel$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$headerModel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh nohVar;
        String str;
        Drawable drawable;
        String str2;
        Object k;
        String str3;
        Drawable drawable2;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$headerModel$2$icon$1(this.$response, null, this.this$0), 3);
            h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$headerModel$2$title$1(this.$response, null, this.this$0), 3);
            h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$headerModel$2$description$1(this.$response, null, this.this$0), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence2 = (CharSequence) this.L$7;
                    String str4 = (String) this.L$6;
                    str2 = (String) this.L$5;
                    Drawable drawable3 = (Drawable) this.L$4;
                    b.b(obj);
                    str3 = str4;
                    drawable2 = drawable3;
                    charSequence = charSequence2;
                    return new cau(drawable2, str2, str3, charSequence, (CharSequence) obj);
                }
                str = (String) this.L$6;
                str2 = (String) this.L$5;
                drawable = (Drawable) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence3 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = drawable;
                this.L$5 = str2;
                this.L$6 = str;
                this.L$7 = charSequence3;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    str3 = str;
                    drawable2 = drawable;
                    charSequence = charSequence3;
                    obj = k;
                    return new cau(drawable2, str2, str3, charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        nohVar = h2;
        Drawable drawable4 = (Drawable) obj;
        uqw0 uqw0Var = this.$response.a;
        String str5 = uqw0Var.a;
        str = uqw0Var.b;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = drawable4;
        this.L$5 = str5;
        this.L$6 = str;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            drawable = drawable4;
            obj = k2;
            str2 = str5;
            CharSequence charSequence32 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = drawable;
            this.L$5 = str2;
            this.L$6 = str;
            this.L$7 = charSequence32;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
