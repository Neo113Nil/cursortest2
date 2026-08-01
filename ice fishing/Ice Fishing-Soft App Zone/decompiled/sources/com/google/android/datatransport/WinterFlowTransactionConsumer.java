package com.google.android.datatransport;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionConsumer extends WinterFlowTransactionManagerEvent {
    public final long WinterFlowMapperProtocol;
    public final long WinterFlowResolverController;
    public final List WinterFlowSerializerStructure;

    public WinterFlowTransactionConsumer(List list, long j, long j2) {
        this.WinterFlowSerializerStructure = list;
        this.WinterFlowMapperProtocol = j;
        this.WinterFlowResolverController = j2;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerEvent
    public final Shader WinterFlowCloudMicroservice(long j) {
        long j2 = this.WinterFlowMapperProtocol;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.WinterFlowResolverController;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.WinterFlowSerializerStructure;
        if (list.size() < 2) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("colors must have length of at least 2 if colorStops is omitted.");
            return null;
        }
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = WinterFlowInvokerComponent.WinterFlowConfiguration(((WinterFlowInheritanceSubsystem) list.get(i5)).WinterFlowRouterStructure);
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowTransactionConsumer)) {
            return false;
        }
        WinterFlowTransactionConsumer winterFlowTransactionConsumer = (WinterFlowTransactionConsumer) obj;
        return this.WinterFlowSerializerStructure.equals(winterFlowTransactionConsumer.WinterFlowSerializerStructure) && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowMapperProtocol, winterFlowTransactionConsumer.WinterFlowMapperProtocol) && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowResolverController, winterFlowTransactionConsumer.WinterFlowResolverController);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(this.WinterFlowSerializerStructure.hashCode() * 961, 31, this.WinterFlowMapperProtocol), 31, this.WinterFlowResolverController);
    }

    public final String toString() {
        String str;
        long j = this.WinterFlowMapperProtocol;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.WinterFlowResolverController;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.WinterFlowSerializerStructure + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
