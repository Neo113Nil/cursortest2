package android.content.Context;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDialogEclipseHyperion2442 {
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterLayoutInflaterVisionAuroraPulse9221 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterAdapterDelegateForceForce1151 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final Pattern FrostHunterServiceEliteCelestialThunder1757 = Pattern.compile("[0-9]+s");
    public static final Charset FrostHunterLifecycleBlazeGammaElite2889 = Charset.forName(Constants.ENCODING);

    public FrostHunterDialogEclipseHyperion2442(Context context, FrostHunterAdapterDelegateForceForce1151 frostHunterAdapterDelegateForceForce1151) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAdapterDelegateForceForce1151;
        FrostHunterLayoutInflaterVisionAuroraPulse9221 frostHunterLayoutInflaterVisionAuroraPulse9221 = new FrostHunterLayoutInflaterVisionAuroraPulse9221();
        if (FrostHunterMagnetometerInfernoDragon1607.FrostHunterCameraXPixelTurboCosmos9814 == null) {
            Pattern pattern = FrostHunterObjectAnimatorQuantumRogueInferno9713.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterMagnetometerInfernoDragon1607.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterMagnetometerInfernoDragon1607();
        }
        FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607 = FrostHunterMagnetometerInfernoDragon1607.FrostHunterCameraXPixelTurboCosmos9814;
        if (FrostHunterObjectAnimatorQuantumRogueInferno9713.FrostHunterBundlePulseFusionHero2475 == null) {
            FrostHunterObjectAnimatorQuantumRogueInferno9713.FrostHunterBundlePulseFusionHero2475 = new FrostHunterObjectAnimatorQuantumRogueInferno9713(frostHunterMagnetometerInfernoDragon1607);
        }
        frostHunterLayoutInflaterVisionAuroraPulse9221.FrostHunterBundlePulseFusionHero2475 = FrostHunterObjectAnimatorQuantumRogueInferno9713.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterLayoutInflaterVisionAuroraPulse9221;
    }

    public static URL FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            throw new FrostHunterTabLayoutMasterRogueShadow7189(e.getMessage());
        }
    }

    public static void FrostHunterCameraXPixelTurboCosmos9814(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            FrostHunterFlowMaxDragonHero5809(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(HttpURLConnection httpURLConnection, String str) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str2 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, FrostHunterLifecycleBlazeGammaElite2889));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str2 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
    }

    public static void FrostHunterFlowMaxDragonHero5809(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static FrostHunterLiveDataLegendNebula5761 FrostHunterLevelListDrawableFusionDragonHero2232(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, FrostHunterLifecycleBlazeGammaElite2889));
        FrostHunterActivityInfoMaxOlympian4796 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLiveDataLegendNebula5761.FrostHunterAlphaAnimationNeoCosmos5761();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = Long.valueOf(FrostHunterServiceEliteCelestialThunder1757(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809 = 1;
        return FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public static FrostHunterMotionLayoutPhoenixVortex9872 FrostHunterLifecycleBlazeGammaElite2889(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, FrostHunterLifecycleBlazeGammaElite2889));
        FrostHunterActivityInfoMaxOlympian4796 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLiveDataLegendNebula5761.FrostHunterAlphaAnimationNeoCosmos5761();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        FrostHunterLiveDataLegendNebula5761 frostHunterLiveDataLegendNebula5761 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = Long.valueOf(FrostHunterServiceEliteCelestialThunder1757(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                FrostHunterLiveDataLegendNebula5761 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761();
                jsonReader.endObject();
                frostHunterLiveDataLegendNebula5761 = FrostHunterAlphaAnimationNeoCosmos57612;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new FrostHunterMotionLayoutPhoenixVortex9872(str, str2, str3, frostHunterLiveDataLegendNebula5761, 1);
    }

    public static void FrostHunterRemoteConfigSpeedSpeed8566(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            FrostHunterFlowMaxDragonHero5809(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long FrostHunterServiceEliteCelestialThunder1757(String str) {
        if (!FrostHunterServiceEliteCelestialThunder1757.matcher(str).matches()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Invalid Expiration Timestamp.");
            return 0L;
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection FrostHunterBundlePulseFusionHero2475(URL url, String str) {
        PackageInfo packageInfo;
        Signature[] signatureArr;
        byte[] bArr;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.FrostHunterAlphaAnimationNeoCosmos5761;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            FrostHunterAnalyticsSpectraQuantumEclipse8606 frostHunterAnalyticsSpectraQuantumEclipse8606 = (FrostHunterAnalyticsSpectraQuantumEclipse8606) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.get();
            if (frostHunterAnalyticsSpectraQuantumEclipse8606 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) FrostHunterChipNovaPhantomElite7665.FrostHunterBundlePulseFusionHero2475(((FrostHunterObjectDetectionOlympianOlympian2873) frostHunterAnalyticsSpectraQuantumEclipse8606).FrostHunterAlphaAnimationNeoCosmos5761()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String str2 = null;
            try {
                packageInfo = FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                signatureArr = packageInfo.signatures;
            } catch (PackageManager.NameNotFoundException unused3) {
                context.getPackageName();
            }
            if (signatureArr != null && signatureArr.length == 1) {
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        messageDigest = null;
                        break;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused4) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i++;
                }
                if (messageDigest != null) {
                    bArr = messageDigest.digest(packageInfo.signatures[0].toByteArray());
                    if (bArr != null) {
                        context.getPackageName();
                    } else {
                        int length = bArr.length;
                        StringBuilder sb = new StringBuilder(length + length);
                        for (int i2 = 0; i2 < length; i2++) {
                            char[] cArr = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBundlePulseFusionHero2475;
                            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
                            sb.append(cArr[bArr[i2] & 15]);
                        }
                        str2 = sb.toString();
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            bArr = null;
            if (bArr != null) {
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused5) {
            throw new FrostHunterTabLayoutMasterRogueShadow7189("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
