package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements Q0.k, Q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7887a;

    public /* synthetic */ b(Object obj) {
        this.f7887a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i2;
        io.flutter.plugin.platform.h hVar;
        ArrayList arrayList;
        g gVar;
        int i3;
        int i4;
        g gVar2;
        String str;
        float f2;
        float f3;
        Integer num;
        h hVar2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        h hVar3 = (h) this.f7887a;
        hVar3.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i2 = 16;
            hVar = hVar3.f7979e;
            if (!hasRemaining) {
                break;
            }
            g b2 = hVar3.b(byteBuffer.getInt());
            b2.f7927H = true;
            b2.f7933N = b2.f7966r;
            b2.f7934O = b2.f7964p;
            b2.f7928I = b2.f7949c;
            b2.f7929J = b2.f7951d;
            b2.f7930K = b2.f7955g;
            b2.f7931L = b2.f7956h;
            b2.f7932M = b2.f7960l;
            b2.f7949c = byteBuffer.getLong();
            b2.f7951d = byteBuffer.getInt();
            b2.f7953e = byteBuffer.getInt();
            b2.f7954f = byteBuffer.getInt();
            b2.f7955g = byteBuffer.getInt();
            b2.f7956h = byteBuffer.getInt();
            b2.f7957i = byteBuffer.getInt();
            b2.f7958j = byteBuffer.getInt();
            b2.f7959k = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f7960l = byteBuffer.getFloat();
            b2.f7961m = byteBuffer.getFloat();
            b2.f7962n = byteBuffer.getFloat();
            b2.f7925E = byteBuffer.getInt();
            b2.f7963o = h.c(byteBuffer, strArr);
            b2.f7964p = h.c(byteBuffer, strArr);
            b2.f7965q = g.G(byteBuffer, byteBufferArr);
            b2.f7966r = h.c(byteBuffer, strArr);
            b2.f7967s = g.G(byteBuffer, byteBufferArr);
            b2.t = h.c(byteBuffer, strArr);
            b2.f7968u = g.G(byteBuffer, byteBufferArr);
            b2.f7969v = h.c(byteBuffer, strArr);
            b2.f7970w = g.G(byteBuffer, byteBufferArr);
            b2.f7971x = h.c(byteBuffer, strArr);
            b2.f7972y = g.G(byteBuffer, byteBufferArr);
            b2.f7973z = h.c(byteBuffer, strArr);
            b2.f7921A = h.c(byteBuffer, strArr);
            b2.f7922B = h.c(byteBuffer, strArr);
            b2.f7923C = h.c(byteBuffer, strArr);
            b2.f7924D = h.c(byteBuffer, strArr);
            b2.f7926F = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f7935P = byteBuffer.getFloat();
            b2.f7936Q = byteBuffer.getFloat();
            b2.f7937R = byteBuffer.getFloat();
            b2.f7938S = byteBuffer.getFloat();
            float[] fArr = b2.f7939T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                fArr[i5] = byteBuffer.getFloat();
            }
            b2.f7939T = fArr;
            float[] fArr2 = b2.f7940U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                fArr2[i6] = byteBuffer.getFloat();
            }
            b2.f7940U = fArr2;
            b2.f7948b0 = true;
            b2.f7952d0 = true;
            int i7 = byteBuffer.getInt();
            ArrayList arrayList3 = b2.f7942W;
            arrayList3.clear();
            int i8 = 0;
            while (true) {
                hVar2 = b2.f7945a;
                if (i8 >= i7) {
                    break;
                }
                g b3 = hVar2.b(byteBuffer.getInt());
                b3.f7941V = b2;
                arrayList3.add(b3);
                i8++;
            }
            int i9 = byteBuffer.getInt();
            ArrayList arrayList4 = b2.f7943X;
            arrayList4.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                g b4 = hVar2.b(byteBuffer.getInt());
                b4.f7941V = b2;
                arrayList4.add(b4);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                b2.Y = null;
            } else {
                ArrayList arrayList5 = b2.Y;
                if (arrayList5 == null) {
                    b2.Y = new ArrayList(i11);
                } else {
                    arrayList5.clear();
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    f a2 = hVar2.a(byteBuffer.getInt());
                    int i13 = a2.f7918c;
                    if (i13 == 1) {
                        b2.f7944Z = a2;
                    } else if (i13 == 2) {
                        b2.f7946a0 = a2;
                    } else {
                        b2.Y.add(a2);
                    }
                    b2.Y.add(a2);
                }
            }
            if (!b2.I(14)) {
                if (b2.I(6)) {
                    hVar3.f7987m = b2;
                }
                if (b2.f7927H) {
                    arrayList2.add(b2);
                }
                int i14 = b2.f7957i;
                if (i14 != -1 && !hVar.d(i14)) {
                    hVar.g(b2.f7957i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = hVar3.f7981g;
        g gVar3 = (g) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (gVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            gVar3.M(fArr3, hashSet, false);
            gVar3.D(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        g gVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = hVar3.f7990p;
            if (!hasNext) {
                break;
            }
            g gVar5 = (g) it.next();
            if (!arrayList.contains(Integer.valueOf(gVar5.f7947b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && !arrayList6.isEmpty()) {
            gVar4 = (g) arrayList6.get(arrayList6.size() - 1);
        }
        if (gVar4 != null && (gVar4.f7947b != hVar3.f7991q || arrayList6.size() != arrayList.size())) {
            hVar3.f7991q = gVar4.f7947b;
            String F2 = gVar4.F();
            if (F2 == null) {
                F2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hVar3.f7975a.setAccessibilityPaneTitle(F2);
            } else {
                AccessibilityEvent d2 = hVar3.d(gVar4.f7947b, 32);
                d2.getText().add(F2);
                hVar3.h(d2);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((g) it2.next()).f7947b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            g gVar6 = (g) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.f7941V = null;
                if (gVar6.f7957i != -1 && (num = hVar3.f7984j) != null) {
                    View platformViewOfNode = hVar3.f7978d.platformViewOfNode(num.intValue());
                    hVar.g(gVar6.f7957i);
                    if (platformViewOfNode == null) {
                        hVar3.g(hVar3.f7984j.intValue(), 65536);
                        hVar3.f7984j = null;
                    }
                }
                int i15 = gVar6.f7957i;
                if (i15 != -1) {
                    hVar.g(i15);
                }
                g gVar7 = hVar3.f7983i;
                if (gVar7 == gVar6) {
                    hVar3.g(gVar7.f7947b, 65536);
                    hVar3.f7983i = null;
                }
                if (hVar3.f7987m == gVar6) {
                    hVar3.f7987m = null;
                }
                if (hVar3.f7989o == gVar6) {
                    hVar3.f7989o = null;
                }
                it3.remove();
            }
        }
        int i16 = 2048;
        int i17 = 0;
        AccessibilityEvent d3 = hVar3.d(0, 2048);
        d3.setContentChangeTypes(1);
        hVar3.h(d3);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            g gVar8 = (g) it4.next();
            if (!Float.isNaN(gVar8.f7960l) && !Float.isNaN(gVar8.f7932M) && gVar8.f7932M != gVar8.f7960l) {
                AccessibilityEvent d4 = hVar3.d(gVar8.f7947b, Base64Utils.IO_BUFFER_SIZE);
                float f4 = gVar8.f7960l;
                float f5 = gVar8.f7961m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(gVar8.f7962n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = gVar8.f7962n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                if (g.C(gVar8, e.SCROLL_UP) || g.C(gVar8, e.SCROLL_DOWN)) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if (g.C(gVar8, e.SCROLL_LEFT) || g.C(gVar8, e.SCROLL_RIGHT)) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i18 = gVar8.f7958j;
                if (i18 > 0) {
                    d4.setItemCount(i18);
                    d4.setFromIndex(gVar8.f7959k);
                    Iterator it5 = gVar8.f7943X.iterator();
                    int i19 = i17;
                    while (it5.hasNext()) {
                        if (!((g) it5.next()).I(14)) {
                            i19++;
                        }
                    }
                    d4.setToIndex((gVar8.f7959k + i19) - 1);
                }
                hVar3.h(d4);
            }
            if (gVar8.I(i2) && (((str = gVar8.f7964p) != null || gVar8.f7934O != null) && (str == null || !str.equals(gVar8.f7934O)))) {
                AccessibilityEvent d5 = hVar3.d(gVar8.f7947b, i16);
                d5.setContentChangeTypes(1);
                hVar3.h(d5);
            }
            if (Build.VERSION.SDK_INT >= 36 && gVar8.f7927H) {
                if (gVar8.I(2) != gVar8.H(2) || gVar8.I(26) != gVar8.H(26) || gVar8.I(18) != gVar8.H(18)) {
                    AccessibilityEvent d6 = hVar3.d(gVar8.f7947b, i16);
                    d6.setContentChangeTypes(8192);
                    hVar3.h(d6);
                }
            }
            g gVar9 = hVar3.f7983i;
            if (gVar9 != null && gVar9.f7947b == gVar8.f7947b && !gVar8.H(3) && gVar8.I(3)) {
                AccessibilityEvent d7 = hVar3.d(gVar8.f7947b, 4);
                d7.getText().add(gVar8.f7964p);
                hVar3.h(d7);
            }
            g gVar10 = hVar3.f7987m;
            if (gVar10 != null && (i3 = gVar10.f7947b) == (i4 = gVar8.f7947b) && ((gVar2 = hVar3.f7988n) == null || gVar2.f7947b != i3)) {
                hVar3.f7988n = gVar10;
                hVar3.h(hVar3.d(i4, 8));
            } else if (gVar10 == null) {
                hVar3.f7988n = null;
            }
            g gVar11 = hVar3.f7987m;
            if (gVar11 != null && gVar11.f7947b == gVar8.f7947b && gVar8.H(5) && gVar8.I(5) && ((gVar = hVar3.f7983i) == null || gVar.f7947b == hVar3.f7987m.f7947b)) {
                String str2 = gVar8.f7933N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = gVar8.f7966r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d8 = hVar3.d(gVar8.f7947b, i2);
                d8.setBeforeText(str2);
                d8.getText().add(str4);
                int i20 = i17;
                while (i20 < str2.length() && i20 < str4.length() && str2.charAt(i20) == str4.charAt(i20)) {
                    i20++;
                }
                if (i20 < str2.length() || i20 < str4.length()) {
                    d8.setFromIndex(i20);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i20 && length2 >= i20 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d8.setRemovedCount((length - i20) + 1);
                    d8.setAddedCount((length2 - i20) + 1);
                } else {
                    d8 = null;
                }
                if (d8 != null) {
                    hVar3.h(d8);
                }
                if (gVar8.f7930K != gVar8.f7955g || gVar8.f7931L != gVar8.f7956h) {
                    AccessibilityEvent d9 = hVar3.d(gVar8.f7947b, 8192);
                    d9.getText().add(str4);
                    d9.setFromIndex(gVar8.f7955g);
                    d9.setToIndex(gVar8.f7956h);
                    d9.setItemCount(str4.length());
                    hVar3.h(d9);
                }
            }
            i16 = 2048;
            i17 = 0;
            i2 = 16;
        }
    }
}
