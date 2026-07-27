package androidx.versionedparcelable;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class FrostBridgeConstructorFrameworkI1tSYlrLgkT9XmqzJ762894018470983 extends Binder implements IInterface {
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;

    public FrostBridgeConstructorFrameworkI1tSYlrLgkT9XmqzJ762894018470983(String str) {
        attachInterface(this, str);
    }

    public boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                EmeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770 emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770 = (EmeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770) this;
                switch (i) {
                    case 3:
                        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(parcel);
                        break;
                    case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(parcel);
                        break;
                    case 7:
                        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(parcel);
                        break;
                    case 8:
                        DeltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929 deltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929 = (DeltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929) XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(parcel, DeltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929.CREATOR);
                        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(parcel);
                        emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.post(new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(25, emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770, deltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929));
                        break;
                    case 9:
                        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i, parcel, parcel2);
        }
    }

    public /* synthetic */ FrostBridgeConstructorFrameworkI1tSYlrLgkT9XmqzJ762894018470983() {
    }
}
