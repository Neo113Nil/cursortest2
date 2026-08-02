package ru.yandex.taxi.preorder.source.userposition;

import android.location.Location;
import com.yandex.go.address.models.Address;
import defpackage.ah00;
import defpackage.el00;
import defpackage.gh00;
import defpackage.lk6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wls;
import defpackage.xne;
import defpackage.zy11;
import defpackage.zzs;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llk6;", "<anonymous>", "(Ltse;)Llk6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.GeoInfoRepository$currentGeoInfo$2", f = "GeoInfoRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class GeoInfoRepository$currentGeoInfo$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoInfoRepository$currentGeoInfo$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoInfoRepository$currentGeoInfo$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoInfoRepository$currentGeoInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoordinateProvider$Source coordinateProvider$Source;
        zzs B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xne xneVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Location a = this.this$0.a.a();
        zzs b = ((gh00) ((ah00) this.this$0.b.get())).e.b();
        Address e = this.this$0.d.e();
        zzs zzsVar = (e == null || (B = e.B()) == null) ? b : B;
        b bVar = this.this$0;
        uc4 D = ru.yandex.taxi.map.utils.a.D(((gh00) ((ah00) bVar.b.get())).e.a());
        String d = ((el00) bVar.c.get()).d();
        if (d == null) {
            d = "";
        }
        String str = d;
        if (a != null) {
            String provider = a.getProvider();
            if (provider != null) {
                switch (provider.hashCode()) {
                    case -1081365510:
                        if (provider.equals("mapkit")) {
                            coordinateProvider$Source = CoordinateProvider$Source.MAPKIT;
                            break;
                        }
                        break;
                    case -393473447:
                        if (provider.equals("zero_km")) {
                            coordinateProvider$Source = CoordinateProvider$Source.ZERO_KM;
                            break;
                        }
                        break;
                    case 102570:
                        if (provider.equals("gps")) {
                            coordinateProvider$Source = CoordinateProvider$Source.GPS;
                            break;
                        }
                        break;
                    case 106941:
                        if (provider.equals("lbs")) {
                            coordinateProvider$Source = CoordinateProvider$Source.LBS;
                            break;
                        }
                        break;
                    case 97798435:
                        if (provider.equals(GplLibraryWrapper.FUSED_PROVIDER)) {
                            coordinateProvider$Source = CoordinateProvider$Source.FUSED;
                            break;
                        }
                        break;
                    case 155895793:
                        if (provider.equals("platform_lbs")) {
                            coordinateProvider$Source = CoordinateProvider$Source.PLATFORM_LBS;
                            break;
                        }
                        break;
                    case 239000001:
                        if (provider.equals("ridetech_location_sdk")) {
                            coordinateProvider$Source = CoordinateProvider$Source.RIDETECH_LOCATION_SDK;
                            break;
                        }
                        break;
                }
                xneVar = rzo.N(s8o.g(a, coordinateProvider$Source, null));
            }
            coordinateProvider$Source = CoordinateProvider$Source.UNKNOWN;
            xneVar = rzo.N(s8o.g(a, coordinateProvider$Source, null));
        }
        return new lk6(D, str, xneVar, b, zzsVar);
    }
}
