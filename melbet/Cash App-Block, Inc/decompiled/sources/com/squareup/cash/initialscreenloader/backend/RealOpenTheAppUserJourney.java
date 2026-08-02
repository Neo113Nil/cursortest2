package com.squareup.cash.initialscreenloader.backend;

import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$AccountPicker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$MainScreen;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$OnboardingFlow;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$PreSignIn;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$RestoredState;
import com.squareup.cash.userjourneys.tracker.UserJourney$Variant$OpenTheApp$SignedIn;
import com.squareup.cash.userjourneys.tracker.UserJourney$Variant$OpenTheApp$SignedOut;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class RealOpenTheAppUserJourney implements OpenTheAppUserJourney {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long timeout;
    public final ConnectionPool appProcessInfo;
    public final AndroidClock clock;
    public final Provider sessionManagerProvider;
    public final AtomicBoolean started;
    public final Provider userJourneyTrackerProvider;

    static {
        Duration.Companion companion = Duration.Companion;
        timeout = DurationKt.toDuration(15, DurationUnit.SECONDS);
    }

    public RealOpenTheAppUserJourney(Provider provider, ConnectionPool connectionPool, AndroidClock androidClock, Provider provider2, CoroutineScope coroutineScope) {
        provider.getClass();
        provider2.getClass();
        this.userJourneyTrackerProvider = provider;
        this.appProcessInfo = connectionPool;
        this.clock = androidClock;
        this.sessionManagerProvider = provider2;
        this.started = new AtomicBoolean(false);
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$4$1$1(this, null, 23), 3);
    }

    public final void onInitialScreenLoaded(OpenTheAppUserJourney.InitialScreen initialScreen) {
        zzaag zzaagVar;
        int ordinal = initialScreen.ordinal();
        if (ordinal == 0) {
            zzaagVar = UserJourney$Tag$OpenTheApp$OnboardingFlow.INSTANCE;
        } else if (ordinal == 1) {
            zzaagVar = UserJourney$Tag$OpenTheApp$PreSignIn.INSTANCE;
        } else if (ordinal == 2) {
            zzaagVar = UserJourney$Tag$OpenTheApp$AccountPicker.INSTANCE;
        } else if (ordinal == 3) {
            zzaagVar = UserJourney$Tag$OpenTheApp$MainScreen.INSTANCE;
        } else {
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            zzaagVar = UserJourney$Tag$OpenTheApp$RestoredState.INSTANCE;
        }
        Provider provider = this.userJourneyTrackerProvider;
        UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider.invoke();
        UserJourney$Name userJourney$Name = UserJourney$Name.OPEN_THE_APP;
        ((RealUserJourneyTracker) userJourneyTracker).addTag(userJourney$Name, zzaagVar);
        ((RealUserJourneyTracker) ((UserJourneyTracker) provider.invoke())).endJourney(userJourney$Name, UserJourney$Outcome.Succeeded.INSTANCE);
    }

    public final void setIsSignedIn(boolean z) {
        ((RealUserJourneyTracker) ((UserJourneyTracker) this.userJourneyTrackerProvider.invoke())).setVariant(UserJourney$Name.OPEN_THE_APP, z ? UserJourney$Variant$OpenTheApp$SignedIn.INSTANCE : UserJourney$Variant$OpenTheApp$SignedOut.INSTANCE);
    }

    /* renamed from: startJourney-NqJ4yvY, reason: not valid java name */
    public final void m3574startJourneyNqJ4yvY(long j, long j2, zzaag zzaagVar) {
        if (this.started.getAndSet(true)) {
            return;
        }
        Provider provider = this.userJourneyTrackerProvider;
        UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider.invoke();
        UserJourney$Name userJourney$Name = UserJourney$Name.OPEN_THE_APP;
        Duration duration = new Duration(j2);
        Duration duration2 = new Duration(j);
        RealUserJourneyTracker realUserJourneyTracker = (RealUserJourneyTracker) userJourneyTracker;
        realUserJourneyTracker.getClass();
        userJourney$Name.getClass();
        realUserJourneyTracker.m3787startJourneytmZmOBY(userJourney$Name, timeout, duration, duration2, false);
        setIsSignedIn(PlatformKt.hasOnboardedAccount((SessionManager) this.sessionManagerProvider.invoke()));
        ((RealUserJourneyTracker) ((UserJourneyTracker) provider.invoke())).addTag(userJourney$Name, zzaagVar);
    }
}
