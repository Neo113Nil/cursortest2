package F0;

import D1.i;
import L0.f;
import N0.g;
import R.h;
import Z.C0054b;
import Z.C0055c;
import Z.I;
import Z.N;
import Z.S;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.k;
import d.C0124a;
import f0.C0142g;
import java.util.ArrayList;
import java.util.Locale;
import k0.C0208w;
import k0.h0;
import k0.i0;
import m.C0262k;
import m.O;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f234a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f235a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                g gVar = new g();
                gVar.f700a = parcel.readInt();
                gVar.f701b = (f) parcel.readParcelable(g.class.getClassLoader());
                return gVar;
            case 2:
                h hVar = new h(parcel);
                hVar.f1004a = parcel.readInt();
                return hVar;
            case 3:
                return new C0054b(parcel);
            case 4:
                return new C0055c(parcel);
            case 5:
                I i = new I();
                i.f1414a = parcel.readString();
                i.f1415b = parcel.readInt();
                return i;
            case 6:
                N n2 = new N();
                n2.e = null;
                n2.f1462f = new ArrayList();
                n2.f1463g = new ArrayList();
                n2.f1458a = parcel.createStringArrayList();
                n2.f1459b = parcel.createStringArrayList();
                n2.f1460c = (C0054b[]) parcel.createTypedArray(C0054b.CREATOR);
                n2.f1461d = parcel.readInt();
                n2.e = parcel.readString();
                n2.f1462f = parcel.createStringArrayList();
                n2.f1463g = parcel.createTypedArrayList(C0055c.CREATOR);
                n2.f1464h = parcel.createTypedArrayList(I.CREATOR);
                return n2;
            case 7:
                return new S(parcel);
            case 8:
                return new com.google.android.material.datepicker.b((k) parcel.readParcelable(k.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return k.a(parcel.readInt(), parcel.readInt());
            case 11:
                return new com.google.android.material.timepicker.k(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 12:
                return new C0124a(parcel);
            case 13:
                i.e(parcel, "inParcel");
                return new C0142g(parcel);
            case 14:
                C0208w c0208w = new C0208w();
                c0208w.f3611a = parcel.readInt();
                c0208w.f3612b = parcel.readInt();
                c0208w.f3613c = parcel.readInt() == 1;
                return c0208w;
            case 15:
                h0 h0Var = new h0();
                h0Var.f3498a = parcel.readInt();
                h0Var.f3499b = parcel.readInt();
                h0Var.f3501d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    h0Var.f3500c = iArr;
                    parcel.readIntArray(iArr);
                }
                return h0Var;
            case 16:
                i0 i0Var = new i0();
                i0Var.f3507a = parcel.readInt();
                i0Var.f3508b = parcel.readInt();
                int readInt2 = parcel.readInt();
                i0Var.f3509c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    i0Var.f3510d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                i0Var.e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    i0Var.f3511f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                i0Var.f3513h = parcel.readInt() == 1;
                i0Var.i = parcel.readInt() == 1;
                i0Var.j = parcel.readInt() == 1;
                i0Var.f3512g = parcel.readArrayList(h0.class.getClassLoader());
                return i0Var;
            case 17:
                C0262k c0262k = new C0262k();
                c0262k.f3958a = parcel.readInt();
                return c0262k;
            case 18:
                O o2 = new O(parcel);
                o2.f3867a = parcel.readByte() != 0;
                return o2;
            case 19:
                return new ParcelImpl(parcel);
            default:
                x0.b bVar = new x0.b();
                bVar.i = 255;
                bVar.f4734k = -2;
                bVar.f4735l = -2;
                bVar.f4736m = -2;
                bVar.f4743t = Boolean.TRUE;
                bVar.f4727a = parcel.readInt();
                bVar.f4728b = (Integer) parcel.readSerializable();
                bVar.f4729c = (Integer) parcel.readSerializable();
                bVar.f4730d = (Integer) parcel.readSerializable();
                bVar.e = (Integer) parcel.readSerializable();
                bVar.f4731f = (Integer) parcel.readSerializable();
                bVar.f4732g = (Integer) parcel.readSerializable();
                bVar.f4733h = (Integer) parcel.readSerializable();
                bVar.i = parcel.readInt();
                bVar.j = parcel.readString();
                bVar.f4734k = parcel.readInt();
                bVar.f4735l = parcel.readInt();
                bVar.f4736m = parcel.readInt();
                bVar.f4738o = parcel.readString();
                bVar.f4739p = parcel.readString();
                bVar.f4740q = parcel.readInt();
                bVar.f4742s = (Integer) parcel.readSerializable();
                bVar.f4744u = (Integer) parcel.readSerializable();
                bVar.f4745v = (Integer) parcel.readSerializable();
                bVar.f4746w = (Integer) parcel.readSerializable();
                bVar.f4747x = (Integer) parcel.readSerializable();
                bVar.f4748y = (Integer) parcel.readSerializable();
                bVar.f4749z = (Integer) parcel.readSerializable();
                bVar.f4725C = (Integer) parcel.readSerializable();
                bVar.f4723A = (Integer) parcel.readSerializable();
                bVar.f4724B = (Integer) parcel.readSerializable();
                bVar.f4743t = (Boolean) parcel.readSerializable();
                bVar.f4737n = (Locale) parcel.readSerializable();
                bVar.f4726D = (Boolean) parcel.readSerializable();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f234a) {
            case 0:
                return new c[i];
            case 1:
                return new g[i];
            case 2:
                return new h[i];
            case 3:
                return new C0054b[i];
            case 4:
                return new C0055c[i];
            case 5:
                return new I[i];
            case 6:
                return new N[i];
            case 7:
                return new S[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new k[i];
            case 11:
                return new com.google.android.material.timepicker.k[i];
            case 12:
                return new C0124a[i];
            case 13:
                return new C0142g[i];
            case 14:
                return new C0208w[i];
            case 15:
                return new h0[i];
            case 16:
                return new i0[i];
            case 17:
                return new C0262k[i];
            case 18:
                return new O[i];
            case 19:
                return new ParcelImpl[i];
            default:
                return new x0.b[i];
        }
    }
}
