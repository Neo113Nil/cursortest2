package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterFlowOnHeroPulseQuantum6393 implements Map.Entry, FrostHunterContextBlazePrimeMax4967 {
    public final Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterFlowOnHeroPulseQuantum6393(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(entry.getKey(), this.FrostHunterFlowMaxDragonHero5809) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
        }
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
        }
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj = this.FrostHunterFlowMaxDragonHero5809;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder();
                sb.append(this.FrostHunterFlowMaxDragonHero5809);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
