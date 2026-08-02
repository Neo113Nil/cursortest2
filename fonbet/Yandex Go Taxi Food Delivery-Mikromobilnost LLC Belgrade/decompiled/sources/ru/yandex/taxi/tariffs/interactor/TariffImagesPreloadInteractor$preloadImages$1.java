package ru.yandex.taxi.tariffs.interactor;

import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.TariffBranding;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.model.Zone;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.ddv;
import defpackage.e3n;
import defpackage.hst;
import defpackage.je70;
import defpackage.jgv;
import defpackage.jst;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qn11;
import defpackage.qnq0;
import defpackage.tse;
import defpackage.tvd;
import defpackage.unr0;
import defpackage.wls;
import defpackage.yg70;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.tariffs.interactor.TariffImagesPreloadInteractor$preloadImages$1", f = "TariffImagesPreloadInteractor.kt", l = {122, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TariffImagesPreloadInteractor$preloadImages$1 extends SuspendLambda implements wls {
    final /* synthetic */ Zone $zone;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffImagesPreloadInteractor$preloadImages$1(Zone zone, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$zone = zone;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffImagesPreloadInteractor$preloadImages$1(this.$zone, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffImagesPreloadInteractor$preloadImages$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x032d, code lost:
    
        if (r0 == r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0366, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0364, code lost:
    
        if (r0 == r1) goto L160;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        zy11 zy11Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var3 = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.$zone.k;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) it.next();
                f fVar = this.this$0;
                fVar.getClass();
                n7v n7vVar = zoneTariffInfo.f;
                String str = zoneTariffInfo.e;
                jgv jgvVar = fVar.c;
                String a = jgvVar.a(n7vVar);
                if (a != null && a.length() != 0 && !linkedHashMap.containsKey(a)) {
                    linkedHashMap.put(a, b64.l("ImageLoader: Can't load icon for tariff ", str, " with url ", a));
                }
                String a2 = jgvVar.a(zoneTariffInfo.c);
                if (a2 != null && a2.length() != 0 && !linkedHashMap.containsKey(a2)) {
                    linkedHashMap.put(a2, b64.l("ImageLoader: Can't load image for tariff ", str, " with url ", a2));
                }
                String b = fVar.d.b(str);
                if (b != null && b.length() != 0 && !linkedHashMap.containsKey(b)) {
                    linkedHashMap.put(b, b64.l("ImageLoader: Can't load car on map image for tariff ", str, " with url ", b));
                }
                jgv jgvVar2 = this.this$0.c;
                TariffCard tariffCard = zoneTariffInfo.t;
                if (tariffCard != null) {
                    String a3 = jgvVar2.a(tariffCard.c);
                    if (a3 != null && a3.length() != 0 && !linkedHashMap.containsKey(a3)) {
                        linkedHashMap.put(a3, "TariffCard/partnerLogo");
                    }
                    for (TariffCard.BrandingFeature brandingFeature : tariffCard.d) {
                        String a4 = jgvVar2.a(brandingFeature.a);
                        if (a4 != null && a4.length() != 0 && !linkedHashMap.containsKey(a4)) {
                            linkedHashMap.put(a4, "TariffCard/brandingFeatures/" + brandingFeature.b + "/image");
                        }
                    }
                    for (TariffBranding tariffBranding : zoneTariffInfo.z) {
                        n7v n7vVar2 = tariffBranding.d;
                        BrandingType brandingType = tariffBranding.a;
                        String a5 = jgvVar2.a(n7vVar2);
                        if (a5 != null && a5.length() != 0 && !linkedHashMap.containsKey(a5)) {
                            linkedHashMap.put(a5, "TariffCard/brandings/" + brandingType + "/icon");
                        }
                        String a6 = jgvVar2.a(tariffBranding.e);
                        if (a6 != null && a6.length() != 0 && !linkedHashMap.containsKey(a6)) {
                            linkedHashMap.put(a6, "TariffCard/brandings/" + brandingType + "/inactiveIcon");
                        }
                        String a7 = jgvVar2.a(tariffBranding.f.getC());
                        if (a7 != null && a7.length() != 0 && !linkedHashMap.containsKey(a7)) {
                            linkedHashMap.put(a7, "TariffCard/brandings/" + brandingType + "/card/icon");
                        }
                    }
                }
                jgv jgvVar3 = this.this$0.c;
                List<ru.yandex.taxi.requirements.models.net.c> list2 = zoneTariffInfo.o;
                if (!list2.isEmpty()) {
                    for (ru.yandex.taxi.requirements.models.net.c cVar : list2) {
                        yg70 yg70Var = cVar.g;
                        String str2 = cVar.c;
                        for (je70 je70Var : yg70Var.c) {
                            n7v n7vVar3 = je70Var.j;
                            String str3 = je70Var.c;
                            String a8 = jgvVar3.a(n7vVar3);
                            Iterator it2 = it;
                            if (a8 == null || a8.length() == 0 || linkedHashMap.containsKey(a8)) {
                                zy11Var2 = zy11Var3;
                            } else {
                                zy11Var2 = zy11Var3;
                                linkedHashMap.put(a8, unr0.p("requirements/", str2, "/options/", str3, "/image"));
                            }
                            String a9 = jgvVar3.a(je70Var.h);
                            if (a9 != null && a9.length() != 0 && !linkedHashMap.containsKey(a9)) {
                                linkedHashMap.put(a9, unr0.p("requirements/", str2, "/options/", str3, "/icon"));
                            }
                            String a10 = jgvVar3.a(je70Var.i);
                            if (a10 != null && a10.length() != 0 && !linkedHashMap.containsKey(a10)) {
                                linkedHashMap.put(a10, unr0.p("requirements/", str2, "/options/", str3, "/icon_disabled"));
                            }
                            it = it2;
                            zy11Var3 = zy11Var2;
                        }
                        Iterator it3 = it;
                        zy11 zy11Var4 = zy11Var3;
                        Iterator it4 = cVar.s.a.iterator();
                        while (it4.hasNext()) {
                            String a11 = jgvVar3.a(((tvd) it4.next()).f);
                            if (a11 != null && a11.length() != 0 && !linkedHashMap.containsKey(a11)) {
                                linkedHashMap.put(a11, "requirements/" + str2 + "/compoundselect/icon");
                            }
                        }
                        it = it3;
                        zy11Var3 = zy11Var4;
                    }
                }
                it = it;
                zy11Var3 = zy11Var3;
            }
            zy11Var = zy11Var3;
            f fVar2 = this.this$0;
            List<ZoneVertical> list3 = this.$zone.w;
            fVar2.getClass();
            for (ZoneVertical zoneVertical : list3) {
                String a12 = fVar2.c.a(zoneVertical.j);
                if (a12 != null && a12.length() != 0 && !linkedHashMap.containsKey(a12)) {
                    linkedHashMap.put(a12, b64.l("ImageLoader: Can't load icon for vertical ", zoneVertical.a, " with url ", a12));
                }
            }
            hst hstVar = jst.e;
            linkedHashMap.size();
            hstVar.getClass();
            Zone zone = this.$zone;
            ddv.Companion.getClass();
            qn11 qn11Var = ddv.e;
            qn11 b2 = zone.b(ddv.class);
            if (b2 != null) {
                qn11Var = b2;
            }
            ddv ddvVar = (ddv) qn11Var;
            int i2 = ddvVar.c;
            if (!ddvVar.b || i2 <= 0) {
                f fVar3 = this.this$0;
                int size = linkedHashMap.size();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i2;
                this.label = 2;
                o430 o430Var = e3n.b;
                fVar3.getClass();
                Object n = bvf0.n(new TariffImagesPreloadInteractor$preloadImages$3(linkedHashMap, qnq0.a(size < 1 ? 1 : size), fVar3, 0L, null), this);
                if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    n = zy11Var;
                }
            } else {
                o430 o430Var2 = e3n.b;
                long U = kp50.U(ddvVar.d, DurationUnit.MILLISECONDS);
                e3n.p(U);
                f fVar4 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i2;
                this.J$0 = U;
                this.label = 1;
                fVar4.getClass();
                Object n2 = bvf0.n(new TariffImagesPreloadInteractor$preloadImages$3(linkedHashMap, qnq0.a(i2 < 1 ? 1 : i2), fVar4, U, null), this);
                if (n2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    n2 = zy11Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            zy11Var = zy11Var3;
        }
        jst.e.getClass();
        return zy11Var;
    }
}
