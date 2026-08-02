package com.squareup.cash.interaction;

import android.os.Looper;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.worker.ApplicationWorker;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import papa.Handlers;
import papa.InteractionEngine;
import papa.InteractionRuleClient;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;
import papa.InteractionScope;
import papa.SentEvent;

/* loaded from: classes.dex */
public final class UiInteractionLatencyAnalyzer implements ApplicationWorker {
    public final LinkedHashSet clients = new LinkedHashSet();
    public final InteractionScreenViewLogger interactionScreenViewLogger;
    public boolean isInitialized;

    public UiInteractionLatencyAnalyzer(InteractionScreenViewLogger interactionScreenViewLogger) {
        this.interactionScreenViewLogger = interactionScreenViewLogger;
    }

    public final void sendEvent(InteractionEvent interactionEvent) {
        for (InteractionRuleClient interactionRuleClient : this.clients) {
            interactionRuleClient.getClass();
            Duration.Companion companion = Duration.Companion;
            InteractionRuleClient$$ExternalSyntheticLambda0 interactionRuleClient$$ExternalSyntheticLambda0 = new InteractionRuleClient$$ExternalSyntheticLambda0(0, interactionRuleClient, new SentEvent(DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS), interactionEvent));
            Lazy lazy = Handlers.mainThreadHandler$delegate;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                interactionRuleClient$$ExternalSyntheticLambda0.invoke();
            } else {
                Handlers.getMainThreadHandler().post(new AFLogger$$ExternalSyntheticLambda0(interactionRuleClient$$ExternalSyntheticLambda0, 14));
            }
        }
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        if (this.isInitialized) {
            return Unit.INSTANCE;
        }
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(this, 10);
        InteractionRuleClient interactionRuleClient = new InteractionRuleClient(onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0);
        this.clients.add(interactionRuleClient);
        WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(this);
        Handlers.checkOnMainThread();
        InteractionScope interactionScope = new InteractionScope();
        webLoginConfigQueries$$ExternalSyntheticLambda0.invoke(interactionScope);
        interactionRuleClient.interactionEngines.add(new InteractionEngine(onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0, interactionScope));
        this.isInitialized = true;
        return Unit.INSTANCE;
    }
}
