package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.util.Hex;
import com.squareup.cash.clientroutes.PatternRedaction;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class LibraryVersion {
    public static final PatternRedaction zza = new PatternRedaction("LibraryVersion", "");
    public static final LibraryVersion zzb = new LibraryVersion();
    public final ConcurrentHashMap zzc = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getVersion(String str) {
        IOException e;
        String str2;
        InputStream inputStream;
        PatternRedaction patternRedaction = zza;
        zzae.checkNotEmpty(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.zzc;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r6 = null;
        r6 = null;
        String str3 = null;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = LibraryVersion.class.getResourceAsStream("/" + str + ".properties");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            str2 = null;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str3);
                String sb2 = sb.toString();
                if (Log.isLoggable(patternRedaction.pattern, 2)) {
                    Log.v("LibraryVersion", patternRedaction.zza(sb2));
                }
            } else {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                String sb4 = sb3.toString();
                if (Log.isLoggable(patternRedaction.pattern, 5)) {
                    Log.w("LibraryVersion", patternRedaction.zza(sb4));
                }
            }
        } catch (IOException e3) {
            e = e3;
            String str4 = str3;
            inputStream2 = inputStream;
            str2 = str4;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 43);
            sb5.append("Failed to get app version for libraryName: ");
            sb5.append(str);
            String sb6 = sb5.toString();
            if (Log.isLoggable(patternRedaction.pattern, 6)) {
                Log.e("LibraryVersion", patternRedaction.zza(sb6), e);
            }
            InputStream inputStream4 = inputStream2;
            str3 = str2;
            inputStream = inputStream4;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            concurrentHashMap.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream3 = inputStream;
            if (inputStream3 != null) {
                Hex.closeQuietly(inputStream3);
            }
            throw th;
        }
        if (inputStream != null) {
            Hex.closeQuietly(inputStream);
        }
        if (str3 == null) {
            if (Log.isLoggable(patternRedaction.pattern, 3)) {
                Log.d("LibraryVersion", patternRedaction.zza(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"));
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
