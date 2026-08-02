package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class qvn implements esp {
    public final CoroutineContext a;
    public final iec b;
    public final iw0 c;
    public final rvn d;
    public final xqf e;
    public final qqi f;

    public qvn(CoroutineContext coroutineContext, iec iecVar, iw0 iw0Var, rvn rvnVar, xqf xqfVar) {
        coroutineContext.getClass();
        iecVar.getClass();
        iw0Var.getClass();
        rvnVar.getClass();
        xqfVar.getClass();
        this.a = coroutineContext;
        this.b = iecVar;
        this.c = iw0Var;
        this.d = rvnVar;
        this.e = xqfVar;
        this.f = rqi.a();
    }

    @Override // defpackage.esp
    public final Boolean a() {
        dlp dlpVar = e().b;
        if (dlpVar != null) {
            return dlpVar.a;
        }
        Intrinsics.j("sessionConfigs");
        throw null;
    }

    @Override // defpackage.esp
    public final nsa b() {
        dlp dlpVar = e().b;
        if (dlpVar == null) {
            Intrinsics.j("sessionConfigs");
            throw null;
        }
        Integer num = dlpVar.c;
        if (num == null) {
            return null;
        }
        msa msaVar = nsa.b;
        return new nsa(yd5.M(num.intValue(), ssa.SECONDS));
    }

    @Override // defpackage.esp
    public final Double c() {
        dlp dlpVar = e().b;
        if (dlpVar != null) {
            return dlpVar.b;
        }
        Intrinsics.j("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00b0, B:28:0x00ba, B:31:0x00c5, B:37:0x0161, B:39:0x0089, B:41:0x0093, B:44:0x009e), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00b0, B:28:0x00ba, B:31:0x00c5, B:37:0x0161, B:39:0x0089, B:41:0x0093, B:44:0x009e), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00b0, B:28:0x00ba, B:31:0x00c5, B:37:0x0161, B:39:0x0089, B:41:0x0093, B:44:0x009e), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:25:0x004f, B:26:0x00b0, B:28:0x00ba, B:31:0x00c5, B:37:0x0161, B:39:0x0089, B:41:0x0093, B:44:0x009e), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    @Override // defpackage.esp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        pvn pvnVar;
        ?? r6;
        oqi oqiVar;
        oqi oqiVar2;
        qvn qvnVar;
        String str;
        try {
            if (continuation instanceof pvn) {
                pvnVar = (pvn) continuation;
                int i = pvnVar.n;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pvnVar.n = i - Integer.MIN_VALUE;
                    Object obj = pvnVar.l;
                    nm6 nm6Var = nm6.a;
                    r6 = pvnVar.n;
                    int i2 = 2;
                    Continuation continuation2 = null;
                    if (r6 != 0) {
                        qgg.h0(obj);
                        qqi qqiVar = this.f;
                        if (!qqiVar.f() && !e().b()) {
                            return Unit.a;
                        }
                        pvnVar.j = this;
                        pvnVar.k = qqiVar;
                        pvnVar.n = 1;
                        if (qqiVar.a(pvnVar) != nm6Var) {
                            oqiVar2 = qqiVar;
                            qvnVar = this;
                        }
                        return nm6Var;
                    }
                    if (r6 != 1) {
                        if (r6 != 2) {
                            if (r6 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = (oqi) pvnVar.j;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        oqiVar2 = pvnVar.k;
                        qvnVar = (qvn) pvnVar.j;
                        qgg.h0(obj);
                        str = ((qoe) obj).a;
                        if (!Intrinsics.d(str, "")) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            Unit unit = Unit.a;
                            oqiVar2.b(null);
                            return unit;
                        }
                        Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        qvnVar.getClass();
                        Pair pair2 = new Pair("X-Crashlytics-Device-Model", new Regex("/").replace(format, ""));
                        String str2 = Build.VERSION.INCREMENTAL;
                        str2.getClass();
                        Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", new Regex("/").replace(str2, ""));
                        String str3 = Build.VERSION.RELEASE;
                        str3.getClass();
                        Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", new Regex("/").replace(str3, ""));
                        qvnVar.c.getClass();
                        Map e = uah.e(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "2.1.2"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        rvn rvnVar = qvnVar.d;
                        rfg rfgVar = new rfg(qvnVar, continuation2, 26);
                        z0i z0iVar = new z0i(i2, 17, continuation2);
                        pvnVar.j = oqiVar2;
                        pvnVar.k = null;
                        pvnVar.n = 3;
                        Object V = x97.V(rvnVar.b, new rfg(rvnVar, e, rfgVar, z0iVar, null, 27), pvnVar);
                        if (V != nm6Var) {
                            V = Unit.a;
                        }
                        if (V != nm6Var) {
                            oqiVar = oqiVar2;
                            oqiVar.b(null);
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                    oqiVar2 = pvnVar.k;
                    qvnVar = (qvn) pvnVar.j;
                    qgg.h0(obj);
                    if (qvnVar.e().b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        Unit unit2 = Unit.a;
                        oqiVar2.b(null);
                        return unit2;
                    }
                    fs7 fs7Var = qoe.c;
                    iec iecVar = qvnVar.b;
                    pvnVar.j = qvnVar;
                    pvnVar.k = oqiVar2;
                    pvnVar.n = 2;
                    obj = fs7Var.j(iecVar, pvnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str = ((qoe) obj).a;
                    if (!Intrinsics.d(str, "")) {
                    }
                }
            }
            if (r6 != 0) {
            }
            if (qvnVar.e().b()) {
            }
        } catch (Throwable th2) {
            th = th2;
            oqiVar = r6;
        }
        pvnVar = new pvn(this, (cg6) continuation);
        Object obj2 = pvnVar.l;
        nm6 nm6Var2 = nm6.a;
        r6 = pvnVar.n;
        int i22 = 2;
        Continuation continuation22 = null;
    }

    public final ipp e() {
        Object obj = this.e.get();
        obj.getClass();
        return (ipp) obj;
    }
}
