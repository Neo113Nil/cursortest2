package com.squareup.cash.recipients.backend.real;

import androidx.room.util.DBUtil;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactRepository$contactByAlias$1;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.contacts.RealContactRepository$recents$$inlined$mapItems$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.ui.BlockState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class RealRecipientFinder {
    public final AppConfigManager appConfig;
    public final AppService appService;
    public final RealContactRepository contactRepository;
    public final FeatureFlagManager featureFlagManager;
    public final LookupCashtagService lookupCashtagService;

    public RealRecipientFinder(RealContactRepository realContactRepository, AppService appService, AppConfigManager appConfigManager, FeatureFlagManager featureFlagManager, LookupCashtagService lookupCashtagService) {
        this.contactRepository = realContactRepository;
        this.appService = appService;
        this.appConfig = appConfigManager;
        this.featureFlagManager = featureFlagManager;
        this.lookupCashtagService = lookupCashtagService;
    }

    public final Object findByAlias(String str, ContinuationImpl continuationImpl) {
        RealContactRepository realContactRepository = this.contactRepository;
        str.getClass();
        ContactQueries contactQueries = realContactRepository.contactQueries;
        BlockState blockState = BlockState.BLOCKED;
        RealContactRepository$contactByAlias$1 realContactRepository$contactByAlias$1 = RealContactRepository$contactByAlias$1.INSTANCE;
        contactQueries.getClass();
        return FlowKt.firstOrNull(new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new BadgeQueries$VersionQuery(contactQueries, str, blockState, new ContactQueries$$ExternalSyntheticLambda2(contactQueries, 2), 3)), realContactRepository.ioDispatcher), 5), continuationImpl);
    }

    public final Object findByCashtag(String str, String str2, ContinuationImpl continuationImpl) {
        RealContactRepository$recents$$inlined$mapItems$1 recents;
        RealContactRepository realContactRepository = this.contactRepository;
        recents = realContactRepository.recents(15L);
        int i = 2;
        Continuation continuation = null;
        return FlowKt.firstOrNull(FlowKt.transformLatest(FlowKt.take(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(recents, new RealTabProvider$setup$1$5(i, continuation, i), 1), new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(realContactRepository.contacts(), new RealTabProvider$setup$1$5(i, continuation, 3), 1), new RealRecipientFinder$findByCashtag$4(3, null, 0), 0), 1), new RealRecipientFinder$findByCashtag$$inlined$flatMapLatest$1(null, this, str2, str)), continuationImpl);
    }
}
