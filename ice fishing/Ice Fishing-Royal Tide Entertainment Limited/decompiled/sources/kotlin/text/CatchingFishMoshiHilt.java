package kotlin.text;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class CatchingFishMoshiHilt extends CatchingFishKtorMVVMJUnit implements CatchingFishMVVMXMLLayout {
    public final int CatchingFishOkHttp;

    public CatchingFishMoshiHilt(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.CatchingFishOkHttp = Arrays.hashCode(bArr);
    }

    public static byte[] CatchingFishCloudMessaging(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] CatchingFishFragmentHandler();

    @Override // kotlin.text.CatchingFishKtorMVVMJUnit
    public final boolean CatchingFishLayout(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.CatchingFishOkHttp);
            return true;
        }
        CatchingFishViewBundleHilt catchingFishViewBundleHilt = new CatchingFishViewBundleHilt(CatchingFishFragmentHandler());
        parcel2.writeNoException();
        int i2 = CatchingFishAdMobAppCompat.CatchingFishParcelableFAB;
        parcel2.writeStrongBinder(catchingFishViewBundleHilt);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishMVVMXMLLayout)) {
            return false;
        }
        try {
            CatchingFishMVVMXMLLayout catchingFishMVVMXMLLayout = (CatchingFishMVVMXMLLayout) obj;
            if (((CatchingFishMoshiHilt) catchingFishMVVMXMLLayout).CatchingFishOkHttp != this.CatchingFishOkHttp) {
                return false;
            }
            return Arrays.equals(CatchingFishFragmentHandler(), (byte[]) new CatchingFishViewBundleHilt(((CatchingFishMoshiHilt) catchingFishMVVMXMLLayout).CatchingFishFragmentHandler()).CatchingFishOkHttp);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.CatchingFishOkHttp;
    }
}
