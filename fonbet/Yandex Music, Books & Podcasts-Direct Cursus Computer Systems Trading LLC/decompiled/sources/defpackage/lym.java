package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lym {
    public final ArrayList a = new ArrayList();
    public final yyr b;
    public zne c;
    public zne d;
    public int e;
    public boolean f;

    public lym(yyr yyrVar, ArrayList arrayList) {
        zne zneVar = zne.e;
        this.c = zneVar;
        this.d = zneVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = yyrVar.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            zne zneVar2 = yyrVar.c;
            zne zneVar3 = yyrVar.d;
            this.c = zneVar2;
            this.d = zneVar3;
            c();
            b(yyrVar.e);
        }
        this.b = yyrVar;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kym kymVar = (kym) list.get(i);
            kymVar.getClass();
            if (!z) {
                lym lymVar = kymVar.d;
                if (lymVar != null) {
                    throw new IllegalStateException(kymVar + " is already controlled by " + lymVar);
                }
                kymVar.d = this;
                this.a.add(kymVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fod fodVar = (fod) ((kym) arrayList.get(size));
            if (!fodVar.g) {
                fodVar.c(i);
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        zne zneVar = zne.e;
        while (true) {
            int i = zneVar.d;
            int i2 = zneVar.c;
            int i3 = zneVar.b;
            int i4 = zneVar.a;
            if (size < 0) {
                return;
            }
            kym kymVar = (kym) arrayList.get(size);
            zne zneVar2 = this.c;
            zne zneVar3 = this.d;
            kymVar.b = zneVar2;
            jym jymVar = kymVar.a;
            kymVar.c = zneVar3;
            if (!jymVar.b.equals(zneVar)) {
                jymVar.b = zneVar;
                jtc jtcVar = jymVar.h;
                if (jtcVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jtcVar.a;
                    layoutParams.leftMargin = i4;
                    layoutParams.topMargin = i3;
                    layoutParams.rightMargin = i2;
                    layoutParams.bottomMargin = i;
                    ((View) jtcVar.b).setLayoutParams(layoutParams);
                }
            }
            int i5 = kymVar.b.b;
            int i6 = (int) (((fod) kymVar).i * kymVar.c.b);
            if (jymVar.a != i6) {
                jymVar.a = i6;
                jtc jtcVar2 = jymVar.h;
                if (jtcVar2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) jtcVar2.a;
                    layoutParams2.height = i6;
                    ((View) jtcVar2.b).setLayoutParams(layoutParams2);
                }
            }
            boolean z = i5 > 0;
            if (jymVar.c != z) {
                jymVar.c = z;
                jtc jtcVar3 = jymVar.h;
                if (jtcVar3 != null) {
                    ((View) jtcVar3.b).setVisibility(z ? 0 : 4);
                }
            }
            float f = 0.0f;
            kymVar.a(i5 > 0 ? 1.0f : 0.0f);
            if (i5 > 0) {
                f = 1.0f;
            }
            kymVar.b(f);
            zneVar = zne.c(Math.max(i4, 0), Math.max(i3, 0), Math.max(i2, 0), Math.max(i, 0));
            size--;
        }
    }
}
