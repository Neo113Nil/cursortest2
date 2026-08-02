package com.squareup.cash.db2;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                ExpressivePaymentsStickerConfigQueries$loadStickers$2 expressivePaymentsStickerConfigQueries$loadStickers$2 = ExpressivePaymentsStickerConfigQueries$loadStickers$2.INSTANCE;
                break;
            default:
                ExpressivePaymentsStickerConfigQueries$stickersForState$2 expressivePaymentsStickerConfigQueries$stickersForState$2 = ExpressivePaymentsStickerConfigQueries$stickersForState$2.INSTANCE;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        List list;
        Integer num2;
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                ExpressivePaymentsStickerConfigQueries$stickersForState$2 expressivePaymentsStickerConfigQueries$stickersForState$2 = ExpressivePaymentsStickerConfigQueries$stickersForState$2.INSTANCE;
                ExpressivePaymentsStickerConfig.Adapter adapter = (ExpressivePaymentsStickerConfig.Adapter) instrumentQueries.instrumentAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                String string3 = androidCursor.getString(1);
                String string4 = androidCursor.getString(2);
                ?? bytes = androidCursor.getBytes(3);
                List list2 = bytes != 0 ? (List) adapter.effectsAdapter.decode(bytes) : null;
                Long l = androidCursor.getLong(4);
                if (l != null) {
                    long longValue = l.longValue();
                    adapter.getClass();
                    num = Integer.valueOf((int) longValue);
                } else {
                    num = null;
                }
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 5, adapter.release_stateAdapter);
                ?? bytes2 = androidCursor.getBytes(6);
                list = bytes2 != 0 ? (List) adapter.tagsAdapter.decode(bytes2) : null;
                Boolean bool = androidCursor.getBoolean(7);
                bool.getClass();
                String string5 = androidCursor.getString(8);
                ReleaseState releaseState = (ReleaseState) m;
                boolean booleanValue = bool.booleanValue();
                releaseState.getClass();
                return new ExpressivePaymentsStickerConfig(string2, string3, string4, list2, num, releaseState, list, booleanValue, string5);
            default:
                ExpressivePaymentsStickerConfigQueries$loadStickers$2 expressivePaymentsStickerConfigQueries$loadStickers$2 = ExpressivePaymentsStickerConfigQueries$loadStickers$2.INSTANCE;
                ExpressivePaymentsStickerConfig.Adapter adapter2 = (ExpressivePaymentsStickerConfig.Adapter) instrumentQueries.instrumentAdapter;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string6 = androidCursor2.getString(0);
                String string7 = androidCursor2.getString(1);
                String string8 = androidCursor2.getString(2);
                ?? bytes3 = androidCursor2.getBytes(3);
                List list3 = bytes3 != 0 ? (List) adapter2.effectsAdapter.decode(bytes3) : null;
                Long l2 = androidCursor2.getLong(4);
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    adapter2.getClass();
                    num2 = Integer.valueOf((int) longValue2);
                } else {
                    num2 = null;
                }
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 5, adapter2.release_stateAdapter);
                ?? bytes4 = androidCursor2.getBytes(6);
                list = bytes4 != 0 ? (List) adapter2.tagsAdapter.decode(bytes4) : null;
                Boolean bool2 = androidCursor2.getBoolean(7);
                bool2.getClass();
                String string9 = androidCursor2.getString(8);
                ReleaseState releaseState2 = (ReleaseState) m2;
                boolean booleanValue2 = bool2.booleanValue();
                releaseState2.getClass();
                return new ExpressivePaymentsStickerConfig(string6, string7, string8, list3, num2, releaseState2, list, booleanValue2, string9);
        }
    }
}
