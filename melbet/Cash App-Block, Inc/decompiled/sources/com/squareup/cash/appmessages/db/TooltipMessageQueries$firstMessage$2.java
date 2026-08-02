package com.squareup.cash.appmessages.db;

import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class TooltipMessageQueries$firstMessage$2 extends FunctionReferenceImpl implements Function8 {
    public static final TooltipMessageQueries$firstMessage$2 INSTANCE = new TooltipMessageQueries$firstMessage$2(8, TooltipMessage.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;ZLcom/squareup/protos/cash/messagingplatformcommon/placements/Placement;Lcom/squareup/protos/cash/messagingplatformcommon/app/TooltipMessage$ArrowPosition;Lcom/squareup/protos/cash/messagingplatformcommon/app/AppMessageAction;ILjava/time/Instant;)V", 0);

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        String str = (String) obj;
        str.getClass();
        return new TooltipMessage(str, (String) obj2, ((Boolean) obj3).booleanValue(), (Placement) obj4, (TooltipMessage.ArrowPosition) obj5, (AppMessageAction) obj6, ((Number) obj7).intValue(), (Instant) serializable);
    }
}
