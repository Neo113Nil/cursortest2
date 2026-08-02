package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vkj extends l9 {
    public static final Parcelable.Creator<vkj> CREATOR = new oex(24);
    public final int a;
    public final String b;
    public final CommonWalletObject c;

    public vkj(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.b = str2;
        if (i >= 3) {
            this.c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.j = new ArrayList();
        commonWalletObject2.l = new ArrayList();
        commonWalletObject2.o = new ArrayList();
        commonWalletObject2.q = new ArrayList();
        commonWalletObject2.r = new ArrayList();
        commonWalletObject2.s = new ArrayList();
        commonWalletObject2.a = str;
        this.c = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.i0(parcel, 4, this.c, i);
        o8g.p0(parcel, o0);
    }
}
