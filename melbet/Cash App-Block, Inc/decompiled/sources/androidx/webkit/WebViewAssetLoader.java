package androidx.webkit;

import android.content.Context;
import androidx.webkit.internal.AssetHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class WebViewAssetLoader {
    public final ArrayList mMatchers;

    public final class InternalStoragePathHandler {
        public static final String[] FORBIDDEN_DATA_DIRS = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        public final File mDirectory;

        public InternalStoragePathHandler(Context context, File file) {
            try {
                this.mDirectory = new File(AssetHelper.getCanonicalDirPath(file));
                if (isAllowedInternalStorageDir(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        public final boolean isAllowedInternalStorageDir(Context context) {
            String canonicalDirPath = AssetHelper.getCanonicalDirPath(this.mDirectory);
            String canonicalDirPath2 = AssetHelper.getCanonicalDirPath(context.getCacheDir());
            String canonicalDirPath3 = AssetHelper.getCanonicalDirPath(context.getDataDir());
            if ((!canonicalDirPath.startsWith(canonicalDirPath2) && !canonicalDirPath.startsWith(canonicalDirPath3)) || canonicalDirPath.equals(canonicalDirPath2) || canonicalDirPath.equals(canonicalDirPath3)) {
                return false;
            }
            for (int i = 0; i < 5; i++) {
                if (canonicalDirPath.startsWith(canonicalDirPath3 + FORBIDDEN_DATA_DIRS[i])) {
                    return false;
                }
            }
            return true;
        }
    }

    public final class PathMatcher {
        public final String mAuthority;
        public final InternalStoragePathHandler mHandler;
        public final String mPath;

        public PathMatcher(String str, InternalStoragePathHandler internalStoragePathHandler) {
            if (str.isEmpty() || str.charAt(0) != '/') {
                a$$ExternalSyntheticBUOutline0.m$3("Path should start with a slash '/'.");
                throw null;
            }
            if (!str.endsWith("/")) {
                a$$ExternalSyntheticBUOutline0.m$3("Path should end with a slash '/'");
                throw null;
            }
            this.mAuthority = "iamcache.braze";
            this.mPath = str;
            this.mHandler = internalStoragePathHandler;
        }
    }

    public WebViewAssetLoader(ArrayList arrayList) {
        this.mMatchers = arrayList;
    }
}
