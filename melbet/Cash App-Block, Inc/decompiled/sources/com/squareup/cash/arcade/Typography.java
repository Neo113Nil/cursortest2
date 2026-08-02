package com.squareup.cash.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.room.Room;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class Typography {
    public final TextStyle badgeLargeAsset;
    public final TextStyle badgeLargeInline;
    public final Base base;
    public final TextStyle body;
    public final TextStyle bodyLink;
    public final TextStyle bodyMedium;
    public final TextStyle bodySmall;
    public final TextStyle bodyXSmall;
    public final TextStyle button;
    public final TextStyle buttonCompact;
    public final TextStyle buttonCompactUnderline;
    public final TextStyle buttonUnderline;
    public final TextStyle cellBody;
    public final TextStyle componentCardTitleSmall;
    public final TextStyle disclaimer;
    public final TextStyle disclaimerLink;
    public final TextStyle header;
    public final TextStyle headlineLarge;
    public final TextStyle headlineSmall;
    public final TextStyle helpText;
    public final TextStyle hero;
    public final TextStyle heroNumerics;
    public final TextStyle input;
    public final TextStyle keypadNumbers;
    public final TextStyle keypadTotal;
    public final TextStyle label;
    public final TextStyle labelMedium;
    public final TextStyle labelSmall;
    public final TextStyle labelXSmall;
    public final TextStyle largeLabel;
    public final TextStyle linkMedium;
    public final TextStyle linkSmall;
    public final TextStyle linkXSmall;
    public final TextStyle listNumber;
    public final TextStyle marketingCardTitleLarge;
    public final TextStyle marketingCardTitleSmall;
    public final TextStyle metaText;
    public final TextStyle numeralLarge;
    public final TextStyle numeralSmall;
    public final TextStyle pageTitle;
    public final TextStyle sectionTitle;
    public final TextStyle tabTitle;
    public final TextStyle titleBarPageTitle;

    public final class Base {
        public final TextStyle medium10;
        public final TextStyle medium14;
        public final TextStyle medium16;
        public final TextStyle medium24;
        public final TextStyle medium32;
        public final TextStyle medium56;
        public final TextStyle regular10;
        public final TextStyle regular14;
        public final TextStyle regular16;
        public final TextStyle regular32;
        public final TextStyle regular44;
        public final TextStyle regular56;

        public Base() {
            FontListFontFamily fontListFontFamily = Fonts.CashSans;
            TextStyle textStyle = new TextStyle(0L, Room.getSp(10), new FontWeight(500), fontListFontFamily, Room.getSp(0.4d), 0L, 0, 0, Room.getSp(16), null, 16645977);
            TextStyle textStyle2 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), fontListFontFamily, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
            TextStyle textStyle3 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), fontListFontFamily, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
            TextStyle textStyle4 = new TextStyle(0L, Room.getSp(24), new FontWeight(500), fontListFontFamily, Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
            TextStyle textStyle5 = new TextStyle(0L, Room.getSp(32), new FontWeight(500), fontListFontFamily, Room.getSp(-0.48d), 0L, 0, 0, Room.getSp(32), null, 16645977);
            TextStyle textStyle6 = new TextStyle(0L, Room.getSp(56), new FontWeight(500), fontListFontFamily, Room.getSp(0), 0L, 0, 0, Room.getSp(56), null, 16645977);
            TextStyle textStyle7 = new TextStyle(0L, Room.getSp(10), new FontWeight(400), fontListFontFamily, Room.getSp(0.3d), 0L, 0, 0, Room.getSp(16), null, 16645977);
            TextStyle textStyle8 = new TextStyle(0L, Room.getSp(14), new FontWeight(400), fontListFontFamily, Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
            TextStyle textStyle9 = new TextStyle(0L, Room.getSp(16), new FontWeight(400), fontListFontFamily, Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
            TextStyle textStyle10 = new TextStyle(0L, Room.getSp(32), new FontWeight(400), fontListFontFamily, Room.getSp(-0.8d), 0L, 0, 0, Room.getSp(32), null, 16645977);
            TextStyle textStyle11 = new TextStyle(0L, Room.getSp(44), new FontWeight(400), fontListFontFamily, Room.getSp(-1.43d), 0L, 0, 0, Room.getSp(44), null, 16645977);
            TextStyle textStyle12 = new TextStyle(0L, Room.getSp(56), new FontWeight(400), fontListFontFamily, Room.getSp(-2.24d), 0L, 0, 0, Room.getSp(56), null, 16645977);
            this.medium10 = textStyle;
            this.medium14 = textStyle2;
            this.medium16 = textStyle3;
            this.medium24 = textStyle4;
            this.medium32 = textStyle5;
            this.medium56 = textStyle6;
            this.regular10 = textStyle7;
            this.regular14 = textStyle8;
            this.regular16 = textStyle9;
            this.regular32 = textStyle10;
            this.regular44 = textStyle11;
            this.regular56 = textStyle12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Base)) {
                return false;
            }
            Base base = (Base) obj;
            return Intrinsics.areEqual(this.medium10, base.medium10) && Intrinsics.areEqual(this.medium14, base.medium14) && Intrinsics.areEqual(this.medium16, base.medium16) && Intrinsics.areEqual(this.medium24, base.medium24) && Intrinsics.areEqual(this.medium32, base.medium32) && Intrinsics.areEqual(this.medium56, base.medium56) && Intrinsics.areEqual(this.regular10, base.regular10) && Intrinsics.areEqual(this.regular14, base.regular14) && Intrinsics.areEqual(this.regular16, base.regular16) && Intrinsics.areEqual(this.regular32, base.regular32) && Intrinsics.areEqual(this.regular44, base.regular44) && Intrinsics.areEqual(this.regular56, base.regular56);
        }

        public final int hashCode() {
            return this.regular56.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.regular44, Recorder$$ExternalSyntheticOutline1.m(this.regular32, Recorder$$ExternalSyntheticOutline1.m(this.regular16, Recorder$$ExternalSyntheticOutline1.m(this.regular14, Recorder$$ExternalSyntheticOutline1.m(this.regular10, Recorder$$ExternalSyntheticOutline1.m(this.medium56, Recorder$$ExternalSyntheticOutline1.m(this.medium32, Recorder$$ExternalSyntheticOutline1.m(this.medium24, Recorder$$ExternalSyntheticOutline1.m(this.medium16, Recorder$$ExternalSyntheticOutline1.m(this.medium14, this.medium10.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Base(medium10=");
            sb.append(this.medium10);
            sb.append(", medium14=");
            sb.append(this.medium14);
            sb.append(", medium16=");
            SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.medium16, ", medium24=", this.medium24, ", medium32=");
            SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.medium32, ", medium56=", this.medium56, ", regular10=");
            SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.regular10, ", regular14=", this.regular14, ", regular16=");
            SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.regular16, ", regular32=", this.regular32, ", regular44=");
            sb.append(this.regular44);
            sb.append(", regular56=");
            sb.append(this.regular56);
            sb.append(")");
            return sb.toString();
        }
    }

    public Typography() {
        Base base = new Base();
        FontListFontFamily cashSans = Fonts.getCashSans();
        TextStyle textStyle = new TextStyle(0L, Room.getSp(11), new FontWeight(400), cashSans, Room.getSp(0.5d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans2 = Fonts.getCashSans();
        TextStyle textStyle2 = new TextStyle(0L, Room.getSp(14), new FontWeight(400), cashSans2, Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily cashSans3 = Fonts.getCashSans();
        TextStyle textStyle3 = new TextStyle(0L, Room.getSp(16), new FontWeight(400), cashSans3, Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans4 = Fonts.getCashSans();
        TextStyle textStyle4 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans4, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16641817);
        FontListFontFamily cashSans5 = Fonts.getCashSans();
        TextStyle textStyle5 = new TextStyle(0L, Room.getSp(16), new FontWeight(400), cashSans5, Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans6 = Fonts.getCashSans();
        TextStyle textStyle6 = new TextStyle(0L, Room.getSp(14), new FontWeight(400), cashSans6, Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily fontListFontFamily = Fonts.CashSansMono;
        TextStyle textStyle7 = new TextStyle(0L, Room.getSp(10), new FontWeight(400), fontListFontFamily, Room.getSp(0.3d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans7 = Fonts.getCashSans();
        TextStyle textStyle8 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans7, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans8 = Fonts.getCashSans();
        TextStyle textStyle9 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), cashSans8, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans9 = Fonts.getCashSans();
        TextStyle textStyle10 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), cashSans9, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(16), null, 16641817);
        FontListFontFamily cashSans10 = Fonts.getCashSans();
        TextStyle textStyle11 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans10, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16641817);
        FontListFontFamily cashSans11 = Fonts.getCashSans();
        TextStyle textStyle12 = new TextStyle(0L, Room.getSp(14), new FontWeight(400), cashSans11, Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily cashSans12 = Fonts.getCashSans();
        TextStyle textStyle13 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans12, Room.getSp(0), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans13 = Fonts.getCashSans();
        TextStyle textStyle14 = new TextStyle(0L, Room.getSp(14), new FontWeight(400), cashSans13, Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily cashSans14 = Fonts.getCashSans();
        TextStyle textStyle15 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), cashSans14, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16641817);
        FontListFontFamily cashSans15 = Fonts.getCashSans();
        TextStyle textStyle16 = new TextStyle(0L, Room.getSp(28), new FontWeight(500), cashSans15, Room.getSp(0), 0L, 0, 0, Room.getSp(32), null, 16645977);
        FontListFontFamily cashSans16 = Fonts.getCashSans();
        TextStyle textStyle17 = new TextStyle(0L, Room.getSp(44), new FontWeight(400), cashSans16, Room.getSp(-1.43d), 0L, 0, 0, Room.getSp(44), null, 16645977);
        FontListFontFamily cashSans17 = Fonts.getCashSans();
        TextStyle textStyle18 = new TextStyle(0L, Room.getSp(32), new FontWeight(400), cashSans17, Room.getSp(-0.8d), 0L, 0, 0, Room.getSp(32), null, 16645977);
        FontListFontFamily cashSans18 = Fonts.getCashSans();
        TextStyle textStyle19 = new TextStyle(0L, Room.getSp(14), new FontWeight(400), cashSans18, Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily cashSans19 = Fonts.getCashSans();
        TextStyle textStyle20 = new TextStyle(0L, Room.getSp(56), new FontWeight(400), cashSans19, Room.getSp(-2.24d), 0L, 0, 0, Room.getSp(56), null, 16645977);
        FontListFontFamily cashSans20 = Fonts.getCashSans();
        TextStyle textStyle21 = new TextStyle(0L, Room.getSp(48), new FontWeight(600), cashSans20, Room.getSp(0), 0L, 0, 0, Room.getSp(52), null, 16645977);
        FontListFontFamily cashSans21 = Fonts.getCashSans();
        TextStyle textStyle22 = new TextStyle(0L, Room.getSp(16), new FontWeight(400), cashSans21, Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans22 = Fonts.getCashSans();
        TextStyle textStyle23 = new TextStyle(0L, Room.getSp(24), new FontWeight(500), cashSans22, Room.getSp(0), 0L, 0, 0, Room.getSp(28), null, 16645977);
        FontListFontFamily cashSans23 = Fonts.getCashSans();
        TextStyle textStyle24 = new TextStyle(0L, Room.getSp(96), new FontWeight(500), cashSans23, Room.getSp(0), 0L, 0, 0, Room.getSp(96), null, 16645977);
        FontListFontFamily cashSans24 = Fonts.getCashSans();
        TextStyle textStyle25 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans24, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans25 = Fonts.getCashSans();
        TextStyle textStyle26 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans25, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans26 = Fonts.getCashSans();
        TextStyle textStyle27 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), cashSans26, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        TextStyle textStyle28 = new TextStyle(0L, Room.getSp(10), new FontWeight(500), fontListFontFamily, Room.getSp(0.6d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans27 = Fonts.getCashSans();
        TextStyle textStyle29 = new TextStyle(0L, Room.getSp(32), new FontWeight(600), cashSans27, Room.getSp(0), 0L, 0, 0, Room.getSp(36), null, 16645977);
        FontListFontFamily cashSans28 = Fonts.getCashSans();
        TextStyle textStyle30 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans28, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16641817);
        FontListFontFamily cashSans29 = Fonts.getCashSans();
        TextStyle textStyle31 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), cashSans29, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16641817);
        TextStyle textStyle32 = new TextStyle(0L, Room.getSp(10), new FontWeight(500), fontListFontFamily, Room.getSp(0.4d), 0L, 0, 0, Room.getSp(16), null, 16641817);
        FontListFontFamily cashSans30 = Fonts.getCashSans();
        TextStyle textStyle33 = new TextStyle(0L, Room.getSp(14), new FontWeight(500), cashSans30, Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily cashSans31 = Fonts.getCashSans();
        TextStyle textStyle34 = new TextStyle(0L, Room.getSp(24), new FontWeight(500), cashSans31, Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans32 = Fonts.getCashSans();
        TextStyle textStyle35 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans32, Room.getSp(0), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans33 = Fonts.getCashSans();
        TextStyle textStyle36 = new TextStyle(0L, Room.getSp(12), new FontWeight(400), cashSans33, Room.getSp(1), 0L, 0, 0, Room.getSp(16), null, 16645977);
        FontListFontFamily cashSans34 = Fonts.getCashSans();
        TextStyle textStyle37 = new TextStyle(0L, Room.getSp(56), new FontWeight(500), cashSans34, Room.getSp(0), 0L, 0, 0, Room.getSp(56), null, 16645977);
        FontListFontFamily cashSans35 = Fonts.getCashSans();
        TextStyle textStyle38 = new TextStyle(0L, Room.getSp(32), new FontWeight(500), cashSans35, Room.getSp(0), 0L, 0, 0, Room.getSp(32), null, 16645977);
        FontListFontFamily cashSans36 = Fonts.getCashSans();
        TextStyle textStyle39 = new TextStyle(0L, Room.getSp(32), new FontWeight(500), cashSans36, Room.getSp(-0.48d), 0L, 0, 0, Room.getSp(32), null, 16645977);
        FontListFontFamily cashSans37 = Fonts.getCashSans();
        TextStyle textStyle40 = new TextStyle(0L, Room.getSp(24), new FontWeight(500), cashSans37, Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans38 = Fonts.getCashSans();
        TextStyle textStyle41 = new TextStyle(0L, Room.getSp(24), new FontWeight(500), cashSans38, Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        FontListFontFamily cashSans39 = Fonts.getCashSans();
        TextStyle textStyle42 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), cashSans39, Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        this.base = base;
        this.badgeLargeAsset = textStyle;
        this.badgeLargeInline = textStyle2;
        this.body = textStyle3;
        this.bodyLink = textStyle4;
        this.bodyMedium = textStyle5;
        this.bodySmall = textStyle6;
        this.bodyXSmall = textStyle7;
        this.button = textStyle8;
        this.buttonCompact = textStyle9;
        this.buttonCompactUnderline = textStyle10;
        this.buttonUnderline = textStyle11;
        this.cellBody = textStyle12;
        this.componentCardTitleSmall = textStyle13;
        this.disclaimer = textStyle14;
        this.disclaimerLink = textStyle15;
        this.header = textStyle16;
        this.headlineLarge = textStyle17;
        this.headlineSmall = textStyle18;
        this.helpText = textStyle19;
        this.hero = textStyle20;
        this.heroNumerics = textStyle21;
        this.input = textStyle22;
        this.keypadNumbers = textStyle23;
        this.keypadTotal = textStyle24;
        this.label = textStyle25;
        this.labelMedium = textStyle26;
        this.labelSmall = textStyle27;
        this.labelXSmall = textStyle28;
        this.largeLabel = textStyle29;
        this.linkMedium = textStyle30;
        this.linkSmall = textStyle31;
        this.linkXSmall = textStyle32;
        this.listNumber = textStyle33;
        this.marketingCardTitleLarge = textStyle34;
        this.marketingCardTitleSmall = textStyle35;
        this.metaText = textStyle36;
        this.numeralLarge = textStyle37;
        this.numeralSmall = textStyle38;
        this.pageTitle = textStyle39;
        this.sectionTitle = textStyle40;
        this.tabTitle = textStyle41;
        this.titleBarPageTitle = textStyle42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return Intrinsics.areEqual(this.base, typography.base) && Intrinsics.areEqual(this.badgeLargeAsset, typography.badgeLargeAsset) && Intrinsics.areEqual(this.badgeLargeInline, typography.badgeLargeInline) && Intrinsics.areEqual(this.body, typography.body) && Intrinsics.areEqual(this.bodyLink, typography.bodyLink) && Intrinsics.areEqual(this.bodyMedium, typography.bodyMedium) && Intrinsics.areEqual(this.bodySmall, typography.bodySmall) && Intrinsics.areEqual(this.bodyXSmall, typography.bodyXSmall) && Intrinsics.areEqual(this.button, typography.button) && Intrinsics.areEqual(this.buttonCompact, typography.buttonCompact) && Intrinsics.areEqual(this.buttonCompactUnderline, typography.buttonCompactUnderline) && Intrinsics.areEqual(this.buttonUnderline, typography.buttonUnderline) && Intrinsics.areEqual(this.cellBody, typography.cellBody) && Intrinsics.areEqual(this.componentCardTitleSmall, typography.componentCardTitleSmall) && Intrinsics.areEqual(this.disclaimer, typography.disclaimer) && Intrinsics.areEqual(this.disclaimerLink, typography.disclaimerLink) && Intrinsics.areEqual(this.header, typography.header) && Intrinsics.areEqual(this.headlineLarge, typography.headlineLarge) && Intrinsics.areEqual(this.headlineSmall, typography.headlineSmall) && Intrinsics.areEqual(this.helpText, typography.helpText) && Intrinsics.areEqual(this.hero, typography.hero) && Intrinsics.areEqual(this.heroNumerics, typography.heroNumerics) && Intrinsics.areEqual(this.input, typography.input) && Intrinsics.areEqual(this.keypadNumbers, typography.keypadNumbers) && Intrinsics.areEqual(this.keypadTotal, typography.keypadTotal) && Intrinsics.areEqual(this.label, typography.label) && Intrinsics.areEqual(this.labelMedium, typography.labelMedium) && Intrinsics.areEqual(this.labelSmall, typography.labelSmall) && Intrinsics.areEqual(this.labelXSmall, typography.labelXSmall) && Intrinsics.areEqual(this.largeLabel, typography.largeLabel) && Intrinsics.areEqual(this.linkMedium, typography.linkMedium) && Intrinsics.areEqual(this.linkSmall, typography.linkSmall) && Intrinsics.areEqual(this.linkXSmall, typography.linkXSmall) && Intrinsics.areEqual(this.listNumber, typography.listNumber) && Intrinsics.areEqual(this.marketingCardTitleLarge, typography.marketingCardTitleLarge) && Intrinsics.areEqual(this.marketingCardTitleSmall, typography.marketingCardTitleSmall) && Intrinsics.areEqual(this.metaText, typography.metaText) && Intrinsics.areEqual(this.numeralLarge, typography.numeralLarge) && Intrinsics.areEqual(this.numeralSmall, typography.numeralSmall) && Intrinsics.areEqual(this.pageTitle, typography.pageTitle) && Intrinsics.areEqual(this.sectionTitle, typography.sectionTitle) && Intrinsics.areEqual(this.tabTitle, typography.tabTitle) && Intrinsics.areEqual(this.titleBarPageTitle, typography.titleBarPageTitle);
    }

    public final TextStyle fromID(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        Base base = this.base;
        switch (hashCode) {
            case -2087809135:
                if (str.equals("buttonCompact")) {
                    return this.buttonCompact;
                }
                return null;
            case -2074091232:
                if (str.equals("heroNumerics")) {
                    return this.heroNumerics;
                }
                return null;
            case -1747047919:
                if (str.equals("badgeLargeInline")) {
                    return this.badgeLargeInline;
                }
                return null;
            case -1660789133:
                if (str.equals("labelSmall")) {
                    return this.labelSmall;
                }
                return null;
            case -1635589843:
                if (str.equals("linkSmall")) {
                    return this.linkSmall;
                }
                return null;
            case -1477268010:
                if (str.equals("keypadNumbers")) {
                    return this.keypadNumbers;
                }
                return null;
            case -1377687758:
                if (str.equals("button")) {
                    return this.button;
                }
                return null;
            case -1221270899:
                if (str.equals("header")) {
                    return this.header;
                }
                return null;
            case -918112732:
                if (str.equals("cellBody")) {
                    return this.cellBody;
                }
                return null;
            case -917444669:
                if (str.equals("tabTitle")) {
                    return this.tabTitle;
                }
                return null;
            case -900166572:
                if (str.equals("medium10")) {
                    return base.medium10;
                }
                return null;
            case -900166568:
                if (str.equals("medium14")) {
                    return base.medium14;
                }
                return null;
            case -900166566:
                if (str.equals("medium16")) {
                    return base.medium16;
                }
                return null;
            case -900166537:
                if (str.equals("medium24")) {
                    return base.medium24;
                }
                return null;
            case -900166508:
                if (str.equals("medium32")) {
                    return base.medium32;
                }
                return null;
            case -900166442:
                if (str.equals("medium56")) {
                    return base.medium56;
                }
                return null;
            case -789774322:
                if (str.equals("helpText")) {
                    return this.helpText;
                }
                return null;
            case -568234544:
                if (str.equals("keypadTotal")) {
                    return this.keypadTotal;
                }
                return null;
            case -450476846:
                if (str.equals("metaText")) {
                    return this.metaText;
                }
                return null;
            case -414559299:
                if (str.equals("numeralLarge")) {
                    return this.numeralLarge;
                }
                return null;
            case -407753335:
                if (str.equals("numeralSmall")) {
                    return this.numeralSmall;
                }
                return null;
            case -340683656:
                if (str.equals("badgeLargeAsset")) {
                    return this.badgeLargeAsset;
                }
                return null;
            case -340495433:
                if (str.equals("bodyMedium")) {
                    return this.bodyMedium;
                }
                return null;
            case -248662086:
                if (str.equals("buttonUnderline")) {
                    return this.buttonUnderline;
                }
                return null;
            case -212146404:
                if (str.equals("componentCardTitleSmall")) {
                    return this.componentCardTitleSmall;
                }
                return null;
            case -123931767:
                if (str.equals("labelMedium")) {
                    return this.labelMedium;
                }
                return null;
            case -41937999:
                if (str.equals("bodyXSmall")) {
                    return this.bodyXSmall;
                }
                return null;
            case 3029410:
                if (str.equals("body")) {
                    return this.body;
                }
                return null;
            case 3198970:
                if (str.equals("hero")) {
                    return this.hero;
                }
                return null;
            case 100358090:
                if (str.equals("input")) {
                    return this.input;
                }
                return null;
            case 102727412:
                if (str.equals(AnnotatedPrivateKey.LABEL)) {
                    return this.label;
                }
                return null;
            case 119884974:
                if (str.equals("titleBarPageTitle")) {
                    return this.titleBarPageTitle;
                }
                return null;
            case 174625667:
                if (str.equals("labelXSmall")) {
                    return this.labelXSmall;
                }
                return null;
            case 222628231:
                if (str.equals("listNumber")) {
                    return this.listNumber;
                }
                return null;
            case 414756539:
                if (str.equals("regular10")) {
                    return base.regular10;
                }
                return null;
            case 414756543:
                if (str.equals("regular14")) {
                    return base.regular14;
                }
                return null;
            case 414756545:
                if (str.equals("regular16")) {
                    return base.regular16;
                }
                return null;
            case 414756603:
                if (str.equals("regular32")) {
                    return base.regular32;
                }
                return null;
            case 414756636:
                if (str.equals("regular44")) {
                    return base.regular44;
                }
                return null;
            case 414756669:
                if (str.equals("regular56")) {
                    return base.regular56;
                }
                return null;
            case 432371099:
                if (str.equals("disclaimer")) {
                    return this.disclaimer;
                }
                return null;
            case 640039539:
                if (str.equals("sectionTitle")) {
                    return this.sectionTitle;
                }
                return null;
            case 657246223:
                if (str.equals("linkMedium")) {
                    return this.linkMedium;
                }
                return null;
            case 682578997:
                if (str.equals("disclaimerLink")) {
                    return this.disclaimerLink;
                }
                return null;
            case 873402633:
                if (str.equals("pageTitle")) {
                    return this.pageTitle;
                }
                return null;
            case 955803657:
                if (str.equals("linkXSmall")) {
                    return this.linkXSmall;
                }
                return null;
            case 976702011:
                if (str.equals("buttonCompactUnderline")) {
                    return this.buttonCompactUnderline;
                }
                return null;
            case 1241718917:
                if (str.equals("bodySmall")) {
                    return this.bodySmall;
                }
                return null;
            case 1502003655:
                if (str.equals("headlineLarge")) {
                    return this.headlineLarge;
                }
                return null;
            case 1508809619:
                if (str.equals("headlineSmall")) {
                    return this.headlineSmall;
                }
                return null;
            case 1702411452:
                if (str.equals("bodyLink")) {
                    return this.bodyLink;
                }
                return null;
            case 2022154361:
                if (str.equals("largeLabel")) {
                    return this.largeLabel;
                }
                return null;
            case 2074934969:
                if (str.equals("marketingCardTitleLarge")) {
                    return this.marketingCardTitleLarge;
                }
                return null;
            case 2081740933:
                if (str.equals("marketingCardTitleSmall")) {
                    return this.marketingCardTitleSmall;
                }
                return null;
            default:
                return null;
        }
    }

    public final int hashCode() {
        return this.titleBarPageTitle.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.tabTitle, Recorder$$ExternalSyntheticOutline1.m(this.sectionTitle, Recorder$$ExternalSyntheticOutline1.m(this.pageTitle, Recorder$$ExternalSyntheticOutline1.m(this.numeralSmall, Recorder$$ExternalSyntheticOutline1.m(this.numeralLarge, Recorder$$ExternalSyntheticOutline1.m(this.metaText, Recorder$$ExternalSyntheticOutline1.m(this.marketingCardTitleSmall, Recorder$$ExternalSyntheticOutline1.m(this.marketingCardTitleLarge, Recorder$$ExternalSyntheticOutline1.m(this.listNumber, Recorder$$ExternalSyntheticOutline1.m(this.linkXSmall, Recorder$$ExternalSyntheticOutline1.m(this.linkSmall, Recorder$$ExternalSyntheticOutline1.m(this.linkMedium, Recorder$$ExternalSyntheticOutline1.m(this.largeLabel, Recorder$$ExternalSyntheticOutline1.m(this.labelXSmall, Recorder$$ExternalSyntheticOutline1.m(this.labelSmall, Recorder$$ExternalSyntheticOutline1.m(this.labelMedium, Recorder$$ExternalSyntheticOutline1.m(this.label, Recorder$$ExternalSyntheticOutline1.m(this.keypadTotal, Recorder$$ExternalSyntheticOutline1.m(this.keypadNumbers, Recorder$$ExternalSyntheticOutline1.m(this.input, Recorder$$ExternalSyntheticOutline1.m(this.heroNumerics, Recorder$$ExternalSyntheticOutline1.m(this.hero, Recorder$$ExternalSyntheticOutline1.m(this.helpText, Recorder$$ExternalSyntheticOutline1.m(this.headlineSmall, Recorder$$ExternalSyntheticOutline1.m(this.headlineLarge, Recorder$$ExternalSyntheticOutline1.m(this.header, Recorder$$ExternalSyntheticOutline1.m(this.disclaimerLink, Recorder$$ExternalSyntheticOutline1.m(this.disclaimer, Recorder$$ExternalSyntheticOutline1.m(this.componentCardTitleSmall, Recorder$$ExternalSyntheticOutline1.m(this.cellBody, Recorder$$ExternalSyntheticOutline1.m(this.buttonUnderline, Recorder$$ExternalSyntheticOutline1.m(this.buttonCompactUnderline, Recorder$$ExternalSyntheticOutline1.m(this.buttonCompact, Recorder$$ExternalSyntheticOutline1.m(this.button, Recorder$$ExternalSyntheticOutline1.m(this.bodyXSmall, Recorder$$ExternalSyntheticOutline1.m(this.bodySmall, Recorder$$ExternalSyntheticOutline1.m(this.bodyMedium, Recorder$$ExternalSyntheticOutline1.m(this.bodyLink, Recorder$$ExternalSyntheticOutline1.m(this.body, Recorder$$ExternalSyntheticOutline1.m(this.badgeLargeInline, Recorder$$ExternalSyntheticOutline1.m(this.badgeLargeAsset, this.base.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Typography(base=");
        sb.append(this.base);
        sb.append(", badgeLargeAsset=");
        sb.append(this.badgeLargeAsset);
        sb.append(", badgeLargeInline=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.badgeLargeInline, ", body=", this.body, ", bodyLink=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.bodyLink, ", bodyMedium=", this.bodyMedium, ", bodySmall=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.bodySmall, ", bodyXSmall=", this.bodyXSmall, ", button=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.button, ", buttonCompact=", this.buttonCompact, ", buttonCompactUnderline=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.buttonCompactUnderline, ", buttonUnderline=", this.buttonUnderline, ", cellBody=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.cellBody, ", componentCardTitleSmall=", this.componentCardTitleSmall, ", disclaimer=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.disclaimer, ", disclaimerLink=", this.disclaimerLink, ", header=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.header, ", headlineLarge=", this.headlineLarge, ", headlineSmall=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.headlineSmall, ", helpText=", this.helpText, ", hero=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.hero, ", heroNumerics=", this.heroNumerics, ", input=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.input, ", keypadNumbers=", this.keypadNumbers, ", keypadTotal=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.keypadTotal, ", label=", this.label, ", labelMedium=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.labelMedium, ", labelSmall=", this.labelSmall, ", labelXSmall=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.labelXSmall, ", largeLabel=", this.largeLabel, ", linkMedium=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.linkMedium, ", linkSmall=", this.linkSmall, ", linkXSmall=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.linkXSmall, ", listNumber=", this.listNumber, ", marketingCardTitleLarge=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.marketingCardTitleLarge, ", marketingCardTitleSmall=", this.marketingCardTitleSmall, ", metaText=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.metaText, ", numeralLarge=", this.numeralLarge, ", numeralSmall=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.numeralSmall, ", pageTitle=", this.pageTitle, ", sectionTitle=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.sectionTitle, ", tabTitle=", this.tabTitle, ", titleBarPageTitle=");
        sb.append(this.titleBarPageTitle);
        sb.append(")");
        return sb.toString();
    }
}
