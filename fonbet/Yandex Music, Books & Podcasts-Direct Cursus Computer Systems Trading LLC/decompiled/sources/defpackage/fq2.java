package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.ui.AccountNotAuthorizedActivity;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.debug.panel.internal.model.ui.c;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.e;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.h;
import com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import com.yandex.plus.plaquesdk.plaque.adapter.j;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public final /* synthetic */ class fq2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fq2(View view, Function1 function1) {
        this.a = 11;
        this.b = view;
        this.c = (aur) function1;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [edu, jcp] */
    /* JADX WARN: Type inference failed for: r0v30, types: [edu, jcp] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v49, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int c;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hq2 hq2Var = (hq2) obj2;
                opn opnVar = (opn) obj;
                if (hq2Var.e != null && (c = opnVar.c()) != -1) {
                    hq2Var.e.i(c, hq2Var.d.get(c));
                    break;
                }
                break;
            case 1:
                ((a3j) obj2).invoke();
                Object obj3 = kib.a;
                a a = kib.a(((BindCardActivity) obj).l().b());
                if (a != null) {
                    a.a(rre.j);
                    break;
                }
                break;
            case 2:
                mph mphVar = (mph) obj;
                if (!((Boolean) ((Function1) obj2).invoke(v84.b)).booleanValue()) {
                    mphVar.performClick();
                    break;
                }
                break;
            case 3:
                mph mphVar2 = (mph) obj;
                if (!((Boolean) ((pl3) obj2).invoke()).booleanValue()) {
                    mphVar2.performClick();
                    break;
                }
                break;
            case 4:
                ru.yandex.music.catalog.juicybottommenu.adapter.holders.a aVar = (ru.yandex.music.catalog.juicybottommenu.adapter.holders.a) obj2;
                xb5 xb5Var = (xb5) obj;
                Context context = aVar.u;
                jsg jsgVar = xb5Var.f;
                if (jsgVar != null) {
                    ImageView v = aVar.v();
                    context.getClass();
                    int i2 = jsgVar.b;
                    jyr jyrVar = sht.a;
                    Object nonNull = Preconditions.nonNull(y2x.w(context, i2));
                    nonNull.getClass();
                    v.setImageDrawable((Drawable) nonNull);
                    Integer num = xb5Var.i;
                    aVar.v().setColorFilter(ksw.C(context, num != null ? num.intValue() : aVar.B));
                }
                ((vf) aVar.v).a.invoke();
                break;
            case 5:
                ((p8n) obj2).d.a(((l8n) obj).c());
                break;
            case 6:
                ecp ecpVar = (ecp) obj2;
                mcp mcpVar = (mcp) obj;
                if (ecpVar.c() != -1 && !ecpVar.u(ecpVar.c())) {
                    view.getClass();
                    Object systemService = view.getContext().getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    int c2 = ecpVar.c();
                    if (c2 != -1) {
                        mcpVar.k = (kcp) mcpVar.i.get(c2);
                        mcpVar.g();
                        mcpVar.d.t(c2);
                        break;
                    }
                }
                break;
            case 7:
                ecp ecpVar2 = (ecp) obj2;
                mcp mcpVar2 = (mcp) obj;
                if (ecpVar2.c() != -1) {
                    TextView textView = ecpVar2.x;
                    textView.getClass();
                    Object systemService2 = textView.getContext().getSystemService("input_method");
                    systemService2.getClass();
                    ((InputMethodManager) systemService2).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    int c3 = ecpVar2.c();
                    if (c3 != -1) {
                        mcpVar2.k = (kcp) mcpVar2.i.get(c3);
                        mcpVar2.g();
                        mcpVar2.d.t(c3);
                        break;
                    }
                }
                break;
            case 8:
                ((View.OnClickListener) obj).onClick(view);
                ((b1r) obj2).a(1);
                break;
            case 9:
                ((kd) obj2).mo33b(obj);
                break;
            case 10:
                Object systemService3 = ((TextView) obj2).getContext().getSystemService("clipboard");
                systemService3.getClass();
                ((ClipboardManager) systemService3).setPrimaryClip(ClipData.newPlainText("", (String) obj));
                break;
            case 11:
                View view2 = (View) obj2;
                ?? r6 = (aur) obj;
                view2.getClass();
                Context context2 = view2.getContext();
                context2.getClass();
                ComponentCallbacks2 E = tt0.E(context2);
                dzf dzfVar = E instanceof dzf ? (dzf) E : null;
                x97.y(dzfVar != null ? wyf.F(dzfVar.getLifecycle()) : cmd.a, null, null, new x77(r6, null, 3), 3);
                break;
            case 12:
                int i3 = AccountNotAuthorizedActivity.m;
                ((AccountNotAuthorizedActivity) obj2).n(((l) obj).e.v);
                break;
            case 13:
                e eVar = (e) obj2;
                eVar.t().setTextIsSelectable(false);
                eVar.u.invoke(((c) obj).toString());
                eVar.t().setTextIsSelectable(true);
                break;
            case 14:
                Function1 function1 = ((h) obj2).u;
                String spannedString = ((SpannedString) obj).toString();
                spannedString.getClass();
                function1.invoke(spannedString);
                break;
            case 15:
                ((b) obj2).T().setVisibility(8);
                ((View.OnClickListener) obj).onClick(view);
                break;
            case 16:
                com.yandex.plus.pay.ui.core.debug.internal.ui.info.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.ui.info.b) obj;
                Context context3 = ((View) obj2).getContext();
                context3.getClass();
                ClipboardManager clipboardManager = (ClipboardManager) context3.getSystemService(ClipboardManager.class);
                if (clipboardManager != null) {
                    f fVar = bVar.u;
                    s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.debug.internal.ui.info.b.w;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(((TextView) fVar.g(s9fVarArr[0])).getText(), ((TextView) bVar.v.g(s9fVarArr[1])).getText()));
                    break;
                }
                break;
            case 17:
                ((ezc) ((com.yandex.plus.core.debug.panel.internal.presentation.adapter.b) obj2).h).invoke(Integer.valueOf(((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c) obj).c()));
                break;
            case 18:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b) obj2;
                ((ClipboardManager) bVar2.j.getValue()).setPrimaryClip(ClipData.newPlainText(null, bVar2.c().getText()));
                Toast.makeText(((ErrorContentView) obj).getContext(), R.string.PlusPay_Error_ErrorCode_Copy_Message, 0).show();
                break;
            case 19:
                ((com.yandex.plus.pay.ui.core.mobile.view.payment.promos.e) obj2).h.invoke((com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f) obj);
                break;
            default:
                ((j) obj2).c().invoke((x) obj);
                break;
        }
    }

    public /* synthetic */ fq2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
