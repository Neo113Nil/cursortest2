package com.bumptech.glide;

import D.y;
import L3.F;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.activity.I;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import d1.C4443a;
import d1.C4444b;
import i1.AbstractC4579a;
import i1.C4580b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.C4629a;
import t.AbstractC4985g;
import t.C4981c;
import t.C4984f;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public abstract class f {
    public static final int A(int i) {
        AbstractC4404f.l(i, com.anythink.core.express.b.a.f17526b);
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return 0;
        }
        int i6 = 1;
        if (d2 != 1) {
            i6 = 2;
            if (d2 != 2) {
                i6 = 3;
                if (d2 != 3) {
                    i6 = 4;
                    if (d2 != 4) {
                        if (d2 == 5) {
                            return 5;
                        }
                        throw new B0.c();
                    }
                }
            }
        }
        return i6;
    }

    public static String B(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(C(objArr[i]));
            i6 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(C(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String C(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e9) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String s9 = y.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(s9), (Throwable) e9);
            String name2 = e9.getClass().getName();
            StringBuilder sb = new StringBuilder(s9.length() + 8 + name2.length() + 1);
            u1.h.i(sb, "<", s9, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static X2.c D(Context context) {
        try {
            return X2.c.c(context, X2.c.f3774b);
        } catch (Exception e9) {
            throw new v2.j(e9);
        }
    }

    public static final LinkedHashSet b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.h.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        kotlin.jvm.internal.h.d(uri, "uri");
                        linkedHashSet.add(new J0.c(uri, readBoolean));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        }
        return linkedHashSet;
    }

    public static final void f(G1.e eVar, String name, String value) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        ArrayList arrayList = eVar.f1056a;
        arrayList.add(name);
        arrayList.add(Q7.j.q0(value).toString());
    }

    public static Object g(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return K.d.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final void h(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char charAt = name.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                F.g(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.h.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void i(String value, String name) {
        kotlin.jvm.internal.h.e(value, "value");
        kotlin.jvm.internal.h.e(name, "name");
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char charAt = value.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                F.g(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.h.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(j8.c.i(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final int k(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(y.k(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(y.k(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(y.k(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(y.k(i, "Could not convert ", " to State"));
    }

    public static boolean o(String str) {
        I0.b bVar = I0.m.f1266a;
        Set<I0.d> unmodifiableSet = Collections.unmodifiableSet(I0.c.f1253c);
        HashSet hashSet = new HashSet();
        for (I0.d dVar : unmodifiableSet) {
            if (((I0.c) dVar).f1254a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            I0.c cVar = (I0.c) ((I0.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static C4443a p(C4580b c4580b, X0.i iVar) {
        return new C4443a(h1.p.a(c4580b, iVar, 1.0f, h1.f.f37959u, false), 0);
    }

    public static C4444b q(AbstractC4579a abstractC4579a, X0.i iVar, boolean z3) {
        return new C4444b(1, h1.p.a(abstractC4579a, iVar, z3 ? j1.j.c() : 1.0f, h1.f.f37960v, false));
    }

    public static C4443a r(C4580b c4580b, X0.i iVar, int i) {
        N6.i iVar2 = new N6.i(11);
        iVar2.f1974u = i;
        ArrayList a9 = h1.p.a(c4580b, iVar, 1.0f, iVar2, false);
        for (int i6 = 0; i6 < a9.size(); i6++) {
            C4629a c4629a = (C4629a) a9.get(i6);
            e1.c cVar = (e1.c) c4629a.f38552b;
            e1.c cVar2 = (e1.c) c4629a.f38553c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f37109a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f37109a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f3 = Float.NaN;
                    int i9 = 0;
                    for (int i10 = 0; i10 < length2; i10++) {
                        float f9 = fArr3[i10];
                        if (f9 != f3) {
                            fArr3[i9] = f9;
                            i9++;
                            f3 = fArr3[i10];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i9);
                    c4629a = new C4629a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a9.set(i6, c4629a);
        }
        return new C4443a(a9, 1);
    }

    public static C4443a s(AbstractC4579a abstractC4579a, X0.i iVar) {
        return new C4443a(h1.p.a(abstractC4579a, iVar, 1.0f, h1.f.f37961w, false), 2);
    }

    public static C4443a t(C4580b c4580b, X0.i iVar) {
        return new C4443a(h1.p.a(c4580b, iVar, j1.j.c(), h1.f.f37963y, true), 3);
    }

    public abstract boolean c(AbstractC4985g abstractC4985g, C4981c c4981c, C4981c c4981c2);

    public abstract boolean d(AbstractC4985g abstractC4985g, Object obj, Object obj2);

    public abstract boolean e(AbstractC4985g abstractC4985g, C4984f c4984f, C4984f c4984f2);

    public abstract void j();

    public abstract void u(C4984f c4984f, C4984f c4984f2);

    public abstract void v(C4984f c4984f, Thread thread);

    public abstract void x(boolean z3);

    public abstract void y();

    public abstract void z(I i, I i6, Window window, View view, boolean z3, boolean z6);

    public void a(Window window) {
    }

    public void w(boolean z3) {
    }
}
