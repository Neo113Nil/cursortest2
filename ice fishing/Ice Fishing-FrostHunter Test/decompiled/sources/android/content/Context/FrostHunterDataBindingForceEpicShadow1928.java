package android.content.Context;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDataBindingForceEpicShadow1928 implements HostnameVerifier {
    public static final FrostHunterDataBindingForceEpicShadow1928 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterDataBindingForceEpicShadow1928();

    public static List FrostHunterAlphaAnimationNeoCosmos5761(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0068->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean FrostHunterBundlePulseFusionHero2475(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        FrostHunterOnPreDrawListenerAuroraNeoStorm9375 frostHunterOnPreDrawListenerAuroraNeoStorm9375 = FrostHunterJobIntentServiceCelestialHero6012.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterOnPreDrawListenerAuroraNeoStorm9375.getClass();
        if (((Pattern) frostHunterOnPreDrawListenerAuroraNeoStorm9375.FrostHunterFlowMaxDragonHero5809).matcher(str).matches()) {
            String FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterJobIntentServiceCelestialHero6012.FrostHunterConstraintSetCloneMasterUltraRogue2633(str);
            List FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAlphaAnimationNeoCosmos5761(x509Certificate, 7);
            if (!FrostHunterAlphaAnimationNeoCosmos57612.isEmpty()) {
                Iterator it = FrostHunterAlphaAnimationNeoCosmos57612.iterator();
                while (it.hasNext()) {
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterJobIntentServiceCelestialHero6012.FrostHunterConstraintSetCloneMasterUltraRogue2633((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterAlphaAnimationNeoCosmos5761(x509Certificate, 2);
        if (!FrostHunterAlphaAnimationNeoCosmos57613.isEmpty()) {
            for (String str2 : FrostHunterAlphaAnimationNeoCosmos57613) {
                if (str.length() != 0 && !FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str, ".", false) && !FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLightSensorForceFusion4241(str, "..", false) && str2 != null && str2.length() != 0 && !FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str2, ".", false) && !FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLightSensorForceFusion4241(str2, "..", false)) {
                    String concat = !FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLightSensorForceFusion4241(str, ".", false) ? str.concat(".") : str;
                    if (!FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLightSensorForceFusion4241(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (FrostHunterConstraintSetCloneMasterUltraRogue2633(str2)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str2 = str2.toLowerCase(locale2);
                        str2.getClass();
                    }
                    if (!FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterLooperThreadBetaHyperionMax1000(str2, "*")) {
                        z = concat.equals(str2);
                    } else if (FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str2, "*.", false) && FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterDialogFragmentTurboPhoenixDragon7627(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLightSensorForceFusion4241(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterEditTextPulseHyperion1262(concat, '.', length - 1, 4) == -1)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("endIndex < beginIndex: ", length2, " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("endIndex > string.length: ", length2, " > ");
            FrostHunterServiceConnectionTurboPhoenixOmega6719.append(str.length());
            throw new IllegalArgumentException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return FrostHunterBundlePulseFusionHero2475(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
