package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class xyr extends rr4 {
    public final HashMap c;
    public final /* synthetic */ yyr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyr(yyr yyrVar) {
        super(0);
        this.d = yyrVar;
        this.c = new HashMap();
    }

    @Override // defpackage.rr4
    public final void f(vpv vpvVar) {
        ArrayList arrayList = this.d.b;
        if ((vpvVar.a.d() & 519) != 0) {
            this.c.remove(vpvVar);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                lym lymVar = (lym) arrayList.get(size);
                int i = lymVar.e;
                boolean z = i > 0;
                int i2 = i - 1;
                lymVar.e = i2;
                if (z && i2 == 0) {
                    lymVar.c();
                }
            }
        }
    }

    @Override // defpackage.rr4
    public final void g(vpv vpvVar) {
        ArrayList arrayList = this.d.b;
        if ((vpvVar.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((lym) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.rr4
    public final kqv h(kqv kqvVar, List list) {
        ArrayList arrayList = this.d.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            vpv vpvVar = (vpv) list.get(size);
            Integer num = (Integer) this.c.get(vpvVar);
            if (num != null) {
                int intValue = num.intValue();
                float a = vpvVar.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        zne b = zne.b(kqvVar.a.g(519), kqvVar.a.g(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            lym lymVar = (lym) arrayList.get(size2);
            zne zneVar = lymVar.d;
            ArrayList arrayList2 = lymVar.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                kym kymVar = (kym) arrayList2.get(size3);
                kymVar.getClass();
                if ((2 & i) != 0) {
                    jym jymVar = kymVar.a;
                    if (!jymVar.c) {
                        jymVar.c = true;
                        jtc jtcVar = jymVar.h;
                        if (jtcVar != null) {
                            ((View) jtcVar.b).setVisibility(0);
                        }
                    }
                    int i2 = zneVar.b;
                    if (i2 > 0) {
                        kymVar.b(b.b / i2);
                    }
                    kymVar.a(rectF.top);
                }
            }
        }
        return kqvVar;
    }

    @Override // defpackage.rr4
    public final nur i(vpv vpvVar, nur nurVar) {
        if ((vpvVar.a.d() & 519) != 0) {
            zne zneVar = (zne) nurVar.c;
            zne zneVar2 = (zne) nurVar.b;
            int i = zneVar.a != zneVar2.a ? 1 : 0;
            if (zneVar.b != zneVar2.b) {
                i |= 2;
            }
            if (zneVar.c != zneVar2.c) {
                i |= 4;
            }
            if (zneVar.d != zneVar2.d) {
                i |= 8;
            }
            this.c.put(vpvVar, Integer.valueOf(i));
        }
        return nurVar;
    }
}
