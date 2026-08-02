package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes6.dex */
public final class ArcadeFormBadgedAvatar extends AbstractComposeView {
    public final FormBlocker.Element.AvatarElement element;
    public final RealImageLoader imageLoader;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FormBlocker.Element.AvatarElement.Avatar_Size.values().length];
            try {
                iArr[FormBlocker.Element.AvatarElement.Avatar_Size.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.AvatarElement.Avatar_Size.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.AvatarElement.Avatar_Size.EXTRA_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FormBlocker.Element.AvatarElement.Badge.values().length];
            try {
                iArr2[FormBlocker.Element.AvatarElement.Badge.CHECKMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FormBlocker.Element.AvatarElement.Badge.RECURRING_SINGLE_ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FormBlocker.Element.AvatarElement.Badge.PAYMENT_PLAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FormBlocker.Element.AvatarElement.Badge.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormBadgedAvatar(Context context, FormBlocker.Element.AvatarElement avatarElement, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        this.element = avatarElement;
        this.imageLoader = realImageLoader;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(476789028);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1218291705, new ArcadeFormBadgedAvatar$$ExternalSyntheticLambda0(this, b, b), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormBadgedAvatar$$ExternalSyntheticLambda0(this, i);
        }
    }
}
