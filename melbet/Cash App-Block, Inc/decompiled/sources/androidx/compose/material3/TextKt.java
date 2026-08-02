package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class TextKt {
    public static final DynamicProvidableCompositionLocal LocalTextStyle = new DynamicProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(21));

    public static final void ProvideTextStyle(TextStyle textStyle, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(15327438);
        int i2 = (gapComposer.changed(textStyle) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalTextStyle;
            Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((TextStyle) gapComposer.consume(dynamicProvidableCompositionLocal)).merge(textStyle)), composableLambdaImpl, gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(textStyle, composableLambdaImpl, i, i3);
        }
    }

    /* renamed from: Text--4IGK_g, reason: not valid java name */
    public static final void m560Text4IGK_g(Modifier modifier, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, TextStyle textStyle, Composer composer, final int i4) {
        GapComposer gapComposer;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final int i5;
        final boolean z2;
        final int i6;
        final int i7;
        final TextStyle textStyle2;
        TextStyle textStyle3;
        int i8;
        boolean z3;
        int i9;
        long j9;
        int i10;
        long j10;
        long j11;
        Modifier modifier3;
        long j12;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2055108902);
        int i11 = i4 | 920350128;
        if (gapComposer2.shouldExecute(i11 & 1, (306783379 & i11) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i4 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                long j13 = Color.Unspecified;
                long j14 = TextUnit.Unspecified;
                textStyle3 = (TextStyle) gapComposer2.consume(LocalTextStyle);
                i8 = 1;
                z3 = true;
                i9 = 1;
                j9 = j14;
                i10 = Integer.MAX_VALUE;
                j10 = j13;
                j11 = j9;
                modifier3 = Modifier.Companion.$$INSTANCE;
                j12 = j11;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier;
                j10 = j;
                j11 = j2;
                j12 = j3;
                j9 = j4;
                i8 = i;
                z3 = z;
                i10 = i2;
                i9 = i3;
                textStyle3 = textStyle;
            }
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            m561TextNvy7gAk("Next", modifier3, j10, j11, null, j12, null, j9, i8, z3, i10, i9, textStyle3, gapComposer, 920350134, 1797558, 0);
            modifier2 = modifier3;
            j5 = j10;
            j6 = j11;
            j7 = j12;
            j8 = j9;
            i5 = i8;
            z2 = z3;
            i6 = i10;
            i7 = i9;
            textStyle2 = textStyle3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i5 = i;
            z2 = z;
            i6 = i2;
            i7 = i3;
            textStyle2 = textStyle;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(j5, j6, j7, j8, i5, z2, i6, i7, textStyle2, i4) { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda2
                public final /* synthetic */ long f$10;
                public final /* synthetic */ int f$11;
                public final /* synthetic */ boolean f$12;
                public final /* synthetic */ int f$13;
                public final /* synthetic */ int f$14;
                public final /* synthetic */ TextStyle f$16;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ long f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(7);
                    TextKt.m560Text4IGK_g(Modifier.this, this.f$2, this.f$3, this.f$7, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$16, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-Nvy7gAk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m561TextNvy7gAk(String str, Modifier modifier, long j, long j2, FontFamily fontFamily, long j3, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, TextStyle textStyle, Composer composer, int i4, int i5, int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        FontFamily fontFamily2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        GapComposer gapComposer;
        long j6;
        TextAlign textAlign2;
        int i24;
        TextStyle textStyle2;
        int i25;
        FontFamily fontFamily3;
        Modifier modifier3;
        long j7;
        long j8;
        long j9;
        boolean z2;
        int i26;
        RecomposeScopeImpl endRestartGroup;
        long j10;
        long j11;
        long j12;
        int i27;
        int i28;
        TextStyle textStyle3;
        boolean z3;
        TextAlign textAlign3;
        long m996getColor0d7_KjU;
        int i29;
        int i30;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (gapComposer2.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i7 |= gapComposer2.changed(j) ? 256 : 128;
            }
            if ((i6 & 8) == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= gapComposer2.changedInstance(null) ? 2048 : 1024;
            }
            i9 = i6 & 16;
            int i32 = PKIFailureInfo.certRevoked;
            if (i9 == 0) {
                i7 |= 24576;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 24576) == 0) {
                    i7 |= gapComposer2.changed(j5) ? 16384 : 8192;
                }
            }
            if ((i6 & 32) == 0) {
                i7 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i7 |= gapComposer2.changed((Object) null) ? 131072 : 65536;
            }
            i10 = i6 & 64;
            int i33 = PKIFailureInfo.signerNotTrusted;
            if (i10 == 0) {
                i7 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i7 |= gapComposer2.changed((Object) null) ? 1048576 : 524288;
            }
            i11 = i6 & 128;
            int i34 = 4194304;
            if (i11 == 0) {
                i7 |= 12582912;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i4 & 12582912) == 0) {
                    i7 |= gapComposer2.changed(fontFamily2) ? 8388608 : 4194304;
                }
            }
            i12 = i6 & 256;
            if (i12 == 0) {
                i7 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                i7 |= gapComposer2.changed(j3) ? 67108864 : 33554432;
            }
            if ((i6 & 512) == 0) {
                i7 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i7 |= gapComposer2.changed((Object) null) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            i13 = i6 & 1024;
            if (i13 == 0) {
                i15 = i5 | 6;
                i14 = i12;
            } else if ((i5 & 6) == 0) {
                i14 = i12;
                i15 = i5 | (gapComposer2.changed(textAlign) ? 4 : 2);
            } else {
                i14 = i12;
                i15 = i5;
            }
            i16 = i6 & 2048;
            if (i16 == 0) {
                i15 |= 48;
            } else if ((i5 & 48) == 0) {
                i15 |= gapComposer2.changed(j4) ? 32 : 16;
            }
            int i35 = i15;
            i17 = i6 & 4096;
            if (i17 == 0) {
                i35 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
                i18 = i;
                i35 |= gapComposer2.changed(i18) ? 256 : 128;
                i19 = i6 & PKIFailureInfo.certRevoked;
                if (i19 != 0) {
                    i20 = i35 | 3072;
                } else {
                    int i36 = i35;
                    if ((i5 & 3072) == 0) {
                        i20 = i36 | (gapComposer2.changed(z) ? 2048 : 1024);
                    } else {
                        i20 = i36;
                    }
                }
                i21 = i6 & 16384;
                if (i21 != 0) {
                    i22 = i20 | 24576;
                } else {
                    i22 = i20;
                    if ((i5 & 24576) == 0) {
                        if (gapComposer2.changed(i2)) {
                            i32 = 16384;
                        }
                        i22 |= i32;
                        i23 = i6 & 32768;
                        if (i23 == 0) {
                            i22 |= 196608;
                        } else if ((i5 & 196608) == 0) {
                            i22 |= gapComposer2.changed(i3) ? 131072 : 65536;
                        }
                        if ((i6 & 65536) == 0) {
                            i22 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            if (gapComposer2.changedInstance(null)) {
                                i33 = 1048576;
                            }
                            i22 |= i33;
                        }
                        if ((i5 & 12582912) == 0) {
                            if ((i6 & PKIFailureInfo.unsupportedVersion) == 0 && gapComposer2.changed(textStyle)) {
                                i34 = 8388608;
                            }
                            i22 |= i34;
                        }
                        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            j6 = j;
                            textAlign2 = textAlign;
                            i24 = i3;
                            textStyle2 = textStyle;
                            i25 = i18;
                            fontFamily3 = fontFamily2;
                            modifier3 = modifier2;
                            j7 = j5;
                            j8 = j3;
                            j9 = j4;
                            z2 = z;
                            i26 = i2;
                        } else {
                            gapComposer2.startDefaults();
                            if ((i4 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                if (i31 != 0) {
                                    modifier2 = Modifier.Companion.$$INSTANCE;
                                }
                                j10 = i8 != 0 ? Color.Unspecified : j;
                                if (i9 != 0) {
                                    j5 = TextUnit.Unspecified;
                                }
                                if (i11 != 0) {
                                    fontFamily2 = null;
                                }
                                j11 = i14 != 0 ? TextUnit.Unspecified : j3;
                                TextAlign textAlign4 = i13 != 0 ? null : textAlign;
                                j12 = i16 != 0 ? TextUnit.Unspecified : j4;
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                boolean z4 = i19 != 0 ? true : z;
                                i27 = i21 != 0 ? Integer.MAX_VALUE : i2;
                                i28 = i23 == 0 ? i3 : 1;
                                if ((i6 & PKIFailureInfo.unsupportedVersion) != 0) {
                                    textStyle3 = (TextStyle) gapComposer2.consume(LocalTextStyle);
                                    i22 &= -29360129;
                                } else {
                                    textStyle3 = textStyle;
                                }
                                z3 = z4;
                                textAlign3 = textAlign4;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                if ((i6 & PKIFailureInfo.unsupportedVersion) != 0) {
                                    i22 &= -29360129;
                                }
                                j10 = j;
                                j11 = j3;
                                textAlign3 = textAlign;
                                j12 = j4;
                                z3 = z;
                                i27 = i2;
                                i28 = i3;
                                textStyle3 = textStyle;
                            }
                            gapComposer2.endDefaults();
                            gapComposer2.startReplaceGroup(-565217106);
                            if (j10 != 16) {
                                i29 = i27;
                                i30 = i18;
                                m996getColor0d7_KjU = j10;
                            } else {
                                gapComposer2.startReplaceGroup(-565216333);
                                m996getColor0d7_KjU = textStyle3.m996getColor0d7_KjU();
                                if (m996getColor0d7_KjU != 16) {
                                    i29 = i27;
                                    i30 = i18;
                                } else {
                                    i29 = i27;
                                    i30 = i18;
                                    m996getColor0d7_KjU = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                                }
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(false);
                            int i37 = i22 << 6;
                            int i38 = i30;
                            int i39 = i29;
                            boolean z5 = z3;
                            BasicTextKt.m347BasicTextRWo7tUw(str, modifier2, TextStyle.m995mergedA7vx0o$default(textStyle3, m996getColor0d7_KjU, j5, null, fontFamily2, j11, null, textAlign3 != null ? textAlign3.value : 0, j12, 16609104), null, i38, z5, i39, i28, null, gapComposer2, (i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i22 >> 9) & 7168) | (57344 & i37) | (458752 & i37) | (3670016 & i37) | (i37 & 29360128) | ((i7 << 18) & 1879048192), 256);
                            gapComposer = gapComposer2;
                            textAlign2 = textAlign3;
                            textStyle2 = textStyle3;
                            fontFamily3 = fontFamily2;
                            j8 = j11;
                            i24 = i28;
                            i25 = i38;
                            j7 = j5;
                            z2 = z5;
                            i26 = i39;
                            modifier3 = modifier2;
                            j6 = j10;
                            j9 = j12;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda3(str, modifier3, j6, j7, fontFamily3, j8, textAlign2, j9, i25, z2, i26, i24, textStyle2, i4, i5, i6);
                            return;
                        }
                        return;
                    }
                }
                i23 = i6 & 32768;
                if (i23 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i18 = i;
            i19 = i6 & PKIFailureInfo.certRevoked;
            if (i19 != 0) {
            }
            i21 = i6 & 16384;
            if (i21 != 0) {
            }
            i23 = i6 & 32768;
            if (i23 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        if ((i6 & 8) == 0) {
        }
        i9 = i6 & 16;
        int i322 = PKIFailureInfo.certRevoked;
        if (i9 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        i10 = i6 & 64;
        int i332 = PKIFailureInfo.signerNotTrusted;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        int i342 = 4194304;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        if ((i6 & 512) == 0) {
        }
        i13 = i6 & 1024;
        if (i13 == 0) {
        }
        i16 = i6 & 2048;
        if (i16 == 0) {
        }
        int i352 = i15;
        i17 = i6 & 4096;
        if (i17 == 0) {
        }
        i18 = i;
        i19 = i6 & PKIFailureInfo.certRevoked;
        if (i19 != 0) {
        }
        i21 = i6 & 16384;
        if (i21 != 0) {
        }
        i23 = i6 & 32768;
        if (i23 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
