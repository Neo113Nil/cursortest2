package androidx.versionedparcelable;

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

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshTranspilerDependencyJGCVzBSnzccLLLLtFa78044109928076 {
    public final IronMatrixBitwiseOverridingBaJVypLX3YFmNKNnCF27559498116328 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new IronMatrixBitwiseOverridingBaJVypLX3YFmNKNnCF27559498116328();
    public final NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final Context ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public static final Pattern RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = Pattern.compile("[0-9]+s");
    public static final Charset LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Charset.forName(Constants.ENCODING);

    public SolarMeshTranspilerDependencyJGCVzBSnzccLLLLtFa78044109928076(Context context, NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = context;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = novaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158;
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(HttpURLConnection httpURLConnection, String str) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str2 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119));
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

    public static void BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static TitanCloudFrameworkLambdaGRML8gMzuA169oArxE43470323195819 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119));
        XenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 = null;
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
                        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = Long.valueOf(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                jsonReader.endObject();
                vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new TitanCloudFrameworkLambdaGRML8gMzuA169oArxE43470323195819(str, str2, str3, vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656, 1);
    }

    public static URL ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            throw new BlueKernelResolverClassUIXe2jaR452MSmzDfk42686303434365(e.getMessage());
        }
    }

    public static long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(String str) {
        if (!RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.matcher(str).matches()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Invalid Expiration Timestamp.");
            return 0L;
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
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

    public static VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119));
        XenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = Long.valueOf(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 1;
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(URL url, String str) {
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
            Context context = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            NovaLayerDispatcherServiceX7J2n0qxzWo6dTonoO48085842636309 novaLayerDispatcherServiceX7J2n0qxzWo6dTonoO48085842636309 = (NovaLayerDispatcherServiceX7J2n0qxzWo6dTonoO48085842636309) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get();
            if (novaLayerDispatcherServiceX7J2n0qxzWo6dTonoO48085842636309 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(((DeltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312) novaLayerDispatcherServiceX7J2n0qxzWo6dTonoO48085842636309).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String str2 = null;
            try {
                packageInfo = CrimsonRouteExecutorAttributeMomQaj3H5PMvlUqGgR26107891851468.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getPackageManager().getPackageInfo(context.getPackageName(), 64);
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
                            char[] cArr = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
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
            throw new BlueKernelResolverClassUIXe2jaR452MSmzDfk42686303434365("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
