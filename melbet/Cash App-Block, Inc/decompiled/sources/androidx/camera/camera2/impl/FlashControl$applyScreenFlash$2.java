package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextRange;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.arcade.values.TextFieldState;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.sqldelight.db.QueryResult;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.loader.ZiplineCache;
import app.cash.zipline.loader.internal.cache.Files;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import app.cash.zipline.loader.internal.cache.FilesQueries$$ExternalSyntheticLambda4;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectPinnedManifest$2;
import app.cash.zipline.loader.internal.cache.FilesQueries.GetQuery;
import app.cash.zipline.loader.internal.fetcher.FsCachingFetcher;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.arcade.treehouse.InputFieldBinding;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.graphics.ContouredTextRing;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.backend.real.RealShopHubRepository;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.wire.AndroidMessage;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class FlashControl$applyScreenFlash$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $screenFlashListener;
    public final /* synthetic */ long $timeoutMillis;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashControl$applyScreenFlash$2(long j, FlashControl flashControl, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$timeoutMillis = j;
        this.this$0 = flashControl;
        this.$screenFlashListener = streamSharing$$ExternalSyntheticLambda1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$screenFlashListener;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new FlashControl$applyScreenFlash$2(this.$timeoutMillis, (FlashControl) obj3, (StreamSharing$$ExternalSyntheticLambda1) obj2, continuation);
            case 1:
                return new FlashControl$applyScreenFlash$2((RealLocalInstalledStore) obj3, (MarketTilesScreen) obj2, this.$timeoutMillis, continuation, 1);
            case 2:
                return new FlashControl$applyScreenFlash$2((FsCachingFetcher) obj3, (String) obj2, this.$timeoutMillis, continuation, 2);
            case 3:
                return new FlashControl$applyScreenFlash$2((RealAfterpayAppletRepository) obj3, this.$timeoutMillis, (AfterpayAppletResponse) obj2, continuation, 3);
            case 4:
                return new FlashControl$applyScreenFlash$2((InputFieldBinding) obj3, (CharSequence) obj2, this.$timeoutMillis, continuation, 4);
            case 5:
                return new FlashControl$applyScreenFlash$2((String) obj3, (HeartScene) obj2, this.$timeoutMillis, continuation, 5);
            case 6:
                return new FlashControl$applyScreenFlash$2((String) obj3, (MiniCardScene) obj2, this.$timeoutMillis, continuation, 6);
            case 7:
                return new FlashControl$applyScreenFlash$2((String) obj3, (WandScene) obj2, this.$timeoutMillis, continuation, 7);
            case 8:
                return new FlashControl$applyScreenFlash$2((OffersTabHomeResponse) obj3, (RealOffersTabRepository) obj2, this.$timeoutMillis, continuation, 8);
            case 9:
                return new FlashControl$applyScreenFlash$2((RealOffersTabRepository) obj3, this.$timeoutMillis, (OffersTabSearchResponse) obj2, continuation, 9);
            default:
                return new FlashControl$applyScreenFlash$2((RealShopHubRepository) obj3, this.$timeoutMillis, (ShopInfoResponse) obj2, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FlashControl$applyScreenFlash$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ByteString read;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis() + this.$timeoutMillis;
                ImageCapture.ScreenFlash screenFlash = ((FlashControl) this.this$0)._screenFlash;
                if (screenFlash != null) {
                    screenFlash.apply(currentTimeMillis, (StreamSharing$$ExternalSyntheticLambda1) this.$screenFlashListener);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = " + currentTimeMillis);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries = ((RealLocalInstalledStore) this.this$0).marketScreenQueries;
                QueryResult execute = localTabContentQueries.driver.execute(-880554613, "UPDATE local_market_screen\nSET\n  tiles = ?,\n  expires_at = ?", new MenuKt$$ExternalSyntheticLambda0(29, (MarketTilesScreen) this.$screenFlashListener, new Long(this.$timeoutMillis), localTabContentQueries));
                localTabContentQueries.notifyQueries(-880554613, new Data$$ExternalSyntheticLambda0(16));
                return execute;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ZiplineCache ziplineCache = ((FsCachingFetcher) this.this$0).cache;
                String str = (String) this.$screenFlashListener;
                long j = this.$timeoutMillis;
                ziplineCache.getClass();
                str.getClass();
                if (ziplineCache.hasWriteFailures) {
                    return null;
                }
                int i2 = 1;
                try {
                    FilesQueries filesQueries = ziplineCache.database.filesQueries;
                    filesQueries.getClass();
                    FilesQueries$selectPinnedManifest$2 filesQueries$selectPinnedManifest$2 = FilesQueries$selectPinnedManifest$2.INSTANCE;
                    Files files = (Files) filesQueries.new GetQuery(str, new FilesQueries$$ExternalSyntheticLambda4(filesQueries, i2), (byte) 0).executeAsOneOrNull();
                    if (files != null && (read = ziplineCache.read(files, j)) != null) {
                        Long l = files.fresh_at_epoch_ms;
                        l.getClass();
                        long longValue = l.longValue();
                        ZiplineManifest.Companion companion = ZiplineManifest.Companion;
                        String utf8 = read.utf8();
                        companion.getClass();
                        return new LoadedManifest(read, ZiplineManifest.Companion.decodeJson(utf8), longValue);
                    }
                    return null;
                } catch (Exception unused) {
                    ziplineCache.hasWriteFailures = true;
                    return null;
                }
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries2 = ((RealAfterpayAppletRepository) this.this$0).accountDatabase.afterpayAppletQueries;
                Long l2 = new Long(1L);
                Long l3 = new Long(this.$timeoutMillis);
                AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) this.$screenFlashListener;
                localTabContentQueries2.getClass();
                afterpayAppletResponse.getClass();
                QueryResult execute2 = localTabContentQueries2.driver.execute(2002741790, "INSERT OR REPLACE INTO afterpayApplet (key, ttl_in_millis, afterpay_applet_response)\nVALUES (?, ?, ?)", new n3$$ExternalSyntheticLambda0(l2, l3, localTabContentQueries2, afterpayAppletResponse, 20));
                localTabContentQueries2.notifyQueries(2002741790, new ActivityTabViewKt$$ExternalSyntheticLambda17(18));
                return execute2;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InputFieldBinding inputFieldBinding = (InputFieldBinding) this.this$0;
                TextFieldState textFieldState = inputFieldBinding.treehouseTextFieldState;
                String obj2 = ((CharSequence) this.$screenFlashListener).toString();
                long j2 = this.$timeoutMillis;
                int i3 = TextRange.$r8$clinit;
                TextFieldState userEdit = textFieldState.userEdit((int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax), obj2);
                if (!inputFieldBinding.treehouseTextFieldState.contentEquals(userEdit)) {
                    inputFieldBinding.treehouseTextFieldState = userEdit;
                    Function1 function1 = (Function1) inputFieldBinding.onChange$delegate.getValue();
                    if (function1 != null) {
                        function1.invoke(userEdit);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                HeartScene heartScene = (HeartScene) this.$screenFlashListener;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str2 = (String) this.this$0;
                if (str2 != null) {
                    int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(this.$timeoutMillis);
                    heartScene.getClass();
                    ContouredTextRing contouredTextRing = heartScene.ring;
                    contouredTextRing.setText(m694toArgb8_81llA, str2);
                    contouredTextRing.setRepeatCount();
                }
                return Unit.INSTANCE;
            case 6:
                MiniCardScene miniCardScene = (MiniCardScene) this.$screenFlashListener;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str3 = (String) this.this$0;
                if (str3 != null) {
                    int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(this.$timeoutMillis);
                    miniCardScene.getClass();
                    ContouredTextRing contouredTextRing2 = miniCardScene.ring;
                    contouredTextRing2.setText(m694toArgb8_81llA2, str3);
                    contouredTextRing2.setRepeatCount();
                }
                return Unit.INSTANCE;
            case 7:
                WandScene wandScene = (WandScene) this.$screenFlashListener;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str4 = (String) this.this$0;
                if (str4 != null) {
                    int m694toArgb8_81llA3 = ColorKt.m694toArgb8_81llA(this.$timeoutMillis);
                    wandScene.getClass();
                    ContouredTextRing contouredTextRing3 = wandScene.ring;
                    contouredTextRing3.setText(m694toArgb8_81llA3, str4);
                    contouredTextRing3.setRepeatCount();
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) this.this$0;
                EmptyList emptyList = EmptyList.INSTANCE;
                OffersTabHomeResponse copy$default = OffersTabHomeResponse.copy$default(offersTabHomeResponse, null, null, emptyList, emptyList, null, null, 831);
                GpsConfigQueries gpsConfigQueries = ((RealOffersTabRepository) this.$screenFlashListener).cashDatabase.offersHomeQueries;
                Long l4 = new Long(1L);
                Long l5 = new Long(this.$timeoutMillis);
                gpsConfigQueries.getClass();
                QueryResult execute3 = gpsConfigQueries.driver.execute(-568352259, "INSERT OR REPLACE INTO offersHome\nVALUES (?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(l4, l5, gpsConfigQueries, copy$default, 27));
                gpsConfigQueries.notifyQueries(-568352259, new OffersHomeQueries$$ExternalSyntheticLambda1(i));
                return execute3;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) this.this$0;
                GpsConfigQueries gpsConfigQueries2 = realOffersTabRepository.cashDatabase.offersSearchQueries;
                Long l6 = new Long(this.$timeoutMillis);
                OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) this.$screenFlashListener;
                Long l7 = offersTabSearchResponse.expire_at_ms;
                long millis = realOffersTabRepository.clock.millis();
                gpsConfigQueries2.getClass();
                QueryResult execute4 = gpsConfigQueries2.driver.execute(-902134252, "INSERT OR REPLACE INTO offersSearch\nVALUES (?, ?, ?, ?)", new BadgeQueries$$ExternalSyntheticLambda3(l6, gpsConfigQueries2, offersTabSearchResponse, l7, millis, 4));
                gpsConfigQueries2.notifyQueries(-902134252, new OffersHomeQueries$$ExternalSyntheticLambda1(23));
                return execute4;
            default:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealShopHubRepository realShopHubRepository = (RealShopHubRepository) this.this$0;
                GpsConfigQueries gpsConfigQueries3 = realShopHubRepository.cashDatabase.shopInfoDetailsQueries;
                Long l8 = new Long(this.$timeoutMillis);
                long millis2 = 300000 + realShopHubRepository.clock.millis();
                ShopInfoResponse shopInfoResponse = (ShopInfoResponse) this.$screenFlashListener;
                gpsConfigQueries3.getClass();
                shopInfoResponse.getClass();
                QueryResult execute5 = gpsConfigQueries3.driver.execute(-349053420, "INSERT OR REPLACE INTO shopInfoDetails\nVALUES (?, ?, ?)", new MultiParagraph$$ExternalSyntheticLambda0(l8, millis2, gpsConfigQueries3, shopInfoResponse));
                gpsConfigQueries3.notifyQueries(-349053420, new RealSheetState$$ExternalSyntheticLambda0(7));
                return execute5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlashControl$applyScreenFlash$2(Object obj, long j, AndroidMessage androidMessage, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$timeoutMillis = j;
        this.$screenFlashListener = androidMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlashControl$applyScreenFlash$2(Object obj, Object obj2, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$screenFlashListener = obj2;
        this.$timeoutMillis = j;
    }
}
