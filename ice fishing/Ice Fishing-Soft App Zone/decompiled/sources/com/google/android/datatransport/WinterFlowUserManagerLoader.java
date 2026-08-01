package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowUserManagerLoader {
    public final int WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterRouter;
    public ByteBuffer WinterFlowCacheManagerAgent = ByteBuffer.allocate(0);
    public boolean WinterFlowRouterStructure = true;
    public boolean WinterFlowArrayNetwork = false;
    public boolean WinterFlowVariableVersionControl = false;
    public boolean WinterFlowTransactionManagerStrategy = false;
    public boolean WinterFlowUnitTestResponse = false;

    public WinterFlowUserManagerLoader(int i, int i2) {
        this.WinterFlowRouterRouter = i2;
        this.WinterFlowHookDataSource = i;
    }

    public void WinterFlowArrayNetwork(ByteBuffer byteBuffer) {
        this.WinterFlowCacheManagerAgent = byteBuffer;
    }

    public void WinterFlowHookDataSource() {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!this.WinterFlowRouterStructure) {
                    throw new WinterFlowFrameworkQuery("Control frame can't have fin==false set");
                }
                if (this.WinterFlowVariableVersionControl) {
                    throw new WinterFlowFrameworkQuery("Control frame can't have rsv1==true set");
                }
                if (this.WinterFlowTransactionManagerStrategy) {
                    throw new WinterFlowFrameworkQuery("Control frame can't have rsv2==true set");
                }
                if (this.WinterFlowUnitTestResponse) {
                    throw new WinterFlowFrameworkQuery("Control frame can't have rsv3==true set");
                }
                return;
            default:
                return;
        }
    }

    public ByteBuffer WinterFlowRouterStructure() {
        return this.WinterFlowCacheManagerAgent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WinterFlowUserManagerLoader winterFlowUserManagerLoader = (WinterFlowUserManagerLoader) obj;
        if (this.WinterFlowRouterStructure != winterFlowUserManagerLoader.WinterFlowRouterStructure || this.WinterFlowArrayNetwork != winterFlowUserManagerLoader.WinterFlowArrayNetwork || this.WinterFlowVariableVersionControl != winterFlowUserManagerLoader.WinterFlowVariableVersionControl || this.WinterFlowTransactionManagerStrategy != winterFlowUserManagerLoader.WinterFlowTransactionManagerStrategy || this.WinterFlowUnitTestResponse != winterFlowUserManagerLoader.WinterFlowUnitTestResponse || this.WinterFlowHookDataSource != winterFlowUserManagerLoader.WinterFlowHookDataSource) {
            return false;
        }
        ByteBuffer byteBuffer = this.WinterFlowCacheManagerAgent;
        ByteBuffer byteBuffer2 = winterFlowUserManagerLoader.WinterFlowCacheManagerAgent;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    public int hashCode() {
        int WinterFlowRouterAdapter = (WinterFlowResolverBackend.WinterFlowRouterAdapter(this.WinterFlowHookDataSource) + ((this.WinterFlowRouterStructure ? 1 : 0) * 31)) * 31;
        ByteBuffer byteBuffer = this.WinterFlowCacheManagerAgent;
        return ((((((((WinterFlowRouterAdapter + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.WinterFlowArrayNetwork ? 1 : 0)) * 31) + (this.WinterFlowVariableVersionControl ? 1 : 0)) * 31) + (this.WinterFlowTransactionManagerStrategy ? 1 : 0)) * 31) + (this.WinterFlowUnitTestResponse ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Framedata{ opcode:");
        switch (this.WinterFlowHookDataSource) {
            case 1:
                str = "CONTINUOUS";
                break;
            case 2:
                str = "TEXT";
                break;
            case 3:
                str = "BINARY";
                break;
            case 4:
                str = "PING";
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                str = "PONG";
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "CLOSING";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", fin:");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", rsv1:");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", rsv2:");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append(", rsv3:");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append(", payload length:[pos:");
        sb.append(this.WinterFlowCacheManagerAgent.position());
        sb.append(", len:");
        sb.append(this.WinterFlowCacheManagerAgent.remaining());
        sb.append("], payload:");
        sb.append(this.WinterFlowCacheManagerAgent.remaining() > 1000 ? "(too big to display)" : new String(this.WinterFlowCacheManagerAgent.array()));
        sb.append('}');
        return sb.toString();
    }

    private void WinterFlowCacheManagerAgent() {
    }
}
