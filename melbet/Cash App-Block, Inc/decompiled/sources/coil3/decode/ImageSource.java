package coil3.decode;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public interface ImageSource extends AutoCloseable {

    public abstract class Metadata {
        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewGiftStocks.deepLinkSpecs;
        }
    }

    Path fileOrNull();

    FileSystem getFileSystem();

    Metadata getMetadata();

    BufferedSource source();
}
