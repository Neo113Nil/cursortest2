package com.google.android.datatransport;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowExceptionTool extends WinterFlowStackLibrary implements IInterface {
    public final int WinterFlowArrayNetwork;

    public WinterFlowExceptionTool(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.WinterFlowArrayNetwork = Arrays.hashCode(bArr);
    }

    public static byte[] WinterFlowRouterRouter(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowStackLibrary
    public final boolean WinterFlowTransactionManagerStrategy(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.WinterFlowArrayNetwork);
            return true;
        }
        WinterFlowEncryptionModule winterFlowEncryptionModule = new WinterFlowEncryptionModule(WinterFlowUnitTestResponse());
        parcel2.writeNoException();
        int i2 = WinterFlowRouterScheduler.WinterFlowRouterStructure;
        parcel2.writeStrongBinder(winterFlowEncryptionModule);
        return true;
    }

    public abstract byte[] WinterFlowUnitTestResponse();

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowExceptionTool)) {
            return false;
        }
        try {
            WinterFlowExceptionTool winterFlowExceptionTool = (WinterFlowExceptionTool) obj;
            if (winterFlowExceptionTool.WinterFlowArrayNetwork != this.WinterFlowArrayNetwork) {
                return false;
            }
            return Arrays.equals(WinterFlowUnitTestResponse(), (byte[]) new WinterFlowEncryptionModule(winterFlowExceptionTool.WinterFlowUnitTestResponse()).WinterFlowArrayNetwork);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.WinterFlowArrayNetwork;
    }
}
