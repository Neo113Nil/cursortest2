package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.l;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.c;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.d;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.e;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.adapter.holders.a;

/* loaded from: classes4.dex */
public final class m8f extends k8g {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8f(int i) {
        super(l8f.q);
        this.e = i;
        switch (i) {
            case 5:
                super(d.p);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        switch (this.e) {
            case 0:
                ((a) opnVar).e(((xe) this.d.f.get(i)).a);
                break;
            case 1:
                b bVar = (b) opnVar;
                Pair pair = (Pair) u(i);
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                str.getClass();
                str2.getClass();
                f fVar = bVar.u;
                s9f[] s9fVarArr = b.w;
                ((TextView) fVar.g(s9fVarArr[0])).setText(str);
                ((TextView) bVar.v.g(s9fVarArr[1])).setText(str2);
                break;
            case 2:
                com.yandex.plus.pay.ui.core.debug.internal.ui.log.b bVar2 = (com.yandex.plus.pay.ui.core.debug.internal.ui.log.b) opnVar;
                View view = bVar2.a;
                Context context = view.getContext();
                context.getClass();
                r1.E(view, new jl2(5, (ClipboardManager) context.getSystemService(ClipboardManager.class), this, bVar2));
                Object u = u(i);
                u.getClass();
                com.yandex.plus.pay.log.api.a aVar = (com.yandex.plus.pay.log.api.a) u;
                TextView textView = (TextView) bVar2.u.g(com.yandex.plus.pay.ui.core.debug.internal.ui.log.b.v[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                com.yandex.plus.log.api.a aVar2 = aVar.b;
                Context context2 = view.getContext();
                context2.getClass();
                spannableStringBuilder.append((CharSequence) u.G(aVar2, context2));
                spannableStringBuilder.append((CharSequence) StringUtil.SPACE);
                spannableStringBuilder.append((CharSequence) aVar.d);
                Throwable th = aVar.e;
                if (th != null) {
                    spannableStringBuilder.append((CharSequence) StringUtil.LF);
                    spannableStringBuilder.append((CharSequence) fob.b(th));
                }
                textView.setText(new SpannedString(spannableStringBuilder));
                break;
            case 3:
                Object u2 = u(i);
                u2.getClass();
                f fVar2 = ((l) opnVar).u;
                s9f[] s9fVarArr2 = l.v;
                ((TextView) fVar2.g(s9fVarArr2[0])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
                ((TextView) fVar2.g(s9fVarArr2[0])).setText(((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b) u2).b);
                break;
            case 4:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.b bVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.b) opnVar;
                Object u3 = u(i);
                u3.getClass();
                CharSequence charSequence = (CharSequence) u3;
                TextView textView2 = (TextView) bVar3.u.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.b.v[0]);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(charSequence);
                View view2 = bVar3.a;
                view2.getClass();
                if (r1.q(view2)) {
                    spannableStringBuilder2.insert(charSequence.length(), (CharSequence) " •");
                } else {
                    spannableStringBuilder2.insert(0, (CharSequence) "• ");
                }
                textView2.setText(new SpannedString(spannableStringBuilder2));
                break;
            default:
                Object u4 = u(i);
                u4.getClass();
                ((TextView) ((e) opnVar).u.g(e.v[0])).setText(((c) u4).a);
                break;
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        switch (this.e) {
            case 0:
                return new a(viewGroup);
            case 1:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_debug_info, viewGroup, false);
                inflate.getClass();
                return new b(inflate);
            case 2:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_log_entry, viewGroup, false);
                inflate2.getClass();
                return new com.yandex.plus.pay.ui.core.debug.internal.ui.log.b(inflate2);
            case 3:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_checkout_legal, viewGroup, false);
                inflate3.getClass();
                return new l(inflate3);
            case 4:
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_product_benefit, viewGroup, false);
                inflate4.getClass();
                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.b(inflate4);
            default:
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_tarifficator_offer_benefit_content, viewGroup, false);
                inflate5.getClass();
                return new e(inflate5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8f(up6 up6Var, int i) {
        super(up6Var);
        this.e = i;
    }
}
