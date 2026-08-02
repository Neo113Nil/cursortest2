package com.google.android.gms.auth.api.signin.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.zzae;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zbb implements Runnable {
    public static final HuffmanTreeGroup zba = new HuffmanTreeGroup("RevokeAccessOperation", new String[0]);
    public final String zbb;
    public final StatusPendingResult zbc;

    public zbb(String str) {
        zzae.checkNotEmpty(str);
        this.zbb = str;
        this.zbc = new StatusPendingResult(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HuffmanTreeGroup huffmanTreeGroup = zba;
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.zbb).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                Log.e((String) huffmanTreeGroup.codes, ((String) huffmanTreeGroup.trees).concat("Unable to revoke access!"));
            }
            huffmanTreeGroup.d("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) huffmanTreeGroup.codes, ((String) huffmanTreeGroup.trees).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e((String) huffmanTreeGroup.codes, ((String) huffmanTreeGroup.trees).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.zbc.setResult(status);
    }
}
