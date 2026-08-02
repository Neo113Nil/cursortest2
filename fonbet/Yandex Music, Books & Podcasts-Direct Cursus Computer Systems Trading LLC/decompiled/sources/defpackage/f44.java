package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.dailyquests.feature.internal.mappers.a;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.d;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.e;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.f;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class f44 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(u89 u89Var, w1g w1gVar, View view, gc8 gc8Var, dp8 dp8Var, pyg pygVar, JSONObject jSONObject, xzb xzbVar, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = u89Var;
        this.m = w1gVar;
        this.n = view;
        this.o = gc8Var;
        this.p = dp8Var;
        this.q = pygVar;
        this.r = jSONObject;
        this.s = xzbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        if (r3 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r3 == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        Object a;
        Object j;
        qoe qoeVar;
        lnp lnpVar;
        Object b;
        slp slpVar;
        aec aecVar;
        plp plpVar;
        dp6 dp6Var;
        aec aecVar2;
        y97 y97Var;
        zlp zlpVar = (zlp) this.r;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.k = 1;
            a = zlp.a(zlpVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    j = obj;
                    qoeVar = (qoe) j;
                    slp slpVar2 = slp.a;
                    aec aecVar3 = zlpVar.a;
                    plp plpVar2 = (plp) this.s;
                    lnpVar = zlpVar.c;
                    yec yecVar = yec.a;
                    this.l = qoeVar;
                    this.m = zlpVar;
                    this.n = slpVar2;
                    this.o = aecVar3;
                    this.p = plpVar2;
                    this.q = lnpVar;
                    this.k = 3;
                    b = yecVar.b(this);
                    if (b != nm6Var) {
                        slpVar = slpVar2;
                        aecVar = aecVar3;
                        plpVar = plpVar2;
                        Map map = (Map) b;
                        String str = qoeVar.a;
                        String str2 = qoeVar.b;
                        slpVar.getClass();
                        aecVar.getClass();
                        plpVar.getClass();
                        lnpVar.getClass();
                        map.getClass();
                        str.getClass();
                        str2.getClass();
                        String str3 = plpVar.a;
                        String str4 = plpVar.b;
                        int i2 = plpVar.c;
                        long j2 = plpVar.d;
                        dp6 dp6Var2 = (dp6) map.get(ymp.b);
                        y97 y97Var2 = y97.COLLECTION_DISABLED;
                        y97 y97Var3 = y97.COLLECTION_ENABLED;
                        y97 y97Var4 = y97.COLLECTION_SDK_NOT_INSTALLED;
                        if (dp6Var2 != null) {
                        }
                        dp6Var = (dp6) map.get(ymp.a);
                        if (dp6Var != null) {
                        }
                        rlp rlpVar = new rlp(new dmp(str3, str4, i2, j2, new z97(r2, y97Var, lnpVar.a()), str, str2), slp.a(aecVar2));
                        int i3 = zlp.g;
                        zlpVar.getClass();
                        zlpVar.d.a(rlpVar);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                        return Unit.a;
                    }
                    return nm6Var;
                }
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lnp lnpVar2 = (lnp) this.q;
                plpVar = (plp) this.p;
                aecVar = (aec) this.o;
                slp slpVar3 = (slp) this.n;
                zlp zlpVar2 = (zlp) this.m;
                qoeVar = (qoe) this.l;
                qgg.h0(obj);
                lnpVar = lnpVar2;
                zlpVar = zlpVar2;
                slpVar = slpVar3;
                b = obj;
                Map map2 = (Map) b;
                String str5 = qoeVar.a;
                String str22 = qoeVar.b;
                slpVar.getClass();
                aecVar.getClass();
                plpVar.getClass();
                lnpVar.getClass();
                map2.getClass();
                str5.getClass();
                str22.getClass();
                String str32 = plpVar.a;
                String str42 = plpVar.b;
                int i22 = plpVar.c;
                long j22 = plpVar.d;
                dp6 dp6Var22 = (dp6) map2.get(ymp.b);
                y97 y97Var22 = y97.COLLECTION_DISABLED;
                y97 y97Var32 = y97.COLLECTION_ENABLED;
                y97 y97Var42 = y97.COLLECTION_SDK_NOT_INSTALLED;
                y97 y97Var5 = dp6Var22 != null ? y97Var42 : dp6Var22.a.h() ? y97Var32 : y97Var22;
                dp6Var = (dp6) map2.get(ymp.a);
                if (dp6Var != null) {
                    aecVar2 = aecVar;
                    y97Var = y97Var42;
                } else if (dp6Var.a.h()) {
                    aecVar2 = aecVar;
                    y97Var = y97Var32;
                } else {
                    aecVar2 = aecVar;
                    y97Var = y97Var22;
                }
                rlp rlpVar2 = new rlp(new dmp(str32, str42, i22, j22, new z97(y97Var5, y97Var, lnpVar.a()), str5, str22), slp.a(aecVar2));
                int i32 = zlp.g;
                zlpVar.getClass();
                try {
                    zlpVar.d.a(rlpVar2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                } catch (RuntimeException e) {
                    Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                }
                return Unit.a;
            }
            qgg.h0(obj);
            a = obj;
        }
        if (((Boolean) a).booleanValue()) {
            iec iecVar = zlpVar.b;
            this.k = 2;
            j = qoe.c.j(iecVar, this);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        File B;
        int i;
        ahi ahiVar;
        String s;
        Object a;
        xdr xdrVar = (xdr) this.s;
        x7c x7cVar = (x7c) this.o;
        orr orrVar = (orr) this.m;
        Context context = orrVar.a;
        nm6 nm6Var = nm6.a;
        int i2 = this.k;
        if (i2 == 0) {
            qgg.h0(obj);
            a40[] a40VarArr = a40.a;
            ouj.B("AppSignature: ", jo0.a(context), 2, null, null);
            B = vq2.B(context, (String) this.n);
            mrr mrrVar = (mrr) this.p;
            String str = (String) this.q;
            String str2 = (String) this.r;
            this.l = B;
            this.k = 1;
            Display defaultDisplay = l1b.j(context).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            String str3 = (String) ((d4i) sk3.I(d4i.class)).b.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(context.getString(R.string.app_name_short));
            sb.append(": 2026.07.4 #157gpr\nVersion Code: 24026391\nOS: Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\nDevice: ");
            sb.append(Build.MANUFACTURER);
            sb.append(StringUtil.SPACE);
            su4.v(sb, Build.MODEL, "\nUUID: ", str3, "\nResolution: ");
            sb.append(point.y);
            sb.append("x");
            sb.append(point.x);
            sb.append("\nLocal Time: ");
            sb.append(rd7.a.r(new Date(System.currentTimeMillis())));
            sb.append("\nTimeZone: ");
            sb.append(TimeZone.getDefault().getDisplayName());
            sb.append("\nDensityDpi:");
            String i3 = f1d.i(sb, sht.b(context).densityDpi, StringUtil.LF);
            yxc E = v3g.E((frt) sk3.I(frt.class));
            StringBuilder sb2 = new StringBuilder("User:\nlogin:");
            sb2.append(E.a.b);
            sb2.append("\nuid: ");
            drt drtVar = E.a;
            sb2.append(drtVar.a);
            sb2.append("\nauthorized: ");
            sb2.append(drtVar.d);
            sb2.append("\nsubscribed: ");
            String r = ouj.r(sb2, E.h, StringUtil.LF);
            String X = CollectionsKt.X(jo0.a(context), StringUtil.LF, null, null, null, 62);
            String str4 = mrrVar.a;
            StringBuilder m = f1d.m("\n            ", str, "\n\n            ----\n\n            Local info:\n            ", i3, "\n\n            ");
            su4.v(m, r, "\n\n            Signature:\n            ", X, "\n\n            Source: ");
            m.append(str4);
            m.append("\n        ");
            String d = hlr.d(m.toString());
            if (B != null) {
                i = 1;
                ahiVar = w1g.u("logFile", B.getName(), new dn7(i, B));
            } else {
                i = 1;
                ahiVar = null;
            }
            tc tcVar = (tc) orrVar.c.getValue();
            if (lrr.a[x7cVar.ordinal()] == i) {
                s = "new_radio_feedback";
            } else {
                String name = x7cVar.name();
                Locale locale = Locale.US;
                s = ouj.s(locale, name, locale);
            }
            a = tcVar.a(s, d, str2, ahiVar, this);
            if (a == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i2 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file = (File) this.l;
            qgg.h0(obj);
            B = file;
            a = obj;
        }
        rj6 rj6Var = (rj6) a;
        if (rj6Var instanceof qj6) {
            orrVar.a().edit().putString(x7cVar.name(), null).apply();
            xdrVar.m(null, nrr.a);
        } else {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            xdrVar.m(null, nrr.b);
        }
        if (B != null) {
            B.delete();
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f44((i44) this.s, continuation);
            case 1:
                return new f44((u89) this.l, (w1g) this.m, (View) this.n, (gc8) this.o, (dp8) this.p, (pyg) this.q, (JSONObject) this.r, (xzb) this.s, continuation);
            case 2:
                f44 f44Var = new f44((hoa) this.l, (pfm) this.m, (yl0) this.n, (lma) this.o, (yna) this.p, (yna) this.q, (s30) this.s, continuation, 2);
                f44Var.r = obj;
                return f44Var;
            case 3:
                f44 f44Var2 = new f44((z77) this.o, (syb) this.n, (String) this.p, (String) this.q, (String) this.s, continuation);
                f44Var2.r = obj;
                return f44Var2;
            case 4:
                return new f44((xlg) this.n, (ykf) this.o, continuation, (xlg) this.p, (String) this.q, (cvl) this.s);
            case 5:
                return new f44((xlg) this.n, continuation, (xlg) this.p, (String) this.o, (cvl) this.q, (xlg) this.s);
            case 6:
                f44 f44Var3 = new f44((n7b) this.l, (af5) this.m, (List) this.n, (j7i) this.o, (a0p) this.p, (bf5) this.q, (ve5) this.s, continuation, 6);
                f44Var3.r = obj;
                return f44Var3;
            case 7:
                f44 f44Var4 = new f44((uif) this.o, (eno) this.p, (jtc) this.q, (xip) this.s, continuation);
                f44Var4.n = obj;
                return f44Var4;
            case 8:
                return new f44((zlp) this.r, (plp) this.s, continuation);
            case 9:
                f44 f44Var5 = new f44((cnn) this.l, (aw0) this.m, (xdr) this.n, (Context) this.o, (yvn) this.p, (gjs) this.q, (ajs) this.s, continuation, 9);
                f44Var5.r = obj;
                return f44Var5;
            case 10:
                return new f44((orr) this.m, (String) this.n, (x7c) this.o, (mrr) this.p, (String) this.q, (String) this.r, (xdr) this.s, continuation);
            default:
                f44 f44Var6 = new f44((g) this.q, (h) this.s, continuation);
                f44Var6.p = obj;
                return f44Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((f44) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02de, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a8, code lost:
    
        if (((defpackage.yrj) r0).c == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x049e, code lost:
    
        if (r4 == r3) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05cf, code lost:
    
        if (r3 == r2) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x073c, code lost:
    
        if (r0 == r5) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x072b, code lost:
    
        if (r6 == r5) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x097c, code lost:
    
        if (defpackage.x97.V(r2, r26, r37) == r0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0941, code lost:
    
        if (r2 == r0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0a79, code lost:
    
        if (r7 == r2) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0a60, code lost:
    
        if (r3 == r2) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (r2 == r12) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04e3 A[LOOP:3: B:231:0x04dd->B:233:0x04e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0534 A[LOOP:5: B:251:0x052e->B:253:0x0534, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x061a A[LOOP:6: B:288:0x0614->B:290:0x061a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0661 A[LOOP:8: B:304:0x065b->B:306:0x0661, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c6 A[LOOP:0: B:98:0x02c6->B:103:0x02d9, LOOP_START, PHI: r0
      0x02c6: PHI (r0v94 java.lang.Throwable) = (r0v91 java.lang.Throwable), (r0v100 java.lang.Throwable) binds: [B:97:0x02c4, B:103:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v108, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r3v54, types: [int, mm6] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v121 */
    /* JADX WARN: Type inference failed for: r4v122 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r6v46, types: [kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        ygg yggVar;
        Object d2;
        Object d3;
        ygg yggVar2;
        zgg zggVar;
        Object e;
        zgg zggVar2;
        zgg zggVar3;
        ygg yggVar3;
        zgg zggVar4;
        Object g;
        ygg yggVar4;
        zgg zggVar5;
        zgg zggVar6;
        i44 i44Var;
        zgg zggVar7;
        Object d4;
        zgg zggVar8;
        zgg zggVar9;
        zgg zggVar10;
        Object e2;
        zgg zggVar11;
        zgg zggVar12;
        zgg zggVar13;
        zgg zggVar14;
        zgg zggVar15;
        Object d5;
        zgg zggVar16;
        zgg zggVar17;
        zgg zggVar18;
        zgg zggVar19;
        zgg zggVar20;
        ygg yggVar5;
        Object V;
        ou7 p;
        Object s;
        okg okgVar;
        Object H;
        int i;
        long j;
        long j2;
        char c;
        int i2;
        char c2;
        char c3;
        long j3;
        Object b;
        cvl cvlVar;
        Object b2;
        ykf ykfVar;
        cvl cvlVar2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        rrl rrlVar;
        Object c4;
        Object b3;
        cvl cvlVar3;
        Object b4;
        cvl cvlVar4;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        rrl rrlVar2;
        Object c5;
        rrl rrlVar3;
        Object obj2;
        Object obj3;
        yrj yrjVar;
        pjc fsVar;
        pjc pjcVar;
        Object Q;
        Object obj4;
        Object t7oVar;
        oqi oqiVar;
        AtomicBoolean atomicBoolean;
        Throwable a;
        oqi oqiVar2;
        oqi oqiVar3;
        Throwable th;
        xip xipVar;
        oqi oqiVar4;
        sgr h;
        s2i s2iVar;
        s2i s2iVar2;
        oqi oqiVar5;
        ou7 p2;
        mu7 p3;
        f fVar;
        Object b5;
        CharSequence charSequence;
        char c6;
        f fVar2;
        CharSequence charSequence2;
        Object H2;
        mu7 mu7Var;
        String str;
        char c7;
        Object H3;
        CharSequence charSequence3;
        Drawable drawable;
        int i3 = 8;
        ?? r4 = 6;
        ?? r5 = 10;
        char c8 = '\n';
        char c9 = 2;
        int i4 = 0;
        Continuation continuation = null;
        int i5 = 1;
        switch (this.j) {
            case 0:
                i44 i44Var2 = (i44) this.s;
                nm6 nm6Var = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        by4 by4Var = (by4) i44Var2.a.a.getValue();
                        this.k = 1;
                        d = by4Var.d(20, this);
                        break;
                    case 1:
                        qgg.h0(obj);
                        d = obj;
                        yggVar = (ygg) d;
                        q15 q15Var = (q15) i44Var2.a.e.getValue();
                        this.l = yggVar;
                        this.k = 2;
                        d2 = q15Var.d(21, this);
                        break;
                    case 2:
                        yggVar = (ygg) this.l;
                        qgg.h0(obj);
                        d2 = obj;
                        zgg zggVar21 = (zgg) d2;
                        ey4 ey4Var = (ey4) i44Var2.a.b.getValue();
                        this.l = yggVar;
                        this.m = zggVar21;
                        this.k = 3;
                        d3 = ey4Var.d(20, this);
                        if (d3 != nm6Var) {
                            yggVar2 = yggVar;
                            zggVar = zggVar21;
                            zgg zggVar22 = (zgg) d3;
                            ey4 ey4Var2 = (ey4) i44Var2.a.b.getValue();
                            this.l = yggVar2;
                            this.m = zggVar;
                            this.n = zggVar22;
                            this.k = 4;
                            e = ey4Var2.e(21, this);
                            if (e != nm6Var) {
                                ygg yggVar6 = yggVar2;
                                zggVar2 = zggVar;
                                zggVar3 = zggVar22;
                                yggVar3 = yggVar6;
                                zggVar4 = (zgg) e;
                                x55 x55Var = (x55) i44Var2.a.f.getValue();
                                this.l = yggVar3;
                                this.m = zggVar2;
                                this.n = zggVar3;
                                this.o = zggVar4;
                                this.r = i44Var2;
                                this.k = 5;
                                x55Var.getClass();
                                List c10 = t75.c(j1g.a);
                                l18 l18Var = l18.b;
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                String str2 = ((frt) qdcVar.C(I)).c().a;
                                str2.getClass();
                                g = ((b4u) x55Var.a).g(str2, c10, new Integer(20), this);
                                if (g != nm6Var) {
                                    g = (List) g;
                                }
                                if (g != nm6Var) {
                                    yggVar4 = yggVar3;
                                    zggVar5 = zggVar2;
                                    zggVar6 = zggVar3;
                                    i44Var = i44Var2;
                                    String str3 = i44.h;
                                    i44Var.getClass();
                                    List<x1u> list = (List) g;
                                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                                    for (x1u x1uVar : list) {
                                        x1uVar.getClass();
                                        String str4 = x1uVar.b;
                                        co6 co6Var = x1uVar.o;
                                        qo6 qo6Var = qo6.j;
                                        Date date = x1uVar.m;
                                        arrayList.add(new e24(str4, co6Var, qo6Var, null, date != null ? date.getTime() : 0L));
                                    }
                                    zggVar7 = new zgg(arrayList);
                                    n15 n15Var = (n15) i44Var2.a.c.getValue();
                                    this.l = yggVar4;
                                    this.m = zggVar5;
                                    this.n = zggVar6;
                                    this.o = zggVar4;
                                    this.r = zggVar7;
                                    this.k = 6;
                                    d4 = n15Var.d(20, this);
                                    if (d4 != nm6Var) {
                                        zggVar8 = zggVar4;
                                        zggVar9 = zggVar5;
                                        zggVar10 = (zgg) d4;
                                        n15 n15Var2 = (n15) i44Var2.a.c.getValue();
                                        this.l = yggVar4;
                                        this.m = zggVar9;
                                        this.n = zggVar6;
                                        this.o = zggVar8;
                                        this.r = zggVar7;
                                        this.p = zggVar10;
                                        this.k = 7;
                                        e2 = n15Var2.e(20, this);
                                        if (e2 != nm6Var) {
                                            zgg zggVar23 = zggVar7;
                                            zggVar11 = zggVar8;
                                            zggVar12 = zggVar23;
                                            zgg zggVar24 = zggVar6;
                                            zggVar13 = zggVar9;
                                            zggVar14 = zggVar24;
                                            zggVar15 = (zgg) e2;
                                            iy4 iy4Var = (iy4) i44Var2.a.d.getValue();
                                            this.l = yggVar4;
                                            this.m = zggVar13;
                                            this.n = zggVar14;
                                            this.o = zggVar11;
                                            this.r = zggVar12;
                                            this.p = zggVar10;
                                            this.q = zggVar15;
                                            this.k = 8;
                                            d5 = iy4Var.d(20, this);
                                            if (d5 != nm6Var) {
                                                zggVar16 = zggVar10;
                                                zggVar17 = zggVar12;
                                                zggVar18 = zggVar11;
                                                zggVar19 = zggVar14;
                                                zggVar20 = zggVar13;
                                                yggVar5 = yggVar4;
                                                String str5 = i44.h;
                                                CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                                                return new f34(yggVar5.c, i44.c(yggVar5.d, yggVar5.e), i44.c(zggVar18.c, zggVar20.c), i44.c(zggVar19.c), i44.c(zggVar17.c), i44.c(zggVar15.c), i44.c(zggVar16.c), i44.c(((zgg) d5).c));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 3:
                        zggVar = (zgg) this.m;
                        yggVar2 = (ygg) this.l;
                        qgg.h0(obj);
                        d3 = obj;
                        zgg zggVar222 = (zgg) d3;
                        ey4 ey4Var22 = (ey4) i44Var2.a.b.getValue();
                        this.l = yggVar2;
                        this.m = zggVar;
                        this.n = zggVar222;
                        this.k = 4;
                        e = ey4Var22.e(21, this);
                        if (e != nm6Var) {
                        }
                        return nm6Var;
                    case 4:
                        zggVar3 = (zgg) this.n;
                        zgg zggVar25 = (zgg) this.m;
                        ygg yggVar7 = (ygg) this.l;
                        qgg.h0(obj);
                        yggVar3 = yggVar7;
                        zggVar2 = zggVar25;
                        e = obj;
                        zggVar4 = (zgg) e;
                        x55 x55Var2 = (x55) i44Var2.a.f.getValue();
                        this.l = yggVar3;
                        this.m = zggVar2;
                        this.n = zggVar3;
                        this.o = zggVar4;
                        this.r = i44Var2;
                        this.k = 5;
                        x55Var2.getClass();
                        List c102 = t75.c(j1g.a);
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(frt.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        String str22 = ((frt) qdcVar2.C(I2)).c().a;
                        str22.getClass();
                        g = ((b4u) x55Var2.a).g(str22, c102, new Integer(20), this);
                        if (g != nm6Var) {
                        }
                        if (g != nm6Var) {
                        }
                        return nm6Var;
                    case 5:
                        i44Var = (i44) this.r;
                        zggVar4 = (zgg) this.o;
                        zggVar6 = (zgg) this.n;
                        zggVar5 = (zgg) this.m;
                        ygg yggVar8 = (ygg) this.l;
                        qgg.h0(obj);
                        yggVar4 = yggVar8;
                        g = obj;
                        String str32 = i44.h;
                        i44Var.getClass();
                        List<x1u> list2 = (List) g;
                        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                        while (r5.hasNext()) {
                        }
                        zggVar7 = new zgg(arrayList2);
                        n15 n15Var3 = (n15) i44Var2.a.c.getValue();
                        this.l = yggVar4;
                        this.m = zggVar5;
                        this.n = zggVar6;
                        this.o = zggVar4;
                        this.r = zggVar7;
                        this.k = 6;
                        d4 = n15Var3.d(20, this);
                        if (d4 != nm6Var) {
                        }
                        return nm6Var;
                    case 6:
                        zgg zggVar26 = (zgg) this.r;
                        zggVar8 = (zgg) this.o;
                        zgg zggVar27 = (zgg) this.n;
                        zggVar9 = (zgg) this.m;
                        ygg yggVar9 = (ygg) this.l;
                        qgg.h0(obj);
                        yggVar4 = yggVar9;
                        zggVar6 = zggVar27;
                        zggVar7 = zggVar26;
                        d4 = obj;
                        zggVar10 = (zgg) d4;
                        n15 n15Var22 = (n15) i44Var2.a.c.getValue();
                        this.l = yggVar4;
                        this.m = zggVar9;
                        this.n = zggVar6;
                        this.o = zggVar8;
                        this.r = zggVar7;
                        this.p = zggVar10;
                        this.k = 7;
                        e2 = n15Var22.e(20, this);
                        if (e2 != nm6Var) {
                        }
                        return nm6Var;
                    case 7:
                        zggVar10 = (zgg) this.p;
                        zggVar12 = (zgg) this.r;
                        zggVar11 = (zgg) this.o;
                        zggVar14 = (zgg) this.n;
                        zggVar13 = (zgg) this.m;
                        ygg yggVar10 = (ygg) this.l;
                        qgg.h0(obj);
                        yggVar4 = yggVar10;
                        e2 = obj;
                        zggVar15 = (zgg) e2;
                        iy4 iy4Var2 = (iy4) i44Var2.a.d.getValue();
                        this.l = yggVar4;
                        this.m = zggVar13;
                        this.n = zggVar14;
                        this.o = zggVar11;
                        this.r = zggVar12;
                        this.p = zggVar10;
                        this.q = zggVar15;
                        this.k = 8;
                        d5 = iy4Var2.d(20, this);
                        if (d5 != nm6Var) {
                        }
                        return nm6Var;
                    case 8:
                        zgg zggVar28 = (zgg) this.q;
                        zggVar16 = (zgg) this.p;
                        zggVar17 = (zgg) this.r;
                        zggVar18 = (zgg) this.o;
                        zggVar19 = (zgg) this.n;
                        zggVar20 = (zgg) this.m;
                        yggVar5 = (ygg) this.l;
                        qgg.h0(obj);
                        zggVar15 = zggVar28;
                        d5 = obj;
                        String str52 = i44.h;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
                        return new f34(yggVar5.c, i44.c(yggVar5.d, yggVar5.e), i44.c(zggVar18.c, zggVar20.c), i44.c(zggVar19.c), i44.c(zggVar17.c), i44.c(zggVar15.c), i44.c(zggVar16.c), i44.c(((zgg) d5).c));
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 1:
                w1g w1gVar = (w1g) this.m;
                u89 u89Var = (u89) this.l;
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    mn7 mn7Var = mn7.d;
                    n71 n71Var = new n71(u89Var, w1gVar, (View) this.n, (Continuation) null, 7);
                    this.k = 1;
                    V = x97.V(mn7Var, n71Var, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                nzg nzgVar = (nzg) V;
                dq7 dq7Var2 = ca8.a;
                bsd bsdVar = j5h.a;
                s89 s89Var = new s89(u89Var, (gc8) this.o, (dp8) this.p, (pyg) this.q, nzgVar, (JSONObject) this.r, (xzb) this.s, w1gVar, null);
                this.k = 2;
                break;
            case 2:
                hoa hoaVar = (hoa) this.l;
                Object obj5 = nm6.a;
                ?? r3 = this.k;
                try {
                    if (r3 == 0) {
                        qgg.h0(obj);
                        mm6 mm6Var = (mm6) this.r;
                        bxj bxjVar = hoaVar.q;
                        pfm pfmVar = (pfm) this.m;
                        yl0 yl0Var = (yl0) this.n;
                        lma lmaVar = (lma) this.o;
                        yna ynaVar = (yna) this.p;
                        yna ynaVar2 = (yna) this.q;
                        s30 s30Var = (s30) this.s;
                        this.r = mm6Var;
                        this.k = 1;
                        float f = wna.a;
                        Object v = xee.v(pfmVar, new mna(ynaVar2, new wqn(), bxjVar, yl0Var, s30Var, ynaVar, lmaVar, null), this);
                        if ((v == obj5 ? v : Unit.a) == obj5) {
                            return obj5;
                        }
                    } else {
                        if (r3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                } catch (CancellationException e3) {
                    zi3 zi3Var = hoaVar.u;
                    if (zi3Var != null) {
                        zi3Var.c(uma.a);
                    }
                    if (!gld.T(r3)) {
                        throw e3;
                    }
                }
                return Unit.a;
            case 3:
                syb sybVar = (syb) this.n;
                mm6 mm6Var2 = (mm6) this.r;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    Continuation continuation2 = null;
                    ou7 p4 = x97.p(mm6Var2, null, null, new pyb(sybVar, (z77) this.o, (String) this.p, (String) this.q, (String) this.s, continuation2, 1), 3);
                    p = x97.p(mm6Var2, null, null, new pyb(sybVar, (z77) this.o, (String) this.p, (String) this.q, (String) this.s, continuation2, 2), 3);
                    this.r = null;
                    this.l = p;
                    this.k = 1;
                    s = p4.s(this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        okg okgVar2 = (okg) this.m;
                        qgg.h0(obj);
                        okgVar = okgVar2;
                        H = obj;
                        okg okgVar3 = (okg) H;
                        if (okgVar == null && okgVar3 == null) {
                            xq0.q("Home and pull-formats experiments are null");
                            return null;
                        }
                        okg[] okgVarArr = {okgVar, okgVar3};
                        upi upiVar = new upi();
                        upi upiVar2 = new upi();
                        upi upiVar3 = new upi();
                        for (int i8 = 0; i8 < 2; i8++) {
                            okg okgVar4 = okgVarArr[i8];
                            if (okgVar4 != null) {
                                upiVar.b(StringsKt.e0(okgVar4.a, new char[]{';'}, 6));
                                upiVar2.b(StringsKt.e0(okgVar4.b, new char[]{';'}, 6));
                                upi upiVar4 = okgVar4.c;
                                upiVar4.getClass();
                                upiVar3.k(upiVar4);
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        ?? r42 = upiVar.b;
                        long[] jArr = upiVar.a;
                        int length = jArr.length - 2;
                        long j4 = 255;
                        if (length >= 0) {
                            i = 0;
                            int i9 = 0;
                            j2 = 128;
                            String[] strArr = r42;
                            while (true) {
                                long j5 = jArr[i4];
                                String[] strArr2 = strArr;
                                c = 7;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i4 - length)) >>> 31);
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        if ((j5 & j4) < 128) {
                                            j3 = j4;
                                            sb.append(strArr2[(i4 << 3) + i11]);
                                            int i12 = i9 + 1;
                                            c3 = c9;
                                            if (i12 < upiVar.d) {
                                                sb.append(';');
                                            }
                                            i9 = i12;
                                        } else {
                                            c3 = c9;
                                            j3 = j4;
                                        }
                                        j5 >>= 8;
                                        i11++;
                                        c9 = c3;
                                        j4 = j3;
                                    }
                                    c2 = c9;
                                    j = j4;
                                    if (i10 != 8) {
                                    }
                                } else {
                                    c2 = c9;
                                    j = j4;
                                }
                                if (i4 != length) {
                                    i4++;
                                    strArr = strArr2;
                                    c9 = c2;
                                    j4 = j;
                                }
                            }
                        } else {
                            i = 0;
                            j = 255;
                            j2 = 128;
                            c = 7;
                        }
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr = upiVar2.b;
                        long[] jArr2 = upiVar2.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i13 = i;
                            int i14 = i13;
                            while (true) {
                                long j6 = jArr2[i13];
                                if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i13 - length2)) >>> 31);
                                    int i16 = i;
                                    while (i16 < i15) {
                                        if ((j6 & j) < j2) {
                                            i2 = i3;
                                            sb3.append((String) objArr[(i13 << 3) + i16]);
                                            i14++;
                                            if (i14 < upiVar2.d) {
                                                sb3.append(';');
                                            }
                                        } else {
                                            i2 = i3;
                                        }
                                        j6 >>= i2;
                                        i16++;
                                        i3 = i2;
                                    }
                                    if (i15 != i3) {
                                    }
                                }
                                if (i13 != length2) {
                                    i13++;
                                    i3 = 8;
                                }
                            }
                        }
                        return new okg(sb2, sb3.toString(), upiVar3);
                    }
                    p = (ou7) this.l;
                    qgg.h0(obj);
                    s = obj;
                }
                okgVar = (okg) s;
                this.r = null;
                this.l = null;
                this.m = okgVar;
                this.k = 2;
                H = p.H(this);
                break;
            case 4:
                xlg xlgVar = (xlg) this.n;
                Object obj6 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    xlg xlgVar2 = (xlg) this.p;
                    String str6 = (String) this.q;
                    cvl cvlVar5 = (cvl) this.s;
                    this.r = null;
                    this.k = 1;
                    b = xlg.b(xlgVar2, str6, cvlVar5, this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rrl rrlVar4 = (rrl) this.l;
                            obj6 = (rrl) this.r;
                            qgg.h0(obj);
                            rrlVar = rrlVar4;
                            c4 = obj;
                            if (!((Boolean) c4).booleanValue() && rrlVar.b.isEmpty()) {
                                return null;
                            }
                            return obj6;
                        }
                        cvlVar = (cvl) this.m;
                        cvl cvlVar6 = (cvl) this.l;
                        ?? r6 = (Function2) this.r;
                        qgg.h0(obj);
                        ykfVar = r6;
                        cvlVar2 = cvlVar6;
                        b2 = obj;
                        List y = ((MainDatabase) b2).M().y(cvlVar, null);
                        ArrayList arrayList3 = new ArrayList(v75.o(y, 10));
                        it = y.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(q7g.T((h4m) it.next()));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((Boolean) ykfVar.invoke(cvlVar, (mqs) next)).booleanValue()) {
                                arrayList4.add(next);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(new t2m(((mqs) it3.next()).d(), null));
                        }
                        rrlVar = new rrl(cvlVar2, arrayList5, arrayList4);
                        this.r = rrlVar;
                        this.l = rrlVar;
                        this.m = null;
                        this.k = 3;
                        c4 = xlg.c(xlgVar, cvlVar2, this);
                        if (c4 != obj6) {
                            obj6 = rrlVar;
                            if (!((Boolean) c4).booleanValue()) {
                                return null;
                            }
                        }
                        return obj6;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                cvlVar = (cvl) b;
                if (cvlVar == null) {
                    return null;
                }
                ykf ykfVar2 = (ykf) this.o;
                String str7 = xlgVar.e.c().a;
                str7.getClass();
                i5h i5hVar = xlgVar.f;
                this.r = ykfVar2;
                this.l = cvlVar;
                this.m = cvlVar;
                this.k = 2;
                b2 = i5hVar.b(str7, this);
                if (b2 != obj6) {
                    ykfVar = ykfVar2;
                    cvlVar2 = cvlVar;
                    List y2 = ((MainDatabase) b2).M().y(cvlVar, null);
                    ArrayList arrayList32 = new ArrayList(v75.o(y2, 10));
                    it = y2.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    it2 = arrayList32.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList52 = new ArrayList(v75.o(arrayList42, 10));
                    it3 = arrayList42.iterator();
                    while (it3.hasNext()) {
                    }
                    rrlVar = new rrl(cvlVar2, arrayList52, arrayList42);
                    this.r = rrlVar;
                    this.l = rrlVar;
                    this.m = null;
                    this.k = 3;
                    c4 = xlg.c(xlgVar, cvlVar2, this);
                    if (c4 != obj6) {
                    }
                }
                return obj6;
            case 5:
                xlg xlgVar3 = (xlg) this.s;
                xlg xlgVar4 = (xlg) this.n;
                nm6 nm6Var4 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    xlg xlgVar5 = (xlg) this.p;
                    String str8 = (String) this.o;
                    cvl cvlVar7 = (cvl) this.q;
                    this.r = null;
                    this.k = 1;
                    b3 = xlg.b(xlgVar5, str8, cvlVar7, this);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rrl rrlVar5 = (rrl) this.l;
                            rrlVar3 = (rrl) this.r;
                            qgg.h0(obj);
                            rrlVar2 = rrlVar5;
                            c5 = obj;
                            if (((Boolean) c5).booleanValue() && rrlVar2.b.isEmpty()) {
                                return null;
                            }
                            return rrlVar3;
                        }
                        cvlVar3 = (cvl) this.m;
                        cvl cvlVar8 = (cvl) this.r;
                        qgg.h0(obj);
                        cvlVar4 = cvlVar8;
                        b4 = obj;
                        List y3 = ((MainDatabase) b4).M().y(cvlVar3, null);
                        ArrayList arrayList6 = new ArrayList(v75.o(y3, 10));
                        it4 = y3.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(q7g.T((h4m) it4.next()));
                        }
                        ArrayList arrayList7 = new ArrayList();
                        it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            mqs mqsVar = (mqs) next2;
                            if (((Boolean) xlgVar3.h.invoke(cvlVar3, mqsVar)).booleanValue() && xlgVar3.g.j(mqsVar)) {
                                arrayList7.add(next2);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(v75.o(arrayList7, 10));
                        it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            arrayList8.add(new t2m(((mqs) it6.next()).d(), null));
                        }
                        rrlVar2 = new rrl(cvlVar4, arrayList8, arrayList7);
                        this.r = rrlVar2;
                        this.l = rrlVar2;
                        this.m = null;
                        this.k = 3;
                        c5 = xlg.c(xlgVar4, cvlVar4, this);
                        if (c5 != nm6Var4) {
                            rrlVar3 = rrlVar2;
                            if (((Boolean) c5).booleanValue()) {
                            }
                            return rrlVar3;
                        }
                        return nm6Var4;
                    }
                    qgg.h0(obj);
                    b3 = obj;
                }
                cvlVar3 = (cvl) b3;
                if (cvlVar3 == null) {
                    return null;
                }
                String str9 = xlgVar4.e.c().a;
                str9.getClass();
                i5h i5hVar2 = xlgVar4.f;
                this.r = cvlVar3;
                this.l = null;
                this.m = cvlVar3;
                this.k = 2;
                b4 = i5hVar2.b(str9, this);
                if (b4 != nm6Var4) {
                    cvlVar4 = cvlVar3;
                    List y32 = ((MainDatabase) b4).M().y(cvlVar3, null);
                    ArrayList arrayList62 = new ArrayList(v75.o(y32, 10));
                    it4 = y32.iterator();
                    while (it4.hasNext()) {
                    }
                    ArrayList arrayList72 = new ArrayList();
                    it5 = arrayList62.iterator();
                    while (it5.hasNext()) {
                    }
                    ArrayList arrayList82 = new ArrayList(v75.o(arrayList72, 10));
                    it6 = arrayList72.iterator();
                    while (it6.hasNext()) {
                    }
                    rrlVar2 = new rrl(cvlVar4, arrayList82, arrayList72);
                    this.r = rrlVar2;
                    this.l = rrlVar2;
                    this.m = null;
                    this.k = 3;
                    c5 = xlg.c(xlgVar4, cvlVar4, this);
                    if (c5 != nm6Var4) {
                    }
                }
                return nm6Var4;
            case 6:
                List list3 = (List) this.n;
                a0p a0pVar = (a0p) this.p;
                j7i j7iVar = (j7i) this.o;
                mm6 mm6Var3 = (mm6) this.r;
                Object obj7 = nm6.a;
                int i19 = this.k;
                int i20 = 1;
                if (i19 == 0) {
                    qgg.h0(obj);
                    pjc Y = bkp.Y(mm6Var3, new r6i((pjc) ((n7b) this.l).a, j7iVar, i20));
                    n1p n1pVar = ((af5) this.m).b;
                    List list4 = list3;
                    Iterator it7 = list4.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj2 = it7.next();
                            if (((ue5) obj2) instanceof jpg) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ue5 ue5Var = (ue5) obj2;
                    Iterator it8 = list4.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj3 = it8.next();
                            if (((ue5) obj3) instanceof yqi) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    ue5 ue5Var2 = (ue5) obj3;
                    if (list3.size() != 2) {
                        list3 = null;
                    }
                    if (list3 != null) {
                        ue5 ue5Var3 = (ue5) list3.get(0);
                        ue5 ue5Var4 = (ue5) list3.get(1);
                        if ((ue5Var3 instanceof yrj) && (ue5Var4 instanceof yrj)) {
                            yrjVar = (yrj) ue5Var3;
                            if (yrjVar.b == c0p.d) {
                                if (yrjVar.c != null) {
                                    break;
                                }
                            }
                        }
                    }
                    yrjVar = null;
                    if (n1pVar == null || n1pVar.c == t1p.a) {
                        b0p b0pVar = a0pVar.d;
                        c0p c0pVar = a0pVar.b;
                        p0p p0pVar = a0pVar.c;
                        if (b0pVar == b0p.a) {
                            int i21 = 12;
                            if (ue5Var != null) {
                                Integer G = j7i.G(j7iVar, p0pVar, ue5Var);
                                Integer H4 = j7i.H(j7iVar, c0pVar);
                                if (G != null) {
                                    pjcVar = new u21(i21, Y, G, H4);
                                    Y = pjcVar;
                                }
                            } else if (ue5Var2 != null) {
                                Integer G2 = j7i.G(j7iVar, p0pVar, ue5Var2);
                                Integer H5 = j7i.H(j7iVar, c0pVar);
                                if (G2 != null) {
                                    pjcVar = new u21(i21, Y, G2, H5);
                                    Y = pjcVar;
                                }
                            } else if (yrjVar != null) {
                                Integer G3 = j7i.G(j7iVar, p0pVar, yrjVar);
                                Integer H6 = j7i.H(j7iVar, c0pVar);
                                if (G3 != null) {
                                    pjcVar = new u21(i21, Y, G3, H6);
                                    Y = pjcVar;
                                }
                            } else if (((bf5) this.q).a()) {
                                fsVar = new fs(23, Y);
                                ve5 ve5Var = (ve5) this.s;
                                a0p a0pVar2 = (a0p) this.p;
                                this.r = null;
                                this.k = 1;
                                Q = gld.Q(new xg(j7iVar, fsVar, a0pVar2, ve5Var, (Continuation) null, 14), this);
                                obj4 = Q;
                                if (Q != nm6.a) {
                                    obj4 = Unit.a;
                                }
                                if (obj4 == obj7) {
                                    return obj7;
                                }
                            }
                        }
                    }
                    fsVar = Y;
                    ve5 ve5Var2 = (ve5) this.s;
                    a0p a0pVar22 = (a0p) this.p;
                    this.r = null;
                    this.k = 1;
                    Q = gld.Q(new xg(j7iVar, fsVar, a0pVar22, ve5Var2, (Continuation) null, 14), this);
                    obj4 = Q;
                    if (Q != nm6.a) {
                    }
                    if (obj4 == obj7) {
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                xip xipVar2 = (xip) this.s;
                nm6 nm6Var5 = nm6.a;
                int i22 = this.k;
                try {
                } catch (Throwable th2) {
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(th2);
                    atomicBoolean = r4;
                    oqiVar = r5;
                }
                if (i22 == 0) {
                    qgg.h0(obj);
                    qqi a2 = rqi.a();
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    ?? r0 = (uif) this.o;
                    eno enoVar = (eno) this.p;
                    jtc jtcVar = (jtc) this.q;
                    r7o r7oVar2 = z7o.b;
                    pjc pjcVar2 = (pjc) r0.invoke(enoVar);
                    ajp ajpVar = new ajp(atomicBoolean2, a2, jtcVar, xipVar2);
                    this.n = a2;
                    this.r = atomicBoolean2;
                    this.k = 1;
                    r4 = atomicBoolean2;
                    r5 = a2;
                    if (pjcVar2.collect(ajpVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xipVar2 = (xip) this.m;
                            oqi oqiVar6 = (oqi) this.l;
                            s2iVar2 = (s2i) this.r;
                            h = (sgr) this.n;
                            qgg.h0(obj);
                            oqiVar5 = oqiVar6;
                            try {
                                xipVar2.a(h, s2iVar2);
                                oqiVar5.b(null);
                                return Unit.a;
                            } finally {
                            }
                        }
                        xipVar = (xip) this.m;
                        oqiVar2 = (oqi) this.l;
                        th = (Throwable) this.r;
                        oqiVar3 = (oqi) this.n;
                        qgg.h0(obj);
                        try {
                            xipVar.e(new s2i());
                            oqiVar2.b(null);
                            a = th;
                            oqiVar4 = oqiVar3;
                            h = a != null ? sgr.e : a instanceof CancellationException ? sgr.f.h(a) : sgr.f(a);
                            if (a != null) {
                                while (true) {
                                    if (a == null) {
                                        break;
                                    } else if (a instanceof tgr) {
                                        s2iVar = ((tgr) a).b;
                                        break;
                                    } else if (a instanceof wgr) {
                                        break;
                                    } else {
                                        a = a.getCause();
                                    }
                                }
                            }
                            s2iVar = new s2i();
                            this.n = h;
                            this.r = s2iVar;
                            this.l = oqiVar4;
                            this.m = xipVar2;
                            this.k = 3;
                            if (oqiVar4.a(this) != nm6Var5) {
                                s2iVar2 = s2iVar;
                                oqiVar5 = oqiVar4;
                                xipVar2.a(h, s2iVar2);
                                oqiVar5.b(null);
                                return Unit.a;
                            }
                            return nm6Var5;
                        } finally {
                        }
                    }
                    AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.r;
                    oqi oqiVar7 = (oqi) this.n;
                    qgg.h0(obj);
                    r4 = atomicBoolean3;
                    r5 = oqiVar7;
                }
                t7oVar = Unit.a;
                r7o r7oVar3 = z7o.b;
                atomicBoolean = r4;
                oqiVar = r5;
                a = z7o.a(t7oVar);
                oqiVar4 = oqiVar;
                if (a == null) {
                    oqiVar4 = oqiVar;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        this.n = oqiVar;
                        this.r = a;
                        this.l = oqiVar;
                        this.m = xipVar2;
                        this.k = 2;
                        if (oqiVar.a(this) != nm6Var5) {
                            oqiVar2 = oqiVar;
                            oqiVar3 = oqiVar2;
                            th = a;
                            xipVar = xipVar2;
                            xipVar.e(new s2i());
                            oqiVar2.b(null);
                            a = th;
                            oqiVar4 = oqiVar3;
                        }
                        return nm6Var5;
                    }
                }
                if (a != null) {
                }
                if (a != null) {
                }
                s2iVar = new s2i();
                this.n = h;
                this.r = s2iVar;
                this.l = oqiVar4;
                this.m = xipVar2;
                this.k = 3;
                if (oqiVar4.a(this) != nm6Var5) {
                }
                return nm6Var5;
            case 8:
                return k(obj);
            case 9:
                nm6 nm6Var6 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var4 = (mm6) this.r;
                    wqn wqnVar = new wqn();
                    cnn cnnVar = (cnn) this.l;
                    wqnVar.a = cnnVar.a;
                    xdr xdrVar = cnnVar.u;
                    inp inpVar = new inp((aw0) this.m, cnnVar, wqnVar, (xdr) this.n, (Context) this.o, (yvn) this.p, (gjs) this.q, (ajs) this.s, mm6Var4, null);
                    this.k = 1;
                    if (zsd.O(xdrVar, inpVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                return l(obj);
            default:
                g gVar = (g) this.q;
                h hVar = (h) this.s;
                mm6 mm6Var5 = (mm6) this.p;
                nm6 nm6Var7 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    p2 = x97.p(mm6Var5, null, null, new a(hVar, gVar, continuation, i5), 3);
                    p3 = x97.p(mm6Var5, null, null, new a(hVar, gVar, continuation, i4), 3);
                    fVar = gVar.f;
                    if (fVar instanceof d) {
                        charSequence = ((d) fVar).a;
                        c6 = 1;
                        String str10 = gVar.e;
                        fVar2 = gVar.f;
                        if (!(fVar2 instanceof d)) {
                            charSequence2 = ((d) fVar2).a;
                        } else {
                            if (!(fVar2 instanceof e)) {
                                b6e.s();
                                return null;
                            }
                            e eVar = (e) fVar2;
                            String str11 = eVar.a;
                            String str12 = eVar.c;
                            String str13 = eVar.e;
                            str11.getClass();
                            str12.getClass();
                            str13.getClass();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str11);
                            int T = StringsKt.T(spannableStringBuilder, str12, 0, false, 6);
                            Integer valueOf = Integer.valueOf(T);
                            if (T < 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                int intValue = valueOf.intValue();
                                spannableStringBuilder.replace(intValue, str12.length() + intValue, (CharSequence) str13);
                                charSequence2 = new SpannedString(spannableStringBuilder);
                            } else {
                                charSequence2 = null;
                            }
                            if (charSequence2 == null) {
                                charSequence2 = eVar.d;
                            }
                        }
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = str10;
                        charSequenceArr[c6] = charSequence2;
                        String X = CollectionsKt.X(xz0.w(charSequenceArr), null, null, null, null, 63);
                        this.p = null;
                        this.l = null;
                        this.m = p3;
                        this.r = charSequence;
                        this.n = X;
                        this.k = 2;
                        H2 = p2.H(this);
                        if (H2 != nm6Var7) {
                            mu7Var = p3;
                            str = X;
                            Drawable drawable2 = (Drawable) H2;
                            this.p = null;
                            this.l = null;
                            this.m = null;
                            this.r = charSequence;
                            this.n = str;
                            this.o = drawable2;
                            this.k = 3;
                            H3 = mu7Var.H(this);
                            if (H3 != nm6Var7) {
                            }
                        }
                        return nm6Var7;
                    }
                    if (!(fVar instanceof e)) {
                        b6e.s();
                        return null;
                    }
                    y yVar = ((e) fVar).b;
                    this.p = null;
                    this.l = p2;
                    this.m = p3;
                    this.r = fVar;
                    this.k = 1;
                    b5 = h.b(hVar, yVar, this);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            if (i24 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Drawable drawable3 = (Drawable) this.o;
                            str = (String) this.n;
                            CharSequence charSequence4 = (CharSequence) this.r;
                            qgg.h0(obj);
                            drawable = drawable3;
                            charSequence3 = charSequence4;
                            H3 = obj;
                            return new com.yandex.plus.home.dailyquests.feature.internal.model.a(drawable, (Drawable) H3, gVar.e, charSequence3, str);
                        }
                        String str14 = (String) this.n;
                        CharSequence charSequence5 = (CharSequence) this.r;
                        mu7Var = (mu7) this.m;
                        qgg.h0(obj);
                        str = str14;
                        charSequence = charSequence5;
                        H2 = obj;
                        Drawable drawable22 = (Drawable) H2;
                        this.p = null;
                        this.l = null;
                        this.m = null;
                        this.r = charSequence;
                        this.n = str;
                        this.o = drawable22;
                        this.k = 3;
                        H3 = mu7Var.H(this);
                        if (H3 != nm6Var7) {
                            charSequence3 = charSequence;
                            drawable = drawable22;
                            return new com.yandex.plus.home.dailyquests.feature.internal.model.a(drawable, (Drawable) H3, gVar.e, charSequence3, str);
                        }
                        return nm6Var7;
                    }
                    f fVar3 = (f) this.r;
                    p3 = (mu7) this.m;
                    p2 = (ou7) this.l;
                    qgg.h0(obj);
                    fVar = fVar3;
                    b5 = obj;
                }
                Drawable drawable4 = (Drawable) b5;
                if (drawable4 != null) {
                    e eVar2 = (e) fVar;
                    String str15 = eVar2.a;
                    String str16 = eVar2.c;
                    str15.getClass();
                    str16.getClass();
                    char c11 = 1;
                    charSequence = a1.a(str15, str16, new olu(c8, drawable4));
                    c7 = c11;
                    c6 = c11;
                    break;
                } else {
                    c7 = 1;
                }
                charSequence = ((e) fVar).d;
                c6 = c7;
                String str102 = gVar.e;
                fVar2 = gVar.f;
                if (!(fVar2 instanceof d)) {
                }
                CharSequence[] charSequenceArr2 = new CharSequence[2];
                charSequenceArr2[0] = str102;
                charSequenceArr2[c6] = charSequence2;
                String X2 = CollectionsKt.X(xz0.w(charSequenceArr2), null, null, null, null, 63);
                this.p = null;
                this.l = null;
                this.m = p3;
                this.r = charSequence;
                this.n = X2;
                this.k = 2;
                H2 = p2.H(this);
                if (H2 != nm6Var7) {
                }
                return nm6Var7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(z77 z77Var, syb sybVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.n = sybVar;
        this.o = z77Var;
        this.p = str;
        this.q = str2;
        this.s = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(i44 i44Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.s = i44Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(xlg xlgVar, ykf ykfVar, Continuation continuation, xlg xlgVar2, String str, cvl cvlVar) {
        super(2, continuation);
        this.j = 4;
        this.n = xlgVar;
        this.o = ykfVar;
        this.p = xlgVar2;
        this.q = str;
        this.s = cvlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(xlg xlgVar, Continuation continuation, xlg xlgVar2, String str, cvl cvlVar, xlg xlgVar3) {
        super(2, continuation);
        this.j = 5;
        this.p = xlgVar2;
        this.q = cvlVar;
        this.s = xlgVar3;
        this.n = xlgVar;
        this.o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(zlp zlpVar, plp plpVar, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.r = zlpVar;
        this.s = plpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(orr orrVar, String str, x7c x7cVar, mrr mrrVar, String str2, String str3, xdr xdrVar, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.m = orrVar;
        this.n = str;
        this.o = x7cVar;
        this.p = mrrVar;
        this.q = str2;
        this.r = str3;
        this.s = xdrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f44(g gVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.j = 11;
        this.q = gVar;
        this.s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f44(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
        this.q = obj6;
        this.s = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f44(Function1 function1, eno enoVar, jtc jtcVar, xip xipVar, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.o = (uif) function1;
        this.p = enoVar;
        this.q = jtcVar;
        this.s = xipVar;
    }
}
