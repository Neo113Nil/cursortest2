package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FAILURE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class ArcadeLocalImageIcon {
    public static final /* synthetic */ ArcadeLocalImageIcon[] $VALUES;
    public static final ArcadeLocalImageIcon ACTION_REQUIRED;
    public static final ArcadeLocalImageIcon BANK;
    public static final ArcadeLocalImageIcon BITCOIN;
    public static final ArcadeLocalImageIcon BORROW;
    public static final ArcadeLocalImageIcon CALENDAR;
    public static final ArcadeLocalImageIcon CAMERA;
    public static final ArcadeLocalImageIcon CARD;
    public static final ArcadeLocalImageIcon CARD_CHECKMARK;
    public static final ArcadeLocalImageIcon CARD_EXPIRED;
    public static final ArcadeLocalImageIcon CARD_TOP_RIGHT_PLUS;
    public static final ArcadeLocalImageIcon CLEAR;
    public static final ArcadeLocalImageIcon DASH;
    public static final ArcadeLocalImageIcon DECLINED;
    public static final ArcadeLocalImageIcon DEPOSIT;
    public static final ArcadeLocalImageIcon DOCUMENT;
    public static final ArcadeLocalImageIcon ELIGIBILITY_WARNING;
    public static final ArcadeLocalImageIcon ENVELOPE;
    public static final ArcadeLocalImageIcon FAILURE;
    public static final ArcadeLocalImageIcon FAMILY;
    public static final ArcadeLocalImageIcon GLOBE;
    public static final ArcadeLocalImageIcon GOAL;
    public static final ArcadeLocalImageIcon GREEN_EXCLAMATION;
    public static final ArcadeLocalImageIcon INSTANT;
    public static final ArcadeLocalImageIcon INVESTING;
    public static final ArcadeLocalImageIcon INVESTING_ROUND_UPS;
    public static final ArcadeLocalImageIcon LOCATION;
    public static final ArcadeLocalImageIcon LOCKED;
    public static final ArcadeLocalImageIcon LOCK_IN_SHIELD;
    public static final ArcadeLocalImageIcon LOGOMARK;
    public static final ArcadeLocalImageIcon NOTE;
    public static final ArcadeLocalImageIcon PENDING;
    public static final ArcadeLocalImageIcon PERSON;
    public static final ArcadeLocalImageIcon QR_CODE;
    public static final ArcadeLocalImageIcon RECURRING;
    public static final ArcadeLocalImageIcon RECURRING_DOUBLE_ARROW;
    public static final ArcadeLocalImageIcon SAVINGS;
    public static final ArcadeLocalImageIcon SCRIBBLE;
    public static final ArcadeLocalImageIcon SECURITY_WARNING;
    public static final ArcadeLocalImageIcon SUCCESS;
    public static final ArcadeLocalImageIcon UNLOCK;
    public static final ArcadeLocalImageIcon UNSUPPORTED;
    public static final ArcadeLocalImageIcon VERIFICATION;
    public static final ArcadeLocalImageIcon VERIFICATION_FAILED;
    public static final ArcadeLocalImageIcon VERIFYING;
    public static final ArcadeLocalImageIcon WARNING;
    public static final ArcadeLocalImageIcon WIRE;
    public final Icons icon;
    public final ArcadeLocalImageStyle style;

    static {
        ArcadeLocalImageIcon arcadeLocalImageIcon = new ArcadeLocalImageIcon(0, Icons.Instant32, "INSTANT");
        INSTANT = arcadeLocalImageIcon;
        ArcadeLocalImageIcon arcadeLocalImageIcon2 = new ArcadeLocalImageIcon(1, Icons.Check32, "SUCCESS");
        SUCCESS = arcadeLocalImageIcon2;
        Icons icons = Icons.Failed32;
        ArcadeLocalIconBackground arcadeLocalIconBackground = ArcadeLocalIconBackground.DANGER;
        ArcadeLocalImageIcon arcadeLocalImageIcon3 = new ArcadeLocalImageIcon("FAILURE", 2, icons, new ArcadeLocalImageStyle(arcadeLocalIconBackground, 1));
        FAILURE = arcadeLocalImageIcon3;
        ArcadeLocalImageIcon arcadeLocalImageIcon4 = new ArcadeLocalImageIcon(3, Icons.Pending32, "PENDING");
        PENDING = arcadeLocalImageIcon4;
        Icons icons2 = Icons.Alert32;
        ArcadeLocalImageIcon arcadeLocalImageIcon5 = new ArcadeLocalImageIcon("ACTION_REQUIRED", 4, icons2, new ArcadeLocalImageStyle(arcadeLocalIconBackground, 1));
        ACTION_REQUIRED = arcadeLocalImageIcon5;
        ArcadeLocalImageIcon arcadeLocalImageIcon6 = new ArcadeLocalImageIcon(5, Icons.LockLockedFill32, "LOCKED");
        LOCKED = arcadeLocalImageIcon6;
        Icons icons3 = Icons.RecurringAutomatic32;
        ArcadeLocalImageIcon arcadeLocalImageIcon7 = new ArcadeLocalImageIcon(6, icons3, "RECURRING");
        RECURRING = arcadeLocalImageIcon7;
        ArcadeLocalImageIcon arcadeLocalImageIcon8 = new ArcadeLocalImageIcon(7, Icons.Borrow32, "BORROW");
        BORROW = arcadeLocalImageIcon8;
        ArcadeLocalImageIcon arcadeLocalImageIcon9 = new ArcadeLocalImageIcon(8, Icons.Deposit32, "DEPOSIT");
        DEPOSIT = arcadeLocalImageIcon9;
        ArcadeLocalImageIcon arcadeLocalImageIcon10 = new ArcadeLocalImageIcon(9, Icons.SecurityCheckFill32, "VERIFICATION");
        VERIFICATION = arcadeLocalImageIcon10;
        Icons icons4 = Icons.SecurityLockFill32;
        ArcadeLocalImageIcon arcadeLocalImageIcon11 = new ArcadeLocalImageIcon(10, icons4, "VERIFYING");
        VERIFYING = arcadeLocalImageIcon11;
        ArcadeLocalImageIcon arcadeLocalImageIcon12 = new ArcadeLocalImageIcon(11, Icons.DocumentFill32, "DOCUMENT");
        DOCUMENT = arcadeLocalImageIcon12;
        ArcadeLocalImageIcon arcadeLocalImageIcon13 = new ArcadeLocalImageIcon(12, Icons.Draw32, "SCRIBBLE");
        SCRIBBLE = arcadeLocalImageIcon13;
        Icons icons5 = Icons.Qr32;
        ArcadeLocalIconForeground arcadeLocalIconForeground = ArcadeLocalIconForeground.BACKGROUND_APP;
        ArcadeLocalImageIcon arcadeLocalImageIcon14 = new ArcadeLocalImageIcon("QR_CODE", 13, icons5, new ArcadeLocalImageStyle((ArcadeLocalIconBackground) null, 2));
        QR_CODE = arcadeLocalImageIcon14;
        ArcadeLocalImageIcon arcadeLocalImageIcon15 = new ArcadeLocalImageIcon("CARD", 14, Icons.CardBasic32, new ArcadeLocalImageStyle((ArcadeLocalIconBackground) null, 2));
        CARD = arcadeLocalImageIcon15;
        ArcadeLocalImageIcon arcadeLocalImageIcon16 = new ArcadeLocalImageIcon(15, Icons.BankAccount32, "BANK");
        BANK = arcadeLocalImageIcon16;
        ArcadeLocalImageIcon arcadeLocalImageIcon17 = new ArcadeLocalImageIcon("SECURITY_WARNING", 16, icons2, new ArcadeLocalImageStyle(arcadeLocalIconBackground, 1));
        SECURITY_WARNING = arcadeLocalImageIcon17;
        ArcadeLocalImageIcon arcadeLocalImageIcon18 = new ArcadeLocalImageIcon(17, Icons.Date32, "CALENDAR");
        CALENDAR = arcadeLocalImageIcon18;
        ArcadeLocalImageIcon arcadeLocalImageIcon19 = new ArcadeLocalImageIcon(18, Icons.CommEmail32, "ENVELOPE");
        ENVELOPE = arcadeLocalImageIcon19;
        ArcadeLocalImageIcon arcadeLocalImageIcon20 = new ArcadeLocalImageIcon(19, Icons.LogoUsd32, "LOGOMARK");
        LOGOMARK = arcadeLocalImageIcon20;
        ArcadeLocalImageIcon arcadeLocalImageIcon21 = new ArcadeLocalImageIcon(20, Icons.CameraFill32, "CAMERA");
        CAMERA = arcadeLocalImageIcon21;
        ArcadeLocalImageIcon arcadeLocalImageIcon22 = new ArcadeLocalImageIcon("VERIFICATION_FAILED", 21, Icons.SecurityAlertFill32, new ArcadeLocalImageStyle(arcadeLocalIconForeground, arcadeLocalIconBackground));
        VERIFICATION_FAILED = arcadeLocalImageIcon22;
        Icons icons6 = Icons.RoundUps32;
        ArcadeLocalImageIcon arcadeLocalImageIcon23 = new ArcadeLocalImageIcon(22, icons6, "INVESTING_ROUND_UPS");
        INVESTING_ROUND_UPS = arcadeLocalImageIcon23;
        ArcadeLocalImageIcon arcadeLocalImageIcon24 = new ArcadeLocalImageIcon(23, icons6, "INVESTING_ROUND_UPS_INTRO_ILLUSTRATION");
        ArcadeLocalImageIcon arcadeLocalImageIcon25 = new ArcadeLocalImageIcon(24, Icons.LockUnlockedFill32, "UNLOCK");
        UNLOCK = arcadeLocalImageIcon25;
        ArcadeLocalImageIcon arcadeLocalImageIcon26 = new ArcadeLocalImageIcon(25, Icons.Family32, "FAMILY");
        FAMILY = arcadeLocalImageIcon26;
        ArcadeLocalImageIcon arcadeLocalImageIcon27 = new ArcadeLocalImageIcon(26, Icons.AvatarFill32, "PERSON");
        PERSON = arcadeLocalImageIcon27;
        ArcadeLocalImageIcon arcadeLocalImageIcon28 = new ArcadeLocalImageIcon(27, Icons.Investing32, "INVESTING");
        INVESTING = arcadeLocalImageIcon28;
        ArcadeLocalImageIcon arcadeLocalImageIcon29 = new ArcadeLocalImageIcon(28, Icons.SavingsGoal32, "GOAL");
        GOAL = arcadeLocalImageIcon29;
        ArcadeLocalImageIcon arcadeLocalImageIcon30 = new ArcadeLocalImageIcon(29, Icons.TransferWire32, "WIRE");
        WIRE = arcadeLocalImageIcon30;
        ArcadeLocalImageIcon arcadeLocalImageIcon31 = new ArcadeLocalImageIcon(30, Icons.International32, "GLOBE");
        GLOBE = arcadeLocalImageIcon31;
        ArcadeLocalImageIcon arcadeLocalImageIcon32 = new ArcadeLocalImageIcon(31, icons3, "RECURRING_DOUBLE_ARROW");
        RECURRING_DOUBLE_ARROW = arcadeLocalImageIcon32;
        ArcadeLocalImageIcon arcadeLocalImageIcon33 = new ArcadeLocalImageIcon(32, Icons.CardAdd32, "CARD_TOP_RIGHT_PLUS");
        CARD_TOP_RIGHT_PLUS = arcadeLocalImageIcon33;
        ArcadeLocalImageIcon arcadeLocalImageIcon34 = new ArcadeLocalImageIcon(33, Icons.CardActive32, "CARD_CHECKMARK");
        CARD_CHECKMARK = arcadeLocalImageIcon34;
        ArcadeLocalImageIcon arcadeLocalImageIcon35 = new ArcadeLocalImageIcon(34, Icons.CardInactive32, "CARD_EXPIRED");
        CARD_EXPIRED = arcadeLocalImageIcon35;
        ArcadeLocalImageIcon arcadeLocalImageIcon36 = new ArcadeLocalImageIcon(35, Icons.LocationFill32, "LOCATION");
        LOCATION = arcadeLocalImageIcon36;
        ArcadeLocalImageIcon arcadeLocalImageIcon37 = new ArcadeLocalImageIcon(36, Icons.AlertReportedFill32, "WARNING");
        WARNING = arcadeLocalImageIcon37;
        ArcadeLocalImageIcon arcadeLocalImageIcon38 = new ArcadeLocalImageIcon(37, Icons.Block32, "DECLINED");
        DECLINED = arcadeLocalImageIcon38;
        ArcadeLocalImageIcon arcadeLocalImageIcon39 = new ArcadeLocalImageIcon(38, Icons.NotificationsFill32, "BELL");
        ArcadeLocalImageIcon arcadeLocalImageIcon40 = new ArcadeLocalImageIcon("ELIGIBILITY_WARNING", 39, icons2, new ArcadeLocalImageStyle(ArcadeLocalIconBackground.STANDARD, 1));
        ELIGIBILITY_WARNING = arcadeLocalImageIcon40;
        ArcadeLocalImageIcon arcadeLocalImageIcon41 = new ArcadeLocalImageIcon(40, icons4, "LOCK_IN_SHIELD");
        LOCK_IN_SHIELD = arcadeLocalImageIcon41;
        ArcadeLocalImageIcon arcadeLocalImageIcon42 = new ArcadeLocalImageIcon(41, Icons.SubtractFill32, "DASH");
        DASH = arcadeLocalImageIcon42;
        ArcadeLocalImageIcon arcadeLocalImageIcon43 = new ArcadeLocalImageIcon(42, icons2, "GREEN_EXCLAMATION");
        GREEN_EXCLAMATION = arcadeLocalImageIcon43;
        ArcadeLocalImageIcon arcadeLocalImageIcon44 = new ArcadeLocalImageIcon(43, Icons.Note32, "NOTE");
        NOTE = arcadeLocalImageIcon44;
        ArcadeLocalImageIcon arcadeLocalImageIcon45 = new ArcadeLocalImageIcon(44, Icons.Clear32, "CLEAR");
        CLEAR = arcadeLocalImageIcon45;
        ArcadeLocalImageIcon arcadeLocalImageIcon46 = new ArcadeLocalImageIcon(45, Icons.Savings32, "SAVINGS");
        SAVINGS = arcadeLocalImageIcon46;
        ArcadeLocalImageIcon arcadeLocalImageIcon47 = new ArcadeLocalImageIcon(46, Icons.CurrencyBtc32, "BITCOIN");
        BITCOIN = arcadeLocalImageIcon47;
        ArcadeLocalImageIcon arcadeLocalImageIcon48 = new ArcadeLocalImageIcon(47, null, "UNSUPPORTED");
        UNSUPPORTED = arcadeLocalImageIcon48;
        $VALUES = new ArcadeLocalImageIcon[]{arcadeLocalImageIcon, arcadeLocalImageIcon2, arcadeLocalImageIcon3, arcadeLocalImageIcon4, arcadeLocalImageIcon5, arcadeLocalImageIcon6, arcadeLocalImageIcon7, arcadeLocalImageIcon8, arcadeLocalImageIcon9, arcadeLocalImageIcon10, arcadeLocalImageIcon11, arcadeLocalImageIcon12, arcadeLocalImageIcon13, arcadeLocalImageIcon14, arcadeLocalImageIcon15, arcadeLocalImageIcon16, arcadeLocalImageIcon17, arcadeLocalImageIcon18, arcadeLocalImageIcon19, arcadeLocalImageIcon20, arcadeLocalImageIcon21, arcadeLocalImageIcon22, arcadeLocalImageIcon23, arcadeLocalImageIcon24, arcadeLocalImageIcon25, arcadeLocalImageIcon26, arcadeLocalImageIcon27, arcadeLocalImageIcon28, arcadeLocalImageIcon29, arcadeLocalImageIcon30, arcadeLocalImageIcon31, arcadeLocalImageIcon32, arcadeLocalImageIcon33, arcadeLocalImageIcon34, arcadeLocalImageIcon35, arcadeLocalImageIcon36, arcadeLocalImageIcon37, arcadeLocalImageIcon38, arcadeLocalImageIcon39, arcadeLocalImageIcon40, arcadeLocalImageIcon41, arcadeLocalImageIcon42, arcadeLocalImageIcon43, arcadeLocalImageIcon44, arcadeLocalImageIcon45, arcadeLocalImageIcon46, arcadeLocalImageIcon47, arcadeLocalImageIcon48};
    }

    public /* synthetic */ ArcadeLocalImageIcon(int i, Icons icons, String str) {
        this(str, i, icons, new ArcadeLocalImageStyle((ArcadeLocalIconBackground) null, 3));
    }

    public static ArcadeLocalImageIcon valueOf(String str) {
        return (ArcadeLocalImageIcon) Enum.valueOf(ArcadeLocalImageIcon.class, str);
    }

    public static ArcadeLocalImageIcon[] values() {
        return (ArcadeLocalImageIcon[]) $VALUES.clone();
    }

    public final void IconContent(Composer composer, int i) {
        int i2;
        long j;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(196132509);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Icons icons = this.icon;
            if (icons == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Not supported, check if available in MooncakeLargeIcon");
                return;
            }
            ArcadeLocalImageStyle arcadeLocalImageStyle = this.style;
            int ordinal = arcadeLocalImageStyle.foreground.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-372750709);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.inverse;
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-372747673);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.f1047app;
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -372753448, false);
                }
                gapComposer.startReplaceGroup(-372745206);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.icon.subtle;
                gapComposer.end(false);
            }
            int ordinal2 = arcadeLocalImageStyle.background.ordinal();
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(-774923148);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors4.semantic.background.brand;
                gapComposer.end(false);
            } else if (ordinal2 == 1) {
                gapComposer.startReplaceGroup(-774920427);
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors5.semantic.background.danger;
                gapComposer.end(false);
            } else if (ordinal2 == 2) {
                gapComposer.startReplaceGroup(-774917675);
                Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors6.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                if (ordinal2 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -774925926, false);
                }
                gapComposer.startReplaceGroup(-774915049);
                Colors colors7 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors7 == null) {
                    colors7 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors7.semantic.icon.standard;
                gapComposer.end(false);
            }
            ArcadeLocalImageIconKt.m3560ArcadeLocalIconjA1GFJw(icons, null, j, j2, gapComposer, 0, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(this, i, 20);
        }
    }

    public ArcadeLocalImageIcon(String str, int i, Icons icons, ArcadeLocalImageStyle arcadeLocalImageStyle) {
        this.icon = icons;
        this.style = arcadeLocalImageStyle;
    }
}
