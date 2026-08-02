package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScopeKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.text.AutoScaleTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.feedback.MoneybotFeedbackViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.views.feedback.MoneybotFeedbackViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.views.feedback.MoneybotFeedbackViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.squareup.util.Strings;
import com.squareup.workflow1.Snapshots;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzacn {
    /* JADX WARN: Removed duplicated region for block: B:131:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: AutoScaleText-ZL-omxE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2012AutoScaleTextZLomxE(int i, int i2, int i3, int i4, int i5, long j, long j2, Composer composer, Modifier modifier, TextStyle textStyle, String str, Function1 function1) {
        int i6;
        TextStyle textStyle2;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        long j4;
        int i11;
        int i12;
        int i13;
        int i14;
        GapComposer gapComposer;
        Modifier modifier2;
        TextStyle textStyle3;
        long j5;
        int i15;
        int i16;
        long j6;
        int i17;
        Function1 function12;
        RecomposeScopeImpl endRestartGroup;
        int i18;
        long j7;
        long j8;
        Function1 function13;
        Modifier modifier3;
        int i19;
        long j9;
        int i20;
        long m996getColor0d7_KjU;
        int i21;
        int i22;
        int i23;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(987167162);
        if ((i4 & 6) == 0) {
            i6 = (gapComposer2.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i24 = i5 & 2;
        if (i24 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= gapComposer2.changed(modifier) ? 32 : 16;
            if ((i4 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i5 & 4) == 0) {
                    textStyle2 = textStyle;
                    if (gapComposer2.changed(textStyle2)) {
                        i23 = 256;
                        i6 |= i23;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i23 = 128;
                i6 |= i23;
            } else {
                textStyle2 = textStyle;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i4 & 3072) == 0) {
                j3 = j;
                i6 |= gapComposer2.changed(j3) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    i9 = i;
                    i6 |= gapComposer2.changed(i9) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i4) != 0) {
                        if ((i5 & 32) == 0) {
                            i10 = i2;
                            if (gapComposer2.changed(i10)) {
                                i22 = PKIFailureInfo.unsupportedVersion;
                                i6 |= i22;
                            }
                        } else {
                            i10 = i2;
                        }
                        i22 = 65536;
                        i6 |= i22;
                    } else {
                        i10 = i2;
                    }
                    if ((1572864 & i4) != 0) {
                        if ((i5 & 64) == 0) {
                            j4 = j2;
                            if (gapComposer2.changed(j4)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                                i6 |= i21;
                            }
                        } else {
                            j4 = j2;
                        }
                        i21 = PKIFailureInfo.signerNotTrusted;
                        i6 |= i21;
                    } else {
                        j4 = j2;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        i12 = i11;
                        i6 |= gapComposer2.changed(i3) ? 8388608 : 4194304;
                        i13 = i5 & 256;
                        if (i13 != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            i14 = i13;
                            i6 |= gapComposer2.changedInstance(function1) ? 67108864 : 33554432;
                            if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                                gapComposer = gapComposer2;
                                gapComposer.skipToGroupEnd();
                                modifier2 = modifier;
                                textStyle3 = textStyle2;
                                j5 = j3;
                                i15 = i9;
                                i16 = i10;
                                j6 = j4;
                                i17 = i3;
                                function12 = function1;
                            } else {
                                gapComposer2.startDefaults();
                                if ((i4 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                    Modifier modifier4 = i24 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                                    if ((i5 & 4) != 0) {
                                        textStyle2 = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                                        if (textStyle2 == null) {
                                            gapComposer2.startReplaceGroup(-1100573765);
                                            textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                            gapComposer2.end(false);
                                            i18 = -3670017;
                                        } else {
                                            i18 = -3670017;
                                            gapComposer2.startReplaceGroup(-1100574912);
                                            gapComposer2.end(false);
                                        }
                                        i6 &= -897;
                                    } else {
                                        i18 = -3670017;
                                    }
                                    j7 = i7 != 0 ? Color.Unspecified : j3;
                                    int i25 = i8 != 0 ? Integer.MAX_VALUE : i9;
                                    if ((i5 & 32) != 0) {
                                        i6 &= -458753;
                                        i10 = 0;
                                    }
                                    if ((i5 & 64) != 0) {
                                        j8 = Snapshots.getNotScaledUp(textStyle2.spanStyle.fontSize, gapComposer2);
                                        i6 &= i18;
                                    } else {
                                        j8 = j4;
                                    }
                                    int i26 = i12 == 0 ? i3 : 1;
                                    if (i14 != 0) {
                                        modifier3 = modifier4;
                                        i19 = i25;
                                        j9 = j8;
                                        i20 = i26;
                                        function13 = null;
                                    } else {
                                        function13 = function1;
                                        modifier3 = modifier4;
                                        i19 = i25;
                                        j9 = j8;
                                        i20 = i26;
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    if ((i5 & 4) != 0) {
                                        i6 &= -897;
                                    }
                                    if ((i5 & 32) != 0) {
                                        i6 &= -458753;
                                    }
                                    if ((i5 & 64) != 0) {
                                        i6 &= -3670017;
                                    }
                                    i20 = i3;
                                    modifier3 = modifier;
                                    function13 = function1;
                                    j7 = j3;
                                    j9 = j4;
                                    i19 = i9;
                                }
                                gapComposer2.endDefaults();
                                gapComposer2.startReplaceGroup(-520113664);
                                if (j7 != 16) {
                                    m996getColor0d7_KjU = j7;
                                } else {
                                    gapComposer2.startReplaceGroup(-520112891);
                                    m996getColor0d7_KjU = textStyle2.m996getColor0d7_KjU();
                                    if (m996getColor0d7_KjU == 16) {
                                        gapComposer2.startReplaceGroup(1044898235);
                                        long j10 = ((Color) gapComposer2.consume(ArcadeThemeKt.LocalTextColor)).value;
                                        if (j10 == 16) {
                                            j10 = Strings.getColors(gapComposer2).semantic.text.standard;
                                        }
                                        m996getColor0d7_KjU = j10;
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(false);
                                TextAlign textAlign = new TextAlign(i10);
                                if (i10 == 0) {
                                    textAlign = null;
                                }
                                if (textAlign == null) {
                                    gapComposer2.startReplaceGroup(-520107100);
                                    Object consume = gapComposer2.consume(ArcadeThemeKt.LocalTextAlign);
                                    textAlign = (TextAlign) (((TextAlign) consume).value != 0 ? consume : null);
                                } else {
                                    gapComposer2.startReplaceGroup(-520109797);
                                }
                                gapComposer2.end(false);
                                gapComposer = gapComposer2;
                                TextStyle textStyle4 = textStyle2;
                                Snapshots.m4002FoundationAutoScaleTextZLomxE(i19, textAlign != null ? textAlign.value : textStyle2.paragraphStyle.textAlign, i20, (i6 & 14) | ((i6 >> 3) & 112) | ((i6 << 3) & 896) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), 0, m996getColor0d7_KjU, j9, gapComposer, modifier3, textStyle4, str, function13);
                                j5 = j7;
                                i16 = i10;
                                i15 = i19;
                                i17 = i20;
                                j6 = j9;
                                modifier2 = modifier3;
                                textStyle3 = textStyle4;
                                function12 = function13;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new AutoScaleTextKt$$ExternalSyntheticLambda0(str, modifier2, textStyle3, j5, i15, i16, j6, i17, function12, i4, i5);
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i5 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i;
                if ((196608 & i4) != 0) {
                }
                if ((1572864 & i4) != 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5 & 256;
                if (i13 != 0) {
                }
                i14 = i13;
                if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j3 = j;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i;
            if ((196608 & i4) != 0) {
            }
            if ((1572864 & i4) != 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i13;
            if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        j3 = j;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i;
        if ((196608 & i4) != 0) {
        }
        if ((1572864 & i4) != 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i13;
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DisclaimerText(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1869647001);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShiftListViewKt$$ExternalSyntheticLambda8(5, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function2 function2 = (Function2) rememberedValue;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, function2, modifier, textStyle, colors.semantic.text.subtle, null, null, null, 0, 0, 0, gapComposer, (i2 & 14) | ((i2 << 3) & 896), 2016);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda1(str, modifier, function0, i);
        }
    }

    public static final void FeedbackOptionDropdown(MoneybotFeedbackViewModel moneybotFeedbackViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1176730298);
        int i2 = i | (gapComposer.changedInstance(moneybotFeedbackViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DropdownState rememberDropdownState = InputChipKt.rememberDropdownState(gapComposer);
            MoneybotFeedbackOption moneybotFeedbackOption = moneybotFeedbackViewModel.selectedOption;
            List list = moneybotFeedbackViewModel.options;
            boolean changed = gapComposer.changed(moneybotFeedbackOption) | gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((MoneybotFeedbackViewModel.ReasonOption) obj).option, moneybotFeedbackViewModel.selectedOption)) {
                            break;
                        }
                    }
                }
                MoneybotFeedbackViewModel.ReasonOption reasonOption = (MoneybotFeedbackViewModel.ReasonOption) obj;
                rememberedValue = reasonOption != null ? reasonOption.label : null;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InputChipKt.InputDropdown(rememberDropdownState, (String) rememberedValue, modifier, false, false, Expect_jvmKt.rememberComposableLambda(-951934619, new SuggestionUiKt$$ExternalSyntheticLambda8(moneybotFeedbackViewModel, 9), gapComposer), moneybotFeedbackViewModel.dropdownPlaceholder, null, Expect_jvmKt.rememberComposableLambda(1182342523, new MoneybotFeedbackViewKt$$ExternalSyntheticLambda11(moneybotFeedbackViewModel, function1), gapComposer), gapComposer, (i2 & 896) | 100859904, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(moneybotFeedbackViewModel, function1, modifier, i, 17);
        }
    }

    public static final void MoneybotFeedbackContent(MoneybotFeedbackViewModel moneybotFeedbackViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1065522359);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotFeedbackViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(moneybotFeedbackViewModel.comment, 0L, gapComposer, 0, 2);
            ObserveCommentChanges(m382rememberTextFieldStateLepunE, function1, gapComposer, i4);
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-686199444, new MoneybotFeedbackViewKt$$ExternalSyntheticLambda3(function1, moneybotFeedbackViewModel, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2), m382rememberTextFieldStateLepunE), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotFeedbackViewModel, function1, i, i3);
        }
    }

    public static final void MoneybotFeedbackView(MoneybotFeedbackViewModel moneybotFeedbackViewModel, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        moneybotFeedbackViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(273461509);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotFeedbackViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (z) {
            gapComposer.startReplaceGroup(-860973314);
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-228810721, new MoneybotFeedbackViewKt$$ExternalSyntheticLambda0(moneybotFeedbackViewModel, function1), gapComposer), gapComposer, 3072, 6);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-860781734);
            MoneybotFeedbackContent(moneybotFeedbackViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(moneybotFeedbackViewModel, function1, z, i, 14);
        }
    }

    public static final void ObserveCommentChanges(TextFieldState textFieldState, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1056538444);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, null, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, textFieldState, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(textFieldState, function1, i, 17);
        }
    }

    public static final int offsetOnMainAxis(LazyGridMeasuredItem lazyGridMeasuredItem, Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? lazyGridMeasuredItem.offset & BodyPartID.bodyIdMax : lazyGridMeasuredItem.offset >> 32);
    }
}
