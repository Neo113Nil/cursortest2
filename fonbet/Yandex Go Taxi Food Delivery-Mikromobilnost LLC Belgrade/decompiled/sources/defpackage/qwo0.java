package defpackage;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes9.dex */
public final class qwo0 {
    public static final /* synthetic */ kgx[] B = {new MutablePropertyReference1Impl("isOldAgreementAccepted", 0, "isOldAgreementAccepted()Z", qwo0.class), new MutablePropertyReference1Impl("acceptedAgreementsTypes", 0, "getAcceptedAgreementsTypes()Ljava/util/Set;", qwo0.class), new MutablePropertyReference1Impl("shownOnboardingTypes", 0, "getShownOnboardingTypes()Ljava/util/Set;", qwo0.class), new MutablePropertyReference1Impl("jetLockInstructionShownNumber", 0, "getJetLockInstructionShownNumber()I", qwo0.class), new MutablePropertyReference1Impl("jetLockInstructionLastSeen", 0, "getJetLockInstructionLastSeen()J", qwo0.class), new MutablePropertyReference1Impl("shownDepositNotificationCount", 0, "getShownDepositNotificationCount()I", qwo0.class), new MutablePropertyReference1Impl("ridesCount", 0, "getRidesCount()I", qwo0.class), new MutablePropertyReference1Impl("selectedPaymentOptionType", 0, "getSelectedPaymentOptionType()I", qwo0.class), new MutablePropertyReference1Impl("selectedPaymentOptionPaymentId", 0, "getSelectedPaymentOptionPaymentId()Ljava/lang/String;", qwo0.class), new MutablePropertyReference1Impl("rideCardPauseButtonShownStories", 0, "getRideCardPauseButtonShownStories()Ljava/util/List;", qwo0.class), new MutablePropertyReference1Impl("ignitionAllowedByExperiment", 0, "getIgnitionAllowedByExperiment()Z", qwo0.class), new MutablePropertyReference1Impl("ignitionAllowedByUserState", 0, "getIgnitionAllowedByUserState()Z", qwo0.class), new MutablePropertyReference1Impl("ignitionEnabled", 0, "getIgnitionEnabled()Z", qwo0.class), new MutablePropertyReference1Impl("ignitionStaticUuidGroups", 0, "getIgnitionStaticUuidGroups()Ljava/util/Set;", qwo0.class), new MutablePropertyReference1Impl("ignitionDynamicUuids", 0, "getIgnitionDynamicUuids()Ljava/util/Set;", qwo0.class), new MutablePropertyReference1Impl("ignitionOnboardingShown", 0, "getIgnitionOnboardingShown()Z", qwo0.class), new MutablePropertyReference1Impl("ignitionBluetoothPermissionRequested", 0, "getIgnitionBluetoothPermissionRequested()Z", qwo0.class), new MutablePropertyReference1Impl("ignitionUserSessionUuid", 0, "getIgnitionUserSessionUuid()Ljava/lang/String;", qwo0.class), new MutablePropertyReference1Impl("ignitionShownBannersIds", 0, "getIgnitionShownBannersIds()Ljava/util/Set;", qwo0.class), new MutablePropertyReference1Impl("parkingPanoramaOnboardingShownNumber", 0, "getParkingPanoramaOnboardingShownNumber()I", qwo0.class), new MutablePropertyReference1Impl("wasPreactivationVoluntarySlowdownForNewbie", 0, "getWasPreactivationVoluntarySlowdownForNewbie()Z", qwo0.class), new MutablePropertyReference1Impl("vehicleActualPhotoTooltipShown", 0, "getVehicleActualPhotoTooltipShown()Z", qwo0.class), new MutablePropertyReference1Impl("newbieFlowInitialModalShown", 0, "getNewbieFlowInitialModalShown()Z", qwo0.class), new MutablePropertyReference1Impl("newbieFlowStarted", 0, "getNewbieFlowStarted()Z", qwo0.class), new MutablePropertyReference1Impl("newbieFlowProgressStep", 0, "getNewbieFlowProgressStep()I", qwo0.class), new MutablePropertyReference1Impl("newbieFlowCompleted", 0, "getNewbieFlowCompleted()Z", qwo0.class)};
    public final qme0 A;
    public final cne0 a;
    public final qme0 b;
    public final sme0 c;
    public final sme0 d;
    public final qdx e;
    public final sme0 f;
    public final qdx g;
    public final qdx h;
    public final qdx i;
    public final iid0 j;
    public final rme0 k;
    public final qme0 l;
    public final qme0 m;
    public final qme0 n;
    public final sme0 o;
    public final sme0 p;
    public final qme0 q;
    public final qme0 r;
    public final iid0 s;
    public final sme0 t;
    public final qdx u;
    public final qme0 v;
    public final qme0 w;
    public final qme0 x;
    public final qme0 y;
    public final qdx z;

    public qwo0(dne0 dne0Var) {
        cne0 a = dne0Var.a("ru.yandex.taxi.scooters.STORAGE");
        this.a = a;
        this.b = new qme0(0, a, a, "isAgreementAccepted");
        this.c = new sme0(1, a, a, "acceptedAgreementsTypes");
        this.d = new sme0(1, a, a, "shownOnboardingTypes");
        this.e = bvf0.C(a, "jetLockInstructionShownNumber");
        this.f = new sme0(0, a, a, "jetLockInstructionLastSeen");
        this.g = bvf0.C(a, "shownDepositNotificationCount");
        this.h = bvf0.C(a, "ridesCount");
        this.i = new qdx(-2, a, a, "selectedPaymentOptionType");
        this.j = new iid0(a, "selectedPaymentOptionPaymentId");
        this.k = new rme0(1, a, a, "rideCardPauseButtonShownStories");
        this.l = new qme0(0, a, a, "ignitionAllowedByExperiment");
        this.m = new qme0(0, a, a, "ignitionAllowedByUserState");
        this.n = new qme0(0, a, a, "ignitionEnabled");
        this.o = new sme0(1, a, a, "ignitionStaticUuidGroups");
        this.p = new sme0(1, a, a, "ignitionDynamicUuids");
        this.q = new qme0(0, a, a, "ignitionOnboardingShown");
        this.r = new qme0(0, a, a, "ignitionBluetoothPermissionRequested");
        this.s = new iid0(a, "ignitionUserSessionUuid");
        this.t = new sme0(1, a, a, "ignitionShownBannersIds");
        this.u = bvf0.C(a, "parkingPanoramaOnboardingShownNumber");
        this.v = new qme0(0, a, a, "wasPreactivationVoluntarySlowdownForNewbie");
        this.w = new qme0(0, a, a, "vehicleActualPhotoTooltipShown");
        this.x = new qme0(0, a, a, "newbieFlowInitialModalShown");
        this.y = new qme0(0, a, a, "newbieFlowStarted");
        this.z = bvf0.C(a, "newbieFlowProgressStep");
        this.A = new qme0(0, a, a, "newbieFlowCompleted");
    }

    public final boolean a() {
        return ((Boolean) this.q.getValue(this, B[15])).booleanValue();
    }

    public final Set b() {
        return (Set) this.t.getValue(this, B[18]);
    }

    public final int c() {
        return ((Number) this.z.getValue(this, B[24])).intValue();
    }

    public final boolean d() {
        return ((Boolean) this.w.getValue(this, B[21])).booleanValue();
    }
}
