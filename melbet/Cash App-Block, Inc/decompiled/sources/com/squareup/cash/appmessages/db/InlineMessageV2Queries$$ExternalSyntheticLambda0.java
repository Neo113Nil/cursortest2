package com.squareup.cash.appmessages.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.GrpcMethod;
import java.time.Instant;
import kotlin.jvm.functions.Function1;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public final /* synthetic */ class InlineMessageV2Queries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalTabContentQueries f$1;

    public /* synthetic */ InlineMessageV2Queries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                InlineMessageV2Queries$inlineMessageByMessageToken$2 inlineMessageV2Queries$inlineMessageByMessageToken$2 = InlineMessageV2Queries$inlineMessageByMessageToken$2.INSTANCE;
                break;
            default:
                InlineMessageV2Queries$inlineMessagesByPriority$2 inlineMessageV2Queries$inlineMessagesByPriority$2 = InlineMessageV2Queries$inlineMessagesByPriority$2.INSTANCE;
                break;
        }
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Instant instant;
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        switch (i) {
            case 0:
                InlineMessageV2Queries$inlineMessagesByPriority$2 inlineMessageV2Queries$inlineMessagesByPriority$2 = InlineMessageV2Queries$inlineMessagesByPriority$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                Boolean bool = androidCursor.getBoolean(2);
                bool.getClass();
                String string3 = androidCursor.getString(3);
                InlineV2Message.Placement placement = string3 != null ? (InlineV2Message.Placement) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).decode(string3) : null;
                ?? bytes = androidCursor.getBytes(4);
                UiAvatar uiAvatar = bytes != 0 ? (UiAvatar) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).requestAdapter).decode(bytes) : null;
                String string4 = androidCursor.getString(5);
                String string5 = androidCursor.getString(6);
                String string6 = androidCursor.getString(7);
                ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l = androidCursor.getLong(8);
                l.getClass();
                Integer valueOf = Integer.valueOf((int) l.longValue());
                Long l2 = androidCursor.getLong(9);
                instant = l2 != null ? (Instant) ((AsyncTimeout.Companion) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).decode(Long.valueOf(l2.longValue())) : null;
                boolean booleanValue = bool.booleanValue();
                int intValue = valueOf.intValue();
                m1431m.getClass();
                return new InlineMessageV2(intValue, placement, uiAvatar, m1431m, string2, string4, string5, string6, instant, booleanValue);
            default:
                InlineMessageV2Queries$inlineMessageByMessageToken$2 inlineMessageV2Queries$inlineMessageByMessageToken$2 = InlineMessageV2Queries$inlineMessageByMessageToken$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string7 = androidCursor2.getString(1);
                Boolean bool2 = androidCursor2.getBoolean(2);
                bool2.getClass();
                String string8 = androidCursor2.getString(3);
                InlineV2Message.Placement placement2 = string8 != null ? (InlineV2Message.Placement) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).decode(string8) : null;
                ?? bytes2 = androidCursor2.getBytes(4);
                UiAvatar uiAvatar2 = bytes2 != 0 ? (UiAvatar) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).requestAdapter).decode(bytes2) : null;
                String string9 = androidCursor2.getString(5);
                String string10 = androidCursor2.getString(6);
                String string11 = androidCursor2.getString(7);
                ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l3 = androidCursor2.getLong(8);
                l3.getClass();
                Integer valueOf2 = Integer.valueOf((int) l3.longValue());
                Long l4 = androidCursor2.getLong(9);
                instant = l4 != null ? (Instant) ((AsyncTimeout.Companion) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).decode(Long.valueOf(l4.longValue())) : null;
                boolean booleanValue2 = bool2.booleanValue();
                int intValue2 = valueOf2.intValue();
                m1431m2.getClass();
                return new InlineMessageV2(intValue2, placement2, uiAvatar2, m1431m2, string7, string9, string10, string11, instant, booleanValue2);
        }
    }
}
