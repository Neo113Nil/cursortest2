package ru.yandex.taxi.intercity.data;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.eaf0;
import defpackage.faf0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.uc4;
import defpackage.w9u;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;

/* loaded from: classes5.dex */
public final class g implements faf0 {
    public final ah00 a;

    public g(ah00 ah00Var) {
        this.a = ah00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, Point point, ContinuationImpl continuationImpl) {
        IntercityModeProductsParamFactory$createProductsParam$1 intercityModeProductsParamFactory$createProductsParam$1;
        int i;
        Address a;
        EmptyList emptyList;
        zzs zzsVar;
        int i2;
        gVar.getClass();
        if (continuationImpl instanceof IntercityModeProductsParamFactory$createProductsParam$1) {
            intercityModeProductsParamFactory$createProductsParam$1 = (IntercityModeProductsParamFactory$createProductsParam$1) continuationImpl;
            int i3 = intercityModeProductsParamFactory$createProductsParam$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                intercityModeProductsParamFactory$createProductsParam$1.label = i3 - Integer.MIN_VALUE;
                Object obj = intercityModeProductsParamFactory$createProductsParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityModeProductsParamFactory$createProductsParam$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs zzsVar2 = new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28);
                    PlainAddress.Companion.getClass();
                    a = zgc0.a(zzsVar2);
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    ah00 ah00Var = gVar.a;
                    intercityModeProductsParamFactory$createProductsParam$1.L$0 = null;
                    intercityModeProductsParamFactory$createProductsParam$1.L$1 = null;
                    intercityModeProductsParamFactory$createProductsParam$1.L$2 = zzsVar2;
                    intercityModeProductsParamFactory$createProductsParam$1.L$3 = a;
                    EmptyList emptyList2 = EmptyList.a;
                    intercityModeProductsParamFactory$createProductsParam$1.L$4 = emptyList2;
                    intercityModeProductsParamFactory$createProductsParam$1.I$0 = 1;
                    intercityModeProductsParamFactory$createProductsParam$1.label = 1;
                    Object K = ru.yandex.taxi.map.utils.a.K(ah00Var, intercityModeProductsParamFactory$createProductsParam$1);
                    if (K == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    emptyList = emptyList2;
                    zzsVar = zzsVar2;
                    obj = K;
                    i2 = 1;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = intercityModeProductsParamFactory$createProductsParam$1.I$0;
                    ?? r3 = (List) intercityModeProductsParamFactory$createProductsParam$1.L$4;
                    a = (Address) intercityModeProductsParamFactory$createProductsParam$1.L$3;
                    zzs zzsVar3 = (zzs) intercityModeProductsParamFactory$createProductsParam$1.L$2;
                    kotlin.b.b(obj);
                    emptyList = r3;
                    zzsVar = zzsVar3;
                }
                return new eaf0(zzsVar, a, emptyList, i2 != 0, (uc4) obj, null, null, null, 224);
            }
        }
        intercityModeProductsParamFactory$createProductsParam$1 = new IntercityModeProductsParamFactory$createProductsParam$1(gVar, continuationImpl);
        Object obj2 = intercityModeProductsParamFactory$createProductsParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityModeProductsParamFactory$createProductsParam$1.label;
        if (i != 0) {
        }
        return new eaf0(zzsVar, a, emptyList, i2 != 0, (uc4) obj2, null, null, null, 224);
    }

    @Override // defpackage.faf0
    public final tpr a() {
        return new f(kotlinx.coroutines.flow.e.s(new n(new d(new b(dib1.c(this.a))), new IntercityModeProductsParamFactory$listenGeo$3(this, null)), new w9u(22)), this);
    }
}
