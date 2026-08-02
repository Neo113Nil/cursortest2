package com.squareup.cash.moneybot.backend;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.model.chat.Session;
import com.squareup.cash.moneybot.backend.api.model.chat.SessionPage;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealUserSessionPager {
    public final ChatManager chatManager;
    public Long nextCursor;
    public final StateFlowImpl _sessions = FlowKt.MutableStateFlow(null);
    public boolean hasMoreSessions = true;

    public RealUserSessionPager(ChatManager chatManager) {
        this.chatManager = chatManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchNextPage(ContinuationImpl continuationImpl) {
        RealUserSessionPager$fetchNextPage$1 realUserSessionPager$fetchNextPage$1;
        int i;
        boolean z;
        if (continuationImpl instanceof RealUserSessionPager$fetchNextPage$1) {
            realUserSessionPager$fetchNextPage$1 = (RealUserSessionPager$fetchNextPage$1) continuationImpl;
            int i2 = realUserSessionPager$fetchNextPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUserSessionPager$fetchNextPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realUserSessionPager$fetchNextPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserSessionPager$fetchNextPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.hasMoreSessions) {
                        return new ApiResult.Success(Unit.INSTANCE);
                    }
                    Long l = this.nextCursor;
                    realUserSessionPager$fetchNextPage$1.label = 1;
                    obj = ((RealChatManager) this.chatManager).getUserSessions(l, realUserSessionPager$fetchNextPage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                if (z) {
                    SessionPage sessionPage = (SessionPage) ((ApiResult.Success) apiResult).response;
                    boolean isEmpty = sessionPage.sessions.isEmpty();
                    StateFlowImpl stateFlowImpl = this._sessions;
                    if (isEmpty) {
                        this.hasMoreSessions = false;
                        if (stateFlowImpl.getValue() == null) {
                            stateFlowImpl.setValue(EmptySet.INSTANCE);
                        }
                    } else {
                        Set set = (Set) stateFlowImpl.getValue();
                        ArrayList arrayList = sessionPage.sessions;
                        stateFlowImpl.setValue(set != null ? SetsKt___SetsKt.plus(set, (Iterable) arrayList) : CollectionsKt.toSet(arrayList));
                        this.nextCursor = sessionPage.nextCursor;
                    }
                }
                if (!z) {
                    return new ApiResult.Success(Unit.INSTANCE);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realUserSessionPager$fetchNextPage$1 = new RealUserSessionPager$fetchNextPage$1(this, continuationImpl);
        Object obj2 = realUserSessionPager$fetchNextPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserSessionPager$fetchNextPage$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        if (z) {
        }
        if (!z) {
        }
    }

    public final Unit removeSession(String str) {
        Object obj;
        StateFlowImpl stateFlowImpl = this._sessions;
        Set set = (Set) stateFlowImpl.getValue();
        if (set == null) {
            return Unit.INSTANCE;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Session) obj).id.equals(str)) {
                break;
            }
        }
        Session session = (Session) obj;
        if (session == null) {
            return Unit.INSTANCE;
        }
        LinkedHashSet minus = SetsKt___SetsKt.minus(set, session);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, minus);
        return Unit.INSTANCE;
    }
}
