package com.gamericefishpro.space.z4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements s {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public final Object i;

    public h(f defaultLifecycleObserver, s sVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.e = defaultLifecycleObserver;
        this.i = sVar;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u owner, o event) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f fVar = (f) this.e;
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (g.a[event.ordinal()]) {
                    case 1:
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 2:
                        fVar.c(owner);
                        break;
                    case 3:
                        fVar.b(owner);
                        break;
                    case 4:
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        fVar.l(owner);
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new com.gamericefishpro.space.oh.k();
                }
                s sVar = (s) this.i;
                if (sVar != null) {
                    sVar.j(owner, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == o.ON_START) {
                    ((w) this.e).f(this);
                    ((com.gamericefishpro.space.u6.s) this.i).m();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.i).a;
                List list = (List) map.get(event);
                Object obj = this.e;
                b.a(list, owner, event, obj);
                b.a((List) map.get(o.ON_ANY), owner, event, obj);
                return;
        }
    }

    public h(t tVar) {
        this.e = tVar;
        d dVar = d.c;
        Class<?> cls = tVar.getClass();
        b bVar = (b) dVar.a.get(cls);
        this.i = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public h(com.gamericefishpro.space.u6.s sVar, w wVar) {
        this.e = wVar;
        this.i = sVar;
    }
}
