package com.squareup.cash.instruments.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.ColorUtils;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.fillr.e;
import com.google.android.material.chip.Chip;
import com.google.maps.android.compose.InputHandlerKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.instruments.utils.CardIcon;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.Views;
import com.squareup.util.android.drawable.DrawablesKt;
import com.squareup.util.emojis.EmojiEmbeddedImageResolver;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class InstrumentAvatarView extends AppCompatImageView {
    public final ColorPalette colorPalette;
    public final float disabledOpacity;
    public final RealImageLoader imageLoader;
    public final Size size;
    public final ThemeInfo themeInfo;

    public enum Size {
        SMALL(24, 8.0f),
        MEDIUM(32, 16.0f),
        LARGE(40, 12.0f);

        public final float radius;
        public final int size;

        Size(int i, float f) {
            this.size = i;
            this.radius = f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentAvatarView(Context context, Size size, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.size = size;
        this.imageLoader = realImageLoader;
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        this.colorPalette = themeInfo.colorPalette;
        this.disabledOpacity = 0.2f;
        setClipToOutline(true);
        setOutlineProvider(new Chip.AnonymousClass2(this, 1));
    }

    public final LayerDrawable getIconDrawable(int i, int i2, boolean z, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int[] iArr = {-16842910};
        ColorPalette colorPalette = this.colorPalette;
        int i4 = colorPalette.background;
        float f = this.disabledOpacity;
        int blendARGB = ColorUtils.blendARGB(f, i4, i3);
        if (!z) {
            blendARGB = i3;
        }
        Pair pair = new Pair(iArr, Integer.valueOf(blendARGB));
        int[] iArr2 = StateSet.WILD_CARD;
        gradientDrawable.setColor(ColorsKt.colorStateListOf(pair, new Pair(iArr2, Integer.valueOf(i3))));
        Context context = getContext();
        context.getClass();
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i, null);
        drawableCompat.getClass();
        Drawable mutate = drawableCompat.mutate();
        int[] iArr3 = {-16842910};
        int blendARGB2 = ColorUtils.blendARGB(f, colorPalette.background, i2);
        if (!z) {
            blendARGB2 = i2;
        }
        mutate.setTintList(ColorsKt.colorStateListOf(new Pair(iArr3, Integer.valueOf(blendARGB2)), new Pair(iArr2, Integer.valueOf(i2))));
        return getIconDrawable(mutate, gradientDrawable, 0.6f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        Size size = this.size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Views.dip((View) this, size.size), 1073741824), View.MeasureSpec.makeMeasureSpec(Views.dip((View) this, size.size), 1073741824));
    }

    public final StateListDrawable setAlpha(Function0 function0) {
        Object invoke = function0.invoke();
        Drawable drawable = (Drawable) invoke;
        drawable.mutate();
        drawable.setAlpha(MathKt__MathJVMKt.roundToInt(this.disabledOpacity * 255.0f));
        return DrawablesKt.stateListDrawableOf(new Pair(new int[]{-16842910}, invoke), new Pair(StateSet.WILD_CARD, function0.invoke()));
    }

    public final void setModel(InstrumentAvatarViewModel instrumentAvatarViewModel) {
        Drawable iconDrawable;
        String str;
        instrumentAvatarViewModel.getClass();
        InstrumentAvatarViewModel.FallbackIcon fallbackIcon = instrumentAvatarViewModel.fallbackIcon;
        final int i = 1;
        final int i2 = 0;
        if (Intrinsics.areEqual(fallbackIcon, InstrumentAvatarViewModel.FallbackIcon.Add.INSTANCE)) {
            ColorPalette colorPalette = this.colorPalette;
            iconDrawable = getIconDrawable(R.drawable.mooncake_plus, colorPalette.tertiaryIcon, false, colorPalette.secondaryButtonBackground);
        } else {
            if (fallbackIcon instanceof InstrumentAvatarViewModel.FallbackIcon.Card) {
                InstrumentType instrumentType = ((InstrumentAvatarViewModel.FallbackIcon.Card) fallbackIcon).brand;
                if (instrumentType != null) {
                    CardBrandGuesser$Brand brand = InputHandlerKt.toBrand(instrumentType);
                    brand.getClass();
                    int ordinal = brand.ordinal();
                    final int i3 = (ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? (ordinal == 3 || ordinal == 4) ? CardIcon.TAB_DISCOVER : CardIcon.TAB_CARD_GENERIC : CardIcon.TAB_AMERICAN_EXPRESS : CardIcon.TAB_MASTERCARD : CardIcon.TAB_VISA).iconResId;
                    iconDrawable = setAlpha(new Function0(this) { // from class: com.squareup.cash.instruments.views.InstrumentAvatarView$$ExternalSyntheticLambda0
                        public final /* synthetic */ InstrumentAvatarView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4 = i;
                            int i5 = i3;
                            InstrumentAvatarView instrumentAvatarView = this.f$0;
                            switch (i4) {
                                case 0:
                                    Context context = instrumentAvatarView.getContext();
                                    context.getClass();
                                    Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i5, null);
                                    drawableCompat.getClass();
                                    return drawableCompat;
                                default:
                                    Context context2 = instrumentAvatarView.getContext();
                                    context2.getClass();
                                    Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, i5, null);
                                    drawableCompat2.getClass();
                                    return drawableCompat2;
                            }
                        }
                    });
                } else {
                    iconDrawable = getIconDrawable(R.drawable.mooncake_card, -1, true, -16722353);
                }
            } else if (Intrinsics.areEqual(fallbackIcon, InstrumentAvatarViewModel.FallbackIcon.Bank.INSTANCE)) {
                iconDrawable = getIconDrawable(R.drawable.mooncake_bank, -1, true, -13395457);
            } else if (fallbackIcon instanceof InstrumentAvatarViewModel.FallbackIcon.Balance) {
                CurrencyCode currencyCode = ((InstrumentAvatarViewModel.FallbackIcon.Balance) fallbackIcon).currencyCode;
                int i4 = currencyCode != null ? InstrumentAvatarUtilsKt.WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()] : -1;
                final int i5 = R.drawable.instrument_dollar;
                switch (i4) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 0:
                    default:
                        Timber.Forest.e("Not supported currency " + currencyCode + " for instrument icon", new Object[0], new IllegalStateException("Not supported currency"));
                        break;
                    case 4:
                        i5 = R.drawable.instrument_btc;
                        break;
                    case 5:
                        i5 = R.drawable.instrument_pound;
                        break;
                    case 6:
                        i5 = R.drawable.instrument_euro;
                        break;
                }
                iconDrawable = setAlpha(new Function0(this) { // from class: com.squareup.cash.instruments.views.InstrumentAvatarView$$ExternalSyntheticLambda0
                    public final /* synthetic */ InstrumentAvatarView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42 = i;
                        int i52 = i5;
                        InstrumentAvatarView instrumentAvatarView = this.f$0;
                        switch (i42) {
                            case 0:
                                Context context = instrumentAvatarView.getContext();
                                context.getClass();
                                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i52, null);
                                drawableCompat.getClass();
                                return drawableCompat;
                            default:
                                Context context2 = instrumentAvatarView.getContext();
                                context2.getClass();
                                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, i52, null);
                                drawableCompat2.getClass();
                                return drawableCompat2;
                        }
                    }
                });
            } else if (Intrinsics.areEqual(fallbackIcon, InstrumentAvatarViewModel.FallbackIcon.AppIcon.INSTANCE)) {
                final int i6 = R.drawable.app_icon;
                iconDrawable = setAlpha(new Function0(this) { // from class: com.squareup.cash.instruments.views.InstrumentAvatarView$$ExternalSyntheticLambda0
                    public final /* synthetic */ InstrumentAvatarView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42 = i;
                        int i52 = i6;
                        InstrumentAvatarView instrumentAvatarView = this.f$0;
                        switch (i42) {
                            case 0:
                                Context context = instrumentAvatarView.getContext();
                                context.getClass();
                                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i52, null);
                                drawableCompat.getClass();
                                return drawableCompat;
                            default:
                                Context context2 = instrumentAvatarView.getContext();
                                context2.getClass();
                                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, i52, null);
                                drawableCompat2.getClass();
                                return drawableCompat2;
                        }
                    }
                });
            } else if (Intrinsics.areEqual(fallbackIcon, InstrumentAvatarViewModel.FallbackIcon.GooglePayIcon.INSTANCE)) {
                final int i7 = R.drawable.google_pay_mark;
                iconDrawable = setAlpha(new Function0(this) { // from class: com.squareup.cash.instruments.views.InstrumentAvatarView$$ExternalSyntheticLambda0
                    public final /* synthetic */ InstrumentAvatarView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42 = i;
                        int i52 = i7;
                        InstrumentAvatarView instrumentAvatarView = this.f$0;
                        switch (i42) {
                            case 0:
                                Context context = instrumentAvatarView.getContext();
                                context.getClass();
                                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i52, null);
                                drawableCompat.getClass();
                                return drawableCompat;
                            default:
                                Context context2 = instrumentAvatarView.getContext();
                                context2.getClass();
                                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, i52, null);
                                drawableCompat2.getClass();
                                return drawableCompat2;
                        }
                    }
                });
            } else {
                if (!(fallbackIcon instanceof InstrumentAvatarViewModel.FallbackIcon.EmojiIcon)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                String str2 = ((InstrumentAvatarViewModel.FallbackIcon.EmojiIcon) fallbackIcon).iconId;
                Integer num = null;
                if (this.themeInfo.theme == Theme.MooncakeLight) {
                    ArrayList arrayList = EmojiEmbeddedImageResolver.supportedEmoji;
                    str2.getClass();
                    Emojis.Companion.getClass();
                    Emojis emojis = e.get(str2);
                    if (emojis != null) {
                        num = Integer.valueOf(emojis.drawableResLight24);
                    }
                } else {
                    ArrayList arrayList2 = EmojiEmbeddedImageResolver.supportedEmoji;
                    str2.getClass();
                    Emojis.Companion.getClass();
                    Emojis emojis2 = e.get(str2);
                    if (emojis2 != null) {
                        num = Integer.valueOf(emojis2.drawableResDark24);
                    }
                }
                if (num == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Emoji icon ID is required for an EmojiIcon avatar.");
                    return;
                } else {
                    final int intValue = num.intValue();
                    iconDrawable = getIconDrawable(setAlpha(new Function0(this) { // from class: com.squareup.cash.instruments.views.InstrumentAvatarView$$ExternalSyntheticLambda0
                        public final /* synthetic */ InstrumentAvatarView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i42 = i2;
                            int i52 = intValue;
                            InstrumentAvatarView instrumentAvatarView = this.f$0;
                            switch (i42) {
                                case 0:
                                    Context context = instrumentAvatarView.getContext();
                                    context.getClass();
                                    Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i52, null);
                                    drawableCompat.getClass();
                                    return drawableCompat;
                                default:
                                    Context context2 = instrumentAvatarView.getContext();
                                    context2.getClass();
                                    Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, i52, null);
                                    drawableCompat2.getClass();
                                    return drawableCompat2;
                            }
                        }
                    }), setAlpha(new RealGooglePayer$$ExternalSyntheticLambda0(this, 10)), 0.5f);
                }
            }
        }
        InstrumentAvatarViewModel.Image image = instrumentAvatarViewModel.avatar;
        if (image != null) {
            Context context = getContext();
            context.getClass();
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            int ordinal2 = ThemeHelpersKt.themeInfo(this).theme.ordinal();
            if (ordinal2 == 0) {
                str = image.lightUrl;
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str = image.darkUrl;
            }
            builder.data = str;
            ImageRequests_androidKt.placeholder(builder, iconDrawable);
            ImageRequests_androidKt.error(builder, iconDrawable);
            ImageRequests_androidKt.target(builder, this);
            this.imageLoader.enqueue(builder.build());
        } else {
            setImageDrawable(iconDrawable);
        }
        setEnabled(instrumentAvatarViewModel.enabled);
    }

    public final LayerDrawable getIconDrawable(final Drawable drawable, Drawable drawable2, float f) {
        Size size = this.size;
        final int roundToInt = MathKt__MathJVMKt.roundToInt(Views.dip((View) this, size.size) * f);
        return new LayerDrawable(new Drawable[]{drawable2, new InsetDrawable((Drawable) new DrawableWrapper(drawable) { // from class: com.squareup.cash.instruments.views.InstrumentAvatarView$getIconDrawable$1
            @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                return roundToInt;
            }

            @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public final int getIntrinsicWidth() {
                return roundToInt;
            }
        }, (Views.dip((View) this, size.size) - roundToInt) / 2)});
    }
}
