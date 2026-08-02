package com.squareup.cash.card.onboarding.graphics;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Entity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ContouredTextRing$setVisible$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ boolean $visible;
    public int label;
    public final /* synthetic */ ContouredTextRing this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContouredTextRing$setVisible$1(boolean z, ContouredTextRing contouredTextRing, Continuation continuation) {
        super(1, continuation);
        this.$visible = z;
        this.this$0 = contouredTextRing;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ContouredTextRing$setVisible$1(this.$visible, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ContouredTextRing$setVisible$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (com.squareup.cash.card.onboarding.graphics.ContouredTextRing.access$animateVisibility(r6, 1.0f, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (com.squareup.cash.card.onboarding.graphics.ContouredTextRing.access$animateVisibility(r1, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            Entity entity = this.this$0.entity;
            if (entity != null) {
                entity.setVisible(false);
            }
            return Unit.INSTANCE;
        }
        SafeTrace.throwOnFailure(obj);
        boolean z = this.$visible;
        ContouredTextRing contouredTextRing = this.this$0;
        if (z) {
            Entity entity2 = contouredTextRing.entity;
            if (entity2 != null) {
                entity2.setVisible(true);
            }
            this.this$0.visibilityFade = RecyclerView.DECELERATION_RATE;
            this.this$0.applyOpacity();
            ContouredTextRing contouredTextRing2 = this.this$0;
            this.label = 1;
        } else {
            this.label = 2;
        }
        return coroutineSingletons;
    }
}
