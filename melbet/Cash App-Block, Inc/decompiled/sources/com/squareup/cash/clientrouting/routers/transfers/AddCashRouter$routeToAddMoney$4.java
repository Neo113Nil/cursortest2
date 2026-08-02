package com.squareup.cash.clientrouting.routers.transfers;

import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.transfers.data.TransferData;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddCashRouter$routeToAddMoney$4 extends AdaptedFunctionReference implements Function3 {
    public static final AddCashRouter$routeToAddMoney$4 INSTANCE = new AddCashRouter$routeToAddMoney$4(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Pair((JurisdictionConfigManager$JurisdictionConfig) obj, (TransferData) obj2);
    }
}
