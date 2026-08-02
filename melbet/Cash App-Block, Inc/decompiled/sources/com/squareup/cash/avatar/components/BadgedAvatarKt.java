package com.squareup.cash.avatar.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.image.ImageLoadingStatus;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.staticpicker.MoneybotStaticPickerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView$Content$1$1;
import com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BadgedAvatarKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e  */
    /* renamed from: BadgedAvatar-RYf9XWw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3409BadgedAvatarRYf9XWw(Modifier modifier, final String str, String str2, ColorFilter colorFilter, ColorFilter colorFilter2, long j, Character ch, TextStyle textStyle, long j2, Shape shape, final float f, float f2, RealImageLoader realImageLoader, long j3, Function2 function2, Function0 function0, Function2 function22, Alignment alignment, Composer composer, final int i, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        String str3;
        int i6;
        ColorFilter colorFilter3;
        int i7;
        ColorFilter colorFilter4;
        long j4;
        int i8;
        Character ch2;
        TextStyle textStyle2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final float f3;
        final long j5;
        final Function2 function23;
        final Function0 function02;
        final Function2 function24;
        final Alignment alignment2;
        GapComposer gapComposer;
        final ColorFilter colorFilter5;
        final TextStyle textStyle3;
        final Modifier modifier3;
        final ColorFilter colorFilter6;
        final long j6;
        final Character ch3;
        final String str4;
        final long j7;
        final Shape shape2;
        final RealImageLoader realImageLoader2;
        RecomposeScopeImpl endRestartGroup;
        String str5;
        RoundedCornerShape roundedCornerShape;
        long j8;
        final String str6;
        final Alignment alignment3;
        final ColorFilter colorFilter7;
        final TextStyle textStyle4;
        final RealImageLoader realImageLoader3;
        final Function2 function25;
        final ColorFilter colorFilter8;
        final Function0 function03;
        final Function2 function26;
        final long j9;
        final long j10;
        final Modifier modifier4;
        final Character ch4;
        final long j11;
        final Shape shape3;
        final float f4;
        int i20;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(621720342);
        int i21 = i4 & 1;
        if (i21 != 0) {
            i5 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i5 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i5 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i5 |= gapComposer2.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(str2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                colorFilter3 = colorFilter;
                i5 |= gapComposer2.changed(colorFilter3) ? 2048 : 1024;
                i7 = i4 & 16;
                int i23 = PKIFailureInfo.certRevoked;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i & 24576) == 0) {
                    colorFilter4 = colorFilter2;
                    i5 |= gapComposer2.changed(colorFilter4) ? 16384 : 8192;
                    if ((i & 196608) != 0) {
                        j4 = j;
                        i5 |= ((i4 & 32) == 0 && gapComposer2.changed(j4)) ? 131072 : 65536;
                    } else {
                        j4 = j;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                        ch2 = ch;
                    } else {
                        ch2 = ch;
                        if ((i & 1572864) == 0) {
                            i5 |= gapComposer2.changed(ch2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) != 0) {
                        if ((i4 & 128) == 0) {
                            textStyle2 = textStyle;
                            if (gapComposer2.changed(textStyle2)) {
                                i20 = 8388608;
                                i5 |= i20;
                            }
                        } else {
                            textStyle2 = textStyle;
                        }
                        i20 = 4194304;
                        i5 |= i20;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i9 = i5 | 100663296;
                    if ((i & 805306368) == 0) {
                        i9 = i5 | 369098752;
                    }
                    i10 = i2 | 54;
                    if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i10 |= gapComposer2.changed(f) ? 256 : 128;
                    }
                    i11 = i4 & PKIFailureInfo.certRevoked;
                    if (i11 == 0) {
                        i10 |= 3072;
                        i12 = i11;
                    } else {
                        i12 = i11;
                        if ((i2 & 3072) == 0) {
                            i10 |= gapComposer2.changed(f2) ? 2048 : 1024;
                            i13 = i4 & 16384;
                            if (i13 != 0) {
                                i10 |= 24576;
                                i14 = i13;
                            } else {
                                i14 = i13;
                                if ((i2 & 24576) == 0) {
                                    if (gapComposer2.changedInstance(realImageLoader)) {
                                        i23 = 16384;
                                    }
                                    i10 |= i23;
                                    if ((i2 & 196608) == 0) {
                                        i10 |= ((i4 & 32768) == 0 && gapComposer2.changed(j3)) ? 131072 : 65536;
                                    }
                                    i15 = i4 & 65536;
                                    if (i15 == 0) {
                                        i10 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i10 |= gapComposer2.changedInstance(function2) ? 1048576 : 524288;
                                    }
                                    i16 = i4 & PKIFailureInfo.unsupportedVersion;
                                    if (i16 == 0) {
                                        i10 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i10 |= gapComposer2.changedInstance(function0) ? 8388608 : 4194304;
                                    }
                                    if ((i4 & PKIFailureInfo.transactionIdInUse) == 0) {
                                        i10 |= 100663296;
                                    } else if ((i2 & 100663296) == 0) {
                                        i10 |= gapComposer2.changedInstance(null) ? 67108864 : 33554432;
                                    }
                                    i17 = i4 & PKIFailureInfo.signerNotTrusted;
                                    if (i17 == 0) {
                                        i10 |= 805306368;
                                    } else if ((i2 & 805306368) == 0) {
                                        i10 |= gapComposer2.changedInstance(function22) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                    }
                                    i18 = i4 & PKIFailureInfo.badCertTemplate;
                                    if (i18 == 0) {
                                        i19 = 6;
                                    } else if ((i3 & 6) == 0) {
                                        i19 = i3 | (gapComposer2.changed(alignment) ? 4 : 2);
                                    } else {
                                        i19 = i3;
                                    }
                                    if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
                                        gapComposer2.skipToGroupEnd();
                                        f3 = f2;
                                        j5 = j3;
                                        function23 = function2;
                                        function02 = function0;
                                        function24 = function22;
                                        alignment2 = alignment;
                                        gapComposer = gapComposer2;
                                        colorFilter5 = colorFilter3;
                                        textStyle3 = textStyle2;
                                        modifier3 = modifier2;
                                        colorFilter6 = colorFilter4;
                                        j6 = j4;
                                        ch3 = ch2;
                                        str4 = str2;
                                        j7 = j2;
                                        shape2 = shape;
                                        realImageLoader2 = realImageLoader;
                                    } else {
                                        gapComposer2.startDefaults();
                                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                            if (i21 != 0) {
                                                modifier2 = Modifier.Companion.$$INSTANCE;
                                            }
                                            String str7 = i22 != 0 ? "" : str2;
                                            if (i6 != 0) {
                                                colorFilter3 = null;
                                            }
                                            if (i7 != 0) {
                                                colorFilter4 = null;
                                            }
                                            if ((i4 & 32) != 0) {
                                                j4 = MooncakeTheme.getColors(gapComposer2).placeholderBackground;
                                            }
                                            if (i8 != 0) {
                                                ch2 = null;
                                            }
                                            if ((i4 & 128) != 0) {
                                                MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
                                                if (mooncakeTypography == null) {
                                                    mooncakeTypography = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                                                }
                                                textStyle2 = mooncakeTypography.header4;
                                            }
                                            long sp = Room.getSp(12);
                                            RoundedCornerShape roundedCornerShape2 = RoundedCornerShapeKt.CircleShape;
                                            float f5 = i12 != 0 ? 4.0f : f2;
                                            RealImageLoader realImageLoader4 = i14 != 0 ? null : realImageLoader;
                                            if ((i4 & 32768) != 0) {
                                                str5 = str7;
                                                roundedCornerShape = roundedCornerShape2;
                                                j8 = MooncakeTheme.getColors(gapComposer2).placeholderBackground;
                                            } else {
                                                str5 = str7;
                                                roundedCornerShape = roundedCornerShape2;
                                                j8 = j3;
                                            }
                                            Function2 function27 = i15 != 0 ? null : function2;
                                            Function0 function04 = i16 != 0 ? null : function0;
                                            Function2 function28 = i17 != 0 ? null : function22;
                                            if (i18 != 0) {
                                                str6 = str5;
                                                colorFilter7 = colorFilter3;
                                                textStyle4 = textStyle2;
                                                realImageLoader3 = realImageLoader4;
                                                function25 = function27;
                                                colorFilter8 = colorFilter4;
                                                function03 = function04;
                                                alignment3 = Alignment.Companion.BottomEnd;
                                            } else {
                                                str6 = str5;
                                                alignment3 = alignment;
                                                colorFilter7 = colorFilter3;
                                                textStyle4 = textStyle2;
                                                realImageLoader3 = realImageLoader4;
                                                function25 = function27;
                                                colorFilter8 = colorFilter4;
                                                function03 = function04;
                                            }
                                            function26 = function28;
                                            j9 = sp;
                                            j10 = j8;
                                            modifier4 = modifier2;
                                            ch4 = ch2;
                                            j11 = j4;
                                            shape3 = roundedCornerShape;
                                            f4 = f5;
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                            str6 = str2;
                                            j9 = j2;
                                            realImageLoader3 = realImageLoader;
                                            j10 = j3;
                                            function25 = function2;
                                            function03 = function0;
                                            function26 = function22;
                                            alignment3 = alignment;
                                            colorFilter7 = colorFilter3;
                                            textStyle4 = textStyle2;
                                            colorFilter8 = colorFilter4;
                                            ch4 = ch2;
                                            modifier4 = modifier2;
                                            j11 = j4;
                                            shape3 = shape;
                                            f4 = f2;
                                        }
                                        gapComposer2.endDefaults();
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        if (rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = Updater.mutableStateOf$default(ImageLoadingStatus.Unloaded.INSTANCE);
                                            gapComposer2.updateRememberedValue(rememberedValue);
                                        }
                                        final MutableState mutableState = (MutableState) rememberedValue;
                                        final String str8 = str3;
                                        ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(2108799185, new Function2() { // from class: com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda0
                                            /* JADX WARN: Removed duplicated region for block: B:36:0x026a  */
                                            /* JADX WARN: Removed duplicated region for block: B:45:0x02b4  */
                                            @Override // kotlin.jvm.functions.Function2
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final Object invoke(Object obj, Object obj2) {
                                                BiasAlignment biasAlignment;
                                                Integer num;
                                                String str9;
                                                Modifier.Companion companion;
                                                NeverEqualPolicy neverEqualPolicy;
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
                                                boolean z;
                                                Modifier modifier5;
                                                BadgedAvatarKt$$ExternalSyntheticLambda0 badgedAvatarKt$$ExternalSyntheticLambda0;
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
                                                boolean z2;
                                                Integer num2;
                                                Function2 function29;
                                                boolean z3;
                                                Composer composer2 = (Composer) obj;
                                                int intValue = ((Integer) obj2).intValue();
                                                GapComposer gapComposer3 = (GapComposer) composer2;
                                                boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2);
                                                Applier applier = gapComposer3.applier;
                                                if (shouldExecute) {
                                                    BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                                                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, Modifier.this);
                                                    ComposeUiNode.Companion.getClass();
                                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                    if (applier == null) {
                                                        Updater.invalidApplier();
                                                        throw null;
                                                    }
                                                    gapComposer3.startReusableNode();
                                                    if (gapComposer3.inserting) {
                                                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                                                    } else {
                                                        gapComposer3.useNode();
                                                    }
                                                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                                                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                                                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                                                    Integer valueOf = Integer.valueOf(hashCode);
                                                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
                                                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                                                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
                                                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                    Modifier clip = ClipKt.clip(SpacerKt.m298padding3ABfNKs(companion2, f4), shape3);
                                                    float f6 = f;
                                                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(clip, f6), j11, ColorKt.RectangleShape);
                                                    String str10 = str6;
                                                    boolean changed = gapComposer3.changed(str10);
                                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                                    if (changed || rememberedValue2 == neverEqualPolicy2) {
                                                        rememberedValue2 = new BadgeKt$$ExternalSyntheticLambda3(str10, 5);
                                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                                    }
                                                    Modifier then = SemanticsModifierKt.clearAndSetSemantics(m177backgroundbw27NRU, (Function1) rememberedValue2).then(companion2);
                                                    Function0 function05 = function03;
                                                    if (function05 != null) {
                                                        gapComposer3.startReplaceGroup(-1441956578);
                                                        Object rememberedValue3 = gapComposer3.rememberedValue();
                                                        if (rememberedValue3 == neverEqualPolicy2) {
                                                            rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                                                        }
                                                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                                                        biasAlignment = biasAlignment2;
                                                        num = 0;
                                                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                                                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                                        neverEqualPolicy = neverEqualPolicy2;
                                                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                                                        str9 = str10;
                                                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, f6, null, gapComposer3, 48, 9);
                                                        boolean changed2 = gapComposer3.changed(function05);
                                                        Object rememberedValue4 = gapComposer3.rememberedValue();
                                                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                                            rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda10(3, function05);
                                                            gapComposer3.updateRememberedValue(rememberedValue4);
                                                        }
                                                        modifier5 = ImageKt.m182clickableO2vRcR0$default(companion2, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue4, 28);
                                                        companion = companion2;
                                                        z = false;
                                                        gapComposer3.end(false);
                                                    } else {
                                                        biasAlignment = biasAlignment2;
                                                        num = 0;
                                                        str9 = str10;
                                                        companion = companion2;
                                                        neverEqualPolicy = neverEqualPolicy2;
                                                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                                                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                                                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                                        z = false;
                                                        gapComposer3.startReplaceGroup(-1441295007);
                                                        gapComposer3.end(false);
                                                        modifier5 = companion;
                                                    }
                                                    Modifier then2 = then.then(modifier5);
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                                                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, then2);
                                                    gapComposer3.startReusableNode();
                                                    if (gapComposer3.inserting) {
                                                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                                    } else {
                                                        gapComposer3.useNode();
                                                    }
                                                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
                                                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$12, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
                                                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                                                    String str11 = str8;
                                                    Character ch5 = ch4;
                                                    long j12 = j10;
                                                    TextStyle textStyle5 = textStyle4;
                                                    long j13 = j9;
                                                    Function2 function210 = function25;
                                                    ColorFilter colorFilter9 = colorFilter8;
                                                    if (str11 != null) {
                                                        gapComposer3.startReplaceGroup(-272320864);
                                                        int m3477toPx8Feqmps = (int) DensityUtilsKt.m3477toPx8Feqmps(f6, gapComposer3);
                                                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                                        BadgedAvatarKt$$ExternalSyntheticLambda4 badgedAvatarKt$$ExternalSyntheticLambda4 = new BadgedAvatarKt$$ExternalSyntheticLambda4(m3477toPx8Feqmps, realImageLoader3, 0);
                                                        Object rememberedValue5 = gapComposer3.rememberedValue();
                                                        if (rememberedValue5 == neverEqualPolicy) {
                                                            rememberedValue5 = new CashCardKt$$ExternalSyntheticLambda0(5, mutableState);
                                                            gapComposer3.updateRememberedValue(rememberedValue5);
                                                        }
                                                        badgedAvatarKt$$ExternalSyntheticLambda0 = this;
                                                        zzmn.m2026FoundationRemoteImageNXws8ko(badgedAvatarKt$$ExternalSyntheticLambda4, str11, fillMaxSize, null, ContentScale.Companion.Crop, str9, (Function1) rememberedValue5, colorFilter7, null, null, null, Expect_jvmKt.rememberComposableLambda(106372052, new FloatingActionButtonKt$$ExternalSyntheticLambda0(ch5, j12, textStyle5, j13, function210, colorFilter9), gapComposer3), gapComposer3, 1597824, 48, 1800);
                                                        gapComposer3 = gapComposer3;
                                                        gapComposer3.end(false);
                                                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                                                        z2 = false;
                                                    } else {
                                                        badgedAvatarKt$$ExternalSyntheticLambda0 = this;
                                                        if (ch5 != null) {
                                                            gapComposer3.startReplaceGroup(-2086949045);
                                                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                                                            z2 = false;
                                                            BadgedAvatarKt.m3410MonogramIDZO9PQ(SizeKt.fillMaxSize(companion, 1.0f), j12, ch5.charValue(), textStyle5, j13, gapComposer3, 6);
                                                            gapComposer3 = gapComposer3;
                                                            gapComposer3.end(false);
                                                        } else {
                                                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                                                            z2 = false;
                                                            gapComposer3.startReplaceGroup(-2086939540);
                                                            if (function210 == null) {
                                                                gapComposer3.startReplaceGroup(-2086938736);
                                                                BadgedAvatarKt.DefaultAvatar(null, colorFilter9, gapComposer3, 0);
                                                                gapComposer3.end(false);
                                                                num2 = num;
                                                            } else {
                                                                gapComposer3.startReplaceGroup(-2086936564);
                                                                num2 = num;
                                                                function210.invoke(gapComposer3, num2);
                                                                gapComposer3.end(false);
                                                            }
                                                            gapComposer3.end(false);
                                                            gapComposer3.end(true);
                                                            function29 = function26;
                                                            if (function29 == null) {
                                                                gapComposer3.startReplaceGroup(-1439229167);
                                                                Modifier align = BoxScopeInstance.INSTANCE.align(companion, alignment3);
                                                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                                                                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, align);
                                                                gapComposer3.startReusableNode();
                                                                if (gapComposer3.inserting) {
                                                                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                                                } else {
                                                                    gapComposer3.useNode();
                                                                }
                                                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
                                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$15);
                                                                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$12, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$13);
                                                                function29.invoke(gapComposer3, num2);
                                                                z3 = true;
                                                                gapComposer3.end(true);
                                                                gapComposer3.end(false);
                                                            } else {
                                                                z3 = true;
                                                                gapComposer3.startReplaceGroup(-1439142677);
                                                                gapComposer3.end(z2);
                                                            }
                                                            gapComposer3.end(z3);
                                                        }
                                                    }
                                                    num2 = num;
                                                    gapComposer3.end(true);
                                                    function29 = function26;
                                                    if (function29 == null) {
                                                    }
                                                    gapComposer3.end(z3);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer2), gapComposer2, 6);
                                        gapComposer = gapComposer2;
                                        modifier3 = modifier4;
                                        f3 = f4;
                                        shape2 = shape3;
                                        j6 = j11;
                                        str4 = str6;
                                        alignment2 = alignment3;
                                        colorFilter5 = colorFilter7;
                                        ch3 = ch4;
                                        j5 = j10;
                                        textStyle3 = textStyle4;
                                        j7 = j9;
                                        colorFilter6 = colorFilter8;
                                        realImageLoader2 = realImageLoader3;
                                        function24 = function26;
                                        function02 = function03;
                                        function23 = function25;
                                    }
                                    endRestartGroup = gapComposer.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                                int updateChangedFlags3 = Updater.updateChangedFlags(i3);
                                                BadgedAvatarKt.m3409BadgedAvatarRYf9XWw(Modifier.this, str, str4, colorFilter5, colorFilter6, j6, ch3, textStyle3, j7, shape2, f, f3, realImageLoader2, j5, function23, function02, function24, alignment2, (Composer) obj, updateChangedFlags, updateChangedFlags2, updateChangedFlags3, i4);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((i2 & 196608) == 0) {
                            }
                            i15 = i4 & 65536;
                            if (i15 == 0) {
                            }
                            i16 = i4 & PKIFailureInfo.unsupportedVersion;
                            if (i16 == 0) {
                            }
                            if ((i4 & PKIFailureInfo.transactionIdInUse) == 0) {
                            }
                            i17 = i4 & PKIFailureInfo.signerNotTrusted;
                            if (i17 == 0) {
                            }
                            i18 = i4 & PKIFailureInfo.badCertTemplate;
                            if (i18 == 0) {
                            }
                            if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                    }
                    i13 = i4 & 16384;
                    if (i13 != 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    i15 = i4 & 65536;
                    if (i15 == 0) {
                    }
                    i16 = i4 & PKIFailureInfo.unsupportedVersion;
                    if (i16 == 0) {
                    }
                    if ((i4 & PKIFailureInfo.transactionIdInUse) == 0) {
                    }
                    i17 = i4 & PKIFailureInfo.signerNotTrusted;
                    if (i17 == 0) {
                    }
                    i18 = i4 & PKIFailureInfo.badCertTemplate;
                    if (i18 == 0) {
                    }
                    if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                colorFilter4 = colorFilter2;
                if ((i & 196608) != 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i9 = i5 | 100663296;
                if ((i & 805306368) == 0) {
                }
                i10 = i2 | 54;
                if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                }
                i11 = i4 & PKIFailureInfo.certRevoked;
                if (i11 == 0) {
                }
                i13 = i4 & 16384;
                if (i13 != 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                i15 = i4 & 65536;
                if (i15 == 0) {
                }
                i16 = i4 & PKIFailureInfo.unsupportedVersion;
                if (i16 == 0) {
                }
                if ((i4 & PKIFailureInfo.transactionIdInUse) == 0) {
                }
                i17 = i4 & PKIFailureInfo.signerNotTrusted;
                if (i17 == 0) {
                }
                i18 = i4 & PKIFailureInfo.badCertTemplate;
                if (i18 == 0) {
                }
                if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            colorFilter3 = colorFilter;
            i7 = i4 & 16;
            int i232 = PKIFailureInfo.certRevoked;
            if (i7 != 0) {
            }
            colorFilter4 = colorFilter2;
            if ((i & 196608) != 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i9 = i5 | 100663296;
            if ((i & 805306368) == 0) {
            }
            i10 = i2 | 54;
            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            }
            i11 = i4 & PKIFailureInfo.certRevoked;
            if (i11 == 0) {
            }
            i13 = i4 & 16384;
            if (i13 != 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i15 = i4 & 65536;
            if (i15 == 0) {
            }
            i16 = i4 & PKIFailureInfo.unsupportedVersion;
            if (i16 == 0) {
            }
            if ((i4 & PKIFailureInfo.transactionIdInUse) == 0) {
            }
            i17 = i4 & PKIFailureInfo.signerNotTrusted;
            if (i17 == 0) {
            }
            i18 = i4 & PKIFailureInfo.badCertTemplate;
            if (i18 == 0) {
            }
            if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        colorFilter3 = colorFilter;
        i7 = i4 & 16;
        int i2322 = PKIFailureInfo.certRevoked;
        if (i7 != 0) {
        }
        colorFilter4 = colorFilter2;
        if ((i & 196608) != 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i9 = i5 | 100663296;
        if ((i & 805306368) == 0) {
        }
        i10 = i2 | 54;
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i11 = i4 & PKIFailureInfo.certRevoked;
        if (i11 == 0) {
        }
        i13 = i4 & 16384;
        if (i13 != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i15 = i4 & 65536;
        if (i15 == 0) {
        }
        i16 = i4 & PKIFailureInfo.unsupportedVersion;
        if (i16 == 0) {
        }
        if ((i4 & PKIFailureInfo.transactionIdInUse) == 0) {
        }
        i17 = i4 & PKIFailureInfo.signerNotTrusted;
        if (i17 == 0) {
        }
        i18 = i4 & PKIFailureInfo.badCertTemplate;
        if (i18 == 0) {
        }
        if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DefaultAvatar(Modifier modifier, ColorFilter colorFilter, Composer composer, int i) {
        ColorFilter colorFilter2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(98155815);
        int i2 = i | 6 | (gapComposer.changed(colorFilter) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            colorFilter2 = colorFilter;
            ImageKt.Image(Countries.painterResource(R.drawable.avatar_generic, 0, gapComposer), Room.stringResource(gapComposer, R.string.placeholder_avatar), SizeKt.fillMaxSize(companion, 1.0f), null, null, RecyclerView.DECELERATION_RATE, colorFilter2, gapComposer, Painter.$stable | ((i2 << 15) & 3670016), 56);
            modifier = companion;
        } else {
            colorFilter2 = colorFilter;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(modifier, (Object) colorFilter2, i, 9);
        }
    }

    public static final long GridItemSpan(int i) {
        if (!(i > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The span value should be higher than 0");
        }
        return i;
    }

    public static final void MoneybotStaticPickerView(MoneybotStaticPickerViewModel moneybotStaticPickerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        moneybotStaticPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(29154875);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotStaticPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 3;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new ChatFailedDeliverySheetView$Content$1$1(delegatingSoftwareKeyboardController, null, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            boolean z2 = i5 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new MusicViewKt$$ExternalSyntheticLambda0(10, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1067801262, new MoneybotStaticPickerViewKt$$ExternalSyntheticLambda2(moneybotStaticPickerViewModel, function1, i3), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(moneybotStaticPickerViewModel, function1, i, i4);
        }
    }

    /* renamed from: Monogram-IDZO9PQ, reason: not valid java name */
    public static final void m3410MonogramIDZO9PQ(final Modifier modifier, final long j, final char c, final TextStyle textStyle, final long j2, Composer composer, final int i) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-903769226);
        int i2 = i | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(c) ? 256 : 128) | (gapComposer.changed(textStyle) ? 2048 : 1024) | (gapComposer.changed(j2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            wrapContentHeight = SizeKt.wrapContentHeight(ImageKt.m177backgroundbw27NRU(modifier, j, ColorKt.RectangleShape), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            KeypadKt.m3639AutoScaleTextgQjefEo(String.valueOf(c), wrapContentHeight, textStyle, MooncakeTheme.getColors(gapComposer).primaryButtonTint, 0, 3, j2, 0, gapComposer, ((i2 >> 3) & 896) | ((i2 << 6) & 3670016), 144);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(j, c, textStyle, j2, i) { // from class: com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda8
                public final /* synthetic */ long f$1;
                public final /* synthetic */ char f$2;
                public final /* synthetic */ TextStyle f$3;
                public final /* synthetic */ long f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(7);
                    BadgedAvatarKt.m3410MonogramIDZO9PQ(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void PickerOptionRow(MoneybotStaticPickerViewModel.Option option, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1009349408);
        int i2 = (gapComposer.changedInstance(option) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1663988580, new SuggestionUiKt$$ExternalSyntheticLambda8(option, 12), gapComposer);
            String str = option.subtitle;
            int i5 = 17;
            if (str == null) {
                gapComposer.startReplaceGroup(-461932197);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-461932196);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1602643847, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i5), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
            CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(option.selected);
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(option);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(i5, function1, option);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            final MoneybotStaticPickerViewModel.Icon icon = option.icon;
            boolean z = icon instanceof MoneybotStaticPickerViewModel.Icon.Avatar;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-461632519);
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1823000710, new Function2() { // from class: com.squareup.cash.moneybot.views.staticpicker.MoneybotStaticPickerViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i3;
                        MoneybotStaticPickerViewModel.Icon icon2 = icon;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(((MoneybotStaticPickerViewModel.Icon.Avatar) icon2).avatar, null, gapComposer2, 1), null, false, gapComposer2, 6, 28);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f);
                                    SavingsGoalIcon savingsGoalIcon = ((MoneybotStaticPickerViewModel.Icon.SavingsGoalIcon) icon2).savingsGoalIcon;
                                    VisibleKt.m3496ProgressEmojiIconLzaahlw(savingsGoalIcon.icon_id, savingsGoalIcon.progress, m285size3ABfNKs, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer3, MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), rememberComposableLambda2, SizeKt.fillMaxWidth(companion, 1.0f), function0, null, option.enabled, false, composableLambdaImpl, null, radio, 0L, null, gapComposer, 438, 0, 3408);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (icon instanceof MoneybotStaticPickerViewModel.Icon.SavingsGoalIcon) {
                gapComposer.startReplaceGroup(-461227690);
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(670342653, new Function2() { // from class: com.squareup.cash.moneybot.views.staticpicker.MoneybotStaticPickerViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        MoneybotStaticPickerViewModel.Icon icon2 = icon;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(((MoneybotStaticPickerViewModel.Icon.Avatar) icon2).avatar, null, gapComposer2, 1), null, false, gapComposer2, 6, 28);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f);
                                    SavingsGoalIcon savingsGoalIcon = ((MoneybotStaticPickerViewModel.Icon.SavingsGoalIcon) icon2).savingsGoalIcon;
                                    VisibleKt.m3496ProgressEmojiIconLzaahlw(savingsGoalIcon.icon_id, savingsGoalIcon.progress, m285size3ABfNKs, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer3, MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), rememberComposableLambda2, SizeKt.fillMaxWidth(companion, 1.0f), function0, null, option.enabled, false, composableLambdaImpl, null, radio, 0L, null, gapComposer, 438, 0, 3408);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (icon != null) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 677843184, false);
                }
                gapComposer.startReplaceGroup(-460783212);
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, SizeKt.fillMaxWidth(companion, 1.0f), function0, option.enabled, false, composableLambdaImpl, null, 0L, radio, null, gapComposer, 54, 1448);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(option, function1, i, 11);
        }
    }
}
