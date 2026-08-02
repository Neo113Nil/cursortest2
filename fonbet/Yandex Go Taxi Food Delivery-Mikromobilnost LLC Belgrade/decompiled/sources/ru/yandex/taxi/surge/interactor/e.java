package ru.yandex.taxi.surge.interactor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.gww0;
import defpackage.hww0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.qrv0;
import defpackage.rqo;
import defpackage.rrv0;
import defpackage.tt2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class e {
    public final ru.yandex.taxi.design.utils.b a;
    public final com.yandex.go.navigation.screen.c b;
    public final hww0 c;
    public final tt2 d;
    public final Context e;
    public final qqo f;
    public final com.yandex.go.coroutines.h g = new com.yandex.go.coroutines.h(new SummaryWidgetOnBoardingInteractor$bubbleBackground$1(null, this));
    public final com.yandex.go.coroutines.h h = new com.yandex.go.coroutines.h(new SummaryWidgetOnBoardingInteractor$bubblePointer$1(1, this, e.class, "createBubblePointer", "createBubblePointer(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));

    public e(ru.yandex.taxi.design.utils.b bVar, com.yandex.go.navigation.screen.c cVar, hww0 hww0Var, tt2 tt2Var, Context context, rqo rqoVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = hww0Var;
        this.d = tt2Var;
        this.e = context;
        this.f = ((jbh) rqoVar).c(new gww0(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, String str, String str2, ContinuationImpl continuationImpl) {
        SummaryWidgetOnBoardingInteractor$convertToState$1 summaryWidgetOnBoardingInteractor$convertToState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        Drawable drawable;
        String str3;
        String str4;
        eVar.getClass();
        if (continuationImpl instanceof SummaryWidgetOnBoardingInteractor$convertToState$1) {
            summaryWidgetOnBoardingInteractor$convertToState$1 = (SummaryWidgetOnBoardingInteractor$convertToState$1) continuationImpl;
            int i2 = summaryWidgetOnBoardingInteractor$convertToState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetOnBoardingInteractor$convertToState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryWidgetOnBoardingInteractor$convertToState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetOnBoardingInteractor$convertToState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str.length() == 0 && str2.length() == 0) {
                        return qrv0.a;
                    }
                    com.yandex.go.coroutines.h hVar = eVar.g;
                    summaryWidgetOnBoardingInteractor$convertToState$1.L$0 = str;
                    summaryWidgetOnBoardingInteractor$convertToState$1.L$1 = str2;
                    summaryWidgetOnBoardingInteractor$convertToState$1.label = 1;
                    obj = hVar.a(summaryWidgetOnBoardingInteractor$convertToState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        drawable = (Drawable) summaryWidgetOnBoardingInteractor$convertToState$1.L$2;
                        str4 = (String) summaryWidgetOnBoardingInteractor$convertToState$1.L$1;
                        str3 = (String) summaryWidgetOnBoardingInteractor$convertToState$1.L$0;
                        kotlin.b.b(obj);
                        return new rrv0(drawable, (Drawable) obj, str3, str4);
                    }
                    str2 = (String) summaryWidgetOnBoardingInteractor$convertToState$1.L$1;
                    str = (String) summaryWidgetOnBoardingInteractor$convertToState$1.L$0;
                    kotlin.b.b(obj);
                }
                Drawable drawable2 = (Drawable) obj;
                com.yandex.go.coroutines.h hVar2 = eVar.h;
                summaryWidgetOnBoardingInteractor$convertToState$1.L$0 = str;
                summaryWidgetOnBoardingInteractor$convertToState$1.L$1 = str2;
                summaryWidgetOnBoardingInteractor$convertToState$1.L$2 = drawable2;
                summaryWidgetOnBoardingInteractor$convertToState$1.label = 2;
                a = hVar2.a(summaryWidgetOnBoardingInteractor$convertToState$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    drawable = drawable2;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    return new rrv0(drawable, (Drawable) obj, str3, str4);
                }
                return coroutineSingletons;
            }
        }
        summaryWidgetOnBoardingInteractor$convertToState$1 = new SummaryWidgetOnBoardingInteractor$convertToState$1(eVar, continuationImpl);
        Object obj2 = summaryWidgetOnBoardingInteractor$convertToState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetOnBoardingInteractor$convertToState$1.label;
        if (i != 0) {
        }
        Drawable drawable22 = (Drawable) obj2;
        com.yandex.go.coroutines.h hVar22 = eVar.h;
        summaryWidgetOnBoardingInteractor$convertToState$1.L$0 = str;
        summaryWidgetOnBoardingInteractor$convertToState$1.L$1 = str2;
        summaryWidgetOnBoardingInteractor$convertToState$1.L$2 = drawable22;
        summaryWidgetOnBoardingInteractor$convertToState$1.label = 2;
        a = hVar22.a(summaryWidgetOnBoardingInteractor$convertToState$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
