package app.cash.zipline.loader;

import android.content.Context;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.zipline.loader.internal.cache.FileState;
import app.cash.zipline.loader.internal.cache.ziplineloader.DatabaseImpl;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public abstract class LoaderAndroidKt {
    public static final ZiplineCache ZiplineCache(Context context, FileSystem fileSystem, Path path, LoaderEventListener$None loaderEventListener$None) {
        Pair pair;
        Path resolve;
        DatabaseImpl.Schema schema;
        fileSystem.getClass();
        try {
            fileSystem.createDirectories(path);
            resolve = path.resolve("zipline.db");
            Reflection.factory.getOrCreateKotlinClass(DatabaseImpl.class);
            schema = DatabaseImpl.Schema.INSTANCE;
        } catch (Exception unused) {
            pair = new Pair(new NullSqlDriver(), Boolean.TRUE);
        }
        if (!StringsKt__StringsJVMKt.endsWith(resolve.name(), ".db", false)) {
            throw new IllegalArgumentException("path name must end with file suffix .db");
        }
        pair = new Pair(new AndroidSqliteDriver(schema, context, resolve.bytes.utf8(), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE), Boolean.FALSE);
        SqlDriver sqlDriver = (SqlDriver) pair.first;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        sqlDriver.getClass();
        n.b bVar = new n.b(new EnumColumnAdapter(FileState.values()), 4);
        Reflection.factory.getOrCreateKotlinClass(DatabaseImpl.class);
        ZiplineCache ziplineCache = new ZiplineCache(sqlDriver, new DatabaseImpl(sqlDriver, bVar), fileSystem, path, loaderEventListener$None, booleanValue);
        try {
            ziplineCache.deleteDirtyFiles();
            ZiplineCache.prune$zipline_loader_release$default(ziplineCache);
        } catch (Exception unused2) {
            ziplineCache.hasWriteFailures = true;
        }
        return ziplineCache;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyPendingRequests.deepLinkSpecs;
    }
}
