package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.z2a1;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes7.dex */
public final class c43 extends g11 {
    public static final Parcelable.Creator<c43> CREATOR = new b43();
    public final String c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c43(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yads.g11, yads.bs1
    public final void a(a291 a291Var) {
        char c;
        String str = this.b;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = HexString.LF;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals(BaseDatabaseHelper.TYPE_TEXT)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    a291Var.c = this.d;
                    break;
                case 1:
                case 11:
                    a291Var.x = this.d;
                    break;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(this.d.substring(2, 4));
                    int parseInt2 = Integer.parseInt(this.d.substring(0, 2));
                    a291Var.r = Integer.valueOf(parseInt);
                    a291Var.s = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 17:
                    a291Var.b = this.d;
                    break;
                case 4:
                case 18:
                    a291Var.d = this.d;
                    break;
                case 5:
                case 19:
                    a291Var.y = this.d;
                    break;
                case 6:
                case 20:
                    String str2 = this.d;
                    int i = rf71.a;
                    String[] split = str2.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    a291Var.m = Integer.valueOf(parseInt3);
                    a291Var.n = valueOf;
                    break;
                case 7:
                case 16:
                    a291Var.a = this.d;
                    break;
                case '\b':
                case 15:
                    a291Var.w = this.d;
                    break;
                case '\t':
                case 21:
                    a291Var.q = Integer.valueOf(Integer.parseInt(this.d));
                    break;
                case '\r':
                    ArrayList a = a(this.d);
                    int size = a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                a291Var.s = (Integer) a.get(2);
                            }
                        }
                        a291Var.r = (Integer) a.get(1);
                    }
                    a291Var.q = (Integer) a.get(0);
                    break;
                case 14:
                    ArrayList a2 = a(this.d);
                    int size2 = a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                a291Var.v = (Integer) a2.get(2);
                            }
                        }
                        a291Var.u = (Integer) a2.get(1);
                    }
                    a291Var.t = (Integer) a2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c43.class == obj.getClass()) {
            c43 c43Var = (c43) obj;
            if (rf71.o(this.b, c43Var.b) && rf71.o(this.c, c43Var.c) && rf71.o(this.d, c43Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = z2a1.a(527, this.b);
        String str = this.c;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.b + ": description=" + this.c + ": value=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public c43(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
