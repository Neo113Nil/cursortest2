package com.squareup.cash.deposits.physical.db;

import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhysicalDepositsBarcodeQueries$select$2 extends FunctionReferenceImpl implements Function4 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public PhysicalDepositsBarcodeQueries$select$2() {
        super(4, PaperDepositBarcodeInfo.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/Long;Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositBarcodeResponse$Success;Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositBarcodeResponse$Failure;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new PaperDepositBarcodeInfo((Long) obj, (Long) obj2, (GetPaperCashDepositBarcodeResponse.Success) obj3, (GetPaperCashDepositBarcodeResponse.Failure) obj4);
    }
}
