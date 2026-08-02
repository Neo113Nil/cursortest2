package com.squareup.cash.moneybot.backend;

import com.squareup.cash.moneybot.backend.api.MoneybotChatScrollPosition;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.values.RecentMoneybotSession;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class RealMoneybotChatMessagesCache {
    public MoneybotChatScrollPosition cachedScrollPosition;
    public final AndroidClock clock;
    public final KeyValue recentMoneybotSessionPref;
    public final LinkedHashMap cachedChats = new LinkedHashMap();
    public final LinkedHashSet deletedSessionIds = new LinkedHashSet();

    public RealMoneybotChatMessagesCache(AndroidClock androidClock, KeyValue keyValue) {
        this.clock = androidClock;
        this.recentMoneybotSessionPref = keyValue;
    }

    public final Object setRecentSession(RecentMoneybotSession recentMoneybotSession, SuspendLambda suspendLambda) {
        KeyValue keyValue = this.recentMoneybotSessionPref;
        if (recentMoneybotSession == null) {
            Object delete = keyValue.delete(suspendLambda);
            return delete == CoroutineSingletons.COROUTINE_SUSPENDED ? delete : Unit.INSTANCE;
        }
        Object obj = keyValue.set(recentMoneybotSession, suspendLambda);
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
    }
}
