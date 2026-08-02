package ru.yandex.taxi.masstransit.trains.search;

import defpackage.mja1;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.q8v0;
import defpackage.sc01;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class d {
    public final ru.yandex.taxi.widget.c a;

    public d(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sc01 sc01Var, SuggestType suggestType, ContinuationImpl continuationImpl) {
        TrainStationSuggestDtoMapper$map$1 trainStationSuggestDtoMapper$map$1;
        int i;
        sc01 sc01Var2;
        nvi0 nvi0Var;
        SuggestType suggestType2;
        String str;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        SuggestType suggestType3;
        if (continuationImpl instanceof TrainStationSuggestDtoMapper$map$1) {
            trainStationSuggestDtoMapper$map$1 = (TrainStationSuggestDtoMapper$map$1) continuationImpl;
            int i2 = trainStationSuggestDtoMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trainStationSuggestDtoMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trainStationSuggestDtoMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trainStationSuggestDtoMapper$map$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = sc01Var.a;
                    ovi0 a = mja1.a(sc01Var.b, null, 6);
                    FormattedText formattedText2 = sc01Var.c;
                    trainStationSuggestDtoMapper$map$1.L$0 = sc01Var;
                    trainStationSuggestDtoMapper$map$1.L$1 = suggestType;
                    trainStationSuggestDtoMapper$map$1.L$2 = str2;
                    trainStationSuggestDtoMapper$map$1.L$3 = a;
                    trainStationSuggestDtoMapper$map$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, trainStationSuggestDtoMapper$map$1, 30);
                    if (i3 != coroutineSingletons) {
                        sc01Var2 = sc01Var;
                        nvi0Var = a;
                        suggestType2 = suggestType;
                        str = str2;
                        obj = i3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) trainStationSuggestDtoMapper$map$1.L$5;
                    nvi0Var = (nvi0) trainStationSuggestDtoMapper$map$1.L$4;
                    str = (String) trainStationSuggestDtoMapper$map$1.L$3;
                    suggestType3 = (SuggestType) trainStationSuggestDtoMapper$map$1.L$1;
                    kotlin.b.b(obj);
                    charSequence = charSequence2;
                    suggestType2 = suggestType3;
                    return new q8v0(str, nvi0Var, charSequence, suggestType2);
                }
                nvi0Var = (nvi0) trainStationSuggestDtoMapper$map$1.L$3;
                str = (String) trainStationSuggestDtoMapper$map$1.L$2;
                suggestType2 = (SuggestType) trainStationSuggestDtoMapper$map$1.L$1;
                sc01Var2 = (sc01) trainStationSuggestDtoMapper$map$1.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                formattedText = sc01Var2.d;
                if (formattedText != null) {
                    trainStationSuggestDtoMapper$map$1.L$0 = null;
                    trainStationSuggestDtoMapper$map$1.L$1 = suggestType2;
                    trainStationSuggestDtoMapper$map$1.L$2 = null;
                    trainStationSuggestDtoMapper$map$1.L$3 = str;
                    trainStationSuggestDtoMapper$map$1.L$4 = nvi0Var;
                    trainStationSuggestDtoMapper$map$1.L$5 = charSequence;
                    trainStationSuggestDtoMapper$map$1.label = 2;
                    Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, trainStationSuggestDtoMapper$map$1, 30);
                    if (i4 != coroutineSingletons) {
                        obj = i4;
                        charSequence2 = charSequence;
                        suggestType3 = suggestType2;
                        charSequence = charSequence2;
                        suggestType2 = suggestType3;
                    }
                    return coroutineSingletons;
                }
                return new q8v0(str, nvi0Var, charSequence, suggestType2);
            }
        }
        trainStationSuggestDtoMapper$map$1 = new TrainStationSuggestDtoMapper$map$1(this, continuationImpl);
        Object obj2 = trainStationSuggestDtoMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trainStationSuggestDtoMapper$map$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = sc01Var2.d;
        if (formattedText != null) {
        }
        return new q8v0(str, nvi0Var, charSequence, suggestType2);
    }
}
