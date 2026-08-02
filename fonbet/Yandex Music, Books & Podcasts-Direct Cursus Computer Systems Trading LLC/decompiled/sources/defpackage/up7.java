package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;
import ru.yandex.video.m3.preload_manager.a;
import ru.yandex.video.m3.preload_manager.e;

/* loaded from: classes6.dex */
public final class up7 extends uif implements Function0 {
    public final /* synthetic */ ssm A;
    public final /* synthetic */ jzi B;
    public final /* synthetic */ s1 r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ String u;
    public final /* synthetic */ ExecutorService v;
    public final /* synthetic */ anm w;
    public final /* synthetic */ yk7 x;
    public final /* synthetic */ OkHttpClient y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up7(s1 s1Var, Context context, ArrayList arrayList, String str, ExecutorService executorService, anm anmVar, yk7 yk7Var, OkHttpClient okHttpClient, String str2, ssm ssmVar, jzi jziVar) {
        super(0);
        this.r = s1Var;
        this.s = context;
        this.t = arrayList;
        this.u = str;
        this.v = executorService;
        this.w = anmVar;
        this.x = yk7Var;
        this.y = okHttpClient;
        this.z = str2;
        this.A = ssmVar;
        this.B = jziVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t1 t1Var;
        d1 d1Var;
        al2 n20Var = this.r.b() ? new n20(this.r.i()) : new h1b();
        boolean d = Intrinsics.d(this.r.g(), Boolean.TRUE);
        Context context = this.s;
        yk2 q = d ? n20Var.q(context, new yle()) : n20Var.create(context);
        Context context2 = this.s;
        e eVar = new e(context2);
        ArrayList arrayList = this.t;
        String str = this.u;
        ExecutorService executorService = this.v;
        anm anmVar = this.w;
        yk7 yk7Var = this.x;
        OkHttpClient okHttpClient = this.y;
        String str2 = this.z;
        ssm ssmVar = this.A;
        Context context3 = this.s;
        jzi jziVar = this.B;
        s1 s1Var = this.r;
        eVar.n = "ru.yandex.music";
        eVar.m = arrayList;
        eVar.p = str;
        executorService.getClass();
        vej vejVar = eVar.a;
        s9f[] s9fVarArr = e.r;
        vejVar.setValue(eVar, s9fVarArr[0], executorService);
        eVar.c.setValue(eVar, s9fVarArr[1], 3);
        eVar.d.setValue(eVar, s9fVarArr[2], anmVar);
        eVar.e.setValue(eVar, s9fVarArr[3], yk7Var.b(q.c()));
        eVar.g.setValue(eVar, s9fVarArr[4], q);
        okHttpClient.getClass();
        eVar.j = okHttpClient;
        eVar.k.setValue(eVar, s9fVarArr[6], new t08(tt0.i(DeviceType.OTHER, str2)));
        eVar.h.setValue(eVar, s9fVarArr[5], new lj0(14, context3, jziVar, s1Var));
        eVar.i = ssmVar;
        eVar.o = 30L;
        eVar.l = new qee(20);
        cke ckeVar = new cke(context2);
        cnm cnmVar = (cnm) eVar.c();
        Object obj = cnmVar.b;
        if (obj == null) {
            obj = cnmVar.c;
        }
        if (obj == null) {
            cnmVar.a();
        }
        liq liqVar = cnmVar.b;
        if (liqVar == null) {
            eVar.a(ckeVar);
            cnm cnmVar2 = (cnm) eVar.c();
            Object obj2 = cnmVar2.b;
            if (obj2 == null) {
                obj2 = cnmVar2.c;
            }
            if (obj2 == null) {
                cnmVar2.a();
            }
            a aVar = new a();
            new LruCache(64);
            return aVar;
        }
        ip3 b = eVar.b(liqVar);
        b.g = eVar.i;
        b.h = -4000;
        ip3 b2 = eVar.b(liqVar);
        String str3 = eVar.p;
        if (str3 != null) {
            rdk rdkVar = rdk.i;
            if (rdkVar == null || (d1Var = rdkVar.A(str3)) == null) {
                d1Var = d1.g;
            }
            t1Var = d1Var.b;
        } else {
            t1Var = null;
        }
        if (eVar.f == null) {
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(((Number) eVar.c.getValue(eVar, s9fVarArr[1])).intValue(), new lp7(5, Executors.defaultThreadFactory()));
            eVar.b = newFixedThreadPool;
            newFixedThreadPool.getClass();
            eVar.f = new xiu(24, b, newFixedThreadPool);
        }
        SharedPreferences V = e3s.e.V(context2);
        f4m f4mVar = new f4m(V);
        jzi jziVar2 = new jzi(V);
        str strVar = new str();
        rsb a = new qsb(context2).a();
        ExecutorService executorService2 = (ExecutorService) eVar.a.getValue(eVar, s9fVarArr[0]);
        int intValue = ((Number) eVar.c.getValue(eVar, s9fVarArr[1])).intValue();
        ExecutorService executorService3 = eVar.b;
        xiu xiuVar = eVar.f;
        xiuVar.getClass();
        yk2 yk2Var = (yk2) eVar.g.getValue(eVar, s9fVarArr[4]);
        Function1 function1 = (Function1) eVar.h.getValue(eVar, s9fVarArr[5]);
        List c = t75.c(eVar.a(ckeVar));
        long j = eVar.o;
        t8w t8wVar = (t8w) ((cnm) eVar.c()).d.getValue();
        if (t8wVar == null) {
            t8wVar = e.s;
        }
        return new inm(executorService2, intValue, executorService3, xiuVar, liqVar, b2, yk2Var, a, function1, c, j, t8wVar, dvt.q(null), t1Var != null ? t1Var.d : false, t1Var != null ? t1Var.f : false, t1Var != null ? t1Var.e : false, f4mVar, jziVar2, strVar);
    }
}
