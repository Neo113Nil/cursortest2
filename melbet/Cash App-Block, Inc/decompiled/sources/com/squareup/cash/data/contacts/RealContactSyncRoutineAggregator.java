package com.squareup.cash.data.contacts;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactSyncRoutineAggregator {
    public final ContactsSyncRoutine contactDatabaseRoutine;
    public final ContactsSyncRoutine contactsSyncToServerRoutine;
    public final ContactsSyncRoutine detailedContactsSyncEncryptedRoutine;
    public final Channel events;
    public final Job job;
    public final CoroutineScope scope;

    public RealContactSyncRoutineAggregator(Channel channel, ContactsSyncRoutine contactsSyncRoutine, ContactsSyncRoutine contactsSyncRoutine2, ContactsSyncRoutine contactsSyncRoutine3, Job job, CoroutineScope coroutineScope) {
        channel.getClass();
        coroutineScope.getClass();
        this.events = channel;
        this.contactDatabaseRoutine = contactsSyncRoutine;
        this.detailedContactsSyncEncryptedRoutine = contactsSyncRoutine2;
        this.contactsSyncToServerRoutine = contactsSyncRoutine3;
        this.job = job;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object hasNotStarted$suspendImpl(RealContactSyncRoutineAggregator realContactSyncRoutineAggregator, ContinuationImpl continuationImpl) {
        ContactSyncRoutineAggregator$hasNotStarted$1 contactSyncRoutineAggregator$hasNotStarted$1;
        int i;
        if (continuationImpl instanceof ContactSyncRoutineAggregator$hasNotStarted$1) {
            contactSyncRoutineAggregator$hasNotStarted$1 = (ContactSyncRoutineAggregator$hasNotStarted$1) continuationImpl;
            int i2 = contactSyncRoutineAggregator$hasNotStarted$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                contactSyncRoutineAggregator$hasNotStarted$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = contactSyncRoutineAggregator$hasNotStarted$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactSyncRoutineAggregator$hasNotStarted$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    contactSyncRoutineAggregator$hasNotStarted$1.label = 1;
                    obj = Boolean.valueOf(realContactSyncRoutineAggregator.job != null);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }
        contactSyncRoutineAggregator$hasNotStarted$1 = new ContactSyncRoutineAggregator$hasNotStarted$1(realContactSyncRoutineAggregator, continuationImpl);
        Object obj3 = contactSyncRoutineAggregator$hasNotStarted$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactSyncRoutineAggregator$hasNotStarted$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj3).booleanValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealContactSyncRoutineAggregator)) {
            return false;
        }
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator = (RealContactSyncRoutineAggregator) obj;
        return Intrinsics.areEqual(this.events, realContactSyncRoutineAggregator.events) && this.contactDatabaseRoutine.equals(realContactSyncRoutineAggregator.contactDatabaseRoutine) && this.detailedContactsSyncEncryptedRoutine.equals(realContactSyncRoutineAggregator.detailedContactsSyncEncryptedRoutine) && this.contactsSyncToServerRoutine.equals(realContactSyncRoutineAggregator.contactsSyncToServerRoutine) && Intrinsics.areEqual(this.job, realContactSyncRoutineAggregator.job) && Intrinsics.areEqual(this.scope, realContactSyncRoutineAggregator.scope);
    }

    public final int hashCode() {
        int hashCode = (this.contactsSyncToServerRoutine.hashCode() + ((this.detailedContactsSyncEncryptedRoutine.hashCode() + ((this.contactDatabaseRoutine.hashCode() + (this.events.hashCode() * 31)) * 31)) * 31)) * 31;
        Job job = this.job;
        return this.scope.hashCode() + ((hashCode + (job == null ? 0 : job.hashCode())) * 31);
    }

    public final String toString() {
        return "RealContactSyncRoutineAggregator(events=" + this.events + ", contactDatabaseRoutine=" + this.contactDatabaseRoutine + ", detailedContactsSyncEncryptedRoutine=" + this.detailedContactsSyncEncryptedRoutine + ", contactsSyncToServerRoutine=" + this.contactsSyncToServerRoutine + ", job=" + this.job + ", scope=" + this.scope + ")";
    }
}
