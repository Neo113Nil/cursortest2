package com.google.android.datatransport;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowMapperConcurrency {
    public static final byte[] WinterFlowHookDataSource;
    public static final Charset WinterFlowRouterStructure;

    static {
        Charset.forName("US-ASCII");
        WinterFlowRouterStructure = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        WinterFlowHookDataSource = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new WinterFlowInheritanceLayer(bArr, 0, 0, false).WinterFlowResponseEngine(0);
        } catch (WinterFlowRouterAgent e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int WinterFlowHookDataSource(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static void WinterFlowRouterStructure(Object obj, String str) {
        if (obj != null) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy(str);
    }
}
