package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class uv31 extends a6z0 {

    public static class a extends uv31 {
        @Override // defpackage.uv31
        public final boolean e(float f, long j, thx thxVar, View view) {
            return this.h;
        }
    }

    public final float d(float f, long j, thx thxVar, View view) {
        this.a.d(f, this.g);
        float[] fArr = this.g;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a2 = thxVar.a(view, this.f);
            this.j = a2;
            if (Float.isNaN(a2)) {
                this.j = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.i) * 1.0E-9d) * f2) + this.j) % 1.0d);
        this.j = f3;
        String str = this.f;
        HashMap hashMap = thxVar.a;
        if (hashMap.containsKey(view)) {
            HashMap hashMap2 = (HashMap) hashMap.get(view);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (hashMap2.containsKey(str)) {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap2.put(str, fArr2);
            } else {
                hashMap2.put(str, new float[]{f3});
                hashMap.put(view, hashMap2);
            }
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(str, new float[]{f3});
            hashMap.put(view, hashMap3);
        }
        this.i = j;
        float f4 = this.g[0];
        float a3 = (a(this.j) * f4) + this.g[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.h = z;
        return a3;
    }

    public abstract boolean e(float f, long j, thx thxVar, View view);
}
