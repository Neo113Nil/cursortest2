package app.cash.zipline.loader;

import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda0;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.zipline.loader.internal.cache.FileState;
import app.cash.zipline.loader.internal.cache.Files;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import app.cash.zipline.loader.internal.cache.FilesQueries$$ExternalSyntheticLambda4;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectAnyDirtyFile$2;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectCacheSumBytes$2;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectOldestReady$2;
import app.cash.zipline.loader.internal.cache.Pins;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import app.cash.zipline.loader.internal.cache.PinsQueries$get_pin$2;
import app.cash.zipline.loader.internal.cache.SelectCacheSumBytes;
import app.cash.zipline.loader.internal.cache.ziplineloader.DatabaseImpl;
import app.cash.zipline.loader.internal.fetcher.FsCachingFetcher$fetch$2$result$1;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda13;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ZiplineCache implements Closeable {
    public final DatabaseImpl database;
    public final Path directory;
    public final SqlDriver driver;
    public final FileSystem fileSystem;
    public boolean hasWriteFailures;

    public ZiplineCache(SqlDriver sqlDriver, DatabaseImpl databaseImpl, FileSystem fileSystem, Path path, LoaderEventListener$None loaderEventListener$None, boolean z) {
        this.driver = sqlDriver;
        this.database = databaseImpl;
        this.fileSystem = fileSystem;
        this.directory = path;
        this.hasWriteFailures = z;
    }

    public static void prune$zipline_loader_release$default(ZiplineCache ziplineCache) {
        FilesQueries filesQueries = ziplineCache.database.filesQueries;
        while (true) {
            filesQueries.getClass();
            FilesQueries$selectCacheSumBytes$2 filesQueries$selectCacheSumBytes$2 = FilesQueries$selectCacheSumBytes$2.INSTANCE;
            SqlDriver sqlDriver = filesQueries.driver;
            yf$$ExternalSyntheticLambda10 yf__externalsyntheticlambda10 = new yf$$ExternalSyntheticLambda10(17);
            sqlDriver.getClass();
            Long l = ((SelectCacheSumBytes) new SimpleQuery(342963574, new String[]{"files"}, sqlDriver, "Files.sq", "selectCacheSumBytes", "SELECT SUM(size_bytes)\nFROM files", yf__externalsyntheticlambda10).executeAsOne()).SUM;
            if ((l != null ? l.longValue() : 0L) <= 52428800) {
                return;
            }
            filesQueries.getClass();
            FilesQueries$selectOldestReady$2 filesQueries$selectOldestReady$2 = FilesQueries$selectOldestReady$2.INSTANCE;
            SqlDriver sqlDriver2 = filesQueries.driver;
            FilesQueries$$ExternalSyntheticLambda4 filesQueries$$ExternalSyntheticLambda4 = new FilesQueries$$ExternalSyntheticLambda4(filesQueries, 5);
            sqlDriver2.getClass();
            Files files = (Files) new SimpleQuery(-533945640, new String[]{"files", "pins"}, sqlDriver2, "Files.sq", "selectOldestReady", "SELECT\nid,\nsha256_hex,\nmanifest_for_application_name,\nfile_state,\nsize_bytes,\nlast_used_at_epoch_ms,\nfresh_at_epoch_ms\nFROM files f\nLEFT JOIN pins p ON (f.id = p.file_id)\nWHERE\n  p.file_id IS NULL AND\n  f.file_state = 'READY'\nORDER BY last_used_at_epoch_ms ASC\nLIMIT 1", filesQueries$$ExternalSyntheticLambda4).executeAsOneOrNull();
            if (files == null) {
                return;
            }
            FileSystem fileSystem = ziplineCache.fileSystem;
            Path path = ziplineCache.path(files);
            fileSystem.getClass();
            fileSystem.delete(path, false);
            filesQueries.delete(files.id);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.driver.close();
    }

    public final void createPinIfNotExists(long j, String str) {
        PinsQueries pinsQueries = this.database.pinsQueries;
        pinsQueries.getClass();
        str.getClass();
        PinsQueries$get_pin$2 pinsQueries$get_pin$2 = PinsQueries$get_pin$2.INSTANCE;
        if (((Pins) new PinsQueries.Get_pinQuery(pinsQueries, j, str, new yf$$ExternalSyntheticLambda10(20)).executeAsOneOrNull()) == null) {
            pinsQueries.getClass();
            pinsQueries.driver.execute(2069271699, "INSERT INTO pins(file_id, application_name)\nVALUES (?, ?)", new StorageLinkQueries$$ExternalSyntheticLambda13(j, str, 1));
            pinsQueries.notifyQueries(2069271699, new yf$$ExternalSyntheticLambda10(21));
        }
    }

    public final void deleteDirtyFiles() {
        FilesQueries filesQueries = this.database.filesQueries;
        while (true) {
            filesQueries.getClass();
            FilesQueries$selectAnyDirtyFile$2 filesQueries$selectAnyDirtyFile$2 = FilesQueries$selectAnyDirtyFile$2.INSTANCE;
            SqlDriver sqlDriver = filesQueries.driver;
            FilesQueries$$ExternalSyntheticLambda4 filesQueries$$ExternalSyntheticLambda4 = new FilesQueries$$ExternalSyntheticLambda4(filesQueries, 0);
            sqlDriver.getClass();
            Files files = (Files) new SimpleQuery(-1826080146, new String[]{"files"}, sqlDriver, "Files.sq", "selectAnyDirtyFile", "SELECT f.id, f.sha256_hex, f.manifest_for_application_name, f.file_state, f.size_bytes, f.last_used_at_epoch_ms, f.fresh_at_epoch_ms\nFROM files f\nWHERE f.file_state = 'DIRTY'\nLIMIT 1", filesQueries$$ExternalSyntheticLambda4).executeAsOneOrNull();
            if (files == null) {
                return;
            }
            Path path = path(files);
            FileSystem fileSystem = this.fileSystem;
            fileSystem.getClass();
            fileSystem.delete(path, false);
            filesQueries.delete(files.id);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOrPut$zipline_loader_release(String str, ByteString byteString, long j, FsCachingFetcher$fetch$2$result$1 fsCachingFetcher$fetch$2$result$1, ContinuationImpl continuationImpl) {
        ZiplineCache$getOrPut$1 ziplineCache$getOrPut$1;
        int i;
        Object invoke;
        long j2;
        ByteString byteString2;
        String str2;
        ByteString byteString3;
        try {
            if (continuationImpl instanceof ZiplineCache$getOrPut$1) {
                ziplineCache$getOrPut$1 = (ZiplineCache$getOrPut$1) continuationImpl;
                int i2 = ziplineCache$getOrPut$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineCache$getOrPut$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = ziplineCache$getOrPut$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ziplineCache$getOrPut$1.label;
                    ByteString byteString4 = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.hasWriteFailures) {
                            ziplineCache$getOrPut$1.L$0 = null;
                            ziplineCache$getOrPut$1.L$1 = null;
                            ziplineCache$getOrPut$1.J$0 = j;
                            ziplineCache$getOrPut$1.label = 1;
                            Object invoke2 = fsCachingFetcher$fetch$2$result$1.invoke(ziplineCache$getOrPut$1);
                            if (invoke2 != obj2) {
                                return invoke2;
                            }
                        } else {
                            try {
                                byteString.getClass();
                                Files files = (Files) this.database.filesQueries.get(byteString.hex()).executeAsOneOrNull();
                                if (files != null) {
                                    byteString4 = read(files, j);
                                }
                                if (byteString4 != null) {
                                    return byteString4;
                                }
                                ziplineCache$getOrPut$1.L$0 = str;
                                ziplineCache$getOrPut$1.L$1 = byteString;
                                ziplineCache$getOrPut$1.J$0 = j;
                                ziplineCache$getOrPut$1.label = 3;
                                invoke = fsCachingFetcher$fetch$2$result$1.invoke(ziplineCache$getOrPut$1);
                                if (invoke != obj2) {
                                    j2 = j;
                                    byteString2 = byteString;
                                    str2 = str;
                                }
                            } catch (Exception unused) {
                                this.hasWriteFailures = true;
                                ziplineCache$getOrPut$1.L$0 = null;
                                ziplineCache$getOrPut$1.L$1 = null;
                                ziplineCache$getOrPut$1.J$0 = j;
                                ziplineCache$getOrPut$1.label = 2;
                                Object invoke3 = fsCachingFetcher$fetch$2$result$1.invoke(ziplineCache$getOrPut$1);
                                if (invoke3 != obj2) {
                                    return invoke3;
                                }
                            }
                        }
                        return obj2;
                    }
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = ziplineCache$getOrPut$1.J$0;
                    ByteString byteString5 = ziplineCache$getOrPut$1.L$1;
                    String str3 = ziplineCache$getOrPut$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    byteString2 = byteString5;
                    invoke = obj;
                    str2 = str3;
                    j2 = j3;
                    byteString3 = (ByteString) invoke;
                    write(str2, byteString2, byteString3, j2, false, null);
                    return byteString3;
                }
            }
            write(str2, byteString2, byteString3, j2, false, null);
            return byteString3;
        } catch (Exception unused2) {
            this.hasWriteFailures = true;
            return byteString3;
        }
        ziplineCache$getOrPut$1 = new ZiplineCache$getOrPut$1(this, continuationImpl);
        Object obj3 = ziplineCache$getOrPut$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineCache$getOrPut$1.label;
        ByteString byteString42 = null;
        if (i != 0) {
        }
        byteString3 = (ByteString) invoke;
    }

    public final Path path(Files files) {
        return this.directory.resolve("entry-" + files.id + ".bin");
    }

    public final void pinManifest$zipline_loader_release(String str, LoadedManifest loadedManifest, long j) {
        ZiplineCache ziplineCache;
        Files files;
        DatabaseImpl databaseImpl = this.database;
        str.getClass();
        loadedManifest.getClass();
        if (this.hasWriteFailures) {
            return;
        }
        try {
            ByteString byteString = loadedManifest.manifestBytes;
            long j2 = loadedManifest.freshAtEpochMs;
            ByteString digest$okio = byteString.digest$okio("SHA-256");
            Files files2 = (Files) databaseImpl.filesQueries.get(digest$okio.hex()).executeAsOneOrNull();
            if (files2 == null) {
                ziplineCache = this;
                try {
                    files = ziplineCache.write(str, digest$okio, byteString, j, true, Long.valueOf(j2));
                } catch (Exception unused) {
                    ziplineCache.hasWriteFailures = true;
                    return;
                }
            } else {
                ziplineCache = this;
                files = files2;
            }
            databaseImpl.transactionWithWrapper(new n3$$ExternalSyntheticLambda0(ziplineCache, str, loadedManifest, files, 16));
        } catch (Exception unused2) {
            ziplineCache = this;
        }
    }

    public final ByteString read(Files files, long j) {
        ByteString byteString;
        Throwable th;
        FileSystem fileSystem = this.fileSystem;
        FileState fileState = files.file_state;
        if (fileState == FileState.READY) {
            DatabaseImpl databaseImpl = this.database;
            databaseImpl.filesQueries.update(fileState, files.size_bytes, j, files.id);
            Path path = path(files);
            try {
                RealBufferedSource buffer = Okio.buffer(fileSystem.source(path));
                try {
                    byteString = buffer.readByteString();
                    try {
                        buffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                    }
                    th = th3;
                    byteString = null;
                }
            } catch (FileNotFoundException unused) {
                byteString = null;
            }
            if (th != null) {
                throw th;
            }
            if (byteString != null) {
                ByteString digest$okio = byteString.digest$okio("SHA-256");
                ByteString.Companion companion = ByteString.Companion;
                if (digest$okio.equals(ByteString.Companion.decodeHex(files.sha256_hex))) {
                    return byteString;
                }
            }
            try {
                fileSystem.getClass();
                fileSystem.delete(path, false);
                databaseImpl.filesQueries.delete(files.id);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final Files write(String str, ByteString byteString, ByteString byteString2, long j, boolean z, Long l) {
        Throwable th = null;
        String str2 = z ? str : null;
        Long l2 = z ? l : null;
        DatabaseImpl databaseImpl = this.database;
        FilesQueries filesQueries = databaseImpl.filesQueries;
        String hex = byteString.hex();
        FileState fileState = FileState.DIRTY;
        filesQueries.getClass();
        hex.getClass();
        filesQueries.driver.execute(-684273111, "INSERT INTO files(sha256_hex, manifest_for_application_name, file_state, size_bytes, last_used_at_epoch_ms, fresh_at_epoch_ms)\nVALUES (?, ?, ?, ?, ?, ?)", new BadgeQueries$$ExternalSyntheticLambda3(hex, str2, filesQueries, j, l2));
        filesQueries.notifyQueries(-684273111, new yf$$ExternalSyntheticLambda10(19));
        Files files = (Files) databaseImpl.filesQueries.get(byteString.hex()).executeAsOneOrNull();
        files.getClass();
        createPinIfNotExists(files.id, str);
        RealBufferedSink buffer = Okio.buffer(this.fileSystem.sink(path(files), false));
        try {
            buffer.write(byteString2);
            try {
                buffer.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                buffer.close();
            } catch (Throwable th4) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        databaseImpl.transactionWithWrapper(new BorderKt$$ExternalSyntheticLambda0(this, files, byteString2.getSize$okio(), j, 1));
        prune$zipline_loader_release$default(this);
        return files;
    }
}
