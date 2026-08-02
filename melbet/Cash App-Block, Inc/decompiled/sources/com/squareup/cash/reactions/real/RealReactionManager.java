package com.squareup.cash.reactions.real;

import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.app.AppService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealReactionManager {
    public final Analytics analytics;
    public final AppService appService;
    public final CoroutineContext ioDispatcher;
    public final ConcurrentHashMap pending = new ConcurrentHashMap();
    public final CoroutineScope scope;

    public RealReactionManager(AppService appService, CoroutineContext coroutineContext, CoroutineScope coroutineScope, Analytics analytics) {
        this.appService = appService;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
        this.analytics = analytics;
    }

    public static /* synthetic */ void addReaction$default(RealReactionManager realReactionManager, String str, String str2, String str3, String str4, yf$$ExternalSyntheticLambda2 yf__externalsyntheticlambda2, int i) {
        if ((i & 32) != 0) {
            yf__externalsyntheticlambda2 = null;
        }
        realReactionManager.addReaction(str, str2, str3, str4, false, yf__externalsyntheticlambda2);
    }

    public final void addReaction(String str, String str2, String str3, String str4, boolean z, Function0 function0) {
        str.getClass();
        str3.getClass();
        this.pending.put(str, Unit.INSTANCE);
        JobKt.launch$default(this.scope, this.ioDispatcher, null, new RealReactionManager$addReaction$1(this, str2, str, str3, str4, z, function0, null), 2);
    }
}
