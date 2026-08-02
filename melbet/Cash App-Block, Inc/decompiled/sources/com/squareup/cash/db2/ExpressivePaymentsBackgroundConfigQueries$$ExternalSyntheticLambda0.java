package com.squareup.cash.db2;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import coil3.ComponentRegistry;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.protos.cash.ui.Color;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalTabContentQueries f$1;

    public /* synthetic */ ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2 expressivePaymentsBackgroundConfigQueries$backgroundsForState$2 = ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2.INSTANCE;
                break;
            default:
                ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 expressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 = ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2.INSTANCE;
                break;
        }
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        List list;
        Integer num2;
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        switch (i) {
            case 0:
                ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 expressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 = ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2.INSTANCE;
                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                String string3 = androidCursor.getString(1);
                String string4 = androidCursor.getString(2);
                ?? bytes = androidCursor.getBytes(3);
                Color color = bytes != 0 ? (Color) ((WireAdapter) builder.interceptors).decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(4);
                TextFormat textFormat = bytes2 != 0 ? (TextFormat) ((WireAdapter) builder.mappers).decode(bytes2) : null;
                ?? bytes3 = androidCursor.getBytes(5);
                List list2 = bytes3 != 0 ? (List) ((WireRepeatedAdapter) builder.keyers).decode(bytes3) : null;
                Long l = androidCursor.getLong(6);
                if (l != null) {
                    long longValue = l.longValue();
                    builder.getClass();
                    num = Integer.valueOf((int) longValue);
                } else {
                    num = null;
                }
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 7, (EnumColumnAdapter) builder.lazyFetcherFactories);
                ?? bytes4 = androidCursor.getBytes(8);
                list = bytes4 != 0 ? (List) ((WireRepeatedAdapter) builder.lazyDecoderFactories).decode(bytes4) : null;
                Boolean bool = androidCursor.getBoolean(9);
                bool.getClass();
                String string5 = androidCursor.getString(10);
                ReleaseState releaseState = (ReleaseState) m;
                boolean booleanValue = bool.booleanValue();
                releaseState.getClass();
                return new ExpressivePaymentsBackgroundConfig(string2, string3, string4, color, textFormat, list2, num, releaseState, list, booleanValue, string5);
            default:
                ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2 expressivePaymentsBackgroundConfigQueries$backgroundsForState$2 = ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2.INSTANCE;
                ComponentRegistry.Builder builder2 = (ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string6 = androidCursor2.getString(0);
                String string7 = androidCursor2.getString(1);
                String string8 = androidCursor2.getString(2);
                ?? bytes5 = androidCursor2.getBytes(3);
                Color color2 = bytes5 != 0 ? (Color) ((WireAdapter) builder2.interceptors).decode(bytes5) : null;
                ?? bytes6 = androidCursor2.getBytes(4);
                TextFormat textFormat2 = bytes6 != 0 ? (TextFormat) ((WireAdapter) builder2.mappers).decode(bytes6) : null;
                ?? bytes7 = androidCursor2.getBytes(5);
                List list3 = bytes7 != 0 ? (List) ((WireRepeatedAdapter) builder2.keyers).decode(bytes7) : null;
                Long l2 = androidCursor2.getLong(6);
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    builder2.getClass();
                    num2 = Integer.valueOf((int) longValue2);
                } else {
                    num2 = null;
                }
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 7, (EnumColumnAdapter) builder2.lazyFetcherFactories);
                ?? bytes8 = androidCursor2.getBytes(8);
                list = bytes8 != 0 ? (List) ((WireRepeatedAdapter) builder2.lazyDecoderFactories).decode(bytes8) : null;
                Boolean bool2 = androidCursor2.getBoolean(9);
                bool2.getClass();
                String string9 = androidCursor2.getString(10);
                ReleaseState releaseState2 = (ReleaseState) m2;
                boolean booleanValue2 = bool2.booleanValue();
                releaseState2.getClass();
                return new ExpressivePaymentsBackgroundConfig(string6, string7, string8, color2, textFormat2, list3, num2, releaseState2, list, booleanValue2, string9);
        }
    }
}
