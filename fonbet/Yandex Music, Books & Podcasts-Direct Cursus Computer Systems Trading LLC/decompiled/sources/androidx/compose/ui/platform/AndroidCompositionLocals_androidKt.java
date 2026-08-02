package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.agr;
import defpackage.al;
import defpackage.aqi;
import defpackage.e1;
import defpackage.ede;
import defpackage.ej0;
import defpackage.es5;
import defpackage.etn;
import defpackage.gld;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ie0;
import defpackage.ild;
import defpackage.kf0;
import defpackage.kjn;
import defpackage.koo;
import defpackage.lf0;
import defpackage.loo;
import defpackage.m40;
import defpackage.moo;
import defpackage.msd;
import defpackage.nf0;
import defpackage.of0;
import defpackage.oq5;
import defpackage.ozm;
import defpackage.qdq;
import defpackage.qs5;
import defpackage.qzm;
import defpackage.r6j;
import defpackage.rm7;
import defpackage.s30;
import defpackage.szf;
import defpackage.ta8;
import defpackage.u2o;
import defpackage.ua8;
import defpackage.uoo;
import defpackage.va8;
import defpackage.woo;
import defpackage.xmn;
import defpackage.xq0;
import defpackage.ykg;
import defpackage.ym5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lozm;", "Ldzf;", "getLocalLifecycleOwner", "()Lozm;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final qs5 a = new qs5(e1.x);
    public static final agr b = new agr(e1.y);
    public static final agr c = new agr(e1.z);
    public static final agr d = new agr(e1.A);
    public static final agr e = new agr(e1.B);
    public static final agr f = new agr(e1.C);

    public static final void a(AndroidComposeView androidComposeView, Function2 function2, hq5 hq5Var, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1396852028);
        int i2 = (oq5Var.h(androidComposeView) ? 4 : 2) | i | (oq5Var.h(function2) ? 32 : 16);
        int i3 = 0;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new Configuration(context.getResources().getConfiguration()));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new kf0(aqiVar, i3);
                oq5Var.k0(K2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) K2);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new ej0(context);
                oq5Var.k0(K3);
            }
            ej0 ej0Var = (ej0) K3;
            ie0 viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                xq0.q("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            woo wooVar = viewTreeOwners.b;
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                Object parent = androidComposeView.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = koo.class.getSimpleName() + ':' + str;
                uoo savedStateRegistry = wooVar.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(str2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a2.keySet()) {
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                va8 va8Var = va8.s;
                agr agrVar = moo.a;
                loo looVar = new loo(linkedHashMap, va8Var);
                try {
                    savedStateRegistry.c(str2, new ym5(1, looVar));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                ta8 ta8Var = new ta8(looVar, new ua8(z, savedStateRegistry, str2));
                oq5Var.k0(ta8Var);
                K4 = ta8Var;
            }
            ta8 ta8Var2 = (ta8) K4;
            Unit unit = Unit.a;
            boolean h = oq5Var.h(ta8Var2);
            Object K5 = oq5Var.K();
            if (h || K5 == kjnVar) {
                K5 = new m40(1, ta8Var2);
                oq5Var.k0(K5);
            }
            gld.k(unit, (Function1) K5, oq5Var);
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = qdq.x(context) ? new rm7(androidComposeView.getView(), 0) : new r6j();
                oq5Var.k0(K6);
            }
            msd msdVar = (msd) K6;
            Configuration configuration = (Configuration) aqiVar.getValue();
            Object K7 = oq5Var.K();
            if (K7 == kjnVar) {
                K7 = new ede();
                oq5Var.k0(K7);
            }
            ede edeVar = (ede) K7;
            Object K8 = oq5Var.K();
            Object obj = K8;
            if (K8 == kjnVar) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                oq5Var.k0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object K9 = oq5Var.K();
            if (K9 == kjnVar) {
                K9 = new nf0(configuration3, edeVar);
                oq5Var.k0(K9);
            }
            nf0 nf0Var = (nf0) K9;
            boolean h2 = oq5Var.h(context);
            Object K10 = oq5Var.K();
            if (h2 || K10 == kjnVar) {
                K10 = new al(3, context, nf0Var);
                oq5Var.k0(K10);
            }
            gld.k(edeVar, (Function1) K10, oq5Var);
            Object K11 = oq5Var.K();
            if (K11 == kjnVar) {
                K11 = new u2o();
                oq5Var.k0(K11);
            }
            u2o u2oVar = (u2o) K11;
            Object K12 = oq5Var.K();
            if (K12 == kjnVar) {
                K12 = new of0(u2oVar);
                oq5Var.k0(K12);
            }
            of0 of0Var = (of0) K12;
            boolean h3 = oq5Var.h(context);
            Object K13 = oq5Var.K();
            if (h3 || K13 == kjnVar) {
                K13 = new al(4, context, of0Var);
                oq5Var.k0(K13);
            }
            gld.k(u2oVar, (Function1) K13, oq5Var);
            qs5 qs5Var = es5.v;
            etn.m(new qzm[]{a.a((Configuration) aqiVar.getValue()), b.a(context), ykg.a.a(viewTreeOwners.a), e.a(wooVar), moo.a.a(ta8Var2), f.a(androidComposeView.getView()), c.a(edeVar), d.a(u2oVar), qs5Var.a(Boolean.valueOf(((Boolean) oq5Var.j(qs5Var)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), es5.l.a(msdVar)}, ild.C(1471621628, new lf0(0, androidComposeView, ej0Var, function2), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(androidComposeView, function2, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final ozm getLocalLifecycleOwner() {
        return ykg.a;
    }
}
