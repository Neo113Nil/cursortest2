package com.squareup.cash.activity.presenters;

import androidx.biometric.CryptoObjectUtils;
import app.cash.badging.api.Badger2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.protos.cash.badging.api.ItemType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class DefaultActivityItemEventHandler$avatarClicked$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FormattedPaymentHistoryActivityItem $activityItem;
    public final /* synthetic */ int $r8$classId = 0;
    public int label;
    public final /* synthetic */ DefaultActivityItemEventHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultActivityItemEventHandler$avatarClicked$2(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, DefaultActivityItemEventHandler defaultActivityItemEventHandler, Continuation continuation) {
        super(2, continuation);
        this.$activityItem = formattedPaymentHistoryActivityItem;
        this.this$0 = defaultActivityItemEventHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = this.$activityItem;
        DefaultActivityItemEventHandler defaultActivityItemEventHandler = this.this$0;
        switch (i) {
            case 0:
                return new DefaultActivityItemEventHandler$avatarClicked$2(formattedPaymentHistoryActivityItem, defaultActivityItemEventHandler, continuation);
            default:
                return new DefaultActivityItemEventHandler$avatarClicked$2(defaultActivityItemEventHandler, formattedPaymentHistoryActivityItem, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DefaultActivityItemEventHandler$avatarClicked$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (((app.cash.badging.backend.RealBadger2) r9).clear(r1, r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r1.showContact(r9, r2, r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r1.showProfile(r9, r2, r3, r8) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DefaultActivityItemEventHandler defaultActivityItemEventHandler = this.this$0;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = this.$activityItem;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean contains = CollectionsKt.contains(DefaultActivityItemEventHandler.InvestingItemTypes, ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem));
                    ActivityPaymentManager2 activityPaymentManager2 = defaultActivityItemEventHandler.activityPaymentManager2;
                    if (!contains) {
                        String removePrefix = StringsKt.removePrefix("P_", ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem));
                        String theirId = CryptoObjectUtils.getTheirId(formattedPaymentHistoryActivityItem);
                        String theirId2 = CryptoObjectUtils.getTheirId(formattedPaymentHistoryActivityItem);
                        this.label = 2;
                        break;
                    } else {
                        String itemId = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
                        String theirId3 = CryptoObjectUtils.getTheirId(formattedPaymentHistoryActivityItem);
                        this.label = 1;
                        break;
                    }
                } else if (i2 != 1 && i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, DurationUnit.MILLISECONDS);
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Badger2 badger2 = defaultActivityItemEventHandler.badger;
                Badger2.Badge[] badgeArr = {new Badger2.Badge(formattedPaymentHistoryActivityItem.getRowId(), ItemType.ACTIVITY, formattedPaymentHistoryActivityItem.getVersion())};
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultActivityItemEventHandler$avatarClicked$2(DefaultActivityItemEventHandler defaultActivityItemEventHandler, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultActivityItemEventHandler;
        this.$activityItem = formattedPaymentHistoryActivityItem;
    }
}
