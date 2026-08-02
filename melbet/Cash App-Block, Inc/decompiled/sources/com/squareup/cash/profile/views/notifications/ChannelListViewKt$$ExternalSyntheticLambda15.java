package com.squareup.cash.profile.views.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.viewmodels.Channel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChannelListViewKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Channel f$0;

    public /* synthetic */ ChannelListViewKt$$ExternalSyntheticLambda15(Channel channel, int i) {
        this.$r8$classId = i;
        this.f$0 = channel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = R.string.email_channel_type;
        Channel channel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    int ordinal = channel.channelType.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i2 = R.string.sms_channel_type;
                        } else if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            i2 = R.string.push_channel_type;
                        }
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal2 = channel.channelType.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            i2 = R.string.sms_channel_type;
                        } else if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            i2 = R.string.push_channel_type;
                        }
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
