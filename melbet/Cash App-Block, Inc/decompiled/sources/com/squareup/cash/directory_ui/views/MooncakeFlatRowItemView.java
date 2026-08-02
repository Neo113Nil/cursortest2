package com.squareup.cash.directory_ui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.fillr.browsersdk.Fillr;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.components.MooncakeCheckbox;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.cash.ui.widget.StackedAvatarViewKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda12;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.GrpcStatus;
import com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda39;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class MooncakeFlatRowItemView extends ConstraintLayout {
    public final Lazy actionButtonView$delegate;
    public final Lazy avatar$delegate;
    public final Lazy avatarContainer$delegate;
    public final FrameLayout avatarView;
    public final Lazy badge$delegate;
    public final BadgedLayout badgeLayout;
    public final Lazy boostAddedDecoration$delegate;
    public final Lazy bottomPaddingSpace$delegate;
    public final Lazy icon$delegate;
    public final RealImageLoader imageLoader;
    public final Lazy multiSelectionCheckbox$delegate;
    public final Function0 onActionButtonClick;
    public final Lazy subtext$delegate;
    public final Lazy subtitle$delegate;
    public final Lazy title$delegate;
    public final Lazy topPaddingSpace$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeFlatRowItemView(Context context, RealImageLoader realImageLoader) {
        super(context);
        Recipient$$ExternalSyntheticLambda2 recipient$$ExternalSyntheticLambda2 = new Recipient$$ExternalSyntheticLambda2(13);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        this.onActionButtonClick = recipient$$ExternalSyntheticLambda2;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i2) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        this.avatarContainer$delegate = lazy;
        final int i2 = 1;
        this.badge$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i3 = 2;
        this.avatar$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i4 = 3;
        this.icon$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i5 = 4;
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        this.title$delegate = lazy2;
        final int i6 = 5;
        Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        this.subtitle$delegate = lazy3;
        final int i7 = 6;
        this.subtext$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i8 = 7;
        this.actionButtonView$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i9 = 8;
        Lazy lazy4 = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        this.multiSelectionCheckbox$delegate = lazy4;
        final int i10 = 9;
        this.boostAddedDecoration$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i10;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i11 = 10;
        this.topPaddingSpace$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i11;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        final int i12 = 11;
        this.bottomPaddingSpace$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView$$ExternalSyntheticLambda7
            public final /* synthetic */ MooncakeFlatRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i12;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = this.f$0;
                switch (i22) {
                    case 0:
                        return (ViewGroup) mooncakeFlatRowItemView.findViewById(R.id.avatar_container);
                    case 1:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.badge);
                    case 2:
                        return (ImageView) mooncakeFlatRowItemView.avatarView.findViewById(R.id.avatar);
                    case 3:
                        return (AppCompatImageView) mooncakeFlatRowItemView.findViewById(R.id.icon);
                    case 4:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.title);
                    case 5:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtitle);
                    case 6:
                        return (TextView) mooncakeFlatRowItemView.findViewById(R.id.subtext);
                    case 7:
                        return (MooncakePillButton) mooncakeFlatRowItemView.findViewById(R.id.action_button);
                    case 8:
                        return (MooncakeCheckbox) mooncakeFlatRowItemView.findViewById(R.id.multi_selection);
                    case 9:
                        return (ComposeView) mooncakeFlatRowItemView.findViewById(R.id.boost_added_decoration);
                    case 10:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.top_padding_space);
                    default:
                        return (Space) mooncakeFlatRowItemView.findViewById(R.id.bottom_padding_space);
                }
            }
        });
        BadgedLayout badgedLayout = new BadgedLayout(context, realImageLoader);
        this.badgeLayout = badgedLayout;
        View.inflate(context, R.layout.row_item_view, this);
        ((ViewGroup) lazy.getValue()).addView(badgedLayout);
        View inflate = View.inflate(context, R.layout.avatar_view, badgedLayout);
        inflate.getClass();
        this.avatarView = (FrameLayout) inflate;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1));
        setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
        MooncakeCheckbox mooncakeCheckbox = (MooncakeCheckbox) lazy4.getValue();
        mooncakeCheckbox.setCompoundDrawablePadding(0);
        mooncakeCheckbox.setBackground(RipplesKt.createBorderlessRippleDrawable(mooncakeCheckbox));
        mooncakeCheckbox.setPaddingRelative(0, 0, 0, 0);
        badgedLayout.setBaselineDrop(Views.dip((View) badgedLayout, 8));
        badgedLayout.setGapWithBadge(Views.dip((View) badgedLayout, 3.2f));
        TextView textView = (TextView) lazy2.getValue();
        textView.getClass();
        Strings.applyStyle(textView, TextStyles.smallTitle);
        TextView textView2 = (TextView) lazy2.getValue();
        int i13 = colorPalette.label;
        int i14 = colorPalette.secondaryLabel;
        textView2.setTextColor(i13);
        TextView textView3 = (TextView) lazy3.getValue();
        textView3.getClass();
        Strings.applyStyle(textView3, TextStyles.smallBody);
        ((TextView) lazy3.getValue()).setTextColor(i14);
        TextView subtext = getSubtext();
        subtext.getClass();
        Strings.applyStyle(subtext, TextThemeInfo.copy$default(TextStyles.identifier, null, null, null, 27));
        getSubtext().setTextColor(i14);
    }

    public static void sendActionUrlEvent(DirectoryListItem.ItemViewModel itemViewModel, String str, Ui.EventReceiver eventReceiver) {
        eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.ActionClick(str, DirectoryAnalyticsData.copy$default(itemViewModel.analyticsData, null, DirectoryAnalyticsData.TapSurface.ITEM, DirectoryAnalyticsData.EventType.TAP_PROFILE_DIRECTORY_ITEM, 431), itemViewModel.recipient));
    }

    public static /* synthetic */ void setModel$default(MooncakeFlatRowItemView mooncakeFlatRowItemView, int i, DirectoryListItem.ItemViewModel itemViewModel, boolean z, Ui.EventReceiver eventReceiver, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        mooncakeFlatRowItemView.setModel(i, itemViewModel, z, eventReceiver);
    }

    public final void bindSubtext(DirectoryListItem.ItemViewModel itemViewModel) {
        itemViewModel.getClass();
        TextView subtext = getSubtext();
        subtext.getClass();
        subtext.setVisibility(8);
    }

    public final TextView getSubtext() {
        return (TextView) this.subtext$delegate.getValue();
    }

    public final void setModel(int i, DirectoryListItem.ItemViewModel itemViewModel, boolean z, Ui.EventReceiver eventReceiver) {
        Text text;
        Drawable drawable;
        Drawable drawableCompat;
        itemViewModel.getClass();
        eventReceiver.getClass();
        int i2 = 0;
        if (z) {
            TextView subtext = getSubtext();
            subtext.getClass();
            subtext.animate().setDuration(300L).alpha(RecyclerView.DECELERATION_RATE).withEndAction(new Fillr.AnonymousClass2(29, subtext, this, itemViewModel));
            ((ComposeView) this.boostAddedDecoration$delegate.getValue()).setContent(new ComposableLambdaImpl(new MooncakeFlatRowItemView$$ExternalSyntheticLambda0(itemViewModel, i2), true, 2022122099));
            return;
        }
        String str = null;
        if (isAttachedToWindow()) {
            VorbisUtil$Mode vorbisUtil$Mode = itemViewModel.$$delegate_0;
            vorbisUtil$Mode.getClass();
            if (!vorbisUtil$Mode.blockFlag) {
                eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.AnalyticsEvent(DirectoryAnalyticsData.copy$default(itemViewModel.analyticsData, null, null, DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM, 447)));
                vorbisUtil$Mode.blockFlag = true;
            }
        } else {
            addOnAttachStateChangeListener(new ModalContainer$update$2$1$2(3, this, itemViewModel, eventReceiver));
        }
        AvatarViewModel avatarViewModel = itemViewModel.avatar;
        DirectoryListItem.ItemViewModel.Text text2 = itemViewModel.subtitle;
        Lazy lazy = this.avatar$delegate;
        if (avatarViewModel != null) {
            AvatarBadgeViewModel avatarBadgeViewModel = avatarViewModel.badge;
            ImageView imageView = (ImageView) this.badge$delegate.getValue();
            imageView.getClass();
            imageView.setVisibility(itemViewModel.recipient.isFavorite ? 0 : 8);
            Context context = getContext();
            context.getClass();
            StackedAvatarViewModel.Avatar stackedAvatar = GrpcStatus.Companion.toStackedAvatar(avatarViewModel);
            ImageView imageView2 = (ImageView) lazy.getValue();
            imageView2.getClass();
            int sp = Views.sp((View) this, 28);
            int sp2 = Views.sp((View) this, 16);
            ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
            if (itemViewModel.shouldUseMerchantPlaceholderOverride) {
                if (ThemeHelpersKt.themeInfo(this).theme == Theme.MooncakeLight) {
                    Context context2 = getContext();
                    context2.getClass();
                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.merchant_placeholder_light, null);
                } else {
                    Context context3 = getContext();
                    context3.getClass();
                    drawableCompat = PlatformKt.getDrawableCompat(context3, R.drawable.merchant_placeholder_dark, null);
                }
                drawable = drawableCompat;
            } else {
                drawable = null;
            }
            StackedAvatarViewKt.loadAvatarInto$default(context, this.imageLoader, stackedAvatar, imageView2, themeInfo, sp, sp2, drawable, new GLSceneScope$$ExternalSyntheticLambda2(2, eventReceiver, avatarViewModel, itemViewModel));
            String str2 = avatarViewModel.actionUrl;
            FrameLayout frameLayout = this.avatarView;
            if (str2 != null) {
                frameLayout.setBackground(RipplesKt.createBorderlessRippleDrawable(this));
                frameLayout.setClickable(true);
                frameLayout.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda39(this, itemViewModel, str2, eventReceiver));
            } else {
                frameLayout.setBackground(null);
                frameLayout.setOnClickListener(null);
                frameLayout.setClickable(false);
            }
            boolean z2 = avatarBadgeViewModel instanceof AvatarBadgeViewModel.CardUrl;
            BadgedLayout badgedLayout = this.badgeLayout;
            if (z2) {
                badgedLayout.setBadge(new BadgedLayout.BadgeShape.Rectangular(Views.dip((View) this, 4.0f), Views.dip((View) this, 25), Views.dip((View) this, 40)));
            } else {
                badgedLayout.setBadge(new BadgedLayout.BadgeShape.Circular(Views.dip((View) this, 28)));
            }
            badgedLayout.setModel(avatarBadgeViewModel);
        }
        ((ImageView) lazy.getValue()).setContentDescription(null);
        DirectoryListItem.ItemViewModel.Text text3 = itemViewModel.title;
        RealImageLoader realImageLoader = this.imageLoader;
        if (text3 != null) {
            Text text4 = text3.text;
            TextView textView = (TextView) this.title$delegate.getValue();
            textView.getClass();
            ErrorsKt.applyText(textView, text4, text3.highlightedRange);
            Image image = text4.icon;
            Lazy lazy2 = this.icon$delegate;
            if (image != null) {
                Context context4 = getContext();
                context4.getClass();
                ImageRequest.Builder builder = new ImageRequest.Builder(context4);
                image.getClass();
                builder.data = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(this));
                AppCompatImageView appCompatImageView = (AppCompatImageView) lazy2.getValue();
                appCompatImageView.getClass();
                ImageRequests_androidKt.target(builder, appCompatImageView);
                builder.listener = new zza(24);
                realImageLoader.enqueue(builder.build());
            } else {
                ((AppCompatImageView) lazy2.getValue()).setImageDrawable(null);
            }
        }
        Lazy lazy3 = this.subtitle$delegate;
        if (text2 != null) {
            TextView textView2 = (TextView) lazy3.getValue();
            textView2.getClass();
            ErrorsKt.applyText$1(textView2, text2.text, text2.highlightedRange, realImageLoader);
            ((TextView) lazy3.getValue()).setLineSpacing(-4.0f, 1.0f);
        }
        TextView textView3 = (TextView) lazy3.getValue();
        textView3.getClass();
        String str3 = (text2 == null || (text = text2.text) == null) ? null : text.text;
        textView3.setVisibility((str3 == null || StringsKt.isBlank(str3)) ? 8 : 0);
        bindSubtext(itemViewModel);
        Lazy lazy4 = this.multiSelectionCheckbox$delegate;
        MooncakeCheckbox mooncakeCheckbox = (MooncakeCheckbox) lazy4.getValue();
        mooncakeCheckbox.getClass();
        mooncakeCheckbox.setVisibility(8);
        MooncakeCheckbox mooncakeCheckbox2 = (MooncakeCheckbox) lazy4.getValue();
        mooncakeCheckbox2.getClass();
        mooncakeCheckbox2.setOnClickListener(null);
        mooncakeCheckbox2.setClickable(false);
        Button button = itemViewModel.actionButton;
        Lazy lazy5 = this.actionButtonView$delegate;
        if (button != null) {
            MooncakePillButton mooncakePillButton = (MooncakePillButton) lazy5.getValue();
            FetcherKt fetcherKt = button.content;
            if (fetcherKt != null) {
                Button$Content$Text button$Content$Text = fetcherKt instanceof Button$Content$Text ? (Button$Content$Text) fetcherKt : null;
                if (button$Content$Text != null) {
                    str = button$Content$Text.value;
                }
            }
            if (str == null) {
                Handlers$$ExternalSyntheticBUOutline0.m(button, "Button.text and Button.icon are null. At least one value should be provided: ");
                return;
            }
            mooncakePillButton.setText(str);
            MooncakePillButton mooncakePillButton2 = (MooncakePillButton) lazy5.getValue();
            mooncakePillButton2.getClass();
            mooncakePillButton2.setVisibility(0);
            ((MooncakePillButton) lazy5.getValue()).setOnClickListener(new ScannerView$$ExternalSyntheticLambda12(this, eventReceiver, button, itemViewModel, 3));
        } else {
            ((MooncakePillButton) lazy5.getValue()).setVisibility(8);
            MooncakePillButton mooncakePillButton3 = (MooncakePillButton) lazy5.getValue();
            mooncakePillButton3.getClass();
            mooncakePillButton3.setOnClickListener(null);
            mooncakePillButton3.setClickable(false);
        }
        setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda39(4, this, itemViewModel, eventReceiver));
    }

    public final void setTitleMaxLines(int i) {
        ((TextView) this.title$delegate.getValue()).setMaxLines(i);
    }
}
