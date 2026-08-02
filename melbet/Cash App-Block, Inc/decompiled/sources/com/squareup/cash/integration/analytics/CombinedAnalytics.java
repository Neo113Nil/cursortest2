package com.squareup.cash.integration.analytics;

import androidx.room.Room;
import androidx.tracing.Trace;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.UserJourneyEventMonitor;
import com.squareup.cash.cdf.UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal;
import com.squareup.cash.cdf.UserJourneyEventMonitor$JourneyEventType$AddTag;
import com.squareup.cash.cdf.UserJourneyEventMonitor$JourneyEventType$AddVariant;
import com.squareup.cash.cdf.UserJourneyEventMonitor$JourneyEventType$End;
import com.squareup.cash.cdf.UserJourneyEventMonitor$JourneyEventType$Start;
import com.squareup.cash.cdf.UserJourneyOutcome$Completed$Failed;
import com.squareup.cash.integration.analytics.CombinedAnalytics;
import com.squareup.cash.userjourneys.tracker.RealCdfJourneyMap;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourney$TerminationReason;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CombinedAnalytics implements Analytics {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object analyticsProviders;

    public CombinedAnalytics(Analytics[] analyticsArr) {
        this.analyticsProviders = analyticsArr;
    }

    public static final int access$getSortOrder(CombinedAnalytics combinedAnalytics, UserJourneyEventMonitor userJourneyEventMonitor) {
        Room room = userJourneyEventMonitor.eventType;
        if (room instanceof UserJourneyEventMonitor$JourneyEventType$Start) {
            return 0;
        }
        if (room instanceof UserJourneyEventMonitor$JourneyEventType$AddTag) {
            return 1;
        }
        if (room instanceof UserJourneyEventMonitor$JourneyEventType$AddVariant) {
            return 2;
        }
        if (room instanceof UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal) {
            return 3;
        }
        if (room instanceof UserJourneyEventMonitor$JourneyEventType$End) {
            return 5;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        UserJourney$Outcome terminated;
        int i = this.$r8$classId;
        Object obj = this.analyticsProviders;
        switch (i) {
            case 0:
                event.getClass();
                Analytics[] analyticsArr = (Analytics[]) obj;
                for (int i2 = 0; i2 < 4; i2++) {
                    analyticsArr[i2].track(event, l);
                }
                break;
            default:
                UserJourneyTracker userJourneyTracker = (UserJourneyTracker) obj;
                event.getClass();
                List list = (List) RealCdfJourneyMap.eventMonitors.get(event.getName());
                if (list != null) {
                    for (UserJourneyEventMonitor userJourneyEventMonitor : CollectionsKt.sortedWith(list, new Comparator() { // from class: com.squareup.cash.userjourneys.tracker.UserJourneyCdfEventMonitorTracker$track$$inlined$sortedBy$1
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            CombinedAnalytics combinedAnalytics = CombinedAnalytics.this;
                            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(CombinedAnalytics.access$getSortOrder(combinedAnalytics, (UserJourneyEventMonitor) obj2)), Integer.valueOf(CombinedAnalytics.access$getSortOrder(combinedAnalytics, (UserJourneyEventMonitor) obj3)));
                        }
                    })) {
                        if (Intrinsics.areEqual(event.getName(), userJourneyEventMonitor.cdfEvent.getName())) {
                            Map map = userJourneyEventMonitor.requiredParameters;
                            Map parameters = event.getParameters();
                            Set<Map.Entry> entrySet = map.entrySet();
                            if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                                for (Map.Entry entry : entrySet) {
                                    String str = (String) entry.getKey();
                                    if (!Intrinsics.areEqual(parameters.get(str), (String) entry.getValue())) {
                                        break;
                                    }
                                }
                            }
                            UserJourney$Name userJourneyName = Trace.toUserJourneyName(userJourneyEventMonitor.journeyName);
                            Room room = userJourneyEventMonitor.eventType;
                            if (room instanceof UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal) {
                                ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(userJourneyName, new UserJourney$Friction.CdfDefined(((UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal) room).signalName));
                            } else if (room instanceof UserJourneyEventMonitor$JourneyEventType$AddTag) {
                                final String str2 = ((UserJourneyEventMonitor$JourneyEventType$AddTag) room).tagName;
                                ((RealUserJourneyTracker) userJourneyTracker).addTag(userJourneyName, new zzaag(str2) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CdfDefinedTag
                                    public final String tag;

                                    {
                                        super(str2);
                                        this.tag = str2;
                                    }

                                    public final boolean equals(Object obj2) {
                                        if (this == obj2) {
                                            return true;
                                        }
                                        return (obj2 instanceof UserJourney$Tag$CdfDefinedTag) && this.tag.equals(((UserJourney$Tag$CdfDefinedTag) obj2).tag);
                                    }

                                    public final int hashCode() {
                                        return this.tag.hashCode();
                                    }

                                    public final String toString() {
                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CdfDefinedTag(tag=", this.tag, ")");
                                    }
                                });
                            } else if (room instanceof UserJourneyEventMonitor$JourneyEventType$AddVariant) {
                                final String str3 = ((UserJourneyEventMonitor$JourneyEventType$AddVariant) room).variantName;
                                ((RealUserJourneyTracker) userJourneyTracker).setVariant(userJourneyName, new zzaag(str3) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Variant$CdfDefined
                                    public final String variant;

                                    {
                                        super(str3);
                                        this.variant = str3;
                                    }

                                    public final boolean equals(Object obj2) {
                                        if (this == obj2) {
                                            return true;
                                        }
                                        return (obj2 instanceof UserJourney$Variant$CdfDefined) && this.variant.equals(((UserJourney$Variant$CdfDefined) obj2).variant);
                                    }

                                    public final int hashCode() {
                                        return this.variant.hashCode();
                                    }

                                    public final String toString() {
                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CdfDefined(variant=", this.variant, ")");
                                    }
                                });
                            } else if (room instanceof UserJourneyEventMonitor$JourneyEventType$End) {
                                UserJourneyOutcome$Completed$Failed userJourneyOutcome$Completed$Failed = ((UserJourneyEventMonitor$JourneyEventType$End) room).outcome;
                                if (userJourneyOutcome$Completed$Failed.equals(UserJourneyOutcome$Completed$Failed.INSTANCE$1)) {
                                    terminated = UserJourney$Outcome.Succeeded.INSTANCE;
                                } else if (userJourneyOutcome$Completed$Failed.equals(UserJourneyOutcome$Completed$Failed.INSTANCE$3)) {
                                    terminated = UserJourney$Outcome.UserCanceled.INSTANCE;
                                } else if (userJourneyOutcome$Completed$Failed.equals(UserJourneyOutcome$Completed$Failed.INSTANCE)) {
                                    terminated = UserJourney$Outcome.Failed.INSTANCE;
                                } else if (!userJourneyOutcome$Completed$Failed.equals(UserJourneyOutcome$Completed$Failed.INSTANCE$2)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    terminated = new UserJourney$Outcome.Terminated(UserJourney$TerminationReason.MISSING_BLOCKER_FLOW_OUTCOME);
                                }
                                ((RealUserJourneyTracker) userJourneyTracker).endJourney(userJourneyName, terminated);
                            } else if (!room.equals(UserJourneyEventMonitor$JourneyEventType$Start.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker, userJourneyName);
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public CombinedAnalytics(UserJourneyTracker userJourneyTracker, RealCdfJourneyMap realCdfJourneyMap) {
        this.analyticsProviders = userJourneyTracker;
    }
}
