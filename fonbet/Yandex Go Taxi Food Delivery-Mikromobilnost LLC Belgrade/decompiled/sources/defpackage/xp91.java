package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class xp91 implements ga91, dan, fan {
    public static final /* synthetic */ xp91 b = new xp91(0);
    public static final /* synthetic */ xp91 c = new xp91(2);
    public static final /* synthetic */ xp91 w = new xp91(3);
    public static final /* synthetic */ xp91 x = new xp91(4);
    public final /* synthetic */ int a;

    public /* synthetic */ xp91(int i) {
        this.a = i;
    }

    @Override // defpackage.fan
    public ean b(Context context, String str, dan danVar) {
        ean eanVar = new ean();
        int i = danVar.i(context, str);
        eanVar.a = i;
        if (i != 0) {
            eanVar.c = -1;
            return eanVar;
        }
        int v = danVar.v(context, str, true);
        eanVar.b = v;
        if (v != 0) {
            eanVar.c = 1;
        }
        return eanVar;
    }

    @Override // defpackage.dan
    public int i(Context context, String str) {
        return gan.a(context, str);
    }

    @Override // defpackage.dan
    public int v(Context context, String str, boolean z) {
        return gan.d(context, str, z);
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 0:
                List list = nw91.a;
                ((jfb1) cfb1.b.a.get()).getClass();
                Boolean bool = (Boolean) jfb1.c.b();
                bool.getClass();
                return bool;
            case 1:
            default:
                ((wgb1) pgb1.b.a.get()).getClass();
                return new Boolean(((Boolean) wgb1.a.b()).booleanValue());
            case 2:
                List list2 = nw91.a;
                eib1.b.get().getClass();
                Boolean bool2 = (Boolean) lib1.a.b();
                bool2.getClass();
                return bool2;
            case 3:
                List list3 = nw91.a;
                ((aeb1) sdb1.b.a.get()).getClass();
                Boolean bool3 = (Boolean) aeb1.a.b();
                bool3.getClass();
                return bool3;
        }
    }
}
