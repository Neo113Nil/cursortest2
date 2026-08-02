package com.squareup.cash.appmessages.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.cash.ui.Color;
import java.time.Instant;
import kotlin.jvm.functions.Function1;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public final /* synthetic */ class FullScreenMessageQueries$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalTabContentQueries f$1;

    public /* synthetic */ FullScreenMessageQueries$$ExternalSyntheticLambda5(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                FullScreenMessageQueries$fullScreenMessagesByPriority$2 fullScreenMessageQueries$fullScreenMessagesByPriority$2 = FullScreenMessageQueries$fullScreenMessagesByPriority$2.INSTANCE;
                break;
            default:
                FullScreenMessageQueries$get$2 fullScreenMessageQueries$get$2 = FullScreenMessageQueries$get$2.INSTANCE;
                break;
        }
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v8, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Instant instant;
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        switch (i) {
            case 0:
                FullScreenMessageQueries$get$2 fullScreenMessageQueries$get$2 = FullScreenMessageQueries$get$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                Boolean bool = androidCursor.getBoolean(2);
                bool.getClass();
                ?? bytes = androidCursor.getBytes(3);
                Video video = bytes != 0 ? (Video) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).application).decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(4);
                AppMessageAction appMessageAction = bytes2 != 0 ? (AppMessageAction) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).defaults).decode(bytes2) : null;
                ?? bytes3 = androidCursor.getBytes(5);
                AppMessageAction appMessageAction2 = bytes3 != 0 ? (AppMessageAction) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).mainCoroutineContextLazy).decode(bytes3) : null;
                ?? bytes4 = androidCursor.getBytes(6);
                Color color = bytes4 != 0 ? (Color) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).memoryCacheLazy).decode(bytes4) : null;
                ?? bytes5 = androidCursor.getBytes(7);
                Color color2 = bytes5 != 0 ? (Color) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).diskCacheLazy).decode(bytes5) : null;
                ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter;
                imageLoader$Builder.getClass();
                Long l = androidCursor.getLong(8);
                l.getClass();
                Integer valueOf = Integer.valueOf((int) l.longValue());
                AsyncTimeout.Companion companion = (AsyncTimeout.Companion) imageLoader$Builder.eventListenerFactory;
                Long l2 = androidCursor.getLong(9);
                l2.getClass();
                Object decode = companion.decode(l2);
                String string3 = androidCursor.getString(10);
                FullScreenMessage.Placement placement = string3 != null ? (FullScreenMessage.Placement) ((EnumColumnAdapter) imageLoader$Builder.componentRegistry).decode(string3) : null;
                Long l3 = androidCursor.getLong(11);
                instant = l3 != null ? (Instant) ((AsyncTimeout.Companion) imageLoader$Builder.extras).decode(Long.valueOf(l3.longValue())) : null;
                boolean booleanValue = bool.booleanValue();
                int intValue = valueOf.intValue();
                Instant instant2 = (Instant) decode;
                instant2.getClass();
                return new FullScreenMessage(m1431m, string2, booleanValue, video, appMessageAction, appMessageAction2, color, color2, intValue, instant2, placement, instant);
            default:
                FullScreenMessageQueries$fullScreenMessagesByPriority$2 fullScreenMessageQueries$fullScreenMessagesByPriority$2 = FullScreenMessageQueries$fullScreenMessagesByPriority$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string4 = androidCursor2.getString(1);
                Boolean bool2 = androidCursor2.getBoolean(2);
                bool2.getClass();
                ?? bytes6 = androidCursor2.getBytes(3);
                Video video2 = bytes6 != 0 ? (Video) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).application).decode(bytes6) : null;
                ?? bytes7 = androidCursor2.getBytes(4);
                AppMessageAction appMessageAction3 = bytes7 != 0 ? (AppMessageAction) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).defaults).decode(bytes7) : null;
                ?? bytes8 = androidCursor2.getBytes(5);
                AppMessageAction appMessageAction4 = bytes8 != 0 ? (AppMessageAction) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).mainCoroutineContextLazy).decode(bytes8) : null;
                ?? bytes9 = androidCursor2.getBytes(6);
                Color color3 = bytes9 != 0 ? (Color) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).memoryCacheLazy).decode(bytes9) : null;
                ?? bytes10 = androidCursor2.getBytes(7);
                Color color4 = bytes10 != 0 ? (Color) ((WireAdapter) ((ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter).diskCacheLazy).decode(bytes10) : null;
                ImageLoader$Builder imageLoader$Builder2 = (ImageLoader$Builder) localTabContentQueries.local_tab_contentAdapter;
                imageLoader$Builder2.getClass();
                Long l4 = androidCursor2.getLong(8);
                l4.getClass();
                Integer valueOf2 = Integer.valueOf((int) l4.longValue());
                AsyncTimeout.Companion companion2 = (AsyncTimeout.Companion) imageLoader$Builder2.eventListenerFactory;
                Long l5 = androidCursor2.getLong(9);
                l5.getClass();
                Object decode2 = companion2.decode(l5);
                String string5 = androidCursor2.getString(10);
                FullScreenMessage.Placement placement2 = string5 != null ? (FullScreenMessage.Placement) ((EnumColumnAdapter) imageLoader$Builder2.componentRegistry).decode(string5) : null;
                Long l6 = androidCursor2.getLong(11);
                instant = l6 != null ? (Instant) ((AsyncTimeout.Companion) imageLoader$Builder2.extras).decode(Long.valueOf(l6.longValue())) : null;
                boolean booleanValue2 = bool2.booleanValue();
                int intValue2 = valueOf2.intValue();
                Instant instant3 = (Instant) decode2;
                instant3.getClass();
                return new FullScreenMessage(m1431m2, string4, booleanValue2, video2, appMessageAction3, appMessageAction4, color3, color4, intValue2, instant3, placement2, instant);
        }
    }
}
