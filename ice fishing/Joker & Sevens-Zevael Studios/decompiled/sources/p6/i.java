package p6;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements a4.f, f6.a, h4.c, k2.p {

    /* renamed from: g, reason: collision with root package name */
    public static i f5603g;

    @Override // f6.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // h4.c
    public h4.d b(h4.b bVar) {
        return new i4.g(bVar.f2839a, bVar.f2840b, bVar.f2841c, bVar.f2842d, bVar.f2843e);
    }

    public Object c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(bc.o.O(arrayList2), bc.o.O(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new ac.i(it.next(), it2.next()));
                }
                return bc.z.Q(arrayList3);
            }
        }
        return bc.w.f1068g;
    }

    public void d(x4.s sVar, float f10) {
        r.b bVar = (r.b) ((Drawable) sVar.f8356h);
        r.a aVar = (r.a) sVar.f8357i;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f10 != bVar.f5888e || bVar.f5889f != useCompatPadding || bVar.f5890g != preventCornerOverlap) {
            bVar.f5888e = f10;
            bVar.f5889f = useCompatPadding;
            bVar.f5890g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            sVar.m(0, 0, 0, 0);
            return;
        }
        r.b bVar2 = (r.b) ((Drawable) sVar.f8356h);
        float f11 = bVar2.f5888e;
        float f12 = bVar2.f5884a;
        int ceil = (int) Math.ceil(r.c.a(f11, f12, aVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(r.c.b(f11, f12, aVar.getPreventCornerOverlap()));
        sVar.m(ceil, ceil2, ceil, ceil2);
    }

    @Override // a4.f
    public void h() {
    }

    @Override // a4.f
    public void i(int i10, Object obj) {
    }
}
