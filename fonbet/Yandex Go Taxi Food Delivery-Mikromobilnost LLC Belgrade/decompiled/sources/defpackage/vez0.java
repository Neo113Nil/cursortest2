package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.SQLException;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSize;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import com.yandex.go.payments.payment.YbWalletPayment$YandexType;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.pulse.histogram.ComponentHistograms;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.WriteMode;
import retrofit2.Call;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public abstract class vez0 {
    public static final jb20 b;
    public static final jb20 c;
    public static final jb20 d;
    public static jb7 f;
    public static final zrk a = new zrk(16);
    public static final int[] e = {R.attr.stateListAnimator};

    static {
        int i = 1;
        b = new jb20("NULL", i);
        c = new jb20("UNINITIALIZED", i);
        d = new jb20("DONE", i);
    }

    public static ComponentHistograms A(String str) {
        ComponentHistograms componentHistograms;
        synchronized (ComponentHistograms.b) {
            if (str.equals("")) {
                throw new IllegalArgumentException("Wrong library name");
            }
            ycs0 ycs0Var = ComponentHistograms.c;
            if (!ycs0Var.containsKey(str)) {
                ycs0Var.put(str, new ComponentHistograms(str));
            }
            componentHistograms = (ComponentHistograms) ycs0Var.get(str);
        }
        return componentHistograms;
    }

    public static final Paint B(ka90 ka90Var) {
        if (!(ka90Var instanceof eb2)) {
            hxv.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + qoi0.a(ka90Var.getClass()).c());
        }
        return ((eb2) ka90Var).a;
    }

    public static final String C(Call call) {
        return call.k().a.i;
    }

    public static final String D(yaf0 yaf0Var) {
        if (yaf0Var instanceof uaf0) {
            return ((uaf0) yaf0Var).e.getValue();
        }
        if (yaf0Var instanceof waf0) {
            return ((vaf0) ((waf0) yaf0Var)).e;
        }
        w511.b();
        return null;
    }

    public static final String E(u0k u0kVar) {
        lea0 lea0Var = u0kVar instanceof lea0 ? (lea0) u0kVar : null;
        if (lea0Var != null) {
            return lea0Var.getId();
        }
        return null;
    }

    public static boolean F(int i) {
        return i != 0 && lhc.c(i) > 0.5d;
    }

    public static final boolean G(hfa0 hfa0Var) {
        h8b0 a2;
        lea0 b2 = hfa0Var.b();
        return b2 != null && !b2.d() && (a2 = hfa0Var.a()) != null && a2.e() && a2.f() && a2.g(b2.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0158 A[EDGE_INSN: B:34:0x0158->B:48:0x0158 BREAK  A[LOOP:0: B:23:0x0045->B:35:?], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean H(kfk kfkVar) {
        n3k n3kVar;
        pvo pvoVar;
        boolean z;
        pvo pvoVar2;
        boolean z2;
        if (kfkVar != null) {
            if (kfkVar instanceof jfk) {
                return ((jfk) kfkVar).b.a instanceof kvo;
            }
            if (kfkVar instanceof ffk) {
                rsk rskVar = ((ffk) kfkVar).b;
                if ((rskVar.a instanceof kvo) && (rskVar.b instanceof kvo) && (rskVar.c instanceof kvo)) {
                    List list = rskVar.d;
                    if (list != null) {
                        List<qpk> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (qpk qpkVar : list2) {
                                if (qpkVar == null || (qpkVar instanceof ppk)) {
                                    z2 = true;
                                } else {
                                    if (!(qpkVar instanceof opk)) {
                                        w511.b();
                                        return false;
                                    }
                                    z2 = ((opk) qpkVar).c().a instanceof kvo;
                                }
                                if (!z2) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!(rskVar.e instanceof kvo) || !(rskVar.f instanceof kvo) || !(rskVar.g instanceof kvo)) {
                        break;
                    }
                }
                return false;
            }
            if (kfkVar instanceof gfk) {
                vyk vykVar = ((gfk) kfkVar).b;
                List list3 = vykVar.b;
                boolean d0 = cma1.d0(list3);
                List list4 = list3;
                boolean z3 = !(list4 == null || list4.isEmpty()) || (pvoVar2 = vykVar.c) == null || (pvoVar2 instanceof t6e);
                if (!(vykVar.a instanceof kvo) || !z3 || !d0) {
                    return false;
                }
            } else {
                if (kfkVar instanceof ifk) {
                    k5l k5lVar = ((ifk) kfkVar).b;
                    List list5 = k5lVar.c;
                    boolean e0 = cma1.e0(list5);
                    List list6 = list5;
                    boolean z4 = !(list6 == null || list6.isEmpty()) || (pvoVar = k5lVar.d) == null || (pvoVar instanceof t6e);
                    if (cma1.c0(k5lVar.a) && cma1.c0(k5lVar.b)) {
                        h6l h6lVar = k5lVar.e;
                        if (h6lVar != null) {
                            if (h6lVar instanceof f6l) {
                                f6l f6lVar = (f6l) h6lVar;
                                if (!(f6lVar.a().a instanceof kvo) || !(f6lVar.a().b instanceof kvo)) {
                                    z = false;
                                }
                            } else {
                                if (!(h6lVar instanceof g6l)) {
                                    w511.b();
                                    return false;
                                }
                                z = ((g6l) h6lVar).a().a instanceof kvo;
                            }
                            if (z || !z4 || !e0) {
                                break;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    return false;
                }
                if (!(kfkVar instanceof hfk)) {
                    w511.b();
                    return false;
                }
                hfk hfkVar = (hfk) kfkVar;
                if (!(hfkVar.d().a instanceof kvo) || ((n3kVar = hfkVar.d().b) != null && (!(n3kVar.b instanceof kvo) || !(n3kVar.d instanceof kvo) || !(n3kVar.c instanceof kvo) || !(n3kVar.a instanceof kvo)))) {
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (J(r0.b) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (L(r2) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (J(r0.c().b) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean I(aok aokVar) {
        if (aokVar == null) {
            return true;
        }
        if (!(aokVar instanceof znk)) {
            w511.b();
            return false;
        }
        u8l u8lVar = ((znk) aokVar).b;
        if (u8lVar.a instanceof kvo) {
            t8l t8lVar = u8lVar.b;
            if (t8lVar != null) {
                if (t8lVar instanceof s8l) {
                    k7l k7lVar = ((s8l) t8lVar).b;
                    if (qje.B(k7lVar.a)) {
                        if (L(k7lVar.e)) {
                            if (J(k7lVar.d)) {
                                if (J(k7lVar.c)) {
                                }
                            }
                        }
                    }
                } else if (t8lVar instanceof r8l) {
                    r8l r8lVar = (r8l) t8lVar;
                    if (qje.B(r8lVar.c().a)) {
                        bcl bclVar = r8lVar.c().c;
                        if (bclVar != null) {
                        }
                    }
                } else {
                    w511.b();
                }
            }
            if (L(u8lVar.c)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean J(sqk sqkVar) {
        if (sqkVar == null) {
            return true;
        }
        return (sqkVar.b instanceof kvo) && (sqkVar.a instanceof kvo);
    }

    public static final boolean K(z3l z3lVar) {
        if (z3lVar == null) {
            return true;
        }
        if (z3lVar instanceof x3l) {
            x3l x3lVar = (x3l) z3lVar;
            return (x3lVar.d().b instanceof kvo) && (x3lVar.d().a instanceof kvo);
        }
        if (z3lVar instanceof y3l) {
            return ((y3l) z3lVar).d().a instanceof kvo;
        }
        w511.b();
        return false;
    }

    public static final boolean L(bcl bclVar) {
        if (bclVar == null) {
            return true;
        }
        return (bclVar.a instanceof kvo) && (bclVar.d instanceof kvo) && (bclVar.c instanceof kvo);
    }

    public static final boolean M(DivEdgeInsets divEdgeInsets) {
        if (divEdgeInsets == null) {
            return true;
        }
        return (divEdgeInsets.c instanceof kvo) && (divEdgeInsets.f instanceof kvo) && (divEdgeInsets.d instanceof kvo) && (divEdgeInsets.a instanceof kvo) && qje.B(divEdgeInsets.e) && qje.B(divEdgeInsets.b);
    }

    public static final boolean N(DivSize divSize) {
        if (divSize == null) {
            return true;
        }
        if (divSize instanceof h9l) {
            sqk sqkVar = ((h9l) divSize).b;
            if ((sqkVar.b instanceof kvo) && (sqkVar.a instanceof kvo)) {
                return true;
            }
        } else {
            if (divSize instanceof i9l) {
                nzk nzkVar = ((i9l) divSize).b;
                t9l t9lVar = nzkVar.a;
                t9l t9lVar2 = nzkVar.b;
                if (qje.B(nzkVar.c)) {
                    if (qje.B(t9lVar2 != null ? t9lVar2.b : null)) {
                        if (qje.B(t9lVar2 != null ? t9lVar2.a : null)) {
                            if (qje.B(t9lVar != null ? t9lVar.b : null)) {
                                if (qje.B(t9lVar != null ? t9lVar.a : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(divSize instanceof j9l)) {
                    w511.b();
                    return false;
                }
                lql lqlVar = ((j9l) divSize).b;
                t9l t9lVar3 = lqlVar.b;
                t9l t9lVar4 = lqlVar.c;
                if (qje.B(lqlVar.a)) {
                    if (qje.B(t9lVar4 != null ? t9lVar4.b : null)) {
                        if (qje.B(t9lVar4 != null ? t9lVar4.a : null)) {
                            if (qje.B(t9lVar3 != null ? t9lVar3.b : null)) {
                                if (qje.B(t9lVar3 != null ? t9lVar3.a : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean O(lea0 lea0Var, lea0 lea0Var2) {
        if (jl40.l(lea0Var != null ? lea0Var.getId() : null, lea0Var2 != null ? lea0Var2.getId() : null)) {
            return (lea0Var != null ? lea0Var.c() : null) == (lea0Var2 != null ? lea0Var2.c() : null);
        }
        return false;
    }

    public static final boolean P(TimestampSelector timestampSelector, k7z k7zVar, k7z k7zVar2) {
        return k7zVar == null || timestampSelector.compare(k7zVar2.a, k7zVar.a) > 0;
    }

    public static int Q(float f2, int i, int i2) {
        return lhc.d(lhc.f(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static float R(float f2, DisplayMetrics displayMetrics) {
        if (Build.VERSION.SDK_INT >= 34) {
            return jh.a(f2, displayMetrics);
        }
        float f3 = displayMetrics.density;
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f2 / f3;
    }

    public static final tbv S(tbv tbvVar, Context context, pwy0 pwy0Var) {
        if (!(tbvVar instanceof obv)) {
            return tbvVar;
        }
        obv obvVar = (obv) tbvVar;
        int i = obvVar.d;
        ImageModel$Tag$Theme imageModel$Tag$Theme = obvVar.c;
        if (imageModel$Tag$Theme != null && i > 0) {
            return obvVar;
        }
        if (imageModel$Tag$Theme == null) {
            imageModel$Tag$Theme = X(pwy0Var.getThemeType());
        }
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            valueOf = null;
        }
        return obv.a(obvVar, imageModel$Tag$Theme, valueOf != null ? valueOf.intValue() : context.getResources().getDisplayMetrics().densityDpi, 1);
    }

    public static int T(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    public static void U(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(jjh0.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, eng0.state_liftable, -eng0.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final String V(u0k u0kVar) {
        if (u0kVar instanceof fl8) {
            return ((fl8) u0kVar).i;
        }
        if (u0kVar instanceof bjm0) {
            return ((bjm0) u0kVar).f();
        }
        if (!(u0kVar instanceof yy51)) {
            if (u0kVar instanceof t19) {
                return ((t19) u0kVar).getId();
            }
            return null;
        }
        YbWalletPayment$YandexType h = ((yy51) u0kVar).h();
        if (h != null) {
            return h.getValue();
        }
        return null;
    }

    public static final WriteMode W(sbx sbxVar, SerialDescriptor serialDescriptor) {
        jl40 kind = serialDescriptor.getKind();
        if (kind instanceof s5e0) {
            return WriteMode.POLY_OBJ;
        }
        if (jl40.l(kind, ovu0.h)) {
            return WriteMode.LIST;
        }
        if (!jl40.l(kind, ovu0.i)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor b2 = b(serialDescriptor.d(0), sbxVar.b);
        jl40 kind2 = b2.getKind();
        if ((kind2 instanceof h2f0) || jl40.l(kind2, fsq0.g)) {
            return WriteMode.MAP;
        }
        if (sbxVar.a.d) {
            return WriteMode.LIST;
        }
        throw qje.a(b2);
    }

    public static final ImageModel$Tag$Theme X(ThemeType themeType) {
        int i = ecv.a[themeType.ordinal()];
        if (i == 1) {
            return ImageModel$Tag$Theme.Light;
        }
        if (i == 2) {
            return ImageModel$Tag$Theme.Dark;
        }
        w511.b();
        return null;
    }

    public static final void Y(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final String Z(m5j0 m5j0Var) {
        Object failure;
        try {
            yp6 yp6Var = new yp6();
            m5j0Var.d(yp6Var);
            failure = yp6Var.I0();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static buj0 a(int i, lzr lzrVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            lzrVar = lzr.D;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return new buj0(i, lzrVar, i2, new kzr(new jzr[0]));
    }

    public static final String a0(rvj0 rvj0Var) {
        Object failure;
        try {
            failure = rvj0Var.source().peek().I0();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static final SerialDescriptor b(SerialDescriptor serialDescriptor, kf5 kf5Var) {
        SerialDescriptor b2;
        KSerializer b3;
        if (!jl40.l(serialDescriptor.getKind(), esq0.g)) {
            return serialDescriptor.isInline() ? b(serialDescriptor.d(0), kf5Var) : serialDescriptor;
        }
        lfx C = tje.C(serialDescriptor);
        SerialDescriptor serialDescriptor2 = null;
        if (C != null && (b3 = kf5Var.b(C, EmptyList.a)) != null) {
            serialDescriptor2 = b3.getDescriptor();
        }
        return (serialDescriptor2 == null || (b2 = b(serialDescriptor2, kf5Var)) == null) ? serialDescriptor : b2;
    }

    public static final lv90 b0(lea0 lea0Var) {
        Boolean bool;
        fl8 fl8Var = lea0Var instanceof fl8 ? (fl8) lea0Var : null;
        boolean booleanValue = (fl8Var == null || (bool = fl8Var.m) == null) ? false : bool.booleanValue();
        kv90 kv90Var = lv90.Companion;
        PaymentMethod$Type c2 = lea0Var.c();
        String id = lea0Var.getId();
        Boolean valueOf = Boolean.valueOf(booleanValue);
        kv90Var.getClass();
        return kv90.a(c2, id, valueOf);
    }

    public static final String c(u0k u0kVar) {
        if (u0kVar instanceof lea0) {
            return ((lea0) u0kVar).c().getCode();
        }
        if (u0kVar instanceof na0) {
            return PaymentMethod$Type.CARD.getCode();
        }
        if (u0kVar instanceof mf0) {
            return PaymentMethod$Type.MBANK_ACCOUNT.getCode();
        }
        if (u0kVar instanceof of0) {
            return "maas_payment";
        }
        if (u0kVar instanceof mj0) {
            return PaymentMethod$Type.SBP_TOKEN.getCode();
        }
        if (u0kVar instanceof nj0) {
            return PaymentMethod$Type.SHARED.getCode();
        }
        if (u0kVar instanceof bk0) {
            return PaymentMethod$Type.TRANSPORT_CARD.getCode();
        }
        if (u0kVar instanceof nk0) {
            return PaymentMethod$Type.YB_WALLET.getCode();
        }
        if (u0kVar instanceof mk0) {
            return PaymentMethod$Type.YAPE_TOKEN.getCode();
        }
        if (u0kVar instanceof bg0) {
            return PaymentMethod$Type.NEQUI_TOKEN.getCode();
        }
        if (u0kVar instanceof kd0) {
            return PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode();
        }
        if (u0kVar instanceof df0) {
            return PaymentMethod$Type.JAZZCASH_WALLET.getCode();
        }
        if (u0kVar instanceof ogz0) {
            return "tips";
        }
        if (u0kVar instanceof ck0) {
            return PaymentMethod$Type.TRANSPORT_EXTERNAL.getCode();
        }
        w511.b();
        return null;
    }

    public static final m6a0 c0(lv90 lv90Var, lv90 lv90Var2) {
        PaymentMethod$Type paymentMethod$Type;
        if (lv90Var == null || (paymentMethod$Type = lv90Var.a) == null) {
            return null;
        }
        return new m6a0(paymentMethod$Type, lv90Var.b, lv90Var2 != null ? c0(lv90Var2, null) : null);
    }

    public static int d(int i, int i2) {
        return lhc.f(i, (Color.alpha(i) * i2) / 255);
    }

    public static final m6a0 d0(lea0 lea0Var) {
        if (lea0Var == null) {
            return null;
        }
        return new m6a0(lea0Var.c(), lea0Var.getId(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tbv e(String str) {
        String queryParameter;
        obv obvVar;
        if (str.length() != 0) {
            if (cvu0.x(str, "http", true)) {
                return new qbv(str);
            }
            int i = 0;
            if (cvu0.x(str, "tag", false)) {
                Uri parse = Uri.parse(str);
                if (jl40.l(parse.getScheme(), "tag") && (queryParameter = parse.getQueryParameter("t")) != null) {
                    obvVar = new obv(queryParameter, jl40.l(parse.getQueryParameter("c"), "d") ? ImageModel$Tag$Theme.Dark : ImageModel$Tag$Theme.Light, 4, i);
                    if (obvVar != null) {
                        Uri parse2 = Uri.parse(str);
                        if (parse2.getScheme() != null) {
                            return new gbv(parse2);
                        }
                        File file = new File(str);
                        if (file.exists()) {
                            return new gbv(Uri.fromFile(file));
                        }
                    } else if (obvVar.b.length() > 0) {
                        return obvVar;
                    }
                }
            }
            obvVar = null;
            if (obvVar != null) {
            }
        }
        return null;
    }

    public static final String e0(yaf0 yaf0Var) {
        if (yaf0Var instanceof uaf0) {
            ProductsScreenType$Type productsScreenType$Type = ((uaf0) yaf0Var).e;
            return productsScreenType$Type == ProductsScreenType$Type.ON_MULTI_ORDER ? "multiorder" : productsScreenType$Type.name().toLowerCase(Locale.ROOT);
        }
        if (yaf0Var instanceof waf0) {
            return ((vaf0) ((waf0) yaf0Var)).f;
        }
        w511.b();
        return null;
    }

    public static cnr0 f(List list) {
        List list2 = list;
        int d2 = gw00.d(tcc.n(list2, 10));
        if (d2 < 16) {
            d2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
        for (Object obj : list2) {
            linkedHashMap.put(qoi0.a(((bnr0) obj).getClass()), obj);
        }
        return new cnr0(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tbv f0(tbv tbvVar) {
        String queryParameter;
        obv obvVar;
        if (tbvVar instanceof gbv) {
            Uri uri = ((gbv) tbvVar).b;
            String scheme = uri.getScheme();
            if (scheme == null) {
                xby.l(xby.d, "CoilImageLoader: Invalid uri received", null, null, unr0.n(uri, "Received uri: "), 6);
                return null;
            }
            if (!cvu0.x(scheme, "http", true)) {
                return tbvVar;
            }
            xby.l(xby.d, "CoilImageLoader: Url instead of Uri received", null, null, unr0.n(uri, "Received uri: "), 6);
            return new qbv(uri.toString());
        }
        if (tbvVar instanceof obv) {
            if (((obv) tbvVar).b.length() > 0) {
                return tbvVar;
            }
        } else {
            if (!(tbvVar instanceof qbv)) {
                w511.b();
                return null;
            }
            String str = ((qbv) tbvVar).b;
            if (str.length() != 0) {
                if (cvu0.x(str, "http", true)) {
                    return tbvVar;
                }
                int i = 0;
                if (cvu0.x(str, "tag", false)) {
                    Uri parse = Uri.parse(str);
                    if (jl40.l(parse.getScheme(), "tag") && (queryParameter = parse.getQueryParameter("t")) != null) {
                        obvVar = new obv(queryParameter, jl40.l(parse.getQueryParameter("c"), "d") ? ImageModel$Tag$Theme.Dark : ImageModel$Tag$Theme.Light, 4, i);
                        if (obvVar != null) {
                            Uri parse2 = Uri.parse(str);
                            if (parse2.getScheme() != null) {
                                xby.l(xby.d, "CoilImageLoader: Uri instead of Url received", null, null, "Received url: ".concat(str), 6);
                                return new gbv(parse2);
                            }
                            File file = new File(str);
                            if (file.exists()) {
                                xby.l(xby.d, "CoilImageLoader: File instead of Url received", null, null, "Received url: ".concat(str), 6);
                                return new gbv(Uri.fromFile(file));
                            }
                        } else if (obvVar.b.length() > 0) {
                            return obvVar;
                        }
                    }
                }
                obvVar = null;
                if (obvVar != null) {
                }
            }
        }
        return null;
    }

    public static final o4o g(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        j4o j4oVar = new j4o(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String str2 = (String) j73.G(i2, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            j4oVar.j(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) j73.G(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    j4oVar.k(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        o4o o4oVar = new o4o(str, enumArr);
        o4oVar.d = j4oVar;
        return o4oVar;
    }

    public static final boolean g0(int i, String str, Collection collection) {
        int size = collection.size();
        if (i >= 0 && i < size) {
            return true;
        }
        xby.d.x(new IndexOutOfBoundsException(oyr.h(i, size, "Index: ", ", Size: ")), str);
        return false;
    }

    public static final SSLSocketFactory h(xm51 xm51Var) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{xm51Var}, null);
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e2) {
            ny61.h("Failed to initialize SSLContext", e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            ny61.h("No system TLS", e3);
            return null;
        }
    }

    public static final void h0() {
        i0("This method should be called from the main application thread");
    }

    public static final xm51 i(Context context) {
        return rm2.e(j73.A(new X509TrustManager[]{kp50.k(context, new rl60(context), new ql60(), tgz.G2), rm2.f(new tu6(context))}));
    }

    public static final void i0(String str) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        xby.d.x(new IllegalStateException(str), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
    
        if (r2 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        if (defpackage.cma1.q(r7, r8) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0134, code lost:
    
        if (defpackage.qje.k(r1.a().b, r2.a().b) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0153, code lost:
    
        if (defpackage.qje.k(((defpackage.g6l) r1).a().a, ((defpackage.g6l) r2).a().a) != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j(kfk kfkVar, kfk kfkVar2) {
        if (kfkVar == null) {
            return kfkVar2 == null;
        }
        if (!(kfkVar instanceof jfk)) {
            if (kfkVar instanceof ffk) {
                rsk rskVar = ((ffk) kfkVar).b;
                List list = rskVar.d;
                List list2 = EmptyList.a;
                if (list == null) {
                    list = list2;
                }
                if (kfkVar2 instanceof ffk) {
                    Expression expression = rskVar.a;
                    rsk rskVar2 = ((ffk) kfkVar2).b;
                    if (qje.k(expression, rskVar2.a) && qje.k(rskVar.b, rskVar2.b) && qje.k(rskVar.c, rskVar2.c)) {
                        List list3 = rskVar2.d;
                        if (list3 != null) {
                            list2 = list3;
                        }
                        if (list.size() == list2.size()) {
                            Iterator it = list.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    if (!qje.k(rskVar.e, rskVar2.e) || !qje.k(rskVar.f, rskVar2.f) || !qje.k(rskVar.g, rskVar2.g)) {
                                        break;
                                    }
                                    return true;
                                }
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!m((qpk) next, (qpk) list2.get(i))) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                    }
                }
            } else if (kfkVar instanceof gfk) {
                if (kfkVar2 instanceof gfk) {
                    vyk vykVar = ((gfk) kfkVar).b;
                    Expression expression2 = vykVar.a;
                    vyk vykVar2 = ((gfk) kfkVar2).b;
                    if (!qje.k(expression2, vykVar2.a) || !cma1.p(vykVar, vykVar2)) {
                        break;
                    }
                    return true;
                }
            } else if (kfkVar instanceof ifk) {
                if (kfkVar2 instanceof ifk) {
                    k5l k5lVar = ((ifk) kfkVar).b;
                    n5l n5lVar = k5lVar.a;
                    k5l k5lVar2 = ((ifk) kfkVar2).b;
                    if (cma1.F(n5lVar, k5lVar2.a) && cma1.F(k5lVar.b, k5lVar2.b)) {
                        h6l h6lVar = k5lVar.e;
                        h6l h6lVar2 = k5lVar2.e;
                        if (h6lVar != null) {
                            if (h6lVar instanceof f6l) {
                                if (h6lVar2 instanceof f6l) {
                                    f6l f6lVar = (f6l) h6lVar;
                                    f6l f6lVar2 = (f6l) h6lVar2;
                                    if (qje.k(f6lVar.a().a, f6lVar2.a().a)) {
                                    }
                                }
                            } else {
                                if (!(h6lVar instanceof g6l)) {
                                    w511.b();
                                    return false;
                                }
                                if (h6lVar2 instanceof g6l) {
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(kfkVar instanceof hfk)) {
                    w511.b();
                    return false;
                }
                if (kfkVar2 instanceof hfk) {
                    hfk hfkVar = (hfk) kfkVar;
                    hfk hfkVar2 = (hfk) kfkVar2;
                    if (qje.k(hfkVar.d().a, hfkVar2.d().a)) {
                        n3k n3kVar = hfkVar.d().b;
                        n3k n3kVar2 = hfkVar2.d().b;
                        if (n3kVar == null && n3kVar2 == null) {
                            return true;
                        }
                        if (qje.k(n3kVar != null ? n3kVar.b : null, n3kVar2 != null ? n3kVar2.b : null)) {
                            if (qje.k(n3kVar != null ? n3kVar.d : null, n3kVar2 != null ? n3kVar2.d : null)) {
                                if (qje.k(n3kVar != null ? n3kVar.c : null, n3kVar2 != null ? n3kVar2.c : null)) {
                                    if (qje.k(n3kVar != null ? n3kVar.a : null, n3kVar2 != null ? n3kVar2.a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if ((kfkVar2 instanceof jfk) && qje.k(((jfk) kfkVar).b.a, ((jfk) kfkVar2).b.a)) {
            return true;
        }
        return false;
    }

    public static final boolean j0(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        xby.d.x(new NullPointerException(), str);
        return false;
    }

    public static final boolean k(jnk jnkVar, jnk jnkVar2) {
        if (jnkVar == null && jnkVar2 == null) {
            return true;
        }
        if (qje.k(jnkVar != null ? jnkVar.a : null, jnkVar2 != null ? jnkVar2.a : null)) {
            return qje.k(jnkVar != null ? jnkVar.b : null, jnkVar2 != null ? jnkVar2.b : null);
        }
        return false;
    }

    public static void k0(int i, int i2) {
        String e2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                e2 = hza1.e("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(oyr.i(i2, "negative size: "));
                    return;
                }
                e2 = hza1.e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        if (p(r5.c, r6.c) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (n(r1.b, r2.b) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if (n(r1.c().b, r2.c().b) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean l(aok aokVar, aok aokVar2) {
        if (aokVar == null) {
            return aokVar2 == null;
        }
        if (!(aokVar instanceof znk)) {
            w511.b();
            return false;
        }
        if (aokVar2 instanceof znk) {
            u8l u8lVar = ((znk) aokVar).b;
            Expression expression = u8lVar.a;
            u8l u8lVar2 = ((znk) aokVar2).b;
            if (qje.k(expression, u8lVar2.a)) {
                t8l t8lVar = u8lVar.b;
                t8l t8lVar2 = u8lVar2.b;
                if (t8lVar != null) {
                    if (t8lVar instanceof s8l) {
                        if (t8lVar2 instanceof s8l) {
                            k7l k7lVar = ((s8l) t8lVar).b;
                            Expression expression2 = k7lVar.a;
                            k7l k7lVar2 = ((s8l) t8lVar2).b;
                            if (qje.k(expression2, k7lVar2.a)) {
                                if (p(k7lVar.e, k7lVar2.e)) {
                                    if (n(k7lVar.d, k7lVar2.d)) {
                                        if (n(k7lVar.c, k7lVar2.c)) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!(t8lVar instanceof r8l)) {
                        w511.b();
                    } else if (t8lVar2 instanceof r8l) {
                        r8l r8lVar = (r8l) t8lVar;
                        r8l r8lVar2 = (r8l) t8lVar2;
                        if (qje.k(r8lVar.c().a, r8lVar2.c().a)) {
                            if (p(r8lVar.c().c, r8lVar2.c().c)) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void l0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m0(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m0(i2, i3, "end index") : hza1.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final boolean m(qpk qpkVar, qpk qpkVar2) {
        if (qpkVar == null) {
            return qpkVar2 == null;
        }
        if (qpkVar instanceof ppk) {
            return qpkVar2 instanceof ppk;
        }
        if (qpkVar instanceof opk) {
            return (qpkVar2 instanceof opk) && qje.k(((opk) qpkVar).c().a, ((opk) qpkVar2).c().a);
        }
        w511.b();
        return false;
    }

    public static String m0(int i, int i2, String str) {
        if (i < 0) {
            return hza1.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hza1.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(oyr.i(i2, "negative size: "));
        return null;
    }

    public static final boolean n(sqk sqkVar, sqk sqkVar2) {
        if (sqkVar == null && sqkVar2 == null) {
            return true;
        }
        if (qje.k(sqkVar != null ? sqkVar.b : null, sqkVar2 != null ? sqkVar2.b : null)) {
            return qje.k(sqkVar != null ? sqkVar.a : null, sqkVar2 != null ? sqkVar2.a : null);
        }
        return false;
    }

    public static final boolean o(z3l z3lVar, z3l z3lVar2) {
        if (z3lVar == null) {
            return z3lVar2 == null;
        }
        if (z3lVar instanceof x3l) {
            if (z3lVar2 instanceof x3l) {
                x3l x3lVar = (x3l) z3lVar;
                x3l x3lVar2 = (x3l) z3lVar2;
                if (qje.k(x3lVar.d().b, x3lVar2.d().b) && qje.k(x3lVar.d().a, x3lVar2.d().a)) {
                    return true;
                }
            }
        } else {
            if (!(z3lVar instanceof y3l)) {
                w511.b();
                return false;
            }
            if ((z3lVar2 instanceof y3l) && qje.k(((y3l) z3lVar).d().a, ((y3l) z3lVar2).d().a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(bcl bclVar, bcl bclVar2) {
        if (bclVar == null && bclVar2 == null) {
            return true;
        }
        if (!qje.k(bclVar != null ? bclVar.a : null, bclVar2 != null ? bclVar2.a : null)) {
            return false;
        }
        if (qje.k(bclVar != null ? bclVar.d : null, bclVar2 != null ? bclVar2.d : null)) {
            return qje.k(bclVar != null ? bclVar.c : null, bclVar2 != null ? bclVar2.c : null);
        }
        return false;
    }

    public static final boolean q(DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2) {
        if (divEdgeInsets == null && divEdgeInsets2 == null) {
            return true;
        }
        if (!qje.k(divEdgeInsets != null ? divEdgeInsets.c : null, divEdgeInsets2 != null ? divEdgeInsets2.c : null)) {
            return false;
        }
        if (!qje.k(divEdgeInsets != null ? divEdgeInsets.f : null, divEdgeInsets2 != null ? divEdgeInsets2.f : null)) {
            return false;
        }
        if (!qje.k(divEdgeInsets != null ? divEdgeInsets.d : null, divEdgeInsets2 != null ? divEdgeInsets2.d : null)) {
            return false;
        }
        if (!qje.k(divEdgeInsets != null ? divEdgeInsets.a : null, divEdgeInsets2 != null ? divEdgeInsets2.a : null)) {
            return false;
        }
        if (qje.k(divEdgeInsets != null ? divEdgeInsets.e : null, divEdgeInsets2 != null ? divEdgeInsets2.e : null)) {
            return qje.k(divEdgeInsets != null ? divEdgeInsets.b : null, divEdgeInsets2 != null ? divEdgeInsets2.b : null);
        }
        return false;
    }

    public static final boolean r(DivSize divSize, DivSize divSize2) {
        if (divSize == null) {
            return divSize2 == null;
        }
        if (!(divSize instanceof h9l)) {
            if (divSize instanceof i9l) {
                if (divSize2 instanceof i9l) {
                    nzk nzkVar = ((i9l) divSize).b;
                    t9l t9lVar = nzkVar.a;
                    t9l t9lVar2 = nzkVar.b;
                    Expression expression = nzkVar.c;
                    nzk nzkVar2 = ((i9l) divSize2).b;
                    t9l t9lVar3 = nzkVar2.a;
                    t9l t9lVar4 = nzkVar2.b;
                    if (qje.k(expression, nzkVar2.c)) {
                        if (qje.k(t9lVar2 != null ? t9lVar2.b : null, t9lVar4 != null ? t9lVar4.b : null)) {
                            if (qje.k(t9lVar2 != null ? t9lVar2.a : null, t9lVar4 != null ? t9lVar4.a : null)) {
                                if (qje.k(t9lVar != null ? t9lVar.b : null, t9lVar3 != null ? t9lVar3.b : null)) {
                                    if (qje.k(t9lVar != null ? t9lVar.a : null, t9lVar3 != null ? t9lVar3.a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(divSize instanceof j9l)) {
                    w511.b();
                    return false;
                }
                if (divSize2 instanceof j9l) {
                    lql lqlVar = ((j9l) divSize).b;
                    t9l t9lVar5 = lqlVar.b;
                    t9l t9lVar6 = lqlVar.c;
                    Expression expression2 = lqlVar.a;
                    lql lqlVar2 = ((j9l) divSize2).b;
                    t9l t9lVar7 = lqlVar2.b;
                    t9l t9lVar8 = lqlVar2.c;
                    if (qje.k(expression2, lqlVar2.a)) {
                        if (qje.k(t9lVar6 != null ? t9lVar6.b : null, t9lVar8 != null ? t9lVar8.b : null)) {
                            if (qje.k(t9lVar6 != null ? t9lVar6.a : null, t9lVar8 != null ? t9lVar8.a : null)) {
                                if (qje.k(t9lVar5 != null ? t9lVar5.b : null, t9lVar7 != null ? t9lVar7.b : null)) {
                                    if (qje.k(t9lVar5 != null ? t9lVar5.a : null, t9lVar7 != null ? t9lVar7.a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (divSize2 instanceof h9l) {
            sqk sqkVar = ((h9l) divSize).b;
            Expression expression3 = sqkVar.b;
            sqk sqkVar2 = ((h9l) divSize2).b;
            if (qje.k(expression3, sqkVar2.b) && qje.k(sqkVar.a, sqkVar2.a)) {
                return true;
            }
        }
        return false;
    }

    public static final void s(oll0 oll0Var, String str) {
        ull0 T0 = oll0Var.T0(str);
        try {
            T0.q();
            gwk0.m(T0, null);
        } finally {
        }
    }

    public static final Serializable t(j5x j5xVar) {
        if (j5xVar instanceof m5x) {
            Map map = ((m5x) j5xVar).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), t((j5x) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (j5xVar instanceof v4x) {
            List list = ((v4x) j5xVar).a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(t((j5x) it.next()));
            }
            return arrayList;
        }
        if (j5xVar instanceof i5x) {
            return Long.valueOf(((i5x) j5xVar).a);
        }
        if (j5xVar instanceof h5x) {
            return Double.valueOf(((h5x) j5xVar).a);
        }
        if (j5xVar instanceof o6x) {
            return ((o6x) j5xVar).a;
        }
        if (j5xVar instanceof w4x) {
            return Boolean.valueOf(((w4x) j5xVar).a);
        }
        w511.b();
        return null;
    }

    public static ComponentHistograms u() {
        ComponentHistograms componentHistograms;
        synchronized (ComponentHistograms.b) {
            ycs0 ycs0Var = ComponentHistograms.c;
            if (!ycs0Var.containsKey("")) {
                ycs0Var.put("", new ComponentHistograms(""));
            }
            componentHistograms = (ComponentHistograms) ycs0Var.get("");
        }
        return componentHistograms;
    }

    public static e091 v(Context context, qdy0 qdy0Var) {
        return new e091(context, null, e091.k, qdy0Var, sst.c);
    }

    public static int w(int i, View view) {
        return T(view.getContext(), z610.e(i, view));
    }

    public static int x(Context context, int i, int i2) {
        Integer y = y(i, context);
        return y != null ? y.intValue() : i2;
    }

    public static Integer y(int i, Context context) {
        TypedValue a2 = z610.a(i, context);
        if (a2 != null) {
            return Integer.valueOf(T(context, a2));
        }
        return null;
    }

    public static ColorStateList z(int i, Context context) {
        TypedValue a2 = z610.a(i, context);
        if (a2 == null) {
            return null;
        }
        int i2 = a2.resourceId;
        if (i2 != 0) {
            return wuj0.a(context.getResources(), i2, context.getTheme());
        }
        int i3 = a2.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }
}
