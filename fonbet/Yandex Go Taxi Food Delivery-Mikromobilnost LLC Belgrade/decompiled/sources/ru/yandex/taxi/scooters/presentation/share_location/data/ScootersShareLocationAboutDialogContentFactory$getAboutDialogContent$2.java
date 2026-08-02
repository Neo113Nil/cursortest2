package ru.yandex.taxi.scooters.presentation.share_location.data;

import defpackage.fvo0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.s7n0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls7n0;", "<anonymous>", "(Ltse;)Ls7n0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.data.ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2", f = "ScootersShareLocationAboutDialogContentFactory.kt", l = {27, 28, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ fvo0.a $aboutDialogContent;
    final /* synthetic */ fvo0 $experiment;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2(a aVar, fvo0.a aVar2, fvo0 fvo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$aboutDialogContent = aVar2;
        this.$experiment = fvo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2 scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2 = new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2(this.this$0, this.$aboutDialogContent, this.$experiment, continuation);
        scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2.L$0 = obj;
        return scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        CharSequence charSequence;
        Object k;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$titleDef$1(this.this$0, this.$aboutDialogContent, this.$experiment, null), 3);
            h = tje.h(tseVar, null, null, new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$subtitleDef$1(this.this$0, this.$aboutDialogContent, this.$experiment, null), 3);
            h2 = tje.h(tseVar, null, null, new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2$buttonTextDef$1(this.this$0, this.$aboutDialogContent, this.$experiment, null), 3);
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
                    String str2 = (String) this.L$6;
                    CharSequence charSequence4 = (CharSequence) this.L$5;
                    CharSequence charSequence5 = (CharSequence) this.L$4;
                    kotlin.b.b(obj);
                    charSequence3 = charSequence4;
                    charSequence2 = charSequence5;
                    str = str2;
                    return new s7n0(charSequence2, charSequence3, (CharSequence) obj, null, null, str);
                }
                CharSequence charSequence6 = (CharSequence) this.L$4;
                noh nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                charSequence = charSequence6;
                h2 = nohVar;
                CharSequence charSequence7 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence;
                this.L$5 = charSequence7;
                this.L$6 = "ScootersShareLocationAboutDialog";
                this.label = 3;
                k = h2.k(this);
                if (k != coroutineSingletons) {
                    charSequence2 = charSequence;
                    str = "ScootersShareLocationAboutDialog";
                    charSequence3 = charSequence7;
                    obj = k;
                    return new s7n0(charSequence2, charSequence3, (CharSequence) obj, null, null, str);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        CharSequence charSequence8 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence8;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            charSequence = charSequence8;
            obj = k2;
            CharSequence charSequence72 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence72;
            this.L$6 = "ScootersShareLocationAboutDialog";
            this.label = 3;
            k = h2.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
