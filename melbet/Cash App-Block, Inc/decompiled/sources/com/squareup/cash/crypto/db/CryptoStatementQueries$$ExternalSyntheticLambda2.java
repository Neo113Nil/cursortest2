package com.squareup.cash.crypto.db;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.protos.cash.ui.Image;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CryptoStatementQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Serializable f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ CryptoStatementQueries$$ExternalSyntheticLambda2(String str, long j, String str2, String str3, Image image, GpsConfigQueries gpsConfigQueries) {
        this.f$0 = str;
        this.f$3 = j;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$4 = image;
        this.f$5 = gpsConfigQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$5;
        Serializable serializable = this.f$4;
        String str = this.f$2;
        String str2 = this.f$1;
        long j = this.f$3;
        String str3 = this.f$0;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str3, 1, str2);
                androidStatement.bindString(2, str);
                androidStatement.bindLong(3, Long.valueOf(j));
                androidStatement.bindString(4, (String) serializable);
                androidStatement.bindString(5, (String) obj2);
                break;
            default:
                Image image = (Image) serializable;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, str3);
                androidStatement2.bindLong(1, Long.valueOf(j));
                androidStatement2.bindString(2, str2);
                androidStatement2.bindString(3, str);
                androidStatement2.bindBytes(4, image != null ? (byte[]) ((Local_tab_content.Adapter) gpsConfigQueries.gpsConfigAdapter).responseAdapter.encode(image) : null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CryptoStatementQueries$$ExternalSyntheticLambda2(String str, String str2, String str3, long j, String str4, String str5) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = j;
        this.f$4 = str4;
        this.f$5 = str5;
    }
}
