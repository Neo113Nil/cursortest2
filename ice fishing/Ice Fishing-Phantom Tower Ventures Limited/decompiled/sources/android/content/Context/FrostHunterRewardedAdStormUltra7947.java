package android.content.Context;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdStormUltra7947 implements Closeable {
    public FrostHunterGradientDrawablePrimeSpectraUltra1716 FrostHunterAlertDialogAuroraDelta3200;
    public final URL FrostHunterCameraXPixelTurboCosmos9814;
    public volatile Future FrostHunterFlowMaxDragonHero5809;

    public FrostHunterRewardedAdStormUltra7947(URL url) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = url;
    }

    public final Bitmap FrostHunterAlphaAnimationNeoCosmos5761() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (isLoggable) {
            Objects.toString(url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] FrostHunterRewardedAdSpectraElite8288 = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterRewardedAdSpectraElite8288(new FrostHunterGradientDrawableNovaHeroCyber5436(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Objects.toString(url);
            }
            if (FrostHunterRewardedAdSpectraElite8288.length > 1048576) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(FrostHunterRewardedAdSpectraElite8288, 0, FrostHunterRewardedAdSpectraElite8288.length);
            if (decodeByteArray == null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterLintTitanVortexQuantum9911(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(url);
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.FrostHunterFlowMaxDragonHero5809.cancel(true);
    }
}
