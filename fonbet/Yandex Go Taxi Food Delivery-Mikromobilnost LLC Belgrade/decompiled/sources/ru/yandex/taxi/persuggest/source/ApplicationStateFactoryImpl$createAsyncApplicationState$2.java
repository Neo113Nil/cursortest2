package ru.yandex.taxi.persuggest.source;

import android.location.LocationManager;
import defpackage.dai0;
import defpackage.fe61;
import defpackage.fw2;
import defpackage.hq0;
import defpackage.hzk;
import defpackage.k0b0;
import defpackage.kc00;
import defpackage.lk6;
import defpackage.mk6;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgb0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv03;", "<anonymous>", "(Ltse;)Lv03;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.ApplicationStateFactoryImpl$createAsyncApplicationState$2", f = "ApplicationStateFactoryImpl.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY, HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ApplicationStateFactoryImpl$createAsyncApplicationState$2 extends SuspendLambda implements wls {
    final /* synthetic */ Action $action;
    final /* synthetic */ Map<String, Object> $actualSelectedRequirements;
    final /* synthetic */ lk6 $briefGeoInfo;
    final /* synthetic */ String $forcedCurrentMode;
    final /* synthetic */ List<wgb0> $photoCoordinates;
    final /* synthetic */ String $screen;
    final /* synthetic */ Float $zoom;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationStateFactoryImpl$createAsyncApplicationState$2(a aVar, String str, Action action, Float f, Map map, String str2, List list, lk6 lk6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$forcedCurrentMode = str;
        this.$action = action;
        this.$zoom = f;
        this.$actualSelectedRequirements = map;
        this.$screen = str2;
        this.$photoCoordinates = list;
        this.$briefGeoInfo = lk6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationStateFactoryImpl$createAsyncApplicationState$2 applicationStateFactoryImpl$createAsyncApplicationState$2 = new ApplicationStateFactoryImpl$createAsyncApplicationState$2(this.this$0, this.$forcedCurrentMode, this.$action, this.$zoom, this.$actualSelectedRequirements, this.$screen, this.$photoCoordinates, this.$briefGeoInfo, continuation);
        applicationStateFactoryImpl$createAsyncApplicationState$2.L$0 = obj;
        return applicationStateFactoryImpl$createAsyncApplicationState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationStateFactoryImpl$createAsyncApplicationState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f6, code lost:
    
        if (r3 == r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ca  */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        mk6 a;
        boolean z;
        Action action;
        Action action2;
        Object s;
        ArrayList arrayList;
        boolean z2;
        noh nohVar;
        String str;
        fw2 fw2Var;
        fe61 fe61Var;
        List list;
        Object k;
        Object k2;
        List list2;
        boolean z3;
        List list3;
        Object k3;
        boolean z4;
        List list4;
        fe61 fe61Var2;
        fw2 fw2Var2;
        mk6 mk6Var;
        List list5;
        List list6;
        String str2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ApplicationStateFactoryImpl$createAsyncApplicationState$2$coordinatesDeferred$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ApplicationStateFactoryImpl$createAsyncApplicationState$2$wifiDeferred$1(this.this$0, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ApplicationStateFactoryImpl$createAsyncApplicationState$2$gsmDeferred$1(this.this$0, null), 3);
            h2 = tje.h(tseVar, null, null, new ApplicationStateFactoryImpl$createAsyncApplicationState$2$geoInfoDeferred$1(this.$briefGeoInfo, this.this$0, null), 3);
            ArrayList a2 = this.this$0.i.a();
            String str3 = this.$forcedCurrentMode;
            if (str3 == null && (str3 = this.this$0.g.a()) == null) {
                str3 = "";
            }
            a = this.this$0.d.a();
            fw2 fw2Var3 = (fw2) this.this$0.f.a.getValue();
            hzk hzkVar = this.this$0.j.a;
            if (((k0b0) hzkVar.b).b()) {
                LocationManager locationManager = (LocationManager) hzkVar.a;
                WeakHashMap weakHashMap = androidx.core.location.j.a;
                if (locationManager.isLocationEnabled()) {
                    z = true;
                    boolean a3 = this.this$0.k.a();
                    hq0 hq0Var = this.this$0.n;
                    action = this.$action;
                    hq0Var.getClass();
                    action2 = Action.REDIRECT;
                    fe61 fe61Var3 = hq0Var.a;
                    if (action2 != action) {
                        fe61Var3 = fe61Var3 != null ? new fe61(fe61Var3.a, null, fe61Var3.c) : null;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h;
                    this.L$3 = h4;
                    this.L$4 = h2;
                    this.L$5 = a2;
                    this.L$6 = str3;
                    this.L$7 = a;
                    this.L$8 = fw2Var3;
                    this.L$9 = fe61Var3;
                    this.Z$0 = z;
                    this.Z$1 = a3;
                    this.label = 1;
                    s = h3.s(this);
                    if (s != coroutineSingletons) {
                        arrayList = a2;
                        z2 = a3;
                        nohVar = h4;
                        str = str3;
                        fw2Var = fw2Var3;
                        fe61Var = fe61Var3;
                    }
                    return coroutineSingletons;
                }
            }
            z = false;
            boolean a32 = this.this$0.k.a();
            hq0 hq0Var2 = this.this$0.n;
            action = this.$action;
            hq0Var2.getClass();
            action2 = Action.REDIRECT;
            fe61 fe61Var32 = hq0Var2.a;
            if (action2 != action) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h4;
            this.L$4 = h2;
            this.L$5 = a2;
            this.L$6 = str3;
            this.L$7 = a;
            this.L$8 = fw2Var3;
            this.L$9 = fe61Var32;
            this.Z$0 = z;
            this.Z$1 = a32;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                z2 = this.Z$1;
                boolean z5 = this.Z$0;
                list = (List) this.L$10;
                fe61Var = (fe61) this.L$9;
                fw2Var = (fw2) this.L$8;
                a = (mk6) this.L$7;
                str = (String) this.L$6;
                ?? r12 = (List) this.L$5;
                h2 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                arrayList = r12;
                z = z5;
                k = obj;
                List list7 = (List) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h2;
                this.L$5 = arrayList;
                this.L$6 = str;
                this.L$7 = a;
                this.L$8 = fw2Var;
                this.L$9 = fe61Var;
                this.L$10 = list;
                this.L$11 = list7;
                this.Z$0 = z;
                this.Z$1 = z2;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    ArrayList arrayList2 = arrayList;
                    list2 = list7;
                    z3 = z;
                    list3 = arrayList2;
                    List list8 = (List) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = list3;
                    this.L$6 = str;
                    this.L$7 = a;
                    this.L$8 = fw2Var;
                    this.L$9 = fe61Var;
                    this.L$10 = list;
                    this.L$11 = list2;
                    this.L$12 = list8;
                    this.Z$0 = z3;
                    this.Z$1 = z2;
                    this.label = 4;
                    k3 = h2.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = this.Z$1;
                boolean z6 = this.Z$0;
                List list9 = (List) this.L$12;
                list2 = (List) this.L$11;
                List list10 = (List) this.L$10;
                fe61 fe61Var4 = (fe61) this.L$9;
                fw2 fw2Var4 = (fw2) this.L$8;
                mk6 mk6Var2 = (mk6) this.L$7;
                String str4 = (String) this.L$6;
                list5 = (List) this.L$5;
                kotlin.b.b(obj);
                z4 = z6;
                list4 = list9;
                fe61Var2 = fe61Var4;
                fw2Var2 = fw2Var4;
                mk6Var = mk6Var2;
                str2 = str4;
                k3 = obj;
                list6 = list10;
                boolean z7 = z2;
                List list11 = list2;
                getClass();
                return dai0.y(list6, list5, (lk6) k3, str2, mk6Var, fw2Var2, z4, z7, this.$zoom, fe61Var2, ((kc00) this.this$0.o).a, list11, list4, this.$actualSelectedRequirements, this.$screen, this.$photoCoordinates);
            }
            z2 = this.Z$1;
            z3 = this.Z$0;
            List list12 = (List) this.L$11;
            list = (List) this.L$10;
            fe61Var = (fe61) this.L$9;
            fw2Var = (fw2) this.L$8;
            a = (mk6) this.L$7;
            str = (String) this.L$6;
            list3 = (List) this.L$5;
            h2 = (noh) this.L$4;
            kotlin.b.b(obj);
            list2 = list12;
            k2 = obj;
            List list82 = (List) k2;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = list3;
            this.L$6 = str;
            this.L$7 = a;
            this.L$8 = fw2Var;
            this.L$9 = fe61Var;
            this.L$10 = list;
            this.L$11 = list2;
            this.L$12 = list82;
            this.Z$0 = z3;
            this.Z$1 = z2;
            this.label = 4;
            k3 = h2.k(this);
            if (k3 != coroutineSingletons) {
                z4 = z3;
                list4 = list82;
                fe61Var2 = fe61Var;
                fw2Var2 = fw2Var;
                mk6Var = a;
                list5 = list3;
                list6 = list;
                str2 = str;
                boolean z72 = z2;
                List list112 = list2;
                getClass();
                return dai0.y(list6, list5, (lk6) k3, str2, mk6Var, fw2Var2, z4, z72, this.$zoom, fe61Var2, ((kc00) this.this$0.o).a, list112, list4, this.$actualSelectedRequirements, this.$screen, this.$photoCoordinates);
            }
            return coroutineSingletons;
        }
        z2 = this.Z$1;
        boolean z8 = this.Z$0;
        fe61Var = (fe61) this.L$9;
        fw2Var = (fw2) this.L$8;
        a = (mk6) this.L$7;
        str = (String) this.L$6;
        ?? r122 = (List) this.L$5;
        h2 = (noh) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        arrayList = r122;
        z = z8;
        s = obj;
        list = (List) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = h2;
        this.L$5 = arrayList;
        this.L$6 = str;
        this.L$7 = a;
        this.L$8 = fw2Var;
        this.L$9 = fe61Var;
        this.L$10 = list;
        this.Z$0 = z;
        this.Z$1 = z2;
        this.label = 2;
        k = h.k(this);
    }
}
