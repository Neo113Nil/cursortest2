package defpackage;

import android.os.Parcelable;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsLastCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsNextCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h1t implements tbb {
    public final mqs a;
    public final fvs b;
    public final n1t c;
    public final j1t d;
    public final m1t e;
    public final uu5 f;
    public final yab g;
    public final p0t h;
    public final lwc i;
    public final z66 j;
    public final int k;
    public final boolean l;
    public final jyr m;

    public h1t(mqs mqsVar, fvs fvsVar, n1t n1tVar, j1t j1tVar, m1t m1tVar, uu5 uu5Var, yab yabVar, xba xbaVar, uaa uaaVar, p0t p0tVar, lwc lwcVar, z66 z66Var, int i, boolean z) {
        mqsVar.getClass();
        yabVar.getClass();
        xbaVar.getClass();
        uaaVar.getClass();
        p0tVar.getClass();
        lwcVar.getClass();
        z66Var.getClass();
        this.a = mqsVar;
        this.b = fvsVar;
        this.c = n1tVar;
        this.d = j1tVar;
        this.e = m1tVar;
        this.f = uu5Var;
        this.g = yabVar;
        this.h = p0tVar;
        this.i = lwcVar;
        this.j = z66Var;
        this.k = i;
        this.l = z;
        this.m = btf.b(new xes(7, xbaVar, uaaVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /* JADX WARN: Type inference failed for: r15v15, types: [e1t] */
    /* JADX WARN: Type inference failed for: r15v16, types: [e1t] */
    /* JADX WARN: Type inference failed for: r3v49, types: [e1t] */
    /* JADX WARN: Type inference failed for: r3v51, types: [e1t] */
    /* JADX WARN: Type inference failed for: r3v52, types: [e1t] */
    /* JADX WARN: Type inference failed for: r5v11, types: [e1t] */
    /* JADX WARN: Type inference failed for: r5v4, types: [e1t] */
    /* JADX WARN: Type inference failed for: r5v7, types: [e1t] */
    /* JADX WARN: Type inference failed for: r7v11, types: [e1t] */
    /* JADX WARN: Type inference failed for: r7v12, types: [e1t] */
    /* JADX WARN: Type inference failed for: r7v4, types: [e1t] */
    /* JADX WARN: Type inference failed for: r7v7, types: [e1t] */
    /* JADX WARN: Type inference failed for: r7v8, types: [e1t] */
    /* JADX WARN: Type inference failed for: r7v9, types: [e1t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable c(final h1t h1tVar, y9a y9aVar, j1g j1gVar, cg6 cg6Var) {
        g1t g1tVar;
        int i;
        j1g j1gVar2;
        j1g j1gVar3;
        boolean z;
        y9a y9aVar2;
        boolean booleanValue;
        boolean C;
        dg2 dg2Var;
        n8g b;
        int i2;
        mqs mqsVar;
        uu5 uu5Var;
        y9a y9aVar3;
        n8g n8gVar;
        oq oqVar;
        boolean z2;
        boolean z3;
        n8g n8gVar2;
        boolean z4;
        n8g b2;
        n8g n8gVar3;
        mqs mqsVar2;
        oq oqVar2;
        boolean z5;
        n8g n8gVar4;
        y9a y9aVar4;
        boolean z6;
        sbb g;
        boolean booleanValue2;
        uu5 uu5Var2;
        sbb g2;
        boolean booleanValue3;
        yab yabVar = h1tVar.g;
        uu5 uu5Var3 = h1tVar.f;
        int i3 = h1tVar.k;
        n1t n1tVar = h1tVar.c;
        m1t m1tVar = h1tVar.e;
        mqs mqsVar3 = h1tVar.a;
        if (cg6Var instanceof g1t) {
            g1tVar = (g1t) cg6Var;
            int i4 = g1tVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g1tVar.s = i4 - Integer.MIN_VALUE;
                Object obj = g1tVar.q;
                Serializable serializable = nm6.a;
                i = g1tVar.s;
                x9a x9aVar = x9a.a;
                if (i != 0) {
                    j1gVar2 = null;
                    qgg.h0(obj);
                    boolean P = wyf.P(mqsVar3);
                    g1tVar.j = y9aVar;
                    j1gVar3 = j1gVar;
                    g1tVar.k = j1gVar3;
                    g1tVar.n = P;
                    g1tVar.s = 1;
                    Object v = m1tVar.v(mqsVar3, g1tVar);
                    if (v != serializable) {
                        z = P;
                        obj = v;
                        y9aVar2 = y9aVar;
                    }
                    return serializable;
                }
                if (i != 1) {
                    if (i == 2) {
                        z6 = g1tVar.p;
                        z5 = g1tVar.o;
                        n8gVar4 = g1tVar.m;
                        n8gVar3 = g1tVar.l;
                        y9aVar4 = g1tVar.j;
                        qgg.h0(obj);
                        booleanValue2 = ((Boolean) obj).booleanValue();
                        if (!booleanValue2) {
                            final int i5 = 11;
                            n8gVar4.add(new mcm(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i6 = i5;
                                    h1t h1tVar2 = this.b;
                                    switch (i6) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i7 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i7);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i8 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i8);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        } else {
                            if (booleanValue2) {
                                b6e.s();
                                return null;
                            }
                            final int i6 = 12;
                            n8gVar4.add(new lcm(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i6;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i7 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i7);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i8 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i8);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        }
                        C = z6;
                        booleanValue = z5;
                        y9aVar2 = y9aVar4;
                        b2 = n8gVar4;
                        if (Intrinsics.d(y9aVar2, x9aVar)) {
                            final int i7 = 13;
                            b2.add(new fit(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i7;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i8 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i8);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        }
                        if (!booleanValue || n1tVar.e) {
                            final int i8 = 14;
                            b2.add(new cx7(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i8;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i82);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        }
                        if (C && (g = m1tVar.g(i3, uu5Var3)) != null) {
                            b2.add(g);
                        }
                        final int i9 = 15;
                        b2.add(new qws(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i9;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                        serializable = t75.a(n8gVar3);
                        return serializable;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4 = g1tVar.p;
                    z2 = g1tVar.o;
                    z3 = g1tVar.n;
                    n8gVar2 = g1tVar.m;
                    n8gVar = g1tVar.l;
                    j1gVar3 = g1tVar.k;
                    y9aVar3 = g1tVar.j;
                    qgg.h0(obj);
                    uu5Var = uu5Var3;
                    i2 = i3;
                    mqsVar = mqsVar3;
                    booleanValue3 = ((Boolean) obj).booleanValue();
                    final int i10 = 1;
                    if (!booleanValue3) {
                        final int i11 = 0;
                        n8gVar2.add(new mcm(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i11;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    } else {
                        if (booleanValue3) {
                            b6e.s();
                            return null;
                        }
                        n8gVar2.add(new lcm(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i10;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    }
                    C = z4;
                    booleanValue = z2;
                    b = n8gVar2;
                    z = z3;
                    if (!Intrinsics.d(y9aVar3, u9a.a)) {
                        final int i12 = 3;
                        b.add(new iq3(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i12;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    } else if (Intrinsics.d(y9aVar3, v9a.a)) {
                        final int i13 = 4;
                        b.add(new nt3(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i13;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    } else if (Intrinsics.d(y9aVar3, x9aVar)) {
                        final int i14 = 5;
                        b.add(new fit(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i14;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    } else if (!Intrinsics.d(y9aVar3, w9a.a)) {
                        b6e.s();
                        return null;
                    }
                    if (booleanValue) {
                        uu5Var2 = uu5Var;
                    } else {
                        uu5Var2 = uu5Var;
                        b.add(m1tVar.E(uu5Var2));
                    }
                    if (C && (g2 = m1tVar.g(i2, uu5Var2)) != null) {
                        b.add(g2);
                    }
                    final int i15 = 6;
                    b.add(new qws(new Function0(h1tVar) { // from class: e1t
                        public final /* synthetic */ h1t b;

                        {
                            this.b = h1tVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            n7q n7qVar;
                            mwk b3;
                            int i62 = i15;
                            h1t h1tVar2 = this.b;
                            switch (i62) {
                                case 0:
                                    h1tVar2.f.f();
                                    break;
                                case 1:
                                    h1tVar2.f.e();
                                    break;
                                case 2:
                                    h1tVar2.f.d();
                                    break;
                                case 3:
                                    uu5 uu5Var4 = h1tVar2.f;
                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                    j1t j1tVar = (j1t) uu5Var4.d;
                                    if (a) {
                                        j1tVar.b();
                                    } else {
                                        j1tVar.dismiss();
                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                        eca ecaVar = eca.d;
                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                    }
                                    break;
                                case 4:
                                    uu5 uu5Var5 = h1tVar2.f;
                                    ((j1t) uu5Var5.d).dismiss();
                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                    eca ecaVar2 = eca.d;
                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                    break;
                                case 5:
                                    uu5 uu5Var6 = h1tVar2.f;
                                    ((j1t) uu5Var6.d).dismiss();
                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                    eca ecaVar3 = eca.d;
                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                    vbbVar3.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar3.a).c(i72);
                                    break;
                                case 6:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 7:
                                    uu5 uu5Var7 = h1tVar2.f;
                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                    yab b4 = uu5Var7.b();
                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                    b4.getClass();
                                    mqsVar4.getClass();
                                    b4.a().A(mqsVar4);
                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                    j1tVar2.d();
                                    j1tVar2.c();
                                    break;
                                case 8:
                                    uu5 uu5Var8 = h1tVar2.f;
                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                    yab b5 = uu5Var8.b();
                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                    b5.getClass();
                                    mqsVar5.getClass();
                                    b5.a().b(mqsVar5);
                                    fx fxVar = fx.b;
                                    gj gjVar = (gj) uu5Var8.b;
                                    if (gjVar != null) {
                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                    }
                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                    j1tVar3.n();
                                    j1tVar3.c();
                                    break;
                                case 9:
                                    h1tVar2.d.e(h1tVar2.a);
                                    break;
                                case 10:
                                    uu5 uu5Var9 = h1tVar2.f;
                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                    yab b6 = uu5Var9.b();
                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                    b6.getClass();
                                    mqsVar6.getClass();
                                    b6.a().A(mqsVar6);
                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                    j1tVar4.q(mqsVar6);
                                    j1tVar4.c();
                                    break;
                                case 11:
                                    h1tVar2.f.f();
                                    break;
                                case 12:
                                    h1tVar2.f.e();
                                    break;
                                case 13:
                                    uu5 uu5Var10 = h1tVar2.f;
                                    ((j1t) uu5Var10.d).dismiss();
                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                    eca ecaVar4 = eca.d;
                                    eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                    vbbVar4.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar4.a).c(i82);
                                    break;
                                case 14:
                                    h1tVar2.f.c();
                                    break;
                                case 15:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 16:
                                    h1tVar2.d.p(h1tVar2.a);
                                    break;
                                case 17:
                                    h1tVar2.d.h(h1tVar2.a);
                                    break;
                                case 18:
                                    uu5 uu5Var11 = h1tVar2.f;
                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                    yab b7 = uu5Var11.b();
                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                    b7.getClass();
                                    mqsVar7.getClass();
                                    b7.a().A(mqsVar7);
                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                    j1tVar5.q(mqsVar7);
                                    j1tVar5.c();
                                    break;
                                case 19:
                                    h1tVar2.f.d();
                                    break;
                                case 20:
                                    uu5 uu5Var12 = h1tVar2.f;
                                    ((j1t) uu5Var12.d).dismiss();
                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                    break;
                                case 21:
                                    uu5 uu5Var13 = h1tVar2.f;
                                    ((j1t) uu5Var13.d).dismiss();
                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                    p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                    p0tVar.a(t75.c(mqsVar8), true);
                                    n3m n3mVar = (n3m) uu5Var13.f;
                                    mqsVar8.getClass();
                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                    }
                                    break;
                                case 22:
                                    h1tVar2.d.i(h1tVar2.a);
                                    break;
                                case 23:
                                    uu5 uu5Var14 = h1tVar2.f;
                                    ((j1t) uu5Var14.d).dismiss();
                                    String t = weo.t();
                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                    mqsVar9.getClass();
                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                    break;
                                case 24:
                                    uu5 uu5Var15 = h1tVar2.f;
                                    ((j1t) uu5Var15.d).dismiss();
                                    String t2 = weo.t();
                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                    mqsVar10.getClass();
                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                    break;
                                case 25:
                                    h1tVar2.d.l(h1tVar2.a);
                                    break;
                                default:
                                    h1tVar2.d.o(h1tVar2.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    }));
                    if (!z) {
                        if (f1t.a[j1gVar3.ordinal()] == 2) {
                            final int i16 = 7;
                            b.add(new yht(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i16;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i82);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        } else {
                            final int i17 = 8;
                            b.add(new l88(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i17;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i82);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        }
                    }
                    if (!wyf.L(mqsVar)) {
                        final int i18 = 9;
                        b.add(new pl5(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i18;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i82);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    }
                    serializable = t75.a(n8gVar);
                    return serializable;
                }
                j1gVar2 = null;
                z = g1tVar.n;
                j1gVar3 = g1tVar.k;
                y9aVar2 = g1tVar.j;
                qgg.h0(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                C = m1tVar.C(mqsVar3, i3);
                boolean h = m1tVar.h();
                dg2Var = mqsVar3.k;
                oq oqVar3 = mqsVar3.t;
                if (dg2Var == dg2.b) {
                    b2 = t75.b();
                    if (!h1tVar.l) {
                        if (f1t.a[j1gVar3.ordinal()] == 1) {
                            mqsVar2 = mqsVar3;
                            final int i19 = 10;
                            b2.add(new ait(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i19;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i82);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        } else {
                            mqsVar2 = mqsVar3;
                            final int i20 = 2;
                            b2.add(new h1g(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i20;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i82 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i82);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                        }
                        if (mqsVar2.l() && !mqsVar2.C() && z) {
                            if (oqVar3 == null) {
                                Parcelable.Creator<oq> creator = oq.CREATOR;
                                oqVar2 = cxb.O(mqsVar2);
                            } else {
                                oqVar2 = oqVar3;
                            }
                            g1tVar.j = y9aVar2;
                            g1tVar.k = j1gVar2;
                            g1tVar.l = b2;
                            g1tVar.m = b2;
                            g1tVar.n = z;
                            g1tVar.o = booleanValue;
                            g1tVar.p = C;
                            g1tVar.s = 2;
                            Object h2 = yabVar.a().h(oqVar2, g1tVar);
                            if (h2 != serializable) {
                                z5 = booleanValue;
                                obj = h2;
                                n8gVar4 = b2;
                                n8gVar3 = n8gVar4;
                                y9aVar4 = y9aVar2;
                                z6 = C;
                                booleanValue2 = ((Boolean) obj).booleanValue();
                                if (!booleanValue2) {
                                }
                                C = z6;
                                booleanValue = z5;
                                y9aVar2 = y9aVar4;
                                b2 = n8gVar4;
                                if (Intrinsics.d(y9aVar2, x9aVar)) {
                                }
                                if (!booleanValue) {
                                }
                                final int i82 = 14;
                                b2.add(new cx7(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i82;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i822 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i822);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                                if (C) {
                                    b2.add(g);
                                }
                                final int i92 = 15;
                                b2.add(new qws(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i92;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i822 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i822);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                                serializable = t75.a(n8gVar3);
                            }
                        }
                    }
                    n8gVar3 = b2;
                    if (Intrinsics.d(y9aVar2, x9aVar)) {
                    }
                    if (!booleanValue) {
                    }
                    final int i822 = 14;
                    b2.add(new cx7(new Function0(h1tVar) { // from class: e1t
                        public final /* synthetic */ h1t b;

                        {
                            this.b = h1tVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            n7q n7qVar;
                            mwk b3;
                            int i62 = i822;
                            h1t h1tVar2 = this.b;
                            switch (i62) {
                                case 0:
                                    h1tVar2.f.f();
                                    break;
                                case 1:
                                    h1tVar2.f.e();
                                    break;
                                case 2:
                                    h1tVar2.f.d();
                                    break;
                                case 3:
                                    uu5 uu5Var4 = h1tVar2.f;
                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                    j1t j1tVar = (j1t) uu5Var4.d;
                                    if (a) {
                                        j1tVar.b();
                                    } else {
                                        j1tVar.dismiss();
                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                        eca ecaVar = eca.d;
                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                    }
                                    break;
                                case 4:
                                    uu5 uu5Var5 = h1tVar2.f;
                                    ((j1t) uu5Var5.d).dismiss();
                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                    eca ecaVar2 = eca.d;
                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                    break;
                                case 5:
                                    uu5 uu5Var6 = h1tVar2.f;
                                    ((j1t) uu5Var6.d).dismiss();
                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                    eca ecaVar3 = eca.d;
                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                    vbbVar3.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar3.a).c(i72);
                                    break;
                                case 6:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 7:
                                    uu5 uu5Var7 = h1tVar2.f;
                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                    yab b4 = uu5Var7.b();
                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                    b4.getClass();
                                    mqsVar4.getClass();
                                    b4.a().A(mqsVar4);
                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                    j1tVar2.d();
                                    j1tVar2.c();
                                    break;
                                case 8:
                                    uu5 uu5Var8 = h1tVar2.f;
                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                    yab b5 = uu5Var8.b();
                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                    b5.getClass();
                                    mqsVar5.getClass();
                                    b5.a().b(mqsVar5);
                                    fx fxVar = fx.b;
                                    gj gjVar = (gj) uu5Var8.b;
                                    if (gjVar != null) {
                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                    }
                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                    j1tVar3.n();
                                    j1tVar3.c();
                                    break;
                                case 9:
                                    h1tVar2.d.e(h1tVar2.a);
                                    break;
                                case 10:
                                    uu5 uu5Var9 = h1tVar2.f;
                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                    yab b6 = uu5Var9.b();
                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                    b6.getClass();
                                    mqsVar6.getClass();
                                    b6.a().A(mqsVar6);
                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                    j1tVar4.q(mqsVar6);
                                    j1tVar4.c();
                                    break;
                                case 11:
                                    h1tVar2.f.f();
                                    break;
                                case 12:
                                    h1tVar2.f.e();
                                    break;
                                case 13:
                                    uu5 uu5Var10 = h1tVar2.f;
                                    ((j1t) uu5Var10.d).dismiss();
                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                    eca ecaVar4 = eca.d;
                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                    vbbVar4.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar4.a).c(i8222);
                                    break;
                                case 14:
                                    h1tVar2.f.c();
                                    break;
                                case 15:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 16:
                                    h1tVar2.d.p(h1tVar2.a);
                                    break;
                                case 17:
                                    h1tVar2.d.h(h1tVar2.a);
                                    break;
                                case 18:
                                    uu5 uu5Var11 = h1tVar2.f;
                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                    yab b7 = uu5Var11.b();
                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                    b7.getClass();
                                    mqsVar7.getClass();
                                    b7.a().A(mqsVar7);
                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                    j1tVar5.q(mqsVar7);
                                    j1tVar5.c();
                                    break;
                                case 19:
                                    h1tVar2.f.d();
                                    break;
                                case 20:
                                    uu5 uu5Var12 = h1tVar2.f;
                                    ((j1t) uu5Var12.d).dismiss();
                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                    break;
                                case 21:
                                    uu5 uu5Var13 = h1tVar2.f;
                                    ((j1t) uu5Var13.d).dismiss();
                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                    p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                    p0tVar.a(t75.c(mqsVar8), true);
                                    n3m n3mVar = (n3m) uu5Var13.f;
                                    mqsVar8.getClass();
                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                    }
                                    break;
                                case 22:
                                    h1tVar2.d.i(h1tVar2.a);
                                    break;
                                case 23:
                                    uu5 uu5Var14 = h1tVar2.f;
                                    ((j1t) uu5Var14.d).dismiss();
                                    String t = weo.t();
                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                    mqsVar9.getClass();
                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                    break;
                                case 24:
                                    uu5 uu5Var15 = h1tVar2.f;
                                    ((j1t) uu5Var15.d).dismiss();
                                    String t2 = weo.t();
                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                    mqsVar10.getClass();
                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                    break;
                                case 25:
                                    h1tVar2.d.l(h1tVar2.a);
                                    break;
                                default:
                                    h1tVar2.d.o(h1tVar2.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    }));
                    if (C) {
                    }
                    final int i922 = 15;
                    b2.add(new qws(new Function0(h1tVar) { // from class: e1t
                        public final /* synthetic */ h1t b;

                        {
                            this.b = h1tVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            n7q n7qVar;
                            mwk b3;
                            int i62 = i922;
                            h1t h1tVar2 = this.b;
                            switch (i62) {
                                case 0:
                                    h1tVar2.f.f();
                                    break;
                                case 1:
                                    h1tVar2.f.e();
                                    break;
                                case 2:
                                    h1tVar2.f.d();
                                    break;
                                case 3:
                                    uu5 uu5Var4 = h1tVar2.f;
                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                    j1t j1tVar = (j1t) uu5Var4.d;
                                    if (a) {
                                        j1tVar.b();
                                    } else {
                                        j1tVar.dismiss();
                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                        eca ecaVar = eca.d;
                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                    }
                                    break;
                                case 4:
                                    uu5 uu5Var5 = h1tVar2.f;
                                    ((j1t) uu5Var5.d).dismiss();
                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                    eca ecaVar2 = eca.d;
                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                    break;
                                case 5:
                                    uu5 uu5Var6 = h1tVar2.f;
                                    ((j1t) uu5Var6.d).dismiss();
                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                    eca ecaVar3 = eca.d;
                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                    vbbVar3.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar3.a).c(i72);
                                    break;
                                case 6:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 7:
                                    uu5 uu5Var7 = h1tVar2.f;
                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                    yab b4 = uu5Var7.b();
                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                    b4.getClass();
                                    mqsVar4.getClass();
                                    b4.a().A(mqsVar4);
                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                    j1tVar2.d();
                                    j1tVar2.c();
                                    break;
                                case 8:
                                    uu5 uu5Var8 = h1tVar2.f;
                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                    yab b5 = uu5Var8.b();
                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                    b5.getClass();
                                    mqsVar5.getClass();
                                    b5.a().b(mqsVar5);
                                    fx fxVar = fx.b;
                                    gj gjVar = (gj) uu5Var8.b;
                                    if (gjVar != null) {
                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                    }
                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                    j1tVar3.n();
                                    j1tVar3.c();
                                    break;
                                case 9:
                                    h1tVar2.d.e(h1tVar2.a);
                                    break;
                                case 10:
                                    uu5 uu5Var9 = h1tVar2.f;
                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                    yab b6 = uu5Var9.b();
                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                    b6.getClass();
                                    mqsVar6.getClass();
                                    b6.a().A(mqsVar6);
                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                    j1tVar4.q(mqsVar6);
                                    j1tVar4.c();
                                    break;
                                case 11:
                                    h1tVar2.f.f();
                                    break;
                                case 12:
                                    h1tVar2.f.e();
                                    break;
                                case 13:
                                    uu5 uu5Var10 = h1tVar2.f;
                                    ((j1t) uu5Var10.d).dismiss();
                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                    eca ecaVar4 = eca.d;
                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                    vbbVar4.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar4.a).c(i8222);
                                    break;
                                case 14:
                                    h1tVar2.f.c();
                                    break;
                                case 15:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 16:
                                    h1tVar2.d.p(h1tVar2.a);
                                    break;
                                case 17:
                                    h1tVar2.d.h(h1tVar2.a);
                                    break;
                                case 18:
                                    uu5 uu5Var11 = h1tVar2.f;
                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                    yab b7 = uu5Var11.b();
                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                    b7.getClass();
                                    mqsVar7.getClass();
                                    b7.a().A(mqsVar7);
                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                    j1tVar5.q(mqsVar7);
                                    j1tVar5.c();
                                    break;
                                case 19:
                                    h1tVar2.f.d();
                                    break;
                                case 20:
                                    uu5 uu5Var12 = h1tVar2.f;
                                    ((j1t) uu5Var12.d).dismiss();
                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                    break;
                                case 21:
                                    uu5 uu5Var13 = h1tVar2.f;
                                    ((j1t) uu5Var13.d).dismiss();
                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                    p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                    p0tVar.a(t75.c(mqsVar8), true);
                                    n3m n3mVar = (n3m) uu5Var13.f;
                                    mqsVar8.getClass();
                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                    }
                                    break;
                                case 22:
                                    h1tVar2.d.i(h1tVar2.a);
                                    break;
                                case 23:
                                    uu5 uu5Var14 = h1tVar2.f;
                                    ((j1t) uu5Var14.d).dismiss();
                                    String t = weo.t();
                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                    mqsVar9.getClass();
                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                    break;
                                case 24:
                                    uu5 uu5Var15 = h1tVar2.f;
                                    ((j1t) uu5Var15.d).dismiss();
                                    String t2 = weo.t();
                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                    mqsVar10.getClass();
                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                    break;
                                case 25:
                                    h1tVar2.d.l(h1tVar2.a);
                                    break;
                                default:
                                    h1tVar2.d.o(h1tVar2.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    }));
                    serializable = t75.a(n8gVar3);
                } else {
                    b = t75.b();
                    if (n1tVar.d) {
                        i2 = i3;
                        final int i21 = 16;
                        b.add(new wxp(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i21;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i8222);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    } else {
                        i2 = i3;
                    }
                    if (n1tVar.c) {
                        mqsVar = mqsVar3;
                        if (mqsVar.v0) {
                            uu5Var = uu5Var3;
                            final int i22 = 17;
                            b.add(new u5t(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i22;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i8222);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                            if (f1t.a[j1gVar3.ordinal()] != 1) {
                                final int i23 = 18;
                                b.add(new ait(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i23;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i8222);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                            } else {
                                final int i24 = 19;
                                b.add(new h1g(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i24;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i8222);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                            }
                            if (mqsVar.l) {
                                p0t p0tVar = h1tVar.h;
                                p0tVar.getClass();
                                r1l r1lVar = (r1l) p0tVar.a.getValue();
                                r1lVar.getClass();
                                Boolean d = r1lVar.d(mqsVar.a);
                                if (d != null ? d.booleanValue() : false) {
                                    final int i25 = 20;
                                    b.add(new bbh(new Function0(h1tVar) { // from class: e1t
                                        public final /* synthetic */ h1t b;

                                        {
                                            this.b = h1tVar;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            n7q n7qVar;
                                            mwk b3;
                                            int i62 = i25;
                                            h1t h1tVar2 = this.b;
                                            switch (i62) {
                                                case 0:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 1:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 2:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 3:
                                                    uu5 uu5Var4 = h1tVar2.f;
                                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                    j1t j1tVar = (j1t) uu5Var4.d;
                                                    if (a) {
                                                        j1tVar.b();
                                                    } else {
                                                        j1tVar.dismiss();
                                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                        eca ecaVar = eca.d;
                                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                    }
                                                    break;
                                                case 4:
                                                    uu5 uu5Var5 = h1tVar2.f;
                                                    ((j1t) uu5Var5.d).dismiss();
                                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                    eca ecaVar2 = eca.d;
                                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                    break;
                                                case 5:
                                                    uu5 uu5Var6 = h1tVar2.f;
                                                    ((j1t) uu5Var6.d).dismiss();
                                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                    eca ecaVar3 = eca.d;
                                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                    vbbVar3.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar3.a).c(i72);
                                                    break;
                                                case 6:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 7:
                                                    uu5 uu5Var7 = h1tVar2.f;
                                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                    yab b4 = uu5Var7.b();
                                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                                    b4.getClass();
                                                    mqsVar4.getClass();
                                                    b4.a().A(mqsVar4);
                                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                                    j1tVar2.d();
                                                    j1tVar2.c();
                                                    break;
                                                case 8:
                                                    uu5 uu5Var8 = h1tVar2.f;
                                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                    yab b5 = uu5Var8.b();
                                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                                    b5.getClass();
                                                    mqsVar5.getClass();
                                                    b5.a().b(mqsVar5);
                                                    fx fxVar = fx.b;
                                                    gj gjVar = (gj) uu5Var8.b;
                                                    if (gjVar != null) {
                                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                    }
                                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                                    j1tVar3.n();
                                                    j1tVar3.c();
                                                    break;
                                                case 9:
                                                    h1tVar2.d.e(h1tVar2.a);
                                                    break;
                                                case 10:
                                                    uu5 uu5Var9 = h1tVar2.f;
                                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                    yab b6 = uu5Var9.b();
                                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                                    b6.getClass();
                                                    mqsVar6.getClass();
                                                    b6.a().A(mqsVar6);
                                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                                    j1tVar4.q(mqsVar6);
                                                    j1tVar4.c();
                                                    break;
                                                case 11:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 12:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 13:
                                                    uu5 uu5Var10 = h1tVar2.f;
                                                    ((j1t) uu5Var10.d).dismiss();
                                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                    eca ecaVar4 = eca.d;
                                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                    vbbVar4.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar4.a).c(i8222);
                                                    break;
                                                case 14:
                                                    h1tVar2.f.c();
                                                    break;
                                                case 15:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 16:
                                                    h1tVar2.d.p(h1tVar2.a);
                                                    break;
                                                case 17:
                                                    h1tVar2.d.h(h1tVar2.a);
                                                    break;
                                                case 18:
                                                    uu5 uu5Var11 = h1tVar2.f;
                                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                    yab b7 = uu5Var11.b();
                                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                                    b7.getClass();
                                                    mqsVar7.getClass();
                                                    b7.a().A(mqsVar7);
                                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                                    j1tVar5.q(mqsVar7);
                                                    j1tVar5.c();
                                                    break;
                                                case 19:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 20:
                                                    uu5 uu5Var12 = h1tVar2.f;
                                                    ((j1t) uu5Var12.d).dismiss();
                                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                    break;
                                                case 21:
                                                    uu5 uu5Var13 = h1tVar2.f;
                                                    ((j1t) uu5Var13.d).dismiss();
                                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                    p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                                    p0tVar2.a(t75.c(mqsVar8), true);
                                                    n3m n3mVar = (n3m) uu5Var13.f;
                                                    mqsVar8.getClass();
                                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                    }
                                                    break;
                                                case 22:
                                                    h1tVar2.d.i(h1tVar2.a);
                                                    break;
                                                case 23:
                                                    uu5 uu5Var14 = h1tVar2.f;
                                                    ((j1t) uu5Var14.d).dismiss();
                                                    String t = weo.t();
                                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                                    mqsVar9.getClass();
                                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                    break;
                                                case 24:
                                                    uu5 uu5Var15 = h1tVar2.f;
                                                    ((j1t) uu5Var15.d).dismiss();
                                                    String t2 = weo.t();
                                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                                    mqsVar10.getClass();
                                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                    break;
                                                case 25:
                                                    h1tVar2.d.l(h1tVar2.a);
                                                    break;
                                                default:
                                                    h1tVar2.d.o(h1tVar2.a);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }));
                                } else {
                                    final int i26 = 21;
                                    b.add(new zah(new Function0(h1tVar) { // from class: e1t
                                        public final /* synthetic */ h1t b;

                                        {
                                            this.b = h1tVar;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            n7q n7qVar;
                                            mwk b3;
                                            int i62 = i26;
                                            h1t h1tVar2 = this.b;
                                            switch (i62) {
                                                case 0:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 1:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 2:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 3:
                                                    uu5 uu5Var4 = h1tVar2.f;
                                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                    j1t j1tVar = (j1t) uu5Var4.d;
                                                    if (a) {
                                                        j1tVar.b();
                                                    } else {
                                                        j1tVar.dismiss();
                                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                        eca ecaVar = eca.d;
                                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                    }
                                                    break;
                                                case 4:
                                                    uu5 uu5Var5 = h1tVar2.f;
                                                    ((j1t) uu5Var5.d).dismiss();
                                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                    eca ecaVar2 = eca.d;
                                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                    break;
                                                case 5:
                                                    uu5 uu5Var6 = h1tVar2.f;
                                                    ((j1t) uu5Var6.d).dismiss();
                                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                    eca ecaVar3 = eca.d;
                                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                    vbbVar3.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar3.a).c(i72);
                                                    break;
                                                case 6:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 7:
                                                    uu5 uu5Var7 = h1tVar2.f;
                                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                    yab b4 = uu5Var7.b();
                                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                                    b4.getClass();
                                                    mqsVar4.getClass();
                                                    b4.a().A(mqsVar4);
                                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                                    j1tVar2.d();
                                                    j1tVar2.c();
                                                    break;
                                                case 8:
                                                    uu5 uu5Var8 = h1tVar2.f;
                                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                    yab b5 = uu5Var8.b();
                                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                                    b5.getClass();
                                                    mqsVar5.getClass();
                                                    b5.a().b(mqsVar5);
                                                    fx fxVar = fx.b;
                                                    gj gjVar = (gj) uu5Var8.b;
                                                    if (gjVar != null) {
                                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                    }
                                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                                    j1tVar3.n();
                                                    j1tVar3.c();
                                                    break;
                                                case 9:
                                                    h1tVar2.d.e(h1tVar2.a);
                                                    break;
                                                case 10:
                                                    uu5 uu5Var9 = h1tVar2.f;
                                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                    yab b6 = uu5Var9.b();
                                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                                    b6.getClass();
                                                    mqsVar6.getClass();
                                                    b6.a().A(mqsVar6);
                                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                                    j1tVar4.q(mqsVar6);
                                                    j1tVar4.c();
                                                    break;
                                                case 11:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 12:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 13:
                                                    uu5 uu5Var10 = h1tVar2.f;
                                                    ((j1t) uu5Var10.d).dismiss();
                                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                    eca ecaVar4 = eca.d;
                                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                    vbbVar4.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar4.a).c(i8222);
                                                    break;
                                                case 14:
                                                    h1tVar2.f.c();
                                                    break;
                                                case 15:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 16:
                                                    h1tVar2.d.p(h1tVar2.a);
                                                    break;
                                                case 17:
                                                    h1tVar2.d.h(h1tVar2.a);
                                                    break;
                                                case 18:
                                                    uu5 uu5Var11 = h1tVar2.f;
                                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                    yab b7 = uu5Var11.b();
                                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                                    b7.getClass();
                                                    mqsVar7.getClass();
                                                    b7.a().A(mqsVar7);
                                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                                    j1tVar5.q(mqsVar7);
                                                    j1tVar5.c();
                                                    break;
                                                case 19:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 20:
                                                    uu5 uu5Var12 = h1tVar2.f;
                                                    ((j1t) uu5Var12.d).dismiss();
                                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                    break;
                                                case 21:
                                                    uu5 uu5Var13 = h1tVar2.f;
                                                    ((j1t) uu5Var13.d).dismiss();
                                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                    p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                                    p0tVar2.a(t75.c(mqsVar8), true);
                                                    n3m n3mVar = (n3m) uu5Var13.f;
                                                    mqsVar8.getClass();
                                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                    }
                                                    break;
                                                case 22:
                                                    h1tVar2.d.i(h1tVar2.a);
                                                    break;
                                                case 23:
                                                    uu5 uu5Var14 = h1tVar2.f;
                                                    ((j1t) uu5Var14.d).dismiss();
                                                    String t = weo.t();
                                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                                    mqsVar9.getClass();
                                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                    break;
                                                case 24:
                                                    uu5 uu5Var15 = h1tVar2.f;
                                                    ((j1t) uu5Var15.d).dismiss();
                                                    String t2 = weo.t();
                                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                                    mqsVar10.getClass();
                                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                    break;
                                                case 25:
                                                    h1tVar2.d.l(h1tVar2.a);
                                                    break;
                                                default:
                                                    h1tVar2.d.o(h1tVar2.a);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }));
                                }
                            }
                            final int i27 = 22;
                            b.add(new nl(new Function0(h1tVar) { // from class: e1t
                                public final /* synthetic */ h1t b;

                                {
                                    this.b = h1tVar;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    n7q n7qVar;
                                    mwk b3;
                                    int i62 = i27;
                                    h1t h1tVar2 = this.b;
                                    switch (i62) {
                                        case 0:
                                            h1tVar2.f.f();
                                            break;
                                        case 1:
                                            h1tVar2.f.e();
                                            break;
                                        case 2:
                                            h1tVar2.f.d();
                                            break;
                                        case 3:
                                            uu5 uu5Var4 = h1tVar2.f;
                                            boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                            j1t j1tVar = (j1t) uu5Var4.d;
                                            if (a) {
                                                j1tVar.b();
                                            } else {
                                                j1tVar.dismiss();
                                                vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                eca ecaVar = eca.d;
                                                vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                            }
                                            break;
                                        case 4:
                                            uu5 uu5Var5 = h1tVar2.f;
                                            ((j1t) uu5Var5.d).dismiss();
                                            vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                            eca ecaVar2 = eca.d;
                                            vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                            break;
                                        case 5:
                                            uu5 uu5Var6 = h1tVar2.f;
                                            ((j1t) uu5Var6.d).dismiss();
                                            vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                            eca ecaVar3 = eca.d;
                                            eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                            vbbVar3.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar3.a).c(i72);
                                            break;
                                        case 6:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 7:
                                            uu5 uu5Var7 = h1tVar2.f;
                                            ((qe3) uu5Var7.e).a(sjb.Undislike);
                                            yab b4 = uu5Var7.b();
                                            mqs mqsVar4 = (mqs) uu5Var7.a;
                                            b4.getClass();
                                            mqsVar4.getClass();
                                            b4.a().A(mqsVar4);
                                            j1t j1tVar2 = (j1t) uu5Var7.d;
                                            j1tVar2.d();
                                            j1tVar2.c();
                                            break;
                                        case 8:
                                            uu5 uu5Var8 = h1tVar2.f;
                                            ((qe3) uu5Var8.e).a(sjb.Dislike);
                                            yab b5 = uu5Var8.b();
                                            mqs mqsVar5 = (mqs) uu5Var8.a;
                                            b5.getClass();
                                            mqsVar5.getClass();
                                            b5.a().b(mqsVar5);
                                            fx fxVar = fx.b;
                                            gj gjVar = (gj) uu5Var8.b;
                                            if (gjVar != null) {
                                                ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                            }
                                            j1t j1tVar3 = (j1t) uu5Var8.d;
                                            j1tVar3.n();
                                            j1tVar3.c();
                                            break;
                                        case 9:
                                            h1tVar2.d.e(h1tVar2.a);
                                            break;
                                        case 10:
                                            uu5 uu5Var9 = h1tVar2.f;
                                            ((qe3) uu5Var9.e).a(sjb.Unlike);
                                            yab b6 = uu5Var9.b();
                                            mqs mqsVar6 = (mqs) uu5Var9.a;
                                            b6.getClass();
                                            mqsVar6.getClass();
                                            b6.a().A(mqsVar6);
                                            j1t j1tVar4 = (j1t) uu5Var9.d;
                                            j1tVar4.q(mqsVar6);
                                            j1tVar4.c();
                                            break;
                                        case 11:
                                            h1tVar2.f.f();
                                            break;
                                        case 12:
                                            h1tVar2.f.e();
                                            break;
                                        case 13:
                                            uu5 uu5Var10 = h1tVar2.f;
                                            ((j1t) uu5Var10.d).dismiss();
                                            vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                            eca ecaVar4 = eca.d;
                                            eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                            vbbVar4.d.a(sjb.DeleteDownload);
                                            ((taa) vbbVar4.a).c(i8222);
                                            break;
                                        case 14:
                                            h1tVar2.f.c();
                                            break;
                                        case 15:
                                            h1tVar2.d.f(h1tVar2.a);
                                            break;
                                        case 16:
                                            h1tVar2.d.p(h1tVar2.a);
                                            break;
                                        case 17:
                                            h1tVar2.d.h(h1tVar2.a);
                                            break;
                                        case 18:
                                            uu5 uu5Var11 = h1tVar2.f;
                                            ((qe3) uu5Var11.e).a(sjb.Unlike);
                                            yab b7 = uu5Var11.b();
                                            mqs mqsVar7 = (mqs) uu5Var11.a;
                                            b7.getClass();
                                            mqsVar7.getClass();
                                            b7.a().A(mqsVar7);
                                            j1t j1tVar5 = (j1t) uu5Var11.d;
                                            j1tVar5.q(mqsVar7);
                                            j1tVar5.c();
                                            break;
                                        case 19:
                                            h1tVar2.f.d();
                                            break;
                                        case 20:
                                            uu5 uu5Var12 = h1tVar2.f;
                                            ((j1t) uu5Var12.d).dismiss();
                                            ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                            ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                            break;
                                        case 21:
                                            uu5 uu5Var13 = h1tVar2.f;
                                            ((j1t) uu5Var13.d).dismiss();
                                            ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                            p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                            mqs mqsVar8 = (mqs) uu5Var13.a;
                                            p0tVar2.a(t75.c(mqsVar8), true);
                                            n3m n3mVar = (n3m) uu5Var13.f;
                                            mqsVar8.getClass();
                                            d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                            if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                            }
                                            break;
                                        case 22:
                                            h1tVar2.d.i(h1tVar2.a);
                                            break;
                                        case 23:
                                            uu5 uu5Var14 = h1tVar2.f;
                                            ((j1t) uu5Var14.d).dismiss();
                                            String t = weo.t();
                                            ((qe3) uu5Var14.e).c(xlb.Next, t);
                                            n3m n3mVar2 = (n3m) uu5Var14.f;
                                            mqs mqsVar9 = (mqs) uu5Var14.a;
                                            mqsVar9.getClass();
                                            ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                            break;
                                        case 24:
                                            uu5 uu5Var15 = h1tVar2.f;
                                            ((j1t) uu5Var15.d).dismiss();
                                            String t2 = weo.t();
                                            ((qe3) uu5Var15.e).c(xlb.End, t2);
                                            n3m n3mVar3 = (n3m) uu5Var15.f;
                                            mqs mqsVar10 = (mqs) uu5Var15.a;
                                            mqsVar10.getClass();
                                            ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                            break;
                                        case 25:
                                            h1tVar2.d.l(h1tVar2.a);
                                            break;
                                        default:
                                            h1tVar2.d.o(h1tVar2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }));
                            if (h) {
                                final int i28 = 23;
                                b.add(new bwk(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i28;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i8222);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar2.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                                final int i29 = 24;
                                b.add(new ul(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i29;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i8222);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar2.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                            }
                            if (!mqsVar.C()) {
                                hqs hqsVar = mqsVar.o;
                                if ((hqsVar != null && hqsVar.a) && h1tVar.j.a().b != u0j.a) {
                                    final int i30 = 25;
                                    b.add(new p3h(new Function0(h1tVar) { // from class: e1t
                                        public final /* synthetic */ h1t b;

                                        {
                                            this.b = h1tVar;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            n7q n7qVar;
                                            mwk b3;
                                            int i62 = i30;
                                            h1t h1tVar2 = this.b;
                                            switch (i62) {
                                                case 0:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 1:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 2:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 3:
                                                    uu5 uu5Var4 = h1tVar2.f;
                                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                    j1t j1tVar = (j1t) uu5Var4.d;
                                                    if (a) {
                                                        j1tVar.b();
                                                    } else {
                                                        j1tVar.dismiss();
                                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                        eca ecaVar = eca.d;
                                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                    }
                                                    break;
                                                case 4:
                                                    uu5 uu5Var5 = h1tVar2.f;
                                                    ((j1t) uu5Var5.d).dismiss();
                                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                    eca ecaVar2 = eca.d;
                                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                    break;
                                                case 5:
                                                    uu5 uu5Var6 = h1tVar2.f;
                                                    ((j1t) uu5Var6.d).dismiss();
                                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                    eca ecaVar3 = eca.d;
                                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                    vbbVar3.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar3.a).c(i72);
                                                    break;
                                                case 6:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 7:
                                                    uu5 uu5Var7 = h1tVar2.f;
                                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                    yab b4 = uu5Var7.b();
                                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                                    b4.getClass();
                                                    mqsVar4.getClass();
                                                    b4.a().A(mqsVar4);
                                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                                    j1tVar2.d();
                                                    j1tVar2.c();
                                                    break;
                                                case 8:
                                                    uu5 uu5Var8 = h1tVar2.f;
                                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                    yab b5 = uu5Var8.b();
                                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                                    b5.getClass();
                                                    mqsVar5.getClass();
                                                    b5.a().b(mqsVar5);
                                                    fx fxVar = fx.b;
                                                    gj gjVar = (gj) uu5Var8.b;
                                                    if (gjVar != null) {
                                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                    }
                                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                                    j1tVar3.n();
                                                    j1tVar3.c();
                                                    break;
                                                case 9:
                                                    h1tVar2.d.e(h1tVar2.a);
                                                    break;
                                                case 10:
                                                    uu5 uu5Var9 = h1tVar2.f;
                                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                    yab b6 = uu5Var9.b();
                                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                                    b6.getClass();
                                                    mqsVar6.getClass();
                                                    b6.a().A(mqsVar6);
                                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                                    j1tVar4.q(mqsVar6);
                                                    j1tVar4.c();
                                                    break;
                                                case 11:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 12:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 13:
                                                    uu5 uu5Var10 = h1tVar2.f;
                                                    ((j1t) uu5Var10.d).dismiss();
                                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                    eca ecaVar4 = eca.d;
                                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                    vbbVar4.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar4.a).c(i8222);
                                                    break;
                                                case 14:
                                                    h1tVar2.f.c();
                                                    break;
                                                case 15:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 16:
                                                    h1tVar2.d.p(h1tVar2.a);
                                                    break;
                                                case 17:
                                                    h1tVar2.d.h(h1tVar2.a);
                                                    break;
                                                case 18:
                                                    uu5 uu5Var11 = h1tVar2.f;
                                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                    yab b7 = uu5Var11.b();
                                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                                    b7.getClass();
                                                    mqsVar7.getClass();
                                                    b7.a().A(mqsVar7);
                                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                                    j1tVar5.q(mqsVar7);
                                                    j1tVar5.c();
                                                    break;
                                                case 19:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 20:
                                                    uu5 uu5Var12 = h1tVar2.f;
                                                    ((j1t) uu5Var12.d).dismiss();
                                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                    break;
                                                case 21:
                                                    uu5 uu5Var13 = h1tVar2.f;
                                                    ((j1t) uu5Var13.d).dismiss();
                                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                    p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                                    p0tVar2.a(t75.c(mqsVar8), true);
                                                    n3m n3mVar = (n3m) uu5Var13.f;
                                                    mqsVar8.getClass();
                                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                    }
                                                    break;
                                                case 22:
                                                    h1tVar2.d.i(h1tVar2.a);
                                                    break;
                                                case 23:
                                                    uu5 uu5Var14 = h1tVar2.f;
                                                    ((j1t) uu5Var14.d).dismiss();
                                                    String t = weo.t();
                                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                                    mqsVar9.getClass();
                                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                    break;
                                                case 24:
                                                    uu5 uu5Var15 = h1tVar2.f;
                                                    ((j1t) uu5Var15.d).dismiss();
                                                    String t2 = weo.t();
                                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                                    mqsVar10.getClass();
                                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                    break;
                                                case 25:
                                                    h1tVar2.d.l(h1tVar2.a);
                                                    break;
                                                default:
                                                    h1tVar2.d.o(h1tVar2.a);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }));
                                }
                            }
                            if (n1tVar.b && !h1tVar.i.a()) {
                                final int i31 = 26;
                                b.add(new c18(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i31;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i8222);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar2.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                            }
                            if (mqsVar.l() || mqsVar.C() || !z) {
                                y9aVar3 = y9aVar2;
                                n8gVar = b;
                                if (!Intrinsics.d(y9aVar3, u9a.a)) {
                                }
                                if (booleanValue) {
                                }
                                if (C) {
                                    b.add(g2);
                                }
                                final int i152 = 6;
                                b.add(new qws(new Function0(h1tVar) { // from class: e1t
                                    public final /* synthetic */ h1t b;

                                    {
                                        this.b = h1tVar;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n7q n7qVar;
                                        mwk b3;
                                        int i62 = i152;
                                        h1t h1tVar2 = this.b;
                                        switch (i62) {
                                            case 0:
                                                h1tVar2.f.f();
                                                break;
                                            case 1:
                                                h1tVar2.f.e();
                                                break;
                                            case 2:
                                                h1tVar2.f.d();
                                                break;
                                            case 3:
                                                uu5 uu5Var4 = h1tVar2.f;
                                                boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                j1t j1tVar = (j1t) uu5Var4.d;
                                                if (a) {
                                                    j1tVar.b();
                                                } else {
                                                    j1tVar.dismiss();
                                                    vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                    eca ecaVar = eca.d;
                                                    vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                }
                                                break;
                                            case 4:
                                                uu5 uu5Var5 = h1tVar2.f;
                                                ((j1t) uu5Var5.d).dismiss();
                                                vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                eca ecaVar2 = eca.d;
                                                vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                break;
                                            case 5:
                                                uu5 uu5Var6 = h1tVar2.f;
                                                ((j1t) uu5Var6.d).dismiss();
                                                vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                eca ecaVar3 = eca.d;
                                                eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                vbbVar3.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar3.a).c(i72);
                                                break;
                                            case 6:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 7:
                                                uu5 uu5Var7 = h1tVar2.f;
                                                ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                yab b4 = uu5Var7.b();
                                                mqs mqsVar4 = (mqs) uu5Var7.a;
                                                b4.getClass();
                                                mqsVar4.getClass();
                                                b4.a().A(mqsVar4);
                                                j1t j1tVar2 = (j1t) uu5Var7.d;
                                                j1tVar2.d();
                                                j1tVar2.c();
                                                break;
                                            case 8:
                                                uu5 uu5Var8 = h1tVar2.f;
                                                ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                yab b5 = uu5Var8.b();
                                                mqs mqsVar5 = (mqs) uu5Var8.a;
                                                b5.getClass();
                                                mqsVar5.getClass();
                                                b5.a().b(mqsVar5);
                                                fx fxVar = fx.b;
                                                gj gjVar = (gj) uu5Var8.b;
                                                if (gjVar != null) {
                                                    ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                }
                                                j1t j1tVar3 = (j1t) uu5Var8.d;
                                                j1tVar3.n();
                                                j1tVar3.c();
                                                break;
                                            case 9:
                                                h1tVar2.d.e(h1tVar2.a);
                                                break;
                                            case 10:
                                                uu5 uu5Var9 = h1tVar2.f;
                                                ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                yab b6 = uu5Var9.b();
                                                mqs mqsVar6 = (mqs) uu5Var9.a;
                                                b6.getClass();
                                                mqsVar6.getClass();
                                                b6.a().A(mqsVar6);
                                                j1t j1tVar4 = (j1t) uu5Var9.d;
                                                j1tVar4.q(mqsVar6);
                                                j1tVar4.c();
                                                break;
                                            case 11:
                                                h1tVar2.f.f();
                                                break;
                                            case 12:
                                                h1tVar2.f.e();
                                                break;
                                            case 13:
                                                uu5 uu5Var10 = h1tVar2.f;
                                                ((j1t) uu5Var10.d).dismiss();
                                                vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                eca ecaVar4 = eca.d;
                                                eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                vbbVar4.d.a(sjb.DeleteDownload);
                                                ((taa) vbbVar4.a).c(i8222);
                                                break;
                                            case 14:
                                                h1tVar2.f.c();
                                                break;
                                            case 15:
                                                h1tVar2.d.f(h1tVar2.a);
                                                break;
                                            case 16:
                                                h1tVar2.d.p(h1tVar2.a);
                                                break;
                                            case 17:
                                                h1tVar2.d.h(h1tVar2.a);
                                                break;
                                            case 18:
                                                uu5 uu5Var11 = h1tVar2.f;
                                                ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                yab b7 = uu5Var11.b();
                                                mqs mqsVar7 = (mqs) uu5Var11.a;
                                                b7.getClass();
                                                mqsVar7.getClass();
                                                b7.a().A(mqsVar7);
                                                j1t j1tVar5 = (j1t) uu5Var11.d;
                                                j1tVar5.q(mqsVar7);
                                                j1tVar5.c();
                                                break;
                                            case 19:
                                                h1tVar2.f.d();
                                                break;
                                            case 20:
                                                uu5 uu5Var12 = h1tVar2.f;
                                                ((j1t) uu5Var12.d).dismiss();
                                                ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                break;
                                            case 21:
                                                uu5 uu5Var13 = h1tVar2.f;
                                                ((j1t) uu5Var13.d).dismiss();
                                                ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                mqs mqsVar8 = (mqs) uu5Var13.a;
                                                p0tVar2.a(t75.c(mqsVar8), true);
                                                n3m n3mVar = (n3m) uu5Var13.f;
                                                mqsVar8.getClass();
                                                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                    ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                }
                                                break;
                                            case 22:
                                                h1tVar2.d.i(h1tVar2.a);
                                                break;
                                            case 23:
                                                uu5 uu5Var14 = h1tVar2.f;
                                                ((j1t) uu5Var14.d).dismiss();
                                                String t = weo.t();
                                                ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                n3m n3mVar2 = (n3m) uu5Var14.f;
                                                mqs mqsVar9 = (mqs) uu5Var14.a;
                                                mqsVar9.getClass();
                                                ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                break;
                                            case 24:
                                                uu5 uu5Var15 = h1tVar2.f;
                                                ((j1t) uu5Var15.d).dismiss();
                                                String t2 = weo.t();
                                                ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                n3m n3mVar3 = (n3m) uu5Var15.f;
                                                mqs mqsVar10 = (mqs) uu5Var15.a;
                                                mqsVar10.getClass();
                                                ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                break;
                                            case 25:
                                                h1tVar2.d.l(h1tVar2.a);
                                                break;
                                            default:
                                                h1tVar2.d.o(h1tVar2.a);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }));
                                if (!z) {
                                }
                                if (!wyf.L(mqsVar)) {
                                }
                                serializable = t75.a(n8gVar);
                            } else {
                                if (oqVar3 == null) {
                                    Parcelable.Creator<oq> creator2 = oq.CREATOR;
                                    oqVar = cxb.O(mqsVar);
                                } else {
                                    oqVar = oqVar3;
                                }
                                g1tVar.j = y9aVar2;
                                g1tVar.k = j1gVar3;
                                g1tVar.l = b;
                                g1tVar.m = b;
                                g1tVar.n = z;
                                g1tVar.o = booleanValue;
                                g1tVar.p = C;
                                g1tVar.s = 3;
                                Object h3 = yabVar.a().h(oqVar, g1tVar);
                                if (h3 != serializable) {
                                    z2 = booleanValue;
                                    obj = h3;
                                    z3 = z;
                                    y9aVar3 = y9aVar2;
                                    n8gVar2 = b;
                                    n8gVar = n8gVar2;
                                    z4 = C;
                                    booleanValue3 = ((Boolean) obj).booleanValue();
                                    final int i102 = 1;
                                    if (!booleanValue3) {
                                    }
                                    C = z4;
                                    booleanValue = z2;
                                    b = n8gVar2;
                                    z = z3;
                                    if (!Intrinsics.d(y9aVar3, u9a.a)) {
                                    }
                                    if (booleanValue) {
                                    }
                                    if (C) {
                                    }
                                    final int i1522 = 6;
                                    b.add(new qws(new Function0(h1tVar) { // from class: e1t
                                        public final /* synthetic */ h1t b;

                                        {
                                            this.b = h1tVar;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            n7q n7qVar;
                                            mwk b3;
                                            int i62 = i1522;
                                            h1t h1tVar2 = this.b;
                                            switch (i62) {
                                                case 0:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 1:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 2:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 3:
                                                    uu5 uu5Var4 = h1tVar2.f;
                                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                                    j1t j1tVar = (j1t) uu5Var4.d;
                                                    if (a) {
                                                        j1tVar.b();
                                                    } else {
                                                        j1tVar.dismiss();
                                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                                        eca ecaVar = eca.d;
                                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                                    }
                                                    break;
                                                case 4:
                                                    uu5 uu5Var5 = h1tVar2.f;
                                                    ((j1t) uu5Var5.d).dismiss();
                                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                                    eca ecaVar2 = eca.d;
                                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                                    break;
                                                case 5:
                                                    uu5 uu5Var6 = h1tVar2.f;
                                                    ((j1t) uu5Var6.d).dismiss();
                                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                                    eca ecaVar3 = eca.d;
                                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                                    vbbVar3.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar3.a).c(i72);
                                                    break;
                                                case 6:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 7:
                                                    uu5 uu5Var7 = h1tVar2.f;
                                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                                    yab b4 = uu5Var7.b();
                                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                                    b4.getClass();
                                                    mqsVar4.getClass();
                                                    b4.a().A(mqsVar4);
                                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                                    j1tVar2.d();
                                                    j1tVar2.c();
                                                    break;
                                                case 8:
                                                    uu5 uu5Var8 = h1tVar2.f;
                                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                                    yab b5 = uu5Var8.b();
                                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                                    b5.getClass();
                                                    mqsVar5.getClass();
                                                    b5.a().b(mqsVar5);
                                                    fx fxVar = fx.b;
                                                    gj gjVar = (gj) uu5Var8.b;
                                                    if (gjVar != null) {
                                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                                    }
                                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                                    j1tVar3.n();
                                                    j1tVar3.c();
                                                    break;
                                                case 9:
                                                    h1tVar2.d.e(h1tVar2.a);
                                                    break;
                                                case 10:
                                                    uu5 uu5Var9 = h1tVar2.f;
                                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                                    yab b6 = uu5Var9.b();
                                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                                    b6.getClass();
                                                    mqsVar6.getClass();
                                                    b6.a().A(mqsVar6);
                                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                                    j1tVar4.q(mqsVar6);
                                                    j1tVar4.c();
                                                    break;
                                                case 11:
                                                    h1tVar2.f.f();
                                                    break;
                                                case 12:
                                                    h1tVar2.f.e();
                                                    break;
                                                case 13:
                                                    uu5 uu5Var10 = h1tVar2.f;
                                                    ((j1t) uu5Var10.d).dismiss();
                                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                                    eca ecaVar4 = eca.d;
                                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                                    vbbVar4.d.a(sjb.DeleteDownload);
                                                    ((taa) vbbVar4.a).c(i8222);
                                                    break;
                                                case 14:
                                                    h1tVar2.f.c();
                                                    break;
                                                case 15:
                                                    h1tVar2.d.f(h1tVar2.a);
                                                    break;
                                                case 16:
                                                    h1tVar2.d.p(h1tVar2.a);
                                                    break;
                                                case 17:
                                                    h1tVar2.d.h(h1tVar2.a);
                                                    break;
                                                case 18:
                                                    uu5 uu5Var11 = h1tVar2.f;
                                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                                    yab b7 = uu5Var11.b();
                                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                                    b7.getClass();
                                                    mqsVar7.getClass();
                                                    b7.a().A(mqsVar7);
                                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                                    j1tVar5.q(mqsVar7);
                                                    j1tVar5.c();
                                                    break;
                                                case 19:
                                                    h1tVar2.f.d();
                                                    break;
                                                case 20:
                                                    uu5 uu5Var12 = h1tVar2.f;
                                                    ((j1t) uu5Var12.d).dismiss();
                                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                                    break;
                                                case 21:
                                                    uu5 uu5Var13 = h1tVar2.f;
                                                    ((j1t) uu5Var13.d).dismiss();
                                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                                    p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                                    p0tVar2.a(t75.c(mqsVar8), true);
                                                    n3m n3mVar = (n3m) uu5Var13.f;
                                                    mqsVar8.getClass();
                                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                                    }
                                                    break;
                                                case 22:
                                                    h1tVar2.d.i(h1tVar2.a);
                                                    break;
                                                case 23:
                                                    uu5 uu5Var14 = h1tVar2.f;
                                                    ((j1t) uu5Var14.d).dismiss();
                                                    String t = weo.t();
                                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                                    mqsVar9.getClass();
                                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                                    break;
                                                case 24:
                                                    uu5 uu5Var15 = h1tVar2.f;
                                                    ((j1t) uu5Var15.d).dismiss();
                                                    String t2 = weo.t();
                                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                                    mqsVar10.getClass();
                                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                                    break;
                                                case 25:
                                                    h1tVar2.d.l(h1tVar2.a);
                                                    break;
                                                default:
                                                    h1tVar2.d.o(h1tVar2.a);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }));
                                    if (!z) {
                                    }
                                    if (!wyf.L(mqsVar)) {
                                    }
                                    serializable = t75.a(n8gVar);
                                }
                            }
                        }
                    } else {
                        mqsVar = mqsVar3;
                    }
                    uu5Var = uu5Var3;
                    if (f1t.a[j1gVar3.ordinal()] != 1) {
                    }
                    if (mqsVar.l) {
                    }
                    final int i272 = 22;
                    b.add(new nl(new Function0(h1tVar) { // from class: e1t
                        public final /* synthetic */ h1t b;

                        {
                            this.b = h1tVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            n7q n7qVar;
                            mwk b3;
                            int i62 = i272;
                            h1t h1tVar2 = this.b;
                            switch (i62) {
                                case 0:
                                    h1tVar2.f.f();
                                    break;
                                case 1:
                                    h1tVar2.f.e();
                                    break;
                                case 2:
                                    h1tVar2.f.d();
                                    break;
                                case 3:
                                    uu5 uu5Var4 = h1tVar2.f;
                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                    j1t j1tVar = (j1t) uu5Var4.d;
                                    if (a) {
                                        j1tVar.b();
                                    } else {
                                        j1tVar.dismiss();
                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                        eca ecaVar = eca.d;
                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                    }
                                    break;
                                case 4:
                                    uu5 uu5Var5 = h1tVar2.f;
                                    ((j1t) uu5Var5.d).dismiss();
                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                    eca ecaVar2 = eca.d;
                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                    break;
                                case 5:
                                    uu5 uu5Var6 = h1tVar2.f;
                                    ((j1t) uu5Var6.d).dismiss();
                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                    eca ecaVar3 = eca.d;
                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                    vbbVar3.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar3.a).c(i72);
                                    break;
                                case 6:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 7:
                                    uu5 uu5Var7 = h1tVar2.f;
                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                    yab b4 = uu5Var7.b();
                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                    b4.getClass();
                                    mqsVar4.getClass();
                                    b4.a().A(mqsVar4);
                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                    j1tVar2.d();
                                    j1tVar2.c();
                                    break;
                                case 8:
                                    uu5 uu5Var8 = h1tVar2.f;
                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                    yab b5 = uu5Var8.b();
                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                    b5.getClass();
                                    mqsVar5.getClass();
                                    b5.a().b(mqsVar5);
                                    fx fxVar = fx.b;
                                    gj gjVar = (gj) uu5Var8.b;
                                    if (gjVar != null) {
                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                    }
                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                    j1tVar3.n();
                                    j1tVar3.c();
                                    break;
                                case 9:
                                    h1tVar2.d.e(h1tVar2.a);
                                    break;
                                case 10:
                                    uu5 uu5Var9 = h1tVar2.f;
                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                    yab b6 = uu5Var9.b();
                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                    b6.getClass();
                                    mqsVar6.getClass();
                                    b6.a().A(mqsVar6);
                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                    j1tVar4.q(mqsVar6);
                                    j1tVar4.c();
                                    break;
                                case 11:
                                    h1tVar2.f.f();
                                    break;
                                case 12:
                                    h1tVar2.f.e();
                                    break;
                                case 13:
                                    uu5 uu5Var10 = h1tVar2.f;
                                    ((j1t) uu5Var10.d).dismiss();
                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                    eca ecaVar4 = eca.d;
                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                    vbbVar4.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar4.a).c(i8222);
                                    break;
                                case 14:
                                    h1tVar2.f.c();
                                    break;
                                case 15:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 16:
                                    h1tVar2.d.p(h1tVar2.a);
                                    break;
                                case 17:
                                    h1tVar2.d.h(h1tVar2.a);
                                    break;
                                case 18:
                                    uu5 uu5Var11 = h1tVar2.f;
                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                    yab b7 = uu5Var11.b();
                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                    b7.getClass();
                                    mqsVar7.getClass();
                                    b7.a().A(mqsVar7);
                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                    j1tVar5.q(mqsVar7);
                                    j1tVar5.c();
                                    break;
                                case 19:
                                    h1tVar2.f.d();
                                    break;
                                case 20:
                                    uu5 uu5Var12 = h1tVar2.f;
                                    ((j1t) uu5Var12.d).dismiss();
                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                    break;
                                case 21:
                                    uu5 uu5Var13 = h1tVar2.f;
                                    ((j1t) uu5Var13.d).dismiss();
                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                    p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                    p0tVar2.a(t75.c(mqsVar8), true);
                                    n3m n3mVar = (n3m) uu5Var13.f;
                                    mqsVar8.getClass();
                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                    }
                                    break;
                                case 22:
                                    h1tVar2.d.i(h1tVar2.a);
                                    break;
                                case 23:
                                    uu5 uu5Var14 = h1tVar2.f;
                                    ((j1t) uu5Var14.d).dismiss();
                                    String t = weo.t();
                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                    mqsVar9.getClass();
                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                    break;
                                case 24:
                                    uu5 uu5Var15 = h1tVar2.f;
                                    ((j1t) uu5Var15.d).dismiss();
                                    String t2 = weo.t();
                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                    mqsVar10.getClass();
                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                    break;
                                case 25:
                                    h1tVar2.d.l(h1tVar2.a);
                                    break;
                                default:
                                    h1tVar2.d.o(h1tVar2.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    }));
                    if (h) {
                    }
                    if (!mqsVar.C()) {
                    }
                    if (n1tVar.b) {
                        final int i312 = 26;
                        b.add(new c18(new Function0(h1tVar) { // from class: e1t
                            public final /* synthetic */ h1t b;

                            {
                                this.b = h1tVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n7q n7qVar;
                                mwk b3;
                                int i62 = i312;
                                h1t h1tVar2 = this.b;
                                switch (i62) {
                                    case 0:
                                        h1tVar2.f.f();
                                        break;
                                    case 1:
                                        h1tVar2.f.e();
                                        break;
                                    case 2:
                                        h1tVar2.f.d();
                                        break;
                                    case 3:
                                        uu5 uu5Var4 = h1tVar2.f;
                                        boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                        j1t j1tVar = (j1t) uu5Var4.d;
                                        if (a) {
                                            j1tVar.b();
                                        } else {
                                            j1tVar.dismiss();
                                            vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                            eca ecaVar = eca.d;
                                            vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                        }
                                        break;
                                    case 4:
                                        uu5 uu5Var5 = h1tVar2.f;
                                        ((j1t) uu5Var5.d).dismiss();
                                        vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                        eca ecaVar2 = eca.d;
                                        vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                        break;
                                    case 5:
                                        uu5 uu5Var6 = h1tVar2.f;
                                        ((j1t) uu5Var6.d).dismiss();
                                        vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                        eca ecaVar3 = eca.d;
                                        eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                        vbbVar3.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar3.a).c(i72);
                                        break;
                                    case 6:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 7:
                                        uu5 uu5Var7 = h1tVar2.f;
                                        ((qe3) uu5Var7.e).a(sjb.Undislike);
                                        yab b4 = uu5Var7.b();
                                        mqs mqsVar4 = (mqs) uu5Var7.a;
                                        b4.getClass();
                                        mqsVar4.getClass();
                                        b4.a().A(mqsVar4);
                                        j1t j1tVar2 = (j1t) uu5Var7.d;
                                        j1tVar2.d();
                                        j1tVar2.c();
                                        break;
                                    case 8:
                                        uu5 uu5Var8 = h1tVar2.f;
                                        ((qe3) uu5Var8.e).a(sjb.Dislike);
                                        yab b5 = uu5Var8.b();
                                        mqs mqsVar5 = (mqs) uu5Var8.a;
                                        b5.getClass();
                                        mqsVar5.getClass();
                                        b5.a().b(mqsVar5);
                                        fx fxVar = fx.b;
                                        gj gjVar = (gj) uu5Var8.b;
                                        if (gjVar != null) {
                                            ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                        }
                                        j1t j1tVar3 = (j1t) uu5Var8.d;
                                        j1tVar3.n();
                                        j1tVar3.c();
                                        break;
                                    case 9:
                                        h1tVar2.d.e(h1tVar2.a);
                                        break;
                                    case 10:
                                        uu5 uu5Var9 = h1tVar2.f;
                                        ((qe3) uu5Var9.e).a(sjb.Unlike);
                                        yab b6 = uu5Var9.b();
                                        mqs mqsVar6 = (mqs) uu5Var9.a;
                                        b6.getClass();
                                        mqsVar6.getClass();
                                        b6.a().A(mqsVar6);
                                        j1t j1tVar4 = (j1t) uu5Var9.d;
                                        j1tVar4.q(mqsVar6);
                                        j1tVar4.c();
                                        break;
                                    case 11:
                                        h1tVar2.f.f();
                                        break;
                                    case 12:
                                        h1tVar2.f.e();
                                        break;
                                    case 13:
                                        uu5 uu5Var10 = h1tVar2.f;
                                        ((j1t) uu5Var10.d).dismiss();
                                        vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                        eca ecaVar4 = eca.d;
                                        eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                        vbbVar4.d.a(sjb.DeleteDownload);
                                        ((taa) vbbVar4.a).c(i8222);
                                        break;
                                    case 14:
                                        h1tVar2.f.c();
                                        break;
                                    case 15:
                                        h1tVar2.d.f(h1tVar2.a);
                                        break;
                                    case 16:
                                        h1tVar2.d.p(h1tVar2.a);
                                        break;
                                    case 17:
                                        h1tVar2.d.h(h1tVar2.a);
                                        break;
                                    case 18:
                                        uu5 uu5Var11 = h1tVar2.f;
                                        ((qe3) uu5Var11.e).a(sjb.Unlike);
                                        yab b7 = uu5Var11.b();
                                        mqs mqsVar7 = (mqs) uu5Var11.a;
                                        b7.getClass();
                                        mqsVar7.getClass();
                                        b7.a().A(mqsVar7);
                                        j1t j1tVar5 = (j1t) uu5Var11.d;
                                        j1tVar5.q(mqsVar7);
                                        j1tVar5.c();
                                        break;
                                    case 19:
                                        h1tVar2.f.d();
                                        break;
                                    case 20:
                                        uu5 uu5Var12 = h1tVar2.f;
                                        ((j1t) uu5Var12.d).dismiss();
                                        ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                        ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                        break;
                                    case 21:
                                        uu5 uu5Var13 = h1tVar2.f;
                                        ((j1t) uu5Var13.d).dismiss();
                                        ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                        p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                        mqs mqsVar8 = (mqs) uu5Var13.a;
                                        p0tVar2.a(t75.c(mqsVar8), true);
                                        n3m n3mVar = (n3m) uu5Var13.f;
                                        mqsVar8.getClass();
                                        d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                        if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                            ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                        }
                                        break;
                                    case 22:
                                        h1tVar2.d.i(h1tVar2.a);
                                        break;
                                    case 23:
                                        uu5 uu5Var14 = h1tVar2.f;
                                        ((j1t) uu5Var14.d).dismiss();
                                        String t = weo.t();
                                        ((qe3) uu5Var14.e).c(xlb.Next, t);
                                        n3m n3mVar2 = (n3m) uu5Var14.f;
                                        mqs mqsVar9 = (mqs) uu5Var14.a;
                                        mqsVar9.getClass();
                                        ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                        break;
                                    case 24:
                                        uu5 uu5Var15 = h1tVar2.f;
                                        ((j1t) uu5Var15.d).dismiss();
                                        String t2 = weo.t();
                                        ((qe3) uu5Var15.e).c(xlb.End, t2);
                                        n3m n3mVar3 = (n3m) uu5Var15.f;
                                        mqs mqsVar10 = (mqs) uu5Var15.a;
                                        mqsVar10.getClass();
                                        ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                        break;
                                    case 25:
                                        h1tVar2.d.l(h1tVar2.a);
                                        break;
                                    default:
                                        h1tVar2.d.o(h1tVar2.a);
                                        break;
                                }
                                return Unit.a;
                            }
                        }));
                    }
                    if (mqsVar.l()) {
                    }
                    y9aVar3 = y9aVar2;
                    n8gVar = b;
                    if (!Intrinsics.d(y9aVar3, u9a.a)) {
                    }
                    if (booleanValue) {
                    }
                    if (C) {
                    }
                    final int i15222 = 6;
                    b.add(new qws(new Function0(h1tVar) { // from class: e1t
                        public final /* synthetic */ h1t b;

                        {
                            this.b = h1tVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            n7q n7qVar;
                            mwk b3;
                            int i62 = i15222;
                            h1t h1tVar2 = this.b;
                            switch (i62) {
                                case 0:
                                    h1tVar2.f.f();
                                    break;
                                case 1:
                                    h1tVar2.f.e();
                                    break;
                                case 2:
                                    h1tVar2.f.d();
                                    break;
                                case 3:
                                    uu5 uu5Var4 = h1tVar2.f;
                                    boolean a = ((lwc) ((jyr) uu5Var4.k).getValue()).a();
                                    j1t j1tVar = (j1t) uu5Var4.d;
                                    if (a) {
                                        j1tVar.b();
                                    } else {
                                        j1tVar.dismiss();
                                        vbb vbbVar = (vbb) ((jyr) uu5Var4.g).getValue();
                                        eca ecaVar = eca.d;
                                        vbbVar.a(d51.i((mqs) uu5Var4.a, (fvs) uu5Var4.c), new zhs(0, j1tVar, j1t.class, "showConnectivityError", "showConnectivityError()V", 0, 13));
                                    }
                                    break;
                                case 4:
                                    uu5 uu5Var5 = h1tVar2.f;
                                    ((j1t) uu5Var5.d).dismiss();
                                    vbb vbbVar2 = (vbb) ((jyr) uu5Var5.g).getValue();
                                    eca ecaVar2 = eca.d;
                                    vbbVar2.b(d51.i((mqs) uu5Var5.a, (fvs) uu5Var5.c));
                                    break;
                                case 5:
                                    uu5 uu5Var6 = h1tVar2.f;
                                    ((j1t) uu5Var6.d).dismiss();
                                    vbb vbbVar3 = (vbb) ((jyr) uu5Var6.g).getValue();
                                    eca ecaVar3 = eca.d;
                                    eca i72 = d51.i((mqs) uu5Var6.a, (fvs) uu5Var6.c);
                                    vbbVar3.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar3.a).c(i72);
                                    break;
                                case 6:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 7:
                                    uu5 uu5Var7 = h1tVar2.f;
                                    ((qe3) uu5Var7.e).a(sjb.Undislike);
                                    yab b4 = uu5Var7.b();
                                    mqs mqsVar4 = (mqs) uu5Var7.a;
                                    b4.getClass();
                                    mqsVar4.getClass();
                                    b4.a().A(mqsVar4);
                                    j1t j1tVar2 = (j1t) uu5Var7.d;
                                    j1tVar2.d();
                                    j1tVar2.c();
                                    break;
                                case 8:
                                    uu5 uu5Var8 = h1tVar2.f;
                                    ((qe3) uu5Var8.e).a(sjb.Dislike);
                                    yab b5 = uu5Var8.b();
                                    mqs mqsVar5 = (mqs) uu5Var8.a;
                                    b5.getClass();
                                    mqsVar5.getClass();
                                    b5.a().b(mqsVar5);
                                    fx fxVar = fx.b;
                                    gj gjVar = (gj) uu5Var8.b;
                                    if (gjVar != null) {
                                        ((gx) ((jyr) uu5Var8.j).getValue()).a(fxVar, mqsVar5.a, gjVar);
                                    }
                                    j1t j1tVar3 = (j1t) uu5Var8.d;
                                    j1tVar3.n();
                                    j1tVar3.c();
                                    break;
                                case 9:
                                    h1tVar2.d.e(h1tVar2.a);
                                    break;
                                case 10:
                                    uu5 uu5Var9 = h1tVar2.f;
                                    ((qe3) uu5Var9.e).a(sjb.Unlike);
                                    yab b6 = uu5Var9.b();
                                    mqs mqsVar6 = (mqs) uu5Var9.a;
                                    b6.getClass();
                                    mqsVar6.getClass();
                                    b6.a().A(mqsVar6);
                                    j1t j1tVar4 = (j1t) uu5Var9.d;
                                    j1tVar4.q(mqsVar6);
                                    j1tVar4.c();
                                    break;
                                case 11:
                                    h1tVar2.f.f();
                                    break;
                                case 12:
                                    h1tVar2.f.e();
                                    break;
                                case 13:
                                    uu5 uu5Var10 = h1tVar2.f;
                                    ((j1t) uu5Var10.d).dismiss();
                                    vbb vbbVar4 = (vbb) ((jyr) uu5Var10.g).getValue();
                                    eca ecaVar4 = eca.d;
                                    eca i8222 = d51.i((mqs) uu5Var10.a, (fvs) uu5Var10.c);
                                    vbbVar4.d.a(sjb.DeleteDownload);
                                    ((taa) vbbVar4.a).c(i8222);
                                    break;
                                case 14:
                                    h1tVar2.f.c();
                                    break;
                                case 15:
                                    h1tVar2.d.f(h1tVar2.a);
                                    break;
                                case 16:
                                    h1tVar2.d.p(h1tVar2.a);
                                    break;
                                case 17:
                                    h1tVar2.d.h(h1tVar2.a);
                                    break;
                                case 18:
                                    uu5 uu5Var11 = h1tVar2.f;
                                    ((qe3) uu5Var11.e).a(sjb.Unlike);
                                    yab b7 = uu5Var11.b();
                                    mqs mqsVar7 = (mqs) uu5Var11.a;
                                    b7.getClass();
                                    mqsVar7.getClass();
                                    b7.a().A(mqsVar7);
                                    j1t j1tVar5 = (j1t) uu5Var11.d;
                                    j1tVar5.q(mqsVar7);
                                    j1tVar5.c();
                                    break;
                                case 19:
                                    h1tVar2.f.d();
                                    break;
                                case 20:
                                    uu5 uu5Var12 = h1tVar2.f;
                                    ((j1t) uu5Var12.d).dismiss();
                                    ((qe3) uu5Var12.e).a(sjb.MarkAsUnlistened);
                                    ((p0t) ((jyr) uu5Var12.i).getValue()).a(t75.c((mqs) uu5Var12.a), false);
                                    break;
                                case 21:
                                    uu5 uu5Var13 = h1tVar2.f;
                                    ((j1t) uu5Var13.d).dismiss();
                                    ((qe3) uu5Var13.e).a(sjb.MarkAsListened);
                                    p0t p0tVar2 = (p0t) ((jyr) uu5Var13.i).getValue();
                                    mqs mqsVar8 = (mqs) uu5Var13.a;
                                    p0tVar2.a(t75.c(mqsVar8), true);
                                    n3m n3mVar = (n3m) uu5Var13.f;
                                    mqsVar8.getClass();
                                    d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                                    if (mqsVar8.equals((x == null || (n7qVar = x.a) == null || (b3 = n7qVar.b()) == null) ? null : b3.a())) {
                                        ((k1l) n3mVar.c).a(new SkipCommand(), new b3t("queue_skip"));
                                    }
                                    break;
                                case 22:
                                    h1tVar2.d.i(h1tVar2.a);
                                    break;
                                case 23:
                                    uu5 uu5Var14 = h1tVar2.f;
                                    ((j1t) uu5Var14.d).dismiss();
                                    String t = weo.t();
                                    ((qe3) uu5Var14.e).c(xlb.Next, t);
                                    n3m n3mVar2 = (n3m) uu5Var14.f;
                                    mqs mqsVar9 = (mqs) uu5Var14.a;
                                    mqsVar9.getClass();
                                    ((k1l) n3mVar2.c).a(new AddPlayablesAsNextCommand(n3mVar2.F0(t, mqsVar9)), new b3t("queue_add"));
                                    break;
                                case 24:
                                    uu5 uu5Var15 = h1tVar2.f;
                                    ((j1t) uu5Var15.d).dismiss();
                                    String t2 = weo.t();
                                    ((qe3) uu5Var15.e).c(xlb.End, t2);
                                    n3m n3mVar3 = (n3m) uu5Var15.f;
                                    mqs mqsVar10 = (mqs) uu5Var15.a;
                                    mqsVar10.getClass();
                                    ((k1l) n3mVar3.c).a(new AddPlayablesAsLastCommand(n3mVar3.F0(t2, mqsVar10)), new b3t("queue_add"));
                                    break;
                                case 25:
                                    h1tVar2.d.l(h1tVar2.a);
                                    break;
                                default:
                                    h1tVar2.d.o(h1tVar2.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    }));
                    if (!z) {
                    }
                    if (!wyf.L(mqsVar)) {
                    }
                    serializable = t75.a(n8gVar);
                }
                return serializable;
            }
        }
        g1tVar = new g1t(h1tVar, cg6Var);
        Object obj2 = g1tVar.q;
        Serializable serializable2 = nm6.a;
        i = g1tVar.s;
        x9a x9aVar2 = x9a.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        C = m1tVar.C(mqsVar3, i3);
        boolean h4 = m1tVar.h();
        dg2Var = mqsVar3.k;
        oq oqVar32 = mqsVar3.t;
        if (dg2Var == dg2.b) {
        }
        return serializable2;
    }

    @Override // defpackage.tbb
    public final pjc a() {
        bab babVar = (bab) this.m.getValue();
        eca ecaVar = eca.d;
        fvs fvsVar = this.b;
        mqs mqsVar = this.a;
        fs a = babVar.a(d51.i(mqsVar, fvsVar));
        yab yabVar = this.g;
        yabVar.getClass();
        return new u21(10, a, yabVar.a().w(mqsVar), new cle(this, (Continuation) null, 26));
    }
}
