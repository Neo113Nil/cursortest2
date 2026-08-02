package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.internal.zzji;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlassDetails;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.plus.home.plaque.plugin.api.typeface.PlusPlaqueFontStyle;
import com.yandex.plus.home.plaque.plugin.api.typeface.PlusPlaqueFontWeight;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontStyle;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontWeight;
import com.yandex.plus.plaquesdk.utils.StyledTypefaceSpan;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes10.dex */
public final class yo40 implements ag7, d1k, qty, n8s, a1q0, nkw0, q25, vm11, t070 {
    public final Object a;

    public yo40(FragmentActivity fragmentActivity) {
        this.a = Build.VERSION.SDK_INT >= 31 ? new jrt0(fragmentActivity) : new krt0(fragmentActivity);
    }

    public static List i(eg20 eg20Var) {
        if (eg20Var instanceof tf20) {
            return Collections.singletonList(eg20Var);
        }
        if (!(eg20Var instanceof lf20)) {
            w511.b();
            return null;
        }
        List b = ((lf20) eg20Var).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ycc.r(i((eg20) it.next()), arrayList);
        }
        return arrayList;
    }

    public static LinkedHashMap l(eic0 eic0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (eic0Var instanceof zhc0) {
            linkedHashMap.put("action", Constants.DEEPLINK);
            linkedHashMap.put(Constants.DEEPLINK, ((zhc0) eic0Var).b());
            return linkedHashMap;
        }
        if (eic0Var instanceof dic0) {
            linkedHashMap.put("action", "switch");
            return linkedHashMap;
        }
        if (eic0Var instanceof cic0) {
            linkedHashMap.put("action", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
            linkedHashMap.putAll(((cic0) eic0Var).b());
            return linkedHashMap;
        }
        if (eic0Var instanceof aic0) {
            linkedHashMap.put("action", "just_interact");
            return linkedHashMap;
        }
        if (eic0Var instanceof bic0) {
            linkedHashMap.put("action", "perform_action");
            bic0 bic0Var = (bic0) eic0Var;
            linkedHashMap.put("action_id", bic0Var.b());
            linkedHashMap.putAll(bic0Var.c());
            return linkedHashMap;
        }
        if (eic0Var == null) {
            linkedHashMap.put("action", "no_action");
            return linkedHashMap;
        }
        w511.b();
        return null;
    }

    public static CreativeType m(PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType) {
        switch (uei0.a[popupPriorityLauncher$PopupType.ordinal()]) {
            case 1:
                return CreativeType.MainScreenOnboarding;
            case 2:
                return CreativeType.Card;
            case 3:
                return CreativeType.Story;
            case 4:
                return CreativeType.Fullscreen;
            case 5:
                return CreativeType.Ticket;
            case 6:
            case 7:
            case 8:
                return CreativeType.Unsupported;
            default:
                w511.b();
                return null;
        }
    }

    public static LinkedHashMap o(tf20 tf20Var, boc0 boc0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_id", tf20Var.getId());
        linkedHashMap.putAll(l(tf20Var.getAction()));
        if (tf20Var instanceof ag20) {
            linkedHashMap.put("content_type", "text");
            linkedHashMap.put("text", ((ag20) tf20Var).d().a().toString());
            return linkedHashMap;
        }
        if (tf20Var instanceof of20) {
            linkedHashMap.put("content_type", "icon");
            return linkedHashMap;
        }
        if (tf20Var instanceof yf20) {
            linkedHashMap.put("content_type", "switch");
            yf20 yf20Var = (yf20) tf20Var;
            linkedHashMap.put("text", yf20Var.e().a().toString());
            Boolean bool = (Boolean) boc0Var.c.get(yf20Var.getId());
            linkedHashMap.put("turn", String.valueOf(bool != null ? bool.booleanValue() : boc0Var.d));
            return linkedHashMap;
        }
        if (tf20Var instanceof kf20) {
            linkedHashMap.put("content_type", "button");
            return linkedHashMap;
        }
        if (tf20Var instanceof vf20) {
            linkedHashMap.put("content_type", "spacer");
            return linkedHashMap;
        }
        w511.b();
        return null;
    }

    public static yo40 u(String str) {
        return new yo40((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : wia1.e(str.charAt(0)));
    }

    @Override // defpackage.q25
    public void a(r25 r25Var) {
        g05 g05Var;
        List list;
        List list2;
        g05 g05Var2;
        TabTitlesLayoutView tabTitlesLayoutView = (TabTitlesLayoutView) this.a;
        g05Var = tabTitlesLayoutView.mHost;
        if (g05Var == null) {
            return;
        }
        int f = r25Var.f();
        list = tabTitlesLayoutView.mDataList;
        if (list != null) {
            list2 = tabTitlesLayoutView.mDataList;
            g9l g9lVar = (g9l) list2.get(f);
            v3k a = g9lVar == null ? null : g9lVar.a();
            if (a != null) {
                g05Var2 = tabTitlesLayoutView.mHost;
                ((sr4) g05Var2).m(a, f);
            }
        }
    }

    @Override // defpackage.d1k
    public boolean b() {
        return !((qoh) this.a).isActive();
    }

    @Override // defpackage.nkw0
    public String c() {
        return ((pkw0) this.a).b;
    }

    @Override // defpackage.nkw0
    public void d(mkw0 mkw0Var) {
        pkw0 pkw0Var = (pkw0) this.a;
        int length = pkw0Var.w.length;
        for (int i = 1; i < length; i++) {
            int i2 = pkw0Var.w[i];
            if (i2 == 1) {
                mkw0Var.b(i, pkw0Var.x[i]);
            } else if (i2 == 2) {
                mkw0Var.z(pkw0Var.y[i], i);
            } else if (i2 == 3) {
                mkw0Var.m0(i, pkw0Var.z[i]);
            } else if (i2 == 4) {
                mkw0Var.m(i, pkw0Var.A[i]);
            } else if (i2 == 5) {
                mkw0Var.p(i);
            }
        }
    }

    @Override // defpackage.d1k
    public void dispose() {
        if (b()) {
            return;
        }
        ((qoh) this.a).a(null);
    }

    @Override // defpackage.a1q0
    public void e(u1m u1mVar, String str, Throwable th) {
        ((qeu) this.a).c(u1mVar, str, th);
    }

    @Override // defpackage.d1k
    public noh f() {
        return (qoh) this.a;
    }

    @Override // defpackage.a1q0
    public void g(u1m u1mVar, pyp0 pyp0Var, Exception exc) {
        qeu qeuVar = (qeu) this.a;
        String a = pyp0Var.getA();
        String d = qoi0.a(pyp0Var.getClass()).d();
        if (d == null) {
            d = "unknown type";
        }
        qeuVar.y(u1mVar, a, d, exc);
    }

    @Override // defpackage.n8s
    public StyledTypefaceSpan h(ContextThemeWrapper contextThemeWrapper, FormattedText$FontWeight formattedText$FontWeight, FormattedText$FontStyle formattedText$FontStyle) {
        PlusPlaqueFontStyle plusPlaqueFontStyle;
        PlusPlaqueFontWeight plusPlaqueFontWeight;
        int i;
        int i2;
        int i3 = xxf0.a[formattedText$FontStyle.ordinal()];
        int i4 = 2;
        if (i3 == 1) {
            plusPlaqueFontStyle = PlusPlaqueFontStyle.NORMAL;
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            plusPlaqueFontStyle = PlusPlaqueFontStyle.ITALIC;
        }
        switch (formattedText$FontWeight == null ? -1 : xxf0.b[formattedText$FontWeight.ordinal()]) {
            case -1:
                plusPlaqueFontWeight = PlusPlaqueFontWeight.REGULAR;
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
            case 2:
            case 3:
                plusPlaqueFontWeight = PlusPlaqueFontWeight.LIGHT;
                break;
            case 4:
                plusPlaqueFontWeight = PlusPlaqueFontWeight.REGULAR;
                break;
            case 5:
                plusPlaqueFontWeight = PlusPlaqueFontWeight.MEDIUM;
                break;
            case 6:
                plusPlaqueFontWeight = PlusPlaqueFontWeight.BOLD;
                break;
            case 7:
            case 8:
            case 9:
                plusPlaqueFontWeight = PlusPlaqueFontWeight.HEAVY;
                break;
        }
        yxf0 yxf0Var = new yxf0(plusPlaqueFontWeight, plusPlaqueFontStyle);
        ((zhd0) this.a).getClass();
        int i5 = yhd0.a[yxf0Var.h().ordinal()];
        if (i5 == 1) {
            i = 1;
        } else if (i5 != 2) {
            i = 3;
            if (i5 != 3) {
                if (i5 == 4) {
                    i = 5;
                } else {
                    if (i5 != 5) {
                        w511.b();
                        return null;
                    }
                    i = 6;
                }
            }
        } else {
            i = 0;
        }
        int i6 = yhd0.b[yxf0Var.g().ordinal()];
        if (i6 == 1) {
            i2 = 0;
        } else {
            if (i6 != 2) {
                w511.b();
                return null;
            }
            i2 = 2;
        }
        int[] iArr = up11.a;
        Typeface w = eja1.w(i, i2);
        if (w == null) {
            w = Typeface.DEFAULT;
        }
        int i7 = xxf0.c[plusPlaqueFontStyle.ordinal()];
        if (i7 == 1) {
            i4 = 0;
        } else if (i7 != 2) {
            w511.b();
            return null;
        }
        return new StyledTypefaceSpan(w, i4);
    }

    public cf31 j(String str, ZoneVerticalMulticlass zoneVerticalMulticlass, boolean z) {
        Set a = ((g) this.a).a(str);
        Integer num = zoneVerticalMulticlass.a;
        List<String> list = zoneVerticalMulticlass.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (String str2 : list) {
            arrayList.add(new viq0(str2, a.contains(str2)));
        }
        n7v n7vVar = zoneVerticalMulticlass.c;
        String str3 = zoneVerticalMulticlass.d;
        ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails = zoneVerticalMulticlass.e;
        df31 df31Var = new df31(null, null, zoneVerticalMulticlassDetails.b, zoneVerticalMulticlassDetails.a, zoneVerticalMulticlassDetails.c);
        SelectionRules selectionRules = zoneVerticalMulticlass.f;
        boolean z2 = zoneVerticalMulticlass.g;
        e5 e5Var = e5.INSTANCE;
        boolean z3 = zoneVerticalMulticlass.i;
        EmptyList emptyList = EmptyList.a;
        return new cf31(str, num, arrayList, n7vVar, str3, df31Var, selectionRules, z2, null, emptyList, null, z, e5Var, z3, emptyList);
    }

    public void k(xhc0 xhc0Var, boc0 boc0Var) {
        roc0 b = xhc0Var.b();
        Map c = xhc0Var.c();
        lho lhoVar = (lho) this.a;
        String str = b.a;
        Object obj = boc0Var.a.get(MetaDataField.SCREEN_FIELD);
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            str2 = "no_value";
        }
        loc0 loc0Var = b.c;
        joc0 joc0Var = loc0Var instanceof joc0 ? (joc0) loc0Var : null;
        String num = joc0Var != null ? Integer.valueOf(joc0Var.a()).toString() : null;
        String str3 = num != null ? num : "no_value";
        List i = i(b.b);
        ArrayList arrayList = new ArrayList(tcc.n(i, 10));
        Iterator it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(o((tf20) it.next(), boc0Var));
        }
        lhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plaque_id", str);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, str2);
        linkedHashMap.put("notification_count", str3);
        linkedHashMap.put("widget_list", arrayList);
        linkedHashMap.put("metric_context", c);
        linkedHashMap.put("_meta", lho.a(1, new HashMap()));
        lhoVar.d("CashbackBadge.Shown", linkedHashMap);
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.a;
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
        int i3 = i2 + i;
        while (i < i3) {
            qg20 qg20Var = (qg20) this.a;
            View childAt = qg20Var.a.getChildAt(i);
            if (childAt == null) {
                ((s59) qg20Var.b).l(oyr.i(i, "Has not child at position "));
            } else {
                qg20Var.b(childAt);
            }
            i++;
        }
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        drd0 f451Var;
        drd0 drd0Var;
        qg20 qg20Var = (qg20) this.a;
        ViewGroup viewGroup = qg20Var.a;
        int i3 = i2 + i;
        while (i < i3) {
            imc0 imc0Var = qg20Var.h;
            tls tlsVar = qg20Var.i;
            eg20 eg20Var = (eg20) qg20Var.e.get(i);
            if (eg20Var instanceof kf20) {
                drd0Var = new g451(viewGroup.getContext(), tlsVar);
            } else if (eg20Var instanceof of20) {
                drd0Var = new h451(viewGroup.getContext(), tlsVar);
            } else if (eg20Var instanceof vf20) {
                drd0Var = new j451(viewGroup.getContext(), tlsVar);
            } else if (eg20Var instanceof yf20) {
                drd0Var = new k451(viewGroup.getContext(), tlsVar);
            } else if (eg20Var instanceof ag20) {
                drd0Var = new l451(viewGroup.getContext(), tlsVar);
            } else {
                if (eg20Var instanceof rf20) {
                    f451Var = new i451(viewGroup.getContext(), imc0Var, tlsVar);
                } else {
                    if (!(eg20Var instanceof if20)) {
                        w511.b();
                        return;
                    }
                    f451Var = new f451(viewGroup.getContext(), imc0Var, tlsVar);
                }
                drd0Var = f451Var;
            }
            if (qg20Var.j) {
                drd0Var.a().setTransitionName("plaque_container_transition_name");
            }
            drd0Var.a().setTag(cah0.plaque_sdk_micro_widget_view_holder_tag, drd0Var);
            drd0Var.a().setLayoutDirection(viewGroup.getLayoutDirection());
            qg20Var.g.add(i, drd0Var);
            drd0Var.a = true;
            viewGroup.addView(drd0Var.a(), i, new ViewGroup.LayoutParams(-2, -2));
            i++;
        }
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        qg20 qg20Var = (qg20) this.a;
        ViewGroup viewGroup = qg20Var.a;
        View childAt = viewGroup.getChildAt(i);
        qg20Var.b(childAt);
        viewGroup.removeViewAt(i);
        viewGroup.addView(childAt, i2, new ViewGroup.LayoutParams(-2, -2));
        ArrayList arrayList = qg20Var.g;
        arrayList.add(i2, arrayList.remove(i));
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        qg20 qg20Var = (qg20) this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            qg20Var.a.removeViewAt(i);
            qg20Var.g.remove(i);
        }
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        ((atx0) ((eba1) this.a).a).a.t();
    }

    @Override // defpackage.q25
    public void p(r25 r25Var) {
        g05 g05Var;
        g05 g05Var2;
        TabTitlesLayoutView tabTitlesLayoutView = (TabTitlesLayoutView) this.a;
        g05Var = tabTitlesLayoutView.mHost;
        if (g05Var == null) {
            return;
        }
        int f = r25Var.f();
        g05Var2 = tabTitlesLayoutView.mHost;
        ((sr4) g05Var2).o(f);
    }

    @Override // defpackage.vm11
    public Object q() {
        return (JSONObject) this.a;
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        return new tz50(yv60Var);
    }

    public boolean s() {
        y1a1 y1a1Var = ((com.google.android.gms.measurement.internal.g) this.a).y;
        com.google.android.gms.measurement.internal.g.g(y1a1Var);
        return Log.isLoggable(y1a1Var.Qg(), 3);
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof JSONObject;
    }

    public yo40(qka1 qka1Var, com.google.android.gms.measurement.internal.g gVar) {
        this.a = gVar;
    }

    public yo40(rqo rqoVar) {
        fep0.Companion.getClass();
        this.a = ((jbh) rqoVar).c(fep0.d);
    }

    public yo40(a aVar, su51 su51Var) {
        this.a = aVar;
    }

    public yo40() {
        this.a = new JSONObject();
    }

    public /* synthetic */ yo40(Object obj) {
        this.a = obj;
    }
}
