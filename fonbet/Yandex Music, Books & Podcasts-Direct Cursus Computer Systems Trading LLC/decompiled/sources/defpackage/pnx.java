package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pnx implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ pnx(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int f0 = f8g.f0(parcel);
                boolean z = false;
                lx3 lx3Var = null;
                idq idqVar = null;
                ArrayList arrayList = null;
                tfk tfkVar = null;
                n6t n6tVar = null;
                String str = null;
                boolean z2 = true;
                boolean z3 = false;
                boolean z4 = false;
                while (parcel.dataPosition() < f0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            z = f8g.M(parcel, readInt);
                            break;
                        case 2:
                            z3 = f8g.M(parcel, readInt);
                            break;
                        case 3:
                            lx3Var = (lx3) f8g.u(parcel, readInt, lx3.CREATOR);
                            break;
                        case 4:
                            z4 = f8g.M(parcel, readInt);
                            break;
                        case 5:
                            idqVar = (idq) f8g.u(parcel, readInt, idq.CREATOR);
                            break;
                        case 6:
                            arrayList = f8g.s(parcel, readInt);
                            break;
                        case 7:
                            tfkVar = (tfk) f8g.u(parcel, readInt, tfk.CREATOR);
                            break;
                        case '\b':
                            n6tVar = (n6t) f8g.u(parcel, readInt, n6t.CREATOR);
                            break;
                        case '\t':
                            z2 = f8g.M(parcel, readInt);
                            break;
                        case '\n':
                            str = f8g.v(parcel, readInt);
                            break;
                        default:
                            f8g.W(parcel, readInt);
                            break;
                    }
                }
                f8g.B(parcel, f0);
                lek lekVar = new lek();
                lekVar.a = z;
                lekVar.b = z3;
                lekVar.c = lx3Var;
                lekVar.d = z4;
                lekVar.e = idqVar;
                lekVar.f = arrayList;
                lekVar.g = tfkVar;
                lekVar.h = n6tVar;
                lekVar.i = z2;
                lekVar.j = str;
                return lekVar;
            case 1:
                int f02 = f8g.f0(parcel);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                boolean z5 = false;
                boolean z6 = false;
                ArrayList arrayList2 = null;
                int[] iArr = null;
                String str2 = null;
                IBinder iBinder = null;
                long j = 0;
                while (parcel.dataPosition() < f02) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            arrayList2 = f8g.x(parcel, readInt2);
                            break;
                        case 3:
                            iArr = f8g.r(parcel, readInt2);
                            break;
                        case 4:
                            j = f8g.T(parcel, readInt2);
                            break;
                        case 5:
                            str2 = f8g.v(parcel, readInt2);
                            break;
                        case 6:
                            i = f8g.R(parcel, readInt2);
                            break;
                        case 7:
                            i2 = f8g.R(parcel, readInt2);
                            break;
                        case '\b':
                            i3 = f8g.R(parcel, readInt2);
                            break;
                        case '\t':
                            i4 = f8g.R(parcel, readInt2);
                            break;
                        case '\n':
                            i5 = f8g.R(parcel, readInt2);
                            break;
                        case 11:
                            i6 = f8g.R(parcel, readInt2);
                            break;
                        case '\f':
                            i7 = f8g.R(parcel, readInt2);
                            break;
                        case '\r':
                            i8 = f8g.R(parcel, readInt2);
                            break;
                        case 14:
                            i9 = f8g.R(parcel, readInt2);
                            break;
                        case 15:
                            i10 = f8g.R(parcel, readInt2);
                            break;
                        case 16:
                            i11 = f8g.R(parcel, readInt2);
                            break;
                        case 17:
                            i12 = f8g.R(parcel, readInt2);
                            break;
                        case 18:
                            i13 = f8g.R(parcel, readInt2);
                            break;
                        case 19:
                            i14 = f8g.R(parcel, readInt2);
                            break;
                        case 20:
                            i15 = f8g.R(parcel, readInt2);
                            break;
                        case 21:
                            i16 = f8g.R(parcel, readInt2);
                            break;
                        case 22:
                            i17 = f8g.R(parcel, readInt2);
                            break;
                        case 23:
                            i18 = f8g.R(parcel, readInt2);
                            break;
                        case 24:
                            i19 = f8g.R(parcel, readInt2);
                            break;
                        case 25:
                            i20 = f8g.R(parcel, readInt2);
                            break;
                        case 26:
                            i21 = f8g.R(parcel, readInt2);
                            break;
                        case 27:
                            i22 = f8g.R(parcel, readInt2);
                            break;
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                            i23 = f8g.R(parcel, readInt2);
                            break;
                        case 29:
                            i24 = f8g.R(parcel, readInt2);
                            break;
                        case 30:
                            i25 = f8g.R(parcel, readInt2);
                            break;
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                            i26 = f8g.R(parcel, readInt2);
                            break;
                        case ' ':
                            i27 = f8g.R(parcel, readInt2);
                            break;
                        case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                            iBinder = f8g.Q(parcel, readInt2);
                            break;
                        case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                            z5 = f8g.M(parcel, readInt2);
                            break;
                        case '#':
                            z6 = f8g.M(parcel, readInt2);
                            break;
                        default:
                            f8g.W(parcel, readInt2);
                            break;
                    }
                }
                f8g.B(parcel, f02);
                return new mfj(arrayList2, iArr, j, str2, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder, z5, z6);
            case 2:
                try {
                    return bfb.a(parcel.readInt());
                } catch (yeb e) {
                    xq0.t(e);
                    return null;
                }
            case 3:
                int f03 = f8g.f0(parcel);
                String str3 = null;
                while (parcel.dataPosition() < f03) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        f8g.W(parcel, readInt3);
                    } else {
                        str3 = f8g.v(parcel, readInt3);
                    }
                }
                f8g.B(parcel, f03);
                return new x8c(str3);
            default:
                int f04 = f8g.f0(parcel);
                int i28 = 0;
                String str4 = null;
                while (parcel.dataPosition() < f04) {
                    int readInt4 = parcel.readInt();
                    char c = (char) readInt4;
                    if (c == 2) {
                        i28 = f8g.R(parcel, readInt4);
                    } else if (c != 3) {
                        f8g.W(parcel, readInt4);
                    } else {
                        str4 = f8g.v(parcel, readInt4);
                    }
                }
                f8g.B(parcel, f04);
                sfk sfkVar = new sfk();
                sfkVar.a = i28;
                sfkVar.b = str4;
                return sfkVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lek[i];
            case 1:
                return new mfj[i];
            case 2:
                return new bfb[i];
            case 3:
                return new x8c[i];
            default:
                return new sfk[i];
        }
    }
}
