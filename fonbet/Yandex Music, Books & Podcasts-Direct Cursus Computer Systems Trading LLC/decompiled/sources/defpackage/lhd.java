package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.GsonBuilder;
import com.yandex.music.core.job.JobService;
import com.yandex.music.screen.landing.api.header.ui.view.HeaderContentViewFrameLayout;
import com.yandex.music.shared.skeleton.data.core.api.skeleton.SkeletonJsonAdapter;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes5.dex */
public final /* synthetic */ class lhd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lhd(htd htdVar, ntd ntdVar) {
        this.a = 1;
        this.b = ntdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = 1;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ssg.a(3, null, "close discovery", null);
                ((zi3) this.b).o((Throwable) obj, false);
                return Unit.a;
            case 1:
                ntd ntdVar = (ntd) this.b;
                ftd ftdVar = (ftd) obj;
                ftdVar.getClass();
                return Boolean.valueOf(ntdVar == null || ftdVar.c.e() < 0.0f);
            case 2:
                HeaderContentViewFrameLayout headerContentViewFrameLayout = (HeaderContentViewFrameLayout) this.b;
                String str = (String) obj;
                int i2 = HeaderContentViewFrameLayout.h;
                str.getClass();
                Function1<String, Unit> clickListener = headerContentViewFrameLayout.getClickListener();
                if (clickListener != null) {
                    clickListener.invoke(str);
                }
                return Unit.a;
            case 3:
                j2e j2eVar = (j2e) this.b;
                ((Boolean) obj).getClass();
                j2eVar.a.S();
                return Unit.a;
            case 4:
                s2e s2eVar = (s2e) this.b;
                ((View) obj).getClass();
                return Boolean.valueOf(!(s2eVar.k().j != null ? ((Boolean) r10.o.getValue()).booleanValue() : false));
            case 5:
                u3e u3eVar = (u3e) this.b;
                ((List) obj).getClass();
                return y5g.y0(u3eVar.c, o3q.b);
            case 6:
                e00 e00Var = (e00) this.b;
                ((l13) obj).getClass();
                return (nfe) ((bge) e00Var.b).a.getValue();
            case 7:
                khe kheVar = (khe) this.b;
                ehe eheVar = (ehe) obj;
                eheVar.getClass();
                kheVar.c(eheVar);
                return Unit.a;
            case 8:
                np2 np2Var = (np2) this.b;
                ((Resources) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(uy7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ou0 ou0Var = np2Var.b;
                if (ou0Var != null) {
                    return Boolean.valueOf(ou0Var == ou0.c);
                }
                Intrinsics.j("appTheme");
                throw null;
            case 9:
                hmm.a[] aVarArr = (hmm.a[]) this.b;
                lpi lpiVar = (lpi) obj;
                lpiVar.getClass();
                for (hmm.a aVar : aVarArr) {
                    lpiVar.f(aVar);
                }
                return Unit.a;
            case 10:
                u2f u2fVar = (u2f) this.b;
                s2f s2fVar = (s2f) obj;
                s2fVar.getClass();
                JobService jobService = u2fVar.d;
                if (jobService != null) {
                    jobService.jobFinished(s2fVar.a(), false);
                }
                l1b.f(u2fVar.a).cancel(s2fVar.a().getJobId());
                u2fVar.b.remove(Integer.valueOf(s2fVar.a().getJobId()));
                return Unit.a;
            case 11:
                s7f s7fVar = (s7f) this.b;
                Object obj2 = ((ArrayList) s7fVar.h).get(((Integer) obj).intValue() - 1);
                obj2.getClass();
                ((lhd) s7fVar.f).invoke((evl) obj2);
                return Unit.a;
            case 12:
                w7f w7fVar = (w7f) this.b;
                evl evlVar = (evl) obj;
                evlVar.getClass();
                w7fVar.c.invoke(evlVar);
                return Unit.a;
            case 13:
                x7f x7fVar = (x7f) this.b;
                ze3 ze3Var = (ze3) obj;
                ze3Var.getClass();
                View findViewById = ze3Var.findViewById(R.id.design_bottom_sheet);
                if (findViewById == null) {
                    Assertions.throwOrSkip$default(new FailedAssertionException("Can't find bottom sheet behavior view"), null, 2, null);
                    x7fVar.dismiss();
                    return Unit.a;
                }
                BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
                x7fVar.A(from);
                x7fVar.k = from;
                findViewById.setBackground(null);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 27) {
                    Context context = x7fVar.getContext();
                    context.getClass();
                    sht.a(context, ze3Var);
                }
                if (i3 >= 35) {
                    int paddingTop = findViewById.getPaddingTop();
                    Context context2 = x7fVar.getContext();
                    context2.getClass();
                    findViewById.setPadding(findViewById.getPaddingLeft(), qdq.t(context2) + paddingTop, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                }
                return Unit.a;
            case 14:
                z8f z8fVar = (z8f) this.b;
                ((Boolean) obj).getClass();
                x97.y(hld.s((rjq) z8fVar.h, dm6.b()), null, null, new s8f(z8fVar, objArr == true ? 1 : 0, i), 3);
                return Unit.a;
            case 15:
                jef jefVar = (jef) this.b;
                ((Boolean) obj).getClass();
                jefVar.b.S();
                return Unit.a;
            case 16:
                e00 e00Var2 = (e00) this.b;
                ((l13) obj).getClass();
                return (yff) ((lgf) e00Var2.b).a.getValue();
            case 17:
                cjf cjfVar = (cjf) this.b;
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(inq.class, new SkeletonJsonAdapter(cjfVar.c));
                return Unit.a;
            case 18:
                t6k t6kVar = (t6k) this.b;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.k(t6kVar.e());
                zcoVar.n(t6kVar.e());
                return Unit.a;
            case 19:
                w3g w3gVar = (w3g) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, w3gVar.b);
                return Unit.a;
            case 20:
                t1f t1fVar = (t1f) this.b;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                int i4 = ArtistScreenActivity.w0;
                Context context3 = (Context) t1fVar.b;
                context3.startActivity(l48.p(context3, u51Var, null, null, 24));
                return Unit.a;
            case 21:
                Regex regex = (Regex) this.b;
                String str2 = (String) obj;
                str2.getClass();
                jch d = regex.d(str2);
                if (d == null) {
                    return null;
                }
                fb9 fb9Var = (fb9) d.a();
                Long s0 = StringsKt.s0((String) fb9Var.get(1));
                if (s0 == null) {
                    return null;
                }
                long longValue = s0.longValue();
                Long s02 = StringsKt.s0((String) fb9Var.get(2));
                if (s02 == null) {
                    return null;
                }
                long longValue2 = s02.longValue();
                Long s03 = StringsKt.s0((String) fb9Var.get(3));
                if (s03 == null) {
                    return null;
                }
                long j2 = 1000;
                return new wwr((s03.longValue() * 10) + (longValue2 * j2) + (longValue * 60 * j2), StringsKt.t0(StringsKt.Y(StringsKt.Y(StringsKt.Y((String) fb9Var.get(4), "F:"), "M:"), "D:")).toString());
            case 22:
                return ((l7) this.b).a(((Integer) obj).intValue());
            case 23:
                v0i v0iVar = (v0i) this.b;
                String str3 = (String) obj;
                str3.getClass();
                b1i b1iVar = v0iVar.a;
                b1iVar.getClass();
                if (!Intrinsics.d(b1iVar.l, str3)) {
                    b1iVar.l = str3;
                    b1iVar.q.d();
                    u0i u0iVar = b1iVar.o;
                    if (u0iVar != null) {
                        u0iVar.d();
                    }
                }
                return Unit.a;
            case 24:
                lhd lhdVar = (lhd) this.b;
                hoi hoiVar = (hoi) obj;
                hoiVar.getClass();
                lhdVar.invoke(hoiVar.b);
                return Unit.a;
            case 25:
                b1i b1iVar2 = (b1i) this.b;
                List list = (List) obj;
                list.getClass();
                b1iVar2.q.g();
                if (list.size() > 1) {
                    b1iVar2.m = list;
                    xdr xdrVar = b1iVar2.n;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                }
                return Unit.a;
            case 26:
                b2i b2iVar = (b2i) this.b;
                String str4 = (String) obj;
                str4.getClass();
                g2i g2iVar = b2iVar.a;
                g2iVar.getClass();
                if (!Intrinsics.d(g2iVar.l, str4)) {
                    g2iVar.l = str4;
                    g2iVar.q.d();
                    u0i u0iVar2 = g2iVar.o;
                    if (u0iVar2 != null) {
                        u0iVar2.d();
                    }
                }
                return Unit.a;
            case 27:
                lhd lhdVar2 = (lhd) this.b;
                hoi hoiVar2 = (hoi) obj;
                hoiVar2.getClass();
                lhdVar2.invoke(hoiVar2.b);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                g2i g2iVar2 = (g2i) this.b;
                List list2 = (List) obj;
                list2.getClass();
                g2iVar2.q.g();
                if (list2.size() > 1) {
                    g2iVar2.m = list2;
                    xdr xdrVar2 = g2iVar2.n;
                    Boolean bool2 = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool2);
                }
                return Unit.a;
            default:
                j7i j7iVar = (j7i) this.b;
                vat vatVar = (vat) obj;
                Pair pair = (Pair) vatVar.a;
                af5 af5Var = (af5) vatVar.c;
                if (CollectionsKt.firstOrNull((List) pair.a) instanceof yrj) {
                    af5 af5Var2 = j7iVar.x;
                    if (!Intrinsics.d(af5Var2 != null ? af5Var2.a : null, af5Var.a)) {
                        j = j7iVar.v;
                        return new nsa(j);
                    }
                }
                nsa.b.getClass();
                j = 0;
                return new nsa(j);
        }
    }

    public /* synthetic */ lhd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
