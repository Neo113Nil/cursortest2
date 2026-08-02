package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.SessionLifecycleService;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.bdui.core.preloader.resource.lottie.LottieApi;
import com.yandex.pulse.metrics.o;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class j57 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j57(nl7 nl7Var, hqi hqiVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.m = nl7Var;
        this.n = hqiVar;
        this.l = (aur) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0055, code lost:
    
        if (r12 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x002c, code lost:
    
        if (r12 == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        Set set;
        eca ecaVar;
        List a;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            xaa xaaVar = ((taa) this.m).g;
            ohr ohrVar = ohr.a;
            this.k = 1;
            obj = xaaVar.a(ohrVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Set set2 = ((r3t) obj).a;
                ArrayList arrayList = new ArrayList(v75.o(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zvs) it.next()).a);
                }
                Set A0 = CollectionsKt.A0(arrayList);
                ArrayList arrayList2 = (ArrayList) this.n;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!A0.contains(((mqs) obj2).a)) {
                        arrayList3.add(obj2);
                    }
                }
                fvs fvsVar = ((eca) this.l).c;
                if (fvsVar == null || (a = fvsVar.a()) == null) {
                    set = null;
                } else {
                    taa taaVar = (taa) this.m;
                    Set set3 = ((lja) taaVar.d.e.getValue()).a;
                    LinkedHashMap linkedHashMap = ((fba) taaVar.e.c.a.getValue()).a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (lsq.E(((gba) entry.getValue()).b).b()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((mqs) ((Map.Entry) it2.next()).getKey()).a);
                    }
                    LinkedHashSet i2 = wop.i(set3, CollectionsKt.A0(arrayList4));
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : a) {
                        if (!i2.contains(((mqs) obj3).a)) {
                            arrayList5.add(obj3);
                        }
                    }
                    set = CollectionsKt.A0(arrayList5);
                }
                if (((eca) this.l).b == null && set != null && arrayList3.containsAll(set)) {
                    ecaVar = (eca) this.l;
                    fvs fvsVar2 = ecaVar.c;
                    if (fvsVar2 != null) {
                        List a2 = fvsVar2.a();
                        a2.getClass();
                        if (fvsVar2 instanceof dvs) {
                            eca ecaVar2 = eca.d;
                            oq oqVar = ((dvs) fvsVar2).a;
                            oqVar.getClass();
                            ecaVar = new eca(a2, new fca(oqVar), null);
                        } else {
                            if (!(fvsVar2 instanceof evs)) {
                                b6e.s();
                                return null;
                            }
                            eca ecaVar3 = eca.d;
                            ecaVar = d51.h(((evs) fvsVar2).a, a2);
                        }
                    }
                } else {
                    ecaVar = (eca) this.l;
                }
                es6 es6Var = ((taa) this.m).j;
                es6Var.getClass();
                ecaVar.getClass();
                ((zi3) es6Var.c).c(new w90(es6Var, ecaVar, continuation, 4));
                if (!arrayList3.isEmpty()) {
                    nss nssVar = ((eca) this.l).b == null ? mss.a : lss.a;
                    long currentTimeMillis = System.currentTimeMillis();
                    kij kijVar = ((taa) this.m).e;
                    ArrayList arrayList6 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList6.add(new gba((mqs) next, nssVar, currentTimeMillis, i3));
                        i3 = i4;
                    }
                    synchronized (kijVar) {
                        try {
                            ssg.a(3, kij.g, "add() - " + arrayList6, null);
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it4 = arrayList6.iterator();
                            while (it4.hasNext()) {
                                gba gbaVar = (gba) it4.next();
                                String str = gbaVar.a.a;
                                if (kijVar.a.containsKey(str)) {
                                    str = null;
                                }
                                kijVar.a.put(gbaVar.a.a, gbaVar);
                                if (str != null) {
                                    arrayList7.add(str);
                                }
                            }
                            if (!arrayList7.isEmpty()) {
                                kijVar.a();
                                x97.y(kijVar.f, null, null, new h1j(kijVar, new eba(dba.a, arrayList7), continuation, 9), 3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return Unit.a;
            }
            qgg.h0(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        taa taaVar2 = (taa) this.m;
        if (booleanValue) {
            taaVar2.a();
            return Unit.a;
        }
        jur jurVar = taaVar2.b;
        this.k = 2;
        jurVar.getClass();
        obj = x97.V(dm6.b, new d7i(jurVar, continuation, 23), this);
    }

    private final Object l(Object obj) {
        gzb gzbVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            gzb gzbVar2 = (gzb) this.n;
            pjc g = ((frt) gzbVar2.b.getValue()).g();
            this.m = gzbVar2;
            this.k = 1;
            Object g0 = zsd.g0(g, this);
            if (g0 == nm6Var) {
                return nm6Var;
            }
            gzbVar = gzbVar2;
            obj = g0;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gzbVar = (gzb) this.m;
            qgg.h0(obj);
        }
        xxq xxqVar = (xxq) obj;
        Context context = gzbVar.a;
        xxqVar.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("EXPLICIT_PREFERENCES" + xxqVar.a, 0);
        sharedPreferences.getClass();
        yyb yybVar = (yyb) this.l;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString("KEY_EXPLICIT_CONTENT_TYPE", yybVar.a);
        edit.apply();
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r13 != r2) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [qne] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        oy6 oy6Var = (oy6) this.l;
        es6 es6Var = (es6) this.n;
        nm6 nm6Var = nm6.a;
        ?? r3 = this.k;
        try {
        } catch (Throwable th) {
            qne.m(r3, th.getMessage(), 2).y();
            this.m = null;
            this.k = 2;
            obj = es6Var.T(oy6Var);
        }
        if (r3 == 0) {
            qgg.h0(obj);
            qne V0 = gut.V0(dq8.CVV);
            V0.y();
            JSONObject put = new JSONObject().put("template", "CvvConfirmFragment").put("lang", Locale.getDefault().getLanguage());
            JSONObject jSONObject = new JSONObject();
            tc1 tc1Var = (tc1) es6Var.c;
            jSONObject.put("enableButtonText", tc1Var.b(R.string.paymentsdk_prebuilt_confirm_cvv));
            jSONObject.put("disableButtonText", tc1Var.b(R.string.paymentsdk_divkit_input_cvv_code));
            jSONObject.put("headerText", tc1Var.b(R.string.paymentsdk_prebuilt_cvv_screen_title));
            jSONObject.put("cardSystem", oy6Var.a);
            jSONObject.put("cardSuffix", oy6Var.b);
            JSONObject put2 = put.put("data", jSONObject);
            xiu xiuVar = (xiu) es6Var.a;
            put2.getClass();
            this.m = V0;
            this.k = 1;
            obj = xiuVar.l(put2, this);
            r3 = V0;
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (r3 != 1) {
                if (r3 == 2) {
                    qgg.h0(obj);
                    return (JSONObject) obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qne qneVar = (qne) this.m;
            qgg.h0(obj);
            r3 = qneVar;
        }
        return (JSONObject) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (r3.emit(r12, r11) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.emit(r12, r11) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r3.emit(null, r11) == r4) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        String str = (String) this.l;
        bdc bdcVar = (bdc) this.n;
        ConcurrentHashMap concurrentHashMap = bdcVar.b;
        rjc rjcVar = (rjc) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            String str2 = (String) concurrentHashMap.get(str);
            if (str2 != null) {
                this.m = null;
                this.k = 1;
            } else {
                this.m = rjcVar;
                this.k = 2;
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i == 2) {
                qgg.h0(obj);
                this.m = rjcVar;
                this.k = 3;
                obj = bdc.a(bdcVar, str, this);
            } else if (i == 3) {
                qgg.h0(obj);
                String str3 = (String) obj;
                if (str3 != null) {
                    concurrentHashMap.put(str, str3);
                    this.m = null;
                    this.k = 4;
                }
            } else if (i != 4) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        qgg.h0(obj);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0066, code lost:
    
        if (r1.b(r9) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0068, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        if (r10 == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        boolean z;
        sec secVar = (sec) this.m;
        lnp lnpVar = secVar.b;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            yec yecVar = yec.a;
            this.k = 1;
            obj = yecVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Boolean a = lnpVar.a.a();
                if ((a == null && (a = lnpVar.b.a()) == null) ? true : a.booleanValue()) {
                    CoroutineContext coroutineContext = (CoroutineContext) this.n;
                    coroutineContext.getClass();
                    x3n x3nVar = new x3n();
                    x3nVar.a = coroutineContext;
                    x3nVar.c = new LinkedBlockingDeque(20);
                    x3nVar.d = new fmp(0, x3nVar);
                    hmp hmpVar = (hmp) this.l;
                    hmpVar.getClass();
                    Messenger messenger = new Messenger(new tt1(coroutineContext));
                    fmp fmpVar = (fmp) x3nVar.d;
                    fmpVar.getClass();
                    Context context = hmpVar.a;
                    Intent intent = new Intent(context, (Class<?>) SessionLifecycleService.class);
                    Log.d("LifecycleServiceBinder", "Binding service to application.");
                    intent.setAction(String.valueOf(Process.myPid()));
                    intent.putExtra("ClientCallbackMessenger", messenger);
                    intent.setPackage(context.getPackageName());
                    try {
                        z = context.bindService(intent, fmpVar, 65);
                    } catch (SecurityException e) {
                        Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e);
                        z = false;
                    }
                    if (!z) {
                        try {
                            context.unbindService(fmpVar);
                        } catch (IllegalArgumentException e2) {
                            Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e2);
                        }
                        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
                    }
                    jnp.d = x3nVar;
                    if (jnp.c) {
                        jnp.c = false;
                        x3nVar.L0(1);
                    }
                    aec aecVar = secVar.a;
                    kac kacVar = new kac(8);
                    aecVar.a();
                    aecVar.j.add(kacVar);
                } else {
                    Log.d(FirebaseSessionsRegistrar.TAG, "Sessions SDK disabled. Not listening to lifecycle events.");
                }
                return Unit.a;
            }
            qgg.h0(obj);
        }
        Collection values = ((Map) obj).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((dp6) it.next()).a.h()) {
                    this.k = 2;
                }
            }
        }
        Log.d(FirebaseSessionsRegistrar.TAG, "No Sessions subscribers. Not listening to lifecycle events.");
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j57((rfk) this.m, (mgk) this.n, (y57) this.l, continuation, 0);
            case 1:
                return new j57((y57) this.l, (Parcelable) this.m, this.n, continuation, 1);
            case 2:
                return new j57((y57) this.l, (Parcelable) this.m, this.n, continuation, 2);
            case 3:
                return new j57((vb7) this.l, continuation, 3);
            case 4:
                return new j57((mg1) this.m, (di7) this.n, (bve) this.l, continuation, 4);
            case 5:
                return new j57((nl7) this.m, (hqi) this.n, (Function2) this.l, continuation);
            case 6:
                j57 j57Var = new j57((hq7) this.n, (Function2) this.l, continuation, 6);
                j57Var.m = obj;
                return j57Var;
            case 7:
                return new j57((hq7) this.m, (hqi) this.n, (Function2) this.l, continuation, 7);
            case 8:
                return new j57((au7) this.n, (c9g) this.l, continuation, 8);
            case 9:
                return new j57((Context) this.m, (mqs) this.n, (cvl) this.l, continuation, 9);
            case 10:
                j57 j57Var2 = new j57((by7) this.n, (rjc) this.l, continuation, 10);
                j57Var2.m = obj;
                return j57Var2;
            case 11:
                return new j57((k68) this.n, (String) this.l, continuation, 11);
            case 12:
                j57 j57Var3 = new j57((pt0) this.l, continuation, 12);
                j57Var3.n = obj;
                return j57Var3;
            case 13:
                return new j57((zv8) this.m, (String) this.n, (rv8) this.l, continuation, 13);
            case 14:
                return new j57((rdk) this.m, (w89) this.n, (String) this.l, continuation, 14);
            case 15:
                return new j57((aab) this.n, (i7a) this.l, continuation, 15);
            case 16:
                return new j57((taa) this.m, (ArrayList) this.n, (eca) this.l, continuation, 16);
            case 17:
                return new j57((ess) this.m, (qjs) this.n, (taa) this.l, continuation, 17);
            case 18:
                return new j57((q04) this.l, continuation, 18);
            case 19:
                j57 j57Var4 = new j57((goa) this.n, (bpa) this.l, continuation, 19);
                j57Var4.m = obj;
                return j57Var4;
            case 20:
                return new j57((yoc) this.m, (sxa) this.n, (nls) this.l, continuation, 20);
            case 21:
                j57 j57Var5 = new j57((p0b) this.n, (List) this.l, continuation, 21);
                j57Var5.m = obj;
                return j57Var5;
            case 22:
                return new j57((xo6) this.m, (xxk) this.n, (fk0) this.l, continuation, 22);
            case 23:
                return new j57((nyf) this.m, (pjc) this.n, continuation, (kub) this.l);
            case 24:
                return new j57((gzb) this.n, (yyb) this.l, continuation, 24);
            case 25:
                return new j57((es6) this.n, (oy6) this.l, continuation, 25);
            case 26:
                j57 j57Var6 = new j57((bdc) this.n, (String) this.l, continuation, 26);
                j57Var6.m = obj;
                return j57Var6;
            case 27:
                return new j57((sec) this.m, (CoroutineContext) this.n, (hmp) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                j57 j57Var7 = new j57((pyc) this.n, (rjc) this.l, continuation);
                j57Var7.m = obj;
                return j57Var7;
            default:
                return new j57((CoroutineContext) this.m, (pjc) this.n, (jtm) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 10:
                ((j57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 20:
                ((j57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((j57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02af, code lost:
    
        if (r2.a(r20) == r0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a4, code lost:
    
        if (r2 == r0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0363, code lost:
    
        if (r0 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r0.collect(r2, r20) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0304, code lost:
    
        if (r3 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0319, code lost:
    
        if (r3 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0336, code lost:
    
        if (r3 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (defpackage.x97.V(r2, r5, r20) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0676, code lost:
    
        if (defpackage.y7g.q(r3, r0, r20) == r4) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0661, code lost:
    
        if (((defpackage.oc4) r3).d.m(r7, r20) == r4) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0712, code lost:
    
        if (r0 != null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0723, code lost:
    
        if (r0 == r2) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06c1, code lost:
    
        if (r0 == r2) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0777, code lost:
    
        if (((defpackage.vdr) r0).collect((defpackage.rjc) r11, r20) == r2) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0768, code lost:
    
        if (r0 == r2) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x080c, code lost:
    
        if (r3 == r2) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x07c3, code lost:
    
        if (r3 == r2) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x089a, code lost:
    
        if (r2.i(r20) == r4) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x088d, code lost:
    
        if (r2.c(r20) == r4) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0880, code lost:
    
        if (r2.j0(r20) == r4) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0b7a, code lost:
    
        if (r3.emit(r4, r20) == r2) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0b5e, code lost:
    
        if (r3.emit(r0, r20) == r2) goto L521;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0357  */
    /* JADX WARN: Type inference failed for: r3v144, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r6v13, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vb7 vb7Var;
        qqi qqiVar;
        Object a;
        gwu gwuVar;
        c9g c9gVar;
        Object G0;
        Object V;
        String str;
        Object V2;
        et8 et8Var;
        Object O;
        Object J;
        Object d;
        Object a2;
        Object b;
        nu1 nu1Var;
        Object h;
        nrf nrfVar;
        Object d2;
        String str2;
        Object L;
        int i = this.j;
        int i2 = 20;
        int i3 = 15;
        int i4 = 0;
        int i5 = 4;
        int i6 = 6;
        int i7 = 3;
        int i8 = 2;
        int i9 = 1;
        Object obj2 = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                y57 y57Var = (y57) obj2;
                mgk mgkVar = (mgk) this.n;
                nm6 nm6Var = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (o8g.A((rfk) this.m)) {
                        return Unit.a;
                    }
                    if (mgkVar == null) {
                        xdr xdrVar = y57Var.y;
                        vcp vcpVar = new vcp(false, false);
                        xdrVar.getClass();
                        xdrVar.m(null, vcpVar);
                        x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, i8), 3);
                        return Unit.a;
                    }
                    y57Var.v0 = mgkVar;
                    x0q x0qVar = y57Var.J;
                    this.k = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    x0q x0qVar2 = y57Var.L;
                    g57 g57Var = new g57(o8g.p(mgkVar.d()), mgkVar.f());
                    this.k = 2;
                    break;
                }
            case 1:
                y57 y57Var2 = (y57) obj2;
                nm6 nm6Var2 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    oxa oxaVar = y57Var2.r;
                    g3j g3jVar = y57Var2.y0;
                    rfk rfkVar = (rfk) this.m;
                    String str3 = (String) this.n;
                    oxaVar.getClass();
                    ss3 I = zsd.I(new ckg(rfkVar, g3jVar, oxaVar, str3, (Continuation) null));
                    k57 k57Var = new k57(y57Var2, 5);
                    this.k = 1;
                    if (I.collect(k57Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = ((y57) obj2).A;
                    fie fieVar = new fie((kpo) this.m, (mfk) this.n);
                    this.k = 1;
                    if (zi3Var.m(fieVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    vb7 vb7Var2 = (vb7) obj2;
                    qqi qqiVar2 = vb7Var2.d;
                    this.m = qqiVar2;
                    this.n = vb7Var2;
                    this.k = 1;
                    if (qqiVar2.a(this) == nm6Var4) {
                        return nm6Var4;
                    }
                    vb7Var = vb7Var2;
                    qqiVar = qqiVar2;
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vb7Var = (vb7) this.n;
                    qqiVar = (qqi) this.m;
                    qgg.h0(obj);
                }
                try {
                    if (vb7Var.e.getValue() instanceof pb7) {
                        try {
                            tgu a3 = vb7Var.a.a(new FileInputStream(vb7Var.c));
                            xdr xdrVar2 = vb7Var.e;
                            qb7 qb7Var = new qb7(a3);
                            xdrVar2.getClass();
                            xdrVar2.m(null, qb7Var);
                        } catch (Exception unused) {
                            xdr xdrVar3 = vb7Var.e;
                            rb7 rb7Var = new rb7();
                            xdrVar3.getClass();
                            xdrVar3.m(null, rb7Var);
                        }
                    }
                    qqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th) {
                    qqiVar.b(null);
                    throw th;
                }
            case 4:
                di7 di7Var = (di7) this.n;
                mg1 mg1Var = (mg1) this.m;
                jyr jyrVar = mg1Var.a;
                nm6 nm6Var5 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    ((qdk) jyrVar.getValue()).c();
                    qh7 qh7Var = (qh7) di7Var.l.getValue();
                    this.k = 1;
                    a = ((k5m) qh7Var.a.getValue()).c().a(new zfk((bve) obj2, false), this);
                    if (a == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                sgk sgkVar = (sgk) a;
                if (sgkVar instanceof rgk) {
                    ((qdk) jyrVar.getValue()).d();
                    ((udk) mg1Var.b.getValue()).a();
                } else if (sgkVar instanceof qgk) {
                    lgb lgbVar = ((qgk) sgkVar).a;
                    ((qdk) jyrVar.getValue()).b(lg3.v0(lgbVar), lgbVar.b);
                } else {
                    if (!Intrinsics.d(sgkVar, pgk.a)) {
                        b6e.s();
                        return null;
                    }
                    ((qdk) jyrVar.getValue()).a();
                }
                di7Var.p.l(sgkVar);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    nl7 nl7Var = (nl7) this.m;
                    mqi mqiVar = nl7Var.c;
                    fa0 fa0Var = nl7Var.b;
                    this.k = 1;
                    mqiVar.getClass();
                    if (gld.Q(new ga3((hqi) this.n, mqiVar, (Function2) obj2, (Object) fa0Var, (Continuation) null), this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                x6k x6kVar = ((hq7) this.n).d;
                nm6 nm6Var7 = nm6.a;
                int i16 = this.k;
                try {
                    if (i16 == 0) {
                        qgg.h0(obj);
                        rwo rwoVar = (rwo) this.m;
                        x6kVar.setValue(Boolean.TRUE);
                        this.k = 1;
                        if (((Function2) obj2).invoke(rwoVar, this) == nm6Var7) {
                            return nm6Var7;
                        }
                    } else {
                        if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    x6kVar.setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th2) {
                    x6kVar.setValue(Boolean.FALSE);
                    throw th2;
                }
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    hq7 hq7Var = (hq7) this.m;
                    mqi mqiVar2 = hq7Var.c;
                    gq7 gq7Var = hq7Var.b;
                    hqi hqiVar = (hqi) this.n;
                    j57 j57Var = new j57(hq7Var, (Function2) obj2, continuation, i6);
                    this.k = 1;
                    mqiVar2.getClass();
                    if (gld.Q(new ga3(hqiVar, mqiVar2, j57Var, gq7Var, (Continuation) null), this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                au7 au7Var = (au7) this.n;
                tf6 tf6Var = (tf6) au7Var.l;
                xdr xdrVar4 = (xdr) au7Var.o;
                nm6 nm6Var9 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "DefaultWavePlayback", "Stopping", null);
                    gld.L(tf6Var, null);
                    if (xdrVar4.getValue() instanceof gwu) {
                        ssg.a(6, "DefaultWavePlayback", "Already stopped. Call skipped", null);
                        return Unit.a;
                    }
                    r2f Q = saf.Q(tf6Var.a);
                    this.k = 1;
                    break;
                } else if (i18 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gwuVar = (gwu) this.m;
                            qgg.h0(obj);
                            c9gVar = (c9g) obj2;
                            if ((c9gVar instanceof dcn) || !(((dcn) c9gVar).a instanceof lzu)) {
                                ((mmo) au7Var.d).K0();
                            }
                            xdrVar4.l(gwuVar);
                            return Unit.a;
                        }
                        qgg.h0(obj);
                        mwu mwuVar = (mwu) xdrVar4.getValue();
                        gwu gwuVar2 = new gwu();
                        v5j v5jVar = v5j.d;
                        this.m = gwuVar2;
                        this.k = 4;
                        if (au7.a(au7Var, mwuVar, gwuVar2, v5jVar, this) != nm6Var9) {
                            gwuVar = gwuVar2;
                            c9gVar = (c9g) obj2;
                            if (c9gVar instanceof dcn) {
                            }
                            ((mmo) au7Var.d).K0();
                            xdrVar4.l(gwuVar);
                            return Unit.a;
                        }
                        return nm6Var9;
                    }
                    qgg.h0(obj);
                    cvu cvuVar = (cvu) au7Var.j;
                    this.k = 3;
                    break;
                }
                jac jacVar = (jac) au7Var.b;
                this.k = 2;
                break;
            case 9:
                cvl cvlVar = (cvl) obj2;
                mqs mqsVar = (mqs) this.n;
                Object obj3 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    Context context = (Context) this.m;
                    Object[] objArr = {mqsVar.c};
                    this.k = 1;
                    Object V3 = x97.V(dm6.b(), new av7(context, R.string.track_removed, objArr, (Continuation) null), this);
                    if (V3 != obj3) {
                        V3 = Unit.a;
                        break;
                    }
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        neg.A(dyr.e, cvlVar.g().d());
                        qxr.a();
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                if (!cvlVar.d()) {
                    i1m i1mVar = mqsVar.v;
                    i1mVar.getClass();
                    this.k = 2;
                    Object V4 = x97.V(dm6.a, new rfg(new klg(), i1mVar, (cvl) obj2, mqsVar, null, 3), this);
                    if (V4 != obj3) {
                        V4 = Unit.a;
                        break;
                    }
                } else {
                    gs4 gs4Var = new gs4(27);
                    long currentTimeMillis = System.currentTimeMillis();
                    mqsVar.getClass();
                    x97.D(g.a, new knk(gs4Var, mqsVar, currentTimeMillis, null));
                }
                neg.A(dyr.e, cvlVar.g().d());
                qxr.a();
                return Unit.a;
            case 10:
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var10 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(((by7) this.n).c);
                    this.m = null;
                    this.k = 1;
                    G0 = zsd.G0(b0, mm6Var, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rj7.f();
                        return null;
                    }
                    qgg.h0(obj);
                    G0 = obj;
                }
                this.m = null;
                this.k = 2;
                break;
            case 11:
                String str4 = (String) obj2;
                k68 k68Var = (k68) this.n;
                znk znkVar = k68Var.a;
                nm6 nm6Var11 = nm6.a;
                int i21 = this.k;
                Continuation continuation2 = null;
                if (i21 == 0) {
                    qgg.h0(obj);
                    le3 le3Var = k68Var.b;
                    this.k = 1;
                    V = x97.V(dm6.b, new bv6(le3Var, str4, continuation2, 29), this);
                    break;
                } else if (i21 == 1) {
                    qgg.h0(obj);
                    V = obj;
                } else {
                    if (i21 != 2) {
                        if (i21 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V2 = obj;
                        str = (String) V2;
                        if (str != null) {
                            return new vrc(str);
                        }
                        return null;
                    }
                    str = (String) this.m;
                    qgg.h0(obj);
                    break;
                }
                rj6 rj6Var = (rj6) V;
                if (rj6Var instanceof qj6) {
                    vrc vrcVar = ((z9b) ((qj6) rj6Var).a).b;
                    String str5 = vrcVar != null ? vrcVar.a : null;
                    rj6Var = str5 == null ? new nj6(null) : new qj6(str5);
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                String str6 = (String) jf0.F(rj6Var);
                if (str6 != null) {
                    this.m = str6;
                    this.k = 2;
                    Object V5 = x97.V(dm6.a, new b68(continuation2, znkVar, str4, str6, 0), this);
                    if (V5 != nm6Var11) {
                        V5 = Unit.a;
                    }
                    if (V5 != nm6Var11) {
                        str = str6;
                        break;
                    }
                    return nm6Var11;
                }
                this.m = null;
                this.k = 3;
                V2 = x97.V(dm6.a, new nz5(continuation2, znkVar, str4, i6), this);
                break;
            case 12:
                pt0 pt0Var = (pt0) obj2;
                Context context2 = (Context) pt0Var.a;
                ltm ltmVar = (ltm) this.n;
                nm6 nm6Var12 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    et8Var = new et8(ltmVar);
                    Integer num = new Integer(context2.getResources().getConfiguration().orientation);
                    this.n = ltmVar;
                    this.m = et8Var;
                    this.k = 1;
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    et8Var = (et8) this.m;
                    qgg.h0(obj);
                }
                context2.registerComponentCallbacks(et8Var);
                aw5 aw5Var = new aw5(i2, pt0Var, et8Var);
                this.n = null;
                this.m = null;
                this.k = 2;
                break;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                zv8 zv8Var = (zv8) this.m;
                jyr jyrVar2 = zv8Var.d;
                String str7 = (String) this.n;
                rv8 rv8Var = (rv8) obj2;
                this.k = 1;
                cno cnoVar = new cno(qxe.b(this));
                ((qy2) jyrVar2.getValue()).a(str7, "DivDataPreloader");
                ArrayList arrayList = new ArrayList();
                rdk rdkVar = new rdk(cnoVar, arrayList);
                fzp fzpVar = (fzp) zv8Var.a.getValue();
                qy2 qy2Var = (qy2) jyrVar2.getValue();
                l13 l13Var = fzpVar.a;
                wyp wypVar = fzpVar.b;
                qy2Var.getClass();
                jyr b2 = btf.b(new rln(17, wypVar, qy2Var));
                jyr b3 = l13Var.b(hag.I(ze9.class), true);
                jyr b4 = l13Var.b(hag.I(w89.class), true);
                qkp qkpVar = new qkp(22, wypVar);
                gs4 gs4Var2 = new gs4();
                gs4Var2.a = rdkVar;
                gs4Var2.b = qkpVar;
                gs4Var2.c = b2;
                gs4Var2.d = b3;
                gs4Var2.e = b4;
                e39 e39Var = new e39(gs4Var2, btf.b(new rln(16, ((hzp) zv8Var.c.getValue()).a, gs4Var2)));
                rv8Var.getClass();
                Iterator it = rv8Var.c.iterator();
                while (it.hasNext()) {
                    e39Var.U(((qv8) it.next()).a, xzb.a);
                }
                arrayList.addAll(e39Var.o);
                ((izp) zv8Var.b.getValue()).getClass();
                ArrayList arrayList2 = new ArrayList();
                List<zy9> list = rv8Var.g;
                if (list != null) {
                    for (zy9 zy9Var : list) {
                        zy9Var.getClass();
                        if (!(zy9Var instanceof xy9) && !(zy9Var instanceof vy9) && !(zy9Var instanceof uy9) && !(zy9Var instanceof ry9) && !(zy9Var instanceof sy9)) {
                            if (zy9Var instanceof yy9) {
                                Object it2 = ocg.D(((yy9) zy9Var).b.b).iterator();
                                while (((e9h) it2).hasNext()) {
                                    arrayList2.add(gs4Var2.H((String) ((c9h) it2).next()));
                                }
                            } else if (zy9Var instanceof ty9) {
                                m28 m28Var = ((ty9) zy9Var).b;
                                String str8 = m28Var.a;
                                szb szbVar = m28Var.b;
                                if (Intrinsics.d(str8, "preloadable_images")) {
                                    Object it3 = ocg.D(szbVar).iterator();
                                    while (((e9h) it3).hasNext()) {
                                        arrayList2.add(gs4Var2.H((String) ((c9h) it3).next()));
                                    }
                                } else if (Intrinsics.d(str8, "preloadable_videos")) {
                                    arrayList2.add(gs4Var2.M(ocg.D(szbVar)));
                                }
                            } else if (!(zy9Var instanceof qy9) && !(zy9Var instanceof wy9)) {
                                b6e.s();
                                return null;
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList2);
                ((AtomicBoolean) rdkVar.d).set(true);
                if (((AtomicInteger) rdkVar.b).get() == 0 && !((AtomicBoolean) rdkVar.e).getAndSet(true)) {
                    rdkVar.Q((ArrayList) rdkVar.c);
                }
                Object a4 = cnoVar.a();
                nm6 nm6Var14 = nm6.a;
                return a4 == nm6Var13 ? nm6Var13 : a4;
            case 14:
                rdk rdkVar2 = (rdk) this.m;
                String str9 = (String) obj2;
                nm6 nm6Var15 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    if (rdkVar2 != null) {
                        ((AtomicInteger) rdkVar2.b).incrementAndGet();
                    }
                    Call<String> a5 = ((LottieApi) ((w89) this.n).b.getValue()).a(str9);
                    this.k = 1;
                    O = swf.O(a5, String.class, this);
                    if (O == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    O = obj;
                }
                bii biiVar = (bii) O;
                if (biiVar instanceof aii) {
                    J = new qj6(((aii) biiVar).a);
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i25 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str10 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    J = new kj6(i25, musicBackendInvocationError.getDetails(), str10, message == null ? "" : message, xhiVar.a);
                } else if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                } else {
                    if (!(biiVar instanceof zhi)) {
                        b6e.s();
                        return null;
                    }
                    J = uwf.J((zhi) biiVar);
                }
                if (J instanceof pj6) {
                    v3w.l("The response has failed for ", str9, 6, "DivLottieLoader", null);
                    if (rdkVar2 != null) {
                        rdkVar2.P(str9);
                    }
                } else {
                    if (!(J instanceof qj6)) {
                        b6e.s();
                        return null;
                    }
                    q89.b.put(str9, ((qj6) J).a);
                    if (rdkVar2 != null) {
                        rdkVar2.v();
                    }
                }
                return Unit.a;
            case 15:
                aab aabVar = (aab) this.n;
                i7a i7aVar = (i7a) obj2;
                nm6 nm6Var16 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    if (!(aabVar instanceof lt)) {
                        if (!(aabVar instanceof u51)) {
                            if (!(aabVar instanceof eul)) {
                                b6e.s();
                                return null;
                            }
                            eul eulVar = (eul) aabVar;
                            String str11 = eulVar.a;
                            String str12 = eulVar.b;
                            this.k = 3;
                            d = i7aVar.d(str11, str12, this);
                            break;
                        } else {
                            String str13 = ((u51) aabVar).a;
                            this.k = 2;
                            a2 = i7a.a(i7aVar, str13, this);
                            break;
                        }
                    } else {
                        String str14 = ((lt) aabVar).a;
                        this.k = 1;
                        b = i7aVar.b(str14, this);
                        break;
                    }
                    return nm6Var16;
                }
                if (i26 == 1) {
                    qgg.h0(obj);
                    b = obj;
                    nu1Var = (nu1) b;
                    if (nu1Var == null) {
                    }
                } else if (i26 == 2) {
                    qgg.h0(obj);
                    a2 = obj;
                    i21 i21Var = (i21) a2;
                    if (i21Var != null) {
                        nu1Var = i21Var.a;
                        if (nu1Var == null) {
                        }
                    }
                    nu1Var = null;
                    if (nu1Var == null) {
                    }
                } else {
                    if (i26 != 3) {
                        if (i26 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nu1 nu1Var2 = (nu1) this.m;
                        qgg.h0(obj);
                        nu1Var = nu1Var2;
                        h = obj;
                        if (((Boolean) h).booleanValue()) {
                            i7aVar.c().y(nu1Var);
                        } else {
                            i7aVar.c().r(nu1Var);
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    d = obj;
                    rrl rrlVar = (rrl) d;
                    if (rrlVar != null) {
                        nu1Var = rrlVar.a;
                        if (nu1Var == null) {
                            ssg.a(6, "DomainEntityLikesInteractorImpl", "could not get model by id due to connection error for entity " + aabVar, null);
                            return Unit.a;
                        }
                        t3g c = i7aVar.c();
                        this.m = nu1Var;
                        this.k = 4;
                        h = c.h(nu1Var, this);
                        break;
                    }
                    nu1Var = null;
                    if (nu1Var == null) {
                    }
                }
            case 16:
                return k(obj);
            case 17:
                taa taaVar = (taa) obj2;
                Object obj4 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar5 = saa.a;
                    cur curVar = taaVar.f;
                    ess essVar = (ess) this.m;
                    qjs qjsVar = (qjs) this.n;
                    this.k = 1;
                    curVar.getClass();
                    Object V6 = x97.V(dm6.a, new v24((Continuation) null, curVar, essVar, mss.a, qjsVar, 14), this);
                    if (V6 != obj4) {
                        V6 = Unit.a;
                        break;
                    }
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e6q e6qVar = taaVar.d;
                this.k = 2;
                break;
            case 18:
                q04 q04Var = (q04) obj2;
                nm6 nm6Var17 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                    nrfVar = new nrf("collection_downloaded_sections_id", "COLLECTION_DOWNLOADED_SECTIONS");
                    String c2 = ((skr) q04Var.a.getValue()).c(R.string.more_in_downloaded);
                    wia wiaVar = (wia) q04Var.e.getValue();
                    this.m = nrfVar;
                    this.n = c2;
                    this.k = 1;
                    d2 = wiaVar.d(20, this);
                    if (d2 == nm6Var17) {
                        return nm6Var17;
                    }
                    str2 = c2;
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.n;
                    nrf nrfVar2 = (nrf) this.m;
                    qgg.h0(obj);
                    nrfVar = nrfVar2;
                    d2 = obj;
                }
                return new fia(nrfVar, str2, ((Number) d2).intValue());
            case 19:
                nm6 nm6Var18 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    fa0 fa0Var2 = (fa0) this.m;
                    goa goaVar = (goa) this.n;
                    sea seaVar = new sea(i7, fa0Var2, (bpa) obj2);
                    this.k = 1;
                    if (goaVar.invoke(seaVar, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                nm6 nm6Var19 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yoc yocVar = (yoc) this.m;
                yocVar.getClass();
                yocVar.a(new u8b(i9, i5));
                x0q x0qVar3 = ((sxa) this.n).f;
                u58 u58Var = new u58(i3, (nls) obj2);
                this.k = 1;
                x0qVar3.collect(u58Var, this);
                return nm6Var19;
            case 21:
                List list2 = (List) obj2;
                p0b p0bVar = (p0b) this.n;
                mm6 mm6Var2 = (mm6) this.m;
                nm6 nm6Var20 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    f98 f98Var = new f98(p0bVar, list2, continuation, 19);
                    this.m = mm6Var2;
                    this.k = 1;
                    L = tyf.L(10000L, f98Var, this);
                    if (L == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    L = obj;
                }
                List list3 = (List) L;
                if (list3 == null) {
                    v3w.k("Timeout while waiting for tvDeviceFlow ", list2.size(), 3, "EasyLoginResultHandler", null);
                    return Unit.a;
                }
                ssg.a(3, "EasyLoginResultHandler", f1d.e(list2.size(), list3.size(), "previousTvDevicesSize: ", ", currentTvDevicesSize: "), null);
                q0b q0bVar = (q0b) CollectionsKt.Q(list3);
                ssg.a(3, "EasyLoginResultHandler", "requestActive newTvDeviceId: " + q0bVar, null);
                ((afw) p0bVar.a.a.getValue()).f(q0bVar.a, new zsw(true));
                return Unit.a;
            case 22:
                nm6 nm6Var21 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    bo6 a6 = ((xo6) this.m).a((xxk) this.n);
                    if (a6 == null) {
                        return Unit.a;
                    }
                    pjc b02 = zsd.b0(szf.s0(new ita(i3, a6)));
                    f98 f98Var2 = new f98((fk0) obj2, continuation, 26);
                    this.k = 1;
                    if (zsd.O(b02, f98Var2, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    nyf nyfVar = (nyf) this.m;
                    lyf lyfVar = lyf.d;
                    f98 f98Var3 = new f98((pjc) this.n, continuation, (kub) obj2, 28);
                    this.k = 1;
                    if (o8g.J(nyfVar, lyfVar, f98Var3, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                return l(obj);
            case 25:
                return n(obj);
            case 26:
                return o(obj);
            case 27:
                return p(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var23 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var3 = (mm6) this.m;
                    this.k = 1;
                    if (((aur) this.n).invoke(mm6Var3, (rjc) obj2, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                jtm jtmVar = (jtm) obj2;
                pjc pjcVar = (pjc) this.n;
                CoroutineContext coroutineContext = (CoroutineContext) this.m;
                nm6 nm6Var24 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(coroutineContext, g.a)) {
                        iwb iwbVar = new iwb(jtmVar, 4);
                        this.k = 1;
                        break;
                    } else {
                        vjc vjcVar = new vjc(pjcVar, jtmVar, continuation, i4);
                        this.k = 2;
                        break;
                    }
                } else {
                    if (i35 != 1 && i35 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j57(y57 y57Var, Parcelable parcelable, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = y57Var;
        this.m = parcelable;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j57(pyc pycVar, rjc rjcVar, Continuation continuation) {
        super(2, continuation);
        this.j = 28;
        this.n = (aur) pycVar;
        this.l = rjcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j57(nyf nyfVar, pjc pjcVar, Continuation continuation, kub kubVar) {
        super(2, continuation);
        this.j = 23;
        this.m = nyfVar;
        this.n = pjcVar;
        this.l = kubVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j57(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j57(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j57(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}
