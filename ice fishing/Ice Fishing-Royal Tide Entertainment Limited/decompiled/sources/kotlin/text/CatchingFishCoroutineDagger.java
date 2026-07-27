package kotlin.text;

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

/* loaded from: classes.dex */
public final class CatchingFishCoroutineDagger {
    public final CatchingFishJUnitMVI CatchingFishCoroutine = new CatchingFishJUnitMVI();
    public final Context CatchingFishParcelableFAB;
    public final CatchingFishLiveDataHandler CatchingFishSnackbar;
    public static final Pattern CatchingFishReduxKtor = Pattern.compile("[0-9]+s");
    public static final Charset CatchingFishDaggerWebsocket = Charset.forName(Constants.ENCODING);

    public CatchingFishCoroutineDagger(Context context, CatchingFishLiveDataHandler catchingFishLiveDataHandler) {
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = catchingFishLiveDataHandler;
    }

    public static CatchingFishLiveDataIntent CatchingFishDaggerWebsocket(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, CatchingFishDaggerWebsocket));
        CatchingFishGsonWebSocket CatchingFishParcelableFAB = CatchingFishExoPlayerMVVM.CatchingFishParcelableFAB();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        CatchingFishExoPlayerMVVM catchingFishExoPlayerMVVM = null;
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
                        CatchingFishParcelableFAB.CatchingFishCoroutine = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        CatchingFishParcelableFAB.CatchingFishReduxKtor = Long.valueOf(CatchingFishReduxKtor(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                CatchingFishExoPlayerMVVM CatchingFishSnackbar = CatchingFishParcelableFAB.CatchingFishSnackbar();
                jsonReader.endObject();
                catchingFishExoPlayerMVVM = CatchingFishSnackbar;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new CatchingFishLiveDataIntent(str, str2, str3, catchingFishExoPlayerMVVM, 1);
    }

    public static void CatchingFishLayout(HttpURLConnection httpURLConnection, byte[] bArr) {
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

    public static URL CatchingFishParcelableFAB(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e) {
            throw new CatchingFishCardViewCameraX(e.getMessage());
        }
    }

    public static long CatchingFishReduxKtor(String str) {
        CatchingFishToastHiltBundle.CatchingFishFragmentHandler("Invalid Expiration Timestamp.", CatchingFishReduxKtor.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void CatchingFishSnackbar(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, CatchingFishDaggerWebsocket));
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
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
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
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    public static void CatchingFishViewModelFAB(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            CatchingFishLayout(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void CatchingFishViewModelScope(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            CatchingFishLayout(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static CatchingFishExoPlayerMVVM CatchingFishWorkManager(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, CatchingFishDaggerWebsocket));
        CatchingFishGsonWebSocket CatchingFishParcelableFAB = CatchingFishExoPlayerMVVM.CatchingFishParcelableFAB();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                CatchingFishParcelableFAB.CatchingFishCoroutine = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                CatchingFishParcelableFAB.CatchingFishReduxKtor = Long.valueOf(CatchingFishReduxKtor(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        CatchingFishParcelableFAB.CatchingFishSnackbar = 1;
        return CatchingFishParcelableFAB.CatchingFishSnackbar();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[Catch: NameNotFoundException -> 0x00c6, TryCatch #2 {NameNotFoundException -> 0x00c6, blocks: (B:7:0x005b, B:9:0x0073, B:16:0x007d, B:20:0x008a, B:22:0x009a, B:26:0x009e, B:28:0x00a8, B:30:0x00c1), top: B:6:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection CatchingFishCoroutine(URL url, String str) {
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
            Context context = this.CatchingFishParcelableFAB;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            CatchingFishStateFlowGlide catchingFishStateFlowGlide = (CatchingFishStateFlowGlide) this.CatchingFishSnackbar.get();
            if (catchingFishStateFlowGlide != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) CatchingFishViewMVIMVVM.CatchingFishSnackbar(((CatchingFishXMLLayoutAdMob) catchingFishStateFlowGlide).CatchingFishParcelableFAB()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String str2 = null;
            try {
                packageInfo = CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context).CatchingFishParcelableFAB.getPackageManager().getPackageInfo(context.getPackageName(), 64);
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
                            char[] cArr = CatchingFishAdMobFAB.CatchingFishWorkManager;
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
            throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
