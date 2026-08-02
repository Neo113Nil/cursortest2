package ru.yandex.taxi.summary.solid.interactor;

import defpackage.flv0;
import defpackage.fnx0;
import defpackage.ilv0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pwy0;
import defpackage.vlv0;
import defpackage.wiq0;
import defpackage.wu1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class u {
    public final ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.a a;
    public final ru.yandex.taxi.summary.promotions.repository.e b;
    public final pwy0 c;
    public final wiq0 d;

    public u(ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.a aVar, ru.yandex.taxi.summary.promotions.repository.e eVar, pwy0 pwy0Var, wiq0 wiq0Var) {
        this.a = aVar;
        this.b = eVar;
        this.c = pwy0Var;
        this.d = wiq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(u uVar, ilv0 ilv0Var, ContinuationImpl continuationImpl) {
        SummaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1 summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1;
        int i;
        flv0 flv0Var;
        uVar.getClass();
        if (continuationImpl instanceof SummaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1) {
            summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1 = (SummaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1) continuationImpl;
            int i2 = summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String id = ilv0Var.getId();
                    summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.L$0 = null;
                    summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.label = 1;
                    obj = uVar.b(id, summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                flv0Var = !(obj instanceof flv0) ? (flv0) obj : null;
                if (flv0Var != null) {
                    return vlv0.a;
                }
                ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.a aVar = uVar.a;
                summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.L$0 = null;
                summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.L$1 = null;
                summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.label = 2;
                Object b = aVar.b(flv0Var, summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1);
                return b == obj2 ? obj2 : b;
            }
        }
        summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1 = new SummaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1(uVar, continuationImpl);
        Object obj3 = summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionModalWindowsInteractor$getCurrentModalWindowUiState$1.label;
        if (i != 0) {
        }
        if (!(obj3 instanceof flv0)) {
        }
        if (flv0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        SummaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1 summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1;
        int i;
        if (continuationImpl instanceof SummaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1) {
            summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1 = (SummaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1) continuationImpl;
            int i2 = summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).n();
                    if (n != null) {
                        pex0 pex0Var = n.c;
                        String str2 = pex0Var.b;
                        wu1 wu1Var = pex0Var.O;
                        String a = wu1Var != null ? wu1Var.a() : null;
                        summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.L$0 = str;
                        summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.L$1 = null;
                        summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.label = 1;
                        obj = this.b.i(str2, a, EmptyList.a, summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.L$0;
                kotlin.b.b(obj);
                for (Object obj2 : (List) obj) {
                    if (jl40.l(((ilv0) obj2).getId(), str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1 = new SummaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1(this, continuationImpl);
        Object obj3 = summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionModalWindowsInteractor$findSummaryPromotionModalWindow$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    public final m0 c(ilv0 ilv0Var) {
        return new m0(new kotlinx.coroutines.flow.n(this.b.d(), new SummaryPromotionModalWindowsInteractor$uiStateFlow$1(2, null)), this.c.a(), new SummaryPromotionModalWindowsInteractor$uiStateFlow$2(this, ilv0Var, null));
    }
}
