package ru.yandex.taxi.altpins.source.modal;

import defpackage.lz1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        if (r8.emit(r10, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r10 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AlternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1 alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1;
        int i;
        Object e;
        if (continuation instanceof AlternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1) {
            alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1 = (AlternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    vpr vprVar = this.a;
                    d dVar = this.b;
                    if (booleanValue) {
                        a aVar = dVar.y;
                        lz1 lz1Var = dVar.z.d;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$4 = vprVar;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.Z$0 = booleanValue;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label = 1;
                        e = aVar.d(lz1Var, alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1);
                    } else {
                        a aVar2 = dVar.y;
                        lz1 lz1Var2 = dVar.z.d;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$4 = vprVar;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.Z$0 = booleanValue;
                        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label = 2;
                        e = aVar2.e(lz1Var2, alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1);
                    }
                } else {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vpr vprVar2 = (vpr) alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$4 = null;
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label = 3;
            }
        }
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1 = new AlternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$4 = null;
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
        alternativeSourceModalViewPresenter$attachView$$inlined$map$1$2$1.label = 3;
    }
}
