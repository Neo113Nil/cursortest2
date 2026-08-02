package ru.yandex.taxi.logistics.sdk.postcard.presentation.ui;

import defpackage.l7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tse;
import defpackage.ufe0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.PostcardPresentationViewModel$1", f = "PostcardPresentationViewModel.kt", l = {47, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PostcardPresentationViewModel$1 extends SuspendLambda implements wls {
    int I$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostcardPresentationViewModel$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostcardPresentationViewModel$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PostcardPresentationViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r2.a(r10, r9) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            ufe0 ufe0Var = dVar.b;
            boolean z = ufe0Var.b;
            int i3 = !z ? 1 : 0;
            if (!z) {
                ru.yandex.taxi.logistics.sdk.postcard.presentation.b bVar = dVar.w;
                String str = ufe0Var.a;
                this.I$0 = i3;
                this.label = 1;
                obj = e.y(new l7(17, ((tpg) bVar.c.getValue(bVar.a, ru.yandex.taxi.logistics.sdk.postcard.presentation.b.d[0])).getData(), bVar, str), this);
                if (obj != coroutineSingletons) {
                    i = i3;
                }
                return coroutineSingletons;
            }
            r0 r0Var = this.this$0.A;
            Boolean bool = Boolean.FALSE;
            r0Var.getClass();
            r0Var.m(null, bool);
            this.this$0.x.S("Postcard.Tracking.PostcardOpened");
            return zy11.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.x.S("Postcard.RecipientTracking.PostcardSeenFirstTime");
            return zy11.a;
        }
        i = this.I$0;
        kotlin.b.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            r0 r0Var2 = this.this$0.A;
            Boolean bool2 = Boolean.TRUE;
            r0Var2.getClass();
            r0Var2.m(null, bool2);
            d dVar2 = this.this$0;
            ru.yandex.taxi.logistics.sdk.postcard.presentation.b bVar2 = dVar2.w;
            String str2 = dVar2.b.a;
            this.I$0 = i;
            this.label = 2;
        }
        r0 r0Var3 = this.this$0.A;
        Boolean bool3 = Boolean.FALSE;
        r0Var3.getClass();
        r0Var3.m(null, bool3);
        this.this$0.x.S("Postcard.Tracking.PostcardOpened");
        return zy11.a;
    }
}
