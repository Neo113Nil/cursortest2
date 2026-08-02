package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class r0x extends pww {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0x(int i) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 3);
        this.h = i;
        switch (i) {
            case 1:
                super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 3);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        switch (this.h) {
            case 0:
                if (i == 1) {
                    Bundle bundle = (Bundle) y4x.a(parcel, Bundle.CREATOR);
                    y4x.b(parcel);
                    T0(bundle);
                    break;
                }
                break;
            default:
                switch (i) {
                    case 1:
                        int readInt = parcel.readInt();
                        y4x.b(parcel);
                        c1(readInt);
                        break;
                    case 2:
                        jw0 jw0Var = (jw0) y4x.a(parcel, jw0.CREATOR);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        boolean z = parcel.readInt() != 0;
                        y4x.b(parcel);
                        S0(jw0Var, readString, readString2, z);
                        break;
                    case 3:
                        int readInt2 = parcel.readInt();
                        y4x.b(parcel);
                        U0(readInt2);
                        break;
                    case 4:
                        parcel.readString();
                        parcel.readDouble();
                        int i2 = y4x.a;
                        parcel.readInt();
                        y4x.b(parcel);
                        f1();
                        break;
                    case 5:
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        y4x.b(parcel);
                        h1(readString3, readString4);
                        break;
                    case 6:
                        String readString5 = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        y4x.b(parcel);
                        Z0(readString5, createByteArray);
                        break;
                    case 7:
                        int readInt3 = parcel.readInt();
                        y4x.b(parcel);
                        W0(readInt3);
                        break;
                    case 8:
                        int readInt4 = parcel.readInt();
                        y4x.b(parcel);
                        Y0(readInt4);
                        break;
                    case 9:
                        int readInt5 = parcel.readInt();
                        y4x.b(parcel);
                        V0(readInt5);
                        break;
                    case 10:
                        parcel.readString();
                        long readLong = parcel.readLong();
                        int readInt6 = parcel.readInt();
                        y4x.b(parcel);
                        e1(readInt6, readLong);
                        break;
                    case 11:
                        parcel.readString();
                        long readLong2 = parcel.readLong();
                        y4x.b(parcel);
                        d1(readLong2);
                        break;
                    case 12:
                        b0x b0xVar = (b0x) y4x.a(parcel, b0x.CREATOR);
                        y4x.b(parcel);
                        X0(b0xVar);
                        break;
                    case 13:
                        j0x j0xVar = (j0x) y4x.a(parcel, j0x.CREATOR);
                        y4x.b(parcel);
                        b1(j0xVar);
                        break;
                    case 14:
                        int readInt7 = parcel.readInt();
                        y4x.b(parcel);
                        a1(readInt7);
                        break;
                    case 15:
                        int readInt8 = parcel.readInt();
                        y4x.b(parcel);
                        g1(readInt8);
                        break;
                }
                break;
        }
        return true;
    }

    public abstract void S0(jw0 jw0Var, String str, String str2, boolean z);

    public abstract void T0(Bundle bundle);

    public abstract void U0(int i);

    public abstract void V0(int i);

    public abstract void W0(int i);

    public abstract void X0(b0x b0xVar);

    public abstract void Y0(int i);

    public abstract void Z0(String str, byte[] bArr);

    public abstract void a1(int i);

    public abstract void b1(j0x j0xVar);

    public abstract void c1(int i);

    public abstract void d1(long j);

    public abstract void e1(int i, long j);

    public abstract void f1();

    public abstract void g1(int i);

    public abstract void h1(String str, String str2);
}
