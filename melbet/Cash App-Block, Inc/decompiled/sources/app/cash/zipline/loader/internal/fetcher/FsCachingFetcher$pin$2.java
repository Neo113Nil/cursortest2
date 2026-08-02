package app.cash.zipline.loader.internal.fetcher;

import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.loader.ZiplineCache;
import app.cash.zipline.loader.internal.cache.Files;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import app.cash.zipline.loader.internal.cache.FilesQueries$$ExternalSyntheticLambda4;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectPinnedManifest$2;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectPinnedManifestNotFileId$2;
import app.cash.zipline.loader.internal.cache.FilesQueries.GetQuery;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import app.cash.zipline.loader.internal.cache.ziplineloader.DatabaseImpl;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository$search$3$1$2;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FsCachingFetcher$pin$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $applicationName;
    public final /* synthetic */ Object $loadedManifest;
    public final /* synthetic */ long $nowEpochMs;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FsCachingFetcher$pin$2(FsCachingFetcher fsCachingFetcher, String str, LoadedManifest loadedManifest, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = fsCachingFetcher;
        this.$applicationName = str;
        this.$loadedManifest = loadedManifest;
        this.$nowEpochMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$loadedManifest;
        Object obj3 = this.$applicationName;
        switch (i) {
            case 0:
                return new FsCachingFetcher$pin$2((FsCachingFetcher) this.this$0, (String) obj3, (LoadedManifest) obj2, this.$nowEpochMs, continuation, 0);
            case 1:
                return new FsCachingFetcher$pin$2((FsCachingFetcher) this.this$0, (String) obj3, (LoadedManifest) obj2, this.$nowEpochMs, continuation, 1);
            case 2:
                return new FsCachingFetcher$pin$2((FsCachingFetcher) this.this$0, (String) obj3, (LoadedManifest) obj2, this.$nowEpochMs, continuation, 2);
            default:
                FsCachingFetcher$pin$2 fsCachingFetcher$pin$2 = new FsCachingFetcher$pin$2((RealOffersTabRepository) obj3, this.$nowEpochMs, (OffersTabSearchResponse) obj2, continuation);
                fsCachingFetcher$pin$2.this$0 = obj;
                return fsCachingFetcher$pin$2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FsCachingFetcher$pin$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0100, code lost:
    
        if (r4 == null) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Files files;
        int i = this.$r8$classId;
        long j = this.$nowEpochMs;
        int i2 = 0;
        int i3 = 3;
        int i4 = 1;
        Object obj2 = this.$loadedManifest;
        Object obj3 = this.$applicationName;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((FsCachingFetcher) this.this$0).cache.pinManifest$zipline_loader_release((String) obj3, (LoadedManifest) obj2, j);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ZiplineCache ziplineCache = ((FsCachingFetcher) this.this$0).cache;
                String str = (String) obj3;
                LoadedManifest loadedManifest = (LoadedManifest) obj2;
                DatabaseImpl databaseImpl = ziplineCache.database;
                FilesQueries filesQueries = databaseImpl.filesQueries;
                str.getClass();
                if (!ziplineCache.hasWriteFailures) {
                    try {
                        Files files2 = (Files) filesQueries.get(loadedManifest.manifestBytes.digest$okio("SHA-256").hex()).executeAsOneOrNull();
                        if (files2 != null) {
                            long j2 = files2.id;
                            filesQueries.getClass();
                            FilesQueries$selectPinnedManifestNotFileId$2 filesQueries$selectPinnedManifestNotFileId$2 = FilesQueries$selectPinnedManifestNotFileId$2.INSTANCE;
                            files = (Files) new PinsQueries.Get_pinQuery(filesQueries, str, j2, new FilesQueries$$ExternalSyntheticLambda4(filesQueries, i3)).executeAsOneOrNull();
                            break;
                        }
                        filesQueries.getClass();
                        FilesQueries$selectPinnedManifest$2 filesQueries$selectPinnedManifest$2 = FilesQueries$selectPinnedManifest$2.INSTANCE;
                        files = (Files) filesQueries.new GetQuery(str, new FilesQueries$$ExternalSyntheticLambda4(filesQueries, i4), (byte) 0).executeAsOneOrNull();
                        if (files == null) {
                            databaseImpl.pinsQueries.delete_application_pins(str);
                        } else {
                            ByteString read = ziplineCache.read(files, j);
                            if (read == null) {
                                throw new FileNotFoundException("No manifest file on disk with [fileName=" + files.sha256_hex + "]");
                            }
                            Long l = files.fresh_at_epoch_ms;
                            l.getClass();
                            long longValue = l.longValue();
                            ZiplineManifest.Companion companion = ZiplineManifest.Companion;
                            String utf8 = read.utf8();
                            companion.getClass();
                            ziplineCache.pinManifest$zipline_loader_release(str, new LoadedManifest(read, ZiplineManifest.Companion.decodeJson(utf8), longValue), j);
                        }
                    } catch (Exception unused) {
                        ziplineCache.hasWriteFailures = true;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ZiplineCache ziplineCache2 = ((FsCachingFetcher) this.this$0).cache;
                String str2 = (String) obj3;
                LoadedManifest loadedManifest2 = (LoadedManifest) obj2;
                long j3 = this.$nowEpochMs;
                ziplineCache2.getClass();
                DatabaseImpl databaseImpl2 = ziplineCache2.database;
                str2.getClass();
                if (!ziplineCache2.hasWriteFailures) {
                    try {
                        long j4 = loadedManifest2.freshAtEpochMs;
                        ByteString byteString = loadedManifest2.manifestBytes;
                        ByteString digest$okio = byteString.digest$okio("SHA-256");
                        Files files3 = (Files) databaseImpl2.filesQueries.get(digest$okio.hex()).executeAsOneOrNull();
                        if (files3 == null) {
                            files3 = ziplineCache2.write(str2, digest$okio, byteString, j3, true, Long.valueOf(j4));
                        }
                        FilesQueries filesQueries2 = databaseImpl2.filesQueries;
                        filesQueries2.driver.execute(-1036338059, "UPDATE files\nSET fresh_at_epoch_ms = ?\nWHERE id = ?", new LocalMapPinKt$$ExternalSyntheticLambda5(Long.valueOf(j4), files3.id, 4));
                        filesQueries2.notifyQueries(-1036338059, new yf$$ExternalSyntheticLambda10(16));
                    } catch (Exception unused2) {
                        ziplineCache2.hasWriteFailures = true;
                    }
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Continuation continuation = null;
                JobKt.launch$default(coroutineScope, null, null, new ToastKt$Toast$8$1((RealOffersTabRepository) obj3, this.$nowEpochMs, (OffersTabSearchResponse) obj2, (Continuation) null, 10), 3);
                RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) obj3;
                OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj2;
                JobKt.launch$default(coroutineScope, null, null, new RealOffersTabRepository$search$3$1$2(realOffersTabRepository, offersTabSearchResponse, continuation, i2), 3);
                return JobKt.launch$default(coroutineScope, null, null, new RealOffersTabRepository$search$3$1$2(realOffersTabRepository, offersTabSearchResponse, continuation, i4), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FsCachingFetcher$pin$2(RealOffersTabRepository realOffersTabRepository, long j, OffersTabSearchResponse offersTabSearchResponse, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$applicationName = realOffersTabRepository;
        this.$nowEpochMs = j;
        this.$loadedManifest = offersTabSearchResponse;
    }
}
