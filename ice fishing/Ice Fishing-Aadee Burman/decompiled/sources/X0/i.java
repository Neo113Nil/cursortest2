package X0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import f1.C4501d;
import j1.AbstractC4599c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f3615c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f3616d;

    /* renamed from: e, reason: collision with root package name */
    public float f3617e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3618f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3619g;

    /* renamed from: h, reason: collision with root package name */
    public s.l f3620h;
    public s.e i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3621j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f3622k;

    /* renamed from: l, reason: collision with root package name */
    public float f3623l;

    /* renamed from: m, reason: collision with root package name */
    public float f3624m;

    /* renamed from: n, reason: collision with root package name */
    public float f3625n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3626o;

    /* renamed from: a, reason: collision with root package name */
    public final D f3613a = new D();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3614b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f3627p = 0;

    public final void a(String str) {
        AbstractC4599c.b(str);
        this.f3614b.add(str);
    }

    public final float b() {
        return (long) (((this.f3624m - this.f3623l) / this.f3625n) * 1000.0f);
    }

    public final Map c() {
        float c9 = j1.j.c();
        if (c9 != this.f3617e) {
            for (Map.Entry entry : this.f3616d.entrySet()) {
                HashMap hashMap = this.f3616d;
                String str = (String) entry.getKey();
                x xVar = (x) entry.getValue();
                float f3 = this.f3617e / c9;
                int i = (int) (xVar.f3710a * f3);
                int i6 = (int) (xVar.f3711b * f3);
                x xVar2 = new x(i, i6, xVar.f3712c, xVar.f3713d, xVar.f3714e);
                Bitmap bitmap = xVar.f3715f;
                if (bitmap != null) {
                    xVar2.f3715f = Bitmap.createScaledBitmap(bitmap, i, i6, true);
                }
                hashMap.put(str, xVar2);
            }
        }
        this.f3617e = c9;
        return this.f3616d;
    }

    public final c1.h d(String str) {
        int size = this.f3619g.size();
        for (int i = 0; i < size; i++) {
            c1.h hVar = (c1.h) this.f3619g.get(i);
            String str2 = hVar.f5523a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f3621j.iterator();
        while (it.hasNext()) {
            sb.append(((C4501d) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
