package com.squareup.cash.family.profileselection.real;

import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.preferences.KeyValue;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes.dex */
public final class RealFamilyProfileManager {
    public final RealCustomerStore customerStore;
    public final ReadonlyStateFlow familyProfile;
    public final AndroidStringManager stringManager;

    public RealFamilyProfileManager(RealProfileManager realProfileManager, KeyValue keyValue, RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, CoroutineScope coroutineScope) {
        this.customerStore = realCustomerStore;
        this.stringManager = androidStringManager;
        this.familyProfile = FlowKt.stateIn(FlowKt.combine(realProfileManager.publicProfile(), keyValue.observe(), FlowKt.transformLatest(keyValue.observe(), new Badger$collect$$inlined$combine$2$3((Continuation) null, this, 3)), new RealFamilyProfileManager$familyProfile$2(4, null)), coroutineScope, SharingStarted.Companion.Eagerly, FamilyProfile.Standard.INSTANCE);
    }
}
