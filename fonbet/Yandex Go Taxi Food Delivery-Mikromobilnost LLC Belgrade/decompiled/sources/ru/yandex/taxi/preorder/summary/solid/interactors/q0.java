package ru.yandex.taxi.preorder.summary.solid.interactors;

import android.net.Uri;
import defpackage.a60;
import defpackage.h3y;
import defpackage.lr51;
import defpackage.ny61;
import defpackage.v770;
import defpackage.y50;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

/* loaded from: classes6.dex */
public final class q0 {
    public final com.yandex.go.yb.domain.b a;
    public final h3y b;
    public final h3y c;

    public q0(com.yandex.go.yb.domain.b bVar, h3y h3yVar, h3y h3yVar2) {
        this.a = bVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        YbPromoOnSummaryInteractor$summaryOpened$1 ybPromoOnSummaryInteractor$summaryOpened$1;
        int i;
        String str;
        if (continuationImpl instanceof YbPromoOnSummaryInteractor$summaryOpened$1) {
            ybPromoOnSummaryInteractor$summaryOpened$1 = (YbPromoOnSummaryInteractor$summaryOpened$1) continuationImpl;
            int i2 = ybPromoOnSummaryInteractor$summaryOpened$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybPromoOnSummaryInteractor$summaryOpened$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybPromoOnSummaryInteractor$summaryOpened$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybPromoOnSummaryInteractor$summaryOpened$1.label;
                com.yandex.go.yb.domain.b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ybPromoOnSummaryInteractor$summaryOpened$1.label = 1;
                    obj = bVar.a(ybPromoOnSummaryInteractor$summaryOpened$1);
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
                str = (String) obj;
                zy11 zy11Var = zy11.a;
                if (str != null) {
                    return zy11Var;
                }
                lr51 lr51Var = (lr51) this.b.get();
                lr51Var.getClass();
                Uri parse = Uri.parse(str);
                lr51Var.a.getClass();
                if (!ExternalSchemesInteractor.a(parse) && !"yandex_bank".equalsIgnoreCase(parse.getAuthority())) {
                    return zy11Var;
                }
                ((a60) ((y50) this.c.get())).c(str, v770.c);
                ybPromoOnSummaryInteractor$summaryOpened$1.L$0 = null;
                ybPromoOnSummaryInteractor$summaryOpened$1.label = 2;
                Object b = bVar.b(ybPromoOnSummaryInteractor$summaryOpened$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        ybPromoOnSummaryInteractor$summaryOpened$1 = new YbPromoOnSummaryInteractor$summaryOpened$1(this, continuationImpl);
        Object obj2 = ybPromoOnSummaryInteractor$summaryOpened$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybPromoOnSummaryInteractor$summaryOpened$1.label;
        com.yandex.go.yb.domain.b bVar2 = this.a;
        if (i != 0) {
        }
        str = (String) obj2;
        zy11 zy11Var2 = zy11.a;
        if (str != null) {
        }
    }
}
