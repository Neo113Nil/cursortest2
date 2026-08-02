package ru.yandex.taxi.favorites.rides.save_modal.domain;

import defpackage.avj0;
import defpackage.cqk0;
import defpackage.d6z;
import defpackage.e0m0;
import defpackage.f47;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.rzl0;
import defpackage.t1b0;
import defpackage.tzl0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;
import ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ rzl0 b;
    public final /* synthetic */ ru.yandex.taxi.favorites.rides.save_modal.routers.b c;

    public a(b bVar, rzl0 rzl0Var, ru.yandex.taxi.favorites.rides.save_modal.routers.b bVar2) {
        this.a = bVar;
        this.b = rzl0Var;
        this.c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ResponseState responseState, Continuation continuation) {
        SaveFavoriteRideInteractor$trackLoadingState$2$emit$1 saveFavoriteRideInteractor$trackLoadingState$2$emit$1;
        int i;
        Object value;
        e0m0 e0m0Var;
        SaveFavoriteRideModalExperiment.Modal.ModalType modalType;
        Object value2;
        e0m0 e0m0Var2;
        String Y;
        b bVar = this.a;
        r0 r0Var = bVar.g;
        zuj0 zuj0Var = bVar.a;
        if (continuation instanceof SaveFavoriteRideInteractor$trackLoadingState$2$emit$1) {
            saveFavoriteRideInteractor$trackLoadingState$2$emit$1 = (SaveFavoriteRideInteractor$trackLoadingState$2$emit$1) continuation;
            int i2 = saveFavoriteRideInteractor$trackLoadingState$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveFavoriteRideInteractor$trackLoadingState$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = saveFavoriteRideInteractor$trackLoadingState$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveFavoriteRideInteractor$trackLoadingState$2$emit$1.label;
                zy11 zy11Var = zy11.a;
                ru.yandex.taxi.favorites.rides.save_modal.routers.b bVar2 = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = responseState == null ? -1 : tzl0.a[responseState.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            do {
                                value = r0Var.getValue();
                                e0m0Var = (e0m0) value;
                            } while (!r0Var.k(value, e0m0Var != null ? e0m0.a(e0m0Var, false, null, cqk0.a(e0m0Var.f, false, null, 6), f47.a(e0m0Var.i, true), 222) : null));
                        } else if (i3 == 2) {
                            modalType = this.b.i ? SaveFavoriteRideModalExperiment.Modal.ModalType.EDIT : SaveFavoriteRideModalExperiment.Modal.ModalType.SAVE;
                            t1b0 t1b0Var = bVar.f;
                            saveFavoriteRideInteractor$trackLoadingState$2$emit$1.L$0 = null;
                            saveFavoriteRideInteractor$trackLoadingState$2$emit$1.L$1 = modalType;
                            saveFavoriteRideInteractor$trackLoadingState$2$emit$1.label = 1;
                            obj = t1b0Var.b(saveFavoriteRideInteractor$trackLoadingState$2$emit$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            ((avj0) zuj0Var).h(kyh0.favorite_item_saving_error_title);
                            ((avj0) zuj0Var).h(kyh0.favorite_item_saving_error_message);
                            bVar2.b();
                            do {
                                value2 = r0Var.getValue();
                                e0m0Var2 = (e0m0) value2;
                            } while (!r0Var.k(value2, e0m0Var2 != null ? e0m0.a(e0m0Var2, true, null, cqk0.a(e0m0Var2.f, true, null, 6), f47.a(e0m0Var2.i, false), 222) : null));
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                modalType = (SaveFavoriteRideModalExperiment.Modal.ModalType) saveFavoriteRideInteractor$trackLoadingState$2$emit$1.L$1;
                kotlin.b.b(obj);
                SaveFavoriteRideModalExperiment saveFavoriteRideModalExperiment = (SaveFavoriteRideModalExperiment) obj;
                SaveFavoriteRideModalExperiment.Modal a = saveFavoriteRideModalExperiment.a(modalType);
                Y = a == null ? d6z.Y(saveFavoriteRideModalExperiment, a.l.a) : null;
                if (Y != null) {
                    bVar2.a();
                    return zy11Var;
                }
                SaveFavoriteRideModalExperiment.Modal a2 = saveFavoriteRideModalExperiment.a(modalType);
                String Y2 = a2 != null ? d6z.Y(saveFavoriteRideModalExperiment, a2.l.b) : null;
                if (Y2 == null) {
                    Y2 = "";
                }
                bVar2.c(Y, Y2);
                return zy11Var;
            }
        }
        saveFavoriteRideInteractor$trackLoadingState$2$emit$1 = new SaveFavoriteRideInteractor$trackLoadingState$2$emit$1(this, continuation);
        Object obj2 = saveFavoriteRideInteractor$trackLoadingState$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveFavoriteRideInteractor$trackLoadingState$2$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        ru.yandex.taxi.favorites.rides.save_modal.routers.b bVar22 = this.c;
        if (i != 0) {
        }
        SaveFavoriteRideModalExperiment saveFavoriteRideModalExperiment2 = (SaveFavoriteRideModalExperiment) obj2;
        SaveFavoriteRideModalExperiment.Modal a3 = saveFavoriteRideModalExperiment2.a(modalType);
        if (a3 == null) {
        }
        if (Y != null) {
        }
    }
}
