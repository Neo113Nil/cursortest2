package com.braze.support;

import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.j1$$ExternalSyntheticLambda6;
import bo.app.wg;
import bo.app.yf$$ExternalSyntheticLambda3;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\t\u0010\b\u001aO\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010j\u0002`\u00110\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ljava/io/File;", "fileOrDirectory", "", "deleteFileOrDirectory", "(Ljava/io/File;)V", "Landroid/net/Uri;", "", "isRemoteUri", "(Landroid/net/Uri;)Z", "isLocalUri", "", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", "extension", "Lkotlin/Pair;", "", "Lcom/braze/communication/HttpHeaders;", "downloadFileToPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Landroid/content/res/AssetManager;", "assetPath", "getAssetFileStringContents", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "", "REMOTE_SCHEMES", "Ljava/util/List;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrazeFileUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"http", "https", "ftp", "ftps", "about", "javascript"});

    public static final void deleteFileOrDirectory(File file) {
        file.getClass();
        if (FilesKt__UtilsKt.deleteRecursively(file)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda3(file, 1), 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteFileOrDirectory$lambda$0(File file) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not recursively delete ", file.getName());
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        TrafficStats.setThreadStatsTag(1337);
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(str2, 8), 12, (Object) null);
            throw new Exception("SDK is offline. File not downloaded for url: ".concat(str2));
        }
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(20), 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(19), 12, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(18), 12, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        try {
            try {
                new File(str).mkdirs();
                if (str4 != null && !StringsKt.isBlank(str4)) {
                    str3 = str3.concat(str4);
                }
                File file = new File(str, str3);
                HttpURLConnection a = wg.a.a(new URL(str2));
                int responseCode = a.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda6(responseCode, str2), 14, (Object) null);
                    throw new Exception("HTTP response code was " + responseCode + ". File with url " + str2 + " could not be downloaded.");
                }
                DataInputStream dataInputStream = new DataInputStream(a.getInputStream());
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        ByteStreamsKt.copyTo$default(dataInputStream, fileOutputStream);
                        fileOutputStream.close();
                        dataInputStream.close();
                        Map<String, List<String>> headerFields = a.getHeaderFields();
                        headerFields.getClass();
                        LinkedHashMap a2 = h.a(headerFields);
                        a.disconnect();
                        return new Pair<>(file, a2);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Utf8.closeFinally(dataInputStream, th);
                        throw th2;
                    }
                }
            } finally {
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda1(str2, 7), 8, (Object) null);
            throw new Exception("Exception during download of file from url : ".concat(str2));
        }
    }

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("SDK is offline. File not downloaded for url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$1() {
        return "Download directory null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$2() {
        return "Zip file url null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$3() {
        return "Output filename null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$4(int i, String str) {
        return "HTTP response code was " + i + ". File with url " + str + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$6(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Exception during download of file from url : ", str);
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String str) {
        assetManager.getClass();
        str.getClass();
        InputStream open = assetManager.open(str);
        open.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), PKIFailureInfo.certRevoked);
        try {
            String readText = AppUpdateData.readText(bufferedReader);
            bufferedReader.close();
            return readText;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        return scheme == null || StringsKt.isBlank(scheme) || scheme.equals("file");
    }

    public static final boolean isRemoteUri(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        if (scheme != null && !StringsKt.isBlank(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(21), 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isRemoteUri$lambda$0() {
        return "Null or blank Uri scheme.";
    }
}
