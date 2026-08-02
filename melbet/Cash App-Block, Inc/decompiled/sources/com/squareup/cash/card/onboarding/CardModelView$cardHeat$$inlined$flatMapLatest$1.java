package com.squareup.cash.card.onboarding;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.filament.util.BufferedImageAsset;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.cash.filament.util.IndirectLightAsset;
import com.squareup.cash.filament.util.SkyboxAsset;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Quadruple;
import com.squareup.util.Septuple;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.math.Constants;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.misnap.iad.IadFrame;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardHeat$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardModelView$cardHeat$$inlined$flatMapLatest$1(int i, CardModelView cardModelView, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = cardModelView;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        CardModelView cardModelView = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$1 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(0, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$1.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$1.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$12 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(1, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$12.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$12.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$13 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(2, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$13.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$13.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$14 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(3, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$14.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$14.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$15 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(4, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$15.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$15.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$15.invokeSuspend(Unit.INSTANCE);
            case 5:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$16 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(5, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$16.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$16.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$16.invokeSuspend(Unit.INSTANCE);
            case 6:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$17 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(6, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$17.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$17.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$17.invokeSuspend(Unit.INSTANCE);
            case 7:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$18 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(7, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$18.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$18.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$18.invokeSuspend(Unit.INSTANCE);
            case 8:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$19 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(8, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$19.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$19.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$19.invokeSuspend(Unit.INSTANCE);
            case 9:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$110 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(9, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$110.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$110.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$110.invokeSuspend(Unit.INSTANCE);
            default:
                CardModelView$cardHeat$$inlined$flatMapLatest$1 cardModelView$cardHeat$$inlined$flatMapLatest$111 = new CardModelView$cardHeat$$inlined$flatMapLatest$1(10, cardModelView, continuation);
                cardModelView$cardHeat$$inlined$flatMapLatest$111.L$0 = flowCollector;
                cardModelView$cardHeat$$inlined$flatMapLatest$111.L$1 = obj2;
                return cardModelView$cardHeat$$inlined$flatMapLatest$111.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons;
        Flow flowOn;
        int i = this.$r8$classId;
        int i2 = 9;
        int i3 = 2;
        int i4 = 3;
        final CardModelView cardModelView = this.this$0;
        int i5 = 0;
        int i6 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector2 = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new CardModelView$cardHeat$2$1(cardModelView, (EquatableBitmap) obj2, null, 0));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, safeFlow, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                StateFlowImpl stateFlowImpl = cardModelView.viewmodels;
                FlowCollector flowCollector3 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl, 24);
                    SafeFlow safeFlow2 = new SafeFlow(new CardModelView.AnonymousClass1(i4, cardModelView, continuation));
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    Flow flowOn2 = FlowKt.flowOn(safeFlow2, defaultIoScheduler);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl, 24);
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 4)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(i3, cardModelView, continuation));
                    ChannelFlowTransformLatest transformLatest2 = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 7)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(6, cardModelView, continuation));
                    ChannelFlowTransformLatest transformLatest3 = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, cardModelView.customizationOverride, new CardModelView$cardInkMetal$1(3, null), i5)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(5, cardModelView, continuation));
                    int i9 = 8;
                    ChannelFlowTransformLatest transformLatest4 = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 10)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(i9, cardModelView, continuation));
                    final int i10 = 0;
                    final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, i10));
                    final Flow flowOn3 = FlowKt.flowOn(new Flow() { // from class: com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2

                        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ FlowCollector $this_unsafeFlow;
                            public final /* synthetic */ CardModelView this$0;

                            /* renamed from: com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2$2$1, reason: invalid class name */
                            public final class AnonymousClass1 extends ContinuationImpl {
                                public int label;
                                public /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= PKIFailureInfo.systemUnavail;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, CardModelView cardModelView, int i) {
                                this.$r8$classId = i;
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = cardModelView;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x0221  */
                            /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
                            /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0277  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                CoroutineSingletons coroutineSingletons;
                                SkyboxAsset skyboxAsset;
                                CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1 cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1;
                                int i2;
                                CardModelView$lighting$$inlined$map$3$2$1 cardModelView$lighting$$inlined$map$3$2$1;
                                int i3;
                                int i4;
                                float f;
                                Pair pair;
                                long nCreateBuilder;
                                long nBuilderBuild;
                                long nCreateBuilder2;
                                long nBuilderBuild2;
                                long nCreateBuilder3;
                                long nBuilderBuild3;
                                long nCreateBuilder4;
                                long nBuilderBuild4;
                                int i5 = this.$r8$classId;
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                CardModelView cardModelView = this.this$0;
                                switch (i5) {
                                    case 0:
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i6 = anonymousClass1.label;
                                            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                                                Object obj2 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    SafeTrace.throwOnFailure(obj2);
                                                    Quadruple quadruple = (Quadruple) obj;
                                                    String str = (String) quadruple.first;
                                                    float floatValue = ((Number) quadruple.second).floatValue();
                                                    boolean booleanValue = ((Boolean) quadruple.third).booleanValue();
                                                    CardTheme.BackgroundImage backgroundImage = (CardTheme.BackgroundImage) quadruple.fourth;
                                                    String m = Recorder$$ExternalSyntheticOutline2.m("envs/", str);
                                                    AssetManager assets = cardModelView.getContext().getAssets();
                                                    assets.getClass();
                                                    Pair peekSize = IblLoaderKt.peekSize(assets, m.concat("/m0_nx.rgb32f"));
                                                    int intValue = ((Number) peekSize.first).intValue();
                                                    int intValue2 = ((Number) peekSize.second).intValue();
                                                    ArrayList arrayList = new ArrayList();
                                                    int log = ((int) (Math.log(intValue) / Constants.LN2)) + 1;
                                                    int i7 = intValue2;
                                                    int i8 = intValue;
                                                    int i9 = 0;
                                                    while (true) {
                                                        if (i9 < log) {
                                                            int i10 = log;
                                                            coroutineSingletons = coroutineSingletons2;
                                                            ByteBuffer loadCubemap = IblLoaderKt.loadCubemap(assets, m, i8, i7, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i9, "m", "_"));
                                                            if (loadCubemap != null) {
                                                                arrayList.add(new BufferedImageAsset(loadCubemap, i8, i7));
                                                                i8 /= 2;
                                                                i7 /= 2;
                                                                i9++;
                                                                log = i10;
                                                                coroutineSingletons2 = coroutineSingletons;
                                                            }
                                                        } else {
                                                            coroutineSingletons = coroutineSingletons2;
                                                        }
                                                    }
                                                    IndirectLightAsset indirectLightAsset = new IndirectLightAsset(arrayList, intValue, intValue2);
                                                    if (booleanValue) {
                                                        String m2 = Recorder$$ExternalSyntheticOutline2.m("envs/", str);
                                                        AssetManager assets2 = cardModelView.getContext().getAssets();
                                                        assets2.getClass();
                                                        Pair peekSize2 = IblLoaderKt.peekSize(assets2, m2.concat("/nx.rgb32f"));
                                                        int intValue3 = ((Number) peekSize2.first).intValue();
                                                        int intValue4 = ((Number) peekSize2.second).intValue();
                                                        ByteBuffer loadCubemap2 = IblLoaderKt.loadCubemap(assets2, m2, intValue3, intValue4, "");
                                                        loadCubemap2.getClass();
                                                        skyboxAsset = new SkyboxAsset(new BufferedImageAsset(loadCubemap2, intValue3, intValue4));
                                                    } else {
                                                        skyboxAsset = null;
                                                    }
                                                    Quadruple quadruple2 = new Quadruple(indirectLightAsset, new Float(floatValue), skyboxAsset, backgroundImage);
                                                    anonymousClass1.label = 1;
                                                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                                    if (flowCollector.emit(quadruple2, anonymousClass1) == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        return null;
                                                    }
                                                    SafeTrace.throwOnFailure(obj2);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj22 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                        return Unit.INSTANCE;
                                    case 1:
                                        if (continuation instanceof CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1) {
                                            cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1 = (CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1) continuation;
                                            int i11 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label;
                                            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                                                cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                                                Object obj3 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.result;
                                                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i2 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label;
                                                if (i2 != 0) {
                                                    SafeTrace.throwOnFailure(obj3);
                                                    Paint paint = CardModelView.REMOVE_PAINT;
                                                    PointF pointF = cardModelView.touchTextureIntersect((PointF) obj);
                                                    cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label = 1;
                                                    if (flowCollector.emit(pointF, cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1) == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                } else {
                                                    if (i2 != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        return null;
                                                    }
                                                    SafeTrace.throwOnFailure(obj3);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1 = new CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1(this, continuation);
                                        Object obj32 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label;
                                        if (i2 != 0) {
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        if (continuation instanceof CardModelView$lighting$$inlined$map$3$2$1) {
                                            cardModelView$lighting$$inlined$map$3$2$1 = (CardModelView$lighting$$inlined$map$3$2$1) continuation;
                                            int i12 = cardModelView$lighting$$inlined$map$3$2$1.label;
                                            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                                                cardModelView$lighting$$inlined$map$3$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                                                Object obj4 = cardModelView$lighting$$inlined$map$3$2$1.result;
                                                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i3 = cardModelView$lighting$$inlined$map$3$2$1.label;
                                                if (i3 != 0) {
                                                    SafeTrace.throwOnFailure(obj4);
                                                    Quadruple quadruple3 = (Quadruple) obj;
                                                    IndirectLightAsset indirectLightAsset2 = (IndirectLightAsset) quadruple3.first;
                                                    float floatValue2 = ((Number) quadruple3.second).floatValue();
                                                    SkyboxAsset skyboxAsset2 = (SkyboxAsset) quadruple3.third;
                                                    CardTheme.BackgroundImage backgroundImage2 = (CardTheme.BackgroundImage) quadruple3.fourth;
                                                    Paint paint2 = CardModelView.REMOVE_PAINT;
                                                    cardModelView.safeDestroySkybox();
                                                    if (skyboxAsset2 != null) {
                                                        Engine engine = cardModelView.getEngine();
                                                        nCreateBuilder3 = Texture.nCreateBuilder();
                                                        new IadFrame(nCreateBuilder3, 11);
                                                        BufferedImageAsset bufferedImageAsset = skyboxAsset2.bufferedImageAsset;
                                                        int i13 = bufferedImageAsset.width;
                                                        int i14 = bufferedImageAsset.height;
                                                        Texture.nBuilderWidth(nCreateBuilder3, i13);
                                                        Texture.nBuilderHeight(nCreateBuilder3, i14);
                                                        Texture.nBuilderLevels(nCreateBuilder3, 1);
                                                        Texture.nBuilderFormat(nCreateBuilder3, 29);
                                                        Texture.nBuilderSampler(nCreateBuilder3, 2);
                                                        i4 = 1;
                                                        f = floatValue2;
                                                        nBuilderBuild3 = Texture.nBuilderBuild(nCreateBuilder3, engine.getNativeObject());
                                                        if (nBuilderBuild3 != 0) {
                                                            Texture texture = new Texture();
                                                            texture.mNativeObject = nBuilderBuild3;
                                                            int i15 = i13 * i14 * 4;
                                                            int[] iArr = new int[6];
                                                            int i16 = 0;
                                                            for (int i17 = 6; i16 < i17; i17 = 6) {
                                                                iArr[i16] = i16 * i15;
                                                                i16++;
                                                            }
                                                            texture.setImage(engine, 0, new ByteBufferRewinder(bufferedImageAsset.buffer, false), iArr);
                                                            nCreateBuilder4 = Skybox.nCreateBuilder();
                                                            new IadFrame(nCreateBuilder4, 10);
                                                            Skybox.nBuilderEnvironment(nCreateBuilder4, texture.getNativeObject());
                                                            nBuilderBuild4 = Skybox.nBuilderBuild(nCreateBuilder4, engine.getNativeObject());
                                                            if (nBuilderBuild4 != 0) {
                                                                Skybox skybox = new Skybox();
                                                                skybox.mNativeObject = nBuilderBuild4;
                                                                pair = new Pair(skybox, texture);
                                                                cardModelView.getScene().setSkybox(skybox);
                                                            } else {
                                                                a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Skybox");
                                                            }
                                                        } else {
                                                            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Texture");
                                                        }
                                                        return null;
                                                    }
                                                    i4 = 1;
                                                    f = floatValue2;
                                                    pair = null;
                                                    cardModelView.skyboxEntities = pair;
                                                    cardModelView.safeDestroyIndirectLight();
                                                    indirectLightAsset2.getClass();
                                                    Engine engine2 = cardModelView.getEngine();
                                                    nCreateBuilder = Texture.nCreateBuilder();
                                                    new IadFrame(nCreateBuilder, 11);
                                                    Texture.nBuilderWidth(nCreateBuilder, indirectLightAsset2.width);
                                                    Texture.nBuilderHeight(nCreateBuilder, indirectLightAsset2.height);
                                                    Texture.nBuilderLevels(nCreateBuilder, ((int) (Math.log(r10) / Constants.LN2)) + 1);
                                                    Texture.nBuilderFormat(nCreateBuilder, 29);
                                                    Texture.nBuilderSampler(nCreateBuilder, 2);
                                                    nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine2.getNativeObject());
                                                    if (nBuilderBuild != 0) {
                                                        Texture texture2 = new Texture();
                                                        texture2.mNativeObject = nBuilderBuild;
                                                        int i18 = 0;
                                                        for (Object obj5 : indirectLightAsset2.buffer) {
                                                            int i19 = i18 + 1;
                                                            if (i18 < 0) {
                                                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                                throw null;
                                                            }
                                                            BufferedImageAsset bufferedImageAsset2 = (BufferedImageAsset) obj5;
                                                            int i20 = bufferedImageAsset2.width * bufferedImageAsset2.height * 4;
                                                            int[] iArr2 = new int[6];
                                                            for (int i21 = 0; i21 < 6; i21++) {
                                                                iArr2[i21] = i21 * i20;
                                                            }
                                                            texture2.setImage(engine2, i18, new ByteBufferRewinder(bufferedImageAsset2.buffer, false), iArr2);
                                                            i18 = i19;
                                                        }
                                                        nCreateBuilder2 = IndirectLight.nCreateBuilder();
                                                        new IadFrame(nCreateBuilder2, 7);
                                                        IndirectLight.nBuilderReflections(nCreateBuilder2, texture2.getNativeObject());
                                                        IndirectLight.nIntensity(nCreateBuilder2, f);
                                                        nBuilderBuild2 = IndirectLight.nBuilderBuild(nCreateBuilder2, engine2.getNativeObject());
                                                        if (nBuilderBuild2 != 0) {
                                                            IndirectLight indirectLight = new IndirectLight();
                                                            indirectLight.mNativeObject = nBuilderBuild2;
                                                            Pair pair2 = new Pair(indirectLight, texture2);
                                                            cardModelView.getScene().setIndirectLight(indirectLight);
                                                            cardModelView.indirectLightEntities = pair2;
                                                            cardModelView.safeDestroySpotlight();
                                                            if (backgroundImage2 == CardTheme.BackgroundImage.DREAM) {
                                                                cardModelView.leftEye = new Integer(CardModelView.access$createLEDLight(cardModelView));
                                                                cardModelView.rightEye = new Integer(CardModelView.access$createLEDLight(cardModelView));
                                                            }
                                                            Unit unit = Unit.INSTANCE;
                                                            cardModelView$lighting$$inlined$map$3$2$1.label = i4;
                                                            if (flowCollector.emit(unit, cardModelView$lighting$$inlined$map$3$2$1) == coroutineSingletons5) {
                                                                return coroutineSingletons5;
                                                            }
                                                        } else {
                                                            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create IndirectLight");
                                                        }
                                                    } else {
                                                        a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Texture");
                                                    }
                                                    return null;
                                                }
                                                if (i3 != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    return null;
                                                }
                                                SafeTrace.throwOnFailure(obj4);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        cardModelView$lighting$$inlined$map$3$2$1 = new CardModelView$lighting$$inlined$map$3$2$1(this, continuation);
                                        Object obj42 = cardModelView$lighting$$inlined$map$3$2$1.result;
                                        CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = cardModelView$lighting$$inlined$map$3$2$1.label;
                                        if (i3 != 0) {
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector4, Continuation continuation2) {
                            int i11 = i10;
                            CardModelView cardModelView2 = cardModelView;
                            Flow flow = distinctUntilChanged;
                            switch (i11) {
                                case 0:
                                    Object collect = flow.collect(new AnonymousClass2(flowCollector4, cardModelView2, 0), continuation2);
                                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object collect2 = flow.collect(new AnonymousClass2(flowCollector4, cardModelView2, 2), continuation2);
                                    if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, defaultIoScheduler);
                    final int i11 = 1;
                    Continuation continuation2 = null;
                    int i12 = 0;
                    Continuation continuation3 = null;
                    Flow[] flowArr = {transformLatest, transformLatest2, transformLatest3, transformLatest4, new Flow() { // from class: com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2

                        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ FlowCollector $this_unsafeFlow;
                            public final /* synthetic */ CardModelView this$0;

                            /* renamed from: com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2$2$1, reason: invalid class name */
                            public final class AnonymousClass1 extends ContinuationImpl {
                                public int label;
                                public /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= PKIFailureInfo.systemUnavail;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, CardModelView cardModelView, int i) {
                                this.$r8$classId = i;
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = cardModelView;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x0221  */
                            /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
                            /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0277  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                CoroutineSingletons coroutineSingletons;
                                SkyboxAsset skyboxAsset;
                                CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1 cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1;
                                int i2;
                                CardModelView$lighting$$inlined$map$3$2$1 cardModelView$lighting$$inlined$map$3$2$1;
                                int i3;
                                int i4;
                                float f;
                                Pair pair;
                                long nCreateBuilder;
                                long nBuilderBuild;
                                long nCreateBuilder2;
                                long nBuilderBuild2;
                                long nCreateBuilder3;
                                long nBuilderBuild3;
                                long nCreateBuilder4;
                                long nBuilderBuild4;
                                int i5 = this.$r8$classId;
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                CardModelView cardModelView = this.this$0;
                                switch (i5) {
                                    case 0:
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i6 = anonymousClass1.label;
                                            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                                                Object obj22 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    SafeTrace.throwOnFailure(obj22);
                                                    Quadruple quadruple = (Quadruple) obj;
                                                    String str = (String) quadruple.first;
                                                    float floatValue = ((Number) quadruple.second).floatValue();
                                                    boolean booleanValue = ((Boolean) quadruple.third).booleanValue();
                                                    CardTheme.BackgroundImage backgroundImage = (CardTheme.BackgroundImage) quadruple.fourth;
                                                    String m = Recorder$$ExternalSyntheticOutline2.m("envs/", str);
                                                    AssetManager assets = cardModelView.getContext().getAssets();
                                                    assets.getClass();
                                                    Pair peekSize = IblLoaderKt.peekSize(assets, m.concat("/m0_nx.rgb32f"));
                                                    int intValue = ((Number) peekSize.first).intValue();
                                                    int intValue2 = ((Number) peekSize.second).intValue();
                                                    ArrayList arrayList = new ArrayList();
                                                    int log = ((int) (Math.log(intValue) / Constants.LN2)) + 1;
                                                    int i7 = intValue2;
                                                    int i8 = intValue;
                                                    int i9 = 0;
                                                    while (true) {
                                                        if (i9 < log) {
                                                            int i10 = log;
                                                            coroutineSingletons = coroutineSingletons22;
                                                            ByteBuffer loadCubemap = IblLoaderKt.loadCubemap(assets, m, i8, i7, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i9, "m", "_"));
                                                            if (loadCubemap != null) {
                                                                arrayList.add(new BufferedImageAsset(loadCubemap, i8, i7));
                                                                i8 /= 2;
                                                                i7 /= 2;
                                                                i9++;
                                                                log = i10;
                                                                coroutineSingletons22 = coroutineSingletons;
                                                            }
                                                        } else {
                                                            coroutineSingletons = coroutineSingletons22;
                                                        }
                                                    }
                                                    IndirectLightAsset indirectLightAsset = new IndirectLightAsset(arrayList, intValue, intValue2);
                                                    if (booleanValue) {
                                                        String m2 = Recorder$$ExternalSyntheticOutline2.m("envs/", str);
                                                        AssetManager assets2 = cardModelView.getContext().getAssets();
                                                        assets2.getClass();
                                                        Pair peekSize2 = IblLoaderKt.peekSize(assets2, m2.concat("/nx.rgb32f"));
                                                        int intValue3 = ((Number) peekSize2.first).intValue();
                                                        int intValue4 = ((Number) peekSize2.second).intValue();
                                                        ByteBuffer loadCubemap2 = IblLoaderKt.loadCubemap(assets2, m2, intValue3, intValue4, "");
                                                        loadCubemap2.getClass();
                                                        skyboxAsset = new SkyboxAsset(new BufferedImageAsset(loadCubemap2, intValue3, intValue4));
                                                    } else {
                                                        skyboxAsset = null;
                                                    }
                                                    Quadruple quadruple2 = new Quadruple(indirectLightAsset, new Float(floatValue), skyboxAsset, backgroundImage);
                                                    anonymousClass1.label = 1;
                                                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                                    if (flowCollector.emit(quadruple2, anonymousClass1) == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        return null;
                                                    }
                                                    SafeTrace.throwOnFailure(obj22);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj222 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                        return Unit.INSTANCE;
                                    case 1:
                                        if (continuation instanceof CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1) {
                                            cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1 = (CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1) continuation;
                                            int i11 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label;
                                            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                                                cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                                                Object obj32 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.result;
                                                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i2 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label;
                                                if (i2 != 0) {
                                                    SafeTrace.throwOnFailure(obj32);
                                                    Paint paint = CardModelView.REMOVE_PAINT;
                                                    PointF pointF = cardModelView.touchTextureIntersect((PointF) obj);
                                                    cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label = 1;
                                                    if (flowCollector.emit(pointF, cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1) == coroutineSingletons42) {
                                                        return coroutineSingletons42;
                                                    }
                                                } else {
                                                    if (i2 != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        return null;
                                                    }
                                                    SafeTrace.throwOnFailure(obj32);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1 = new CardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1(this, continuation);
                                        Object obj322 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = cardModelView$getActiveHeat$lambda$1$$inlined$map$1$2$1.label;
                                        if (i2 != 0) {
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        if (continuation instanceof CardModelView$lighting$$inlined$map$3$2$1) {
                                            cardModelView$lighting$$inlined$map$3$2$1 = (CardModelView$lighting$$inlined$map$3$2$1) continuation;
                                            int i12 = cardModelView$lighting$$inlined$map$3$2$1.label;
                                            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                                                cardModelView$lighting$$inlined$map$3$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                                                Object obj42 = cardModelView$lighting$$inlined$map$3$2$1.result;
                                                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i3 = cardModelView$lighting$$inlined$map$3$2$1.label;
                                                if (i3 != 0) {
                                                    SafeTrace.throwOnFailure(obj42);
                                                    Quadruple quadruple3 = (Quadruple) obj;
                                                    IndirectLightAsset indirectLightAsset2 = (IndirectLightAsset) quadruple3.first;
                                                    float floatValue2 = ((Number) quadruple3.second).floatValue();
                                                    SkyboxAsset skyboxAsset2 = (SkyboxAsset) quadruple3.third;
                                                    CardTheme.BackgroundImage backgroundImage2 = (CardTheme.BackgroundImage) quadruple3.fourth;
                                                    Paint paint2 = CardModelView.REMOVE_PAINT;
                                                    cardModelView.safeDestroySkybox();
                                                    if (skyboxAsset2 != null) {
                                                        Engine engine = cardModelView.getEngine();
                                                        nCreateBuilder3 = Texture.nCreateBuilder();
                                                        new IadFrame(nCreateBuilder3, 11);
                                                        BufferedImageAsset bufferedImageAsset = skyboxAsset2.bufferedImageAsset;
                                                        int i13 = bufferedImageAsset.width;
                                                        int i14 = bufferedImageAsset.height;
                                                        Texture.nBuilderWidth(nCreateBuilder3, i13);
                                                        Texture.nBuilderHeight(nCreateBuilder3, i14);
                                                        Texture.nBuilderLevels(nCreateBuilder3, 1);
                                                        Texture.nBuilderFormat(nCreateBuilder3, 29);
                                                        Texture.nBuilderSampler(nCreateBuilder3, 2);
                                                        i4 = 1;
                                                        f = floatValue2;
                                                        nBuilderBuild3 = Texture.nBuilderBuild(nCreateBuilder3, engine.getNativeObject());
                                                        if (nBuilderBuild3 != 0) {
                                                            Texture texture = new Texture();
                                                            texture.mNativeObject = nBuilderBuild3;
                                                            int i15 = i13 * i14 * 4;
                                                            int[] iArr = new int[6];
                                                            int i16 = 0;
                                                            for (int i17 = 6; i16 < i17; i17 = 6) {
                                                                iArr[i16] = i16 * i15;
                                                                i16++;
                                                            }
                                                            texture.setImage(engine, 0, new ByteBufferRewinder(bufferedImageAsset.buffer, false), iArr);
                                                            nCreateBuilder4 = Skybox.nCreateBuilder();
                                                            new IadFrame(nCreateBuilder4, 10);
                                                            Skybox.nBuilderEnvironment(nCreateBuilder4, texture.getNativeObject());
                                                            nBuilderBuild4 = Skybox.nBuilderBuild(nCreateBuilder4, engine.getNativeObject());
                                                            if (nBuilderBuild4 != 0) {
                                                                Skybox skybox = new Skybox();
                                                                skybox.mNativeObject = nBuilderBuild4;
                                                                pair = new Pair(skybox, texture);
                                                                cardModelView.getScene().setSkybox(skybox);
                                                            } else {
                                                                a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Skybox");
                                                            }
                                                        } else {
                                                            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Texture");
                                                        }
                                                        return null;
                                                    }
                                                    i4 = 1;
                                                    f = floatValue2;
                                                    pair = null;
                                                    cardModelView.skyboxEntities = pair;
                                                    cardModelView.safeDestroyIndirectLight();
                                                    indirectLightAsset2.getClass();
                                                    Engine engine2 = cardModelView.getEngine();
                                                    nCreateBuilder = Texture.nCreateBuilder();
                                                    new IadFrame(nCreateBuilder, 11);
                                                    Texture.nBuilderWidth(nCreateBuilder, indirectLightAsset2.width);
                                                    Texture.nBuilderHeight(nCreateBuilder, indirectLightAsset2.height);
                                                    Texture.nBuilderLevels(nCreateBuilder, ((int) (Math.log(r10) / Constants.LN2)) + 1);
                                                    Texture.nBuilderFormat(nCreateBuilder, 29);
                                                    Texture.nBuilderSampler(nCreateBuilder, 2);
                                                    nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine2.getNativeObject());
                                                    if (nBuilderBuild != 0) {
                                                        Texture texture2 = new Texture();
                                                        texture2.mNativeObject = nBuilderBuild;
                                                        int i18 = 0;
                                                        for (Object obj5 : indirectLightAsset2.buffer) {
                                                            int i19 = i18 + 1;
                                                            if (i18 < 0) {
                                                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                                throw null;
                                                            }
                                                            BufferedImageAsset bufferedImageAsset2 = (BufferedImageAsset) obj5;
                                                            int i20 = bufferedImageAsset2.width * bufferedImageAsset2.height * 4;
                                                            int[] iArr2 = new int[6];
                                                            for (int i21 = 0; i21 < 6; i21++) {
                                                                iArr2[i21] = i21 * i20;
                                                            }
                                                            texture2.setImage(engine2, i18, new ByteBufferRewinder(bufferedImageAsset2.buffer, false), iArr2);
                                                            i18 = i19;
                                                        }
                                                        nCreateBuilder2 = IndirectLight.nCreateBuilder();
                                                        new IadFrame(nCreateBuilder2, 7);
                                                        IndirectLight.nBuilderReflections(nCreateBuilder2, texture2.getNativeObject());
                                                        IndirectLight.nIntensity(nCreateBuilder2, f);
                                                        nBuilderBuild2 = IndirectLight.nBuilderBuild(nCreateBuilder2, engine2.getNativeObject());
                                                        if (nBuilderBuild2 != 0) {
                                                            IndirectLight indirectLight = new IndirectLight();
                                                            indirectLight.mNativeObject = nBuilderBuild2;
                                                            Pair pair2 = new Pair(indirectLight, texture2);
                                                            cardModelView.getScene().setIndirectLight(indirectLight);
                                                            cardModelView.indirectLightEntities = pair2;
                                                            cardModelView.safeDestroySpotlight();
                                                            if (backgroundImage2 == CardTheme.BackgroundImage.DREAM) {
                                                                cardModelView.leftEye = new Integer(CardModelView.access$createLEDLight(cardModelView));
                                                                cardModelView.rightEye = new Integer(CardModelView.access$createLEDLight(cardModelView));
                                                            }
                                                            Unit unit = Unit.INSTANCE;
                                                            cardModelView$lighting$$inlined$map$3$2$1.label = i4;
                                                            if (flowCollector.emit(unit, cardModelView$lighting$$inlined$map$3$2$1) == coroutineSingletons52) {
                                                                return coroutineSingletons52;
                                                            }
                                                        } else {
                                                            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create IndirectLight");
                                                        }
                                                    } else {
                                                        a$$ExternalSyntheticBUOutline0.m$1("Couldn't create Texture");
                                                    }
                                                    return null;
                                                }
                                                if (i3 != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    return null;
                                                }
                                                SafeTrace.throwOnFailure(obj42);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        cardModelView$lighting$$inlined$map$3$2$1 = new CardModelView$lighting$$inlined$map$3$2$1(this, continuation);
                                        Object obj422 = cardModelView$lighting$$inlined$map$3$2$1.result;
                                        CoroutineSingletons coroutineSingletons522 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = cardModelView$lighting$$inlined$map$3$2$1.label;
                                        if (i3 != 0) {
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector4, Continuation continuation22) {
                            int i112 = i11;
                            CardModelView cardModelView2 = cardModelView;
                            Flow flow = flowOn3;
                            switch (i112) {
                                case 0:
                                    Object collect = flow.collect(new AnonymousClass2(flowCollector4, cardModelView2, 0), continuation22);
                                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object collect2 = flow.collect(new AnonymousClass2(flowCollector4, cardModelView2, 2), continuation22);
                                    if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 5)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(3, cardModelView, continuation2)), FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 6)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(4, cardModelView, continuation2)), FlowKt.transformLatest(new CardModelView$cardHeat$$inlined$map$1(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 11)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(9, cardModelView, continuation2)), i12), new CardModelView$cardHeat$$inlined$flatMapLatest$1(i12, cardModelView, continuation2)), new SafeFlow(new CardModelView.AnonymousClass1(2, cardModelView, continuation2)), FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$iconTexture$$inlined$map$1(cardModelView.iconTextureRelay, 0)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(10, cardModelView, continuation3)), FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, 9)), new CardModelView$cardHeat$$inlined$flatMapLatest$1(7, cardModelView, continuation3))};
                    int i13 = 0;
                    FlowExtensionsKt$doOnFirst$$inlined$map$1 doOnFirst = StateFlowKt.doOnFirst(FlowKt.combine(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, flowOn2, new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(CollectionsKt__CollectionsKt.listOf((Object[]) flowArr)).toArray(new Flow[0]), i13), new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl, 24), i9)), new CardModelView$colorGradient$2(i13, cardModelView, null), 3), CardModelView$1$3$3.INSTANCE), new StripePaymentController$$ExternalSyntheticLambda1(23), new KClasses$$Lambda$2(cardModelView, 10));
                    CardModelView$1$3$5 cardModelView$1$3$5 = new CardModelView$1$3$5(cardModelView, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector3);
                    Object collect = doOnFirst.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(flowCollector3, cardModelView$1$3$5, 1), this);
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons3) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                FlowCollector flowCollector4 = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Septuple septuple = (Septuple) obj4;
                    CardTheme.Identifier identifier = (CardTheme.Identifier) septuple.first;
                    SafeFlow safeFlow3 = new SafeFlow(new CardModelView$cardAlbedo$2$1(septuple.seventh.floatValue(), septuple.fourth.intValue(), septuple.second.intValue(), septuple.fifth.intValue(), septuple.sixth, this.this$0, (CardTheme.BackgroundImage) septuple.third, identifier, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector4, safeFlow3, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                FlowCollector flowCollector5 = this.L$0;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow4 = new SafeFlow(new CardModelView$cardHeatSample$2$1(cardModelView, (CardTheme.BackgroundImage) obj5, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector5, safeFlow4, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                FlowCollector flowCollector6 = this.L$0;
                Object obj6 = this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow5 = new SafeFlow(new CardModelView$cardHoloSamples$2$1((CardTheme.Identifier) obj6, cardModelView, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector6, safeFlow5, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                FlowCollector flowCollector7 = this.L$0;
                Object obj7 = this.L$1;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair = (Pair) obj7;
                    SafeFlow safeFlow6 = new SafeFlow(new EngineInterceptor$intercept$2((CardModelView.CardFront) pair.first, (CardModelView.CardBack) pair.second, this.this$0, null, 25));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector7, safeFlow6, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                FlowCollector flowCollector8 = this.L$0;
                Object obj8 = this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow7 = new SafeFlow(new CardModelView$cardNormal$2$1(cardModelView, (CardTheme.BackgroundImage) obj8, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector8, safeFlow7, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                FlowCollector flowCollector9 = this.L$0;
                Object obj9 = this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow8 = new SafeFlow(new CardModelView$contouredTextTexture$2$1((CardContouredText) obj9, cardModelView, continuation, i5));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector9, safeFlow8, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                FlowCollector flowCollector10 = this.L$0;
                Object obj10 = this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow9 = new SafeFlow(new RealBlockersHelper$skipBlocker$1(cardModelView, (CardModelView.CardBack) obj10, continuation, i4));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector10, safeFlow9, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                SharedFlowImpl sharedFlowImpl = cardModelView.touchPoints;
                Lazy lazy = cardModelView.moodHandMask$delegate;
                FlowCollector flowCollector11 = this.L$0;
                Object obj11 = this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Continuation continuation4 = null;
                    if (((CardTheme.BackgroundImage) obj11) != CardTheme.BackgroundImage.MOOD) {
                        flowOn = new AppLockMonitor$special$$inlined$map$2(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888), 19);
                        flowCollector = flowCollector11;
                        coroutineSingletons = coroutineSingletons11;
                    } else {
                        sharedFlowImpl.getClass();
                        flowCollector = flowCollector11;
                        int i22 = 16;
                        coroutineSingletons = coroutineSingletons11;
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, continuation4, 13), FlowKt.transformLatest(new SafeFlow(new ToastKt$Toast$8$1(sharedFlowImpl, 33L, continuation4, i22)), new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(i4, continuation4, i5)));
                        sharedFlowImpl.getClass();
                        ChannelFlowBuilder merge = FlowKt.merge(flowKt__MergeKt$flatMapConcat$$inlined$map$1, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealTransferManager$addCash$$inlined$map$1(new SafeFlow(new ToastKt$Toast$8$1(sharedFlowImpl, 50L, continuation4, i22)), cardModelView, i2), 24));
                        Bitmap createBitmap = Bitmap.createBitmap(971, 1307, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Bitmap bitmap = (Bitmap) lazy.getValue();
                        Rect rect = new Rect(0, 0, ((Bitmap) lazy.getValue()).getWidth(), ((Bitmap) lazy.getValue()).getHeight());
                        Rect rect2 = new Rect(0, 0, 971, 612);
                        Paint paint = new Paint();
                        paint.setColor(-16776961);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
                        canvas.drawBitmap(bitmap, rect, rect2, paint);
                        canvas.drawBitmap((Bitmap) cardModelView.moodSkin$delegate.getValue(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, CardModelView.REMOVE_PAINT);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1 = new FlowUtil$createFlow$$inlined$map$1(createBitmap, merge, new CardModelView$getActiveHeat$2$2(cardModelView, continuation4, i5));
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        flowOn = FlowKt.flowOn(flowUtil$createFlow$$inlined$map$1, DefaultIoScheduler.INSTANCE);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, flowOn, this) == coroutineSingletons) {
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector12 = this.L$0;
                Object obj12 = this.L$1;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow10 = new SafeFlow(new CardModelView$cardHeat$2$1(cardModelView, (EquatableBitmap) obj12, continuation, i6));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector12, safeFlow10, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
