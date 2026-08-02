package com.fillr.core.apiclientv2;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Formatter;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class ConsumerAPIConnectionHelper {
    public static final String[] TEST_HOSTS = {"52.89.84.8", "35.161.212.110", "34.210.221.56", "54.184.62.69", "34.220.109.190", "34.215.158.86", "35.163.43.18", "54.214.213.231", "192.168.1.75"};

    static {
        Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
    }

    public static String getCacheKey(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    formatter.format("%s|%d|%s|%s|%s|%s", jSONObject2.optString("name", null), Integer.valueOf(jSONObject2.getInt("pop_id")), jSONObject2.optString(AnnotatedPrivateKey.LABEL, null), jSONObject2.optString("readonly", null), jSONObject2.optString("empty", null), jSONObject2.optString("disabled", null));
                    sb.append("&");
                }
                if (jSONObject.has("location")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("location");
                    sb.append(jSONArray.length());
                    sb.append("&");
                    sb.append(jSONObject3.getString("domain"));
                    sb.append("&");
                    sb.append(jSONObject3.getString("path"));
                }
                if (str != null) {
                    sb.append("&");
                    sb.append(str);
                }
                return sb.toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1 A[Catch: all -> 0x0042, Exception -> 0x0045, SocketTimeoutException -> 0x0179, TryCatch #1 {all -> 0x0042, blocks: (B:6:0x0009, B:8:0x001d, B:11:0x0024, B:13:0x002d, B:17:0x0030, B:18:0x0059, B:20:0x00a1, B:34:0x00d9, B:35:0x00e0, B:36:0x00e1, B:38:0x00ed, B:40:0x00f5, B:41:0x00fb, B:70:0x0165, B:72:0x016c, B:73:0x016e, B:74:0x016f, B:75:0x0178, B:85:0x0048, B:65:0x0179, B:66:0x0180), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String performAPICall(ConsumerAPIClientParams consumerAPIClientParams) {
        Exception e;
        Throwable th;
        BufferedReader bufferedReader;
        String str;
        int responseCode;
        APIEndpoint aPIEndpoint = consumerAPIClientParams.mEndpoint;
        String str2 = consumerAPIClientParams.mApiHost;
        if (aPIEndpoint == null) {
            throw new ConsumerClientException("Unknown API endpoint");
        }
        if (str2 == null) {
            throw new ConsumerClientException("No connection info found. Please enter the connection details.");
        }
        try {
            try {
                String endpointData$1 = consumerAPIClientParams.getEndpointData$1();
                String replaceAll = str2.replaceAll("(?i)^\\s*https?\\s*:\\s*//(.*)\\Z", "$1");
                if (replaceAll.indexOf("192.168.") != 0) {
                    String[] strArr = TEST_HOSTS;
                    for (int i = 0; i < 9; i++) {
                        if (!replaceAll.contains(strArr[i])) {
                        }
                    }
                    str = "https://" + replaceAll;
                    Uri.Builder buildUpon = Uri.parse(str + "/" + aPIEndpoint.getEndpointPath()).buildUpon();
                    consumerAPIClientParams.appendQueryParams(buildUpon);
                    HttpURLConnection httpRequest = aPIEndpoint.getHttpRequest(endpointData$1, new URL(buildUpon.build().toString()));
                    httpRequest.setReadTimeout(40000);
                    httpRequest.setConnectTimeout(40000);
                    httpRequest.connect();
                    responseCode = httpRequest.getResponseCode();
                    if (307 == responseCode) {
                        httpRequest = aPIEndpoint.getHttpRequest(endpointData$1, new URL(httpRequest.getHeaderField("Location")));
                        httpRequest.setReadTimeout(40000);
                        httpRequest.setConnectTimeout(40000);
                        httpRequest.connect();
                        responseCode = httpRequest.getResponseCode();
                    }
                    if (204 != responseCode) {
                        return "";
                    }
                    if (201 != responseCode && 200 != responseCode && 401 != responseCode && 500 != responseCode && 400 != responseCode) {
                        throw new ConsumerClientException("Empty HTTP response");
                    }
                    InputStream inputStream = httpRequest.getInputStream();
                    String headerField = httpRequest.getHeaderField("Content-Encoding");
                    if (headerField != null && "gzip".equalsIgnoreCase(headerField)) {
                        inputStream = new GZIPInputStream(inputStream);
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine + "\n");
                        }
                        String trim = sb.toString().trim();
                        if (200 != responseCode && 201 != responseCode) {
                            if (401 == responseCode) {
                                throw new ConsumerClientException("Authentication failure");
                            }
                            throw new ConsumerClientException("Invalid API response: " + trim);
                        }
                        try {
                            bufferedReader.close();
                            return trim;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return trim;
                        }
                    } catch (SocketTimeoutException unused) {
                        throw new ConsumerClientException("Timeout while trying to communicate with the API.");
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (e instanceof ConsumerClientException) {
                            throw ((ConsumerClientException) e);
                        }
                        throw new ConsumerClientException(e.getMessage());
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                str = "http://" + replaceAll;
                Uri.Builder buildUpon2 = Uri.parse(str + "/" + aPIEndpoint.getEndpointPath()).buildUpon();
                consumerAPIClientParams.appendQueryParams(buildUpon2);
                HttpURLConnection httpRequest2 = aPIEndpoint.getHttpRequest(endpointData$1, new URL(buildUpon2.build().toString()));
                httpRequest2.setReadTimeout(40000);
                httpRequest2.setConnectTimeout(40000);
                httpRequest2.connect();
                responseCode = httpRequest2.getResponseCode();
                if (307 == responseCode) {
                }
                if (204 != responseCode) {
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (SocketTimeoutException unused2) {
        } catch (Exception e5) {
            e = e5;
        }
    }
}
