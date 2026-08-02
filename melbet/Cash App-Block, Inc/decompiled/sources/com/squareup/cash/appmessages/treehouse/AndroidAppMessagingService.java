package com.squareup.cash.appmessages.treehouse;

import androidx.datastore.core.DataStoreImpl$data$1;
import com.squareup.cash.treehouse.appmessaging.RawAppMessagingService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class AndroidAppMessagingService implements RawAppMessagingService {
    public final Flow pendingMessages;
    public final BufferedChannel notifyBuffer = PapaEvent.Channel$default(-1, null, null, 6);
    public final SafeFlow displayActivityInlineMessage = new SafeFlow(new DataStoreImpl$data$1(this, (Continuation) null, 20));

    public AndroidAppMessagingService(Flow flow) {
        this.pendingMessages = flow;
    }

    @Override // com.squareup.cash.treehouse.appmessaging.RawAppMessagingService
    public final Flow getDisplayActivityInlineMessage() {
        return this.displayActivityInlineMessage;
    }
}
