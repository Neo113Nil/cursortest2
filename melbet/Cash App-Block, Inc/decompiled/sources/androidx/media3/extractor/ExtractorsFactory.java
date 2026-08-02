package androidx.media3.extractor;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ExtractorsFactory {
    Extractor[] createExtractors();

    default Extractor[] createExtractors(Uri uri, Map map) {
        return createExtractors();
    }
}
