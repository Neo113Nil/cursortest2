package k8;

import A1.w;
import android.content.Context;
import com.bumptech.glide.load.data.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import t0.V;
import u1.InterfaceC5066e;
import w1.C5136d;
import w1.h;
import w1.j;
import w1.z;
import x2.d;
import x2.k;

/* loaded from: classes2.dex */
public final class b implements c, x2.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f38633n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38634u;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f38633n = obj;
        this.f38634u = obj2;
    }

    public void a(int i) {
        int[] iArr = (int[]) this.f38633n;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f38633n = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f38633n = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f38633n;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // x2.c
    public /* synthetic */ k b(String str) {
        new com.facebook.ads.internal.dynamicloading.a((d) this.f38633n, (Context) this.f38634u, str).start();
        return k.f41872n;
    }

    @Override // com.bumptech.glide.load.data.c
    public void c(Exception exc) {
        z zVar = (z) this.f38634u;
        w wVar = (w) this.f38633n;
        w wVar2 = zVar.f41590y;
        if (wVar2 == null || wVar2 != wVar) {
            return;
        }
        z zVar2 = (z) this.f38634u;
        w wVar3 = (w) this.f38633n;
        h hVar = zVar2.f41586u;
        C5136d c5136d = zVar2.f41591z;
        com.bumptech.glide.load.data.d dVar = wVar3.f92c;
        hVar.b(c5136d, exc, dVar, dVar.d());
    }

    public File d() {
        if (((File) this.f38633n) == null) {
            this.f38633n = new File(((Context) this.f38634u).getCacheDir(), "volley");
        }
        return (File) this.f38633n;
    }

    public void e(int i, int i4) {
        int[] iArr = (int[]) this.f38633n;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i6 = i + i4;
        a(i6);
        int[] iArr2 = (int[]) this.f38633n;
        System.arraycopy(iArr2, i, iArr2, i6, (iArr2.length - i) - i4);
        Arrays.fill((int[]) this.f38633n, i, i6, -1);
        ArrayList arrayList = (ArrayList) this.f38634u;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            V v9 = (V) ((ArrayList) this.f38634u).get(size);
            int i9 = v9.f40672n;
            if (i9 >= i) {
                v9.f40672n = i9 + i4;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public void f(Object obj) {
        z zVar = (z) this.f38634u;
        w wVar = (w) this.f38633n;
        w wVar2 = zVar.f41590y;
        if (wVar2 == null || wVar2 != wVar) {
            return;
        }
        z zVar2 = (z) this.f38634u;
        w wVar3 = (w) this.f38633n;
        j jVar = zVar2.f41585n.f41456p;
        if (obj != null && jVar.a(wVar3.f92c.d())) {
            zVar2.f41589x = obj;
            zVar2.f41586u.l(2);
        } else {
            h hVar = zVar2.f41586u;
            InterfaceC5066e interfaceC5066e = wVar3.f90a;
            com.bumptech.glide.load.data.d dVar = wVar3.f92c;
            hVar.c(interfaceC5066e, obj, dVar, dVar.d(), zVar2.f41591z);
        }
    }

    public void g(int i, int i4) {
        int[] iArr = (int[]) this.f38633n;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i6 = i + i4;
        a(i6);
        int[] iArr2 = (int[]) this.f38633n;
        System.arraycopy(iArr2, i6, iArr2, i, (iArr2.length - i) - i4);
        int[] iArr3 = (int[]) this.f38633n;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f38634u;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            V v9 = (V) ((ArrayList) this.f38634u).get(size);
            int i9 = v9.f40672n;
            if (i9 >= i) {
                if (i9 < i6) {
                    ((ArrayList) this.f38634u).remove(size);
                } else {
                    v9.f40672n = i9 - i4;
                }
            }
        }
    }
}
