package com.squareup.cash.arcade.treehouse;

import android.R;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextRange;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.InputFieldHelperText;
import app.cash.redwood.widget.Widget;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.InputFieldBinding;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.CircleSegment;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.resources.ResourcesKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.views.ChatPlaceholderView$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public final class RadioBinding$value$1 extends AbstractComposeView {
    public final /* synthetic */ int $r8$classId;
    public final Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioBinding$value$1(View view, CompositionContext compositionContext, ComposableLambdaImpl composableLambdaImpl, Context context) {
        super(context, null, 6, 0);
        this.$r8$classId = 5;
        this.this$0 = composableLambdaImpl;
        context.getClass();
        setId(R.id.content);
        final LifecycleOwner lifecycleOwner = DBUtil.get(view);
        Object obj = Trace.get(view);
        if (obj == null) {
            obj = lifecycleOwner != null ? new OnBackPressedDispatcherOwner() { // from class: com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$1$1$popupLayout$1$onBackPressedDispatcherOwner$1$1
                public final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Recorder$$ExternalSyntheticLambda13(3));

                @Override // androidx.lifecycle.LifecycleOwner
                public final Lifecycle getLifecycle() {
                    return LifecycleOwner.this.getLifecycle();
                }

                @Override // androidx.activity.OnBackPressedDispatcherOwner
                public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
                    return this.onBackPressedDispatcher;
                }
            } : null;
        }
        setTag(com.squareup.cash.R.id.view_tree_lifecycle_owner, lifecycleOwner);
        if (obj != null) {
            setTag(com.squareup.cash.R.id.view_tree_on_back_pressed_dispatcher_owner, obj);
        }
        setTag(com.squareup.cash.R.id.view_tree_saved_state_registry_owner, Countries.get(view));
        setParentCompositionContext(compositionContext);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        Colors m1468withTint4WTKRHQ;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        ComposableLambdaImpl composableLambdaImpl3;
        ComposableLambdaImpl composableLambdaImpl4;
        GapComposer gapComposer;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        int i2 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 1;
        Object obj = this.this$0;
        boolean z = false;
        switch (i2) {
            case 0:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1864058526);
                RadioBinding radioBinding = (RadioBinding) obj;
                Color color = (Color) radioBinding.tint$delegate.getValue();
                if (color == null) {
                    gapComposer2.startReplaceGroup(1759633080);
                    gapComposer2.end(false);
                    m1468withTint4WTKRHQ = null;
                } else {
                    gapComposer2.startReplaceGroup(1759633081);
                    long j = color.value;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    m1468withTint4WTKRHQ = DimensionKt.m1468withTint4WTKRHQ(colors, j);
                    gapComposer2.end(false);
                }
                if (m1468withTint4WTKRHQ == null) {
                    gapComposer2.startReplaceGroup(-358877912);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    m1468withTint4WTKRHQ = colors2;
                } else {
                    gapComposer2.startReplaceGroup(-358879803);
                }
                gapComposer2.end(false);
                ArcadeThemeKt.ArcadeTheme(m1468withTint4WTKRHQ, null, null, Expect_jvmKt.rememberComposableLambda(1417627565, new ButtonBinding$$ExternalSyntheticLambda2(radioBinding, 22), gapComposer2), gapComposer2, 3072, 6);
                gapComposer2.end(false);
                break;
            case 1:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(252836142);
                ToggleBinding toggleBinding = (ToggleBinding) obj;
                boolean z2 = ((BooleanState) toggleBinding.state$delegate.getValue()).value;
                boolean changedInstance = gapComposer3.changedInstance(toggleBinding);
                Object rememberedValue = gapComposer3.rememberedValue();
                Object obj2 = rememberedValue;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    ContextKt$$ExternalSyntheticLambda1 contextKt$$ExternalSyntheticLambda1 = new ContextKt$$ExternalSyntheticLambda1(toggleBinding, 28);
                    gapComposer3.updateRememberedValue(contextKt$$ExternalSyntheticLambda1);
                    obj2 = contextKt$$ExternalSyntheticLambda1;
                }
                CheckboxKt.UnlabeledCheckbox(z2, (Function1) obj2, null, null, ((Boolean) ((ParcelableSnapshotMutableState) toggleBinding.enabled$delegate).getValue()).booleanValue(), gapComposer3, 0, 12);
                gapComposer3.end(false);
                break;
            case 2:
                final InputFieldBinding inputFieldBinding = (InputFieldBinding) obj;
                TextFieldState textFieldState = inputFieldBinding.composeTextFieldState;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = inputFieldBinding.onKeyboardAction$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = inputFieldBinding.keyboardOptions$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = inputFieldBinding.placeholder$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = inputFieldBinding.isError$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = inputFieldBinding.readOnly$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = inputFieldBinding.enabled$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState7 = inputFieldBinding.lineLimits$delegate;
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1437789192);
                Object rememberedValue2 = gapComposer4.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue2;
                boolean changedInstance2 = gapComposer4.changedInstance(inputFieldBinding);
                Object rememberedValue3 = gapComposer4.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BadgeQueries$$ExternalSyntheticLambda5(inputFieldBinding, i3);
                    gapComposer4.updateRememberedValue(rememberedValue3);
                }
                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue3);
                String str = (String) inputFieldBinding.label$delegate.getValue();
                if (str == null) {
                    gapComposer4.startReplaceGroup(-530740051);
                    gapComposer4.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer4.startReplaceGroup(-530740050);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(859291110, new TransfersViewKt$$ExternalSyntheticLambda5(str, 20), gapComposer4);
                    gapComposer4.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                ImageResource imageResource = (ImageResource) inputFieldBinding.leadingIcon$delegate.getValue();
                Integer drawableResId = imageResource != null ? ImageResourcesKt.toDrawableResId(imageResource, ResourcesKt.mooncakeResourceIndex) : null;
                if (drawableResId == null) {
                    gapComposer4.startReplaceGroup(-530610378);
                    gapComposer4.end(false);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer4.startReplaceGroup(-530610377);
                    final int intValue = drawableResId.intValue();
                    final boolean z3 = z ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1517079203, new Function2() { // from class: com.squareup.cash.arcade.treehouse.InputFieldBinding$value$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = z3;
                            int i5 = intValue;
                            InputFieldBinding inputFieldBinding2 = inputFieldBinding;
                            switch (i4) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        Function0 function0 = (Function0) inputFieldBinding2.onLeadingIconClick$delegate.getValue();
                                        Modifier modifier = Modifier.Companion.$$INSTANCE;
                                        if (function0 != null) {
                                            modifier = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, new ComposeDialogKt$$ExternalSyntheticLambda10(2, function0), 15);
                                        }
                                        Trace.m1190Iconww6aTOc(Countries.painterResource(i5, 0, gapComposer5), (String) inputFieldBinding2.leadingIconContentDescription$delegate.getValue(), modifier, 0L, gapComposer5, Painter.$stable, 8);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        Function0 function02 = (Function0) inputFieldBinding2.onTrailingIconClick$delegate.getValue();
                                        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                                        if (function02 != null) {
                                            modifier2 = ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, new ComposeDialogKt$$ExternalSyntheticLambda10(2, function02), 15);
                                        }
                                        Trace.m1190Iconww6aTOc(Countries.painterResource(i5, 0, gapComposer6), (String) inputFieldBinding2.trailingIconContentDescription$delegate.getValue(), modifier2, 0L, gapComposer6, Painter.$stable, 8);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4);
                    gapComposer4.end(false);
                    composableLambdaImpl2 = rememberComposableLambda2;
                }
                ImageResource imageResource2 = (ImageResource) inputFieldBinding.trailingIcon$delegate.getValue();
                Integer drawableResId2 = imageResource2 != null ? ImageResourcesKt.toDrawableResId(imageResource2, ResourcesKt.mooncakeResourceIndex) : null;
                if (drawableResId2 == null) {
                    gapComposer4.startReplaceGroup(-530241292);
                    gapComposer4.end(false);
                    composableLambdaImpl3 = null;
                } else {
                    gapComposer4.startReplaceGroup(-530241291);
                    final int intValue2 = drawableResId2.intValue();
                    final int i4 = 1;
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(596899261, new Function2() { // from class: com.squareup.cash.arcade.treehouse.InputFieldBinding$value$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i42 = i4;
                            int i5 = intValue2;
                            InputFieldBinding inputFieldBinding2 = inputFieldBinding;
                            switch (i42) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue22 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(1 & intValue22, (intValue22 & 3) != 2)) {
                                        Function0 function0 = (Function0) inputFieldBinding2.onLeadingIconClick$delegate.getValue();
                                        Modifier modifier = Modifier.Companion.$$INSTANCE;
                                        if (function0 != null) {
                                            modifier = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, new ComposeDialogKt$$ExternalSyntheticLambda10(2, function0), 15);
                                        }
                                        Trace.m1190Iconww6aTOc(Countries.painterResource(i5, 0, gapComposer5), (String) inputFieldBinding2.leadingIconContentDescription$delegate.getValue(), modifier, 0L, gapComposer5, Painter.$stable, 8);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        Function0 function02 = (Function0) inputFieldBinding2.onTrailingIconClick$delegate.getValue();
                                        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                                        if (function02 != null) {
                                            modifier2 = ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, new ComposeDialogKt$$ExternalSyntheticLambda10(2, function02), 15);
                                        }
                                        Trace.m1190Iconww6aTOc(Countries.painterResource(i5, 0, gapComposer6), (String) inputFieldBinding2.trailingIconContentDescription$delegate.getValue(), modifier2, 0L, gapComposer6, Painter.$stable, 8);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4);
                    gapComposer4.end(false);
                    composableLambdaImpl3 = rememberComposableLambda3;
                }
                InputFieldHelperText inputFieldHelperText = (InputFieldHelperText) inputFieldBinding.helperText$delegate.getValue();
                if (inputFieldHelperText == null) {
                    gapComposer4.startReplaceGroup(-529858721);
                    gapComposer4.end(false);
                    composableLambdaImpl4 = null;
                } else {
                    gapComposer4.startReplaceGroup(-529858720);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(1636859016, new BankingDialogKt$$ExternalSyntheticLambda8(inputFieldHelperText, 9), gapComposer4);
                    gapComposer4.end(false);
                    composableLambdaImpl4 = rememberComposableLambda4;
                }
                InputFieldBinding.PasswordOutputTransformation passwordOutputTransformation = ((Boolean) inputFieldBinding.isPassword$delegate.getValue()).booleanValue() ? InputFieldBinding.PasswordOutputTransformation.INSTANCE : null;
                if (((TextFieldLineLimits) parcelableSnapshotMutableState7.getValue()) instanceof TextFieldLineLimits.MultiLine) {
                    gapComposer4.startReplaceGroup(-529386311);
                    TextFieldLineLimits textFieldLineLimits = (TextFieldLineLimits) parcelableSnapshotMutableState7.getValue();
                    textFieldLineLimits.getClass();
                    TextFieldLineLimits.MultiLine multiLine = (TextFieldLineLimits.MultiLine) textFieldLineLimits;
                    int i5 = multiLine.minHeightInLines;
                    if (i5 < 3) {
                        i5 = 3;
                    }
                    InputAreaKt.InputArea(inputFieldBinding.composeTextFieldState, semantics, ((Boolean) parcelableSnapshotMutableState6.getValue()).booleanValue(), ((Boolean) parcelableSnapshotMutableState5.getValue()).booleanValue(), ((Boolean) parcelableSnapshotMutableState4.getValue()).booleanValue(), composableLambdaImpl, composableLambdaImpl4, (String) parcelableSnapshotMutableState3.getValue(), (KeyboardOptions) parcelableSnapshotMutableState2.getValue(), (KeyboardActionHandler) parcelableSnapshotMutableState.getValue(), new TextFieldLineLimits.MultiLine(i5, multiLine.maxHeightInLines), null, passwordOutputTransformation, mutableInteractionSourceImpl2, null, gapComposer4, 0, 3072, 18432);
                    gapComposer = gapComposer4;
                    gapComposer.end(false);
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                } else {
                    gapComposer = gapComposer4;
                    gapComposer.startReplaceGroup(-528394745);
                    InputFieldKt.InputField(inputFieldBinding.composeTextFieldState, semantics, ((Boolean) parcelableSnapshotMutableState6.getValue()).booleanValue(), ((Boolean) parcelableSnapshotMutableState5.getValue()).booleanValue(), ((Boolean) parcelableSnapshotMutableState4.getValue()).booleanValue(), composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, composableLambdaImpl4, (String) parcelableSnapshotMutableState3.getValue(), (KeyboardOptions) parcelableSnapshotMutableState2.getValue(), (KeyboardActionHandler) parcelableSnapshotMutableState.getValue(), null, passwordOutputTransformation, mutableInteractionSourceImpl2, null, gapComposer, 0, 24576, 36864);
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    gapComposer.end(false);
                }
                CharSequence charSequence = textFieldState.getValue$foundation().text;
                long j2 = textFieldState.getValue$foundation().selection;
                TextRange textRange = new TextRange(j2);
                boolean changedInstance3 = gapComposer.changedInstance(inputFieldBinding) | gapComposer.changedInstance(charSequence) | gapComposer.changed(j2);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                    FlashControl$applyScreenFlash$2 flashControl$applyScreenFlash$2 = new FlashControl$applyScreenFlash$2(inputFieldBinding, charSequence, j2, (Continuation) null, 4);
                    gapComposer.updateRememberedValue(flashControl$applyScreenFlash$2);
                    rememberedValue4 = flashControl$applyScreenFlash$2;
                }
                Updater.LaunchedEffect(charSequence, textRange, (Function2) rememberedValue4, gapComposer);
                Function1 function1 = (Function1) inputFieldBinding.onFocusChange$delegate.getValue();
                if (function1 != null) {
                    gapComposer.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer, function1, new ToastKt$Toast$9$1(function1, (Continuation) null, mutableInteractionSourceImpl, 11));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1106436997);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                break;
            case 3:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-312635902);
                gapComposer5.startReplaceGroup(204611935);
                ToggleBinding toggleBinding2 = (ToggleBinding) obj;
                List list = (List) toggleBinding2.state$delegate.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CircleSegment(ColorsKt.toComposeColor(((app.cash.arcade.values.CircleSegment) it.next()).color, (ThemeInfo) toggleBinding2.value, gapComposer5), r2.amount / ((ParcelableSnapshotMutableLongState) toggleBinding2.onChange$delegate).getLongValue()));
                }
                gapComposer5.end(false);
                VisibleKt.SegmentedCircle(arrayList, new SegmentedCircleConfig(new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer5)), null, new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(1.0f, gapComposer5)), null, 0L, 0L, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR), null, null, gapComposer5, 0, 12);
                gapComposer5.end(false);
                break;
            case 4:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(965587344);
                ToggleBinding toggleBinding3 = (ToggleBinding) obj;
                boolean z4 = ((BooleanState) toggleBinding3.state$delegate.getValue()).value;
                boolean changedInstance4 = gapComposer6.changedInstance(toggleBinding3);
                Object rememberedValue5 = gapComposer6.rememberedValue();
                Object obj3 = rememberedValue5;
                if (changedInstance4 || rememberedValue5 == neverEqualPolicy) {
                    BadgeQueries$$ExternalSyntheticLambda5 badgeQueries$$ExternalSyntheticLambda5 = new BadgeQueries$$ExternalSyntheticLambda5(toggleBinding3, 5);
                    gapComposer6.updateRememberedValue(badgeQueries$$ExternalSyntheticLambda5);
                    obj3 = badgeQueries$$ExternalSyntheticLambda5;
                }
                ModalKt.Toggle(z4, null, (Function1) obj3, ((Boolean) ((ParcelableSnapshotMutableState) toggleBinding3.enabled$delegate).getValue()).booleanValue(), null, gapComposer6, 0, 18);
                gapComposer6.end(false);
                break;
            case 5:
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1007515194);
                Recorder$$ExternalSyntheticOutline2.m(0, (ComposableLambdaImpl) obj, gapComposer7, false);
                break;
            default:
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startRestartGroup(1340334918);
                int i6 = (gapComposer8.changedInstance(this) ? 4 : 2) | i;
                if (gapComposer8.shouldExecute(i6 & 1, (i6 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1092240677, new ChatPlaceholderView$$ExternalSyntheticLambda0(this), gapComposer8), gapComposer8, 3072, 7);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer8.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ChatPlaceholderView$$ExternalSyntheticLambda0(this, i);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 5:
                return getChildAt(0).dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioBinding$value$1(ContextThemeWrapper contextThemeWrapper, AndroidStringManager androidStringManager) {
        super(contextThemeWrapper, null, 6, 0);
        this.$r8$classId = 6;
        this.this$0 = androidStringManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioBinding$value$1(Context context, Widget widget, int i) {
        super(context, null, 6, 0);
        this.$r8$classId = i;
        this.this$0 = widget;
    }
}
