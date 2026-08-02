package androidx.compose.material3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.window.SurfaceSyncGroup;
import androidx.biometric.KeyguardUtils;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.presenter.SwipeContext;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.Sparkle;
import com.squareup.cash.activity.viewmodels.UpdateSearchQuery;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class DateInputKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda5(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long duration;
        int i = this.$r8$classId;
        int i2 = 1;
        final MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                if (!StringsKt.isBlank((CharSequence) mutableState.getValue())) {
                    String str = (String) mutableState.getValue();
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                    semanticsPropertyReceiver.set(SemanticsProperties.Error, str);
                }
                return Unit.INSTANCE;
            case 1:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((Function1) mutableState.getValue()).invoke(f)).floatValue());
            case 2:
                List list = (List) obj;
                if (mutableState != null) {
                    mutableState.setValue(list);
                }
                return Unit.INSTANCE;
            case 3:
                ((Function1) mutableState.getValue()).invoke((Offset) obj);
                return Unit.INSTANCE;
            case 4:
                mutableState.setValue((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue((Selection) obj);
                return Unit.INSTANCE;
            case 7:
                mutableState.setValue((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            case 8:
                final Context context = (Context) obj;
                context.getClass();
                return new SurfaceView(context) { // from class: androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurface$createSurfaceView$1$1$1
                    @Override // android.view.SurfaceView, android.view.View
                    public final void dispatchDraw(Canvas canvas) {
                        canvas.getClass();
                        super.dispatchDraw(canvas);
                        if (Build.VERSION.SDK_INT == 34) {
                            MutableState mutableState2 = mutableState;
                            SurfaceSyncGroup surfaceSyncGroup = (SurfaceSyncGroup) mutableState2.getValue();
                            if (surfaceSyncGroup != null) {
                                surfaceSyncGroup.markSyncReady();
                            }
                            mutableState2.setValue(null);
                        }
                    }
                };
            case 9:
                View view = (View) obj;
                view.getClass();
                mutableState.setValue(view);
                return Unit.INSTANCE;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
                return Unit.INSTANCE;
            case 11:
                SwipeContext swipeContext = (SwipeContext) obj;
                swipeContext.getClass();
                mutableState.setValue(Boolean.valueOf(swipeContext.usedSwipeGesture));
                return Unit.INSTANCE;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 14:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                mutableState.setValue(bool3);
                return Unit.INSTANCE;
            case 15:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                mutableState.setValue(bool4);
                return Unit.INSTANCE;
            case 16:
                Integer num = (Integer) obj;
                num.getClass();
                mutableState.setValue(num);
                return Unit.INSTANCE;
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                mutableState.setValue(bitmap);
                return Unit.INSTANCE;
            case 18:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                ((Function1) mutableState.getValue()).invoke(new LocalHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                return Unit.INSTANCE;
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    semanticsPropertyReceiver2.set(SemanticsActions.Collapse, new AccessibilityAction(null, new TooltipKt$$ExternalSyntheticLambda1(29, mutableState)));
                } else {
                    semanticsPropertyReceiver2.set(SemanticsActions.Expand, new AccessibilityAction(null, new TabContentViewKt$$ExternalSyntheticLambda1(i2, mutableState)));
                }
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                return Unit.INSTANCE;
            case 21:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                LocalPosBrandOnboardingViewModel.CallToAction.Style style = ((LocalPosBrandOnboardingViewModel.CallToAction) animatedContentTransitionScopeImpl.getInitialState()).style;
                LocalPosBrandOnboardingViewModel.CallToAction.Style style2 = LocalPosBrandOnboardingViewModel.CallToAction.Style.LABEL;
                if (style == style2 || ((LocalPosBrandOnboardingViewModel.CallToAction) animatedContentTransitionScopeImpl.getTargetState()).style != style2 || !((Boolean) mutableState.getValue()).booleanValue()) {
                    return AnimatedContentKt.togetherWith(EnterTransitionImpl.None, ExitTransitionImpl.None);
                }
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimatableKt.tween$default(280, 40, null, 4), new SvgDecoder$$ExternalSyntheticLambda0(1)).plus(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 60, null, 4), 2)), EnterExitTransitionKt.slideOutVertically(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 0, null, 6), new SvgDecoder$$ExternalSyntheticLambda0(1)).plus(EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, null, 6), 2)));
            case 22:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(Float.valueOf(Float.intBitsToFloat((int) (layoutCoordinates.mo842localToScreenMKHz9U(0L) & BodyPartID.bodyIdMax))));
                return Unit.INSTANCE;
            case 23:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return ((Boolean) mutableState.getValue()).booleanValue() ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimatableKt.tween$default(800, 0, null, 6), new SvgDecoder$$ExternalSyntheticLambda0(1)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(400, 0, null, 6), 2)) : AnimatedContentKt.togetherWith(EnterTransitionImpl.None, ExitTransitionImpl.None);
            case 24:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                return Unit.INSTANCE;
            case 25:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent2 = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent2.getClass();
                ((Function1) mutableState.getValue()).invoke(new LocalHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent2));
                return Unit.INSTANCE;
            case 26:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                LayoutCoordinates parentLayoutCoordinates = layoutCoordinates2.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null) {
                    mutableState.setValue(new Size(Countries.m3991toSizeozmzZPI(parentLayoutCoordinates.mo838getSizeYbymL2g())));
                }
                return Unit.INSTANCE;
            case 27:
                Animatable animatable = (Animatable) obj;
                List<Sparkle> list2 = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Sparkle sparkle : list2) {
                    arrayList.add(new Sparkle(sparkle.initialX, sparkle.initialY, sparkle.initialWidth, sparkle.initialHeight, sparkle.color, sparkle.alpha, sparkle.lifespan, ((Number) animatable.getValue()).floatValue(), sparkle.floatUp));
                }
                mutableState.setValue(arrayList);
                return Unit.INSTANCE;
            case 28:
                SwipeContext swipeContext2 = (SwipeContext) obj;
                swipeContext2.getClass();
                mutableState.setValue(Boolean.valueOf(swipeContext2.usedSwipeGesture));
                return Unit.INSTANCE;
            default:
                if (KeyguardUtils.isValidSearchQuery(((UpdateSearchQuery) obj).newQuery.getValue()) && ((Boolean) mutableState.getValue()).booleanValue()) {
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(350, DurationUnit.MILLISECONDS);
                } else {
                    Duration.Companion companion2 = Duration.Companion;
                    duration = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                }
                return new Duration(duration);
        }
    }
}
