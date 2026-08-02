package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes10.dex */
public final class tl41 implements vl41 {
    public static final String[] c = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
    public final /* synthetic */ int a;
    public final Object b;

    public tl41(Context context, File file) {
        this.a = 2;
        try {
            this.b = new File(me0.c(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
        }
    }

    public boolean a(Context context) {
        String c2 = me0.c((File) this.b);
        String c3 = me0.c(context.getCacheDir());
        String c4 = me0.c(context.getDataDir());
        if ((!c2.startsWith(c3) && !c2.startsWith(c4)) || c2.equals(c3) || c2.equals(c4)) {
            return false;
        }
        for (int i = 0; i < 5; i++) {
            if (c2.startsWith(c4 + c[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vl41
    public final WebResourceResponse handle(String str) {
        File file;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    me0 me0Var = (me0) obj;
                    String substring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                    InputStream open = me0Var.a.getAssets().open(substring, 2);
                    if (substring.endsWith(".svgz")) {
                        open = new GZIPInputStream(open);
                    }
                    break;
                } catch (IOException e) {
                    Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e);
                    return new WebResourceResponse(null, null, null);
                }
                break;
            case 1:
                try {
                    break;
                } catch (Resources.NotFoundException e2) {
                    Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e2);
                    return new WebResourceResponse(null, null, null);
                } catch (IOException e3) {
                    Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e3);
                    return new WebResourceResponse(null, null, null);
                }
            default:
                File file2 = (File) obj;
                try {
                    String c2 = me0.c(file2);
                    String canonicalPath = new File(file2, str).getCanonicalPath();
                    file = canonicalPath.startsWith(c2) ? new File(canonicalPath) : null;
                } catch (IOException e4) {
                    Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e4);
                }
                if (file == null) {
                    Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, file2));
                    break;
                } else {
                    InputStream fileInputStream = new FileInputStream(file);
                    if (file.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    break;
                }
        }
        return new WebResourceResponse(null, null, null);
    }

    public tl41(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new me0(context, (byte) 0);
                break;
            default:
                this.b = new me0(context, (byte) 0);
                break;
        }
    }
}
