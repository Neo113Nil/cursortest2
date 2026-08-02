package com.squareup.cash.db2.security;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.deposits.physical.db.AtmWithdrawalAddressSearchQueries$addresses$2;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries$addresses$2;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearchQueries$addresses$2;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PasswordInfoQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PasswordInfoQueries$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("LegalDocument");
                return Unit.INSTANCE;
            case 2:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("itemizedReceipt");
                return Unit.INSTANCE;
            case 3:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("itemizedReceipt");
                return Unit.INSTANCE;
            case 4:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 5:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("itemizedReceipt");
                return Unit.INSTANCE;
            case 6:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("rewardStatus");
                return Unit.INSTANCE;
            case 7:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("rewardStatus");
                return Unit.INSTANCE;
            case 8:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("passwordInfo");
                return Unit.INSTANCE;
            case 9:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("atmWithdrawalAddressSearch");
                return Unit.INSTANCE;
            case 10:
                AtmWithdrawalAddressSearchQueries$addresses$2 atmWithdrawalAddressSearchQueries$addresses$2 = AtmWithdrawalAddressSearchQueries$addresses$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Long l = androidCursor.getLong(1);
                l.getClass();
                String string2 = androidCursor.getString(2);
                string2.getClass();
                String string3 = androidCursor.getString(3);
                string3.getClass();
                return atmWithdrawalAddressSearchQueries$addresses$2.invoke(m1431m, l, string2, string3, androidCursor.getString(4), androidCursor.getDouble(5), androidCursor.getDouble(6));
            case 11:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, 10L);
                return Unit.INSTANCE;
            case 12:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("atmWithdrawalAddressSearch");
                return Unit.INSTANCE;
            case 13:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("atmWithdrawalAddressSearch");
                return Unit.INSTANCE;
            case 14:
                BitcoinMapAddressSearchQueries$addresses$2 bitcoinMapAddressSearchQueries$addresses$2 = BitcoinMapAddressSearchQueries$addresses$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                Long l2 = androidCursor2.getLong(1);
                l2.getClass();
                String string4 = androidCursor2.getString(2);
                string4.getClass();
                String string5 = androidCursor2.getString(3);
                string5.getClass();
                return bitcoinMapAddressSearchQueries$addresses$2.invoke(m1431m2, l2, string4, string5, androidCursor2.getString(4), androidCursor2.getDouble(5), androidCursor2.getDouble(6));
            case 15:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("bitcoinMapAddressSearch");
                return Unit.INSTANCE;
            case 16:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, 10L);
                return Unit.INSTANCE;
            case 17:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("bitcoinMapAddressSearch");
                return Unit.INSTANCE;
            case 18:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("bitcoinMapAddressSearch");
                return Unit.INSTANCE;
            case 19:
                PhysicalDepositUsAddressSearchQueries$addresses$2 physicalDepositUsAddressSearchQueries$addresses$2 = PhysicalDepositUsAddressSearchQueries$addresses$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                Long l3 = androidCursor3.getLong(1);
                l3.getClass();
                String string6 = androidCursor3.getString(2);
                string6.getClass();
                String string7 = androidCursor3.getString(3);
                string7.getClass();
                return physicalDepositUsAddressSearchQueries$addresses$2.invoke(m1431m3, l3, string6, string7, androidCursor3.getString(4), androidCursor3.getDouble(5), androidCursor3.getDouble(6));
            case 20:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("physicalDepositUsAddressSearch");
                return Unit.INSTANCE;
            case 21:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindLong(0, 10L);
                return Unit.INSTANCE;
            case 22:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("physicalDepositUsAddressSearch");
                return Unit.INSTANCE;
            case 23:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("physicalDepositUsAddressSearch");
                return Unit.INSTANCE;
            case 24:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("paperDepositBarcodeInfo");
                return Unit.INSTANCE;
            case 25:
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                Boolean bool = androidCursor4.getBoolean(0);
                bool.getClass();
                return bool;
            case 26:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new XInt(layoutSpec.getParent().m4374rightblrYgr0() - 6);
            case 27:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 28:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl);
            default:
                ((CashMapViewEvent) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
