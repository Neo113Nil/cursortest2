package com.google.android.datatransport;

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

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeRouter {
    public static final Pattern WinterFlowArrayNetwork = Pattern.compile("[0-9]+s");
    public static final Charset WinterFlowVariableVersionControl = Charset.forName(Constants.ENCODING);
    public final WinterFlowPipelineSerializer WinterFlowCacheManagerAgent;
    public final WinterFlowHookInheritance WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;

    public WinterFlowRuntimeRouter(Context context, WinterFlowHookInheritance winterFlowHookInheritance) {
        this.WinterFlowRouterStructure = context;
        this.WinterFlowHookDataSource = winterFlowHookInheritance;
        WinterFlowPipelineSerializer winterFlowPipelineSerializer = new WinterFlowPipelineSerializer();
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowThreadPoolProcess.WinterFlowTransactionManagerStrategy;
        if (winterFlowThreadPoolProcess == null) {
            Pattern pattern = WinterFlowRendererEncryption.WinterFlowRouterStructure;
            winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(27);
            WinterFlowThreadPoolProcess.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolProcess;
        }
        if (WinterFlowRendererEncryption.WinterFlowHookDataSource == null) {
            WinterFlowRendererEncryption.WinterFlowHookDataSource = new WinterFlowRendererEncryption(winterFlowThreadPoolProcess);
        }
        this.WinterFlowCacheManagerAgent = winterFlowPipelineSerializer;
    }

    public static long WinterFlowArrayNetwork(String str) {
        WinterFlowUnitTestLibrary.WinterFlowThreadListener("Invalid Expiration Timestamp.", WinterFlowArrayNetwork.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void WinterFlowHookDataSource(HttpURLConnection httpURLConnection, String str) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str2 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, WinterFlowVariableVersionControl));
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

    public static void WinterFlowRouterRouter(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            WinterFlowSyntax(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static URL WinterFlowRouterStructure(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            throw new WinterFlowRequestEntity(e.getMessage());
        }
    }

    public static void WinterFlowSyntax(HttpURLConnection httpURLConnection, byte[] bArr) {
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

    public static WinterFlowVersionControlMechanism WinterFlowTransactionManagerStrategy(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, WinterFlowVariableVersionControl));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j = WinterFlowArrayNetwork(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new WinterFlowVersionControlMechanism(str, j, 1);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing required properties: tokenExpirationTimestamp");
        return null;
    }

    public static void WinterFlowUnitTestResponse(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.1");
            WinterFlowSyntax(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static WinterFlowHookIDE WinterFlowVariableVersionControl(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, WinterFlowVariableVersionControl));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        j = WinterFlowArrayNetwork(jsonReader.nextString());
                        b = (byte) (b | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing required properties: tokenExpirationTimestamp");
                    return null;
                }
                winterFlowVersionControlMechanism = new WinterFlowVersionControlMechanism(str, j, 0);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new WinterFlowHookIDE(str2, str3, str4, winterFlowVersionControlMechanism, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection WinterFlowCacheManagerAgent(URL url, String str) {
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
            Context context = this.WinterFlowRouterStructure;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            WinterFlowFrameworkTool winterFlowFrameworkTool = (WinterFlowFrameworkTool) this.WinterFlowHookDataSource.get();
            if (winterFlowFrameworkTool != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) WinterFlowHookProcessor.WinterFlowArrayNetwork(((WinterFlowDeserializationPlatform) winterFlowFrameworkTool).WinterFlowRouterStructure()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String str2 = null;
            try {
                packageInfo = WinterFlowFrontendIDE.WinterFlowRouterStructure(context).WinterFlowRouterStructure.getPackageManager().getPackageInfo(context.getPackageName(), 64);
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
                            char[] cArr = WinterFlowSoftwareException.WinterFlowCacheManagerAgent;
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
            throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
