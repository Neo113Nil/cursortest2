package com.yandex.plus.core.insets;

import android.view.View;
import defpackage.kqv;
import defpackage.nur;
import defpackage.odu;
import defpackage.rr4;
import defpackage.upv;
import defpackage.vpv;
import defpackage.wdu;
import defpackage.zne;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class c extends rr4 {
    public zne c;
    public zne d;
    public zne e;
    public zne f;
    public float g;
    public final /* synthetic */ View h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, int i) {
        super(0);
        this.h = view;
        this.i = i;
        zne zneVar = zne.e;
        this.c = zneVar;
        this.d = zneVar;
        this.e = zneVar;
        this.f = zneVar;
    }

    @Override // defpackage.rr4
    public final void f(vpv vpvVar) {
        this.h.setTranslationY(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // defpackage.rr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(vpv vpvVar) {
        zne zneVar;
        WeakHashMap weakHashMap = wdu.a;
        View view = this.h;
        kqv a = odu.a(view);
        if (a != null) {
            zneVar = a.a.g(this.i);
        }
        zneVar = zne.e;
        this.c = zneVar;
        this.g = view.getTranslationY();
    }

    @Override // defpackage.rr4
    public final kqv h(kqv kqvVar, List list) {
        Object obj;
        float f;
        kqvVar.getClass();
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((((vpv) obj).a.d() & 8) != 0) {
                break;
            }
        }
        vpv vpvVar = (vpv) obj;
        if (vpvVar != null) {
            upv upvVar = vpvVar.a;
            float f2 = this.g;
            int i = this.d.d;
            int i2 = this.c.d;
            if (i > i2) {
                f = (1 - upvVar.c()) * this.e.d;
                float f3 = this.e.d;
                float f4 = f3 - f;
                float f5 = this.f.d;
                if (f4 <= f5) {
                    f = f3 - f5;
                }
            } else {
                if (i < i2) {
                    float c = (1 - upvVar.c()) * this.e.d;
                    float f6 = this.f.d;
                    if (c > f6) {
                        f = f6 - c;
                    }
                }
                f = 0.0f;
            }
            this.h.setTranslationY(f2 + f);
        }
        return kqvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 == null) goto L6;
     */
    @Override // defpackage.rr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nur i(vpv vpvVar, nur nurVar) {
        zne zneVar;
        WeakHashMap weakHashMap = wdu.a;
        kqv a = odu.a(this.h);
        if (a != null) {
            zneVar = a.a.g(this.i);
        }
        zneVar = zne.e;
        this.d = zneVar;
        this.e = zne.a(this.c, zneVar);
        this.f = zne.b(this.c, this.d);
        return nurVar;
    }
}
