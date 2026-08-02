package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.BundleKt;
import androidx.navigation.fragment.FragmentKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.AlertDialogView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final class MyFirstConfigurationView extends ContourLayout {
    public final AppCompatTextView body;
    public final ComposeView border;
    public final AppCompatImageView headerImage;
    public final RealImageLoader imageLoader;
    public final MooncakePillButton link;
    public final MooncakePillButton pillButtonLink;
    public final AppCompatTextView title;

    public MyFirstConfigurationView(Context context, RealImageLoader realImageLoader) {
        super(context);
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.headerImage = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(colorPalette.label);
        final int i = 0;
        appCompatTextView.setTextSize(0, this.density * 22.0f);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        final int i2 = 1;
        appCompatTextView.setGravity(1);
        this.title = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setTextColor(colorPalette.secondaryLabel);
        appCompatTextView2.setTextSize(0, this.density * 16.0f);
        BundleKt.setTypeface(appCompatTextView2, R.font.cashsans_regular);
        appCompatTextView2.setLineSpacing(Views.sp((View) appCompatTextView2, 5.0f), 1.0f);
        appCompatTextView2.setGravity(17);
        this.body = appCompatTextView2;
        MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
        MooncakePillButton.Size size = MooncakePillButton.Size.LARGE;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, size, style, 2, null);
        mooncakePillButton.setMinHeight(Views.dip(context, 64));
        this.link = mooncakePillButton;
        MooncakePillButton mooncakePillButton2 = new MooncakePillButton(context, null, null, null, 14, null);
        mooncakePillButton2.setStyle(MooncakePillButton.Style.PRIMARY);
        mooncakePillButton2.setSize(size);
        this.pillButtonLink = mooncakePillButton2;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ArcadeBordersKt.f445lambda$747122818);
        this.border = composeView;
        setBackground(FragmentKt.roundedRect(this.density * 16.0f, colorPalette.background));
        setClipToOutline(true);
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(0));
        leftTo.rightTo(1, new MyFirstConfigurationView$$ExternalSyntheticLambda2(22));
        ContourLayout.layoutBy$default(this, appCompatImageView, leftTo, ContourLayout.topTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(16)));
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(17));
        final int i3 = 2;
        centerHorizontallyTo.widthOf(2, new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i2;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i4) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatTextView, centerHorizontallyTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i4) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        }));
        ByteArrayProtoReader32 centerHorizontallyTo2 = ContourLayout.centerHorizontallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(18));
        final int i4 = 3;
        centerHorizontallyTo2.widthOf(2, new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i4;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i42) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        });
        final int i5 = 4;
        ContourLayout.layoutBy$default(this, appCompatTextView2, centerHorizontallyTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i5;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i42) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(19));
        leftTo2.rightTo(1, new MyFirstConfigurationView$$ExternalSyntheticLambda2(20));
        ContourLayout.layoutBy$default(this, mooncakePillButton, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i42) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        }));
        ByteArrayProtoReader32 centerHorizontallyTo3 = ContourLayout.centerHorizontallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(21));
        final int i6 = 5;
        centerHorizontallyTo3.widthOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i6;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i42) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        });
        final int i7 = 6;
        ContourLayout.layoutBy$default(this, mooncakePillButton2, centerHorizontallyTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i7;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i42) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, composeView, ContourLayout.matchParentX(0, 0), ContourLayout.matchParentY$default(this));
        final int i8 = 7;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda4
            public final /* synthetic */ MyFirstConfigurationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i8;
                MyFirstConfigurationView myFirstConfigurationView = this.f$0;
                switch (i42) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AppCompatImageView appCompatImageView2 = myFirstConfigurationView.headerImage;
                        return new YInt(myFirstConfigurationView.m3810bottomdBGyhoQ(appCompatImageView2) + myFirstConfigurationView.m3814getYdipdBGyhoQ(appCompatImageView2.getDrawable() == null ? 36 : 3));
                    case 3:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(24));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(13) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.title));
                    case 5:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec3.getClass();
                        return new XInt(((Huffman.Node) layoutSpec3.getParent().appLaunchedCallback).resolve() - myFirstConfigurationView.m3813getXdipTENr5nQ(48));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.body));
                    default:
                        MooncakePillButton mooncakePillButton3 = myFirstConfigurationView.link;
                        return new YInt(mooncakePillButton3.getVisibility() == 0 ? myFirstConfigurationView.m3810bottomdBGyhoQ(mooncakePillButton3) : myFirstConfigurationView.m3814getYdipdBGyhoQ(24) + myFirstConfigurationView.m3810bottomdBGyhoQ(myFirstConfigurationView.pillButtonLink));
                }
            }
        });
    }

    public final void setLinkListener(Function0<Unit> function0) {
        function0.getClass();
        this.link.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(2, function0));
        this.pillButtonLink.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(3, function0));
    }
}
