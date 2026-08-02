package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d4b {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public d4b(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = 16;
        this.b = 12544;
        this.c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            xq0.x("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(kkp.k);
        this.d = bitmap;
        arrayList.add(k6s.d);
        arrayList.add(k6s.e);
        arrayList.add(k6s.f);
        arrayList.add(k6s.g);
        arrayList.add(k6s.h);
        arrayList.add(k6s.i);
    }

    public kkp a() {
        int max;
        kkp kkpVar;
        ArrayList arrayList = (ArrayList) this.f;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            wvs.b();
            return null;
        }
        int i = this.c;
        int i2 = this.b;
        double d = -1.0d;
        if (i2 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i2) {
                d = Math.sqrt(i2 / height);
            }
        } else if (i > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i) {
            d = i / max;
        }
        int i3 = 0;
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        dn9 dn9Var = new dn9(iArr, this.a, arrayList.isEmpty() ? null : (a5k[]) arrayList.toArray(new a5k[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) dn9Var.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        kkp kkpVar2 = new kkp(arrayList3, arrayList2);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) kkpVar2.d;
        int size = arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            k6s k6sVar = (k6s) arrayList3.get(i4);
            float[] fArr = k6sVar.c;
            float[] fArr2 = k6sVar.a;
            int length = fArr.length;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i5 = i3; i5 < length; i5++) {
                float f3 = fArr[i5];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = fArr.length;
                for (int i6 = i3; i6 < length2; i6++) {
                    float f4 = fArr[i6];
                    if (f4 > 0.0f) {
                        fArr[i6] = f4 / f2;
                    }
                }
            }
            xy0 xy0Var = (xy0) kkpVar2.c;
            List list = (List) kkpVar2.b;
            int size2 = list.size();
            int i7 = i3;
            float f5 = 0.0f;
            b5k b5kVar = null;
            while (i7 < size2) {
                b5k b5kVar2 = (b5k) list.get(i7);
                float[] b = b5kVar2.b();
                float f6 = b[1];
                float f7 = f;
                float[] fArr3 = k6sVar.b;
                if (f6 >= fArr2[i7] && f6 <= fArr2[2]) {
                    float f8 = b[2];
                    if (f8 >= fArr3[i7] && f8 <= fArr3[2] && !sparseBooleanArray.get(b5kVar2.d)) {
                        float[] b2 = b5kVar2.b();
                        b5k b5kVar3 = (b5k) kkpVar2.e;
                        int i8 = b5kVar3 != null ? b5kVar3.e : 1;
                        kkpVar = kkpVar2;
                        float[] fArr4 = k6sVar.c;
                        float f9 = fArr4[i7];
                        float abs = f9 > f7 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float abs2 = f10 > f7 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = abs + abs2 + (f11 > f7 ? (b5kVar2.e / i8) * f11 : f7);
                        if (b5kVar == null || f12 > f5) {
                            b5kVar = b5kVar2;
                            f5 = f12;
                        }
                        i7++;
                        kkpVar2 = kkpVar;
                        f = f7;
                    }
                }
                kkpVar = kkpVar2;
                i7++;
                kkpVar2 = kkpVar;
                f = f7;
            }
            kkp kkpVar3 = kkpVar2;
            if (b5kVar != null) {
                sparseBooleanArray.append(b5kVar.d, true);
            }
            xy0Var.put(k6sVar, b5kVar);
            i4++;
            i3 = i7;
            kkpVar2 = kkpVar3;
        }
        kkp kkpVar4 = kkpVar2;
        sparseBooleanArray.clear();
        return kkpVar4;
    }

    public void b() {
        this.a = 1;
        this.e = (f3i) this.d;
        this.c = 0;
    }

    public boolean c() {
        z2i b = ((f3i) this.e).b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.b == 65039;
    }

    public d4b(f3i f3iVar) {
        this.a = 1;
        this.d = f3iVar;
        this.e = f3iVar;
    }
}
