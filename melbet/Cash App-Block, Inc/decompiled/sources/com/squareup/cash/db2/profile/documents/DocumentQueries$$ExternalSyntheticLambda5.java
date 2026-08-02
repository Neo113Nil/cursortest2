package com.squareup.cash.db2.profile.documents;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.protos.document.VersionData;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class DocumentQueries$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ DocumentQueries$$ExternalSyntheticLambda5(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$2 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                break;
            default:
                DocumentQueries$selectForToken$2 documentQueries$selectForToken$2 = DocumentQueries$selectForToken$2.INSTANCE;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VersionData versionData;
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                DocumentQueries$selectForToken$2 documentQueries$selectForToken$2 = DocumentQueries$selectForToken$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                String string3 = androidCursor.getString(3);
                string3.getClass();
                Long l = androidCursor.getLong(4);
                String string4 = androidCursor.getString(5);
                String string5 = androidCursor.getString(6);
                ?? bytes = androidCursor.getBytes(7);
                versionData = bytes != 0 ? (VersionData) ((Local_tab_content.Adapter) instrumentQueries.instrumentAdapter).responseAdapter.decode(bytes) : null;
                String string6 = androidCursor.getString(8);
                m1431m.getClass();
                string2.getClass();
                m.getClass();
                string3.getClass();
                return new Document(m1431m, string2, m, string3, l, string4, string5, versionData, string6);
            default:
                DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$2 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string7 = androidCursor2.getString(1);
                String m2 = Matcher$$ExternalSyntheticOutline0.m(string7, androidCursor2, 2);
                String string8 = androidCursor2.getString(3);
                string8.getClass();
                Long l2 = androidCursor2.getLong(4);
                String string9 = androidCursor2.getString(5);
                String string10 = androidCursor2.getString(6);
                ?? bytes2 = androidCursor2.getBytes(7);
                versionData = bytes2 != 0 ? (VersionData) ((Local_tab_content.Adapter) instrumentQueries.instrumentAdapter).responseAdapter.decode(bytes2) : null;
                String string11 = androidCursor2.getString(8);
                m1431m2.getClass();
                string7.getClass();
                m2.getClass();
                string8.getClass();
                return new Document(m1431m2, string7, m2, string8, l2, string9, string10, versionData, string11);
        }
    }
}
