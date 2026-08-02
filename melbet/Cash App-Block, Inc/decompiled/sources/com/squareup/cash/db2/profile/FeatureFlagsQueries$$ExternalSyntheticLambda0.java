package com.squareup.cash.db2.profile;

import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.userjourneys.data.UserJourney;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class FeatureFlagsQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ FeatureFlagsQueries$$ExternalSyntheticLambda0(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    androidStatement.bindString(i2, (String) it.next());
                    i2++;
                }
                return Unit.INSTANCE;
            default:
                UserJourney userJourney = (UserJourney) obj;
                userJourney.getClass();
                return Boolean.valueOf(arrayList.contains(userJourney.getId()));
        }
    }
}
