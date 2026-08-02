package com.squareup.cash.appmessages.presenters;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.wire.GrpcMethod;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealAppMessageActionPerformer$Factory$Impl {
    public final FileBlockerView.MetroFactory delegateFactory;

    public RealAppMessageActionPerformer$Factory$Impl(FileBlockerView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final GrpcMethod create$1(Navigator navigator) {
        navigator.getClass();
        FileBlockerView.MetroFactory metroFactory = this.delegateFactory;
        AppMessageClientService appMessageClientService = (AppMessageClientService) metroFactory.vibrator.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.permissionManager.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.activityEvents.value;
        appMessageClientService.getClass();
        realRouter$Factory$Impl.getClass();
        coroutineScope.getClass();
        navigator.getClass();
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.path = appMessageClientService;
        grpcMethod.requestAdapter = coroutineScope;
        grpcMethod.responseAdapter = realRouter$Factory$Impl.create$1(navigator);
        return grpcMethod;
    }
}
