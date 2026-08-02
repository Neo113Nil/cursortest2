package com.squareup.cash.moneybot.views.chat;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotLoadedContentKt$ChatContent$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $additionalBottomInsetBasePx$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $additionalBottomInsetPx$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $anchoredUserMessageIndex$delegate;
    public final /* synthetic */ int $baseBottomInsetPx;
    public final /* synthetic */ int $defaultAdditionalBottomInsetPx;
    public final /* synthetic */ MutableState $hasRestoredScroll$delegate;
    public final /* synthetic */ boolean $isLatestUserResponseActive;
    public final /* synthetic */ int $latestUserMessageIndex;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $latestUserMessageIndexSeen$delegate;
    public final /* synthetic */ LazyListState $lazyListState;
    public final /* synthetic */ MoneybotChatViewModel.Content.Chat $model;
    public final /* synthetic */ boolean $showAutoscroll;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotLoadedContentKt$ChatContent$4$1(MoneybotChatViewModel.Content.Chat chat, int i, boolean z, boolean z2, LazyListState lazyListState, int i2, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, int i3, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$model = chat;
        this.$latestUserMessageIndex = i;
        this.$showAutoscroll = z;
        this.$isLatestUserResponseActive = z2;
        this.$lazyListState = lazyListState;
        this.$baseBottomInsetPx = i2;
        this.$hasRestoredScroll$delegate = mutableState;
        this.$latestUserMessageIndexSeen$delegate = parcelableSnapshotMutableIntState;
        this.$anchoredUserMessageIndex$delegate = parcelableSnapshotMutableIntState2;
        this.$defaultAdditionalBottomInsetPx = i3;
        this.$additionalBottomInsetPx$delegate = parcelableSnapshotMutableIntState3;
        this.$additionalBottomInsetBasePx$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoneybotLoadedContentKt$ChatContent$4$1(this.$model, this.$latestUserMessageIndex, this.$showAutoscroll, this.$isLatestUserResponseActive, this.$lazyListState, this.$baseBottomInsetPx, this.$hasRestoredScroll$delegate, this.$latestUserMessageIndexSeen$delegate, this.$anchoredUserMessageIndex$delegate, this.$defaultAdditionalBottomInsetPx, this.$additionalBottomInsetPx$delegate, this.$additionalBottomInsetBasePx$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoneybotLoadedContentKt$ChatContent$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01d4, code lost:
    
        if (androidx.cardview.widget.CardViewApi21Impl.access$scrollToTopIfNeeded(r10, r15, r20) == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016f, code lost:
    
        if (r3 < 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
    
        if (androidx.compose.runtime.Updater.getMonotonicFrameClock(getContext()).withFrameNanos(r20, r3) == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x023d, code lost:
    
        if (androidx.cardview.widget.CardViewApi21Impl.access$scrollToTopIfNeeded(r10, r15, r20) == r1) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x01c5 -> B:11:0x01c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00e3 -> B:51:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x022c -> B:60:0x022d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        int i7;
        int i8;
        int i9;
        int m310getViewportSizeYbymL2g;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num2;
        Integer num3;
        int i15;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.label;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$anchoredUserMessageIndex$delegate;
        int i17 = this.$baseBottomInsetPx;
        LazyListState lazyListState = this.$lazyListState;
        MutableState mutableState = this.$additionalBottomInsetBasePx$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.$additionalBottomInsetPx$delegate;
        int i18 = this.$latestUserMessageIndex;
        switch (i16) {
            case 0:
                j = BodyPartID.bodyIdMax;
                SafeTrace.throwOnFailure(obj);
                if (this.$model.messages.isEmpty() || !((Boolean) this.$hasRestoredScroll$delegate.getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (i18 < 0) {
                    return Unit.INSTANCE;
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = this.$latestUserMessageIndexSeen$delegate;
                i = i18 != parcelableSnapshotMutableIntState3.getIntValue() ? 1 : 0;
                if (i != 0) {
                    parcelableSnapshotMutableIntState3.setIntValue(i18);
                    parcelableSnapshotMutableIntState.setIntValue(i18);
                }
                if (this.$showAutoscroll) {
                    parcelableSnapshotMutableIntState2.setIntValue(this.$defaultAdditionalBottomInsetPx);
                    mutableState.setValue(null);
                    parcelableSnapshotMutableIntState.setIntValue(-1);
                    return Unit.INSTANCE;
                }
                if (parcelableSnapshotMutableIntState.getIntValue() != i18) {
                    return Unit.INSTANCE;
                }
                if (i == 0 && !this.$isLatestUserResponseActive) {
                    i6 = 0;
                    i7 = 2;
                    if (i6 >= i7) {
                        InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda19 = new InsightChartKt$$ExternalSyntheticLambda19(11);
                        this.I$0 = i;
                        this.I$1 = i7;
                        this.I$2 = i6;
                        this.I$3 = i6;
                        this.label = 3;
                        break;
                    } else {
                        this.I$0 = i;
                        this.label = 4;
                        if (CardViewApi21Impl.access$scrollToTopIfNeeded(lazyListState, i18, this) != coroutineSingletons) {
                            i9 = i;
                            m310getViewportSizeYbymL2g = ((int) (lazyListState.getLayoutInfo().m310getViewportSizeYbymL2g() & j)) - i17;
                            if (m310getViewportSizeYbymL2g > 0) {
                                List list = lazyListState.getLayoutInfo().visibleItemsInfo;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    if (((LazyListMeasuredItem) obj2).index >= i18) {
                                        arrayList.add(obj2);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                if (it.hasNext()) {
                                    LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) it.next();
                                    Integer valueOf = Integer.valueOf(lazyListMeasuredItem.offset + lazyListMeasuredItem.size);
                                    while (it.hasNext()) {
                                        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) it.next();
                                        Integer valueOf2 = Integer.valueOf(lazyListMeasuredItem2.offset + lazyListMeasuredItem2.size);
                                        if (valueOf.compareTo(valueOf2) < 0) {
                                            valueOf = valueOf2;
                                        }
                                    }
                                    num3 = valueOf;
                                } else {
                                    num3 = null;
                                }
                                if (num3 != null) {
                                    i10 = m310getViewportSizeYbymL2g - num3.intValue();
                                    break;
                                } else {
                                    i10 = (int) (lazyListState.getLayoutInfo().m310getViewportSizeYbymL2g() & j);
                                }
                                if (parcelableSnapshotMutableIntState2.getIntValue() == i10 || (num2 = (Integer) mutableState.getValue()) == null || num2.intValue() != i17) {
                                    parcelableSnapshotMutableIntState2.setIntValue(i10);
                                    mutableState.setValue(Integer.valueOf(i17));
                                    i11 = i9;
                                    i12 = i10;
                                    i13 = 2;
                                    i14 = 0;
                                    if (i14 < i13) {
                                        InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda192 = new InsightChartKt$$ExternalSyntheticLambda19(12);
                                        this.I$0 = i11;
                                        this.I$1 = i12;
                                        this.I$2 = i13;
                                        this.I$3 = i14;
                                        this.label = 5;
                                        if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, insightChartKt$$ExternalSyntheticLambda192) != coroutineSingletons) {
                                            i15 = i14;
                                            i14 = i15 + 1;
                                            if (i14 < i13) {
                                                this.I$0 = i11;
                                                this.I$1 = i12;
                                                this.label = 6;
                                                break;
                                            }
                                        }
                                    }
                                }
                                parcelableSnapshotMutableIntState.setIntValue(-1);
                                return Unit.INSTANCE;
                            }
                            i10 = 0;
                            if (parcelableSnapshotMutableIntState2.getIntValue() == i10) {
                            }
                            parcelableSnapshotMutableIntState2.setIntValue(i10);
                            mutableState.setValue(Integer.valueOf(i17));
                            i11 = i9;
                            i12 = i10;
                            i13 = 2;
                            i14 = 0;
                            if (i14 < i13) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                int m310getViewportSizeYbymL2g2 = (int) (lazyListState.getLayoutInfo().m310getViewportSizeYbymL2g() & BodyPartID.bodyIdMax);
                if (parcelableSnapshotMutableIntState2.getIntValue() != m310getViewportSizeYbymL2g2 || (num = (Integer) mutableState.getValue()) == null || num.intValue() != i17) {
                    parcelableSnapshotMutableIntState2.setIntValue(m310getViewportSizeYbymL2g2);
                    mutableState.setValue(Integer.valueOf(i17));
                    i2 = i;
                    i3 = 2;
                    i4 = 0;
                    i5 = m310getViewportSizeYbymL2g2;
                    if (i4 < i3) {
                        InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda193 = new InsightChartKt$$ExternalSyntheticLambda19(10);
                        this.I$0 = i2;
                        this.I$1 = i5;
                        this.I$2 = i3;
                        this.I$3 = i4;
                        this.label = 1;
                        if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, insightChartKt$$ExternalSyntheticLambda193) != coroutineSingletons) {
                            i8 = i4;
                            i4 = i8 + 1;
                            if (i4 < i3) {
                                m310getViewportSizeYbymL2g2 = i5;
                                i = i2;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                this.I$0 = i;
                this.I$1 = m310getViewportSizeYbymL2g2;
                this.label = 2;
                break;
            case 1:
                i8 = this.I$3;
                i3 = this.I$2;
                i5 = this.I$1;
                i2 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i4 = i8 + 1;
                if (i4 < i3) {
                }
                break;
            case 2:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                i6 = this.I$2;
                j = BodyPartID.bodyIdMax;
                int i19 = this.I$1;
                int i20 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i7 = i19;
                i = i20;
                i6++;
                if (i6 >= i7) {
                }
                return coroutineSingletons;
            case 4:
                i9 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                j = BodyPartID.bodyIdMax;
                m310getViewportSizeYbymL2g = ((int) (lazyListState.getLayoutInfo().m310getViewportSizeYbymL2g() & j)) - i17;
                if (m310getViewportSizeYbymL2g > 0) {
                }
                i10 = 0;
                if (parcelableSnapshotMutableIntState2.getIntValue() == i10) {
                }
                parcelableSnapshotMutableIntState2.setIntValue(i10);
                mutableState.setValue(Integer.valueOf(i17));
                i11 = i9;
                i12 = i10;
                i13 = 2;
                i14 = 0;
                if (i14 < i13) {
                }
                return coroutineSingletons;
            case 5:
                i15 = this.I$3;
                int i21 = this.I$2;
                i12 = this.I$1;
                i11 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i13 = i21;
                i14 = i15 + 1;
                if (i14 < i13) {
                }
                return coroutineSingletons;
            case 6:
                SafeTrace.throwOnFailure(obj);
                parcelableSnapshotMutableIntState.setIntValue(-1);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
