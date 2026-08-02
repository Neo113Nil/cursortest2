package com.squareup.cash.card.onboarding.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalTabContentQueries f$1;

    public /* synthetic */ CardStudioQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                CardStudioQueries$select$2 cardStudioQueries$select$2 = CardStudioQueries$select$2.INSTANCE;
                break;
            default:
                CardStudioQueries$selectTemporaryState$2 cardStudioQueries$selectTemporaryState$2 = CardStudioQueries$selectTemporaryState$2.INSTANCE;
                break;
        }
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardTheme cardTheme;
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        switch (i) {
            case 0:
                CardStudioQueries$selectTemporaryState$2 cardStudioQueries$selectTemporaryState$2 = CardStudioQueries$selectTemporaryState$2.INSTANCE;
                RecipientConfig$Adapter recipientConfig$Adapter = (RecipientConfig$Adapter) localTabContentQueries.local_tab_contentAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                ?? bytes = androidCursor.getBytes(1);
                TouchData touchData = bytes != 0 ? (TouchData) recipientConfig$Adapter.pay_dataAdapter.decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(2);
                cardTheme = bytes2 != 0 ? (CardTheme) recipientConfig$Adapter.request_dataAdapter.decode(bytes2) : null;
                Boolean bool = androidCursor.getBoolean(3);
                bool.getClass();
                return cardStudioQueries$selectTemporaryState$2.invoke(m, touchData, cardTheme, bool);
            default:
                CardStudioQueries$select$2 cardStudioQueries$select$2 = CardStudioQueries$select$2.INSTANCE;
                RecipientConfig$Adapter recipientConfig$Adapter2 = (RecipientConfig$Adapter) localTabContentQueries.local_tab_contentAdapter;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m2 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                ?? bytes3 = androidCursor2.getBytes(1);
                TouchData touchData2 = bytes3 != 0 ? (TouchData) recipientConfig$Adapter2.pay_dataAdapter.decode(bytes3) : null;
                ?? bytes4 = androidCursor2.getBytes(2);
                cardTheme = bytes4 != 0 ? (CardTheme) recipientConfig$Adapter2.request_dataAdapter.decode(bytes4) : null;
                Boolean bool2 = androidCursor2.getBoolean(3);
                bool2.getClass();
                return cardStudioQueries$select$2.invoke(m2, touchData2, cardTheme, bool2);
        }
    }
}
