package app.cash.badging.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class BadgingState {
    public final long activity;
    public final long balance;
    public final long bitcoin;
    public final long card;
    public final long familyAccounts;
    public final long identityVerification;
    public final long investing;
    public final long limits;
    public final long linkedBanks;
    public final long local;
    public final long offers;
    public final long paymentPad;
    public final long profilePersonal;
    public final long profileSupport;

    public BadgingState(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.activity = j;
        this.balance = j2;
        this.bitcoin = j3;
        this.card = j4;
        this.local = j5;
        this.offers = j6;
        this.familyAccounts = j7;
        this.investing = j8;
        this.identityVerification = j9;
        this.limits = j10;
        this.linkedBanks = j11;
        this.paymentPad = j12;
        this.profilePersonal = j13;
        this.profileSupport = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgingState)) {
            return false;
        }
        BadgingState badgingState = (BadgingState) obj;
        return this.activity == badgingState.activity && this.balance == badgingState.balance && this.bitcoin == badgingState.bitcoin && this.card == badgingState.card && this.local == badgingState.local && this.offers == badgingState.offers && this.familyAccounts == badgingState.familyAccounts && this.investing == badgingState.investing && this.identityVerification == badgingState.identityVerification && this.limits == badgingState.limits && this.linkedBanks == badgingState.linkedBanks && this.paymentPad == badgingState.paymentPad && this.profilePersonal == badgingState.profilePersonal && this.profileSupport == badgingState.profileSupport;
    }

    public final int hashCode() {
        return Long.hashCode(this.profileSupport) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.activity) * 31, 31, this.balance), 31, this.bitcoin), 31, this.card), 31, this.local), 31, this.offers), 31, this.familyAccounts), 31, this.investing), 31, this.identityVerification), 31, this.limits), 31, this.linkedBanks), 31, this.paymentPad), 31, this.profilePersonal);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.activity, "BadgingState(activity=", ", balance=");
        m1149m.append(this.balance);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.bitcoin, ", bitcoin=", ", card=", m1149m);
        m1149m.append(this.card);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.local, ", local=", ", offers=", m1149m);
        m1149m.append(this.offers);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.familyAccounts, ", familyAccounts=", ", investing=", m1149m);
        m1149m.append(this.investing);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.identityVerification, ", identityVerification=", ", limits=", m1149m);
        m1149m.append(this.limits);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.linkedBanks, ", linkedBanks=", ", paymentPad=", m1149m);
        m1149m.append(this.paymentPad);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.profilePersonal, ", profilePersonal=", ", profileSupport=", m1149m);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.profileSupport, ")", m1149m);
    }

    public /* synthetic */ BadgingState() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
    }
}
