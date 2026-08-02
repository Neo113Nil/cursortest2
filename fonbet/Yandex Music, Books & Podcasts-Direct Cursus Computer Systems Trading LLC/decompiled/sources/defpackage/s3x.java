package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class s3x extends pww {
    public final rmp h;
    public final Class i;

    public s3x(rmp rmpVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 3);
        this.h = rmpVar;
        this.i = p84.class;
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        Class cls = this.i;
        rmp rmpVar = this.h;
        switch (i) {
            case 1:
                zhj zhjVar = new zhj(rmpVar);
                parcel2.writeNoException();
                y4x.d(parcel2, zhjVar);
                return true;
            case 2:
                l9e S0 = zhj.S0(parcel.readStrongBinder());
                y4x.b(parcel);
                nkp nkpVar = (nkp) zhj.T0(S0);
                if (cls.isInstance(nkpVar) && rmpVar != null) {
                    rmpVar.e((nkp) cls.cast(nkpVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                l9e S02 = zhj.S0(parcel.readStrongBinder());
                String readString = parcel.readString();
                y4x.b(parcel);
                nkp nkpVar2 = (nkp) zhj.T0(S02);
                if (cls.isInstance(nkpVar2) && rmpVar != null) {
                    rmpVar.F((nkp) cls.cast(nkpVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                l9e S03 = zhj.S0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                y4x.b(parcel);
                nkp nkpVar3 = (nkp) zhj.T0(S03);
                if (cls.isInstance(nkpVar3) && rmpVar != null) {
                    rmpVar.j((nkp) cls.cast(nkpVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                l9e S04 = zhj.S0(parcel.readStrongBinder());
                y4x.b(parcel);
                nkp nkpVar4 = (nkp) zhj.T0(S04);
                if (cls.isInstance(nkpVar4) && rmpVar != null) {
                    rmpVar.y((nkp) cls.cast(nkpVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                l9e S05 = zhj.S0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                y4x.b(parcel);
                nkp nkpVar5 = (nkp) zhj.T0(S05);
                if (cls.isInstance(nkpVar5) && rmpVar != null) {
                    rmpVar.v((nkp) cls.cast(nkpVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                l9e S06 = zhj.S0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                y4x.b(parcel);
                nkp nkpVar6 = (nkp) zhj.T0(S06);
                if (cls.isInstance(nkpVar6) && rmpVar != null) {
                    rmpVar.n((nkp) cls.cast(nkpVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                l9e S07 = zhj.S0(parcel.readStrongBinder());
                int i2 = y4x.a;
                boolean z = parcel.readInt() != 0;
                y4x.b(parcel);
                nkp nkpVar7 = (nkp) zhj.T0(S07);
                if (cls.isInstance(nkpVar7) && rmpVar != null) {
                    rmpVar.g((nkp) cls.cast(nkpVar7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                l9e S08 = zhj.S0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                y4x.b(parcel);
                nkp nkpVar8 = (nkp) zhj.T0(S08);
                if (cls.isInstance(nkpVar8) && rmpVar != null) {
                    rmpVar.h((nkp) cls.cast(nkpVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                l9e S09 = zhj.S0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                y4x.b(parcel);
                nkp nkpVar9 = (nkp) zhj.T0(S09);
                if (cls.isInstance(nkpVar9) && rmpVar != null) {
                    rmpVar.w((nkp) cls.cast(nkpVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
