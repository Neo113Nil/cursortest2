package com.bumptech.glide;

import D.y;
import D0.z;
import M7.q;
import O.f0;
import O7.AbstractC0376a;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.C3506l5;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import m.I0;
import q7.C4939h;
import q7.v;
import r7.C4985p;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public abstract class f implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23543a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f23544b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23545c;

    public static byte[] d(ArrayDeque arrayDeque, int i) {
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

    public static final C4939h e(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        return new C4939h(exception);
    }

    public static final boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int g(Cursor c4, String str) {
        String str2;
        kotlin.jvm.internal.h.e(c4, "c");
        int columnIndex = c4.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c4.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c4.getColumnNames();
                    kotlin.jvm.internal.h.d(columnNames, "columnNames");
                    String concat = com.anythink.core.common.d.j.f12535z.concat(str);
                    String b9 = AbstractC5051n.b('`', com.anythink.core.common.d.j.f12535z, str);
                    int length = columnNames.length;
                    int i = 0;
                    int i4 = 0;
                    while (i4 < length) {
                        String str3 = columnNames[i4];
                        int i9 = i + 1;
                        if (str3.length() >= str.length() + 2 && (q.B(str3, concat) || (str3.charAt(0) == '`' && q.B(str3, b9)))) {
                            columnIndex = i;
                            break;
                        }
                        i4++;
                        i = i9;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c4.getColumnNames();
            kotlin.jvm.internal.h.d(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i10 = 0;
            for (String str4 : columnNames2) {
                i10++;
                if (i10 > 1) {
                    sb.append((CharSequence) ", ");
                }
                w8.a.a(sb, str4, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception e6) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e6);
            str2 = com.anythink.core.common.v.m.f16967e;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static Drawable h(Context context, int i) {
        return I0.b().c(context, i);
    }

    public static t.k i(t.i iVar) {
        t.h hVar = new t.h();
        hVar.f40553c = new t.l();
        t.k kVar = new t.k(hVar);
        hVar.f40552b = kVar;
        hVar.f40551a = iVar.getClass();
        try {
            Object c4 = iVar.c(hVar);
            if (c4 != null) {
                hVar.f40551a = c4;
                return kVar;
            }
        } catch (Exception e6) {
            kVar.f40557u.k(e6);
        }
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List k(String str, List list) {
        kotlin.jvm.internal.h.e(list, "list");
        boolean z8 = list instanceof Z5.d;
        List list2 = list;
        if (z8) {
            list2 = ((Z5.d) list).f4279u;
        }
        if (list2 == C4985p.f40358n || (list2 instanceof Z5.a)) {
            return list2;
        }
        Z5.a aVar = new Z5.a(list2);
        if (aVar.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return aVar;
    }

    public static Typeface l(Configuration configuration, Typeface typeface) {
        int i;
        int i4;
        int weight;
        int i9;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i9 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, U2.a.b(i9 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static int m(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    public static final String n(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char charAt = value.charAt(i);
            if (M7.j.M(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void q(E7.p pVar, AbstractC0376a abstractC0376a, AbstractC0376a abstractC0376a2) {
        try {
            T7.a.h(v.f40183a, w8.a.f(w8.a.d(pVar, abstractC0376a, abstractC0376a2)));
        } catch (Throwable th) {
            abstractC0376a2.resumeWith(e(th));
            throw th;
        }
    }

    public static final void r(Object obj) {
        if (obj instanceof C4939h) {
            throw ((C4939h) obj).f40164n;
        }
    }

    public static byte[] s(C3506l5 c3506l5) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min2) {
                int read = c3506l5.read(bArr, i4, min2 - i4);
                if (read == -1) {
                    return d(arrayDeque, i);
                }
                i4 += read;
                i += read;
            }
            long j9 = min * (min < 4096 ? 4 : 2);
            min = j9 > 2147483647L ? Integer.MAX_VALUE : j9 < -2147483648L ? Integer.MIN_VALUE : (int) j9;
        }
        if (c3506l5.read() == -1) {
            return d(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static void t(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(y.j(i4, "at index ", new StringBuilder(String.valueOf(i4).length() + 9)));
            }
        }
    }

    public float j(View view) {
        if (f23543a) {
            try {
                return z.a(view);
            } catch (NoSuchMethodError unused) {
                f23543a = false;
            }
        }
        return view.getAlpha();
    }

    public void o(View view, float f6) {
        if (f23543a) {
            try {
                z.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                f23543a = false;
            }
        }
        view.setAlpha(f6);
    }

    public void p(View view, int i) {
        if (!f23545c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f23544b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f23545c = true;
        }
        Field field = f23544b;
        if (field != null) {
            try {
                f23544b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // O.f0
    public void a() {
    }

    @Override // O.f0
    public void b() {
    }
}
