package app.cash.copper.flow;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.MutatorMutex$mutateWith$2;
import app.cash.copper.ContentResolverQuery;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes.dex */
public abstract class FlowContentResolver {
    public static final Handler mainThread = new Handler(Looper.getMainLooper());

    public static SafeFlow observeQuery$default(ContentResolver contentResolver, Uri uri, String[] strArr, String[] strArr2, int i) {
        String str = (i & 4) != 0 ? null : "display_name IS NOT NULL AND (data1 IS NOT NULL OR data1 IS NOT NULL) AND (mimetype = ? OR mimetype = ?)";
        String[] strArr3 = (i & 8) != 0 ? null : strArr2;
        contentResolver.getClass();
        uri.getClass();
        return new SafeFlow(new MutatorMutex$mutateWith$2(contentResolver, new ContentResolverQuery(contentResolver, uri, strArr, str, strArr3), uri, null));
    }
}
