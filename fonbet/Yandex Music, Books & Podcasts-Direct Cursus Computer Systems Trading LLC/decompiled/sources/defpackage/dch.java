package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class dch implements ach {
    public final Context a;
    public final cce b;
    public final String c;
    public final String d;
    public final String e;
    public final x6k f;

    public dch(Context context, cce cceVar, mm6 mm6Var, String str, String str2, String str3) {
        context.getClass();
        str2.getClass();
        str3.getClass();
        this.a = context;
        this.b = cceVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = szf.g0(xbh.b);
        x97.y(mm6Var, null, null, new xg(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(dch dchVar, Context context, cce cceVar, String str, cg6 cg6Var) {
        cch cchVar;
        int i;
        sce sceVar;
        if (cg6Var instanceof cch) {
            cchVar = (cch) cg6Var;
            int i2 = cchVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cchVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cchVar.j;
                Object obj2 = nm6.a;
                i = cchVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pce pceVar = new pce(context);
                    pceVar.c = str;
                    pceVar.o = Boolean.FALSE;
                    rce a = pceVar.a();
                    cchVar.l = 1;
                    obj = cceVar.a(a, cchVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                sceVar = (sce) obj;
                if (sceVar instanceof bqr) {
                    Drawable drawable = ((bqr) sceVar).a;
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable != null) {
                        return bitmapDrawable.getBitmap();
                    }
                }
                return null;
            }
        }
        cchVar = new cch(dchVar, cg6Var);
        Object obj3 = cchVar.j;
        Object obj22 = nm6.a;
        i = cchVar.l;
        if (i != 0) {
        }
        sceVar = (sce) obj3;
        if (sceVar instanceof bqr) {
        }
        return null;
    }

    @Override // defpackage.ach
    public final zbh d() {
        return (zbh) this.f.getValue();
    }
}
