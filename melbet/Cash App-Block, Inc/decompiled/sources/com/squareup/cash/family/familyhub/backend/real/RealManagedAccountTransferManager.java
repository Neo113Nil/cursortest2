package com.squareup.cash.family.familyhub.backend.real;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.family.familyhub.backend.api.ManagedAccountTransferManager$ManagedAccountTransferAction;
import com.squareup.cash.family.familyhub.backend.api.ManagedAccountTransferManager$ManagedAccountTransferType;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealManagedAccountTransferManager {
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final JCAContext transferService;
    public final SharedFlowImpl actions = FlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
    public final AtomicBoolean transferInProgress = new AtomicBoolean(false);

    public RealManagedAccountTransferManager(JCAContext jCAContext, SessionManager sessionManager, RealFamilyAccountsManager realFamilyAccountsManager, CoroutineScope coroutineScope) {
        this.transferService = jCAContext;
        this.sessionManager = sessionManager;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0143, code lost:
    
        if (r1.emit(r10, r14) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0122, code lost:
    
        if (r1.emit(r10, r14) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r1.emit(r8, r14) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (r8 == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        if (r8 == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if (r2 == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$doTransfer(RealManagedAccountTransferManager realManagedAccountTransferManager, ManagedAccountTransferManager$ManagedAccountTransferType managedAccountTransferManager$ManagedAccountTransferType, Money money, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RealManagedAccountTransferManager$doTransfer$1 realManagedAccountTransferManager$doTransfer$1;
        RealManagedAccountTransferManager$doTransfer$1 realManagedAccountTransferManager$doTransfer$12;
        Object m2172transferToDependenteH_QyT8;
        Throwable m4120exceptionOrNullimpl;
        JCAContext jCAContext = realManagedAccountTransferManager.transferService;
        SharedFlowImpl sharedFlowImpl = realManagedAccountTransferManager.actions;
        if (continuationImpl instanceof RealManagedAccountTransferManager$doTransfer$1) {
            realManagedAccountTransferManager$doTransfer$1 = (RealManagedAccountTransferManager$doTransfer$1) continuationImpl;
            int i = realManagedAccountTransferManager$doTransfer$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                realManagedAccountTransferManager$doTransfer$1.label = i - PKIFailureInfo.systemUnavail;
                realManagedAccountTransferManager$doTransfer$12 = realManagedAccountTransferManager$doTransfer$1;
                Object obj = realManagedAccountTransferManager$doTransfer$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = 1;
                switch (realManagedAccountTransferManager$doTransfer$12.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        PlatformKt.activeAccountToken(realManagedAccountTransferManager.sessionManager);
                        DerivedStateFlow mapState = StateFlowKt.mapState(realManagedAccountTransferManager.sponsorshipStateProvider.sponsorsFlow(), new FamilyActivityFixtures$$ExternalSyntheticLambda0(i2));
                        realManagedAccountTransferManager$doTransfer$12.L$0 = managedAccountTransferManager$ManagedAccountTransferType;
                        realManagedAccountTransferManager$doTransfer$12.L$1 = money;
                        realManagedAccountTransferManager$doTransfer$12.L$2 = str;
                        realManagedAccountTransferManager$doTransfer$12.L$3 = str2;
                        realManagedAccountTransferManager$doTransfer$12.L$4 = str3;
                        realManagedAccountTransferManager$doTransfer$12.label = 1;
                        obj = FlowKt.first(mapState, realManagedAccountTransferManager$doTransfer$12);
                        break;
                    case 1:
                        str3 = realManagedAccountTransferManager$doTransfer$12.L$4;
                        str2 = realManagedAccountTransferManager$doTransfer$12.L$3;
                        str = realManagedAccountTransferManager$doTransfer$12.L$2;
                        money = realManagedAccountTransferManager$doTransfer$12.L$1;
                        managedAccountTransferManager$ManagedAccountTransferType = realManagedAccountTransferManager$doTransfer$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        String str4 = str2;
                        Money money2 = money;
                        String str5 = str3;
                        String str6 = str;
                        Sponsor sponsor = (Sponsor) obj;
                        if ((sponsor != null ? sponsor.customer_token : null) != null) {
                            String m = Boxes$$ExternalSyntheticOutline1.m();
                            int ordinal = managedAccountTransferManager$ManagedAccountTransferType.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (str4 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("dependentInstrumentToken is required for WITHDRAW transfers");
                                    return null;
                                }
                                ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                                realManagedAccountTransferManager$doTransfer$12.L$0 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$1 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$2 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$3 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$4 = null;
                                realManagedAccountTransferManager$doTransfer$12.label = 4;
                                m2172transferToDependenteH_QyT8 = jCAContext.m2171transferFromDependenteH_QyT8(clientScenario, str5, m, money2, str4, realManagedAccountTransferManager$doTransfer$12);
                                break;
                            } else {
                                if (str6 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("sponsorInstrumentToken is required for ADD_MONEY transfers");
                                    return null;
                                }
                                ClientScenario clientScenario2 = ClientScenario.PAYMENT_FLOW;
                                realManagedAccountTransferManager$doTransfer$12.L$0 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$1 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$2 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$3 = null;
                                realManagedAccountTransferManager$doTransfer$12.L$4 = null;
                                realManagedAccountTransferManager$doTransfer$12.label = 3;
                                m2172transferToDependenteH_QyT8 = jCAContext.m2172transferToDependenteH_QyT8(clientScenario2, str5, m, money2, str6, realManagedAccountTransferManager$doTransfer$12);
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        ManagedAccountTransferManager$ManagedAccountTransferAction.Error error = new ManagedAccountTransferManager$ManagedAccountTransferAction.Error(new IllegalStateException("No sponsor found"));
                        realManagedAccountTransferManager$doTransfer$12.L$0 = null;
                        realManagedAccountTransferManager$doTransfer$12.L$1 = null;
                        realManagedAccountTransferManager$doTransfer$12.L$2 = null;
                        realManagedAccountTransferManager$doTransfer$12.L$3 = null;
                        realManagedAccountTransferManager$doTransfer$12.L$4 = null;
                        realManagedAccountTransferManager$doTransfer$12.label = 2;
                        break;
                        return coroutineSingletons;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        m2172transferToDependenteH_QyT8 = ((Result) obj).value;
                        Result.Companion companion = Result.Companion;
                        if (!(m2172transferToDependenteH_QyT8 instanceof Result.Failure)) {
                            ManagedAccountTransferManager$ManagedAccountTransferAction.Success success = new ManagedAccountTransferManager$ManagedAccountTransferAction.Success((ResponseContext) m2172transferToDependenteH_QyT8);
                            realManagedAccountTransferManager$doTransfer$12.L$0 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$1 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$2 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$3 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$4 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$10 = m2172transferToDependenteH_QyT8;
                            realManagedAccountTransferManager$doTransfer$12.label = 5;
                            break;
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m2172transferToDependenteH_QyT8);
                        if (m4120exceptionOrNullimpl != null) {
                            ManagedAccountTransferManager$ManagedAccountTransferAction.Error error2 = new ManagedAccountTransferManager$ManagedAccountTransferAction.Error(m4120exceptionOrNullimpl);
                            realManagedAccountTransferManager$doTransfer$12.L$0 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$1 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$2 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$3 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$4 = null;
                            realManagedAccountTransferManager$doTransfer$12.L$10 = m2172transferToDependenteH_QyT8;
                            realManagedAccountTransferManager$doTransfer$12.label = 6;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        m2172transferToDependenteH_QyT8 = realManagedAccountTransferManager$doTransfer$12.L$10;
                        SafeTrace.throwOnFailure(obj);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m2172transferToDependenteH_QyT8);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realManagedAccountTransferManager$doTransfer$1 = new RealManagedAccountTransferManager$doTransfer$1(realManagedAccountTransferManager, continuationImpl);
        realManagedAccountTransferManager$doTransfer$12 = realManagedAccountTransferManager$doTransfer$1;
        Object obj2 = realManagedAccountTransferManager$doTransfer$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i22 = 1;
        switch (realManagedAccountTransferManager$doTransfer$12.label) {
        }
    }
}
