package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class q5i {
    public boolean a;
    public int b;
    public Object c;
    public Object d;

    public q5i(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.c = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                l1j.q(remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.d = remoteViewsArr;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt();
    }

    public static void a(o5i[][][] o5iVarArr, int i, o5i o5iVar) {
        o5i[] o5iVarArr2 = o5iVarArr[i + o5iVar.d][o5iVar.c];
        fci fciVar = o5iVar.a;
        int ordinal = fciVar.ordinal();
        char c = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c = 1;
            } else if (ordinal == 4) {
                c = 3;
            } else {
                if (ordinal != 6) {
                    b6e.u(fciVar, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        o5i o5iVar2 = o5iVarArr2[c];
        if (o5iVar2 == null || o5iVar2.f > o5iVar.f) {
            o5iVarArr2[c] = o5iVar;
        }
    }

    public static boolean d(fci fciVar, char c) {
        int ordinal = fciVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c < '`' ? k6b.a[c] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return k6b.b(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static q0u f(int i) {
        int D = ouj.D(i);
        return D != 0 ? D != 1 ? q0u.a(40) : q0u.a(26) : q0u.a(9);
    }

    public void b(q0u q0uVar, o5i[][][] o5iVarArr, int i, o5i o5iVar) {
        int i2;
        String str = (String) this.c;
        eya eyaVar = (eya) this.d;
        int length = eyaVar.a.length;
        int i3 = eyaVar.b;
        if (i3 < 0 || !eyaVar.a(str.charAt(i), i3)) {
            i3 = 0;
        } else {
            length = i3 + 1;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            if (eyaVar.a(str.charAt(i), i5)) {
                a(o5iVarArr, i, new o5i(this, fci.BYTE, i, i5, 1, o5iVar, q0uVar));
            }
        }
        char charAt = str.charAt(i);
        fci fciVar = fci.KANJI;
        if (d(fciVar, charAt)) {
            a(o5iVarArr, i, new o5i(this, fciVar, i, 0, 1, o5iVar, q0uVar));
        }
        int length2 = str.length();
        char charAt2 = str.charAt(i);
        fci fciVar2 = fci.ALPHANUMERIC;
        int i6 = 2;
        if (d(fciVar2, charAt2)) {
            int i7 = i + 1;
            a(o5iVarArr, i, new o5i(this, fciVar2, i, 0, (i7 >= length2 || !d(fciVar2, str.charAt(i7))) ? 1 : 2, o5iVar, q0uVar));
        }
        char charAt3 = str.charAt(i);
        fci fciVar3 = fci.NUMERIC;
        if (d(fciVar3, charAt3)) {
            int i8 = i + 1;
            if (i8 >= length2 || !d(fciVar3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && d(fciVar3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            a(o5iVarArr, i, new o5i(this, fciVar3, i, 0, i2, o5iVar, q0uVar));
        }
    }

    public txw c() {
        y1g.y("execute parameter required", ((pun) this.c) != null);
        return new txw(this, (i6c[]) this.d, this.a, this.b);
    }

    public ime e(q0u q0uVar) {
        int i;
        String str = (String) this.c;
        int length = str.length();
        eya eyaVar = (eya) this.d;
        CharsetEncoder[] charsetEncoderArr = eyaVar.a;
        CharsetEncoder[] charsetEncoderArr2 = eyaVar.a;
        o5i[][][] o5iVarArr = (o5i[][][]) Array.newInstance((Class<?>) o5i.class, length + 1, charsetEncoderArr.length, 4);
        b(q0uVar, o5iVarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr2.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    o5i o5iVar = o5iVarArr[i2][i3][i4];
                    if (o5iVar != null && i2 < length) {
                        b(q0uVar, o5iVarArr, i2, o5iVar);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr2.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                o5i o5iVar2 = o5iVarArr[length][i8][i9];
                if (o5iVar2 != null && (i = o5iVar2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new ime(this, q0uVar, o5iVarArr[length][i5][i7]);
        }
        throw new k6w(hrg.q("Internal error: failed to encode \"", str, "\""));
    }
}
