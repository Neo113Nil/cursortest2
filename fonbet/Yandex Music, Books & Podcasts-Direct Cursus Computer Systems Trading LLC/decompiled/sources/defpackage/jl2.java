package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.acquisition.sdk.button.section.ui.api.a;
import com.yandex.plus.acquisition.sdk.pay.common.api.b;
import com.yandex.plus.acquisition.sdk.pay.common.api.j;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.acquisition.sdk.pay.impl.analytics.e;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.h;
import com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class jl2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jl2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                kl2 kl2Var = (kl2) obj3;
                ol2 ol2Var = (ol2) obj2;
                hl2 hl2Var = (hl2) obj;
                hl2Var.getClass();
                if (kl2Var.c() != -1) {
                    int c = kl2Var.c();
                    int i2 = ol2Var.h;
                    if (c != i2) {
                        ol2Var.h(i2);
                        ol2Var.h(kl2Var.c());
                        int c2 = kl2Var.c();
                        ol2Var.h = c2;
                        kl2Var.v.invoke(hl2Var.b, Integer.valueOf(c2));
                        break;
                    }
                }
                break;
            case 1:
                one inputFocusTracker$div_release = ((gc8) obj2).getInputFocusTracker$div_release();
                if (((Boolean) ((szb) obj3).a((xzb) obj)).booleanValue()) {
                    bg3.s(view, inputFocusTracker$div_release);
                    break;
                }
                break;
            case 2:
                Bundle bundle = (Bundle) obj3;
                g8o g8oVar = (g8o) obj2;
                e9k e9kVar = (e9k) obj;
                kmk kmkVar = (kmk) bundle.getParcelable("ARG_PERSONAL_INFO");
                if (kmkVar != null) {
                    jyr jyrVar = s9k.a;
                    t requireActivity = g8oVar.requireActivity();
                    requireActivity.getClass();
                    s9k.c(requireActivity, e9kVar, kmkVar, bundle.getBoolean("ARG_IS_DEBUG"));
                    break;
                }
                break;
            case 3:
                com.yandex.plus.acquisition.sdk.pay.common.api.a aVar2 = (com.yandex.plus.acquisition.sdk.pay.common.api.a) obj2;
                r90 r90Var = (r90) obj;
                mw3 mw3Var = ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.a) obj3).m;
                if (mw3Var != null && (aVar = (a) mw3Var.f) != null) {
                    k kVar = aVar.a;
                    c cVar = (c) mw3Var.b;
                    Long l = kVar.j.e;
                    String str = kVar.b;
                    String str2 = kVar.c;
                    int i3 = kVar.a;
                    j jVar = kVar.g;
                    String str3 = jVar.a;
                    String str4 = jVar.f;
                    String str5 = jVar.d;
                    cVar.getClass();
                    str3.getClass();
                    str4.getClass();
                    str5.getClass();
                    com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a aVar3 = cVar.a;
                    String l2 = l != null ? l.toString() : null;
                    if (l2 == null) {
                        l2 = "no_value";
                    }
                    if (str == null) {
                        str = "no_value";
                    }
                    if (str2 == null) {
                        str2 = "no_value";
                    }
                    aVar3.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("config_id", l2);
                    linkedHashMap.put(Constants.KEY_PAGE, str);
                    eta.m(i3, "place", str2, "position", linkedHashMap);
                    linkedHashMap.put("title", str3);
                    linkedHashMap.put("subtitle", str4);
                    linkedHashMap.put("button_text", str5);
                    linkedHashMap.put("_meta", com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a.a(new HashMap()));
                    aVar3.b("OfferSection.Clicked", linkedHashMap);
                    e eVar = (e) ((b) ((com.yandex.plus.acquisition.sdk.pay.impl.b) mw3Var.c).h.getValue());
                    eVar.getClass();
                    PlusPayCompositeOffers.Offer a = ((com.yandex.plus.acquisition.sdk.pay.impl.providers.b) eVar.d).a(kVar);
                    if (a != null) {
                        x97.y(eVar.e, null, null, new com.yandex.plus.acquisition.sdk.pay.impl.analytics.c(eVar, a, kVar, aVar2, null), 3);
                    }
                    r90Var.invoke(kVar);
                    break;
                }
                break;
            case 4:
                ((Function1) obj3).invoke((com.yandex.plus.home.feature.panel.internalapi.analytics.b) ((vzt) obj2).c);
                ((Function0) obj).invoke();
                break;
            case 5:
                ClipboardManager clipboardManager = (ClipboardManager) obj3;
                m8f m8fVar = (m8f) obj2;
                com.yandex.plus.pay.ui.core.debug.internal.ui.log.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.ui.log.b) obj;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(((com.yandex.plus.pay.log.api.a) m8fVar.u(bVar.c())).c, ((TextView) bVar.u.g(com.yandex.plus.pay.ui.core.debug.internal.ui.log.b.v[0])).getText()));
                    break;
                }
                break;
            default:
                s9f[] s9fVarArr = h.n;
                ((RecyclerView) obj3).z0(((m8f) obj2).c() - 1);
                ((FloatingActionButton) obj).h(null, true);
                break;
        }
    }
}
