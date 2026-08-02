package S0;

import B1.A;
import O.C0330e0;
import O.J;
import O.X;
import P2.InterfaceC0373c;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import b2.InterfaceC0515b;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2628Jm;
import com.google.android.gms.internal.ads.AbstractC2956b4;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import com.google.android.gms.internal.ads.AbstractC3043cl;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC2466Ad;
import com.google.android.gms.internal.ads.C2473Ak;
import com.google.android.gms.internal.ads.C2645Km;
import com.google.android.gms.internal.ads.C2665Lp;
import com.google.android.gms.internal.ads.C2793Ti;
import com.google.android.gms.internal.ads.C2828Vl;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C2996br;
import com.google.android.gms.internal.ads.C3035cd;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3267gu;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3477kq;
import com.google.android.gms.internal.ads.C3535lu;
import com.google.android.gms.internal.ads.C4104wN;
import com.google.android.gms.internal.ads.C4183xv;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.CallableC3549m7;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.DP;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.InterfaceC2708Oh;
import com.google.android.gms.internal.ads.InterfaceC2844Wl;
import com.google.android.gms.internal.ads.InterfaceC3521lg;
import com.google.android.gms.internal.ads.InterfaceC3575mg;
import com.google.android.gms.internal.ads.InterfaceC3742pl;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import com.google.android.gms.internal.ads.InterfaceC3868s3;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.OP;
import com.google.android.gms.internal.ads.PN;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.RunnableC3046co;
import com.google.android.gms.internal.ads.RunnableC3973u0;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.U3;
import com.google.android.gms.internal.ads.U4;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.V3;
import com.google.android.gms.internal.ads.VP;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.W3;
import com.google.android.gms.internal.ads.WP;
import com.google.android.gms.internal.ads.YG;
import com.google.android.gms.internal.ads.Z8;
import com.google.android.gms.internal.ads.ZG;
import com.icefishingapp.icefishing.GzopArcadegamesActivity;
import h.LayoutInflaterFactory2C4533A;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.AbstractC4615b;
import k.InterfaceC4614a;
import k2.C4631a;
import l2.InterfaceC4660d;
import o4.InterfaceC4799l;
import u0.C5059i;
import u2.z;
import v1.InterfaceC5104a;
import x2.AbstractC5187a;
import x2.InterfaceC5189c;

/* loaded from: classes.dex */
public final class e implements B1.o, InterfaceC0515b, InterfaceC3868s3, InterfaceC0373c, InterfaceC5189c, KD, InterfaceC3742pl, InterfaceC2708Oh, InterfaceC2844Wl, YG, VP, InterfaceC4799l, InterfaceC4614a {

    /* renamed from: w, reason: collision with root package name */
    public static e f2779w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2780n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2781u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2782v;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f2780n = i;
        this.f2781u = obj;
        this.f2782v = obj2;
    }

    public static final C4104wN r(C4104wN c4104wN, List list) {
        HashMap hashMap = new HashMap(c4104wN.f34831a);
        HashSet hashSet = new HashSet(list);
        for (String str : c4104wN.f34831a.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new C4104wN(hashMap);
    }

    public v2.k A() {
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Of)).booleanValue();
        v2.k kVar = v2.k.f41418n;
        if (!booleanValue) {
            y();
            return kVar;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f2781u;
        C3315ho c3315ho = ((C3153eo) this.f2782v).f29975a;
        c3315ho.getClass();
        if (concurrentHashMap.isEmpty()) {
            int i = z.f41322b;
            v2.i.a("Empty paramMap.");
            return kVar;
        }
        String a9 = c3315ho.f30945f.a(concurrentHashMap);
        z.k(a9);
        return c3315ho.f30943d.a(null, a9);
    }

    public void B() {
        ((C3153eo) this.f2782v).f29976b.execute(new RunnableC3046co(this, 0));
    }

    public void C(C3035cd c3035cd) {
        Handler handler = (Handler) this.f2781u;
        if (handler != null) {
            handler.post(new RunnableC3973u0(0, this, c3035cd));
        }
    }

    public void D(String str) {
        if (((SharedPreferences) this.f2782v).edit().remove(str).commit()) {
            return;
        }
        int length = str.length();
        String str2 = (String) this.f2781u;
        throw new IOException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(length + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        ((GzopArcadegamesActivity) this.f2782v).startActivity((Intent) this.f2781u);
    }

    @Override // com.google.android.gms.internal.ads.VP
    public int a(Object obj) {
        OP op = (OP) obj;
        HashMap hashMap = WP.f28354a;
        op.getClass();
        DP dp = (DP) this.f2782v;
        String str = dp.f24431o;
        String str2 = op.f26605b;
        return ((str2.equals(str) || str2.equals(WP.d(dp))) && op.f((Context) this.f2781u, dp, false) && op.g(dp)) ? 1 : 0;
    }

    @Override // k.InterfaceC4614a
    public boolean b(AbstractC4615b abstractC4615b, MenuItem menuItem) {
        return ((InterfaceC4614a) this.f2781u).b(abstractC4615b, menuItem);
    }

    @Override // k.InterfaceC4614a
    public boolean c(AbstractC4615b abstractC4615b, l.m mVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C4533A) this.f2782v).f37785T;
        WeakHashMap weakHashMap = X.f2054a;
        J.c(viewGroup);
        return ((InterfaceC4614a) this.f2781u).c(abstractC4615b, mVar);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public byte[] d(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((ZG) this.f2781u).d(i, bArr) : ((C2991bm) this.f2782v).d(i, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        try {
            C3535lu c3535lu = (C3535lu) ((C3477kq) this.f2781u).f31639b;
            c3535lu.b(z3);
            try {
                c3535lu.f31864a.D2(new W2.b(context));
            } catch (Throwable th) {
                throw new C3267gu(th);
            }
        } catch (C3267gu e9) {
            throw new C2828Vl(e9.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f2782v;
    }

    @Override // k.InterfaceC4614a
    public boolean g(AbstractC4615b abstractC4615b, l.m mVar) {
        return ((InterfaceC4614a) this.f2781u).g(abstractC4615b, mVar);
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new a2.f((Context) ((G3.e) this.f2781u).f1072n, (a2.d) ((a2.e) this.f2782v).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0125, code lost:
    
        if (")".equals(com.google.android.gms.internal.ads.U3.b(r7, r8)) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0403  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(byte[] bArr, int i, int i6, X1.b bVar) {
        W3 w32;
        String str;
        String sb;
        int i9;
        char c9;
        e eVar = this;
        int i10 = -1;
        int i11 = 1;
        Cr cr = (Cr) eVar.f2781u;
        cr.z(i + i6, bArr);
        cr.E(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = cr.f24253b;
            Charset charset = StandardCharsets.UTF_8;
            String n9 = cr.n(charset);
            String str2 = null;
            if (n9 == null || !n9.startsWith("WEBVTT")) {
                cr.E(i12);
                throw U4.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(cr.n(charset))));
            }
            while (!TextUtils.isEmpty(cr.n(StandardCharsets.UTF_8))) {
                eVar = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z3 = 0;
                int i13 = i10;
                int i14 = 0;
                while (i13 == i10) {
                    i14 = cr.f24253b;
                    String n10 = cr.n(StandardCharsets.UTF_8);
                    i13 = n10 == null ? 0 : "STYLE".equals(n10) ? 2 : n10.startsWith("NOTE") ? i11 : 3;
                }
                cr.E(i14);
                if (i13 == 0) {
                    MA.h(new C4274ze(arrayList2), bVar);
                    return;
                }
                if (i13 == i11) {
                    while (!TextUtils.isEmpty(cr.n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (i13 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        cr.n(StandardCharsets.UTF_8);
                        U3 u3 = (U3) eVar.f2782v;
                        StringBuilder sb2 = u3.f27884b;
                        sb2.setLength(0);
                        int i15 = cr.f24253b;
                        while (!TextUtils.isEmpty(cr.n(StandardCharsets.UTF_8))) {
                        }
                        byte[] bArr2 = cr.f24252a;
                        int i16 = cr.f24253b;
                        Cr cr2 = u3.f27883a;
                        cr2.z(i16, bArr2);
                        cr2.E(i15);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            U3.a(cr2);
                            if (cr2.B() >= 5 && "::cue".equals(cr2.k(5, StandardCharsets.UTF_8))) {
                                int i17 = cr2.f24253b;
                                String b9 = U3.b(cr2, sb2);
                                if (b9 != null) {
                                    if ("{".equals(b9)) {
                                        cr2.E(i17);
                                        str = "";
                                    } else if ("(".equals(b9)) {
                                        int i18 = cr2.f24253b;
                                        int i19 = cr2.f24254c;
                                        int i20 = z3 ? 1 : 0;
                                        while (i18 < i19 && i20 == 0) {
                                            int i21 = i18 + 1;
                                            i20 = ((char) cr2.f24252a[i18]) == ')' ? i11 : z3 ? 1 : 0;
                                            i18 = i21;
                                        }
                                        str = cr2.k((i18 + i10) - cr2.f24253b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        str = str2;
                                    }
                                    if (str == null || !"{".equals(U3.b(cr2, sb2))) {
                                        break;
                                    }
                                    V3 v32 = new V3();
                                    v32.f28079a = "";
                                    v32.f28080b = "";
                                    v32.f28081c = Collections.EMPTY_SET;
                                    v32.f28082d = "";
                                    v32.f28083e = str2;
                                    v32.f28085g = z3;
                                    v32.i = z3;
                                    v32.f28087j = i10;
                                    v32.f28088k = i10;
                                    v32.f28089l = i10;
                                    v32.f28090m = i10;
                                    v32.f28092o = i10;
                                    v32.f28093p = z3;
                                    if (!str.isEmpty()) {
                                        int indexOf = str.indexOf(91);
                                        if (indexOf != i10) {
                                            Matcher matcher = U3.f27881c.matcher(str.substring(indexOf));
                                            if (matcher.matches()) {
                                                String group = matcher.group(i11);
                                                group.getClass();
                                                v32.f28082d = group;
                                            }
                                            str = str.substring(z3 ? 1 : 0, indexOf);
                                        }
                                        String str3 = AbstractC3159eu.f29993a;
                                        String[] split = str.split("\\.", i10);
                                        String str4 = split[z3 ? 1 : 0];
                                        int indexOf2 = str4.indexOf(35);
                                        if (indexOf2 != i10) {
                                            v32.f28080b = str4.substring(z3 ? 1 : 0, indexOf2);
                                            v32.f28079a = str4.substring(indexOf2 + i11);
                                        } else {
                                            v32.f28080b = str4;
                                        }
                                        int length = split.length;
                                        if (length > i11) {
                                            v32.f28081c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i11, length)));
                                        }
                                    }
                                    int i22 = z3 ? 1 : 0;
                                    String str5 = str2;
                                    int i23 = z3;
                                    while (i22 == 0) {
                                        int i24 = cr2.f24253b;
                                        str5 = U3.b(cr2, sb2);
                                        int i25 = (str5 == null || "}".equals(str5)) ? i11 : i23;
                                        if (i25 == 0) {
                                            cr2.E(i24);
                                            U3.a(cr2);
                                            String c10 = U3.c(cr2, sb2);
                                            if (!c10.isEmpty() && ":".equals(U3.b(cr2, sb2))) {
                                                U3.a(cr2);
                                                StringBuilder sb3 = new StringBuilder();
                                                boolean z6 = false;
                                                while (true) {
                                                    if (z6) {
                                                        sb = sb3.toString();
                                                        break;
                                                    }
                                                    int i26 = cr2.f24253b;
                                                    String b10 = U3.b(cr2, sb2);
                                                    if (b10 == null) {
                                                        sb = null;
                                                        break;
                                                    } else if ("}".equals(b10) || ";".equals(b10)) {
                                                        cr2.E(i26);
                                                        z6 = true;
                                                    } else {
                                                        sb3.append(b10);
                                                    }
                                                }
                                                if (sb != null && !sb.isEmpty()) {
                                                    int i27 = cr2.f24253b;
                                                    String b11 = U3.b(cr2, sb2);
                                                    if (!";".equals(b11)) {
                                                        if ("}".equals(b11)) {
                                                            cr2.E(i27);
                                                        }
                                                    }
                                                    if (com.anythink.expressad.foundation.h.k.f19633d.equals(c10)) {
                                                        i9 = 1;
                                                        v32.f28084f = AbstractC2628Jm.a(sb, true);
                                                        v32.f28085g = true;
                                                    } else {
                                                        i9 = 1;
                                                        if ("background-color".equals(c10)) {
                                                            v32.f28086h = AbstractC2628Jm.a(sb, true);
                                                            v32.i = true;
                                                        } else if ("ruby-position".equals(c10)) {
                                                            if ("over".equals(sb)) {
                                                                v32.f28092o = 1;
                                                            } else if ("under".equals(sb)) {
                                                                v32.f28092o = 2;
                                                            }
                                                        } else if ("text-combine-upright".equals(c10)) {
                                                            v32.f28093p = "all".equals(sb) || sb.startsWith("digits");
                                                        } else if ("text-decoration".equals(c10)) {
                                                            if ("underline".equals(sb)) {
                                                                v32.f28087j = 1;
                                                            }
                                                        } else if ("font-family".equals(c10)) {
                                                            v32.f28083e = AbstractC3043cl.f(sb);
                                                        } else {
                                                            if (!"font-weight".equals(c10)) {
                                                                i9 = 1;
                                                                if ("font-style".equals(c10)) {
                                                                    if ("italic".equals(sb)) {
                                                                        v32.f28089l = 1;
                                                                    }
                                                                } else if ("font-size".equals(c10)) {
                                                                    Matcher matcher2 = U3.f27882d.matcher(AbstractC3043cl.f(sb));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        int hashCode = group2.hashCode();
                                                                        if (hashCode == 37) {
                                                                            if (group2.equals("%")) {
                                                                                c9 = 2;
                                                                                if (c9 == 0) {
                                                                                }
                                                                                String group3 = matcher2.group(i11);
                                                                                group3.getClass();
                                                                                v32.f28091n = Float.parseFloat(group3);
                                                                            }
                                                                            c9 = 65535;
                                                                            if (c9 == 0) {
                                                                            }
                                                                            String group32 = matcher2.group(i11);
                                                                            group32.getClass();
                                                                            v32.f28091n = Float.parseFloat(group32);
                                                                        } else if (hashCode != 3240) {
                                                                            if (hashCode == 3592 && group2.equals("px")) {
                                                                                c9 = 0;
                                                                                if (c9 == 0) {
                                                                                    i11 = 1;
                                                                                    if (c9 == 1) {
                                                                                        v32.f28090m = 2;
                                                                                    } else {
                                                                                        if (c9 != 2) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        v32.f28090m = 3;
                                                                                    }
                                                                                } else {
                                                                                    i11 = 1;
                                                                                    v32.f28090m = 1;
                                                                                }
                                                                                String group322 = matcher2.group(i11);
                                                                                group322.getClass();
                                                                                v32.f28091n = Float.parseFloat(group322);
                                                                            }
                                                                            c9 = 65535;
                                                                            if (c9 == 0) {
                                                                            }
                                                                            String group3222 = matcher2.group(i11);
                                                                            group3222.getClass();
                                                                            v32.f28091n = Float.parseFloat(group3222);
                                                                        } else {
                                                                            if (group2.equals("em")) {
                                                                                c9 = 1;
                                                                                if (c9 == 0) {
                                                                                }
                                                                                String group32222 = matcher2.group(i11);
                                                                                group32222.getClass();
                                                                                v32.f28091n = Float.parseFloat(group32222);
                                                                            }
                                                                            c9 = 65535;
                                                                            if (c9 == 0) {
                                                                            }
                                                                            String group322222 = matcher2.group(i11);
                                                                            group322222.getClass();
                                                                            v32.f28091n = Float.parseFloat(group322222);
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                                                        sb4.append("Invalid font-size: '");
                                                                        sb4.append(sb);
                                                                        sb4.append("'.");
                                                                        AbstractC2968bG.y("WebvttCssParser", sb4.toString());
                                                                    }
                                                                }
                                                            } else if ("bold".equals(sb)) {
                                                                i9 = 1;
                                                                v32.f28088k = 1;
                                                            }
                                                            i22 = i25;
                                                            i23 = 0;
                                                        }
                                                    }
                                                    i11 = i9;
                                                }
                                                i11 = 1;
                                                i22 = i25;
                                                i23 = 0;
                                            }
                                        }
                                        i22 = i25;
                                        i23 = 0;
                                    }
                                    if ("}".equals(str5)) {
                                        arrayList3.add(v32);
                                    }
                                    i10 = -1;
                                    z3 = 0;
                                    str2 = null;
                                }
                            }
                            str = str2;
                            if (str == null) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    Pattern pattern = AbstractC2956b4.f29205a;
                    Charset charset2 = StandardCharsets.UTF_8;
                    String n11 = cr.n(charset2);
                    if (n11 != null) {
                        Pattern pattern2 = AbstractC2956b4.f29205a;
                        Matcher matcher3 = pattern2.matcher(n11);
                        if (matcher3.matches()) {
                            w32 = AbstractC2956b4.b(null, matcher3, cr, arrayList);
                        } else {
                            String n12 = cr.n(charset2);
                            if (n12 != null) {
                                Matcher matcher4 = pattern2.matcher(n12);
                                if (matcher4.matches()) {
                                    w32 = AbstractC2956b4.b(n11.trim(), matcher4, cr, arrayList);
                                }
                            }
                        }
                        if (w32 != null) {
                            arrayList2.add(w32);
                        }
                    }
                    w32 = null;
                    if (w32 != null) {
                    }
                    eVar = this;
                    i10 = -1;
                    str2 = null;
                }
            }
        } catch (U4 e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h.l, java.lang.Object] */
    @Override // k.InterfaceC4614a
    public void i(AbstractC4615b abstractC4615b) {
        ((InterfaceC4614a) this.f2781u).i(abstractC4615b);
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) this.f2782v;
        if (layoutInflaterFactory2C4533A.f37781P != null) {
            layoutInflaterFactory2C4533A.f37762E.getDecorView().removeCallbacks(layoutInflaterFactory2C4533A.f37782Q);
        }
        if (layoutInflaterFactory2C4533A.f37780O != null) {
            C0330e0 c0330e0 = layoutInflaterFactory2C4533A.f37783R;
            if (c0330e0 != null) {
                c0330e0.b();
            }
            C0330e0 a9 = X.a(layoutInflaterFactory2C4533A.f37780O);
            a9.a(0.0f);
            layoutInflaterFactory2C4533A.f37783R = a9;
            a9.d(new h.s(2, this));
        }
        layoutInflaterFactory2C4533A.f37766G.onSupportActionModeFinished(layoutInflaterFactory2C4533A.f37779N);
        layoutInflaterFactory2C4533A.f37779N = null;
        ViewGroup viewGroup = layoutInflaterFactory2C4533A.f37785T;
        WeakHashMap weakHashMap = X.f2054a;
        J.c(viewGroup);
        layoutInflaterFactory2C4533A.K();
    }

    public Long j(String str) {
        C5059i a9 = C5059i.a(1, "SELECT long_value FROM Preference where `key`=?");
        a9.c(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2781u;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            Long l9 = null;
            if (m4.moveToFirst() && !m4.isNull(0)) {
                l9 = Long.valueOf(m4.getLong(0));
            }
            return l9;
        } finally {
            m4.close();
            a9.j();
        }
    }

    public void k(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2781u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2782v).q(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void l(L.f fVar) {
        int i = fVar.f1593b;
        Handler handler = (Handler) this.f2782v;
        I0.j jVar = (I0.j) this.f2781u;
        if (i != 0) {
            handler.post(new L.a(jVar, i, 0));
        } else {
            handler.post(new LD(10, jVar, fVar.f1592a));
        }
    }

    public void m(Eu eu) {
        CallableC3549m7 callableC3549m7 = new CallableC3549m7(5, (C2665Lp) this.f2781u);
        C3360ig c3360ig = (C3360ig) ((RD) this.f2782v);
        N3.a b9 = c3360ig.b(callableC3549m7);
        b9.a(new LD(0, b9, new Ux(this, eu)), c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f2780n) {
            case 12:
                ((InterfaceC3575mg) this.f2781u).mo7a(obj);
                break;
            case 13:
                String str = (String) obj;
                C2793Ti c2793Ti = (C2793Ti) this.f2782v;
                List a9 = c2793Ti.a();
                X2.b bVar = c2793Ti.f27776L;
                c2793Ti.f27766A.a(c2793Ti.f27783z.b(c2793Ti.f27781x, c2793Ti.f27782y, false, (String) this.f2781u, str, a9, c2793Ti.f27773H, bVar), c2793Ti.f27772G);
                break;
        }
    }

    @Override // B1.o
    public void o() {
        A a9 = (A) this.f2781u;
        synchronized (a9) {
            a9.f99v = a9.f97n.length;
        }
    }

    @Override // P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
        synchronized (((com.bumptech.glide.manager.p) this.f2782v).f23471w) {
            ((Z8) this.f2781u).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // B1.o
    public void p(Bitmap bitmap, InterfaceC5104a interfaceC5104a) {
        IOException iOException = ((N1.e) this.f2782v).f1914u;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC5104a.d(bitmap);
            throw iOException;
        }
    }

    public /* synthetic */ void q(C4104wN c4104wN) {
        for (Map.Entry entry : new HashMap((HashMap) this.f2781u).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!r(c4104wN, list).equals(r((C4104wN) this.f2782v, list))) {
                throw null;
            }
        }
        this.f2782v = c4104wN;
    }

    public void s(St st) {
        v("aai", st.f27648w);
        v("request_id", st.f27631n0);
        v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, St.a(st.f27608b));
    }

    public void t(Object obj, String str) {
        boolean commit;
        boolean z3 = obj instanceof String;
        String str2 = (String) this.f2781u;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2782v;
        if (z3) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String valueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", com.anythink.basead.exoplayer.f.f.o(new StringBuilder(valueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", valueOf, " for app ", str2));
                throw new IOException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            commit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        throw new IOException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public void v(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f2781u).put(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f2780n) {
            case 12:
                ((InterfaceC3521lg) this.f2782v).mo0c();
                break;
            case 13:
                C2793Ti c2793Ti = (C2793Ti) this.f2782v;
                C4183xv c4183xv = c2793Ti.f27783z;
                List a9 = c2793Ti.a();
                X2.b bVar = c2793Ti.f27776L;
                c2793Ti.f27766A.a(c4183xv.b(c2793Ti.f27781x, c2793Ti.f27782y, false, (String) this.f2781u, null, a9, c2793Ti.f27773H, bVar), null);
                break;
            default:
                Su su = (Su) this.f2782v;
                su.d(th);
                su.a(false);
                ((Vu) this.f2781u).a(su);
                break;
        }
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        switch (this.f2780n) {
            case 10:
                try {
                    String canonicalName = ((AbstractC5187a) this.f2782v).getClass().getCanonicalName();
                    int i = c4631a.f38568a;
                    String str = c4631a.f38569b;
                    String str2 = c4631a.f38570c;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to load mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    v2.i.a(sb.toString());
                    InterfaceC3841rd interfaceC3841rd = (InterfaceC3841rd) this.f2781u;
                    interfaceC3841rd.n3(c4631a.a());
                    interfaceC3841rd.O3(i, str);
                    interfaceC3841rd.j0(i);
                    break;
                } catch (RemoteException e9) {
                    v2.i.d("", e9);
                    return;
                }
            default:
                try {
                    String canonicalName2 = ((BinderC2466Ad) this.f2782v).f23682n.getClass().getCanonicalName();
                    int i6 = c4631a.f38568a;
                    String str3 = c4631a.f38569b;
                    String str4 = c4631a.f38570c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i6).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i6);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    v2.i.a(sb2.toString());
                    InterfaceC3841rd interfaceC3841rd2 = (InterfaceC3841rd) this.f2781u;
                    interfaceC3841rd2.n3(c4631a.a());
                    interfaceC3841rd2.O3(i6, str3);
                    interfaceC3841rd2.j0(i6);
                    break;
                } catch (RemoteException e10) {
                    v2.i.d("", e10);
                }
        }
    }

    public void y() {
        ((C3153eo) this.f2782v).f29976b.execute(new RunnableC3046co(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public /* synthetic */ void z(String str, int i, String str2, boolean z3) {
        C2645Km c2645Km = (C2645Km) this.f2781u;
        c2645Km.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) ((Map) this.f2782v).get("id"));
        c2645Km.f25967b.d(hashMap);
    }

    public /* synthetic */ e(int i, boolean z3) {
        this.f2780n = i;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i, boolean z3) {
        this.f2780n = i;
        this.f2781u = obj2;
        this.f2782v = obj;
    }

    public e(E2.a aVar, InterfaceC3575mg interfaceC3575mg, InterfaceC3521lg interfaceC3521lg) {
        this.f2780n = 12;
        this.f2781u = interfaceC3575mg;
        this.f2782v = interfaceC3521lg;
        Objects.requireNonNull(aVar);
    }

    public e(Context context) {
        this.f2780n = 21;
        this.f2781u = context.getPackageName();
        this.f2782v = context.getSharedPreferences("paid_storage_sp", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a, reason: collision with other method in class */
    public /* synthetic */ void mo1a(Object obj) {
        ((InterfaceC4660d) obj).f((String) this.f2781u, (String) this.f2782v);
    }

    public e(Handler handler, HN hn) {
        this.f2780n = 7;
        if (hn != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f2781u = handler;
        this.f2782v = hn;
    }

    public e(BinderC2466Ad binderC2466Ad, InterfaceC3841rd interfaceC3841rd) {
        this.f2780n = 11;
        this.f2781u = interfaceC3841rd;
        Objects.requireNonNull(binderC2466Ad);
        this.f2782v = binderC2466Ad;
    }

    public e(BinderC2466Ad binderC2466Ad, InterfaceC3841rd interfaceC3841rd, AbstractC5187a abstractC5187a) {
        this.f2780n = 10;
        this.f2781u = interfaceC3841rd;
        this.f2782v = abstractC5187a;
        Objects.requireNonNull(binderC2466Ad);
    }

    public e(C2793Ti c2793Ti, String str) {
        this.f2780n = 13;
        this.f2781u = str;
        Objects.requireNonNull(c2793Ti);
        this.f2782v = c2793Ti;
    }

    public e(C3153eo c3153eo) {
        this.f2780n = 16;
        Objects.requireNonNull(c3153eo);
        this.f2782v = c3153eo;
        this.f2781u = new ConcurrentHashMap();
    }

    public e(C2996br c2996br, C3477kq c3477kq, St st) {
        this.f2780n = 18;
        this.f2781u = c3477kq;
        this.f2782v = st;
        Objects.requireNonNull(c2996br);
    }

    public /* synthetic */ e(PN pn) {
        this.f2780n = 24;
        Objects.requireNonNull(pn);
        this.f2781u = new HashMap();
        this.f2782v = C4104wN.f34830b;
    }

    public e(int i) {
        this.f2780n = i;
        switch (i) {
            case 8:
                this.f2781u = new Cr();
                this.f2782v = new U3();
                break;
            default:
                this.f2781u = new AtomicReference();
                this.f2782v = new s.b();
                break;
        }
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f2780n = 0;
        this.f2781u = workDatabase_Impl;
        this.f2782v = new b(workDatabase_Impl, 1);
    }

    public e(EditText editText) {
        this.f2780n = 6;
        this.f2781u = editText;
        c0.i iVar = new c0.i(editText);
        this.f2782v = iVar;
        editText.addTextChangedListener(iVar);
        if (c0.a.f5475b == null) {
            synchronized (c0.a.f5474a) {
                try {
                    if (c0.a.f5475b == null) {
                        c0.a aVar = new c0.a();
                        try {
                            c0.a.f5476c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c0.a.f5475b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c0.a.f5475b);
    }

    private final void u(Object obj) {
    }
}
