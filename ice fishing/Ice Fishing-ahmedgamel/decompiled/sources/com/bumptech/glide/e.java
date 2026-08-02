package com.bumptech.glide;

import N3.C;
import Q7.q;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import com.google.android.gms.internal.ads.C3624n5;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public abstract class e implements U.j {
    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final void b(c6.i iVar, String str) {
        c6.d dVar = c6.d.f5754u;
        c6.n nVar = c6.n.f5794u;
        new c6.e(iVar, iVar.f5780b, iVar.f5782d);
    }

    public static final int c(Cursor c9, String str) {
        String str2;
        kotlin.jvm.internal.h.e(c9, "c");
        int columnIndex = c9.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c9.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c9.getColumnNames();
                    kotlin.jvm.internal.h.d(columnNames, "columnNames");
                    String concat = com.anythink.core.common.d.j.f13164z.concat(str);
                    String b9 = AbstractC5128c.b('`', com.anythink.core.common.d.j.f13164z, str);
                    int length = columnNames.length;
                    int i = 0;
                    int i4 = 0;
                    while (i4 < length) {
                        String str3 = columnNames[i4];
                        int i6 = i + 1;
                        if (str3.length() >= str.length() + 2 && (q.a0(str3, concat) || (str3.charAt(0) == '`' && q.a0(str3, b9)))) {
                            columnIndex = i;
                            break;
                        }
                        i4++;
                        i = i6;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c9.getColumnNames();
            kotlin.jvm.internal.h.d(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i9 = 0;
            for (String str4 : columnNames2) {
                i9++;
                if (i9 > 1) {
                    sb.append((CharSequence) ", ");
                }
                C.y(sb, str4, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception e9) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e9);
            str2 = com.anythink.core.common.v.m.f17596e;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static boolean e(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static TypedValue f(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean g(Context context, int i, boolean z6) {
        TypedValue f2 = f(context, i);
        return (f2 == null || f2.type != 18) ? z6 : f2.data != 0;
    }

    public static TypedValue h(Context context, String str, int i) {
        TypedValue f2 = f(context, i);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void l(Drawable drawable, int i) {
        H.a.g(drawable, i);
    }

    public static byte[] m(C3624n5 c3624n5) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min2) {
                int read = c3624n5.read(bArr, i4, min2 - i4);
                if (read == -1) {
                    return a(arrayDeque, i);
                }
                i4 += read;
                i += read;
            }
            long j6 = min * (min < 4096 ? 4 : 2);
            min = j6 > 2147483647L ? Integer.MAX_VALUE : j6 < -2147483648L ? Integer.MIN_VALUE : (int) j6;
        }
        if (c3624n5.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static void n(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeBundle(bundle);
        z(parcel, x9);
    }

    public static void o(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeByteArray(bArr);
        z(parcel, x9);
    }

    public static void p(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeStrongBinder(iBinder);
        z(parcel, x9);
    }

    public static void q(Parcel parcel, int i, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcelable.writeToParcel(parcel, i4);
        z(parcel, x9);
    }

    public static void r(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeString(str);
        z(parcel, x9);
    }

    public static void s(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeStringArray(strArr);
        z(parcel, x9);
    }

    public static void t(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeStringList(list);
        z(parcel, x9);
    }

    public static void u(Parcel parcel, int i, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int x9 = x(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        z(parcel, x9);
    }

    public static void v(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int x9 = x(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        z(parcel, x9);
    }

    public static void w(Parcel parcel, int i, int i4) {
        parcel.writeInt(i | (i4 << 16));
    }

    public static int x(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Z2.b y(Context context) {
        try {
            return Z2.b.c(context, Z2.b.f4122b);
        } catch (Exception e9) {
            throw new x2.j(e9);
        }
    }

    public static void z(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public abstract void d();

    public abstract void j(boolean z6);

    public abstract void k();

    public void i(boolean z6) {
    }
}
