package defpackage;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.yandex.plus2.sdk.widget.daily.internal.entry.DailyAppWidgetProvider;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlinx.coroutines.a;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class n87 extends a87 {
    public static final /* synthetic */ int p = 0;
    public final jme c;
    public final tf6 d;
    public final cr e;
    public final ime f;
    public final iz7 g;
    public final syb h;
    public final ju0 i;
    public final jkl j;
    public final knn k;
    public final AppWidgetManager l;
    public final ComponentName m;
    public final String n;
    public final xdr o;

    public n87(jme jmeVar) {
        String str;
        this.c = jmeVar;
        i5f r = quj.r(x3f.d, new rn6(14));
        tjl tjlVar = new tjl();
        ujl ujlVar = new ujl();
        Application application = jmeVar.a;
        String packageName = application.getPackageName();
        packageName.getClass();
        y3e y3eVar = new y3e(packageName, weo.u(application));
        wqr n = a4g.n();
        y4h y4hVar = jmeVar.b;
        tf6 e = gld.e(e.c(n, ((bsd) y4hVar).g));
        this.d = e;
        File file = new File(application.getCacheDir(), "com/yandex/plus2/sdk/widget/daily");
        File file2 = new File(file, "analytic");
        File file3 = new File(file, "daily");
        File file4 = new File(file, "exp");
        String packageName2 = application.getPackageName();
        packageName2.getClass();
        this.e = new cr(packageName2, weo.u(application), file2, jmeVar.k, r, e, jmeVar.c);
        a aVar = jmeVar.c;
        aVar.getClass();
        this.f = new ime(jmeVar.n, e, aVar);
        String packageName3 = application.getPackageName();
        packageName3.getClass();
        new y9w(26);
        z0i z0iVar = jmeVar.i;
        b5m b5mVar = jmeVar.j;
        a aVar2 = jmeVar.d;
        packageName3.getClass();
        aVar2.getClass();
        iz7 iz7Var = new iz7();
        iz7Var.a = packageName3;
        iz7Var.b = tjlVar;
        iz7Var.c = ujlVar;
        iz7Var.d = y3eVar;
        iz7Var.e = r;
        iz7Var.f = z0iVar;
        iz7Var.g = b5mVar;
        iz7Var.h = e;
        iz7Var.i = aVar2;
        iz7Var.j = new e0h(10);
        iz7Var.k = rqi.a();
        iz7Var.l = new t1f(1);
        this.g = iz7Var;
        String packageName4 = application.getPackageName();
        packageName4.getClass();
        String u = weo.u(application);
        int a = b87.a();
        int b = b87.b(a);
        int c = b87.c(a);
        Integer num = Build.VERSION.SDK_INT >= 31 ? SdkExtensions.getAllExtensionVersions().get(Integer.valueOf(a)) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append('.');
        sb.append(c);
        if (num != null) {
            str = "-ext" + num.intValue();
        } else {
            str = null;
        }
        sb.append(str == null ? "" : str);
        String sb2 = sb.toString();
        ctd ctdVar = ctd.b;
        msa msaVar = nsa.b;
        int i = 21;
        Continuation continuation = null;
        this.h = new syb(packageName4, u, sb2, file4, ctdVar, yd5.M(12, ssa.HOURS), tjlVar, ujlVar, y3eVar, new mvn(i), new i9w(), r, z0iVar, b5mVar, e, jmeVar.d);
        this.i = new ju0(file3, ctdVar, tjlVar, ujlVar, y3eVar, new b3i(i), new ehv(26), r, z0iVar, b5mVar, e, jmeVar.d);
        this.j = new jkl();
        int i2 = 1;
        this.k = new knn(1, application);
        this.l = AppWidgetManager.getInstance(application);
        this.m = new ComponentName(application, (Class<?>) DailyAppWidgetProvider.class);
        Configuration configuration = application.getResources().getConfiguration();
        configuration.getClass();
        int i3 = 0;
        Locale b2 = dqg.d(configuration.getLocales()).b(0);
        if (b2 == null) {
            b2 = Locale.getDefault();
            b2.getClass();
        }
        this.n = b2.getLanguage();
        this.o = ydr.a(null);
        ub7 P = zsd.P(zsd.b0(new j87(jmeVar.e, i3)), zsd.b0(new j87(jmeVar.f, i2)), zsd.b0(jmeVar.g), zsd.b0(new cz(jmeVar.h, application.getPackageName(), 29)), f87.a);
        x97.y(e, ((bsd) y4hVar).g, null, new d87(P, this, continuation, i3), 2);
        x97.y(e, aVar, null, new d87(P, this, continuation, i2), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0193 A[Catch: all -> 0x030d, CancellationException -> 0x0316, TryCatch #2 {CancellationException -> 0x0316, all -> 0x030d, blocks: (B:15:0x005e, B:17:0x02b8, B:18:0x02e1, B:20:0x0193, B:22:0x019d, B:24:0x01c4, B:30:0x0253, B:35:0x02f0, B:36:0x02f7, B:37:0x02f8, B:42:0x00b6, B:45:0x00f2, B:47:0x017c, B:49:0x0107, B:51:0x015a, B:54:0x0161, B:61:0x011d, B:63:0x0121, B:65:0x0129, B:67:0x012c, B:70:0x02fd, B:71:0x0304, B:72:0x0305, B:73:0x030c), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f8 A[Catch: all -> 0x030d, CancellationException -> 0x0316, TryCatch #2 {CancellationException -> 0x0316, all -> 0x030d, blocks: (B:15:0x005e, B:17:0x02b8, B:18:0x02e1, B:20:0x0193, B:22:0x019d, B:24:0x01c4, B:30:0x0253, B:35:0x02f0, B:36:0x02f7, B:37:0x02f8, B:42:0x00b6, B:45:0x00f2, B:47:0x017c, B:49:0x0107, B:51:0x015a, B:54:0x0161, B:61:0x011d, B:63:0x0121, B:65:0x0129, B:67:0x012c, B:70:0x02fd, B:71:0x0304, B:72:0x0305, B:73:0x030c), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x02ae -> B:17:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x02ce -> B:18:0x02e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n87 n87Var, boolean z, e87 e87Var, cg6 cg6Var) {
        m87 m87Var;
        nm6 nm6Var;
        int i;
        boolean z2;
        x6a x6aVar;
        int[] iArr;
        Object obj;
        int i2;
        int i3;
        Object b;
        e87 e87Var2;
        int i4;
        boolean z3;
        x6a x6aVar2;
        m87 m87Var2;
        int length;
        e87 e87Var3;
        boolean z4;
        int i5;
        int[] iArr2;
        int i6;
        int i7;
        int i8;
        ime imeVar;
        int i9;
        nm6 nm6Var2;
        AppWidgetManager appWidgetManager;
        Application application;
        int i10;
        int i11;
        int i12;
        Number number;
        n87 n87Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        x6a x6aVar3;
        rft j;
        z77 z77Var;
        String str;
        ime imeVar2;
        nm6 nm6Var3;
        e87 e87Var4 = e87Var;
        ime imeVar3 = n87Var.f;
        Application application2 = n87Var.c.a;
        AppWidgetManager appWidgetManager2 = n87Var.l;
        try {
            if (cg6Var instanceof m87) {
                m87Var = (m87) cg6Var;
                int i17 = m87Var.C;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    m87Var.C = i17 - Integer.MIN_VALUE;
                    m87 m87Var3 = m87Var;
                    Object obj2 = m87Var3.A;
                    nm6Var = nm6.a;
                    i = m87Var3.C;
                    if (i != 0) {
                        qgg.h0(obj2);
                        r7o r7oVar = z7o.b;
                        if (appWidgetManager2 == null) {
                            throw new IllegalStateException("appWidgetManager is null");
                        }
                        int[] appWidgetIds = appWidgetManager2.getAppWidgetIds(n87Var.m);
                        if (appWidgetIds == null || appWidgetIds.length == 0) {
                            throw new IllegalStateException("appWidgetIds are empty");
                        }
                        syb sybVar = n87Var.h;
                        String str2 = e87Var4.d;
                        String str3 = e87Var4.c;
                        z77 z77Var2 = e87Var4.b;
                        String str4 = n87Var.n;
                        str4.getClass();
                        m87Var3.l = e87Var4;
                        m87Var3.m = appWidgetIds;
                        z2 = z;
                        m87Var3.j = z2;
                        m87Var3.q = 0;
                        m87Var3.r = 0;
                        m87Var3.C = 1;
                        x6aVar = null;
                        Object d = sybVar.d(str2, str3, z77Var2, str4, m87Var3);
                        if (d != nm6Var) {
                            iArr = appWidgetIds;
                            obj = d;
                            i2 = 0;
                            i3 = 0;
                        }
                        return nm6Var;
                    }
                    if (i == 1) {
                        int i18 = m87Var3.r;
                        i3 = m87Var3.q;
                        boolean z5 = m87Var3.j;
                        iArr = m87Var3.m;
                        e87 e87Var5 = m87Var3.l;
                        qgg.h0(obj2);
                        Object obj3 = ((z7o) obj2).a;
                        i2 = i18;
                        e87Var4 = e87Var5;
                        obj = obj3;
                        x6aVar = null;
                        z2 = z5;
                    } else if (i == 2) {
                        i4 = m87Var3.r;
                        i3 = m87Var3.q;
                        z3 = m87Var3.j;
                        iArr = m87Var3.m;
                        e87Var2 = m87Var3.l;
                        qgg.h0(obj2);
                        x6aVar2 = (x6a) obj2;
                        boolean z6 = application2.getResources().getBoolean(R.bool.plus_sdk_is_tablet);
                        m87Var2 = m87Var3;
                        length = iArr.length;
                        e87Var3 = e87Var2;
                        z4 = z6;
                        i5 = 0;
                        iArr2 = iArr;
                        i6 = 0;
                        if (i6 < length) {
                        }
                    } else if (i == 3) {
                        int i19 = m87Var3.z;
                        int i20 = m87Var3.y;
                        int i21 = m87Var3.x;
                        int i22 = m87Var3.w;
                        int i23 = m87Var3.v;
                        int i24 = m87Var3.u;
                        int i25 = m87Var3.t;
                        int i26 = m87Var3.s;
                        boolean z7 = m87Var3.k;
                        int i27 = m87Var3.r;
                        int i28 = m87Var3.q;
                        boolean z8 = m87Var3.j;
                        Number number2 = (Number) m87Var3.p;
                        int[] iArr3 = m87Var3.o;
                        x6a x6aVar4 = m87Var3.n;
                        e87 e87Var6 = m87Var3.l;
                        qgg.h0(obj2);
                        i16 = i28;
                        i7 = i21;
                        z3 = z8;
                        appWidgetManager = appWidgetManager2;
                        n87Var2 = n87Var;
                        x6aVar3 = x6aVar4;
                        imeVar = imeVar3;
                        i14 = i26;
                        i10 = i25;
                        z4 = z7;
                        m87Var2 = m87Var3;
                        e87Var3 = e87Var6;
                        nm6Var2 = nm6Var;
                        number = number2;
                        i15 = i27;
                        i8 = i20;
                        i12 = i24;
                        i11 = i23;
                        iArr2 = iArr3;
                        i9 = i19;
                        application = application2;
                        i13 = i22;
                        n87Var2.j.getClass();
                        Application application3 = application;
                        j = jkl.j(x6aVar3, application3, number, z4);
                        application = application3;
                        z77Var = e87Var3.b;
                        str = "Update widget [widgetId]: " + j;
                        m87Var2.l = e87Var3;
                        m87Var2.m = null;
                        m87Var2.n = x6aVar3;
                        m87Var2.o = iArr2;
                        m87Var2.p = j;
                        m87Var2.j = z3;
                        m87Var2.q = i16;
                        m87Var2.r = i15;
                        m87Var2.k = z4;
                        m87Var2.s = i14;
                        m87Var2.t = i10;
                        m87Var2.u = i12;
                        m87Var2.v = i11;
                        m87Var2.w = i13;
                        m87Var2.x = i7;
                        m87Var2.y = i8;
                        m87Var2.z = i9;
                        m87Var2.C = 4;
                        imeVar2 = imeVar;
                        nm6Var3 = nm6Var2;
                        if (ime.I(imeVar2, z77Var, str, m87Var2) != nm6Var3) {
                        }
                    } else {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i29 = m87Var3.w;
                        i12 = m87Var3.u;
                        int i30 = m87Var3.t;
                        int i31 = m87Var3.s;
                        boolean z9 = m87Var3.k;
                        int i32 = m87Var3.r;
                        int i33 = m87Var3.q;
                        z3 = m87Var3.j;
                        rft rftVar = (rft) m87Var3.p;
                        int[] iArr4 = m87Var3.o;
                        x6a x6aVar5 = m87Var3.n;
                        e87 e87Var7 = m87Var3.l;
                        qgg.h0(obj2);
                        int i34 = i29;
                        x6a x6aVar6 = x6aVar5;
                        application = application2;
                        int i35 = i31;
                        m87Var2 = m87Var3;
                        e87Var3 = e87Var7;
                        imeVar2 = imeVar3;
                        int i36 = i33;
                        i10 = i30;
                        nm6Var3 = nm6Var;
                        j = rftVar;
                        appWidgetManager = appWidgetManager2;
                        i15 = i32;
                        n87 n87Var3 = n87Var;
                        z4 = z9;
                        iArr2 = iArr4;
                        int i37 = i15;
                        AppWidgetManager appWidgetManager3 = appWidgetManager;
                        n87Var3.k.t(appWidgetManager3, i34, j);
                        x6a x6aVar7 = x6aVar6;
                        i4 = i37;
                        int i38 = i12;
                        nm6 nm6Var4 = nm6Var3;
                        i3 = i36;
                        i5 = i35;
                        int i39 = i10 + 1;
                        length = i38;
                        imeVar3 = imeVar2;
                        nm6Var = nm6Var4;
                        appWidgetManager2 = appWidgetManager3;
                        i6 = i39;
                        application2 = application;
                        x6aVar2 = x6aVar7;
                        if (i6 < length) {
                            application = application2;
                            i13 = iArr2[i6];
                            Bundle appWidgetOptions = appWidgetManager2.getAppWidgetOptions(i13);
                            if (appWidgetOptions == null) {
                                throw new IllegalStateException("widgetOptions are null");
                            }
                            appWidgetManager = appWidgetManager2;
                            int i40 = appWidgetOptions.getInt("appWidgetMinHeight");
                            nm6Var4 = nm6Var;
                            int i41 = appWidgetOptions.getInt("appWidgetMinWidth");
                            ime imeVar4 = imeVar3;
                            number = new Integer(Math.min(Math.min(i40, i41), 220));
                            if (number.intValue() > 0) {
                                z77 z77Var3 = e87Var3.b;
                                String str5 = "Map domain model to ui: widgetSizeDp=" + ((Object) ("Dp(num=" + number + ')')) + ", isLarge=" + z4 + ", domainDailyWidget=" + x6aVar2;
                                m87Var2.l = e87Var3;
                                m87Var2.m = null;
                                m87Var2.n = x6aVar2;
                                m87Var2.o = iArr2;
                                m87Var2.p = number;
                                m87Var2.j = z3;
                                m87Var2.q = i3;
                                m87Var2.r = i4;
                                m87Var2.k = z4;
                                m87Var2.s = i5;
                                m87Var2.t = i6;
                                m87Var2.u = length;
                                m87Var2.v = i13;
                                m87Var2.w = i13;
                                m87Var2.x = 0;
                                m87Var2.y = i41;
                                m87Var2.z = i40;
                                int i42 = i4;
                                m87Var2.C = 3;
                                x6a x6aVar8 = x6aVar2;
                                if (ime.I(imeVar4, z77Var3, str5, m87Var2) == nm6Var4) {
                                    return nm6Var4;
                                }
                                imeVar = imeVar4;
                                nm6Var2 = nm6Var4;
                                i16 = i3;
                                i12 = length;
                                x6aVar3 = x6aVar8;
                                i7 = 0;
                                i15 = i42;
                                i9 = i40;
                                i8 = i41;
                                i10 = i6;
                                i14 = i5;
                                n87Var2 = n87Var;
                                i11 = i13;
                                n87Var2.j.getClass();
                                Application application32 = application;
                                j = jkl.j(x6aVar3, application32, number, z4);
                                application = application32;
                                z77Var = e87Var3.b;
                                str = "Update widget [widgetId]: " + j;
                                m87Var2.l = e87Var3;
                                m87Var2.m = null;
                                m87Var2.n = x6aVar3;
                                m87Var2.o = iArr2;
                                m87Var2.p = j;
                                m87Var2.j = z3;
                                m87Var2.q = i16;
                                m87Var2.r = i15;
                                m87Var2.k = z4;
                                m87Var2.s = i14;
                                m87Var2.t = i10;
                                m87Var2.u = i12;
                                m87Var2.v = i11;
                                m87Var2.w = i13;
                                m87Var2.x = i7;
                                m87Var2.y = i8;
                                m87Var2.z = i9;
                                m87Var2.C = 4;
                                imeVar2 = imeVar;
                                nm6Var3 = nm6Var2;
                                if (ime.I(imeVar2, z77Var, str, m87Var2) != nm6Var3) {
                                    return nm6Var3;
                                }
                                int i43 = i14;
                                i36 = i16;
                                i34 = i13;
                                i35 = i43;
                                n87Var3 = n87Var;
                                x6aVar6 = x6aVar3;
                                int i372 = i15;
                                AppWidgetManager appWidgetManager32 = appWidgetManager;
                                n87Var3.k.t(appWidgetManager32, i34, j);
                                x6a x6aVar72 = x6aVar6;
                                i4 = i372;
                                int i382 = i12;
                                nm6 nm6Var42 = nm6Var3;
                                i3 = i36;
                                i5 = i35;
                                int i392 = i10 + 1;
                                length = i382;
                                imeVar3 = imeVar2;
                                nm6Var = nm6Var42;
                                appWidgetManager2 = appWidgetManager32;
                                i6 = i392;
                                application2 = application;
                                x6aVar2 = x6aVar72;
                                if (i6 < length) {
                                    Unit unit = Unit.a;
                                    r7o r7oVar2 = z7o.b;
                                    return unit;
                                }
                            } else {
                                n87Var3 = n87Var;
                                int i44 = i4;
                                int i45 = i6;
                                imeVar2 = imeVar4;
                                x6aVar72 = x6aVar2;
                                appWidgetManager32 = appWidgetManager;
                                int i46 = length;
                                i10 = i45;
                                i382 = i46;
                                i4 = i44;
                                int i3922 = i10 + 1;
                                length = i382;
                                imeVar3 = imeVar2;
                                nm6Var = nm6Var42;
                                appWidgetManager2 = appWidgetManager32;
                                i6 = i3922;
                                application2 = application;
                                x6aVar2 = x6aVar72;
                                if (i6 < length) {
                                }
                            }
                        }
                    }
                    r7o r7oVar3 = z7o.b;
                    if (obj instanceof t7o) {
                        obj = x6aVar;
                    }
                    m87Var3.l = e87Var4;
                    m87Var3.m = iArr;
                    m87Var3.n = x6aVar;
                    m87Var3.j = z2;
                    m87Var3.q = i3;
                    m87Var3.r = i2;
                    m87Var3.C = 2;
                    b = n87Var.b(z2, e87Var4, (j7a) obj, m87Var3);
                    if (b != nm6Var) {
                        return nm6Var;
                    }
                    e87Var2 = e87Var4;
                    i4 = i2;
                    obj2 = b;
                    z3 = z2;
                    x6aVar2 = (x6a) obj2;
                    boolean z62 = application2.getResources().getBoolean(R.bool.plus_sdk_is_tablet);
                    m87Var2 = m87Var3;
                    length = iArr.length;
                    e87Var3 = e87Var2;
                    z4 = z62;
                    i5 = 0;
                    iArr2 = iArr;
                    i6 = 0;
                    if (i6 < length) {
                    }
                }
            }
            if (i != 0) {
            }
            r7o r7oVar32 = z7o.b;
            if (obj instanceof t7o) {
            }
            m87Var3.l = e87Var4;
            m87Var3.m = iArr;
            m87Var3.n = x6aVar;
            m87Var3.j = z2;
            m87Var3.q = i3;
            m87Var3.r = i2;
            m87Var3.C = 2;
            b = n87Var.b(z2, e87Var4, (j7a) obj, m87Var3);
            if (b != nm6Var) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        m87Var = new m87(n87Var, cg6Var);
        m87 m87Var32 = m87Var;
        Object obj22 = m87Var32.A;
        nm6Var = nm6.a;
        i = m87Var32.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [e87, j7a, pm6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, e87 e87Var, j7a j7aVar, cg6 cg6Var) {
        g87 g87Var;
        int i;
        ?? r3;
        Object obj;
        e87 e87Var2;
        boolean z2;
        Locale b;
        j7a j7aVar2 = j7aVar;
        if (cg6Var instanceof g87) {
            g87Var = (g87) cg6Var;
            int i2 = g87Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g87Var.o = i2 - Integer.MIN_VALUE;
                g87 g87Var2 = g87Var;
                Object obj2 = g87Var2.m;
                nm6 nm6Var = nm6.a;
                i = g87Var2.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    boolean d = j7aVar2 != null ? j7aVar2.c.d("pull_formats_rest_gw_usage") : false;
                    String str = e87Var.d;
                    String str2 = e87Var.c;
                    z77 z77Var = e87Var.b;
                    String str3 = this.n;
                    str3.getClass();
                    g87Var2.k = e87Var;
                    g87Var2.l = j7aVar2;
                    g87Var2.j = z;
                    g87Var2.o = 1;
                    boolean z3 = d;
                    r3 = 0;
                    Object h = this.g.h(z3, str, str2, z77Var, str3, g87Var2);
                    if (h != nm6Var) {
                        obj = h;
                        e87Var2 = e87Var;
                        z2 = z;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return obj2;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = g87Var2.j;
                j7aVar2 = g87Var2.l;
                e87Var2 = g87Var2.k;
                qgg.h0(obj2);
                obj = ((z7o) obj2).a;
                r3 = 0;
                r7o r7oVar = z7o.b;
                if (obj instanceof t7o) {
                    obj = r3;
                }
                l7a l7aVar = (l7a) obj;
                boolean d2 = j7aVar2 == null ? j7aVar2.c.d("pull_formats_rest_gw_usage") : false;
                Configuration configuration = this.c.a.getResources().getConfiguration();
                configuration.getClass();
                b = dqg.d(configuration.getLocales()).b(0);
                if (b == null) {
                    b = Locale.getDefault();
                    b.getClass();
                }
                String language = b.getLanguage();
                language.getClass();
                String str4 = e87Var2.d;
                String str5 = e87Var2.c;
                z77 z77Var2 = e87Var2.b;
                boolean z4 = (l7aVar == null ? l7aVar.c : r3) != k7a.a;
                g87Var2.k = r3;
                g87Var2.l = r3;
                g87Var2.j = z2;
                g87Var2.o = 2;
                ju0 ju0Var = this.i;
                Object s = x97.p((tf6) ju0Var.j, (a) ju0Var.k, r3, new p87(ju0Var, z2, d2, language, str4, str5, z77Var2, z4, (Continuation) null), 2).s(g87Var2);
                return s != nm6Var ? nm6Var : s;
            }
        }
        g87Var = new g87(this, cg6Var);
        g87 g87Var22 = g87Var;
        Object obj22 = g87Var22.m;
        nm6 nm6Var2 = nm6.a;
        i = g87Var22.o;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (obj instanceof t7o) {
        }
        l7a l7aVar2 = (l7a) obj;
        if (j7aVar2 == null) {
        }
        Configuration configuration2 = this.c.a.getResources().getConfiguration();
        configuration2.getClass();
        b = dqg.d(configuration2.getLocales()).b(0);
        if (b == null) {
        }
        String language2 = b.getLanguage();
        language2.getClass();
        String str42 = e87Var2.d;
        String str52 = e87Var2.c;
        z77 z77Var22 = e87Var2.b;
        if ((l7aVar2 == null ? l7aVar2.c : r3) != k7a.a) {
        }
        g87Var22.k = r3;
        g87Var22.l = r3;
        g87Var22.j = z2;
        g87Var22.o = 2;
        ju0 ju0Var2 = this.i;
        Object s2 = x97.p((tf6) ju0Var2.j, (a) ju0Var2.k, r3, new p87(ju0Var2, z2, d2, language2, str42, str52, z77Var22, z4, (Continuation) null), 2).s(g87Var22);
        if (s2 != nm6Var2) {
        }
    }

    public final ou7 c(boolean z) {
        return x97.p(this.d, ((bsd) this.c.b).g, null, new cg1(this, z, null, 6), 2);
    }
}
