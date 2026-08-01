package com.google.android.datatransport;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerBandwidth {
    public final long WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowListenerBandwidth(int i, int i2, long j, long j2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = j;
        this.WinterFlowArrayNetwork = j2;
    }

    public static WinterFlowListenerBandwidth WinterFlowRouterStructure(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            WinterFlowListenerBandwidth winterFlowListenerBandwidth = new WinterFlowListenerBandwidth(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return winterFlowListenerBandwidth;
        } finally {
        }
    }

    public final void WinterFlowHookDataSource(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.WinterFlowRouterStructure);
            dataOutputStream.writeInt(this.WinterFlowHookDataSource);
            dataOutputStream.writeLong(this.WinterFlowCacheManagerAgent);
            dataOutputStream.writeLong(this.WinterFlowArrayNetwork);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WinterFlowListenerBandwidth)) {
            WinterFlowListenerBandwidth winterFlowListenerBandwidth = (WinterFlowListenerBandwidth) obj;
            if (this.WinterFlowHookDataSource == winterFlowListenerBandwidth.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowListenerBandwidth.WinterFlowCacheManagerAgent && this.WinterFlowRouterStructure == winterFlowListenerBandwidth.WinterFlowRouterStructure && this.WinterFlowArrayNetwork == winterFlowListenerBandwidth.WinterFlowArrayNetwork) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.WinterFlowHookDataSource), Long.valueOf(this.WinterFlowCacheManagerAgent), Integer.valueOf(this.WinterFlowRouterStructure), Long.valueOf(this.WinterFlowArrayNetwork));
    }
}
