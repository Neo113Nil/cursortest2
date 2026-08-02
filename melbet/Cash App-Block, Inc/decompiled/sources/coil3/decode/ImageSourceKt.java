package coil3.decode;

import coil3.disk.RealDiskCache;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public abstract class ImageSourceKt {
    public static FileImageSource ImageSource$default(Path path, FileSystem fileSystem, String str, RealDiskCache.RealSnapshot realSnapshot, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            realSnapshot = null;
        }
        return new FileImageSource(path, fileSystem, str, realSnapshot);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewIncomingRequestsSettings.deepLinkSpecs;
    }

    public static SourceImageSource ImageSource$default(BufferedSource bufferedSource, FileSystem fileSystem) {
        return new SourceImageSource(bufferedSource, fileSystem, null);
    }
}
