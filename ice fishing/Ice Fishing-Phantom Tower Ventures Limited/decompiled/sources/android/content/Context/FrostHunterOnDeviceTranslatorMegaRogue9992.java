package android.content.Context;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnDeviceTranslatorMegaRogue9992 extends FrostHunterKeyEventSolarVortex1388 {
    public InputStream FrostHunterCameraXTurboCelestialHero5430;
    public FrostHunterStateListAnimatorQuantumHyperionTitanium1903 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final int FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterLightSensorForceFusion4241;
    public HttpURLConnection FrostHunterLintTitanVortexQuantum9911;
    public long FrostHunterLooperThreadBetaHyperionMax1000;
    public long FrostHunterMotionSceneAuroraMega2271;
    public boolean FrostHunterResourcesTitanHyperVision5823;
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterScaleAnimationStrikeSpark5059;
    public final int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public int FrostHunterTextViewDragonStormMega4297;

    public FrostHunterOnDeviceTranslatorMegaRogue9992(int i, int i2, FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892) {
        super(true);
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2;
        this.FrostHunterLightSensorForceFusion4241 = frostHunterKotlinQuantumRogue5892;
        this.FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterKotlinQuantumRogue5892(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        long parseLong;
        long j;
        long parseLong2;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterStateListAnimatorQuantumHyperionTitanium1903;
        this.FrostHunterMotionSceneAuroraMega2271 = 0L;
        this.FrostHunterLooperThreadBetaHyperionMax1000 = 0L;
        FrostHunterFragmentBetaMegaVortex6025();
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterLooperThreadBetaHyperionMax1000(new URL(frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761.toString()), frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterBundlePulseFusionHero2475, frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889, frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232, (frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterRemoteConfigSpeedSpeed8566 & 1) == 1, true, frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterServiceEliteCelestialThunder1757);
            long j2 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232;
            long j3 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889;
            this.FrostHunterLintTitanVortexQuantum9911 = FrostHunterLooperThreadBetaHyperionMax1000;
            this.FrostHunterTextViewDragonStormMega4297 = FrostHunterLooperThreadBetaHyperionMax1000.getResponseCode();
            FrostHunterLooperThreadBetaHyperionMax1000.getResponseMessage();
            int i = this.FrostHunterTextViewDragonStormMega4297;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = FrostHunterLooperThreadBetaHyperionMax1000.getHeaderFields();
                if (this.FrostHunterTextViewDragonStormMega4297 == 416) {
                    String headerField = FrostHunterLooperThreadBetaHyperionMax1000.getHeaderField("Content-Range");
                    Pattern pattern = FrostHunterFaceDetectionStormFusionForce9146.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = FrostHunterFaceDetectionStormFusionForce9146.FrostHunterConstraintSetCloneMasterUltraRogue2633.matcher(headerField);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            parseLong = Long.parseLong(group);
                            if (j3 == parseLong) {
                                this.FrostHunterResourcesTitanHyperVision5823 = true;
                                FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
                                if (j2 != -1) {
                                    return j2;
                                }
                                return 0L;
                            }
                        }
                    }
                    parseLong = -1;
                    if (j3 == parseLong) {
                    }
                }
                InputStream errorStream = FrostHunterLooperThreadBetaHyperionMax1000.getErrorStream();
                try {
                    if (errorStream != null) {
                        FrostHunterTypefaceUltraHyperion3865.FrostHunterConstraintSetCloneMasterUltraRogue2633(errorStream);
                    } else {
                        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                } catch (IOException unused) {
                    String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                }
                FrostHunterTextViewDragonStormMega4297();
                throw new FrostHunterFirebaseModelInterpreterVisionSparkElite7607(this.FrostHunterTextViewDragonStormMega4297, this.FrostHunterTextViewDragonStormMega4297 == 416 ? new FrostHunterMotionSceneTitaniumMega7732(2008) : null, headerFields);
            }
            FrostHunterLooperThreadBetaHyperionMax1000.getContentType();
            if (this.FrostHunterTextViewDragonStormMega4297 != 200 || j3 == 0) {
                j3 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(FrostHunterLooperThreadBetaHyperionMax1000.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.FrostHunterLooperThreadBetaHyperionMax1000 = j2;
            } else if (j2 != -1) {
                this.FrostHunterLooperThreadBetaHyperionMax1000 = j2;
            } else {
                String headerField2 = FrostHunterLooperThreadBetaHyperionMax1000.getHeaderField("Content-Length");
                String headerField3 = FrostHunterLooperThreadBetaHyperionMax1000.getHeaderField("Content-Range");
                Pattern pattern2 = FrostHunterFaceDetectionStormFusionForce9146.FrostHunterAlphaAnimationNeoCosmos5761;
                if (TextUtils.isEmpty(headerField2)) {
                    j = -1;
                } else {
                    try {
                        j = -1;
                        parseLong2 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        j = -1;
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterEditTextPulseHyperion1262("Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = FrostHunterFaceDetectionStormFusionForce9146.FrostHunterAlphaAnimationNeoCosmos5761.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong3 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                long parseLong4 = (parseLong3 - Long.parseLong(group3)) + 1;
                                if (parseLong2 < 0) {
                                    parseLong2 = parseLong4;
                                } else if (parseLong2 != parseLong4) {
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    parseLong2 = Math.max(parseLong2, parseLong4);
                                }
                            } catch (NumberFormatException unused3) {
                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterEditTextPulseHyperion1262("Unexpected Content-Range [" + headerField3 + "]");
                            }
                        }
                    }
                    this.FrostHunterLooperThreadBetaHyperionMax1000 = parseLong2 == j ? parseLong2 - j3 : j;
                }
                parseLong2 = j;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                this.FrostHunterLooperThreadBetaHyperionMax1000 = parseLong2 == j ? parseLong2 - j3 : j;
            }
            try {
                this.FrostHunterCameraXTurboCelestialHero5430 = FrostHunterLooperThreadBetaHyperionMax1000.getInputStream();
                if (equalsIgnoreCase) {
                    this.FrostHunterCameraXTurboCelestialHero5430 = new GZIPInputStream(this.FrostHunterCameraXTurboCelestialHero5430);
                }
                this.FrostHunterResourcesTitanHyperVision5823 = true;
                FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
                try {
                    FrostHunterMotionSceneAuroraMega2271(j3);
                    return this.FrostHunterLooperThreadBetaHyperionMax1000;
                } catch (IOException e) {
                    FrostHunterTextViewDragonStormMega4297();
                    if (e instanceof FrostHunterFirebaseStrikeNovaX3669) {
                        throw ((FrostHunterFirebaseStrikeNovaX3669) e);
                    }
                    throw new FrostHunterFirebaseStrikeNovaX3669(e, 2000, 1);
                }
            } catch (IOException e2) {
                FrostHunterTextViewDragonStormMega4297();
                throw new FrostHunterFirebaseStrikeNovaX3669(e2, 2000, 1);
            }
        } catch (IOException e3) {
            FrostHunterTextViewDragonStormMega4297();
            throw FrostHunterFirebaseStrikeNovaX3669.FrostHunterAlphaAnimationNeoCosmos5761(e3, 1);
        }
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Map FrostHunterLevelListDrawableFusionDragonHero2232() {
        HttpURLConnection httpURLConnection = this.FrostHunterLintTitanVortexQuantum9911;
        return httpURLConnection == null ? FrostHunterContentObserverOmegaEclipseHyper3428.FrostHunterLightSensorForceFusion4241 : new FrostHunterDrawableCompatTitaniumFusion3121(httpURLConnection.getHeaderFields());
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        HttpURLConnection httpURLConnection = this.FrostHunterLintTitanVortexQuantum9911;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (frostHunterStateListAnimatorQuantumHyperionTitanium1903 != null) {
            return frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return null;
    }

    public final HttpURLConnection FrostHunterLooperThreadBetaHyperionMax1000(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.FrostHunterFragmentBetaMegaVortex6025);
        httpURLConnection.setReadTimeout(this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        HashMap hashMap = new HashMap();
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = this.FrostHunterLightSensorForceFusion4241;
        if (frostHunterKotlinQuantumRogue5892 != null) {
            hashMap.putAll(frostHunterKotlinQuantumRogue5892.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223());
        }
        hashMap.putAll(this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = FrostHunterFaceDetectionStormFusionForce9146.FrostHunterAlphaAnimationNeoCosmos5761;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j2 != -1) {
                sb2.append((j + j2) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = FrostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterCameraXPixelTurboCosmos9814;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void FrostHunterMotionSceneAuroraMega2271(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096L);
            InputStream inputStream = this.FrostHunterCameraXTurboCelestialHero5430;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new FrostHunterFirebaseStrikeNovaX3669(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new FrostHunterFirebaseStrikeNovaX3669();
            }
            j -= read;
            FrostHunterBundlePulseFusionHero2475(read);
        }
    }

    public final void FrostHunterTextViewDragonStormMega4297() {
        HttpURLConnection httpURLConnection = this.FrostHunterLintTitanVortexQuantum9911;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void close() {
        try {
            InputStream inputStream = this.FrostHunterCameraXTurboCelestialHero5430;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                    throw new FrostHunterFirebaseStrikeNovaX3669(e, 2000, 3);
                }
            }
        } finally {
            this.FrostHunterCameraXTurboCelestialHero5430 = null;
            FrostHunterTextViewDragonStormMega4297();
            if (this.FrostHunterResourcesTitanHyperVision5823) {
                this.FrostHunterResourcesTitanHyperVision5823 = false;
                FrostHunterRemoteConfigSpeedSpeed8566();
            }
            this.FrostHunterLintTitanVortexQuantum9911 = null;
            this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.FrostHunterLooperThreadBetaHyperionMax1000;
            if (j != -1) {
                long j2 = j - this.FrostHunterMotionSceneAuroraMega2271;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.FrostHunterCameraXTurboCelestialHero5430;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.FrostHunterMotionSceneAuroraMega2271 += read;
                FrostHunterBundlePulseFusionHero2475(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            throw FrostHunterFirebaseStrikeNovaX3669.FrostHunterAlphaAnimationNeoCosmos5761(e, 2);
        }
    }
}
