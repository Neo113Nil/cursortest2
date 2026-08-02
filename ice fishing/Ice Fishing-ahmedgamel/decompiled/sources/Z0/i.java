package Z0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import h1.C4566d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l1.AbstractC4668c;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f3967c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f3968d;

    /* renamed from: e, reason: collision with root package name */
    public float f3969e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3970f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3971g;

    /* renamed from: h, reason: collision with root package name */
    public s.l f3972h;
    public s.e i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3973j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f3974k;

    /* renamed from: l, reason: collision with root package name */
    public float f3975l;

    /* renamed from: m, reason: collision with root package name */
    public float f3976m;

    /* renamed from: n, reason: collision with root package name */
    public float f3977n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3978o;

    /* renamed from: a, reason: collision with root package name */
    public final D f3965a = new D();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3966b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f3979p = 0;

    public final void a(String str) {
        AbstractC4668c.b(str);
        this.f3966b.add(str);
    }

    public final float b() {
        return (long) (((this.f3976m - this.f3975l) / this.f3977n) * 1000.0f);
    }

    public final Map c() {
        float c9 = l1.i.c();
        if (c9 != this.f3969e) {
            for (Map.Entry entry : this.f3968d.entrySet()) {
                HashMap hashMap = this.f3968d;
                String str = (String) entry.getKey();
                x xVar = (x) entry.getValue();
                float f2 = this.f3969e / c9;
                int i = (int) (xVar.f4061a * f2);
                int i4 = (int) (xVar.f4062b * f2);
                x xVar2 = new x(i, i4, xVar.f4063c, xVar.f4064d, xVar.f4065e);
                Bitmap bitmap = xVar.f4066f;
                if (bitmap != null) {
                    xVar2.f4066f = Bitmap.createScaledBitmap(bitmap, i, i4, true);
                }
                hashMap.put(str, xVar2);
            }
        }
        this.f3969e = c9;
        return this.f3968d;
    }

    public final e1.h d(String str) {
        int size = this.f3971g.size();
        for (int i = 0; i < size; i++) {
            e1.h hVar = (e1.h) this.f3971g.get(i);
            String str2 = hVar.f37241a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f3973j.iterator();
        while (it.hasNext()) {
            sb.append(((C4566d) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
