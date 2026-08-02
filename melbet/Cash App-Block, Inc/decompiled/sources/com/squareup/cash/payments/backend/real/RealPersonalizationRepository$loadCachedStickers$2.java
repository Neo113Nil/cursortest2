package com.squareup.cash.payments.backend.real;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfig;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$loadStickers$2;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.payments.backend.api.StickerMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPersonalizationRepository$loadCachedStickers$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealPersonalizationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPersonalizationRepository$loadCachedStickers$2(RealPersonalizationRepository realPersonalizationRepository, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realPersonalizationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealPersonalizationRepository realPersonalizationRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealPersonalizationRepository$loadCachedStickers$2(realPersonalizationRepository, continuation, 0);
            default:
                return new RealPersonalizationRepository$loadCachedStickers$2(realPersonalizationRepository, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealPersonalizationRepository$loadCachedStickers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealPersonalizationRepository realPersonalizationRepository = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InstrumentQueries instrumentQueries = realPersonalizationRepository.cashDatabase.expressivePaymentsStickerConfigQueries;
                instrumentQueries.getClass();
                ExpressivePaymentsStickerConfigQueries$loadStickers$2 expressivePaymentsStickerConfigQueries$loadStickers$2 = ExpressivePaymentsStickerConfigQueries$loadStickers$2.INSTANCE;
                SqlDriver sqlDriver = instrumentQueries.driver;
                ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0 expressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0 = new ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0(instrumentQueries, 1);
                sqlDriver.getClass();
                List<ExpressivePaymentsStickerConfig> executeAsList = new SimpleQuery(1375235548, new String[]{"expressivePaymentsStickerConfig"}, sqlDriver, "ExpressivePaymentsStickerConfig.sq", "loadStickers", "SELECT expressivePaymentsStickerConfig.name, expressivePaymentsStickerConfig.main_url, expressivePaymentsStickerConfig.preview_url, expressivePaymentsStickerConfig.effects, expressivePaymentsStickerConfig.priority, expressivePaymentsStickerConfig.release_state, expressivePaymentsStickerConfig.tags, expressivePaymentsStickerConfig.is_default, expressivePaymentsStickerConfig.accessibility_description\nFROM expressivePaymentsStickerConfig\nORDER BY priority ASC", expressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                for (ExpressivePaymentsStickerConfig expressivePaymentsStickerConfig : executeAsList) {
                    String str = expressivePaymentsStickerConfig.name;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = expressivePaymentsStickerConfig.main_url;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = expressivePaymentsStickerConfig.preview_url;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    arrayList.add(new StickerMetadata(str, str3, str2, expressivePaymentsStickerConfig.accessibility_description));
                }
                return arrayList;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries = realPersonalizationRepository.cashDatabase.expressivePaymentsBackgroundConfigQueries;
                localTabContentQueries.getClass();
                ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 expressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 = ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2.INSTANCE;
                SqlDriver sqlDriver2 = localTabContentQueries.driver;
                ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0 expressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0 = new ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0);
                sqlDriver2.getClass();
                List executeAsList2 = new SimpleQuery(1455696628, new String[]{"expressivePaymentsBackgroundConfig"}, sqlDriver2, "ExpressivePaymentsBackgroundConfig.sq", "loadBackgrounds", "SELECT expressivePaymentsBackgroundConfig.name, expressivePaymentsBackgroundConfig.main_url, expressivePaymentsBackgroundConfig.preview_url, expressivePaymentsBackgroundConfig.background_color, expressivePaymentsBackgroundConfig.default_text_format, expressivePaymentsBackgroundConfig.effects, expressivePaymentsBackgroundConfig.priority, expressivePaymentsBackgroundConfig.release_state, expressivePaymentsBackgroundConfig.tags, expressivePaymentsBackgroundConfig.is_default, expressivePaymentsBackgroundConfig.accessibility_description\nFROM expressivePaymentsBackgroundConfig\nORDER BY priority ASC", expressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0).executeAsList();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList2, 10));
                Iterator it = executeAsList2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(RealPersonalizationRepositoryKt.toBackgroundMetadata((ExpressivePaymentsBackgroundConfig) it.next()));
                }
                return arrayList2;
        }
    }
}
