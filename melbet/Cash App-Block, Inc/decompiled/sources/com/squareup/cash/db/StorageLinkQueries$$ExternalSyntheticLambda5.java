package com.squareup.cash.db;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import app.cash.sqldelight.driver.android.AndroidStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class StorageLinkQueries$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda5(int i, long j, long j2) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        long j = this.f$1;
        long j2 = this.f$0;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, Long.valueOf(j2));
                androidStatement.bindLong(1, Long.valueOf(j));
                return Unit.INSTANCE;
            default:
                ((Density) obj).getClass();
                return new IntOffset((r8.mo230roundToPx0680j_4(DpSize.m1043getHeightD9Ej5fM(j)) + ((int) (j2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
        }
    }
}
