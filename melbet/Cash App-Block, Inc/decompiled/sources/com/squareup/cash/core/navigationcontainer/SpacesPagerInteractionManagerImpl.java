package com.squareup.cash.core.navigationcontainer;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SpacesPagerInteractionManagerImpl {
    public final ParcelableSnapshotMutableState isPaused$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final MutexImpl mutex = new MutexImpl();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.squareup.cash.core.navigationcontainer.SpacesPagerInteractionManagerImpl, kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void pause(ContinuationImpl continuationImpl) {
        SpacesPagerInteractionManagerImpl$pause$1 spacesPagerInteractionManagerImpl$pause$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        try {
            if (continuationImpl instanceof SpacesPagerInteractionManagerImpl$pause$1) {
                spacesPagerInteractionManagerImpl$pause$1 = (SpacesPagerInteractionManagerImpl$pause$1) continuationImpl;
                int i3 = spacesPagerInteractionManagerImpl$pause$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    spacesPagerInteractionManagerImpl$pause$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = spacesPagerInteractionManagerImpl$pause$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = spacesPagerInteractionManagerImpl$pause$1.label;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.isPaused$delegate;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = this.mutex;
                        spacesPagerInteractionManagerImpl$pause$1.L$0 = mutexImpl;
                        i2 = 0;
                        spacesPagerInteractionManagerImpl$pause$1.I$0 = 0;
                        spacesPagerInteractionManagerImpl$pause$1.label = 1;
                        if (mutexImpl.lock(spacesPagerInteractionManagerImpl$pause$1) == coroutineSingletons) {
                            return;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return;
                            } else {
                                Mutex mutex = spacesPagerInteractionManagerImpl$pause$1.L$0;
                                SafeTrace.throwOnFailure(obj);
                                throw new KotlinNothingValueException();
                            }
                        }
                        int i4 = spacesPagerInteractionManagerImpl$pause$1.I$0;
                        ?? r1 = spacesPagerInteractionManagerImpl$pause$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        i2 = i4;
                        mutexImpl = r1;
                    }
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    spacesPagerInteractionManagerImpl$pause$1.L$0 = mutexImpl;
                    spacesPagerInteractionManagerImpl$pause$1.I$0 = i2;
                    spacesPagerInteractionManagerImpl$pause$1.label = 2;
                    JobKt.awaitCancellation(spacesPagerInteractionManagerImpl$pause$1);
                    return;
                }
            }
            if (i != 0) {
            }
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
            spacesPagerInteractionManagerImpl$pause$1.L$0 = mutexImpl;
            spacesPagerInteractionManagerImpl$pause$1.I$0 = i2;
            spacesPagerInteractionManagerImpl$pause$1.label = 2;
            JobKt.awaitCancellation(spacesPagerInteractionManagerImpl$pause$1);
            return;
        } finally {
        }
        spacesPagerInteractionManagerImpl$pause$1 = new SpacesPagerInteractionManagerImpl$pause$1(this, continuationImpl);
        Object obj2 = spacesPagerInteractionManagerImpl$pause$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spacesPagerInteractionManagerImpl$pause$1.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.isPaused$delegate;
    }
}
