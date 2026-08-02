package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class uaf {
    public final String a;
    public final w4i b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final hbt f;
    public final int g;
    public final int h;
    public final ArrayList i;
    public final HashMap j;

    public uaf(Method method, String str, w4i w4iVar, List list) {
        int i;
        f9f[] f9fVarArr;
        f9f[] f9fVarArr2;
        list.getClass();
        this.a = str;
        this.b = w4iVar;
        hch hchVar = (hch) method.getAnnotation(hch.class);
        Annotation annotation = null;
        this.c = hchVar != null ? hchVar.key() : null;
        ArrayList arrayList = new ArrayList();
        this.j = new HashMap();
        Annotation[] annotations = method.getAnnotations();
        annotations.getClass();
        boolean z = false;
        for (Annotation annotation2 : annotations) {
            annotation2.getClass();
            paf pafVar = (paf) annotation2.annotationType().getAnnotation(paf.class);
            if (annotation2 instanceof paf) {
                paf pafVar2 = (paf) annotation2;
                arrayList.add(ern.a(pafVar2.keyProvider()));
                Class[] keyProviders = pafVar2.keyProviders();
                int length = keyProviders.length;
                if (length == 0) {
                    f9fVarArr2 = ern.b;
                } else {
                    f9f[] f9fVarArr3 = new f9f[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        f9fVarArr3[i2] = ern.a(keyProviders[i2]);
                    }
                    f9fVarArr2 = f9fVarArr3;
                }
                z75.u(arrayList, f9fVarArr2);
            } else if (pafVar != null) {
                arrayList.add(ern.a(pafVar.keyProvider()));
                Class[] keyProviders2 = pafVar.keyProviders();
                int length2 = keyProviders2.length;
                if (length2 == 0) {
                    f9fVarArr = ern.b;
                } else {
                    f9f[] f9fVarArr4 = new f9f[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        f9fVarArr4[i3] = ern.a(keyProviders2[i3]);
                    }
                    f9fVarArr = f9fVarArr4;
                }
                z75.u(arrayList, f9fVarArr);
            } else {
                if (annotation2 instanceof hbt) {
                    annotation = annotation2;
                }
            }
            z = true;
        }
        List list2 = list;
        o7t o7tVar = new o7t(new wz0(1, arrayList), new s3f(4));
        zda zdaVar = new zda(16);
        ArrayList arrayList2 = new ArrayList(list2.size() + 10);
        arrayList2.addAll(list2);
        ArrayList l = jhp.l(o7tVar);
        y75.s(l, zdaVar);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        this.i = arrayList2;
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((rld) it2.next()).getId());
        }
        if (hashSet.size() != this.i.size()) {
            xq0.q("Duplicate key providers.");
            throw null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        int length3 = parameterTypes.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < length3) {
            Class<?> cls = parameterTypes[i4];
            int i8 = i5 + 1;
            Type type = method.getGenericParameterTypes()[i5];
            i7 = Intrinsics.d(cls, xp3.class) ? i5 : i7;
            Annotation[] annotationArr = method.getParameterAnnotations()[i5];
            annotationArr.getClass();
            int length4 = annotationArr.length;
            int i9 = 0;
            while (i9 < length4) {
                Class<?>[] clsArr = parameterTypes;
                Annotation annotation3 = annotationArr[i9];
                Annotation annotation4 = annotation;
                if (annotation3 instanceof eaf) {
                    i = length3;
                    this.j.put(Integer.valueOf(i5), new dae(3, this, type));
                    z = true;
                } else {
                    i = length3;
                    if (!(annotation3 instanceof arc)) {
                        continue;
                    } else {
                        if (!Intrinsics.d(cls, Boolean.TYPE)) {
                            xq0.q("Check failed.");
                            throw null;
                        }
                        i6 = i5;
                    }
                }
                i9++;
                parameterTypes = clsArr;
                annotation = annotation4;
                length3 = i;
            }
            i4++;
            i5 = i8;
        }
        Annotation annotation5 = annotation;
        if (this.c != null) {
            if (this.a == null) {
                wb8.h(f1d.g("No class master key. MethodName=", method.getName()));
                throw null;
            }
            z = true;
        } else if (z) {
            xq0.q("No method master key.");
            throw null;
        }
        this.d = z;
        this.h = i6;
        this.g = i7;
        this.e = i7 != -1;
        this.f = (hbt) annotation5;
        if (z) {
            if (annotation5 != null) {
                return;
            }
            l1j.m(method, "No Ttl anno on cacheable method ");
            throw null;
        }
        if (annotation5 == null) {
            return;
        }
        l1j.m(method, "Ttl anno on non cacheable method ");
        throw null;
    }

    public final String a(Object[] objArr) {
        objArr.getClass();
        Throwable th = null;
        if (!this.d) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(this.c);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(((rld) it.next()).key());
        }
        ora oraVar = new ora((Iterator) new z3(16, objArr).invoke());
        while (oraVar.b.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) oraVar.next();
            int i = indexedValue.a;
            Object obj = indexedValue.b;
            Function1 function1 = (Function1) this.j.get(Integer.valueOf(i));
            if (function1 != null) {
                obj.getClass();
                String str = (String) function1.invoke(obj);
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
        bytes.getClass();
        int length = ((bytes.length + 2) / 3) * 4;
        byte[] bArr = new byte[length];
        int length2 = bytes.length;
        char[] cArr = ff7.a;
        int i2 = (length2 / 3) * 3;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + i2, i2);
            int i5 = i3;
            int i6 = i4;
            while (i5 < min) {
                int i7 = i5 + 2;
                int i8 = ((bytes[i5 + 1] & 255) << 8) | ((bytes[i5] & 255) << 16);
                i5 += 3;
                int i9 = i8 | (bytes[i7] & 255);
                bArr[i6] = (byte) cArr[(i9 >>> 18) & 63];
                bArr[i6 + 1] = (byte) cArr[(i9 >>> 12) & 63];
                int i10 = i6 + 3;
                bArr[i6 + 2] = (byte) cArr[(i9 >>> 6) & 63];
                i6 += 4;
                bArr[i10] = (byte) cArr[i9 & 63];
                th = th;
            }
            Throwable th2 = th;
            int i11 = ((min - i3) / 3) * 4;
            i4 += i11;
            if (i11 == -1 && min < length2) {
                throw th2;
            }
            i3 = min;
            th = th2;
        }
        if (i3 < length2) {
            int i12 = i3 + 1;
            int i13 = bytes[i3] & 255;
            int i14 = i4 + 1;
            bArr[i4] = (byte) cArr[i13 >> 2];
            if (i12 == length2) {
                bArr[i14] = (byte) cArr[(i13 << 4) & 63];
                int i15 = i4 + 3;
                bArr[i4 + 2] = 61;
                i4 += 4;
                bArr[i15] = 61;
            } else {
                int i16 = bytes[i12] & 255;
                bArr[i14] = (byte) cArr[((i13 << 4) & 63) | (i16 >> 4)];
                int i17 = i4 + 3;
                bArr[i4 + 2] = (byte) cArr[(i16 << 2) & 63];
                i4 += 4;
                bArr[i17] = 61;
            }
        }
        if (i4 != length) {
            bArr = Arrays.copyOf(bArr, i4);
        }
        return new String(bArr, 0, 0, bArr.length);
    }
}
