package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRealtimeDatabaseSpeedAuroraPrime3736 {
    public final ArrayList FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterFontFamilyGammaSpeed1025 FrostHunterBundlePulseFusionHero2475;
    public ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public boolean FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterRealtimeDatabaseSpeedAuroraPrime3736(FrostHunterFontFamilyGammaSpeed1025 frostHunterFontFamilyGammaSpeed1025) {
        frostHunterFontFamilyGammaSpeed1025.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new ArrayList();
        this.FrostHunterLifecycleBlazeGammaElite2889 = -1;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterFontFamilyGammaSpeed1025;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(boolean z) {
        String str;
        FrostHunterFontFamilyGammaSpeed1025 frostHunterFontFamilyGammaSpeed1025 = this.FrostHunterBundlePulseFusionHero2475;
        if (this.FrostHunterServiceEliteCelestialThunder1757) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("commit already called");
            return 0;
        }
        if (FrostHunterFontFamilyGammaSpeed1025.FrostHunterFragmentBetaMegaVortex6025(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new FrostHunterDialogFragmentHyperBeta3171());
            ArrayList arrayList = this.FrostHunterAlphaAnimationNeoCosmos5761;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.FrostHunterLifecycleBlazeGammaElite2889);
            printWriter.print(" mCommitted=");
            printWriter.println(this.FrostHunterServiceEliteCelestialThunder1757);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    FrostHunterCamera2SolarShadow6595 frostHunterCamera2SolarShadow6595 = (FrostHunterCamera2SolarShadow6595) arrayList.get(i);
                    switch (frostHunterCamera2SolarShadow6595.FrostHunterAlphaAnimationNeoCosmos5761) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + frostHunterCamera2SolarShadow6595.FrostHunterAlphaAnimationNeoCosmos5761;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(frostHunterCamera2SolarShadow6595.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    if (frostHunterCamera2SolarShadow6595.FrostHunterServiceEliteCelestialThunder1757 != 0 || frostHunterCamera2SolarShadow6595.FrostHunterLifecycleBlazeGammaElite2889 != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(frostHunterCamera2SolarShadow6595.FrostHunterServiceEliteCelestialThunder1757));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(frostHunterCamera2SolarShadow6595.FrostHunterLifecycleBlazeGammaElite2889));
                    }
                    if (frostHunterCamera2SolarShadow6595.FrostHunterLevelListDrawableFusionDragonHero2232 != 0 || frostHunterCamera2SolarShadow6595.FrostHunterRemoteConfigSpeedSpeed8566 != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(frostHunterCamera2SolarShadow6595.FrostHunterLevelListDrawableFusionDragonHero2232));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(frostHunterCamera2SolarShadow6595.FrostHunterRemoteConfigSpeedSpeed8566));
                    }
                }
            }
            printWriter.close();
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = true;
        this.FrostHunterLifecycleBlazeGammaElite2889 = -1;
        if (!z) {
            frostHunterFontFamilyGammaSpeed1025.getClass();
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("FragmentManager has not been attached to a host.");
            return 0;
        }
        synchronized (frostHunterFontFamilyGammaSpeed1025.FrostHunterBundlePulseFusionHero2475) {
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.FrostHunterLifecycleBlazeGammaElite2889 >= 0) {
            sb.append(" #");
            sb.append(this.FrostHunterLifecycleBlazeGammaElite2889);
        }
        sb.append("}");
        return sb.toString();
    }
}
