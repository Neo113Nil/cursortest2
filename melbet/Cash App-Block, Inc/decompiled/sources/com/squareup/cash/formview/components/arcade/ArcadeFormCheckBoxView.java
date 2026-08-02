package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda50;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$42;
import com.squareup.cash.formview.components.FormRequirementProvider;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class ArcadeFormCheckBoxView extends AbstractComposeView implements FormRequirementProvider {
    public final FormBlocker.Element.CheckBoxElement element;
    public final String id;
    public final RealImageLoader imageLoader;
    public final ParcelableSnapshotMutableState isChecked$delegate;
    public final FormElementViewBuilder$toView$42 onEvent;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.CheckBoxElement.Style.values().length];
            try {
                iArr[FormBlocker.Element.CheckBoxElement.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.CheckBoxElement.Style.TOGGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.CheckBoxElement.Style.LEGAL_AGREEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormCheckBoxView(Context context, String str, FormElementViewBuilder$toView$42 formElementViewBuilder$toView$42, FormBlocker.Element.CheckBoxElement checkBoxElement, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        this.id = str;
        this.onEvent = formElementViewBuilder$toView$42;
        this.element = checkBoxElement;
        this.imageLoader = realImageLoader;
        Boolean bool = checkBoxElement.default_value;
        this.isChecked$delegate = Updater.mutableStateOf$default(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
    }

    public final void CheckboxAvatar(Composer composer, int i) {
        AvatarEntry avatarEntry;
        Unit unit;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(45775077);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            FormBlocker.Element.CheckBoxElement checkBoxElement = this.element;
            UiAvatar uiAvatar = checkBoxElement.avatar;
            String str = null;
            StackedAvatarViewModel.Single stackedAvatarViewModel = uiAvatar != null ? StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar) : null;
            StackedAvatarViewModel.Avatar avatar = stackedAvatarViewModel != null ? stackedAvatarViewModel.avatar : null;
            if (avatar == null) {
                gapComposer.startReplaceGroup(-2114120888);
                gapComposer.end(false);
                avatarEntry = null;
            } else {
                gapComposer.startReplaceGroup(1040181209);
                AvatarEntry avatarEntry2 = AvatarsKt.toAvatarEntry(avatar, null, new AfterpaySearchViewKt$$ExternalSyntheticLambda50(stackedAvatarViewModel, i4), gapComposer, 8, 1);
                gapComposer.end(false);
                avatarEntry = avatarEntry2;
            }
            if (avatarEntry == null) {
                gapComposer.startReplaceGroup(-2113958820);
                gapComposer.end(false);
                unit = null;
            } else {
                gapComposer.startReplaceGroup(-2113958819);
                TextViewKt.Avatar(AvatarSize.Size48, avatarEntry, null, false, gapComposer, 6, 28);
                gapComposer = gapComposer;
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-2113882435);
                Image image = checkBoxElement.image;
                if (image == null) {
                    gapComposer.startReplaceGroup(792842113);
                    gapComposer.end(false);
                } else {
                    str = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 25575552, image, gapComposer, false);
                }
                String str2 = str;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(792859938);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(792859939);
                    GapComposer gapComposer2 = gapComposer;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(str2, null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), null, null, null, gapComposer2, 432, 2040);
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1040186204);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(this, i, i2);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-28448156);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Boolean valueOf = Boolean.valueOf(isChecked$1());
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealProfileManager$profileOrNull$2(this, null, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(713054521, new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(this, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(this, i, 3);
        }
    }

    public final boolean isChecked$1() {
        return ((Boolean) this.isChecked$delegate.getValue()).booleanValue();
    }

    @Override // com.squareup.cash.formview.components.FormRequirementProvider
    public final Flow requirements() {
        return FlowKt.distinctUntilChanged(Updater.snapshotFlow(new ArcadeFormCheckBoxView$$ExternalSyntheticLambda2(this, 0)));
    }
}
