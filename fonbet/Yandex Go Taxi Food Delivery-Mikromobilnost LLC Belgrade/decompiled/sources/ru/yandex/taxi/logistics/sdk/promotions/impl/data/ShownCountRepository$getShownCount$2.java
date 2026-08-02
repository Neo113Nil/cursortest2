package ru.yandex.taxi.logistics.sdk.promotions.impl.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9s0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls9s0;", "<anonymous>", "(Ltse;)Ls9s0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.data.ShownCountRepository$getShownCount$2", f = "ShownCountRepository.kt", l = {28, 29, 30}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShownCountRepository$getShownCount$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShownCountRepository$getShownCount$2(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShownCountRepository$getShownCount$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShownCountRepository$getShownCount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r1 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        Object a;
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            String str = this.$id;
            this.label = 1;
            obj = e.b(eVar, str, this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.I$1;
                    i = this.I$0;
                    kotlin.b.b(obj);
                    return new s9s0(i, i2, ((Number) obj).intValue());
                }
                int i4 = this.I$0;
                kotlin.b.b(obj);
                a = obj;
                intValue = i4;
                int intValue2 = ((Number) a).intValue();
                e eVar2 = this.this$0;
                String str2 = this.$id;
                this.I$0 = intValue;
                this.I$1 = intValue2;
                this.label = 3;
                Object c = e.c(eVar2, str2, this);
                if (c != coroutineSingletons) {
                    int i5 = intValue;
                    obj = c;
                    i = i5;
                    i2 = intValue2;
                    return new s9s0(i, i2, ((Number) obj).intValue());
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        intValue = ((Number) obj).intValue();
        e eVar3 = this.this$0;
        String str3 = this.$id;
        this.I$0 = intValue;
        this.label = 2;
        a = e.a(eVar3, str3, this);
    }
}
