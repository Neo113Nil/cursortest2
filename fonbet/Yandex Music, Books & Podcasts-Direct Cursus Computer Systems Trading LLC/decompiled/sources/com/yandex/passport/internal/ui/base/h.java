package com.yandex.passport.internal.ui.base;

import android.os.Bundle;
import com.yandex.passport.internal.ui.util.q;
import defpackage.bfu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public class h extends bfu {
    public final q k = new q();
    public final com.yandex.passport.internal.ui.util.k l;
    public final com.yandex.passport.legacy.lx.f m;
    public final com.yandex.passport.data.network.l n;
    public final ArrayList o;
    public int p;

    public h() {
        Boolean bool = Boolean.FALSE;
        com.yandex.passport.internal.ui.util.k kVar = new com.yandex.passport.internal.ui.util.k();
        kVar.l(bool);
        this.l = kVar;
        this.m = new com.yandex.passport.legacy.lx.f();
        com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l();
        lVar.a = new HashMap();
        this.n = lVar;
        this.o = new ArrayList();
    }

    public final void G(boolean z) {
        int i = this.p;
        if (z) {
            this.p = i + 1;
        } else if (i > 0) {
            this.p = i - 1;
        }
        this.l.m(Boolean.valueOf(this.p > 0));
    }

    public void H(Bundle bundle) {
    }

    public void J(Bundle bundle) {
        bundle.getClass();
    }

    public final void K(com.yandex.passport.internal.interaction.b bVar) {
        this.o.add(bVar);
        final int i = 0;
        bVar.b.g(new g(0, new Function1(this) { // from class: com.yandex.passport.internal.ui.base.f
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.b.k.l((com.yandex.passport.internal.ui.f) obj);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        this.b.G(bool.booleanValue());
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        bVar.c.g(new g(0, new Function1(this) { // from class: com.yandex.passport.internal.ui.base.f
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.k.l((com.yandex.passport.internal.ui.f) obj);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        this.b.G(bool.booleanValue());
                        break;
                }
                return Unit.a;
            }
        }));
    }

    public final void a(com.yandex.passport.internal.ui.f fVar) {
        fVar.getClass();
        this.k.m(fVar);
    }

    @Override // defpackage.bfu
    public void onCleared() {
        super.onCleared();
        ArrayList arrayList = this.m.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.yandex.passport.legacy.lx.j) it.next()).a();
        }
        arrayList.clear();
        Iterator it2 = this.o.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = ((com.yandex.passport.internal.interaction.b) it2.next()).a.a;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((com.yandex.passport.legacy.lx.j) it3.next()).a();
            }
            arrayList2.clear();
        }
    }
}
