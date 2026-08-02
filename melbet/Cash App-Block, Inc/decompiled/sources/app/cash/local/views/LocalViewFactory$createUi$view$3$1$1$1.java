package app.cash.local.views;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.media3.common.FlagSet;
import app.cash.local.views.internal.LocalBrandBannerKt$LocalBrandBanner$3$1$1$1;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.map.BrandCollectionMapViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cardcustomizations.stampview.StampsKt$detectStampGestures$2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.clientsync.persistence.RealClientSyncTransactor$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.core.navigationcontainer.SpacesPagerInteractionManagerImpl;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.money.views.CardNestedScrollExpander$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class LocalViewFactory$createUi$view$3$1$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ Object $pagerInteractionManager;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $scope;

    public /* synthetic */ LocalViewFactory$createUi$view$3$1$1$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$scope = obj;
        this.$pagerInteractionManager = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 8;
        int i4 = 1;
        Continuation continuation2 = null;
        Object obj = this.$pagerInteractionManager;
        Object obj2 = this.$scope;
        switch (i) {
            case 0:
                Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new AnonymousClass1((CoroutineScope) obj2, (SpacesPagerInteractionManagerImpl) obj, continuation2, 0), continuation);
                if (awaitEachGesture != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object coroutineScope = JobKt.coroutineScope(new zzmh(pointerInputScope, (TextDragObserver) obj2, (TextFieldSelectionManager) obj, (Continuation) null, 1), continuation);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object awaitEachGesture2 = Draggable2DKt.awaitEachGesture(pointerInputScope, new FileSystem$commonDeleteRecursively$sequence$1((SelectionManager) obj2, (SelectionManager$$ExternalSyntheticLambda0) obj, continuation2, 5), continuation);
                if (awaitEachGesture2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                PatternStampState patternStampState = (PatternStampState) obj2;
                StampMovingListener stampMovingListener = (StampMovingListener) obj;
                Object awaitEachGesture3 = Draggable2DKt.awaitEachGesture(pointerInputScope, new StampsKt$detectStampGestures$2(new CombinedModifier$$ExternalSyntheticLambda0(13, patternStampState, stampMovingListener), new BrandCollectionMapViewKt$$ExternalSyntheticLambda6(i4, patternStampState, stampMovingListener), new MenuPickerSheetKt$$ExternalSyntheticLambda4(i2, patternStampState, stampMovingListener), null), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (awaitEachGesture3 != coroutineSingletons) {
                    awaitEachGesture3 = Unit.INSTANCE;
                }
                if (awaitEachGesture3 != coroutineSingletons) {
                    break;
                }
                break;
            case 4:
                StampState stampState = (StampState) obj2;
                StampMovingListener stampMovingListener2 = (StampMovingListener) obj;
                Object awaitEachGesture4 = Draggable2DKt.awaitEachGesture(pointerInputScope, new StampsKt$detectStampGestures$2(new CombinedModifier$$ExternalSyntheticLambda0(15, stampState, stampMovingListener2), new BrandCollectionMapViewKt$$ExternalSyntheticLambda6(2, stampState, stampMovingListener2), new MenuPickerSheetKt$$ExternalSyntheticLambda4(i3, stampState, stampMovingListener2), null), continuation);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (awaitEachGesture4 != coroutineSingletons2) {
                    awaitEachGesture4 = Unit.INSTANCE;
                }
                if (awaitEachGesture4 != coroutineSingletons2) {
                    break;
                }
                break;
            case 5:
                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new BadgeQueries$$ExternalSyntheticLambda0(16, (NetworkFetcher$fetch$2) obj2, (Shaker) obj), continuation, 7);
                if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object detectTapGestures$default2 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, new LocalBrandBannerKt$LocalBrandBanner$3$1$1$1((MutableState) obj2, continuation2, i4), new LocalMapKt$$ExternalSyntheticLambda10(19, (Function0) obj), continuation, 3);
                if (detectTapGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object awaitEachGesture5 = Draggable2DKt.awaitEachGesture(pointerInputScope, new AnonymousClass1((Function2) obj2, (TagPoseController) obj, continuation2, i2), continuation);
                if (awaitEachGesture5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                LinkTapDetectorState linkTapDetectorState = (LinkTapDetectorState) obj2;
                Object coroutineScope2 = JobKt.coroutineScope(new RealBlockersHelper$skipBlocker$1(pointerInputScope, new BadgedBoxKt$$ExternalSyntheticLambda0(12, ref$ObjectRef, linkTapDetectorState), new RealClientSyncTransactor$$ExternalSyntheticLambda0(ref$ObjectRef, (Function1) obj), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(ref$ObjectRef, linkTapDetectorState, continuation2, i3), (Continuation) null, 14), continuation);
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (coroutineScope2 != coroutineSingletons3) {
                    coroutineScope2 = Unit.INSTANCE;
                }
                if (coroutineScope2 != coroutineSingletons3) {
                    break;
                }
                break;
            case 9:
                if (((CardSchemeViewModel.Module.HeroTag) obj2) == null || (r12 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new CardNestedScrollExpander$$ExternalSyntheticLambda1((CardNestedScrollExpander) obj, 1), continuation, 7)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            default:
                Object detectTapGestures$default3 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new OpenSourceKt$$ExternalSyntheticLambda11(9, (Function1) obj2, (Text) obj), continuation, 7);
                if (detectTapGestures$default3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        public final /* synthetic */ Object $pagerInteractionManager;
        public final /* synthetic */ int $r8$classId;
        public Object $scope;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$1 = obj;
            this.$scope = obj2;
            this.$pagerInteractionManager = obj3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$pagerInteractionManager;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((CoroutineScope) this.$scope, (SpacesPagerInteractionManagerImpl) obj2, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 1:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((PagerState) obj2, continuation, 1);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 2:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((StylusHandwritingNode) obj2, continuation, 2);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 3:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((FlagSet.Builder) this.$scope, (TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2) obj2, continuation, 3);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 4:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((HuffmanTreeGroup) this.L$1, (MouseSelectionObserver) this.$scope, (TextDragObserver) obj2, continuation, 4);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                case 5:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1((CoroutineScope) this.$scope, (TooltipStateImpl) obj2, continuation, 5);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
                case 6:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1((MutableState) this.L$1, (CoroutineScope) this.$scope, (MutableSharedFlow) obj2, continuation, 6);
                    anonymousClass17.L$0 = obj;
                    return anonymousClass17;
                case 7:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1((Function2) this.$scope, (TagPoseController) obj2, continuation, 7);
                    anonymousClass18.L$0 = obj;
                    return anonymousClass18;
                default:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1((FocusRequester) this.L$1, (View) this.$scope, (Context) obj2, continuation, 8);
                    anonymousClass19.L$0 = obj;
                    return anonymousClass19;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 6:
                    ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 7:
                    return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                default:
                    ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x02ca  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x068e  */
        /* JADX WARN: Removed duplicated region for block: B:377:0x06ca  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:7:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x036e -> B:129:0x0372). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x05f7 -> B:162:0x05fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:269:0x045f -> B:182:0x0463). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x069d -> B:304:0x06a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x016e -> B:53:0x0172). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01eb -> B:69:0x01ef). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 1882
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$scope = obj;
            this.$pagerInteractionManager = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$pagerInteractionManager = obj;
        }
    }
}
