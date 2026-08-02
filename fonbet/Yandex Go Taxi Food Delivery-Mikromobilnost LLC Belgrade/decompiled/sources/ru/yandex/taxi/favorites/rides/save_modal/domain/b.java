package ru.yandex.taxi.favorites.rides.save_modal.domain;

import defpackage.bvf0;
import defpackage.c5l0;
import defpackage.cqk0;
import defpackage.d5l0;
import defpackage.d6z;
import defpackage.dok0;
import defpackage.e0m0;
import defpackage.evu0;
import defpackage.f0m0;
import defpackage.f47;
import defpackage.gci0;
import defpackage.hqj0;
import defpackage.jbh;
import defpackage.m9j;
import defpackage.mth;
import defpackage.n9j;
import defpackage.ny61;
import defpackage.qzl0;
import defpackage.rqo;
import defpackage.rzl0;
import defpackage.s6k0;
import defpackage.scc;
import defpackage.t1b0;
import defpackage.tcc;
import defpackage.tk91;
import defpackage.tpr;
import defpackage.u2b1;
import defpackage.xna1;
import defpackage.yt11;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;
import ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;

/* loaded from: classes5.dex */
public final class b implements yt11 {
    public final zuj0 a;
    public final c b;
    public final f0m0 c;
    public final hqj0 d;
    public final s6k0 e;
    public final t1b0 f;
    public final r0 g;
    public final mth h;

    public b(zuj0 zuj0Var, c cVar, f0m0 f0m0Var, hqj0 hqj0Var, s6k0 s6k0Var, rqo rqoVar) {
        this.a = zuj0Var;
        this.b = cVar;
        this.c = f0m0Var;
        this.d = hqj0Var;
        this.e = s6k0Var;
        SaveFavoriteRideModalExperiment.Companion.getClass();
        this.f = ((jbh) rqoVar).e(SaveFavoriteRideModalExperiment.f);
        r0 c = bvf0.c(null);
        this.g = c;
        this.h = new mth(e.d(c), 6);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rzl0 rzl0Var, ContinuationImpl continuationImpl) {
        SaveFavoriteRideInteractor$initModalContent$1 saveFavoriteRideInteractor$initModalContent$1;
        int i;
        ru.yandex.taxi.requirements.models.net.experiment.c cVar;
        rzl0 rzl0Var2;
        SaveFavoriteRideModalExperiment saveFavoriteRideModalExperiment;
        Object obj;
        d5l0 d5l0Var;
        n9j n9jVar;
        RequirementBubbleDto requirementBubbleDto;
        m9j m9jVar;
        if (continuationImpl instanceof SaveFavoriteRideInteractor$initModalContent$1) {
            saveFavoriteRideInteractor$initModalContent$1 = (SaveFavoriteRideInteractor$initModalContent$1) continuationImpl;
            int i2 = saveFavoriteRideInteractor$initModalContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideInteractor$initModalContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = saveFavoriteRideInteractor$initModalContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideInteractor$initModalContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.requirements.models.net.experiment.c b = this.d.b();
                    saveFavoriteRideInteractor$initModalContent$1.L$0 = rzl0Var;
                    saveFavoriteRideInteractor$initModalContent$1.L$1 = b;
                    saveFavoriteRideInteractor$initModalContent$1.label = 1;
                    Object b2 = this.f.b(saveFavoriteRideInteractor$initModalContent$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cVar = b;
                    obj2 = b2;
                    rzl0Var2 = rzl0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (ru.yandex.taxi.requirements.models.net.experiment.c) saveFavoriteRideInteractor$initModalContent$1.L$1;
                    rzl0Var2 = (rzl0) saveFavoriteRideInteractor$initModalContent$1.L$0;
                    kotlin.b.b(obj2);
                }
                saveFavoriteRideModalExperiment = (SaveFavoriteRideModalExperiment) obj2;
                if (saveFavoriteRideModalExperiment.b) {
                    boolean z = rzl0Var2.i;
                    boolean z2 = rzl0Var2.i;
                    SaveFavoriteRideModalExperiment.Modal.ModalType modalType = z ? SaveFavoriteRideModalExperiment.Modal.ModalType.EDIT : SaveFavoriteRideModalExperiment.Modal.ModalType.SAVE;
                    Iterator it = saveFavoriteRideModalExperiment.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((SaveFavoriteRideModalExperiment.Modal) obj).a == modalType) {
                            break;
                        }
                    }
                    if (obj != null) {
                        this.c.getClass();
                        SaveFavoriteRideModalExperiment.Modal.ModalType modalType2 = z2 ? SaveFavoriteRideModalExperiment.Modal.ModalType.EDIT : SaveFavoriteRideModalExperiment.Modal.ModalType.SAVE;
                        SaveFavoriteRideModalExperiment.Modal a = saveFavoriteRideModalExperiment.a(modalType2);
                        String Y = a != null ? d6z.Y(saveFavoriteRideModalExperiment, a.g) : null;
                        if (Y != null) {
                            qzl0 qzl0Var = rzl0Var2.e;
                            c5l0 c5l0Var = new c5l0(Y, qzl0Var.a, qzl0Var.b, u2b1.a());
                            SaveFavoriteRideModalExperiment.Modal a2 = saveFavoriteRideModalExperiment.a(modalType2);
                            String Y2 = a2 != null ? d6z.Y(saveFavoriteRideModalExperiment, a2.h) : null;
                            if (Y2 != null) {
                                SaveFavoriteRideModalExperiment.Modal a3 = saveFavoriteRideModalExperiment.a(modalType2);
                                String str = a3 != null ? a3.i : null;
                                ArrayList arrayList = rzl0Var2.g;
                                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new c5l0(Y2, ((qzl0) it2.next()).a, str, tk91.c()));
                                }
                                SaveFavoriteRideModalExperiment.Modal a4 = saveFavoriteRideModalExperiment.a(modalType2);
                                String Y3 = a4 != null ? d6z.Y(saveFavoriteRideModalExperiment, a4.j) : null;
                                if (Y3 == null) {
                                    d5l0Var = null;
                                } else {
                                    qzl0 qzl0Var2 = rzl0Var2.f;
                                    c5l0 c5l0Var2 = new c5l0(Y3, qzl0Var2.a, qzl0Var2.b, xna1.a());
                                    ArrayList i3 = scc.i(c5l0Var);
                                    i3.addAll(arrayList2);
                                    i3.add(c5l0Var2);
                                    d5l0Var = new d5l0(i3);
                                }
                                if (d5l0Var != null) {
                                    SaveFavoriteRideModalExperiment.Modal a5 = saveFavoriteRideModalExperiment.a(z2 ? SaveFavoriteRideModalExperiment.Modal.ModalType.EDIT : SaveFavoriteRideModalExperiment.Modal.ModalType.SAVE);
                                    String Y4 = a5 != null ? d6z.Y(saveFavoriteRideModalExperiment, a5.k) : null;
                                    byte b3 = 0;
                                    if (Y4 == null) {
                                        n9jVar = null;
                                    } else {
                                        ArrayList<String> arrayList3 = rzl0Var2.h;
                                        ArrayList arrayList4 = new ArrayList();
                                        for (String str2 : arrayList3) {
                                            if (evu0.z(str2, '.')) {
                                                List Y5 = evu0.Y(str2, new char[]{'.'}, 2, 2);
                                                String str3 = (String) Y5.get(0);
                                                String str4 = (String) Y5.get(1);
                                                RequirementBubbleDto requirementBubbleDto2 = (RequirementBubbleDto) cVar.h.get(str3);
                                                requirementBubbleDto = requirementBubbleDto2 == null ? null : (RequirementBubbleDto) requirementBubbleDto2.f.get(str4);
                                            } else {
                                                requirementBubbleDto = (RequirementBubbleDto) cVar.h.get(str2);
                                            }
                                            if (requirementBubbleDto != null) {
                                                String Y6 = d6z.Y(cVar, requirementBubbleDto.b);
                                                if (Y6.length() != 0) {
                                                    m9jVar = new m9j(str2, Y6, requirementBubbleDto.a);
                                                    if (m9jVar == null) {
                                                        arrayList4.add(m9jVar);
                                                    }
                                                }
                                            }
                                            m9jVar = null;
                                            if (m9jVar == null) {
                                            }
                                        }
                                        n9jVar = new n9j(Y4, com.yandex.go.design.compose.list.a.b(arrayList4, new dok0(b3, 27)));
                                    }
                                    boolean z3 = this.b.e.a.getValue() == ResponseState.LOADING;
                                    boolean z4 = !z3;
                                    cqk0 cqk0Var = new cqk0(z4, null, com.yandex.go.design.compose.list.a.b(rzl0Var2.d, new dok0(b3, 26)));
                                    SaveFavoriteRideModalExperiment.Modal a6 = saveFavoriteRideModalExperiment.a(modalType);
                                    String Y7 = a6 != null ? d6z.Y(saveFavoriteRideModalExperiment, a6.d) : null;
                                    if (Y7 != null) {
                                        SaveFavoriteRideModalExperiment.Modal a7 = saveFavoriteRideModalExperiment.a(modalType);
                                        String Y8 = a7 != null ? d6z.Y(saveFavoriteRideModalExperiment, a7.e) : null;
                                        if (Y8 == null) {
                                            Y8 = Y7;
                                        }
                                        f47 f47Var = new f47(Y7, Y8, z3);
                                        SaveFavoriteRideModalExperiment.Modal a8 = saveFavoriteRideModalExperiment.a(modalType);
                                        String Y9 = a8 != null ? d6z.Y(saveFavoriteRideModalExperiment, a8.b) : null;
                                        if (Y9 != null) {
                                            SaveFavoriteRideModalExperiment.Modal a9 = saveFavoriteRideModalExperiment.a(modalType);
                                            String Y10 = a9 != null ? d6z.Y(saveFavoriteRideModalExperiment, a9.c) : null;
                                            SaveFavoriteRideModalExperiment.Modal a10 = saveFavoriteRideModalExperiment.a(modalType);
                                            String Y11 = a10 != null ? d6z.Y(saveFavoriteRideModalExperiment, a10.f) : null;
                                            String str5 = rzl0Var2.c;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            return new e0m0(z4, Y9, Y10, str5, Y11, cqk0Var, d5l0Var, n9jVar, f47Var);
                                        }
                                    }
                                }
                                return null;
                            }
                        }
                        d5l0Var = null;
                        if (d5l0Var != null) {
                        }
                        return null;
                    }
                }
                return null;
            }
        }
        saveFavoriteRideInteractor$initModalContent$1 = new SaveFavoriteRideInteractor$initModalContent$1(this, continuationImpl);
        Object obj22 = saveFavoriteRideInteractor$initModalContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideInteractor$initModalContent$1.label;
        if (i != 0) {
        }
        saveFavoriteRideModalExperiment = (SaveFavoriteRideModalExperiment) obj22;
        if (saveFavoriteRideModalExperiment.b) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ru.yandex.taxi.favorites.rides.save_modal.routers.b bVar, rzl0 rzl0Var, ContinuationImpl continuationImpl) {
        SaveFavoriteRideInteractor$onModalViewOpen$1 saveFavoriteRideInteractor$onModalViewOpen$1;
        int i;
        e0m0 e0m0Var;
        if (continuationImpl instanceof SaveFavoriteRideInteractor$onModalViewOpen$1) {
            saveFavoriteRideInteractor$onModalViewOpen$1 = (SaveFavoriteRideInteractor$onModalViewOpen$1) continuationImpl;
            int i2 = saveFavoriteRideInteractor$onModalViewOpen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideInteractor$onModalViewOpen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = saveFavoriteRideInteractor$onModalViewOpen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideInteractor$onModalViewOpen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    saveFavoriteRideInteractor$onModalViewOpen$1.L$0 = bVar;
                    saveFavoriteRideInteractor$onModalViewOpen$1.L$1 = null;
                    saveFavoriteRideInteractor$onModalViewOpen$1.label = 1;
                    obj = b(rzl0Var, saveFavoriteRideInteractor$onModalViewOpen$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    bVar = (ru.yandex.taxi.favorites.rides.save_modal.routers.b) saveFavoriteRideInteractor$onModalViewOpen$1.L$0;
                    kotlin.b.b(obj);
                }
                e0m0Var = (e0m0) obj;
                Object obj3 = zy11.a;
                if (e0m0Var != null) {
                    bVar.a();
                    return obj3;
                }
                saveFavoriteRideInteractor$onModalViewOpen$1.L$0 = null;
                saveFavoriteRideInteractor$onModalViewOpen$1.L$1 = null;
                saveFavoriteRideInteractor$onModalViewOpen$1.L$2 = null;
                saveFavoriteRideInteractor$onModalViewOpen$1.label = 2;
                this.g.emit(e0m0Var, saveFavoriteRideInteractor$onModalViewOpen$1);
                return obj3 == obj2 ? obj2 : obj3;
            }
        }
        saveFavoriteRideInteractor$onModalViewOpen$1 = new SaveFavoriteRideInteractor$onModalViewOpen$1(this, continuationImpl);
        Object obj4 = saveFavoriteRideInteractor$onModalViewOpen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideInteractor$onModalViewOpen$1.label;
        if (i != 0) {
        }
        e0m0Var = (e0m0) obj4;
        Object obj32 = zy11.a;
        if (e0m0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons d(ru.yandex.taxi.favorites.rides.save_modal.routers.b bVar, rzl0 rzl0Var, ContinuationImpl continuationImpl) {
        SaveFavoriteRideInteractor$trackLoadingState$1 saveFavoriteRideInteractor$trackLoadingState$1;
        int i;
        if (continuationImpl instanceof SaveFavoriteRideInteractor$trackLoadingState$1) {
            saveFavoriteRideInteractor$trackLoadingState$1 = (SaveFavoriteRideInteractor$trackLoadingState$1) continuationImpl;
            int i2 = saveFavoriteRideInteractor$trackLoadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideInteractor$trackLoadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = saveFavoriteRideInteractor$trackLoadingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideInteractor$trackLoadingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gci0 gci0Var = this.b.e;
                    a aVar = new a(this, rzl0Var, bVar);
                    saveFavoriteRideInteractor$trackLoadingState$1.L$0 = null;
                    saveFavoriteRideInteractor$trackLoadingState$1.L$1 = null;
                    saveFavoriteRideInteractor$trackLoadingState$1.label = 1;
                    if (gci0Var.a.collect(aVar, saveFavoriteRideInteractor$trackLoadingState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        saveFavoriteRideInteractor$trackLoadingState$1 = new SaveFavoriteRideInteractor$trackLoadingState$1(this, continuationImpl);
        Object obj2 = saveFavoriteRideInteractor$trackLoadingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideInteractor$trackLoadingState$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
