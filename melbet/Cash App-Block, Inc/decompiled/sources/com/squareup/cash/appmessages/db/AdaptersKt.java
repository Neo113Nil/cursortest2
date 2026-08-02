package com.squareup.cash.appmessages.db;

import androidx.datastore.core.SimpleActor;
import app.cash.sqldelight.EnumColumnAdapter;
import coil3.ComponentRegistry;
import coil3.ImageLoader$Builder;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.ProtoAdapter;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final ComponentRegistry.Builder cardMessageAdapter;
    public static final ImageLoader$Builder fullScreenMessageAdapter;
    public static final ComponentRegistry.Builder inAppNotificationMessageAdapter;
    public static final Reward$Adapter inlineMessageAdapter;
    public static final GrpcMethod inlineMessageV2Adapter;
    public static final Reward$Adapter popupMessageAdapter;
    public static final GrpcMethod sheetMessageAdapter;
    public static final SimpleActor tooltipMessageAdapter;

    static {
        EnumColumnAdapter enumColumnAdapter = new EnumColumnAdapter(InlineMessage.Placement.values());
        ProtoAdapter protoAdapter = Image.ADAPTER;
        WireAdapter wireAdapter = new WireAdapter(protoAdapter);
        ProtoAdapter protoAdapter2 = Animation.ADAPTER;
        WireAdapter wireAdapter2 = new WireAdapter(protoAdapter2);
        ProtoAdapter protoAdapter3 = AppMessageAction.ADAPTER;
        inlineMessageAdapter = new Reward$Adapter(enumColumnAdapter, wireAdapter, new WireAdapter(protoAdapter3), new WireAdapter(protoAdapter3), wireAdapter2, new EnumColumnAdapter(MessageType.values()), new AsyncTimeout.Companion());
        inlineMessageV2Adapter = new GrpcMethod(new EnumColumnAdapter(InlineV2Message.Placement.values()), new WireAdapter(UiAvatar.ADAPTER), new AsyncTimeout.Companion());
        cardMessageAdapter = new ComponentRegistry.Builder(new EnumColumnAdapter(CardMessage.Placement.values()), new WireAdapter(protoAdapter), new WireAdapter(protoAdapter3), new WireAdapter(protoAdapter2), new AsyncTimeout.Companion());
        popupMessageAdapter = new Reward$Adapter(new EnumColumnAdapter(PopupMessage.Placement.values()), new WireAdapter(protoAdapter), new WireAdapter(protoAdapter3), new WireAdapter(protoAdapter3), new WireAdapter(protoAdapter2), new AsyncTimeout.Companion(), new AsyncTimeout.Companion());
        sheetMessageAdapter = new GrpcMethod(new WireAdapter(HalfSheetMessage.ADAPTER), new AsyncTimeout.Companion(), new AsyncTimeout.Companion());
        inAppNotificationMessageAdapter = new ComponentRegistry.Builder(new WireAdapter(protoAdapter3), new WireAdapter(protoAdapter2), new WireAdapter(protoAdapter), new WireAdapter(protoAdapter), new AsyncTimeout.Companion());
        WireAdapter wireAdapter3 = new WireAdapter(Video.ADAPTER);
        WireAdapter wireAdapter4 = new WireAdapter(protoAdapter3);
        WireAdapter wireAdapter5 = new WireAdapter(protoAdapter3);
        ProtoAdapter protoAdapter4 = Color.ADAPTER;
        fullScreenMessageAdapter = new ImageLoader$Builder(wireAdapter3, wireAdapter4, wireAdapter5, new WireAdapter(protoAdapter4), new WireAdapter(protoAdapter4), new AsyncTimeout.Companion(), new EnumColumnAdapter(FullScreenMessage.Placement.values()), new AsyncTimeout.Companion());
        tooltipMessageAdapter = new SimpleActor(new EnumColumnAdapter(Placement.values()), new EnumColumnAdapter(TooltipMessage.ArrowPosition.values()), new WireAdapter(protoAdapter3), new AsyncTimeout.Companion(), 20);
    }
}
