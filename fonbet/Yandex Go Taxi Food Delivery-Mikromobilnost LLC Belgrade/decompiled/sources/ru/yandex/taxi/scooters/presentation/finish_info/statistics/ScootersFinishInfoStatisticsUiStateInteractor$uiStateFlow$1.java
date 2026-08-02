package ru.yandex.taxi.scooters.presentation.finish_info.statistics;

import android.graphics.Bitmap;
import defpackage.a22;
import defpackage.avj0;
import defpackage.fmn0;
import defpackage.gmn0;
import defpackage.hmn0;
import defpackage.imn0;
import defpackage.jsq0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nnn0;
import defpackage.ny61;
import defpackage.onn0;
import defpackage.pnn0;
import defpackage.qnn0;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.experiments.g0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/g0;", "experiment", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lonn0;", "<anonymous>", "(Lru/yandex/taxi/scooters/experiments/g0;Lru/yandex/taxi/theme/ThemeType;)Lonn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1", f = "ScootersFinishInfoStatisticsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ imn0 $scootersFinishInfo;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1(imn0 imn0Var, a aVar, Continuation continuation) {
        super(3, continuation);
        this.$scootersFinishInfo = imn0Var;
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1 scootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1 = new ScootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1(this.$scootersFinishInfo, this.this$0, (Continuation) obj3);
        scootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1.L$0 = (g0) obj;
        return scootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        fmn0 fmn0Var;
        FinishCard.Statistics statistics;
        jsq0 jsq0Var;
        g0 g0Var = (g0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        imn0 imn0Var = this.$scootersFinishInfo;
        String str2 = imn0Var.b;
        Bitmap bitmap = imn0Var.c;
        qnn0 qnn0Var = this.this$0.c;
        hmn0 hmn0Var = imn0Var.i;
        String str3 = hmn0Var != null ? hmn0Var.a : null;
        String str4 = hmn0Var != null ? hmn0Var.b : null;
        a22 a22Var = qnn0Var.a;
        a22Var.getClass();
        if (str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0) {
            str = "";
        } else {
            ArrayList arrayList = new ArrayList(str4.length());
            for (int i = 0; i < str4.length(); i++) {
                char charAt = str4.charAt(i);
                if (charAt == ' ') {
                    charAt = 160;
                }
                arrayList.add(Character.valueOf(charAt));
            }
            str = ((avj0) a22Var.a).i(kyh0.scooters_route_from_addresses, str3, kotlin.collections.a.X(arrayList, "", null, null, null, 62));
        }
        imn0 imn0Var2 = this.$scootersFinishInfo;
        hmn0 hmn0Var2 = imn0Var2.i;
        String str5 = hmn0Var2 != null ? hmn0Var2.c : null;
        if (str5 == null) {
            str5 = "";
        }
        qnn0 qnn0Var2 = this.this$0.c;
        gmn0 gmn0Var = imn0Var2.j;
        FinishCard finishCard = g0Var.h;
        List M = (finishCard == null || (statistics = finishCard.c) == null || (jsq0Var = statistics.b) == null) ? null : kotlin.collections.a.M(jsq0Var);
        qnn0Var2.getClass();
        if (gmn0Var == null || M == null) {
            list = EmptyList.a;
        } else {
            list = new ArrayList();
            Iterator it = M.iterator();
            while (it.hasNext()) {
                int i2 = pnn0.a[((FinishCard.Statistics.StatisticsItem) it.next()).ordinal()];
                if (i2 == 1) {
                    fmn0Var = gmn0Var.a;
                } else if (i2 == 2) {
                    fmn0Var = gmn0Var.b;
                } else if (i2 == 3) {
                    fmn0Var = gmn0Var.c;
                } else {
                    if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    fmn0Var = gmn0Var.d;
                }
                CharSequence charSequence = fmn0Var.a;
                CharSequence charSequence2 = fmn0Var.b;
                nnn0 nnn0Var = (charSequence.length() <= 0 || charSequence2.length() <= 0) ? null : new nnn0(fmn0Var.a, charSequence2);
                if (nnn0Var != null) {
                    list.add(nnn0Var);
                }
            }
        }
        return new onn0(str2, bitmap, str, str5, list);
    }
}
