package androidx.versionedparcelable;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class BlueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486 extends FrostBridgeConstructorFrameworkI1tSYlrLgkT9XmqzJ762894018470983 implements IInterface {
    public final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;

    public BlueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Arrays.hashCode(bArr);
    }

    public static byte[] LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // androidx.versionedparcelable.FrostBridgeConstructorFrameworkI1tSYlrLgkT9XmqzJ762894018470983
    public final boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            return true;
        }
        RapidLogicObjectArrayIHa1BzhBVkyprbt3dX51547066666219 rapidLogicObjectArrayIHa1BzhBVkyprbt3dX51547066666219 = new RapidLogicObjectArrayIHa1BzhBVkyprbt3dX51547066666219(YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170());
        parcel2.writeNoException();
        int i2 = MysticCacheNormalizationMonitorQdma9C7L7IpxYEKbeS75325100924362.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        parcel2.writeStrongBinder(rapidLogicObjectArrayIHa1BzhBVkyprbt3dX51547066666219);
        return true;
    }

    public abstract byte[] YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170();

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BlueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486)) {
            return false;
        }
        try {
            BlueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486 blueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486 = (BlueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486) obj;
            if (blueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
                return false;
            }
            return Arrays.equals(YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(), (byte[]) new RapidLogicObjectArrayIHa1BzhBVkyprbt3dX51547066666219(blueKernelCompressionAdapterJ1tAVMgTICOuHgagNr13582278331486.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170()).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    }
}
