package com.squareup.cash.clientrouting;

import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import dev.zacsweers.metro.internal.Factory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;

/* loaded from: classes.dex */
public final class ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public static final ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory INSTANCE$1 = new ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory(1);
    public static final ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory INSTANCE = new ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory(0);
    public static final ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory INSTANCE$2 = new ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory(2);
    public static final ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory INSTANCE$3 = new ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory(3);

    public /* synthetic */ ClientRoutingModule$Companion$ProvideClientRouteParserMetroFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ClientRoutesConfig clientRoutesConfig = ClientRoutesConfig.standard;
        switch (i) {
            case 0:
                return new RealClientRouteParser();
            case 1:
                return new RealClientRouteFormatter(clientRoutesConfig, 2);
            case 2:
                return clientRoutesConfig;
            default:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                newSingleThreadExecutor.getClass();
                return new ExecutorCoroutineDispatcherImpl(newSingleThreadExecutor);
        }
    }
}
