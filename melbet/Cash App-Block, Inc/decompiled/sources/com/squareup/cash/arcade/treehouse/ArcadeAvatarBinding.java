package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.values.ArcadeAvatarSizes;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ColorFilter;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel;
import app.cash.arcade.viewmodels.AvatarViewModel;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.resources.ResourcesKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.MoshiJsonIntegration;
import designsystem.arcade.ArcadeColors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ArcadeAvatarBinding extends AbstractComposeView implements Widget {
    public final SnapshotStateList avatars;
    public final ParcelableSnapshotMutableState badge$delegate;
    public final RealImageLoader imageLoader;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState onClick$delegate;
    public final ParcelableSnapshotMutableState size$delegate;
    public final ArcadeAvatarBinding value;

    public ArcadeAvatarBinding(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        this.imageLoader = realImageLoader;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.avatars = new SnapshotStateList();
        this.badge$delegate = Updater.mutableStateOf$default(null);
        this.size$delegate = Updater.mutableStateOf$default(ArcadeAvatarSizes.size48);
        this.onClick$delegate = Updater.mutableStateOf$default(null);
    }

    public static androidx.compose.ui.Modifier clickableWithUnboundedRipple(Function0 function0, GapComposer gapComposer) {
        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
        boolean changed = gapComposer.changed(function0);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new y0$$ExternalSyntheticLambda0(29, function0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return ImageKt.m182clickableO2vRcR0$default(Modifier.Companion.$$INSTANCE, null, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AvatarEntry rememberAvatarEntry(AvatarViewModel avatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, GapComposer gapComposer, int i) {
        ColorModel model$default;
        ColorModel colorModel;
        ColorModel colorModel2;
        ColorModel model$default2;
        StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes;
        Image image;
        String str;
        Object obj = null;
        r2 = null;
        ColorMatrixColorFilter colorMatrixColorFilter = null;
        obj = null;
        obj = null;
        Object obj2 = (i & 2) != 0 ? null : avatarBadgeViewModel;
        boolean changed = gapComposer.changed(avatarViewModel);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            String str2 = avatarViewModel.character;
            Color color = avatarViewModel.backgroundColor;
            Color color2 = avatarViewModel.foregroundColor;
            Character valueOf = (str2 == null || str2.length() == 0 || (str = avatarViewModel.character) == null) ? null : Character.valueOf(str.charAt(0));
            ImageResource imageResource = avatarViewModel.image;
            boolean z = imageResource instanceof ImageResource.Token;
            if ((imageResource instanceof ImageResource.Url) && ((ImageResource.Url) imageResource).renderingMode == ImageResource.Url.RenderingMode.TINTABLE) {
                if (color2 != null) {
                    model$default = MoshiJsonIntegration.toModel$default(color2);
                    colorModel = model$default;
                }
                colorModel = null;
            } else {
                if (z) {
                    model$default = color2 != null ? MoshiJsonIntegration.toModel$default(color2) : ColorModel.BaseWhite.INSTANCE;
                    colorModel = model$default;
                }
                colorModel = null;
            }
            if (z) {
                if (color != null) {
                    model$default2 = MoshiJsonIntegration.toModel$default(color);
                } else {
                    Color.Token token = ArcadeColors.BackgroundBrand;
                    token.getClass();
                    model$default2 = new ColorModel.Arcade(token.id);
                }
            } else if (color != null) {
                model$default2 = MoshiJsonIntegration.toModel$default(color);
            } else {
                colorModel2 = null;
                if (imageResource instanceof ImageResource.Id) {
                    avatarDrawableRes = null;
                } else {
                    Integer drawableResId = ImageResourcesKt.toDrawableResId(imageResource, ResourcesKt.mooncakeResourceIndex);
                    avatarDrawableRes = drawableResId != null ? new StackedAvatarViewModel.Avatar.AvatarDrawableRes(drawableResId.intValue(), imageResource instanceof ImageResource.Token, 0) : null;
                }
                Icon icon = !z ? new Icon(((ImageResource.Token) imageResource).id) : null;
                ColorModel model$default3 = color == null ? MoshiJsonIntegration.toModel$default(color) : null;
                if (imageResource == null) {
                    ImageResource.Url url = imageResource instanceof ImageResource.Url ? (ImageResource.Url) imageResource : null;
                    image = url != null ? ImageResourcesKt.toProto(url) : null;
                } else {
                    image = null;
                }
                Color color3 = avatarViewModel.borderColor;
                StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(model$default3, valueOf, null, image, avatarDrawableRes, icon, colorModel, colorModel2, false, false, null, z, color3 == null ? MoshiJsonIntegration.toModel$default(color3) : null, null, 80320);
                gapComposer.updateRememberedValue(avatar);
                rememberedValue = avatar;
            }
            colorModel2 = model$default2;
            if (imageResource instanceof ImageResource.Id) {
            }
            if (!z) {
            }
            if (color == null) {
            }
            if (imageResource == null) {
            }
            Color color32 = avatarViewModel.borderColor;
            StackedAvatarViewModel.Avatar avatar2 = new StackedAvatarViewModel.Avatar(model$default3, valueOf, null, image, avatarDrawableRes, icon, colorModel, colorModel2, false, false, null, z, color32 == null ? MoshiJsonIntegration.toModel$default(color32) : null, null, 80320);
            gapComposer.updateRememberedValue(avatar2);
            rememberedValue = avatar2;
        }
        StackedAvatarViewModel.Avatar avatar3 = (StackedAvatarViewModel.Avatar) rememberedValue;
        boolean changed2 = gapComposer.changed(obj2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            if (obj2 instanceof AvatarBadgeViewModel.IconRes) {
                AvatarBadgeViewModel.IconRes iconRes = (AvatarBadgeViewModel.IconRes) obj2;
                Integer drawableResId2 = ImageResourcesKt.toDrawableResId(iconRes.image, ResourcesKt.mooncakeResourceIndex);
                if (drawableResId2 != null) {
                    int intValue = drawableResId2.intValue();
                    ColorModel model$default4 = MoshiJsonIntegration.toModel$default(iconRes.backgroundColor);
                    ColorFilter colorFilter = iconRes.colorFilter;
                    if (colorFilter != null && (colorFilter instanceof ColorFilter.SetToSaturation)) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(((ColorFilter.SetToSaturation) colorFilter).saturation);
                        colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
                    }
                    obj = new AvatarBadgeViewModel.IconRes(intValue, model$default4, colorMatrixColorFilter, 4);
                }
            } else if (obj2 instanceof AvatarBadgeViewModel.IconUrl) {
                AvatarBadgeViewModel.IconUrl iconUrl = (AvatarBadgeViewModel.IconUrl) obj2;
                Image proto = ImageResourcesKt.toProto(iconUrl.image);
                Color color4 = iconUrl.backgroundColor;
                obj = new AvatarBadgeViewModel.IconUrl(proto, color4 != null ? MoshiJsonIntegration.toModel$default(color4) : null);
            } else if (obj2 instanceof AvatarBadgeViewModel.CardUrl) {
                obj = new AvatarBadgeViewModel.CardUrl(ImageResourcesKt.toProto(((AvatarBadgeViewModel.CardUrl) obj2).image));
            } else if (obj2 instanceof AvatarBadgeViewModel.IconToken) {
                zzd zzdVar = Icons.Companion;
                String str3 = ((AvatarBadgeViewModel.IconToken) obj2).image.id;
                zzdVar.getClass();
                Icons icons = zzd.get(str3);
                if (icons != null) {
                    obj = new AvatarBadgeViewModel.IconToken(icons);
                }
            }
            gapComposer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        }
        return AvatarsKt.toAvatarEntry(avatar3, (com.squareup.cash.common.viewmodels.AvatarBadgeViewModel) rememberedValue2, null, gapComposer, 8, 2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1775750053);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(1979758491, new ArcadeAvatarBinding$$ExternalSyntheticLambda0(this, b, b), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeAvatarBinding$$ExternalSyntheticLambda0(this, i);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final app.cash.redwood.Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        ViewParent parent2 = getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        ViewParent parent3 = getParent();
        ViewParent parent4 = parent3 != null ? parent3.getParent() : null;
        ViewGroup viewGroup2 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        ViewParent parent5 = getParent();
        ViewParent parent6 = (parent5 == null || (parent = parent5.getParent()) == null) ? null : parent.getParent();
        ViewGroup viewGroup3 = parent6 instanceof ViewGroup ? (ViewGroup) parent6 : null;
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(app.cash.redwood.Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
