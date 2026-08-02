package com.squareup.cash.clientrouting.routers.payments;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class P2PBlockListRouter {
    public final Navigator navigator;

    public P2PBlockListRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewBlockList viewBlockList) {
        BlockingContext blockingContext;
        viewBlockList.getClass();
        String str = viewBlockList.customerToken;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewBlockList.b64EncodedProto);
        if (decodeBase64 == null || (blockingContext = (BlockingContext) BlockingContext.ADAPTER.decode(decodeBase64)) == null) {
            blockingContext = BlockingContext.UNSPECIFIED;
        }
        this.navigator.goTo(new P2PListScreen(str, null, P2PScreenMode.BlockList.INSTANCE, blockingContext));
    }

    public final void route(ClientRoute.ViewAllowList viewAllowList) {
        viewAllowList.getClass();
        this.navigator.goTo(new P2PListScreen(viewAllowList.customerToken, null, new P2PScreenMode.AllowList(null), null));
    }
}
