package androidx.navigation;

import com.squareup.cash.cdf.InstrumentType;
import com.squareup.cash.cdf.instrument.InstrumentLinkReplace;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.transfers.presenters.InstrumentLinkingAnalyticsKt$WhenMappings;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class NavArgumentKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBalance.deepLinkSpecs;
    }

    public static final void logInstrumentLinkReplace(Analytics analytics, CashInstrumentType cashInstrumentType, String str) {
        cashInstrumentType.getClass();
        str.getClass();
        analytics.track(new InstrumentLinkReplace(str, toCdfInstrumentType(cashInstrumentType)), null);
    }

    public static final ArrayList missingRequiredArguments(Map map, Function1 function1) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            NavArgument navArgument = (NavArgument) entry.getValue();
            Boolean valueOf = navArgument != null ? Boolean.valueOf(navArgument.isNullable) : null;
            valueOf.getClass();
            if (!valueOf.booleanValue() && !navArgument.isDefaultValuePresent) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final InstrumentType toCdfInstrumentType(CashInstrumentType cashInstrumentType) {
        cashInstrumentType.getClass();
        switch (InstrumentLinkingAnalyticsKt$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()]) {
            case 1:
                return InstrumentType.DEBIT_CARD;
            case 2:
                return InstrumentType.BANK;
            case 3:
                return InstrumentType.CREDIT_CARD;
            case 4:
                return InstrumentType.CASH_BALANCE;
            case 5:
                return InstrumentType.LINE_OF_CREDIT;
            case 6:
                return InstrumentType.GOOGLE_PAY;
            case 7:
                throw new NotImplementedError(null, 1, null);
            case 8:
            case 9:
                Path$$ExternalSyntheticBUOutline0.m$1(cashInstrumentType, "Unexpected instrument type ");
                return null;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
