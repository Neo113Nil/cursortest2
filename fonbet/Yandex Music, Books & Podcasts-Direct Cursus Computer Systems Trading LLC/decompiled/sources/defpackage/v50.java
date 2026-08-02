package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.yandex.plus.home.feature.webviews.internal.stories.list.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v50(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.c = i;
        this.d = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jpa jpaVar;
        int i;
        int i2 = this.a;
        Drawable drawable = null;
        int i3 = 2;
        Object obj2 = this.b;
        Object obj3 = this.d;
        int i4 = this.c;
        switch (i2) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((a60) obj3).e.a(nda.Tracks, ((mqs) obj2).a, i4, str);
                return Unit.a;
            case 1:
                s71 s71Var = (s71) obj3;
                mqs mqsVar = (mqs) obj2;
                String str2 = (String) obj;
                str2.getClass();
                xzi xziVar = s71Var.i().l;
                fkn fknVar = s71Var.h;
                ki1 K = q6k.K(((v71) fknVar.a.getValue()).c().a);
                vdr vdrVar = fknVar.a;
                int b = ((v71) vdrVar.getValue()).b();
                boolean z = ((v71) vdrVar.getValue()).c().a == s71Var.a;
                String str3 = mqsVar.a;
                xziVar.getClass();
                str3.getClass();
                osh oshVar = (osh) xziVar.a;
                oshVar.getClass();
                nmb.z((nmb) oshVar.c, ((fnb) oshVar.b).G(), wjb.ArtistFamiliarToYouScreen, null, pkb.Artist, (String) oshVar.a, K.a().a, b + 1, z, "artist_familiar_tracks", "artist_familiar_tracks", i4 + 1, "track", str3, 0, str2, 50180);
                return Unit.a;
            case 2:
                cds cdsVar = (cds) obj3;
                Function0 function0 = (Function0) obj2;
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                float f = (-(((int) (cdsVar.c >> 32)) - i4)) / 2.0f;
                ((xzi) jpaVar2.q0().b).m0(f, 0.0f);
                try {
                    jpaVar = jpaVar2;
                    try {
                        v5g.A(jpaVar, cdsVar, ((d85) function0.invoke()).a, 0L, 252);
                        ((xzi) jpaVar.q0().b).m0(-f, -0.0f);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        ((xzi) jpaVar.q0().b).m0(-f, -0.0f);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jpaVar = jpaVar2;
                }
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                ((v83) obj3).e.a(nda.Chapters, ((mqs) obj2).a, i4, str4);
                return Unit.a;
            case 4:
                pv9 pv9Var = (pv9) obj3;
                Function1 function1 = (Function1) obj2;
                Context context = (Context) obj;
                context.getClass();
                mph mphVar = new mph(context);
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(context, R.style.Theme_MediaRouter).obtainStyledAttributes(null, hen.a, R.attr.mediaRouteButtonStyle, 0);
                obtainStyledAttributes.getClass();
                Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
                obtainStyledAttributes.recycle();
                if (drawable2 != null) {
                    drawable2.setTint(i4);
                    drawable2.setState(mphVar.getDrawableState());
                    drawable = drawable2;
                }
                mphVar.setRemoteIndicatorDrawable(drawable);
                mphVar.setClickable(false);
                mphVar.setRouteSelector((crh) pv9Var.b);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                frameLayout.setOnClickListener(new fq2(i3, function1, mphVar));
                frameLayout.addView(mphVar);
                return frameLayout;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                ((eg4) obj3).a.e.g(gdg.M((mqs) obj2, i4), str5);
                return Unit.a;
            case 6:
                String str6 = (String) obj;
                str6.getClass();
                ((tea) obj3).d.a(nda.Chapters, ((mqs) obj2).a, i4, str6);
                return Unit.a;
            case 7:
                String str7 = (String) obj;
                str7.getClass();
                ((rfa) obj3).d.a(nda.ForKids, ((mqs) obj2).a, i4, str7);
                return Unit.a;
            case 8:
                String str8 = (String) obj;
                str8.getClass();
                ((xha) obj3).d.a(nda.Episodes, ((mqs) obj2).a, i4, str8);
                return Unit.a;
            case 9:
                String str9 = (String) obj;
                str9.getClass();
                ((heb) obj3).e.a(nda.Episodes, ((mqs) obj2).a, i4, str9);
                return Unit.a;
            case 10:
                String str10 = (String) obj;
                str10.getClass();
                ((lze) obj3).b.g.g(gdg.M((mqs) obj2, i4), str10);
                return Unit.a;
            case 11:
                ((yze) obj).getClass();
                ((k0f) obj3).m((yze) obj2, i4);
                return Unit.a;
            case 12:
                String str11 = (String) obj;
                str11.getClass();
                ((ygf) obj3).e.a(nda.ForKids, ((mqs) obj2).a, i4, str11);
                return Unit.a;
            case 13:
                String str12 = (String) obj;
                str12.getClass();
                iwe iweVar = ((r5h) obj3).d;
                String str13 = ((mqs) obj2).a;
                str13.getClass();
                nmb.z((nmb) iweVar.c, ((fnb) iweVar.b).G(), wjb.CollectionKidsScreen, null, null, null, null, 0, false, "songs_and_episodes", "songs_and_episodes", 0, "track", str13, i4 + 1, str12, 19708);
                return Unit.a;
            case 14:
                String str14 = (String) obj;
                str14.getClass();
                ((qsj) obj3).a.f.g(gdg.M((mqs) obj2, i4), str14);
                return Unit.a;
            case 15:
                List list = (List) obj2;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                po6 po6Var = ((j1b) obj3).c;
                String str15 = po6Var.c;
                n8g b2 = t75.b();
                b2.add(po6Var.b);
                if (str15 != null) {
                    b2.add(str15);
                }
                wfp.k(jfpVar, CollectionsKt.X(t75.a(b2), ", ", null, null, null, 62));
                wfp.j(jfpVar, new my4(i4, 1, 0, 1));
                wfp.l(jfpVar, list);
                return Unit.a;
            case 16:
                ksk kskVar = (ksk) obj3;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                jskVar.d(kskVar, 0, -((kskVar.b / 2) - i4), 0.0f);
                jskVar.d((ksk) obj2, 0, i4 * 2, 0.0f);
                return Unit.a;
            case 17:
                String str16 = (String) obj;
                str16.getClass();
                ((p2p) obj3).a.e.g(gdg.M((mqs) obj2, i4), str16);
                return Unit.a;
            case 18:
                String str17 = (String) obj2;
                r4t r4tVar = (r4t) obj;
                r4tVar.getClass();
                t4t t4tVar = ((h5t) obj3).a.k;
                t4tVar.getClass();
                str17.getClass();
                nmb.p(t4tVar.b(), t4tVar.a.a.G(), wjb.TrailerScreen, null, null, null, pkb.Trailer, t4tVar.a(), pkb.SmartPreview, t4t.d(r4tVar, i4), 1, i4 + 1, null, 0, false, "SMART_PREVIEW", t4t.d(r4tVar, i4), 2, r4tVar.a, null, null, null, 0, str17, 7944220);
                return Unit.a;
            case 19:
                poi poiVar = (poi) obj3;
                aqi aqiVar = (aqi) obj2;
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                int i5 = (i4 - ((int) (((hqe) aqiVar.getValue()).a >> 32))) / 2;
                int i6 = i5 >= 0 ? i5 : 0;
                return new wpe(xv.t(yhn.d(eeh.b(((t6k) poiVar).e()), -i6, i6), -(jx7Var.L(r2v.c) + ((int) (((hqe) aqiVar.getValue()).a & 4294967295L)))));
            case 20:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.k(jfpVar2, (String) obj3);
                wfp.w(jfpVar2);
                wfp.r(jfpVar2, ((Number) ((sdr) obj2).getValue()).intValue() == i4);
                wfp.j(jfpVar2, new my4(0, -1, i4, -1));
                return Unit.a;
            case 21:
                aqi aqiVar2 = (aqi) obj2;
                jsk jskVar2 = (jsk) obj;
                jskVar2.getClass();
                int i7 = 0;
                for (Object obj4 : (ArrayList) obj3) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        u75.n();
                        throw null;
                    }
                    ksk kskVar2 = (ksk) obj4;
                    if (i7 == 0) {
                        i = 0;
                    } else {
                        float f2 = vvv.a;
                        i = ((Number) aqiVar2.getValue()).intValue() <= 2 ? i7 * i4 : (i7 - 1) * i4;
                    }
                    jsk.g(jskVar2, kskVar2, i, 0);
                    i7 = i8;
                }
                return Unit.a;
            case 22:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((pyc) obj3).invoke(((u1w) ((w1w) obj2)).a, Integer.valueOf(i4), bool);
                return Unit.a;
            default:
                return f.f(i4, (Function1) obj3, (f) obj2, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ v50(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.b = obj2;
    }

    public /* synthetic */ v50(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
