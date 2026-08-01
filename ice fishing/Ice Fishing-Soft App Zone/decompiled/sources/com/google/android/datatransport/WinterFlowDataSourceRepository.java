package com.google.android.datatransport;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDataSourceRepository {
    public static final Charset WinterFlowRouterStructure;

    static {
        Charset forName = Charset.forName(Constants.ENCODING);
        forName.getClass();
        WinterFlowRouterStructure = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
