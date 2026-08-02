package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s50 extends m50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t50 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x40 d;

    public /* synthetic */ s50(t50 t50Var, String str, x40 x40Var, int i) {
        this.a = i;
        this.b = t50Var;
        this.c = str;
        this.d = x40Var;
    }

    @Override // defpackage.m50
    public final void a(Object obj) {
        int i = this.a;
        x40 x40Var = this.d;
        String str = this.c;
        t50 t50Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = t50Var.d;
                Object obj2 = t50Var.b.get(str);
                if (obj2 == null) {
                    vg10.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", x40Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    t50Var.b(intValue, x40Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = t50Var.d;
                Object obj3 = t50Var.b.get(str);
                if (obj3 == null) {
                    vg10.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", x40Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    t50Var.b(intValue2, x40Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    @Override // defpackage.m50
    public final void b() {
        int i = this.a;
        String str = this.c;
        t50 t50Var = this.b;
        switch (i) {
            case 0:
                t50Var.f(str);
                break;
            default:
                t50Var.f(str);
                break;
        }
    }
}
