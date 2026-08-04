package com.gamericefishpro.space.a3;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.d.p;
import com.gamericefishpro.space.d.r;
import com.gamericefishpro.space.e1.i;
import com.gamericefishpro.space.e1.j;
import com.gamericefishpro.space.e6.g;
import com.gamericefishpro.space.e6.h;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f0.w;
import com.gamericefishpro.space.f1.u;
import com.gamericefishpro.space.f1.x;
import com.gamericefishpro.space.f1.y;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.f5.n;
import com.gamericefishpro.space.f5.v;
import com.gamericefishpro.space.j0.d;
import com.gamericefishpro.space.n1.e;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.u4.f;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.s0;
import com.gamericefishpro.space.y.e1;
import com.gamericefishpro.space.y.l;
import com.gamericefishpro.space.y.m;
import com.gamericefishpro.space.y.y0;
import com.gamericefishpro.space.z.p0;
import com.gamericefishpro.space.z4.u0;
import com.gamericefishpro.space.z4.w0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0249 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        g gVar;
        int i;
        boolean z = true;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = (c) this.e;
                f1 f1Var = cVar.i;
                if (((e) f1Var.getValue()).a == 9205357640488583168L || e.c(((e) f1Var.getValue()).a)) {
                    return null;
                }
                return cVar.d.H(((e) f1Var.getValue()).a);
            case 1:
                return new p((r) this.e);
            case 2:
                com.gamericefishpro.space.e1.b bVar = (com.gamericefishpro.space.e1.b) this.e;
                j jVar = bVar.d;
                Object obj = bVar.v;
                if (obj != null) {
                    return jVar.c(bVar, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 3:
                com.gamericefishpro.space.u6.c cVar2 = ((i) this.e).i;
                if (cVar2 == null) {
                    return null;
                }
                m0.c();
                Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source, "source");
                cVar2.q(source);
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.isEmpty()) {
                    return null;
                }
                return source;
            case 4:
                h hVar = (h) this.e;
                String str = hVar.e;
                if (str == null || !hVar.v) {
                    gVar = new g(hVar.d, hVar.e, new com.gamericefishpro.space.vb.c(10), hVar.i, hVar.w);
                } else {
                    Context context = hVar.d;
                    Intrinsics.checkNotNullParameter(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    gVar = new g(hVar.d, new File(noBackupFilesDir, str).getAbsolutePath(), new com.gamericefishpro.space.vb.c(10), hVar.i, hVar.w);
                }
                gVar.setWriteAheadLoggingEnabled(hVar.z);
                return gVar;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((w) this.e).g().n);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                y yVar = (y) this.e;
                while (true) {
                    synchronized (yVar.g) {
                        if (!yVar.c) {
                            yVar.c = z;
                            try {
                                com.gamericefishpro.space.v0.e eVar = yVar.f;
                                Object[] objArr = eVar.d;
                                int i2 = eVar.i;
                                int i3 = 0;
                                while (i3 < i2) {
                                    x xVar = (x) objArr[i3];
                                    i0 i0Var = xVar.g;
                                    Function1 function1 = xVar.a;
                                    Object[] objArr2 = i0Var.b;
                                    long[] jArr = i0Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                int i6 = 0;
                                                while (i6 < i5) {
                                                    if ((j & 255) < 128) {
                                                        function1.invoke(objArr2[(i4 << 3) + i6]);
                                                    }
                                                    j >>= 8;
                                                    i6++;
                                                    i2 = i2;
                                                }
                                                i = i2;
                                                if (i5 == 8) {
                                                }
                                            } else {
                                                i = i2;
                                            }
                                            if (i4 != length) {
                                                i4++;
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        i = i2;
                                    }
                                    i0Var.b();
                                    i3++;
                                    i2 = i;
                                }
                                yVar.c = false;
                            } catch (Throwable th) {
                                yVar.c = false;
                                throw th;
                            }
                        }
                        Unit unit = Unit.a;
                    }
                    if (!yVar.b()) {
                        return Unit.a;
                    }
                    z = true;
                }
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.i5.c cVar3 = ((k) this.e).A;
                if (!cVar3.i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar3.j.c == com.gamericefishpro.space.z4.p.d) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                w0 w0VarA = f.a(cVar3.a, (u0) cVar3.m.getValue(), 4);
                com.gamericefishpro.space.ei.g modelClass = b0.a(com.gamericefishpro.space.i5.b.class);
                w0VarA.getClass();
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                com.gamericefishpro.space.u6.i iVar = (com.gamericefishpro.space.u6.i) w0VarA.a;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                String strB = modelClass.b();
                if (strB != null) {
                    return ((com.gamericefishpro.space.i5.b) iVar.d(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                List list = (List) ((s2) this.e).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.a(((k) obj2).e.d, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 9:
                ((n) this.e).invoke();
                return Unit.a;
            case 10:
                String uriPattern = (String) this.e;
                Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                return new v(uriPattern);
            case RequestError.STOP_TRACKING /* 11 */:
                d dVar = (d) this.e;
                dVar.e0.invoke(Boolean.valueOf(!dVar.d0));
                return Unit.a;
            case 12:
                return this.e;
            case 13:
                com.gamericefishpro.space.m0.h hVar2 = (com.gamericefishpro.space.m0.h) this.e;
                hVar2.R = null;
                com.gamericefishpro.space.h2.k.l(hVar2);
                com.gamericefishpro.space.h2.k.k(hVar2);
                com.gamericefishpro.space.h2.k.j(hVar2);
                return Boolean.TRUE;
            case 14:
                com.gamericefishpro.space.h2.k.j((com.gamericefishpro.space.p0.a) this.e);
                return Unit.a;
            case 15:
                return ((Callable) this.e).call();
            case 16:
                return ((com.gamericefishpro.space.s5.w) this.e).b();
            case 17:
                return ((s) this.e).e(":memory:");
            case 18:
                u uVar = (u) this.e;
                WebView webView = (WebView) CollectionsKt.C(uVar);
                if (webView != null && webView.canGoBack()) {
                    webView.goBack();
                } else if (uVar.size() > 1) {
                    WebView webView2 = (WebView) uVar.remove(com.gamericefishpro.space.ph.x.e(uVar));
                    ViewParent parent = webView2.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView2);
                    }
                    webView2.destroy();
                }
                return Unit.a;
            case 19:
                return Float.valueOf(com.gamericefishpro.space.w.c.k(((com.gamericefishpro.space.pi.x) this.e).l()));
            case 20:
                s0 s0Var = (s0) this.e;
                l1 l1Var = s0Var.w;
                s0Var.y = l1Var != null ? ((Number) l1Var.l.getValue()).longValue() : 0L;
                return Unit.a;
            case 21:
                e1 e1Var = (e1) this.e;
                m mVar = (m) com.gamericefishpro.space.h2.k.h(e1Var, y0.a);
                e1Var.S = mVar;
                e1Var.T = mVar != null ? new l(mVar.a, mVar.b, mVar.c, mVar.d) : null;
                return Unit.a;
            case 22:
                return (p0) com.gamericefishpro.space.ri.l.a(((com.gamericefishpro.space.ri.i) this.e).g());
            case 23:
                return com.gamericefishpro.space.z4.m0.g((com.gamericefishpro.space.z4.y0) this.e);
            default:
                com.gamericefishpro.space.z5.e eVar2 = (com.gamericefishpro.space.z5.e) this.e;
                eVar2.g().a(new com.gamericefishpro.space.z5.b(eVar2));
                return Unit.a;
        }
    }
}
