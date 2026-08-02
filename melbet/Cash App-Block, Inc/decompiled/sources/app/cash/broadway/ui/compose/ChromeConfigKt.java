package app.cash.broadway.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import bo.app.u4$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class ChromeConfigKt {
    public static final StaticProvidableCompositionLocal LocalChromeConfigAggregator = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(5));
    public static final StaticProvidableCompositionLocal LocalChromeToolbarConfigAggregator = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(6));

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChromeConfig(UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, ChromeSystemIconColor chromeSystemIconColor, ChromeSystemIconColor chromeSystemIconColor2, Boolean bool, Boolean bool2, ToolbarConfig toolbarConfig, Float f, Composer composer, int i, int i2) {
        int i3;
        Boolean bool3;
        int i4;
        Boolean bool4;
        int i5;
        ToolbarConfig toolbarConfig2;
        int i6;
        Float f2;
        UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig2;
        ChromeSystemIconColor chromeSystemIconColor3;
        ChromeSystemIconColor chromeSystemIconColor4;
        Boolean bool5;
        Boolean bool6;
        ToolbarConfig toolbarConfig3;
        Float f3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1145262735);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(updatesWindowFlags$TabConfig) : gapComposer.changedInstance(updatesWindowFlags$TabConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(chromeSystemIconColor == null ? -1 : chromeSystemIconColor.ordinal()) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(chromeSystemIconColor2 != null ? chromeSystemIconColor2.ordinal() : -1) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            bool3 = bool;
            i3 |= gapComposer.changed(bool3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                bool4 = bool2;
                i3 |= gapComposer.changed(bool4) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    toolbarConfig2 = toolbarConfig;
                    i3 |= gapComposer.changedInstance(toolbarConfig2) ? PKIFailureInfo.unsupportedVersion : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        f2 = f;
                        i3 |= gapComposer.changed(f2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                            updatesWindowFlags$TabConfig2 = i7 != 0 ? null : updatesWindowFlags$TabConfig;
                            ChromeSystemIconColor chromeSystemIconColor5 = i8 != 0 ? null : chromeSystemIconColor;
                            ChromeSystemIconColor chromeSystemIconColor6 = i9 != 0 ? null : chromeSystemIconColor2;
                            Boolean bool7 = i10 != 0 ? null : bool3;
                            Boolean bool8 = i4 != 0 ? null : bool4;
                            ToolbarConfig toolbarConfig4 = i5 != 0 ? null : toolbarConfig2;
                            Float f4 = i6 != 0 ? null : f2;
                            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-975583118, new ChromeConfigKt$$ExternalSyntheticLambda0(updatesWindowFlags$TabConfig2, chromeSystemIconColor5, chromeSystemIconColor6, bool7, bool8, toolbarConfig4, f4, 0), gapComposer), gapComposer, 6);
                            chromeSystemIconColor3 = chromeSystemIconColor5;
                            chromeSystemIconColor4 = chromeSystemIconColor6;
                            bool5 = bool7;
                            bool6 = bool8;
                            toolbarConfig3 = toolbarConfig4;
                            f3 = f4;
                        } else {
                            gapComposer.skipToGroupEnd();
                            updatesWindowFlags$TabConfig2 = updatesWindowFlags$TabConfig;
                            chromeSystemIconColor3 = chromeSystemIconColor;
                            chromeSystemIconColor4 = chromeSystemIconColor2;
                            bool5 = bool3;
                            bool6 = bool4;
                            toolbarConfig3 = toolbarConfig2;
                            f3 = f2;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda1(updatesWindowFlags$TabConfig2, chromeSystemIconColor3, chromeSystemIconColor4, bool5, bool6, toolbarConfig3, f3, i, i2, 0);
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                toolbarConfig2 = toolbarConfig;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                f2 = f;
                if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            bool4 = bool2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            toolbarConfig2 = toolbarConfig;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            f2 = f;
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        bool3 = bool;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        bool4 = bool2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        toolbarConfig2 = toolbarConfig;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        f2 = f;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ChromeConfig(ChromeSystemIconColor chromeSystemIconColor, Boolean bool, Composer composer, int i, int i2) {
        int i3;
        Boolean bool2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(774539589);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(chromeSystemIconColor.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer.changed((Object) null) : gapComposer.changedInstance(null) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(bool) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed((Object) null) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Boolean bool3 = i4 != 0 ? null : bool;
            int i5 = i3 << 3;
            ChromeConfig(null, chromeSystemIconColor, chromeSystemIconColor, bool3, null, null, null, gapComposer, ((i3 >> 3) & 14) | (i5 & 112) | ((i3 << 6) & 896) | (i5 & 7168) | (57344 & i5), 96);
            bool2 = bool3;
        } else {
            gapComposer.skipToGroupEnd();
            bool2 = bool;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(chromeSystemIconColor, bool2, i, i2, 1);
        }
    }

    public static final void ChromeConfig(boolean z, Boolean bool, Composer composer, int i, int i2) {
        int i3;
        ChromeSystemIconColor chromeSystemIconColor;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-662094050);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(bool) ? 256 : 128;
        }
        int i6 = i4 | 3072;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                bool = null;
            }
            if (z) {
                chromeSystemIconColor = ChromeSystemIconColor.ALWAYS_LIGHT;
            } else {
                chromeSystemIconColor = ChromeSystemIconColor.STANDARD;
            }
            ChromeConfig(chromeSystemIconColor, bool, gapComposer, i6 & 8176, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Boolean bool2 = bool;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda5(z, bool2, i, i2, 0);
        }
    }
}
