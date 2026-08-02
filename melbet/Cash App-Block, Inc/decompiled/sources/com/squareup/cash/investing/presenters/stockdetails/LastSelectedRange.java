package com.squareup.cash.investing.presenters.stockdetails;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class LastSelectedRange {
    public final ParcelableSnapshotMutableState range$delegate = Updater.mutableStateOf$default(null);
    public final Flow signOut;

    public LastSelectedRange(Flow flow, CoroutineScope coroutineScope) {
        this.signOut = flow;
        JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$load$2(this, null, 22), 3);
    }
}
