package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.igz;
import defpackage.ka2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.locationsdk.core.log.Logger$Level;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/Pair;", "Lru/yandex/taxi/locationsdk/locationprovider/android/impl/AndroidLocationDiscardReason;", "Landroid/location/Location;", "locationsAndReasons", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3", f = "AndroidDiscardedLocationFiltrationAndLogging.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3 extends SuspendLambda implements wls {
    final /* synthetic */ igz $log;
    final /* synthetic */ ka2 $logParams;
    final /* synthetic */ AndroidLocationProviderType $providerType;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3(ka2 ka2Var, igz igzVar, AndroidLocationProviderType androidLocationProviderType, Continuation continuation) {
        super(2, continuation);
        this.$logParams = ka2Var;
        this.$log = igzVar;
        this.$providerType = androidLocationProviderType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3 androidDiscardedLocationFiltrationAndLogging$logDiscarded$3 = new AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3(this.$logParams, this.$log, this.$providerType, continuation);
        androidDiscardedLocationFiltrationAndLogging$logDiscarded$3.L$0 = obj;
        return androidDiscardedLocationFiltrationAndLogging$logDiscarded$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3 androidDiscardedLocationFiltrationAndLogging$logDiscarded$3 = (AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        androidDiscardedLocationFiltrationAndLogging$logDiscarded$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Pair> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : list) {
            AndroidLocationDiscardReason androidLocationDiscardReason = (AndroidLocationDiscardReason) pair.c();
            Object obj2 = linkedHashMap.get(androidLocationDiscardReason);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(androidLocationDiscardReason, obj2);
            }
            ((List) obj2).add((Location) pair.f());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AndroidLocationDiscardReason androidLocationDiscardReason2 = (AndroidLocationDiscardReason) entry.getKey();
            List list2 = (List) entry.getValue();
            int size = list2.size();
            this.$logParams.getClass();
            List A0 = kotlin.collections.a.A0(list2, Math.min(size, 0));
            igz igzVar = this.$log;
            Pair pair2 = new Pair(CRLReasonCodeExtension.REASON, androidLocationDiscardReason2.name());
            Pair pair3 = new Pair("count", String.valueOf(list2.size()));
            Pair pair4 = new Pair("type", this.$providerType.name().toLowerCase(Locale.ROOT));
            List<Location> list3 = A0;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            for (Location location : list3) {
                DecimalFormat decimalFormat = e.a;
                arrayList.add(decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude()) + "," + location.getTime() + "," + location.getProvider());
            }
            Pair[] pairArr = {pair2, pair3, pair4, new Pair("examples", arrayList.toString())};
            igzVar.getClass();
            Logger$Level logger$Level = Logger$Level.VERBOSE;
        }
        return zy11.a;
    }
}
