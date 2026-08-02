package com.squareup.cash.data.contacts;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.integration.contacts.RealContactBook;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.Channel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactSyncEventAggregator {
    public final RealContactBook contactBook;
    public final Channel events;
    public final Job readContactsJob;
    public final CoroutineScope scope;

    public RealContactSyncEventAggregator(Channel channel, RealContactBook realContactBook, Job job, CoroutineScope coroutineScope) {
        channel.getClass();
        coroutineScope.getClass();
        this.events = channel;
        this.contactBook = realContactBook;
        this.readContactsJob = job;
        this.scope = coroutineScope;
    }

    public static RealContactSyncEventAggregator copy$default(RealContactSyncEventAggregator realContactSyncEventAggregator, StandaloneCoroutine standaloneCoroutine) {
        Channel channel = realContactSyncEventAggregator.events;
        RealContactBook realContactBook = realContactSyncEventAggregator.contactBook;
        CoroutineScope coroutineScope = realContactSyncEventAggregator.scope;
        channel.getClass();
        coroutineScope.getClass();
        return new RealContactSyncEventAggregator(channel, realContactBook, standaloneCoroutine, coroutineScope);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealContactSyncEventAggregator) {
            RealContactSyncEventAggregator realContactSyncEventAggregator = (RealContactSyncEventAggregator) obj;
            if (Intrinsics.areEqual(this.events, realContactSyncEventAggregator.events) && this.contactBook == realContactSyncEventAggregator.contactBook && Intrinsics.areEqual(this.readContactsJob, realContactSyncEventAggregator.readContactsJob) && Intrinsics.areEqual(this.scope, realContactSyncEventAggregator.scope)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.contactBook.hashCode() + (this.events.hashCode() * 31)) * 31;
        Job job = this.readContactsJob;
        return this.scope.hashCode() + ((hashCode + (job == null ? 0 : job.hashCode())) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object stopContactsReading(ContinuationImpl continuationImpl) {
        RealContactSyncEventAggregator$stopContactsReading$1 realContactSyncEventAggregator$stopContactsReading$1;
        int i;
        if (continuationImpl instanceof RealContactSyncEventAggregator$stopContactsReading$1) {
            realContactSyncEventAggregator$stopContactsReading$1 = (RealContactSyncEventAggregator$stopContactsReading$1) continuationImpl;
            int i2 = realContactSyncEventAggregator$stopContactsReading$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactSyncEventAggregator$stopContactsReading$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactSyncEventAggregator$stopContactsReading$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactSyncEventAggregator$stopContactsReading$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = this.readContactsJob;
                    if (job != null) {
                        realContactSyncEventAggregator$stopContactsReading$1.label = 1;
                        if (JobKt.cancelAndJoin(job, realContactSyncEventAggregator$stopContactsReading$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return copy$default(this, null);
            }
        }
        realContactSyncEventAggregator$stopContactsReading$1 = new RealContactSyncEventAggregator$stopContactsReading$1(this, continuationImpl);
        Object obj2 = realContactSyncEventAggregator$stopContactsReading$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactSyncEventAggregator$stopContactsReading$1.label;
        if (i != 0) {
        }
        return copy$default(this, null);
    }

    public final String toString() {
        return "RealContactSyncEventAggregator(events=" + this.events + ", contactBook=" + this.contactBook + ", readContactsJob=" + this.readContactsJob + ", scope=" + this.scope + ")";
    }
}
