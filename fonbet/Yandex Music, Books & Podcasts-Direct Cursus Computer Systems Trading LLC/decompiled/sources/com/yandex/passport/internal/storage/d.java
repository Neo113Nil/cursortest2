package com.yandex.passport.internal.storage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.command.data.a1;
import defpackage.b6e;
import defpackage.ee6;
import defpackage.ern;
import defpackage.g4f;
import defpackage.g4i;
import defpackage.is6;
import defpackage.jfp;
import defpackage.kb6;
import defpackage.sro;
import defpackage.t5a;
import defpackage.v3a;
import defpackage.wfp;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        String str;
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return CollectionsKt.X(list, ";", null, null, null, 62);
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                split$default = StringsKt__StringsKt.split$default(str2, new String[]{";"}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    Long s0 = StringsKt.s0((String) it.next());
                    if (s0 != null) {
                        arrayList.add(s0);
                    }
                }
                return arrayList;
            case 2:
                com.yandex.passport.internal.network.response.e eVar = (com.yandex.passport.internal.network.response.e) obj;
                eVar.getClass();
                return eVar.a;
            case 3:
                ((String) obj).getClass();
                return Unit.a;
            case 4:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 5:
                com.yandex.passport.internal.badges.a aVar = (com.yandex.passport.internal.badges.a) obj;
                aVar.getClass();
                return com.yandex.passport.internal.badges.a.b(aVar);
            case 6:
                com.yandex.passport.internal.badges.a aVar2 = (com.yandex.passport.internal.badges.a) obj;
                aVar2.getClass();
                return com.yandex.passport.internal.badges.a.b(aVar2);
            case 7:
                com.yandex.passport.internal.badges.a aVar3 = (com.yandex.passport.internal.badges.a) obj;
                aVar3.getClass();
                return com.yandex.passport.internal.badges.a.b(aVar3);
            case 8:
                ((is6) obj).getClass();
                PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
                return new q0(a.getAccountsRetriever(), a.getMemberAccountRepository(), a.getProperties(), a.getFlagRepository());
            case 9:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                return Unit.a;
            case 10:
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) obj;
                layoutParams.getClass();
                int i = (int) (24 * g4i.a.density);
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
                return Unit.a;
            case 11:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.width = -2;
                marginLayoutParams.height = -2;
                DisplayMetrics displayMetrics = g4i.a;
                marginLayoutParams.setMarginEnd((int) (4 * displayMetrics.density));
                marginLayoutParams.topMargin = (int) (1 * displayMetrics.density);
                return Unit.a;
            case 12:
                View view = (View) obj;
                view.getClass();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams2.bottomMargin = (int) (2 * g4i.a.density);
                view.setLayoutParams(marginLayoutParams2);
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                b1 b1Var = (b1) obj;
                b1Var.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New SlothResult: " + b1Var, 8);
                }
                return Unit.a;
            case 15:
                ((FrameLayout) obj).getClass();
                return Unit.a;
            case 16:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 17:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                return Unit.a;
            case 18:
                g4f g4fVar2 = (g4f) obj;
                g4fVar2.getClass();
                g4fVar2.c = true;
                return Unit.a;
            case 19:
                g4f g4fVar3 = (g4f) obj;
                g4fVar3.getClass();
                g4fVar3.c = true;
                g4fVar3.h = true;
                return Unit.a;
            case 20:
                Pair pair = (Pair) obj;
                pair.getClass();
                Object obj4 = pair.a;
                Object obj5 = pair.b;
                if (obj5 == null || (str = obj5.toString()) == null) {
                    str = "";
                }
                return new Pair(obj4, str);
            case 21:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return Boolean.valueOf(StringsKt.U((CharSequence) pair2.b));
            case 22:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new Pair(entry.getKey(), entry.getValue());
            case 23:
                a1 a1Var = (a1) obj;
                a1Var.getClass();
                switch (a1Var.ordinal()) {
                    case 0:
                        return "yandex";
                    case 1:
                        return "lite";
                    case 2:
                        return LegacyAccountType.STRING_SOCIAL;
                    case 3:
                        return "pdd";
                    case 4:
                        return "phone";
                    case 5:
                        return "mail";
                    case 6:
                        return "music_phonish";
                    case 7:
                        return "children";
                    case 8:
                        return StringUtils.UNDEFINED;
                    default:
                        b6e.s();
                        return null;
                }
            case 24:
                g4f g4fVar4 = (g4f) obj;
                g4fVar4.getClass();
                g4fVar4.c = true;
                g4fVar4.e = true;
                g4fVar4.b = false;
                return Unit.a;
            case 25:
                Object obj6 = (kb6) obj;
                obj6.getClass();
                com.yandex.plus.bdui.flex.content.a aVar4 = obj6 instanceof com.yandex.plus.bdui.flex.content.a ? (com.yandex.plus.bdui.flex.content.a) obj6 : null;
                if (aVar4 != null && (obj2 = aVar4.a) != null) {
                    obj6 = obj2;
                }
                return ern.a(obj6.getClass());
            case 26:
                Object obj7 = (sro) obj;
                obj7.getClass();
                com.yandex.plus.bdui.flex.scaffold.a aVar5 = obj7 instanceof com.yandex.plus.bdui.flex.scaffold.a ? (com.yandex.plus.bdui.flex.scaffold.a) obj7 : null;
                if (aVar5 != null && (obj3 = aVar5.a) != null) {
                    obj7 = obj3;
                }
                return ern.a(obj7.getClass());
            case 27:
                ee6 ee6Var = (ee6) obj;
                ee6Var.getClass();
                t5a t5aVar = ee6Var.b;
                if (t5aVar != null) {
                    return com.yandex.plus.bdui.flex.utils.b.i(t5aVar);
                }
                return null;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ee6 ee6Var2 = (ee6) obj;
                ee6Var2.getClass();
                return new v3a(ee6Var2.a);
            default:
                ee6 ee6Var3 = (ee6) obj;
                ee6Var3.getClass();
                kb6 kb6Var = ee6Var3.c;
                kb6Var.getClass();
                com.yandex.plus.bdui.flex.content.a aVar6 = kb6Var instanceof com.yandex.plus.bdui.flex.content.a ? (com.yandex.plus.bdui.flex.content.a) kb6Var : null;
                com.yandex.plus.bdui.content.a aVar7 = aVar6 != null ? aVar6.a : null;
                aVar7.getClass();
                return aVar7;
        }
    }

    public /* synthetic */ d(com.yandex.plus.bdui.flex.utils.b bVar, int i) {
        this.a = i;
    }
}
