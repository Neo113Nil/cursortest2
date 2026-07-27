package android.content.Context;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomCelestialInferno9531 extends FrostHunterTransitionGammaTitanSpeed7178 {
    public final FrostHunterMotionSceneHyperionHyperPhoenix3425 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterRoomCelestialInferno9531(FrostHunterMotionSceneHyperionHyperPhoenix3425 frostHunterMotionSceneHyperionHyperPhoenix3425) {
        frostHunterMotionSceneHyperionHyperPhoenix3425.getClass();
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterMotionSceneHyperionHyperPhoenix3425;
    }

    public static boolean FrostHunterAlphaAnimationNovaGamma6326(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // android.content.Context.FrostHunterTransitionGammaTitanSpeed7178
    public final List FrostHunterServiceConnectionTurboPhoenixOmega6719(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761(x509Certificate);
            if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (FrostHunterAlphaAnimationNovaGamma6326(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                arrayList.add(FrostHunterAlphaAnimationNeoCosmos5761);
            }
            if (FrostHunterAlphaAnimationNovaGamma6326(FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterAlphaAnimationNeoCosmos5761, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FrostHunterRoomCelestialInferno9531) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(((FrostHunterRoomCelestialInferno9531) obj).FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
    }

    public final int hashCode() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719.hashCode();
    }
}
