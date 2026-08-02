package com.squareup.cash.account.settings.backend;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealCropResultManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.Storage;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealProfilePhotoManager$Factory$Impl {
    public final RememberEventDispatcher delegateFactory;

    public RealProfilePhotoManager$Factory$Impl(RememberEventDispatcher rememberEventDispatcher) {
        this.delegateFactory = rememberEventDispatcher;
    }

    public final RealProfilePhotoManager create$1(BetterNavigator.ScreenNavigator screenNavigator) {
        RememberEventDispatcher rememberEventDispatcher = this.delegateFactory;
        RealProfileManager realProfileManager = (RealProfileManager) ((Provider) rememberEventDispatcher.abandoning).invoke();
        RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl = (RealAccountOutboundNavigator$Factory$Impl) ((Provider) rememberEventDispatcher.traceContext).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) rememberEventDispatcher.remembering).invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((Provider) rememberEventDispatcher.currentRememberingList).invoke();
        CoroutineContext coroutineContext2 = (CoroutineContext) ((Provider) rememberEventDispatcher.leaving).invoke();
        AndroidFileProvider androidFileProvider = (AndroidFileProvider) ((Provider) rememberEventDispatcher.sideEffects).invoke();
        Flow flow = (Flow) ((InstanceFactory) rememberEventDispatcher.rememberSet).value;
        RealCropResultManager realCropResultManager = (RealCropResultManager) ((Provider) rememberEventDispatcher.releasing).invoke();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) rememberEventDispatcher.ignoreLeavingSet).value;
        AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) ((Provider) rememberEventDispatcher.pausedPlaceholders).invoke();
        Storage storage = (Storage) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
        realProfileManager.getClass();
        realAccountOutboundNavigator$Factory$Impl.getClass();
        androidStringManager.getClass();
        coroutineContext.getClass();
        coroutineContext2.getClass();
        androidFileProvider.getClass();
        flow.getClass();
        realCropResultManager.getClass();
        coroutineScope.getClass();
        androidPermissionManager.getClass();
        storage.getClass();
        return new RealProfilePhotoManager(realProfileManager, realAccountOutboundNavigator$Factory$Impl, androidStringManager, coroutineContext, coroutineContext2, androidFileProvider, flow, realCropResultManager, coroutineScope, androidPermissionManager, storage, screenNavigator);
    }
}
