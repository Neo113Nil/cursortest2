package ru.yandex.taxi.map_common.image;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.coroutines.h;
import defpackage.js00;
import defpackage.ko21;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.rs2;
import defpackage.s6u0;
import defpackage.scc;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.xs00;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public static final List g = scc.g("ru_RU", "en_US", "en_RU", "ru_UA", "uk_UA", "tr_TR");
    public final rs2 a;
    public final ko21 b;
    public final wnt c;
    public final ru.yandex.taxi.map_common.style.domain.a d;
    public final xs00 e;
    public final h f = new h(new StaticMapImageInteractor$mapStyle$1(this, null));

    public a(rs2 rs2Var, ko21 ko21Var, wnt wntVar, ru.yandex.taxi.map_common.style.domain.a aVar, xs00 xs00Var) {
        this.a = rs2Var;
        this.b = ko21Var;
        this.c = wntVar;
        this.d = aVar;
        this.e = xs00Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(2:21|(1:23)(1:24))|13|14)|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        defpackage.jst.e.k(r6, "Error while mapping map style to query parameter");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri.Builder builder, StaticMapImageConfig$MapType staticMapImageConfig$MapType, ContinuationImpl continuationImpl) {
        StaticMapImageInteractor$appendStyle$1 staticMapImageInteractor$appendStyle$1;
        int i;
        Uri.Builder builder2;
        wnt wntVar;
        if (continuationImpl instanceof StaticMapImageInteractor$appendStyle$1) {
            staticMapImageInteractor$appendStyle$1 = (StaticMapImageInteractor$appendStyle$1) continuationImpl;
            int i2 = staticMapImageInteractor$appendStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staticMapImageInteractor$appendStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = staticMapImageInteractor$appendStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticMapImageInteractor$appendStyle$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (staticMapImageConfig$MapType != StaticMapImageConfig$MapType.HYBRID) {
                        wnt wntVar2 = this.c;
                        h hVar = this.f;
                        staticMapImageInteractor$appendStyle$1.L$0 = builder;
                        staticMapImageInteractor$appendStyle$1.L$1 = null;
                        staticMapImageInteractor$appendStyle$1.L$2 = wntVar2;
                        staticMapImageInteractor$appendStyle$1.label = 1;
                        obj = hVar.a(staticMapImageInteractor$appendStyle$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        builder2 = builder;
                        wntVar = wntVar2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wntVar = (wnt) staticMapImageInteractor$appendStyle$1.L$2;
                builder2 = (Uri.Builder) staticMapImageInteractor$appendStyle$1.L$0;
                b.b(obj);
                kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) ((xnt) wntVar).c(((js00) obj).b, kotlinx.serialization.json.a.Companion.serializer());
                this.e.getClass();
                builder2.appendQueryParameter("style", xs00.a(aVar));
                return zy11.a;
            }
        }
        staticMapImageInteractor$appendStyle$1 = new StaticMapImageInteractor$appendStyle$1(this, continuationImpl);
        Object obj2 = staticMapImageInteractor$appendStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticMapImageInteractor$appendStyle$1.label;
        if (i != 0) {
        }
        kotlinx.serialization.json.a aVar2 = (kotlinx.serialization.json.a) ((xnt) wntVar).c(((js00) obj2).b, kotlinx.serialization.json.a.Companion.serializer());
        this.e.getClass();
        builder2.appendQueryParameter("style", xs00.a(aVar2));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri.Builder builder, ContinuationImpl continuationImpl) {
        StaticMapImageInteractor$appendTheme$1 staticMapImageInteractor$appendTheme$1;
        int i;
        if (continuationImpl instanceof StaticMapImageInteractor$appendTheme$1) {
            staticMapImageInteractor$appendTheme$1 = (StaticMapImageInteractor$appendTheme$1) continuationImpl;
            int i2 = staticMapImageInteractor$appendTheme$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staticMapImageInteractor$appendTheme$1.label = i2 - Integer.MIN_VALUE;
                Object obj = staticMapImageInteractor$appendTheme$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticMapImageInteractor$appendTheme$1.label;
                if (i != 0) {
                    b.b(obj);
                    staticMapImageInteractor$appendTheme$1.L$0 = builder;
                    staticMapImageInteractor$appendTheme$1.label = 1;
                    obj = this.f.a(staticMapImageInteractor$appendTheme$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder = (Uri.Builder) staticMapImageInteractor$appendTheme$1.L$0;
                    b.b(obj);
                }
                builder.appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, !((js00) obj).h.f() ? "light" : "dark");
                return zy11.a;
            }
        }
        staticMapImageInteractor$appendTheme$1 = new StaticMapImageInteractor$appendTheme$1(this, continuationImpl);
        Object obj2 = staticMapImageInteractor$appendTheme$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticMapImageInteractor$appendTheme$1.label;
        if (i != 0) {
        }
        builder.appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, !((js00) obj2).h.f() ? "light" : "dark");
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zzs zzsVar, s6u0 s6u0Var, ContinuationImpl continuationImpl) {
        StaticMapImageInteractor$getMapImageUrl$1 staticMapImageInteractor$getMapImageUrl$1;
        Object obj;
        int i;
        s6u0 s6u0Var2;
        Uri.Builder builder;
        Uri.Builder builder2;
        String locale;
        StaticMapImageConfig$MapType b;
        Uri.Builder builder3;
        if (continuationImpl instanceof StaticMapImageInteractor$getMapImageUrl$1) {
            staticMapImageInteractor$getMapImageUrl$1 = (StaticMapImageInteractor$getMapImageUrl$1) continuationImpl;
            int i2 = staticMapImageInteractor$getMapImageUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staticMapImageInteractor$getMapImageUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = staticMapImageInteractor$getMapImageUrl$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticMapImageInteractor$getMapImageUrl$1.label;
                if (i != 0) {
                    b.b(obj2);
                    Uri.Builder buildUpon = Uri.parse("https://static-maps.yandex.ru/v1").buildUpon();
                    buildUpon.appendQueryParameter("ll", zzsVar.b + "," + zzsVar.a);
                    buildUpon.appendQueryParameter("apikey", this.a.g());
                    buildUpon.appendQueryParameter("lg", "0");
                    buildUpon.appendQueryParameter("cr", "0");
                    buildUpon.appendQueryParameter("l", s6u0Var.b().getValue());
                    buildUpon.appendQueryParameter("z", String.valueOf(s6u0Var.d()));
                    buildUpon.appendQueryParameter("size", s6u0Var.c() + "," + s6u0Var.a());
                    staticMapImageInteractor$getMapImageUrl$1.L$0 = null;
                    staticMapImageInteractor$getMapImageUrl$1.L$1 = s6u0Var;
                    staticMapImageInteractor$getMapImageUrl$1.L$2 = buildUpon;
                    staticMapImageInteractor$getMapImageUrl$1.L$3 = buildUpon;
                    staticMapImageInteractor$getMapImageUrl$1.label = 1;
                    if (b(buildUpon, staticMapImageInteractor$getMapImageUrl$1) != obj) {
                        s6u0Var2 = s6u0Var;
                        builder = buildUpon;
                        builder2 = builder;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder3 = (Uri.Builder) staticMapImageInteractor$getMapImageUrl$1.L$2;
                    b.b(obj2);
                    return builder3.build().toString();
                }
                builder = (Uri.Builder) staticMapImageInteractor$getMapImageUrl$1.L$3;
                builder2 = (Uri.Builder) staticMapImageInteractor$getMapImageUrl$1.L$2;
                s6u0Var2 = (s6u0) staticMapImageInteractor$getMapImageUrl$1.L$1;
                b.b(obj2);
                locale = this.b.a().a.toString();
                if (!g.contains(locale)) {
                    locale = "en_RU";
                }
                builder.appendQueryParameter("lang", locale);
                b = s6u0Var2.b();
                staticMapImageInteractor$getMapImageUrl$1.L$0 = null;
                staticMapImageInteractor$getMapImageUrl$1.L$1 = null;
                staticMapImageInteractor$getMapImageUrl$1.L$2 = builder2;
                staticMapImageInteractor$getMapImageUrl$1.L$3 = null;
                staticMapImageInteractor$getMapImageUrl$1.label = 2;
                if (a(builder, b, staticMapImageInteractor$getMapImageUrl$1) != obj) {
                    builder3 = builder2;
                    return builder3.build().toString();
                }
                return obj;
            }
        }
        staticMapImageInteractor$getMapImageUrl$1 = new StaticMapImageInteractor$getMapImageUrl$1(this, continuationImpl);
        Object obj22 = staticMapImageInteractor$getMapImageUrl$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticMapImageInteractor$getMapImageUrl$1.label;
        if (i != 0) {
        }
        locale = this.b.a().a.toString();
        if (!g.contains(locale)) {
        }
        builder.appendQueryParameter("lang", locale);
        b = s6u0Var2.b();
        staticMapImageInteractor$getMapImageUrl$1.L$0 = null;
        staticMapImageInteractor$getMapImageUrl$1.L$1 = null;
        staticMapImageInteractor$getMapImageUrl$1.L$2 = builder2;
        staticMapImageInteractor$getMapImageUrl$1.L$3 = null;
        staticMapImageInteractor$getMapImageUrl$1.label = 2;
        if (a(builder, b, staticMapImageInteractor$getMapImageUrl$1) != obj) {
        }
        return obj;
    }

    public final String d(String str, zzs zzsVar, zzs zzsVar2, String str2, boolean z, s6u0 s6u0Var) {
        double d = zzsVar.b;
        double d2 = zzsVar.a;
        double d3 = zzsVar2.b;
        double d4 = zzsVar2.a;
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        nzs.o(sb, "~", d3, ",");
        sb.append(d4);
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("bbox", sb.toString()).appendQueryParameter("apikey", this.a.g()).appendQueryParameter("lg", "0").appendQueryParameter("cr", "0").appendQueryParameter("size", s6u0Var.c() + "," + s6u0Var.a()).appendQueryParameter("style", str2).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, z ? "dark" : "light");
        String locale = this.b.a().a.toString();
        if (!g.contains(locale)) {
            locale = "en_RU";
        }
        appendQueryParameter.appendQueryParameter("lang", locale);
        return appendQueryParameter.build().toString();
    }
}
