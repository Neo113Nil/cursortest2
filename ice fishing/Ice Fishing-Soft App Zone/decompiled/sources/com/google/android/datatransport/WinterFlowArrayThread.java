package com.google.android.datatransport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayThread implements WinterFlowEventLayer {
    public static final SimpleDateFormat WinterFlowRouterStructure;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        WinterFlowRouterStructure = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        ((WinterFlowObjectArray) obj2).WinterFlowHookDataSource(WinterFlowRouterStructure.format((Date) obj));
    }
}
