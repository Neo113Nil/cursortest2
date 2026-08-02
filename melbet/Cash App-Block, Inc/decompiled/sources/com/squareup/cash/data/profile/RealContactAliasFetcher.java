package com.squareup.cash.data.profile;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.janus.api.JanusService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final class RealContactAliasFetcher {
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final JanusService janusService;
    public final InstrumentQueries profileAliasQueries;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactAliasType.values().length];
            try {
                ContactAliasType.Companion companion = ContactAliasType.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactAliasType.Companion companion2 = ContactAliasType.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealContactAliasFetcher(JanusService janusService, FeatureFlagManager featureFlagManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.janusService = janusService;
        this.featureFlagManager = featureFlagManager;
        this.ioDispatcher = coroutineContext;
        this.profileAliasQueries = cashAccountDatabaseImpl.profileAliasQueries;
    }

    public final Object fetchAndStoreAliases(SuspendLambda suspendLambda) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new GooglePayPresenter$models$1$1(this, null, 1), suspendLambda);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
