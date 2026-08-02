package coil3.util;

import com.squareup.cash.clientroutes.ClientRoute;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.collections.EmptyList;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public abstract class FileSystemsKt {
    public static void createFile$default(FileSystem fileSystem, Path path) {
        if (fileSystem.exists(path)) {
            return;
        }
        try {
            fileSystem.sink(path, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void deleteContents(FileSystem fileSystem, Path path) {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).isDirectory) {
                        deleteContents(fileSystem, path2);
                    }
                    fileSystem.delete(path2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewKnotMerchantList.deepLinkSpecs;
    }
}
