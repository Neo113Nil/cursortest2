package com.gamericefishpro.space.d;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.ka.a0;
import com.gamericefishpro.space.ph.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.j5.d {
    public final s f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s onBackPressedCallback, o info) {
        super(info, onBackPressedCallback.b);
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f = onBackPressedCallback;
        this.g = true;
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void a() {
        s sVar = this.f;
        switch (sVar.d) {
            case 1:
                ((com.gamericefishpro.space.f.b) sVar.e).t();
                return;
            case 2:
            default:
                return;
            case 3:
                a0 a0Var = (a0) sVar.e;
                if (a0.l(3)) {
                    Objects.toString(a0Var);
                }
                if (a0.l(3)) {
                    Objects.toString((com.gamericefishpro.space.w4.a) a0Var.f);
                }
                com.gamericefishpro.space.w4.a aVar = (com.gamericefishpro.space.w4.a) a0Var.f;
                if (aVar != null) {
                    aVar.d = false;
                    ArrayList arrayList = aVar.a;
                    int size = arrayList.size() - 1;
                    while (size >= 0) {
                        com.gamericefishpro.space.w4.l lVar = (com.gamericefishpro.space.w4.l) arrayList.get(size);
                        if (lVar.c) {
                            if (lVar.a == 8) {
                                lVar.c = false;
                                arrayList.remove(size - 1);
                                size--;
                            } else {
                                lVar.b.getClass();
                                lVar.a = 2;
                                lVar.c = false;
                                for (int i = size - 1; i >= 0; i--) {
                                    com.gamericefishpro.space.w4.l lVar2 = (com.gamericefishpro.space.w4.l) arrayList.get(i);
                                    if (lVar2.c) {
                                        lVar2.b.getClass();
                                        arrayList.remove(i);
                                        size--;
                                    }
                                }
                            }
                        }
                        size--;
                    }
                    com.gamericefishpro.space.w4.a aVar2 = (com.gamericefishpro.space.w4.a) a0Var.f;
                    com.appsflyer.a aVar3 = new com.appsflyer.a(21, a0Var);
                    if (aVar2.b == null) {
                        aVar2.b = new ArrayList();
                    }
                    aVar2.b.add(aVar3);
                    ((com.gamericefishpro.space.w4.a) a0Var.f).a(false);
                    a0Var.j();
                    throw null;
                }
                return;
        }
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void b() {
        s sVar = this.f;
        switch (sVar.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.g3.a) sVar.e).invoke(sVar);
                return;
            case 1:
                ((com.gamericefishpro.space.f.b) sVar.e).u();
                return;
            case 2:
                ((d0) sVar.e).d();
                return;
            default:
                a0 a0Var = (a0) sVar.e;
                if (a0.l(3)) {
                    Objects.toString(a0Var);
                }
                a0Var.j();
                throw null;
        }
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void c(com.gamericefishpro.space.j5.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a backEvent = new a(event);
        s sVar = this.f;
        switch (sVar.d) {
            case 1:
                ((com.gamericefishpro.space.f.b) sVar.e).v(backEvent);
                return;
            case 2:
            default:
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                return;
            case 3:
                a0 a0Var = (a0) sVar.e;
                if (a0.l(2)) {
                    Objects.toString(a0Var);
                }
                if (((com.gamericefishpro.space.w4.a) a0Var.f) != null) {
                    ArrayList arrayList = new ArrayList(Collections.singletonList((com.gamericefishpro.space.w4.a) a0Var.f));
                    HashSet<com.gamericefishpro.space.w4.b> hashSet = new HashSet();
                    ArrayList arrayList2 = ((com.gamericefishpro.space.w4.a) arrayList.get(0)).a;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        com.gamericefishpro.space.w4.g gVar = ((com.gamericefishpro.space.w4.l) obj).b;
                    }
                    for (com.gamericefishpro.space.w4.b bVar : hashSet) {
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        a0.l(2);
                        ArrayList arrayList3 = bVar.c;
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList3.get(i2);
                            i2++;
                            ((com.gamericefishpro.space.w4.o) obj2).getClass();
                            c0.l(arrayList4, null);
                        }
                        List listL = CollectionsKt.L(CollectionsKt.O(arrayList4));
                        int size3 = listL.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            ((com.gamericefishpro.space.w4.n) listL.get(i3)).a(backEvent, bVar.a);
                        }
                    }
                    Iterator it = ((ArrayList) a0Var.h).iterator();
                    if (it.hasNext()) {
                        throw com.gamericefishpro.space.m5.a.f(it);
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void d(com.gamericefishpro.space.j5.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        s sVar = this.f;
        a backEvent = new a(event);
        switch (sVar.d) {
            case 1:
                ((com.gamericefishpro.space.f.b) sVar.e).w();
                return;
            case 2:
            default:
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                return;
            case 3:
                a0 a0Var = (a0) sVar.e;
                if (a0.l(3)) {
                    Objects.toString(a0Var);
                }
                a0Var.getClass();
                HashSet<com.gamericefishpro.space.w4.b> hashSet = new HashSet();
                com.gamericefishpro.space.u6.s sVar2 = (com.gamericefishpro.space.u6.s) a0Var.d;
                sVar2.getClass();
                ArrayList arrayList = new ArrayList();
                for (com.gamericefishpro.space.w4.k kVar : ((HashMap) sVar2.i).values()) {
                }
                if (arrayList.size() > 0) {
                    ((com.gamericefishpro.space.w4.k) arrayList.get(0)).getClass();
                    throw null;
                }
                for (com.gamericefishpro.space.w4.b bVar : hashSet) {
                    bVar.getClass();
                    a0.l(2);
                    boolean zIsAttachedToWindow = bVar.a.isAttachedToWindow();
                    synchronized (bVar.b) {
                        try {
                            ArrayList arrayList2 = bVar.b;
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList2.get(i);
                                i++;
                                ((com.gamericefishpro.space.w4.o) obj).getClass();
                            }
                            bVar.b(bVar.b);
                            ArrayList arrayListM = CollectionsKt.M(bVar.c);
                            int size2 = arrayListM.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayListM.get(i2);
                                i2++;
                                ((com.gamericefishpro.space.w4.o) obj2).getClass();
                            }
                            int size3 = arrayListM.size();
                            int i3 = 0;
                            while (i3 < size3) {
                                Object obj3 = arrayListM.get(i3);
                                i3++;
                                com.gamericefishpro.space.w4.o oVar = (com.gamericefishpro.space.w4.o) obj3;
                                if (a0.l(2)) {
                                    if (!zIsAttachedToWindow) {
                                        Objects.toString(bVar.a);
                                    }
                                    Objects.toString(oVar);
                                }
                                oVar.a(bVar.a);
                            }
                            ArrayList arrayListM2 = CollectionsKt.M(bVar.b);
                            int size4 = arrayListM2.size();
                            int i4 = 0;
                            while (i4 < size4) {
                                Object obj4 = arrayListM2.get(i4);
                                i4++;
                                ((com.gamericefishpro.space.w4.o) obj4).getClass();
                            }
                            int size5 = arrayListM2.size();
                            int i5 = 0;
                            while (i5 < size5) {
                                Object obj5 = arrayListM2.get(i5);
                                i5++;
                                com.gamericefishpro.space.w4.o oVar2 = (com.gamericefishpro.space.w4.o) obj5;
                                if (a0.l(2)) {
                                    if (!zIsAttachedToWindow) {
                                        Objects.toString(bVar.a);
                                    }
                                    Objects.toString(oVar2);
                                }
                                oVar2.a(bVar.a);
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
    }

    public final void g(boolean z) {
        this.g = z;
        f(z && this.f.b);
    }
}
