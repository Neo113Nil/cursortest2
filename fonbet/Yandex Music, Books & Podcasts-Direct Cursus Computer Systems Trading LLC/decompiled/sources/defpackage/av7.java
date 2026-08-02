package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.l;
import com.yandex.plus.home.dailyquests.repository.rest.c;
import com.yandex.plus.home.datasource.openapi.apis.MissionPlatformControllerApi;
import com.yandex.plus.home.datasource.openapi.models.p4;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class av7 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av7(kr3 kr3Var, Context context, oyg oygVar, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.n = kr3Var;
        this.p = context;
        this.o = oygVar;
        this.q = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                av7 av7Var = new av7((Context) this.p, this.l, (Object[]) this.q, continuation);
                av7Var.o = obj;
                return av7Var;
            case 1:
                return new av7((HashSet) this.o, (ncc) this.p, (HashSet) this.q, continuation);
            case 2:
                return new av7((bjt) this.p, (cr) this.q, continuation, 2);
            case 3:
                return new av7((kr3) this.n, (Context) this.p, (oyg) this.o, (aqi) this.q, continuation);
            case 4:
                return new av7((cks) this.p, (int[]) this.q, continuation, 4);
            default:
                return new av7((c) this.q, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((av7) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:38|39|(1:(1:(8:43|44|45|46|47|48|49|50)(2:65|66))(1:67))(4:92|(1:94)|49|50)|68|69|70|71|(4:73|46|47|48)|49|50) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:114)|120|121|122|(3:135|(1:138)|137)(1:124)|125|(1:134)|128|129|(3:131|104|279)|118|119) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        if (r2 == r9) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021a, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0346, code lost:
    
        if (r3 == r2) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04a9, code lost:
    
        if (r4 == r3) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0446, code lost:
    
        if (r4 == r3) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r3.a(r17) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r4 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        r8 = r12;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0165, code lost:
    
        r8 = r12;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0162, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        r3 = null;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0177, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0178, code lost:
    
        r3 = null;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0173, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0388 A[Catch: all -> 0x03c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03c2, blocks: (B:193:0x037b, B:197:0x0388), top: B:192:0x037b }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0198 A[Catch: all -> 0x00d4, TryCatch #12 {all -> 0x00d4, blocks: (B:45:0x00cf, B:46:0x015a, B:47:0x019e, B:63:0x0181, B:64:0x0186, B:58:0x0187, B:60:0x018c, B:53:0x0193, B:56:0x0198), top: B:39:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018c A[Catch: all -> 0x00d4, TryCatch #12 {all -> 0x00d4, blocks: (B:45:0x00cf, B:46:0x015a, B:47:0x019e, B:63:0x0181, B:64:0x0186, B:58:0x0187, B:60:0x018c, B:53:0x0193, B:56:0x0198), top: B:39:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #12 {all -> 0x00d4, blocks: (B:45:0x00cf, B:46:0x015a, B:47:0x019e, B:63:0x0181, B:64:0x0186, B:58:0x0187, B:60:0x018c, B:53:0x0193, B:56:0x0198), top: B:39:0x00ba }] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.view.ViewGroup, iu2] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v9, types: [oqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x026c -> B:101:0x026d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x02a2 -> B:108:0x01e0). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b1r b1rVar;
        xqn xqnVar;
        Object V;
        Object b;
        ucc uccVar;
        Object g;
        x7u x7uVar;
        oqi oqiVar;
        int i;
        oqi oqiVar2;
        Throwable th;
        int i2;
        int i3;
        jyg jygVar;
        Throwable th2;
        Object x;
        Object obj2;
        int[] iArr;
        oqi oqiVar3;
        cks cksVar;
        int i4;
        FileOutputStream fileOutputStream;
        oqi oqiVar4;
        Long id;
        Object a;
        Long l;
        Object b2;
        oqi oqiVar5;
        oqi oqiVar6;
        Object a2;
        int i5 = 3;
        int i6 = 1;
        boolean z = true;
        i6 = 1;
        i6 = 1;
        i6 = 1;
        ?? r8 = 2;
        ?? r82 = 2;
        int i7 = 0;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                mm6 mm6Var = (mm6) this.o;
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    Activity F = sj2.F((Context) this.p);
                    F.getClass();
                    int i9 = this.l;
                    Object[] objArr = (Object[]) this.q;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    String c = g3o.c(i9, Arrays.copyOf(copyOf, copyOf.length));
                    StyleSpan styleSpan = new StyleSpan(1);
                    Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
                    Object[] objArr2 = {styleSpan};
                    SpannableString spannableString = new SpannableString(c);
                    for (Object obj3 : copyOf2) {
                        String valueOf = String.valueOf(obj3);
                        int indexOf = c.indexOf(valueOf);
                        spannableString.setSpan(objArr2[0], indexOf, valueOf.length() + indexOf, 0);
                    }
                    b1r g2 = b1r.g(F.findViewById(R.id.content), spannableString, 0);
                    ?? r4 = g2.i;
                    r4.setBackgroundColor(weo.N(F, ru.yandex.music.R.style.AppDesign_Dark, ru.yandex.music.R.attr.bgPrimary));
                    if (Build.VERSION.SDK_INT < 30) {
                        int n = qdq.n(F);
                        ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
                        layoutParams.getClass();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin + n);
                        r4.setLayoutParams(marginLayoutParams);
                    }
                    ((SnackbarContentLayout) r4.getChildAt(0)).getActionView().setTextColor(weo.N(F, ru.yandex.music.R.style.AppDesign_Dark, ru.yandex.music.R.attr.textAccent));
                    int N = weo.N(F, ru.yandex.music.R.style.AppDesign_Dark, ru.yandex.music.R.attr.textPrimary);
                    View findViewById = r4.findViewById(ru.yandex.music.R.id.snackbar_text);
                    findViewById.getClass();
                    ((TextView) findViewById).setTextColor(N);
                    g2.i();
                    xqn xqnVar2 = new xqn();
                    xqnVar2.a = saf.Q(mm6Var.getCoroutineContext());
                    g2.h(g3o.b(ru.yandex.music.R.string.undo), new ol(11, xqnVar2));
                    this.o = null;
                    this.m = g2;
                    this.n = xqnVar2;
                    this.k = 1;
                    if (y2x.o(2750L, this) == nm6Var) {
                        return nm6Var;
                    }
                    b1rVar = g2;
                    xqnVar = xqnVar2;
                    i5 = 3;
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = (xqn) this.n;
                    b1rVar = (b1r) this.m;
                    qgg.h0(obj);
                }
                b1rVar.a(i5);
                xqnVar.a = null;
                return Unit.a;
            case 1:
                HashSet hashSet = (HashSet) this.q;
                ncc nccVar = (ncc) this.p;
                nm6 nm6Var2 = nm6.a;
                int i10 = this.l;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (((HashSet) this.o).size() < 8) {
                        xdr xdrVar = nccVar.f;
                        occ occVar = occ.a;
                        xdrVar.getClass();
                        xdrVar.m(null, occVar);
                        return Unit.a;
                    }
                    if (nccVar.c == null || nccVar.d == null) {
                        ddc ddcVar = nccVar.a;
                        this.l = 1;
                        V = x97.V(dm6.b, new g68(ddcVar, continuation, 15), this);
                        break;
                    }
                    if (i6 != 0) {
                        this.k = i6;
                        this.l = 2;
                        b = ncc.b(nccVar, hashSet, this);
                        break;
                    }
                    return Unit.a;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uccVar = (ucc) this.n;
                        nccVar = (ncc) this.m;
                        qgg.h0(obj);
                        xdr xdrVar2 = nccVar.f;
                        scc a3 = ncc.a(nccVar, uccVar);
                        xdrVar2.getClass();
                        xdrVar2.m(null, a3);
                        nccVar.c = new Long(uccVar.a);
                        nccVar.d = uccVar.b;
                        return Unit.a;
                    }
                    int i11 = this.k;
                    qgg.h0(obj);
                    i6 = i11;
                    b = obj;
                    List list = (List) b;
                    if (list != null) {
                        ucc uccVar2 = new ucc(System.currentTimeMillis(), hashSet, list);
                        ddc ddcVar2 = nccVar.a;
                        this.m = nccVar;
                        this.n = uccVar2;
                        this.k = i6;
                        this.l = 3;
                        Object V2 = x97.V(dm6.b, new fzb(ddcVar2, uccVar2, continuation, 7), this);
                        if (V2 != nm6Var2) {
                            V2 = Unit.a;
                        }
                        if (V2 != nm6Var2) {
                            uccVar = uccVar2;
                            xdr xdrVar22 = nccVar.f;
                            scc a32 = ncc.a(nccVar, uccVar);
                            xdrVar22.getClass();
                            xdrVar22.m(null, a32);
                            nccVar.c = new Long(uccVar.a);
                            nccVar.d = uccVar.b;
                        }
                        return nm6Var2;
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                V = obj;
                ucc uccVar3 = (ucc) V;
                xdr xdrVar3 = nccVar.f;
                scc a4 = ncc.a(nccVar, uccVar3);
                xdrVar3.getClass();
                xdrVar3.m(null, a4);
                nccVar.c = uccVar3 != null ? new Long(uccVar3.a) : new Long(0L);
                nccVar.d = uccVar3 != null ? uccVar3.b : q5b.a;
                Long l2 = new Long(uccVar3 != null ? uccVar3.a : 0L);
                Object obj4 = uccVar3 != null ? uccVar3.b : q5b.a;
                if (obj4 != null && System.currentTimeMillis() - l2.longValue() <= 86400000 && hashSet.equals(obj4)) {
                    i6 = 0;
                }
                if (i6 != 0) {
                }
                return Unit.a;
            case 2:
                cr crVar = (cr) this.q;
                Object obj5 = nm6.a;
                int i12 = this.l;
                if (i12 == 0) {
                    qgg.h0(obj);
                    bjt bjtVar = (bjt) this.p;
                    String str = (String) crVar.b;
                    f7u f7uVar = (f7u) crVar.c;
                    this.l = 1;
                    g = bjtVar.g(str, f7uVar, this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            crVar = (cr) this.o;
                            oqiVar2 = (oqi) this.n;
                            obj5 = (x7u) this.m;
                            try {
                                qgg.h0(obj);
                                crVar.h = sgn.b;
                                oqiVar2.b(null);
                                return obj5;
                            } catch (Throwable th3) {
                                th = th3;
                                oqiVar2.b(null);
                                throw th;
                            }
                        }
                        i = this.k;
                        crVar = (cr) this.o;
                        oqiVar = (oqi) this.n;
                        x7uVar = (x7u) this.m;
                        qgg.h0(obj);
                        try {
                            if (((sgn) crVar.h) != sgn.c) {
                                oqiVar.b(null);
                                return x7uVar;
                            }
                            f7u j = ((f7u) crVar.c).j(x7uVar);
                            xdr xdrVar4 = (xdr) crVar.d;
                            pgn pgnVar = new pgn((String) crVar.b, j, (c0t) crVar.e, a3l.a);
                            this.m = x7uVar;
                            this.n = oqiVar;
                            this.o = crVar;
                            this.k = i;
                            this.l = 3;
                            xdrVar4.l(pgnVar);
                            if (Unit.a != obj5) {
                                oqiVar2 = oqiVar;
                                obj5 = x7uVar;
                                crVar.h = sgn.b;
                                oqiVar2.b(null);
                            }
                            return obj5;
                        } catch (Throwable th4) {
                            th = th4;
                            oqiVar2 = oqiVar;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                rj6 rj6Var = (rj6) g;
                if (!(rj6Var instanceof qj6)) {
                    if (rj6Var instanceof pj6) {
                        throw ((pj6) rj6Var).a();
                    }
                    b6e.s();
                    return null;
                }
                x7u x7uVar2 = (x7u) ((qj6) rj6Var).a;
                if (((sgn) crVar.h) == sgn.c) {
                    return x7uVar2;
                }
                qqi qqiVar = (qqi) crVar.g;
                this.m = x7uVar2;
                this.n = qqiVar;
                this.o = crVar;
                this.k = 0;
                this.l = 2;
                if (qqiVar.a(this) != obj5) {
                    x7uVar = x7uVar2;
                    oqiVar = qqiVar;
                    i = 0;
                    if (((sgn) crVar.h) != sgn.c) {
                    }
                }
                return obj5;
            case 3:
                nm6 nm6Var3 = nm6.a;
                int i13 = this.l;
                if (i13 == 0) {
                    qgg.h0(obj);
                    th = null;
                    i2 = 0;
                    if (!((Boolean) ((jyg) ((aqi) this.q).getValue()).e.getValue()).booleanValue()) {
                    }
                    if (!((Boolean) ((jyg) ((aqi) this.q).getValue()).d.getValue()).booleanValue()) {
                        jygVar = (jyg) ((aqi) this.q).getValue();
                        synchronized (jygVar) {
                        }
                    }
                    return Unit.a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i14 = this.k;
                    Throwable th5 = (Throwable) this.m;
                    try {
                        qgg.h0(obj);
                        th2 = th5;
                        x = obj;
                    } catch (Throwable th6) {
                        th = th6;
                        i3 = i14;
                        th = th;
                        i2 = i3 + 1;
                        if (!((Boolean) ((jyg) ((aqi) this.q).getValue()).e.getValue()).booleanValue()) {
                        }
                        if (!((Boolean) ((jyg) ((aqi) this.q).getValue()).d.getValue()).booleanValue()) {
                        }
                        return Unit.a;
                    }
                    ayg aygVar = (ayg) x;
                    jyg jygVar2 = (jyg) ((aqi) this.q).getValue();
                    synchronized (jygVar2) {
                    }
                    aygVar.getClass();
                    if (!((Boolean) jygVar2.d.getValue()).booleanValue()) {
                        jygVar2.b.setValue(aygVar);
                        jygVar2.a.U(aygVar);
                    }
                    i2 = i14;
                    th = th2;
                    if (!((Boolean) ((jyg) ((aqi) this.q).getValue()).e.getValue()).booleanValue()) {
                        if (i2 != 0) {
                            kr3 kr3Var = (kr3) this.n;
                            Integer num = new Integer(i2);
                            th.getClass();
                            this.m = th;
                            this.k = i2;
                            this.l = 1;
                            kr3Var.invoke(num, th, this);
                            obj2 = Boolean.FALSE;
                            break;
                        }
                        i3 = i2;
                        th2 = th;
                        Context context = (Context) this.p;
                        oyg oygVar = (oyg) this.o;
                        String concat = StringsKt.U("fonts/") ? null : StringsKt.O("fonts/", '/') ? "fonts/" : "fonts/".concat("/");
                        String str2 = ".ttf";
                        if (!StringsKt.U(".ttf") && !kotlin.text.c.v(".ttf", ".", false)) {
                            str2 = ".".concat(".ttf");
                        }
                        String str3 = str2;
                        this.m = th2;
                        this.k = i3;
                        this.l = 2;
                        x = y1g.x(context, oygVar, null, concat, str3, "__LottieInternalDefaultCacheKey__", this);
                        if (x != nm6Var3) {
                            i14 = i3;
                            ayg aygVar2 = (ayg) x;
                            jyg jygVar22 = (jyg) ((aqi) this.q).getValue();
                            synchronized (jygVar22) {
                            }
                        }
                        return nm6Var3;
                    }
                    if (!((Boolean) ((jyg) ((aqi) this.q).getValue()).d.getValue()).booleanValue() && th != null) {
                        jygVar = (jyg) ((aqi) this.q).getValue();
                        synchronized (jygVar) {
                            if (!((Boolean) jygVar.d.getValue()).booleanValue()) {
                                jygVar.c.setValue(th);
                                jygVar.a.m0(th);
                            }
                        }
                    }
                    return Unit.a;
                }
                i2 = this.k;
                th = (Throwable) this.m;
                qgg.h0(obj);
                obj2 = obj;
                break;
            case 4:
                Object obj6 = nm6.a;
                int i15 = this.l;
                try {
                    try {
                        if (i15 == 0) {
                            qgg.h0(obj);
                            cks cksVar2 = (cks) this.p;
                            qqi qqiVar2 = cksVar2.c;
                            iArr = (int[]) this.q;
                            this.m = qqiVar2;
                            this.n = cksVar2;
                            this.o = iArr;
                            this.k = 0;
                            this.l = 1;
                            if (qqiVar2.a(this) != obj6) {
                                oqiVar3 = qqiVar2;
                                cksVar = cksVar2;
                                i4 = 0;
                            }
                            return obj6;
                        }
                        if (i15 != 1) {
                            if (i15 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileOutputStream = (FileOutputStream) this.o;
                            cksVar = (cks) this.n;
                            oqiVar4 = (oqi) this.m;
                            try {
                                qgg.h0(obj);
                                cksVar.b.finishWrite(fileOutputStream);
                            } catch (IOException e) {
                                e = e;
                                ssg.a(6, "TinyMlProgramStateStorage", "Failed to save data. Rolling back", e);
                                if (fileOutputStream != null) {
                                    cksVar.b.failWrite(fileOutputStream);
                                }
                                z = false;
                                obj6 = Boolean.valueOf(z);
                                oqiVar4.b(null);
                                return obj6;
                            } catch (SecurityException e2) {
                                e = e2;
                                ssg.a(6, "TinyMlProgramStateStorage", "Failed to save data. Rolling back", e);
                                if (fileOutputStream != null) {
                                    cksVar.b.failWrite(fileOutputStream);
                                }
                                z = false;
                                obj6 = Boolean.valueOf(z);
                                oqiVar4.b(null);
                                return obj6;
                            } catch (Exception e3) {
                                e = e3;
                                if (fileOutputStream != null) {
                                    cksVar.b.failWrite(fileOutputStream);
                                }
                                throw e;
                            }
                            obj6 = Boolean.valueOf(z);
                            oqiVar4.b(null);
                            return obj6;
                        }
                        i4 = this.k;
                        int[] iArr2 = (int[]) this.o;
                        cks cksVar3 = (cks) this.n;
                        oqiVar3 = (oqi) this.m;
                        qgg.h0(obj);
                        iArr = iArr2;
                        cksVar = cksVar3;
                        FileOutputStream startWrite = cksVar.b.startWrite();
                        FileChannel channel = startWrite.getChannel();
                        ByteBuffer allocate = ByteBuffer.allocate(iArr.length * 4);
                        allocate.order(ByteOrder.nativeOrder());
                        allocate.asIntBuffer().put(iArr);
                        xes xesVar = new xes(r82, allocate, channel);
                        this.m = oqiVar3;
                        this.n = cksVar;
                        this.o = startWrite;
                        this.k = i4;
                        this.l = 2;
                        if (sk3.S(g.a, xesVar, this) != obj6) {
                            oqiVar4 = oqiVar3;
                            fileOutputStream = startWrite;
                            cksVar.b.finishWrite(fileOutputStream);
                            obj6 = Boolean.valueOf(z);
                            oqiVar4.b(null);
                        }
                        return obj6;
                    } catch (Throwable th7) {
                        th = th7;
                        r8 = oqiVar3;
                        r8.b(null);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            default:
                c cVar = (c) this.q;
                nm6 nm6Var4 = nm6.a;
                int i16 = this.l;
                if (i16 == 0) {
                    qgg.h0(obj);
                    id = ((e) cVar.f.invoke()).getId();
                    p4 p4Var = new p4(null, null, "music");
                    MissionPlatformControllerApi missionPlatformControllerApi = cVar.b;
                    this.m = id;
                    this.l = 1;
                    a = missionPlatformControllerApi.a(p4Var, this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar6 = (oqi) this.n;
                            try {
                                qgg.h0(obj);
                                a2 = obj;
                                l lVar = (l) a2;
                                oqiVar6.b(null);
                                return lVar;
                            } catch (Throwable th9) {
                                th = th9;
                                oqiVar6.b(null);
                                throw th;
                            }
                        }
                        i7 = this.k;
                        cVar = (c) this.p;
                        oqiVar5 = (oqi) this.n;
                        b2 = this.o;
                        l = (Long) this.m;
                        qgg.h0(obj);
                        try {
                            this.m = null;
                            this.o = null;
                            this.n = oqiVar5;
                            this.p = null;
                            this.k = i7;
                            this.l = 3;
                            a2 = c.a(cVar, l, b2, this);
                            if (a2 != nm6Var4) {
                                oqiVar6 = oqiVar5;
                                l lVar2 = (l) a2;
                                oqiVar6.b(null);
                                return lVar2;
                            }
                            return nm6Var4;
                        } catch (Throwable th10) {
                            th = th10;
                            oqiVar6 = oqiVar5;
                            oqiVar6.b(null);
                            throw th;
                        }
                    }
                    id = (Long) this.m;
                    qgg.h0(obj);
                    a = obj;
                }
                l = id;
                b2 = c.b(cVar, (a) a);
                oqiVar5 = cVar.i;
                this.m = l;
                this.o = b2;
                this.n = oqiVar5;
                this.p = cVar;
                this.k = 0;
                this.l = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av7(Context context, int i, Object[] objArr, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.p = context;
        this.l = i;
        this.q = objArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av7(c cVar, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.q = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av7(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.p = obj;
        this.q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av7(HashSet hashSet, ncc nccVar, HashSet hashSet2, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.o = hashSet;
        this.p = nccVar;
        this.q = hashSet2;
    }
}
