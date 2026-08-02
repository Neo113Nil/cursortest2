package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$style;
import defpackage.ap61;
import defpackage.b071;
import defpackage.b64;
import defpackage.b971;
import defpackage.bb81;
import defpackage.c181;
import defpackage.e881;
import defpackage.eu81;
import defpackage.evu0;
import defpackage.fh61;
import defpackage.fo81;
import defpackage.fx81;
import defpackage.ge81;
import defpackage.gx81;
import defpackage.h081;
import defpackage.h181;
import defpackage.hf71;
import defpackage.ho81;
import defpackage.ic71;
import defpackage.jl40;
import defpackage.jn81;
import defpackage.ki71;
import defpackage.lf71;
import defpackage.ny61;
import defpackage.o481;
import defpackage.oi71;
import defpackage.or81;
import defpackage.q971;
import defpackage.qu81;
import defpackage.r781;
import defpackage.rcc;
import defpackage.ru71;
import defpackage.s681;
import defpackage.se81;
import defpackage.sk81;
import defpackage.so71;
import defpackage.sr71;
import defpackage.sr81;
import defpackage.su81;
import defpackage.tcc;
import defpackage.th81;
import defpackage.ti71;
import defpackage.tje;
import defpackage.tw81;
import defpackage.u481;
import defpackage.vd81;
import defpackage.vl71;
import defpackage.w511;
import defpackage.wi71;
import defpackage.wls;
import defpackage.x571;
import defpackage.xx71;
import defpackage.y781;
import defpackage.y871;
import defpackage.yl71;
import defpackage.zb71;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class fa1 extends SuspendLambda implements wls {
    public sr71 b;
    public Object c;
    public int d;
    public final /* synthetic */ q971 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa1(q971 q971Var, Continuation continuation) {
        super(2, continuation);
        this.e = q971Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new fa1(this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new fa1(this.e, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d6 A[LOOP:3: B:71:0x03d0->B:73:0x03d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sr71 sr71Var;
        Object a;
        sr71 sr71Var2;
        Object a2;
        ListBuilder j;
        Object a3;
        wi71 wi71Var;
        Object a4;
        y781 y781Var;
        Object value;
        ListBuilder listBuilder;
        Context context;
        ListBuilder a5;
        sr81 sr81Var;
        int ordinal;
        fx81 fx81Var;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        Iterator it;
        tw81 tw81Var;
        ListBuilder j2;
        w40 w40Var;
        Object value2;
        Object value3;
        sk81 sk81Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        String str4 = "ID";
        if (i == 0) {
            b.b(obj);
            sr71Var = ((e881) this.e.m.getValue()).b;
            if (((e881) this.e.m.getValue()).d.isEmpty()) {
                q971 q971Var = this.e;
                e881 a6 = e881.a((e881) q971Var.m.getValue(), null, null, true, null, 11);
                kotlinx.coroutines.flow.r0 r0Var = q971Var.m;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, a6));
            }
            if (sr71Var instanceof yl71) {
                q971 q971Var2 = this.e;
                y781 y781Var2 = q971Var2.h;
                vd81 vd81Var = q971Var2.d;
                this.b = sr71Var;
                this.c = y781Var2;
                this.d = 1;
                a4 = vd81Var.a(this);
                if (a4 != coroutineSingletons) {
                    y781Var = y781Var2;
                    h181 h181Var = (h181) a4;
                    y781Var.getClass();
                    context = y781Var.a;
                    a5 = rcc.a();
                    b971 b971Var = h181Var.b;
                    sr81Var = sr81.a;
                    a5.add(sr81Var);
                    a5.add(new su81(context.getString(R$string.debug_panel_application_info)));
                    a5.add(new gx81(context.getString(R$string.debug_panel_app_id), b971Var.a));
                    a5.add(new gx81(context.getString(R$string.debug_panel_app_version), b971Var.b));
                    a5.add(new gx81(context.getString(R$string.debug_panel_system), b971Var.c));
                    a5.add(new gx81(context.getString(R$string.debug_panel_api_level), b971Var.d));
                    fo81 fo81Var = h181Var.c;
                    a5.add(sr81Var);
                    a5.add(new su81(context.getString(R$string.debug_panel_sdk_integration)));
                    String string = context.getString(R$string.debug_panel_ads_sdk_version);
                    String str5 = fo81Var.a;
                    qu81 qu81Var = fo81Var.b;
                    x80 x80Var = qu81Var.a;
                    a5.add(new gx81(string, str5));
                    ordinal = x80Var.ordinal();
                    if (ordinal != 0) {
                    }
                    if (x80Var != x80.b) {
                    }
                    List list = qu81Var.b;
                    a5.add(new gx81(context.getString(R$string.debug_panel_sdk_integration_status), fx81Var, list == null ? new vl71(a.X(list, "\n", null, null, null, 62), r7) : null));
                    o481 o481Var = h181Var.d;
                    str = o481Var.a;
                    str2 = o481Var.b;
                    str3 = o481Var.c;
                    if (str == null) {
                    }
                    a5.add(sr81Var);
                    a5.add(new su81(context.getString(R$string.debug_panel_advertisement_network_settings)));
                    if (str != null) {
                    }
                    if (str2 != null) {
                    }
                    if (str3 != null) {
                    }
                    a5.add(th81.a);
                    arrayList = h181Var.e.a;
                    if (!arrayList.isEmpty()) {
                    }
                    ru71 ru71Var = h181Var.f;
                    sr81 sr81Var2 = sr81.a;
                    a5.add(sr81Var2);
                    a5.add(new su81(context.getString(R$string.debug_panel_user_privacy)));
                    a5.add(new gx81(context.getString(R$string.debug_panel_age_restricted_user), y781Var.a(ru71Var.b)));
                    a5.add(new gx81(context.getString(R$string.debug_panel_has_location_consent), y781Var.a(Boolean.valueOf(ru71Var.a))));
                    a5.add(new gx81(context.getString(R$string.debug_panel_has_user_consent), y781Var.a(ru71Var.c)));
                    a5.add(new gx81(context.getString(R$string.debug_panel_tcf_consent), !ru71Var.d ? new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_provided)) : new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_no_value_set))));
                    xx71 xx71Var = h181Var.g;
                    a5.add(sr81Var2);
                    a5.add(new su81(context.getString(R$string.debug_panel_features)));
                    ba0 ba0Var = ba0.b;
                    a5.add(new ap61(xx71Var.a));
                    j = a5.j();
                    listBuilder = j;
                }
            } else if (sr71Var instanceof ki71) {
                q971 q971Var3 = this.e;
                wi71 wi71Var2 = q971Var3.i;
                s681 s681Var = q971Var3.e;
                this.b = sr71Var;
                this.c = wi71Var2;
                this.d = 2;
                a3 = s681Var.a(this);
                if (a3 != coroutineSingletons) {
                    wi71Var = wi71Var2;
                    wi71Var.getClass();
                    ArrayList arrayList2 = ((c181) a3).a;
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    listBuilder = arrayList3;
                }
            } else if (sr71Var instanceof lf71) {
                b071 b071Var = this.e.k;
                fh61 fh61Var = ((lf71) sr71Var).b;
                b071Var.getClass();
                ListBuilder a7 = rcc.a();
                a7.add(sr81.a);
                a7.add(new su81("Info"));
                w40 w40Var2 = fh61Var.j;
                List<ti71> list2 = fh61Var.i;
                String str6 = fh61Var.f;
                String str7 = fh61Var.g;
                if (w40Var2 == w40.c && str6 != null) {
                    if (str7 != null && !evu0.J(str7)) {
                        str4 = str7;
                    }
                    a7.add(new gx81(str4, str6));
                }
                a7.add(new gx81("Type", fh61Var.j.b));
                ArrayList<or81> arrayList4 = fh61Var.h;
                if (arrayList4 != null) {
                    for (or81 or81Var : arrayList4) {
                        a7.add(new gx81(or81Var.a, or81Var.b));
                    }
                }
                if (list2 != null && !list2.isEmpty()) {
                    a7.add(sr81.a);
                    a7.add(new su81("CPM floors"));
                    String concat = (str7 == null || evu0.J(str7)) ? "" : str7.concat(Extension.COLON_SPACE);
                    for (ti71 ti71Var : list2) {
                        a7.add(new gx81(b64.j(concat, ti71Var.a), "cpm: " + ti71Var.b));
                    }
                }
                j = a7.j();
                listBuilder = j;
            } else if (sr71Var instanceof ic71) {
                h081 h081Var = this.e.f;
                String str8 = ((ic71) sr71Var).b;
                this.b = sr71Var;
                this.d = 3;
                a2 = h081Var.a(str8, this);
                if (a2 != coroutineSingletons) {
                    sr71Var2 = sr71Var;
                    tw81Var = (tw81) a2;
                    if (tw81Var != null) {
                    }
                    sr71Var = sr71Var2;
                    listBuilder = null;
                }
            } else {
                if (!(sr71Var instanceof so71)) {
                    w511.b();
                    return null;
                }
                jn81 jn81Var = this.e.g;
                String str9 = ((so71) sr71Var).b;
                this.b = sr71Var;
                this.d = 4;
                a = jn81Var.a(str9, this);
                if (a != coroutineSingletons) {
                    sr71Var2 = sr71Var;
                    sk81Var = (sk81) a;
                    if (sk81Var != null) {
                    }
                    sr71Var = sr71Var2;
                    listBuilder = null;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            y781Var = (y781) this.c;
            sr71Var = this.b;
            b.b(obj);
            a4 = obj;
            h181 h181Var2 = (h181) a4;
            y781Var.getClass();
            context = y781Var.a;
            a5 = rcc.a();
            b971 b971Var2 = h181Var2.b;
            sr81Var = sr81.a;
            a5.add(sr81Var);
            a5.add(new su81(context.getString(R$string.debug_panel_application_info)));
            a5.add(new gx81(context.getString(R$string.debug_panel_app_id), b971Var2.a));
            a5.add(new gx81(context.getString(R$string.debug_panel_app_version), b971Var2.b));
            a5.add(new gx81(context.getString(R$string.debug_panel_system), b971Var2.c));
            a5.add(new gx81(context.getString(R$string.debug_panel_api_level), b971Var2.d));
            fo81 fo81Var2 = h181Var2.c;
            a5.add(sr81Var);
            a5.add(new su81(context.getString(R$string.debug_panel_sdk_integration)));
            String string2 = context.getString(R$string.debug_panel_ads_sdk_version);
            String str52 = fo81Var2.a;
            qu81 qu81Var2 = fo81Var2.b;
            x80 x80Var2 = qu81Var2.a;
            a5.add(new gx81(string2, str52));
            ordinal = x80Var2.ordinal();
            if (ordinal != 0) {
                fx81Var = new fx81(R$attr.debug_panel_color_green, 0, 8, Integer.valueOf(R$drawable.debug_panel_icon_success), context.getString(R$string.debug_panel_integrated));
            } else if (ordinal == 1) {
                fx81Var = new fx81(R$attr.debug_panel_color_red, 0, 8, Integer.valueOf(R$drawable.debug_panel_icon_error), context.getString(R$string.debug_panel_integrated));
            } else {
                if (ordinal != 2) {
                    w511.b();
                    return null;
                }
                fx81Var = new fx81(R$attr.debug_panel_color_red, 0, 8, Integer.valueOf(R$drawable.debug_panel_icon_error), context.getString(R$string.debug_panel_integration_errors));
            }
            int i2 = x80Var2 != x80.b ? R$attr.debug_panel_label_primary : fx81Var.b;
            List list3 = qu81Var2.b;
            a5.add(new gx81(context.getString(R$string.debug_panel_sdk_integration_status), fx81Var, list3 == null ? new vl71(a.X(list3, "\n", null, null, null, 62), i2) : null));
            o481 o481Var2 = h181Var2.d;
            str = o481Var2.a;
            str2 = o481Var2.b;
            str3 = o481Var2.c;
            if (str == null || str3 != null || str2 != null) {
                a5.add(sr81Var);
                a5.add(new su81(context.getString(R$string.debug_panel_advertisement_network_settings)));
                if (str != null) {
                    a5.add(new gx81("Page ID", str));
                }
                if (str2 != null) {
                    a5.add(new gx81(context.getString(R$string.debug_panel_app_review_status), str2));
                }
                if (str3 != null) {
                    a5.add(new gx81("app-ads.txt", str3));
                }
                a5.add(th81.a);
            }
            arrayList = h181Var2.e.a;
            if (!arrayList.isEmpty()) {
                a5.add(sr81Var);
                List x0 = a.x0(arrayList, new u481());
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : x0) {
                    if (((sk81) obj2).g instanceof r781) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : x0) {
                    if (((sk81) obj3).g instanceof bb81) {
                        arrayList6.add(obj3);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : x0) {
                    if (((sk81) obj4).g instanceof ge81) {
                        arrayList7.add(obj4);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    a5.add(new su81(context.getString(R$string.debug_panel_completed_integration)));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        y781Var.b(a5, (sk81) it2.next());
                    }
                }
                if (!arrayList6.isEmpty()) {
                    a5.add(new su81(context.getString(R$string.debug_panel_invalid_integration)));
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        y781Var.b(a5, (sk81) it3.next());
                    }
                }
                if (!arrayList7.isEmpty()) {
                    a5.add(new su81(context.getString(R$string.debug_panel_missing_integration)));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        y781Var.b(a5, (sk81) it4.next());
                    }
                }
            }
            ru71 ru71Var2 = h181Var2.f;
            sr81 sr81Var22 = sr81.a;
            a5.add(sr81Var22);
            a5.add(new su81(context.getString(R$string.debug_panel_user_privacy)));
            a5.add(new gx81(context.getString(R$string.debug_panel_age_restricted_user), y781Var.a(ru71Var2.b)));
            a5.add(new gx81(context.getString(R$string.debug_panel_has_location_consent), y781Var.a(Boolean.valueOf(ru71Var2.a))));
            a5.add(new gx81(context.getString(R$string.debug_panel_has_user_consent), y781Var.a(ru71Var2.c)));
            a5.add(new gx81(context.getString(R$string.debug_panel_tcf_consent), !ru71Var2.d ? new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_provided)) : new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_no_value_set))));
            xx71 xx71Var2 = h181Var2.g;
            a5.add(sr81Var22);
            a5.add(new su81(context.getString(R$string.debug_panel_features)));
            ba0 ba0Var2 = ba0.b;
            a5.add(new ap61(xx71Var2.a));
            j = a5.j();
            listBuilder = j;
        } else if (i == 2) {
            wi71Var = (wi71) this.c;
            sr71Var = this.b;
            b.b(obj);
            a3 = obj;
            wi71Var.getClass();
            ArrayList arrayList22 = ((c181) a3).a;
            ArrayList arrayList32 = new ArrayList(tcc.n(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
                eu81 eu81Var = (eu81) it.next();
                arrayList32.add(new se81(eu81Var.a, eu81Var.b, eu81Var.c));
            }
            listBuilder = arrayList32;
        } else if (i == 3) {
            sr71Var2 = this.b;
            b.b(obj);
            a2 = obj;
            tw81Var = (tw81) a2;
            if (tw81Var != null) {
                this.e.j.getClass();
                ListBuilder a8 = rcc.a();
                a8.add(sr81.a);
                a8.add(new su81(tw81Var.a));
                a8.add(new gx81("Format", tw81Var.b));
                a8.add(new gx81("ID", tw81Var.c));
                for (hf71 hf71Var : tw81Var.d.a) {
                    zb71 zb71Var = hf71Var.f;
                    if (zb71Var instanceof x571) {
                        w40Var = w40.c;
                    } else {
                        if (!(zb71Var instanceof y871)) {
                            w511.b();
                            return null;
                        }
                        w40Var = w40.d;
                    }
                    y871 y871Var = zb71Var instanceof y871 ? (y871) zb71Var : null;
                    a8.add(new fh61(hf71Var.b, hf71Var.a, new fx81(R$attr.debug_panel_label_secondary, R$style.DebugPanelText_Body2, 4, null, "Mediation"), new vl71(R$attr.debug_panel_label_primary, R$style.DebugPanelText_Body1, w40Var.b), null, hf71Var.d, hf71Var.e, hf71Var.c, y871Var != null ? y871Var.b : null, w40Var, null, 1024));
                }
                j2 = a8.j();
                listBuilder = j2;
                sr71Var = sr71Var2;
            }
            sr71Var = sr71Var2;
            listBuilder = null;
        } else {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sr71Var2 = this.b;
            b.b(obj);
            a = obj;
            sk81Var = (sk81) a;
            if (sk81Var != null) {
                this.e.l.getClass();
                ListBuilder a9 = rcc.a();
                a9.add(sr81.a);
                a9.add(new su81("Integration"));
                String str10 = sk81Var.d;
                if (str10 != null) {
                    a9.add(new gx81("Adapter Version", str10));
                }
                String str11 = sk81Var.e;
                if (str11 != null) {
                    a9.add(new gx81("Latest Adapter Version", str11));
                }
                v90 v90Var = v90.b;
                a9.add(new ho81());
                j2 = a9.j();
                listBuilder = j2;
                sr71Var = sr71Var2;
            }
            sr71Var = sr71Var2;
            listBuilder = null;
        }
        q971 q971Var4 = this.e;
        if (listBuilder == null) {
            e881 e881Var = ((e881) q971Var4.m.getValue()).a;
            if (e881Var == null) {
                tje.N(q971Var4.a, null, null, new ca1(q971Var4, oi71.a, null), 3);
            } else {
                e881 a10 = e881.a(e881Var, null, null, false, null, 11);
                kotlinx.coroutines.flow.r0 r0Var2 = q971Var4.m;
                do {
                    value3 = r0Var2.getValue();
                } while (!r0Var2.k(value3, a10));
            }
        } else if (jl40.l(sr71Var, ((e881) q971Var4.m.getValue()).b)) {
            e881 a11 = e881.a((e881) this.e.m.getValue(), null, null, false, listBuilder, 3);
            kotlinx.coroutines.flow.r0 r0Var3 = this.e.m;
            do {
                value2 = r0Var3.getValue();
            } while (!r0Var3.k(value2, a11));
        }
        return zy11.a;
    }
}
