package com.squareup.cash.db2.profile;

import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class BalanceDataQueries$select$2 extends FunctionReferenceImpl implements Function15 {
    public static final BalanceDataQueries$select$2 INSTANCE = new BalanceDataQueries$select$2(15, BalanceData.class, "<init>", "<init>(ZIZLcom/squareup/protos/franklin/common/EnableCryptocurrencyTransferOutStatus;Ljava/lang/String;Ljava/util/List;Lcom/squareup/protos/franklin/common/ScheduledReloadData;ZLcom/squareup/protos/franklin/common/EnableCryptocurrencyTransferInStatus;Ljava/lang/String;ZLcom/squareup/protos/franklin/common/BalanceData$Button;Lcom/squareup/protos/franklin/common/BalanceData$Button;Lcom/squareup/protos/franklin/common/BalanceData$Button;Z)V", 0);

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = (EnableCryptocurrencyTransferOutStatus) obj4;
        List list = (List) obj6;
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = (EnableCryptocurrencyTransferInStatus) obj9;
        boolean booleanValue = ((Boolean) serializable).booleanValue();
        enableCryptocurrencyTransferOutStatus.getClass();
        list.getClass();
        enableCryptocurrencyTransferInStatus.getClass();
        return new BalanceData(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue(), enableCryptocurrencyTransferOutStatus, (String) obj5, list, (ScheduledReloadData) obj7, ((Boolean) obj8).booleanValue(), enableCryptocurrencyTransferInStatus, (String) obj10, ((Boolean) obj11).booleanValue(), (BalanceData.Button) obj12, (BalanceData.Button) obj13, (BalanceData.Button) obj14, booleanValue);
    }
}
