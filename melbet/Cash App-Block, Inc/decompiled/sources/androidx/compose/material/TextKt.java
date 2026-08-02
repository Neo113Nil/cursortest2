package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnit;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class TextKt {
    public static final DynamicProvidableCompositionLocal LocalTextStyle = new DynamicProvidableCompositionLocal(new TextKt$$ExternalSyntheticLambda0(0));

    public static final void ProvideTextStyle(TextStyle textStyle, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-13499697);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalTextStyle;
            Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((TextStyle) gapComposer.consume(dynamicProvidableCompositionLocal)).merge(textStyle)), composableLambdaImpl, gapComposer, (i2 & 112) | 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(textStyle, composableLambdaImpl, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02da  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m509Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontWeight fontWeight, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        FontWeight fontWeight2;
        int i11;
        int i12;
        int i13;
        TextDecoration textDecoration2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        int i21;
        int i22;
        int i23;
        int i24;
        GapComposer gapComposer;
        final boolean z3;
        final long j6;
        final TextDecoration textDecoration3;
        final Modifier modifier2;
        final long j7;
        final long j8;
        final TextAlign textAlign2;
        final long j9;
        final int i25;
        final int i26;
        final Function1 function12;
        final TextStyle textStyle2;
        final FontWeight fontWeight3;
        final int i27;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        long j10;
        TextAlign textAlign3;
        int i28;
        int i29;
        Function1 function13;
        TextStyle textStyle3;
        int i30;
        int i31;
        long m675copywmQWz5c$default;
        boolean changed;
        Object rememberedValue;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1028090691);
        if ((i4 & 6) == 0) {
            i7 = (gapComposer2.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i32 = i6 & 2;
        if (i32 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= gapComposer2.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i7 |= gapComposer2.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= gapComposer2.changed(j5) ? 2048 : 1024;
                }
            }
            if ((i6 & 16) == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= gapComposer2.changed((Object) null) ? 16384 : PKIFailureInfo.certRevoked;
            }
            i10 = i6 & 32;
            int i33 = PKIFailureInfo.unsupportedVersion;
            if (i10 == 0) {
                i7 |= 196608;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i4 & 196608) == 0) {
                    i7 |= gapComposer2.changed(fontWeight2) ? 131072 : 65536;
                }
            }
            i11 = i6 & 64;
            int i34 = PKIFailureInfo.signerNotTrusted;
            if (i11 == 0) {
                i7 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i7 |= gapComposer2.changed((Object) null) ? 1048576 : 524288;
            }
            i12 = i6 & 128;
            if (i12 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i7 |= gapComposer2.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i6 & 256;
            if (i13 == 0) {
                i7 |= 100663296;
                textDecoration2 = textDecoration;
            } else {
                textDecoration2 = textDecoration;
                if ((i4 & 100663296) == 0) {
                    i7 |= gapComposer2.changed(textDecoration2) ? 67108864 : 33554432;
                }
            }
            i14 = i6 & 512;
            if (i14 == 0) {
                i7 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i15 = i14;
                i7 |= gapComposer2.changed(textAlign) ? PKIFailureInfo.duplicateCertReq : 268435456;
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i17 = i5 | (gapComposer2.changed(j4) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                    i19 = i18;
                } else if ((i5 & 48) == 0) {
                    i19 = i18;
                    i17 |= gapComposer2.changed(i) ? 32 : 16;
                } else {
                    i19 = i18;
                }
                int i35 = i17;
                i20 = i6 & 4096;
                if (i20 != 0) {
                    i35 |= MLKEMEngine.KyberPolyBytes;
                } else if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z2 = z;
                    i35 |= gapComposer2.changed(z2) ? 256 : 128;
                    i21 = i6 & PKIFailureInfo.certRevoked;
                    if (i21 == 0) {
                        i22 = i35 | 3072;
                    } else {
                        int i36 = i35;
                        if ((i5 & 3072) == 0) {
                            i22 = i36 | (gapComposer2.changed(i2) ? 2048 : 1024);
                        } else {
                            i22 = i36;
                        }
                    }
                    int i37 = i22 | 24576;
                    i23 = i6 & 32768;
                    if (i23 == 0) {
                        i37 = 221184 | i22;
                    } else if ((i5 & 196608) == 0) {
                        if (!gapComposer2.changedInstance(function1)) {
                            i33 = 65536;
                        }
                        i37 |= i33;
                        if ((i5 & 1572864) == 0) {
                            if ((i6 & 65536) == 0 && gapComposer2.changed(textStyle)) {
                                i34 = 1048576;
                            }
                            i37 |= i34;
                        }
                        i24 = i37;
                        int i38 = 1;
                        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
                            gapComposer2.startDefaults();
                            if ((i4 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                modifier3 = i32 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                                j10 = i8 != 0 ? Color.Unspecified : j;
                                if (i9 != 0) {
                                    j5 = TextUnit.Unspecified;
                                }
                                if (i10 != 0) {
                                    fontWeight2 = null;
                                }
                                j8 = i12 != 0 ? TextUnit.Unspecified : j3;
                                if (i13 != 0) {
                                    textDecoration2 = null;
                                }
                                textAlign3 = i15 != 0 ? null : textAlign;
                                j9 = i16 != 0 ? TextUnit.Unspecified : j4;
                                i28 = i19 != 0 ? 1 : i;
                                if (i20 != 0) {
                                    z2 = true;
                                }
                                i29 = i21 != 0 ? Integer.MAX_VALUE : i2;
                                function13 = i23 != 0 ? null : function1;
                                if ((i6 & 65536) != 0) {
                                    textStyle3 = (TextStyle) gapComposer2.consume(LocalTextStyle);
                                    i30 = i24 & (-3670017);
                                    gapComposer2.endDefaults();
                                    Modifier modifier4 = modifier3;
                                    TextStyle textStyle4 = textStyle3;
                                    long j11 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                                    float floatValue = ((Number) gapComposer2.consume(ContentAlphaKt.LocalContentAlpha)).floatValue();
                                    if (j10 == 16) {
                                        i31 = i29;
                                        m675copywmQWz5c$default = j10;
                                    } else if (textStyle4.m996getColor0d7_KjU() != 16) {
                                        m675copywmQWz5c$default = textStyle4.m996getColor0d7_KjU();
                                        i31 = i29;
                                    } else {
                                        i31 = i29;
                                        m675copywmQWz5c$default = Color.m675copywmQWz5c$default(floatValue, j11, 14);
                                    }
                                    TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle4, 0L, j5, fontWeight2, null, j8, textDecoration2, textAlign3 == null ? textAlign3.value : 0, j9, 16609105);
                                    changed = gapComposer2.changed(m675copywmQWz5c$default);
                                    rememberedValue = gapComposer2.rememberedValue();
                                    if (!changed || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new TextKt$Text$1$1(m675copywmQWz5c$default, 0);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    int i39 = i30 << 9;
                                    int i40 = i31;
                                    BasicTextKt.m347BasicTextRWo7tUw(str, modifier4, m995mergedA7vx0o$default, function13, i28, z2, i40, i38, (ColorProducer) rememberedValue, gapComposer2, (i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i30 >> 6) & 7168) | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (i39 & 29360128), 512);
                                    gapComposer = gapComposer2;
                                    textStyle2 = textStyle4;
                                    modifier2 = modifier4;
                                    fontWeight3 = fontWeight2;
                                    i27 = i28;
                                    i26 = i38;
                                    function12 = function13;
                                    i25 = i40;
                                    j7 = j10;
                                    TextDecoration textDecoration4 = textDecoration2;
                                    z3 = z2;
                                    textAlign2 = textAlign3;
                                    j6 = j5;
                                    textDecoration3 = textDecoration4;
                                }
                                textStyle3 = textStyle;
                                i30 = i24;
                                gapComposer2.endDefaults();
                                Modifier modifier42 = modifier3;
                                TextStyle textStyle42 = textStyle3;
                                long j112 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                                float floatValue2 = ((Number) gapComposer2.consume(ContentAlphaKt.LocalContentAlpha)).floatValue();
                                if (j10 == 16) {
                                }
                                TextStyle m995mergedA7vx0o$default2 = TextStyle.m995mergedA7vx0o$default(textStyle42, 0L, j5, fontWeight2, null, j8, textDecoration2, textAlign3 == null ? textAlign3.value : 0, j9, 16609105);
                                changed = gapComposer2.changed(m675copywmQWz5c$default);
                                rememberedValue = gapComposer2.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = new TextKt$Text$1$1(m675copywmQWz5c$default, 0);
                                gapComposer2.updateRememberedValue(rememberedValue);
                                int i392 = i30 << 9;
                                int i402 = i31;
                                BasicTextKt.m347BasicTextRWo7tUw(str, modifier42, m995mergedA7vx0o$default2, function13, i28, z2, i402, i38, (ColorProducer) rememberedValue, gapComposer2, (i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i30 >> 6) & 7168) | (57344 & i392) | (458752 & i392) | (3670016 & i392) | (i392 & 29360128), 512);
                                gapComposer = gapComposer2;
                                textStyle2 = textStyle42;
                                modifier2 = modifier42;
                                fontWeight3 = fontWeight2;
                                i27 = i28;
                                i26 = i38;
                                function12 = function13;
                                i25 = i402;
                                j7 = j10;
                                TextDecoration textDecoration42 = textDecoration2;
                                z3 = z2;
                                textAlign2 = textAlign3;
                                j6 = j5;
                                textDecoration3 = textDecoration42;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                if ((i6 & 65536) != 0) {
                                    modifier3 = modifier;
                                    j10 = j;
                                    j8 = j3;
                                    textAlign3 = textAlign;
                                    j9 = j4;
                                    i28 = i;
                                    i29 = i2;
                                    i38 = i3;
                                    function13 = function1;
                                    i30 = i24 & (-3670017);
                                    textStyle3 = textStyle;
                                    gapComposer2.endDefaults();
                                    Modifier modifier422 = modifier3;
                                    TextStyle textStyle422 = textStyle3;
                                    long j1122 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                                    float floatValue22 = ((Number) gapComposer2.consume(ContentAlphaKt.LocalContentAlpha)).floatValue();
                                    if (j10 == 16) {
                                    }
                                    TextStyle m995mergedA7vx0o$default22 = TextStyle.m995mergedA7vx0o$default(textStyle422, 0L, j5, fontWeight2, null, j8, textDecoration2, textAlign3 == null ? textAlign3.value : 0, j9, 16609105);
                                    changed = gapComposer2.changed(m675copywmQWz5c$default);
                                    rememberedValue = gapComposer2.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = new TextKt$Text$1$1(m675copywmQWz5c$default, 0);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                    int i3922 = i30 << 9;
                                    int i4022 = i31;
                                    BasicTextKt.m347BasicTextRWo7tUw(str, modifier422, m995mergedA7vx0o$default22, function13, i28, z2, i4022, i38, (ColorProducer) rememberedValue, gapComposer2, (i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i30 >> 6) & 7168) | (57344 & i3922) | (458752 & i3922) | (3670016 & i3922) | (i3922 & 29360128), 512);
                                    gapComposer = gapComposer2;
                                    textStyle2 = textStyle422;
                                    modifier2 = modifier422;
                                    fontWeight3 = fontWeight2;
                                    i27 = i28;
                                    i26 = i38;
                                    function12 = function13;
                                    i25 = i4022;
                                    j7 = j10;
                                    TextDecoration textDecoration422 = textDecoration2;
                                    z3 = z2;
                                    textAlign2 = textAlign3;
                                    j6 = j5;
                                    textDecoration3 = textDecoration422;
                                } else {
                                    modifier3 = modifier;
                                    j10 = j;
                                    j8 = j3;
                                    textAlign3 = textAlign;
                                    j9 = j4;
                                    i28 = i;
                                    i29 = i2;
                                    i38 = i3;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    i30 = i24;
                                    gapComposer2.endDefaults();
                                    Modifier modifier4222 = modifier3;
                                    TextStyle textStyle4222 = textStyle3;
                                    long j11222 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                                    float floatValue222 = ((Number) gapComposer2.consume(ContentAlphaKt.LocalContentAlpha)).floatValue();
                                    if (j10 == 16) {
                                    }
                                    TextStyle m995mergedA7vx0o$default222 = TextStyle.m995mergedA7vx0o$default(textStyle4222, 0L, j5, fontWeight2, null, j8, textDecoration2, textAlign3 == null ? textAlign3.value : 0, j9, 16609105);
                                    changed = gapComposer2.changed(m675copywmQWz5c$default);
                                    rememberedValue = gapComposer2.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = new TextKt$Text$1$1(m675copywmQWz5c$default, 0);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                    int i39222 = i30 << 9;
                                    int i40222 = i31;
                                    BasicTextKt.m347BasicTextRWo7tUw(str, modifier4222, m995mergedA7vx0o$default222, function13, i28, z2, i40222, i38, (ColorProducer) rememberedValue, gapComposer2, (i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i30 >> 6) & 7168) | (57344 & i39222) | (458752 & i39222) | (3670016 & i39222) | (i39222 & 29360128), 512);
                                    gapComposer = gapComposer2;
                                    textStyle2 = textStyle4222;
                                    modifier2 = modifier4222;
                                    fontWeight3 = fontWeight2;
                                    i27 = i28;
                                    i26 = i38;
                                    function12 = function13;
                                    i25 = i40222;
                                    j7 = j10;
                                    TextDecoration textDecoration4222 = textDecoration2;
                                    z3 = z2;
                                    textAlign2 = textAlign3;
                                    j6 = j5;
                                    textDecoration3 = textDecoration4222;
                                }
                            }
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            TextDecoration textDecoration5 = textDecoration2;
                            z3 = z2;
                            j6 = j5;
                            textDecoration3 = textDecoration5;
                            modifier2 = modifier;
                            j7 = j;
                            j8 = j3;
                            textAlign2 = textAlign;
                            j9 = j4;
                            i25 = i2;
                            i26 = i3;
                            function12 = function1;
                            textStyle2 = textStyle;
                            fontWeight3 = fontWeight2;
                            i27 = i;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i4 | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i5);
                                    TextKt.m509Text4IGK_g(str, modifier2, j7, j6, fontWeight3, j8, textDecoration3, textAlign2, j9, i27, z3, i25, i26, function12, textStyle2, (Composer) obj, updateChangedFlags, updateChangedFlags2, i6);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    i24 = i37;
                    int i382 = 1;
                    if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i21 = i6 & PKIFailureInfo.certRevoked;
                if (i21 == 0) {
                }
                int i372 = i22 | 24576;
                i23 = i6 & 32768;
                if (i23 == 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                i24 = i372;
                int i3822 = 1;
                if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i352 = i17;
            i20 = i6 & 4096;
            if (i20 != 0) {
            }
            z2 = z;
            i21 = i6 & PKIFailureInfo.certRevoked;
            if (i21 == 0) {
            }
            int i3722 = i22 | 24576;
            i23 = i6 & 32768;
            if (i23 == 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            i24 = i3722;
            int i38222 = 1;
            if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        if ((i6 & 16) == 0) {
        }
        i10 = i6 & 32;
        int i332 = PKIFailureInfo.unsupportedVersion;
        if (i10 == 0) {
        }
        i11 = i6 & 64;
        int i342 = PKIFailureInfo.signerNotTrusted;
        if (i11 == 0) {
        }
        i12 = i6 & 128;
        if (i12 == 0) {
        }
        i13 = i6 & 256;
        if (i13 == 0) {
        }
        i14 = i6 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i3522 = i17;
        i20 = i6 & 4096;
        if (i20 != 0) {
        }
        z2 = z;
        i21 = i6 & PKIFailureInfo.certRevoked;
        if (i21 == 0) {
        }
        int i37222 = i22 | 24576;
        i23 = i6 & 32768;
        if (i23 == 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        i24 = i37222;
        int i382222 = 1;
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
