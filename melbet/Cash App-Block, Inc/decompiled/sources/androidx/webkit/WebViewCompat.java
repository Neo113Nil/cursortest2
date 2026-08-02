package androidx.webkit;

import android.net.Uri;
import java.util.WeakHashMap;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class WebViewCompat {
    public static final Uri WILDCARD_URI = Uri.parse(Marker.ANY_MARKER);
    public static final Uri EMPTY_URI = Uri.parse("");

    static {
        new WeakHashMap();
    }
}
