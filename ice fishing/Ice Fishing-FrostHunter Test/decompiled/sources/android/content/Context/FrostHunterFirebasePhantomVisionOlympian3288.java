package android.content.Context;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterFirebasePhantomVisionOlympian3288 {
    public static final byte[] FrostHunterAlphaAnimationNeoCosmos5761 = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        continue;
     */
    static {
        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
        FrostHunterBarrierStrikeDragonOlympian9836[] frostHunterBarrierStrikeDragonOlympian9836Arr = {FrostHunterChipSpeedTitan5326.FrostHunterLightSensorForceFusion4241("efbbbf"), FrostHunterChipSpeedTitan5326.FrostHunterLightSensorForceFusion4241("feff"), FrostHunterChipSpeedTitan5326.FrostHunterLightSensorForceFusion4241("fffe0000"), FrostHunterChipSpeedTitan5326.FrostHunterLightSensorForceFusion4241("fffe"), FrostHunterChipSpeedTitan5326.FrostHunterLightSensorForceFusion4241("0000feff")};
        ArrayList arrayList = new ArrayList(new FrostHunterServiceFusionAurora8336(frostHunterBarrierStrikeDragonOlympian9836Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(FrostHunterCardViewHyperionAurora3829.FrostHunterLevelListDrawableFusionDragonHero2232(arrayList, frostHunterBarrierStrikeDragonOlympian9836Arr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((FrostHunterBarrierStrikeDragonOlympian9836) arrayList.get(0)).FrostHunterServiceEliteCelestialThunder1757() <= 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian98362 = (FrostHunterBarrierStrikeDragonOlympian9836) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian98363 = (FrostHunterBarrierStrikeDragonOlympian9836) arrayList.get(i6);
                frostHunterBarrierStrikeDragonOlympian98363.getClass();
                frostHunterBarrierStrikeDragonOlympian98362.getClass();
                if (frostHunterBarrierStrikeDragonOlympian98363.FrostHunterServiceConnectionTurboPhoenixOmega6719(0, frostHunterBarrierStrikeDragonOlympian98362, frostHunterBarrierStrikeDragonOlympian98362.FrostHunterServiceEliteCelestialThunder1757())) {
                    if (frostHunterBarrierStrikeDragonOlympian98363.FrostHunterServiceEliteCelestialThunder1757() == frostHunterBarrierStrikeDragonOlympian98362.FrostHunterServiceEliteCelestialThunder1757()) {
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterBarrierStrikeDragonOlympian98363, "duplicate option: ");
                        return;
                    } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        ((Number) arrayList2.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
        FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXPixelTurboCosmos9814(0L, frostHunterMergeSpeedHyperionBlaze4246, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = frostHunterMergeSpeedHyperionBlaze4246.readInt();
        }
    }

    public static final boolean FrostHunterAlertDialogAuroraDelta3200(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final void FrostHunterAlphaAnimationNeoCosmos5761(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int FrostHunterBundlePulseFusionHero2475(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int FrostHunterCameraXPixelTurboCosmos9814(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterTextViewDragonStormMega4297(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String[] FrostHunterFlowMaxDragonHero5809(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int FrostHunterFragmentBetaMegaVortex6025(FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616) {
        frostHunterJobSchedulerEpicAuroraNebula9616.getClass();
        return (frostHunterJobSchedulerEpicAuroraNebula9616.readByte() & 255) | ((frostHunterJobSchedulerEpicAuroraNebula9616.readByte() & 255) << 16) | ((frostHunterJobSchedulerEpicAuroraNebula9616.readByte() & 255) << 8);
    }

    public static final int FrostHunterKeyframeGammaGamma1197(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int FrostHunterLevelListDrawableFusionDragonHero2232(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLooperThreadBetaHyperionMax1000(charAt, 31) <= 0 || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLooperThreadBetaHyperionMax1000(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean FrostHunterLifecycleBlazeGammaElite2889(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int FrostHunterRemoteConfigSpeedSpeed8566(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int FrostHunterServiceConnectionTurboPhoenixOmega6719(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static /* synthetic */ int FrostHunterServiceEliteCelestialThunder1757(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return FrostHunterBundlePulseFusionHero2475(str, c, i, i2);
    }
}
