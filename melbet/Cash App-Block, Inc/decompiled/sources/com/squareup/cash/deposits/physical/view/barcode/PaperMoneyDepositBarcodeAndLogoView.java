package com.squareup.cash.deposits.physical.view.barcode;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SearchView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.HasTop$DefaultImpls;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositBarcodeAndLogoView extends ContourLayout implements Ui, SecureScreen {
    public final AppCompatTextView barcodeDetailView;
    public final ImageView barcodeImageView;
    public final AppCompatTextView barcodeTextView;
    public Ui.EventReceiver eventReceiver;
    public final ImageView logoImageView;
    public final AppCompatTextView timerTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperMoneyDepositBarcodeAndLogoView(Context context, int i) {
        super(context);
        context.getClass();
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        final int i2 = 6;
        imageView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 6));
        this.barcodeImageView = imageView;
        ImageView imageView2 = new ImageView(context);
        final int i3 = 1;
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setImageResource(R.drawable.barcode_cash_logo);
        this.logoImageView = imageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextColor(-16777216);
        TextThemeInfo textThemeInfo = TextStyles.caption;
        Strings.applyStyle(appCompatTextView, textThemeInfo);
        this.barcodeTextView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextColor(i);
        Strings.applyStyle(appCompatTextView2, textThemeInfo);
        this.barcodeDetailView = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setGravity(1);
        appCompatTextView3.setTextColor(i);
        Strings.applyStyle(appCompatTextView3, textThemeInfo);
        this.timerTextView = appCompatTextView3;
        contourHeightWrapContent();
        contourWidthMatchParent();
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new PasswordInfoQueries$$ExternalSyntheticLambda0(26));
        final int i4 = 2;
        rightTo.leftTo(1, new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i4;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i5) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        });
        final int i5 = 3;
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i5;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        });
        final int i6 = 4;
        HasTop$DefaultImpls.bottomTo$default(byteArrayProtoReader32, new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i6;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, imageView, rightTo, byteArrayProtoReader32);
        final int i7 = 5;
        ContourLayout.layoutBy$default(this, imageView2, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i7;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        }), ContourLayout.topTo(new PasswordInfoQueries$$ExternalSyntheticLambda0(27)));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i2;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        });
        final int i8 = 7;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i8;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        });
        final int i9 = 8;
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i9;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        }));
        final int i10 = 0;
        ContourLayout.layoutBy$default(this, appCompatTextView2, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i3;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, appCompatTextView3, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView$$ExternalSyntheticLambda1
            public final /* synthetic */ PaperMoneyDepositBarcodeAndLogoView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i10;
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 4) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeDetailView));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 24) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeTextView));
                    case 2:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.logoImageView) + 12);
                    case 3:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3819topdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 4:
                        layoutSpec.getClass();
                        return new YInt(paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.logoImageView));
                    case 5:
                        return new XInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 6:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3816leftTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    case 7:
                        layoutSpec.getClass();
                        return new XInt(paperMoneyDepositBarcodeAndLogoView.m3818rightTENr5nQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                    default:
                        layoutSpec.getClass();
                        return new YInt(Views.dip((View) paperMoneyDepositBarcodeAndLogoView, 6) + paperMoneyDepositBarcodeAndLogoView.m3810bottomdBGyhoQ(paperMoneyDepositBarcodeAndLogoView.barcodeImageView));
                }
            }
        }));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel) {
        paperMoneyDepositBarcodeViewModel.getClass();
        if (paperMoneyDepositBarcodeViewModel instanceof PaperMoneyDepositBarcodeViewModel.Ready) {
            PaperMoneyDepositBarcodeViewModel.Ready ready = (PaperMoneyDepositBarcodeViewModel.Ready) paperMoneyDepositBarcodeViewModel;
            GetPaperCashDepositBarcodeResponse.Success success = ready.success;
            this.barcodeImageView.setImageBitmap(ready.barcodeImage.bitmap);
            String str = success.barcode_number;
            str.getClass();
            this.barcodeTextView.setText(str);
            this.barcodeDetailView.setText(success.barcode_detail_text);
            this.timerTextView.setText(ready.timerText);
        }
    }
}
