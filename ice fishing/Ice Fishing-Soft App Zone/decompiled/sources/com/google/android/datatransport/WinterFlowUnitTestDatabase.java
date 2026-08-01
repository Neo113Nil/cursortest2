package com.google.android.datatransport;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestDatabase {
    public final WinterFlowConfigurationModule WinterFlowCacheManagerAgent;
    public int WinterFlowHookDataSource = 0;
    public final XmlPullParser WinterFlowRouterStructure;

    public WinterFlowUnitTestDatabase(XmlResourceParser xmlResourceParser) {
        this.WinterFlowRouterStructure = xmlResourceParser;
        WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(24, false);
        winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy = new float[64];
        this.WinterFlowCacheManagerAgent = winterFlowConfigurationModule;
    }

    public final void WinterFlowCacheManagerAgent(int i) {
        this.WinterFlowHookDataSource = i | this.WinterFlowHookDataSource;
    }

    public final float WinterFlowHookDataSource(TypedArray typedArray, String str, int i, float f) {
        if (WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(this.WinterFlowRouterStructure, str)) {
            f = typedArray.getFloat(i, f);
        }
        WinterFlowCacheManagerAgent(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r7 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowSyntax WinterFlowRouterStructure(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        WinterFlowSyntax winterFlowSyntax;
        if (WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(this.WinterFlowRouterStructure, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    winterFlowSyntax = WinterFlowSyntax.WinterFlowCacheManagerAgent(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception unused) {
                    winterFlowSyntax = null;
                }
            } else {
                winterFlowSyntax = new WinterFlowSyntax(typedValue.data, (Object) null);
            }
            WinterFlowCacheManagerAgent(typedArray.getChangingConfigurations());
            return winterFlowSyntax;
        }
        winterFlowSyntax = new WinterFlowSyntax(0, (Object) null);
        WinterFlowCacheManagerAgent(typedArray.getChangingConfigurations());
        return winterFlowSyntax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowUnitTestDatabase)) {
            return false;
        }
        WinterFlowUnitTestDatabase winterFlowUnitTestDatabase = (WinterFlowUnitTestDatabase) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowUnitTestDatabase.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowUnitTestDatabase.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", config=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowHookDataSource, ')');
    }
}
