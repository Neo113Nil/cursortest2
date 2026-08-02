package com.squareup.cash.directory_ui.views;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.media3.extractor.VorbisUtil$Mode;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class MooncakeHeaderView extends ConstraintLayout {
    public final Lazy bottomSpace$delegate;
    public final Lazy headerButton$delegate;
    public final RealImageLoader imageLoader;
    public final Lazy subtitleView$delegate;
    public final Lazy titleView$delegate;
    public final Lazy topSpace$delegate;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Button.ButtonAction.values().length];
            try {
                Action.Type.Companion companion = Button.ButtonAction.Companion;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Action.Type.Companion companion2 = Button.ButtonAction.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Action.Type.Companion companion3 = Button.ButtonAction.Companion;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeHeaderView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MooncakeHeaderView mooncakeHeaderView = this.f$0;
                switch (i2) {
                    case 0:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_title);
                    case 1:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_subtitle);
                    case 2:
                        return (ComposeView) mooncakeHeaderView.findViewById(R.id.header_icon_button);
                    case 3:
                        return (Space) mooncakeHeaderView.findViewById(R.id.top_space);
                    default:
                        return (Space) mooncakeHeaderView.findViewById(R.id.bottom_space);
                }
            }
        });
        this.titleView$delegate = lazy;
        final int i2 = 1;
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MooncakeHeaderView mooncakeHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_title);
                    case 1:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_subtitle);
                    case 2:
                        return (ComposeView) mooncakeHeaderView.findViewById(R.id.header_icon_button);
                    case 3:
                        return (Space) mooncakeHeaderView.findViewById(R.id.top_space);
                    default:
                        return (Space) mooncakeHeaderView.findViewById(R.id.bottom_space);
                }
            }
        });
        this.subtitleView$delegate = lazy2;
        final int i3 = 2;
        this.headerButton$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MooncakeHeaderView mooncakeHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_title);
                    case 1:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_subtitle);
                    case 2:
                        return (ComposeView) mooncakeHeaderView.findViewById(R.id.header_icon_button);
                    case 3:
                        return (Space) mooncakeHeaderView.findViewById(R.id.top_space);
                    default:
                        return (Space) mooncakeHeaderView.findViewById(R.id.bottom_space);
                }
            }
        });
        final int i4 = 3;
        this.topSpace$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                MooncakeHeaderView mooncakeHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_title);
                    case 1:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_subtitle);
                    case 2:
                        return (ComposeView) mooncakeHeaderView.findViewById(R.id.header_icon_button);
                    case 3:
                        return (Space) mooncakeHeaderView.findViewById(R.id.top_space);
                    default:
                        return (Space) mooncakeHeaderView.findViewById(R.id.bottom_space);
                }
            }
        });
        final int i5 = 4;
        this.bottomSpace$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                MooncakeHeaderView mooncakeHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_title);
                    case 1:
                        return (FigmaTextView) mooncakeHeaderView.findViewById(R.id.header_subtitle);
                    case 2:
                        return (ComposeView) mooncakeHeaderView.findViewById(R.id.header_icon_button);
                    case 3:
                        return (Space) mooncakeHeaderView.findViewById(R.id.top_space);
                    default:
                        return (Space) mooncakeHeaderView.findViewById(R.id.bottom_space);
                }
            }
        });
        View.inflate(context, R.layout.header_item_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1));
        int dip = Views.dip((View) this, 20);
        setPadding(dip, 0, dip, 0);
        FigmaTextView figmaTextView = (FigmaTextView) lazy.getValue();
        figmaTextView.getClass();
        Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
        FigmaTextView figmaTextView2 = (FigmaTextView) lazy.getValue();
        ColorPalette colorPalette = themeInfo.colorPalette;
        figmaTextView2.setTextColor(colorPalette.label);
        FigmaTextView figmaTextView3 = (FigmaTextView) lazy2.getValue();
        figmaTextView3.getClass();
        Strings.applyStyle(figmaTextView3, TextStyles.smallBody);
        ((FigmaTextView) lazy2.getValue()).setTextColor(colorPalette.tertiaryLabel);
    }

    public final void setInternalPadding(int i, int i2) {
        ((Space) this.topSpace$delegate.getValue()).setMinimumHeight(i);
        ((Space) this.bottomSpace$delegate.getValue()).setMinimumHeight(i2);
    }

    public final void setModel(DirectoryListItem.Header header, Ui.EventReceiver eventReceiver) {
        MooncakeHeaderView mooncakeHeaderView;
        DirectoryListItem.Header header2;
        Ui.EventReceiver eventReceiver2;
        header.getClass();
        eventReceiver.getClass();
        DirectoryListItem.ItemViewModel.Text text = header.title;
        DirectoryListItem.ItemViewModel.Text text2 = header.subtitle;
        RealImageLoader realImageLoader = this.imageLoader;
        Lazy lazy = this.titleView$delegate;
        if (text != null) {
            FigmaTextView figmaTextView = (FigmaTextView) lazy.getValue();
            figmaTextView.getClass();
            figmaTextView.setVisibility(0);
            text.getClass();
            FigmaTextView figmaTextView2 = (FigmaTextView) lazy.getValue();
            figmaTextView2.getClass();
            ErrorsKt.applyText(figmaTextView2, text.text, text.highlightedRange, realImageLoader);
        } else {
            FigmaTextView figmaTextView3 = (FigmaTextView) lazy.getValue();
            figmaTextView3.getClass();
            figmaTextView3.setVisibility(8);
        }
        Lazy lazy2 = this.subtitleView$delegate;
        if (text2 != null) {
            FigmaTextView figmaTextView4 = (FigmaTextView) lazy2.getValue();
            figmaTextView4.getClass();
            figmaTextView4.setVisibility(0);
            FigmaTextView figmaTextView5 = (FigmaTextView) lazy2.getValue();
            figmaTextView5.getClass();
            ErrorsKt.applyText(figmaTextView5, text2.text, text2.highlightedRange, realImageLoader);
        } else {
            FigmaTextView figmaTextView6 = (FigmaTextView) lazy2.getValue();
            figmaTextView6.getClass();
            figmaTextView6.setVisibility(8);
        }
        if (header.actionUrl != null) {
            setClickable(true);
            setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(22, eventReceiver, header));
        } else {
            setClickable(false);
        }
        setBackground(null);
        Button button = header.headerButton;
        Lazy lazy3 = this.headerButton$delegate;
        ComposeView composeView = (ComposeView) lazy3.getValue();
        composeView.getClass();
        composeView.setVisibility(button != null ? 0 : 8);
        if (button != null) {
            mooncakeHeaderView = this;
            header2 = header;
            eventReceiver2 = eventReceiver;
            ((ComposeView) lazy3.getValue()).setContent(new ComposableLambdaImpl(new MooncakeHeaderView$$ExternalSyntheticLambda6(button, mooncakeHeaderView, header2, eventReceiver2, 0), true, -954384198));
        } else {
            mooncakeHeaderView = this;
            header2 = header;
            eventReceiver2 = eventReceiver;
        }
        if (!mooncakeHeaderView.isAttachedToWindow()) {
            mooncakeHeaderView.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(mooncakeHeaderView, header2, eventReceiver2));
            return;
        }
        VorbisUtil$Mode vorbisUtil$Mode = header2.$$delegate_0;
        if (vorbisUtil$Mode.blockFlag) {
            return;
        }
        vorbisUtil$Mode.blockFlag = true;
    }
}
