package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.os.BundleKt;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.HasTop$DefaultImpls;
import com.squareup.contour.XFloat;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SplitButtons extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final View divider;
    public boolean layoutHorizontal;
    public LayoutMode layoutMode;
    public final MooncakePillButton primary;
    public final MooncakePillButton secondary;
    public Showing showingButtons;
    public final int spacing;
    public final Style style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LayoutMode {
        public static final /* synthetic */ LayoutMode[] $VALUES;
        public static final LayoutMode AUTOMATIC;
        public static final LayoutMode NEVER_COLLAPSE;
        public static final LayoutMode VERTICAL_STACK;

        static {
            LayoutMode layoutMode = new LayoutMode("VERTICAL_STACK", 0);
            VERTICAL_STACK = layoutMode;
            LayoutMode layoutMode2 = new LayoutMode("NEVER_COLLAPSE", 1);
            NEVER_COLLAPSE = layoutMode2;
            LayoutMode layoutMode3 = new LayoutMode("AUTOMATIC", 2);
            AUTOMATIC = layoutMode3;
            $VALUES = new LayoutMode[]{layoutMode, layoutMode2, layoutMode3};
        }

        public static LayoutMode valueOf(String str) {
            return (LayoutMode) Enum.valueOf(LayoutMode.class, str);
        }

        public static LayoutMode[] values() {
            return (LayoutMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Showing {
        public static final /* synthetic */ Showing[] $VALUES;
        public static final Showing Both;
        public static final Showing None;
        public static final Showing PrimaryOnly;
        public static final Showing SecondaryOnly;

        static {
            Showing showing = new Showing("Both", 0);
            Both = showing;
            Showing showing2 = new Showing("PrimaryOnly", 1);
            PrimaryOnly = showing2;
            Showing showing3 = new Showing("SecondaryOnly", 2);
            SecondaryOnly = showing3;
            Showing showing4 = new Showing("None", 3);
            None = showing4;
            $VALUES = new Showing[]{showing, showing2, showing3, showing4};
        }

        public static Showing valueOf(String str) {
            return (Showing) Enum.valueOf(Showing.class, str);
        }

        public static Showing[] values() {
            return (Showing[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style ALERT_DIALOG;
        public static final Style MOONCAKE_PILLS;

        static {
            Style style = new Style("MOONCAKE_PILLS", 0);
            MOONCAKE_PILLS = style;
            Style style2 = new Style("ALERT_DIALOG", 1);
            ALERT_DIALOG = style2;
            $VALUES = new Style[]{style, style2};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitButtons(Context context, AttributeSet attributeSet, Style style) {
        super(context, attributeSet);
        MooncakePillButton mooncakePillButton;
        MooncakePillButton mooncakePillButton2;
        int i;
        int dip;
        context.getClass();
        style.getClass();
        this.style = style;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.layoutMode = LayoutMode.AUTOMATIC;
        this.showingButtons = Showing.Both;
        final int i2 = 1;
        this.layoutHorizontal = true;
        int ordinal = style.ordinal();
        if (ordinal == 0) {
            Context context2 = getContext();
            context2.getClass();
            mooncakePillButton = new MooncakePillButton(context2, null, null, MooncakePillButton.Style.PRIMARY, 6, null);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            Context context3 = getContext();
            context3.getClass();
            mooncakePillButton = new MooncakePillButton(context3, null, null, MooncakePillButton.Style.TERTIARY_OVERLAY, 6, null);
            mooncakePillButton.setPadding(Views.dip((View) mooncakePillButton, 16), Views.dip((View) mooncakePillButton, 18), Views.dip((View) mooncakePillButton, 16), Views.dip((View) mooncakePillButton, 18));
        }
        this.primary = mooncakePillButton;
        int ordinal2 = style.ordinal();
        if (ordinal2 == 0) {
            Context context4 = getContext();
            context4.getClass();
            mooncakePillButton2 = new MooncakePillButton(context4, null, null, MooncakePillButton.Style.SECONDARY, 6, null);
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            Context context5 = getContext();
            context5.getClass();
            mooncakePillButton2 = new MooncakePillButton(context5, null, null, MooncakePillButton.Style.TERTIARY_OVERLAY, 6, null);
            mooncakePillButton2.setPadding(Views.dip((View) mooncakePillButton2, 16), Views.dip((View) mooncakePillButton2, 18), Views.dip((View) mooncakePillButton2, 16), Views.dip((View) mooncakePillButton2, 18));
        }
        this.secondary = mooncakePillButton2;
        View view = new View(context);
        int ordinal3 = style.ordinal();
        final int i3 = 0;
        if (ordinal3 == 0) {
            i = 8;
        } else {
            if (ordinal3 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            i = 0;
        }
        view.setVisibility(i);
        view.setBackground(new DividerDrawable(colorPalette.hairline));
        this.divider = view;
        int ordinal4 = style.ordinal();
        if (ordinal4 == 0) {
            dip = Views.dip((View) this, 15);
        } else {
            if (ordinal4 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            dip = view.getBackground().getIntrinsicWidth();
        }
        this.spacing = dip;
        final SplitButtons$$ExternalSyntheticLambda0 splitButtons$$ExternalSyntheticLambda0 = new SplitButtons$$ExternalSyntheticLambda0(i3);
        final MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda6 = new MusicViewKt$$ExternalSyntheticLambda6(14, splitButtons$$ExternalSyntheticLambda0, this);
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new OffersHomeQueries$$ExternalSyntheticLambda1(i2));
        BundleKt.widthOfFloat$default(rightTo, new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda6
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                SplitButtons$$ExternalSyntheticLambda0 splitButtons$$ExternalSyntheticLambda02 = splitButtons$$ExternalSyntheticLambda0;
                MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda62 = musicViewKt$$ExternalSyntheticLambda6;
                SplitButtons splitButtons = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i4) {
                    case 0:
                        int i5 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new XFloat(((XFloat) ((splitButtons.layoutHorizontal && splitButtons.getShowingSecondary()) ? musicViewKt$$ExternalSyntheticLambda62.invoke(layoutSpec) : splitButtons$$ExternalSyntheticLambda02.invoke(layoutSpec))).value);
                    default:
                        int i6 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new XFloat(((XFloat) ((splitButtons.layoutHorizontal && splitButtons.getShowingPrimary()) ? musicViewKt$$ExternalSyntheticLambda62.invoke(layoutSpec) : splitButtons$$ExternalSyntheticLambda02.invoke(layoutSpec))).value);
                }
            }
        });
        final int i4 = 2;
        ContourLayout.layoutBy$default(this, mooncakePillButton, rightTo, ContourLayout.topTo(new OffersHomeQueries$$ExternalSyntheticLambda1(i4)));
        final int i5 = 3;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new OffersHomeQueries$$ExternalSyntheticLambda1(i5));
        BundleKt.widthOfFloat$default(leftTo, new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda6
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i2;
                SplitButtons$$ExternalSyntheticLambda0 splitButtons$$ExternalSyntheticLambda02 = splitButtons$$ExternalSyntheticLambda0;
                MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda62 = musicViewKt$$ExternalSyntheticLambda6;
                SplitButtons splitButtons = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i42) {
                    case 0:
                        int i52 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new XFloat(((XFloat) ((splitButtons.layoutHorizontal && splitButtons.getShowingSecondary()) ? musicViewKt$$ExternalSyntheticLambda62.invoke(layoutSpec) : splitButtons$$ExternalSyntheticLambda02.invoke(layoutSpec))).value);
                    default:
                        int i6 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new XFloat(((XFloat) ((splitButtons.layoutHorizontal && splitButtons.getShowingPrimary()) ? musicViewKt$$ExternalSyntheticLambda62.invoke(layoutSpec) : splitButtons$$ExternalSyntheticLambda02.invoke(layoutSpec))).value);
                }
            }
        });
        ContourLayout.layoutBy$default(this, mooncakePillButton2, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda1
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i2;
                SplitButtons splitButtons = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec.getParent().padding().top : splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i8 = SplitButtons.$r8$clinit;
                        layoutSpec2.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec2.getParent().padding().top : splitButtons.spacing + splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 2:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i9 = SplitButtons.$r8$clinit;
                        layoutSpec3.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3818rightTENr5nQ(splitButtons.secondary) : layoutSpec3.getParent().padding().left);
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                        int i10 = SplitButtons.$r8$clinit;
                        layoutSpec4.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3816leftTENr5nQ(splitButtons.primary) : layoutSpec4.getParent().m4374rightblrYgr0());
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec5 = (ContourLayout.LayoutSpec) obj;
                        int i11 = SplitButtons.$r8$clinit;
                        layoutSpec5.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec5.getParent().m4372bottomh0YXg9w() : splitButtons.m3819topdBGyhoQ(splitButtons.secondary));
                    default:
                        return new YInt(Math.max(splitButtons.m3810bottomdBGyhoQ(splitButtons.secondary), splitButtons.m3810bottomdBGyhoQ(splitButtons.primary)));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda1
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i4;
                SplitButtons splitButtons = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec.getParent().padding().top : splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i8 = SplitButtons.$r8$clinit;
                        layoutSpec2.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec2.getParent().padding().top : splitButtons.spacing + splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 2:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i9 = SplitButtons.$r8$clinit;
                        layoutSpec3.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3818rightTENr5nQ(splitButtons.secondary) : layoutSpec3.getParent().padding().left);
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                        int i10 = SplitButtons.$r8$clinit;
                        layoutSpec4.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3816leftTENr5nQ(splitButtons.primary) : layoutSpec4.getParent().m4374rightblrYgr0());
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec5 = (ContourLayout.LayoutSpec) obj;
                        int i11 = SplitButtons.$r8$clinit;
                        layoutSpec5.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec5.getParent().m4372bottomh0YXg9w() : splitButtons.m3819topdBGyhoQ(splitButtons.secondary));
                    default:
                        return new YInt(Math.max(splitButtons.m3810bottomdBGyhoQ(splitButtons.secondary), splitButtons.m3810bottomdBGyhoQ(splitButtons.primary)));
                }
            }
        });
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda1
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i5;
                SplitButtons splitButtons = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec.getParent().padding().top : splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i8 = SplitButtons.$r8$clinit;
                        layoutSpec2.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec2.getParent().padding().top : splitButtons.spacing + splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 2:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i9 = SplitButtons.$r8$clinit;
                        layoutSpec3.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3818rightTENr5nQ(splitButtons.secondary) : layoutSpec3.getParent().padding().left);
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                        int i10 = SplitButtons.$r8$clinit;
                        layoutSpec4.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3816leftTENr5nQ(splitButtons.primary) : layoutSpec4.getParent().m4374rightblrYgr0());
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec5 = (ContourLayout.LayoutSpec) obj;
                        int i11 = SplitButtons.$r8$clinit;
                        layoutSpec5.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec5.getParent().m4372bottomh0YXg9w() : splitButtons.m3819topdBGyhoQ(splitButtons.secondary));
                    default:
                        return new YInt(Math.max(splitButtons.m3810bottomdBGyhoQ(splitButtons.secondary), splitButtons.m3810bottomdBGyhoQ(splitButtons.primary)));
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda1
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i3;
                SplitButtons splitButtons = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec.getParent().padding().top : splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i8 = SplitButtons.$r8$clinit;
                        layoutSpec2.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec2.getParent().padding().top : splitButtons.spacing + splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 2:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i9 = SplitButtons.$r8$clinit;
                        layoutSpec3.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3818rightTENr5nQ(splitButtons.secondary) : layoutSpec3.getParent().padding().left);
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                        int i10 = SplitButtons.$r8$clinit;
                        layoutSpec4.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3816leftTENr5nQ(splitButtons.primary) : layoutSpec4.getParent().m4374rightblrYgr0());
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec5 = (ContourLayout.LayoutSpec) obj;
                        int i11 = SplitButtons.$r8$clinit;
                        layoutSpec5.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec5.getParent().m4372bottomh0YXg9w() : splitButtons.m3819topdBGyhoQ(splitButtons.secondary));
                    default:
                        return new YInt(Math.max(splitButtons.m3810bottomdBGyhoQ(splitButtons.secondary), splitButtons.m3810bottomdBGyhoQ(splitButtons.primary)));
                }
            }
        });
        final int i6 = 4;
        HasTop$DefaultImpls.bottomTo$default(byteArrayProtoReader32, new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda1
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i6;
                SplitButtons splitButtons = this.f$0;
                switch (i62) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec.getParent().padding().top : splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i8 = SplitButtons.$r8$clinit;
                        layoutSpec2.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec2.getParent().padding().top : splitButtons.spacing + splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 2:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i9 = SplitButtons.$r8$clinit;
                        layoutSpec3.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3818rightTENr5nQ(splitButtons.secondary) : layoutSpec3.getParent().padding().left);
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                        int i10 = SplitButtons.$r8$clinit;
                        layoutSpec4.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3816leftTENr5nQ(splitButtons.primary) : layoutSpec4.getParent().m4374rightblrYgr0());
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec5 = (ContourLayout.LayoutSpec) obj;
                        int i11 = SplitButtons.$r8$clinit;
                        layoutSpec5.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec5.getParent().m4372bottomh0YXg9w() : splitButtons.m3819topdBGyhoQ(splitButtons.secondary));
                    default:
                        return new YInt(Math.max(splitButtons.m3810bottomdBGyhoQ(splitButtons.secondary), splitButtons.m3810bottomdBGyhoQ(splitButtons.primary)));
                }
            }
        });
        ContourLayout.layoutBy$default(this, view, leftTo2, byteArrayProtoReader32);
        final int i7 = 5;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda1
            public final /* synthetic */ SplitButtons f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i7;
                SplitButtons splitButtons = this.f$0;
                switch (i62) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i72 = SplitButtons.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec.getParent().padding().top : splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i8 = SplitButtons.$r8$clinit;
                        layoutSpec2.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec2.getParent().padding().top : splitButtons.spacing + splitButtons.m3810bottomdBGyhoQ(splitButtons.primary));
                    case 2:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i9 = SplitButtons.$r8$clinit;
                        layoutSpec3.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3818rightTENr5nQ(splitButtons.secondary) : layoutSpec3.getParent().padding().left);
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                        int i10 = SplitButtons.$r8$clinit;
                        layoutSpec4.getClass();
                        return new XInt(splitButtons.layoutHorizontal ? splitButtons.m3816leftTENr5nQ(splitButtons.primary) : layoutSpec4.getParent().m4374rightblrYgr0());
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec5 = (ContourLayout.LayoutSpec) obj;
                        int i11 = SplitButtons.$r8$clinit;
                        layoutSpec5.getClass();
                        return new YInt(splitButtons.layoutHorizontal ? layoutSpec5.getParent().m4372bottomh0YXg9w() : splitButtons.m3819topdBGyhoQ(splitButtons.secondary));
                    default:
                        return new YInt(Math.max(splitButtons.m3810bottomdBGyhoQ(splitButtons.secondary), splitButtons.m3810bottomdBGyhoQ(splitButtons.primary)));
                }
            }
        });
    }

    public final boolean getShowingPrimary() {
        Showing showing = this.showingButtons;
        return showing == Showing.PrimaryOnly || showing == Showing.Both;
    }

    public final boolean getShowingSecondary() {
        Showing showing = this.showingButtons;
        return showing == Showing.SecondaryOnly || showing == Showing.Both;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (java.lang.Math.max(r1.getMeasuredWidth(), r2.getMeasuredWidth()) <= r0) goto L9;
     */
    @Override // com.squareup.contour.ContourLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = (getMeasuredWidth() / 2.0f) - (this.spacing / 2.0f);
        boolean z = false;
        if (this.layoutMode != LayoutMode.VERTICAL_STACK) {
            if (this.showingButtons == Showing.Both) {
                this.primary.measure(0, 0);
                this.secondary.measure(0, 0);
            }
            z = true;
        }
        if (this.layoutHorizontal != z && (!z || this.layoutMode != LayoutMode.NEVER_COLLAPSE)) {
            this.layoutHorizontal = z;
        }
        requestLayout();
        super.onMeasure(i, i2);
    }

    public final void setLayoutMode(LayoutMode layoutMode) {
        layoutMode.getClass();
        this.layoutMode = layoutMode;
        invalidate();
    }

    public final void updateVisibleButtons(Showing showing) {
        this.showingButtons = showing;
        int i = 0;
        this.primary.setVisibility((showing == Showing.PrimaryOnly || showing == Showing.Both) ? 0 : 8);
        Showing showing2 = Showing.Both;
        this.divider.setVisibility((showing == showing2 && this.style == Style.ALERT_DIALOG) ? 0 : 8);
        if (showing != Showing.SecondaryOnly && showing != showing2) {
            i = 8;
        }
        this.secondary.setVisibility(i);
        requestLayout();
    }

    public final void updateVisibleButtons(boolean z, boolean z2) {
        Showing showing;
        if (z && z2) {
            showing = Showing.Both;
        } else if (z) {
            showing = Showing.PrimaryOnly;
        } else if (z2) {
            showing = Showing.SecondaryOnly;
        } else {
            showing = Showing.None;
        }
        updateVisibleButtons(showing);
    }

    public /* synthetic */ SplitButtons(Context context, AttributeSet attributeSet, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? Style.MOONCAKE_PILLS : style);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitButtons(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Style.MOONCAKE_PILLS);
        context.getClass();
    }

    public /* synthetic */ SplitButtons(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
