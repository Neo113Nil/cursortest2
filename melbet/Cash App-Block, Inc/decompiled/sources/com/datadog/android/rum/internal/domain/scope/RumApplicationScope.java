package com.datadog.android.rum.internal.domain.scope;

import androidx.room.util.DBUtil;
import coil3.request.OneShotDisposable;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class RumApplicationScope implements RumScope, RumViewChangedListener {
    public final GlideBuilder$1 accessibilitySnapshotManager;
    public final boolean backgroundTrackingEnabled;
    public final InfoProvider batteryInfoProvider;
    public final ArrayList childScopes;
    public final VitalMonitor cpuVitalMonitor;
    public final InfoProvider displayInfoProvider;
    public final OneShotDisposable firstPartyHostHeaderTypeResolver;
    public final VitalMonitor frameRateVitalMonitor;
    public final InitialResourceIdentifier initialResourceIdentifier;
    public final HurlStack insightsCollector;
    public boolean isAppStartedEventSent;
    public RumViewInfo lastActiveViewInfo;
    public final LastInteractionIdentifier lastInteractionIdentifier;
    public final VitalMonitor memoryVitalMonitor;
    public RumContext rumContext;
    public final Rum$createMonitor$1 rumSessionScopeStartupManagerFactory;
    public final float sampleRate;
    public final InternalSdkCore sdkCore;
    public final SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
    public final OneShotDisposable sessionListener;
    public final DefaultSlowFramesListener slowFramesListener;
    public final boolean trackFrustrations;

    public RumApplicationScope(String str, InternalSdkCore internalSdkCore, float f, boolean z, boolean z2, OneShotDisposable oneShotDisposable, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, SessionEndedMetricDispatcher sessionEndedMetricDispatcher, OneShotDisposable oneShotDisposable2, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, DefaultSlowFramesListener defaultSlowFramesListener, GlideBuilder$1 glideBuilder$1, InfoProvider infoProvider, InfoProvider infoProvider2, Rum$createMonitor$1 rum$createMonitor$1, HurlStack hurlStack) {
        str.getClass();
        oneShotDisposable.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        initialResourceIdentifier.getClass();
        glideBuilder$1.getClass();
        infoProvider.getClass();
        infoProvider2.getClass();
        hurlStack.getClass();
        this.sdkCore = internalSdkCore;
        this.sampleRate = f;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.firstPartyHostHeaderTypeResolver = oneShotDisposable;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.sessionEndedMetricDispatcher = sessionEndedMetricDispatcher;
        this.sessionListener = oneShotDisposable2;
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.lastInteractionIdentifier = lastInteractionIdentifier;
        this.slowFramesListener = defaultSlowFramesListener;
        this.accessibilitySnapshotManager = glideBuilder$1;
        this.batteryInfoProvider = infoProvider;
        this.displayInfoProvider = infoProvider2;
        this.rumSessionScopeStartupManagerFactory = rum$createMonitor$1;
        this.insightsCollector = hurlStack;
        this.rumContext = new RumContext(str, RumContext.NULL_UUID, false, null, null, null, null, 1, 1, 1, null, null, 0L, 0L, false);
        this.childScopes = CollectionsKt__CollectionsKt.mutableListOf(new RumSessionScope(this, internalSdkCore, sessionEndedMetricDispatcher, f, z, z2, this, oneShotDisposable, vitalMonitor, vitalMonitor2, vitalMonitor3, oneShotDisposable2, false, initialResourceIdentifier, lastInteractionIdentifier, defaultSlowFramesListener, glideBuilder$1, infoProvider, infoProvider2, rum$createMonitor$1, hurlStack));
    }

    public final RumSessionScope getActiveSession() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.childScopes.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((RumSessionScope) next).isActive) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            DBUtil.log$default(this.sdkCore.getInternalLogger(), 5, InternalLogger.Target.MAINTAINER, RumViewScope$stopScope$1.INSTANCE$1, null, false, 56);
        }
        return (RumSessionScope) CollectionsKt.lastOrNull((List) arrayList);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final Map getCustomAttributes() {
        return GlobalRumMonitor.get(this.sdkCore).getAttributes();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope getParentScope() {
        return null;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumContext getRumContext() {
        return this.rumContext;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope handleEvent(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        Function1 function12;
        boolean z;
        ArrayList arrayList;
        DatadogContext datadogContext2;
        DataWriter dataWriter2;
        RumViewInfo rumViewInfo;
        rumRawEvent.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        if (rumRawEvent instanceof RumRawEvent.SetSyntheticsTestAttribute) {
            RumRawEvent.SetSyntheticsTestAttribute setSyntheticsTestAttribute = (RumRawEvent.SetSyntheticsTestAttribute) rumRawEvent;
            this.rumContext = RumContext.copy$default(this.rumContext, null, false, null, null, null, null, 0, 0, 0, setSyntheticsTestAttribute.testId, setSyntheticsTestAttribute.resultId, 0L, 0L, false, 29695);
        }
        boolean z2 = rumRawEvent instanceof RumRawEvent.StartView;
        boolean z3 = z2 || (rumRawEvent instanceof RumRawEvent.StartAction);
        RumSessionScope activeSession = getActiveSession();
        ArrayList arrayList2 = this.childScopes;
        InternalSdkCore internalSdkCore = this.sdkCore;
        if (activeSession == null && z3) {
            RumSessionScope rumSessionScope = new RumSessionScope(this, internalSdkCore, this.sessionEndedMetricDispatcher, this.sampleRate, this.backgroundTrackingEnabled, this.trackFrustrations, this, this.firstPartyHostHeaderTypeResolver, this.cpuVitalMonitor, this.memoryVitalMonitor, this.frameRateVitalMonitor, this.sessionListener, true, this.initialResourceIdentifier, this.lastInteractionIdentifier, this.slowFramesListener, this.accessibilitySnapshotManager, this.batteryInfoProvider, this.displayInfoProvider, this.rumSessionScopeStartupManagerFactory, this.insightsCollector);
            arrayList = arrayList2;
            arrayList.add(rumSessionScope);
            if (z2 || (rumViewInfo = this.lastActiveViewInfo) == null) {
                datadogContext2 = datadogContext;
                function12 = function1;
                dataWriter2 = dataWriter;
            } else {
                RumRawEvent.StartView startView = new RumRawEvent.StartView(rumViewInfo.key, rumViewInfo.attributes, new Time());
                datadogContext2 = datadogContext;
                function12 = function1;
                dataWriter2 = dataWriter;
                rumSessionScope.handleEvent(startView, datadogContext2, function12, dataWriter2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((RumSessionScope) next).isActive) {
                    arrayList3.add(next);
                }
            }
            z = true;
            if (arrayList3.size() > 1) {
                DBUtil.log$default(internalSdkCore.getInternalLogger(), 5, InternalLogger.Target.TELEMETRY, RumViewScope$stopScope$1.INSTANCE$2, null, false, 56);
            }
        } else {
            function12 = function1;
            z = true;
            arrayList = arrayList2;
            datadogContext2 = datadogContext;
            dataWriter2 = dataWriter;
        }
        if (!(rumRawEvent instanceof RumRawEvent.SdkInit) && !this.isAppStartedEventSent) {
            Time eventTime = rumRawEvent.getEventTime();
            if (DdRumContentProvider.processImportance == 100) {
                long appStartTimeNs = internalSdkCore.getAppStartTimeNs();
                long nanos = TimeUnit.MILLISECONDS.toNanos(eventTime.timestamp);
                long j = eventTime.nanoTime;
                RumRawEvent.ApplicationStarted applicationStarted = new RumRawEvent.ApplicationStarted(new Time(((nanos - j) + appStartTimeNs) / 1000000, appStartTimeNs), j - appStartTimeNs);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((RumSessionScope) it2.next()).handleEvent(applicationStarted, datadogContext2, function12, dataWriter2) == null) {
                        it2.remove();
                    }
                }
                this.isAppStartedEventSent = z;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (((RumSessionScope) it3.next()).handleEvent(rumRawEvent, datadogContext2, function12, dataWriter2) == null) {
                it3.remove();
            }
        }
        return this;
    }
}
