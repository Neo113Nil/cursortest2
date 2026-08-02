package com.squareup.cash.db2.activity;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import java.io.Serializable;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class CashActivityQueries$recents$2 extends FunctionReferenceImpl implements Function15 {
    public static final CashActivityQueries$recents$2 INSTANCE = new CashActivityQueries$recents$2(15, ActivityCustomer.class, "<init>", "<init>(Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;ZLjava/lang/String;Lcom/squareup/protos/franklin/ui/MerchantData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/BlockState;Ljava/lang/Long;ZZZZ)V", 0);

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        String str = (String) obj3;
        String str2 = (String) obj5;
        BlockState blockState = (BlockState) obj10;
        boolean booleanValue = ((Boolean) obj12).booleanValue();
        boolean booleanValue2 = ((Boolean) obj13).booleanValue();
        boolean booleanValue3 = ((Boolean) obj14).booleanValue();
        boolean booleanValue4 = ((Boolean) serializable).booleanValue();
        str.getClass();
        str2.getClass();
        blockState.getClass();
        return new ActivityCustomer((Image) obj, (Color) obj2, str, ((Boolean) obj4).booleanValue(), str2, (MerchantData) obj6, (String) obj7, (String) obj8, (String) obj9, blockState, (Long) obj11, booleanValue, booleanValue2, booleanValue3, booleanValue4);
    }
}
