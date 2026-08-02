package com.squareup.cash.card.onboarding.graphics;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.graphics.swampgl.components.Entity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ContouredTextRing$uploadText$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $color;
    public final /* synthetic */ String $text;
    public int I$0;
    public int I$1;
    public Bitmap L$0;
    public int label;
    public final /* synthetic */ ContouredTextRing this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContouredTextRing$uploadText$1(ContouredTextRing contouredTextRing, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = contouredTextRing;
        this.$text = str;
        this.$color = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ContouredTextRing$uploadText$1(this.this$0, this.$text, this.$color, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ContouredTextRing$uploadText$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c2, code lost:
    
        if (com.squareup.cash.card.onboarding.graphics.ContouredTextRing.access$animateVisibility(r13, 1.0f, r12) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        int i;
        int i2;
        int i3;
        Bitmap bitmap2;
        NonCancellable nonCancellable;
        PlaidLinkView.AnonymousClass2 anonymousClass2;
        int i4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        if (i5 == 0) {
            SafeTrace.throwOnFailure(obj);
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            EntitySyncerKt$hasSyncedFlow$1 entitySyncerKt$hasSyncedFlow$1 = new EntitySyncerKt$hasSyncedFlow$1(this.this$0, this.$text, this.$color, (Continuation) null);
            this.label = 1;
            obj = JobKt.withContext(defaultIoScheduler, entitySyncerKt$hasSyncedFlow$1, this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        this.this$0.markDirty.invoke();
                        return Unit.INSTANCE;
                    }
                    i2 = this.I$1;
                    i4 = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                    if (i2 != 0) {
                        ContouredTextRing contouredTextRing = this.this$0;
                        this.L$0 = null;
                        this.I$0 = i4;
                        this.I$1 = i2;
                        this.label = 4;
                    }
                    this.this$0.markDirty.invoke();
                    return Unit.INSTANCE;
                }
                i2 = this.I$1;
                i3 = this.I$0;
                bitmap2 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                i = i3;
                bitmap = bitmap2;
                nonCancellable = NonCancellable.INSTANCE;
                anonymousClass2 = new PlaidLinkView.AnonymousClass2(this.this$0, bitmap, i, null, 29);
                this.L$0 = null;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 3;
                if (JobKt.withContext(nonCancellable, anonymousClass2, this) != coroutineSingletons) {
                    i4 = i;
                    if (i2 != 0) {
                    }
                    this.this$0.markDirty.invoke();
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Bitmap bitmap3 = (Bitmap) obj;
        if (!JobKt.isActive(getContext())) {
            bitmap3.recycle();
            return Unit.INSTANCE;
        }
        int i6 = this.this$0.textureId;
        Entity entity = this.this$0.entity;
        int i7 = (i6 <= 0 || entity == null || !entity.getVisible()) ? 0 : 1;
        if (i7 == 0) {
            bitmap = bitmap3;
            i = i6;
            i2 = i7;
            nonCancellable = NonCancellable.INSTANCE;
            anonymousClass2 = new PlaidLinkView.AnonymousClass2(this.this$0, bitmap, i, null, 29);
            this.L$0 = null;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 3;
            if (JobKt.withContext(nonCancellable, anonymousClass2, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        ContouredTextRing contouredTextRing2 = this.this$0;
        this.L$0 = bitmap3;
        this.I$0 = i6;
        this.I$1 = i7;
        this.label = 2;
        if (ContouredTextRing.access$animateVisibility(contouredTextRing2, RecyclerView.DECELERATION_RATE, this) != coroutineSingletons) {
            i3 = i6;
            i2 = i7;
            bitmap2 = bitmap3;
            i = i3;
            bitmap = bitmap2;
            nonCancellable = NonCancellable.INSTANCE;
            anonymousClass2 = new PlaidLinkView.AnonymousClass2(this.this$0, bitmap, i, null, 29);
            this.L$0 = null;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 3;
            if (JobKt.withContext(nonCancellable, anonymousClass2, this) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
