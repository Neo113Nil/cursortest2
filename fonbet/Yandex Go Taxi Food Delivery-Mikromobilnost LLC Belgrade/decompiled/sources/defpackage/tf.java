package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.yandex.go.payments.cards.ui.AddCardViewImpl;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.view.input.UnderKeyboardLinearLayout;
import com.yandex.messaging.internal.view.stickers.panel.a;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.messaging.internal.view.timeline.f;
import com.yandex.messaging.ui.chatlist.b;
import com.yandex.messaging.ui.pollinfo.PollInfoActivity;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.BudgetChargesUinInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsFragment;
import ru.rt.ebs.cryptosdk.presentation.error.accessDenied.AccessDeniedFragment;
import ru.rt.ebs.cryptosdk.presentation.info.biometry.BiometryInfoFragment;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes15.dex */
public final /* synthetic */ class tf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w7b w7bVar;
        nu10 h0;
        nu10 h02;
        String str;
        jcz0 jcz0Var;
        String str2;
        x4b0 x4b0Var;
        Long l;
        jcz0 jcz0Var2;
        nu10 h03;
        int i = this.a;
        int i2 = 0;
        r4 = null;
        bk51 bk51Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AccessDeniedFragment) obj).setReturnEvent();
                break;
            case 1:
                dl dlVar = ((fl) obj).c;
                bl blVar = dlVar.x;
                if (!dlVar.C) {
                    v vVar = dlVar.B;
                    String str3 = blVar.c;
                    y yVar = (y) blVar.b.b;
                    if (!vVar.k(str3)) {
                        ycq0 ycq0Var = dlVar.A;
                        kv90 kv90Var = lv90.Companion;
                        PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
                        String str4 = blVar.c;
                        kv90Var.getClass();
                        ycq0Var.b(kv90.b(str4, paymentMethod$Type));
                        yVar.d();
                        break;
                    } else {
                        yVar.d();
                        break;
                    }
                }
                break;
            case 2:
                q qVar = ((tm) obj).V;
                if (qVar != null) {
                    qVar.invoke(view);
                    break;
                }
                break;
            case 3:
                ez ezVar = (ez) obj;
                ChatRequest chatRequest = ezVar.O;
                if (chatRequest != null && (w7bVar = ezVar.P) != null) {
                    Button button = ezVar.R;
                    Directive[] directiveArr = button != null ? button.directives : null;
                    if (directiveArr != null) {
                        ezVar.N.k(chatRequest, w7bVar, directiveArr, null);
                        break;
                    }
                }
                break;
            case 4:
                AddCardViewImpl.onAttachedToWindow$lambda$0((AddCardViewImpl) obj, view);
                break;
            case 5:
                AddressInputView.setOnClickListener$lambda$0((AddressInputView) obj, view);
                break;
            case 6:
                ((AddressMapFragment) obj).saveButtonClicked();
                break;
            case 7:
                AnimatedListItemInputComponent.init$lambda$2((AnimatedListItemInputComponent) obj, view);
                break;
            case 8:
                AutoPullsFragment.getViewBinding$lambda$5$lambda$4((AutoPullsFragment) obj, view);
                break;
            case 9:
                AutoTopupPaymentMethodsFragment.renderBottomSheet$lambda$6$lambda$4((AutoTopupPaymentMethodsFragment) obj, view);
                break;
            case 10:
                ((AutoTopupSummaryView) obj).toggleDropdown();
                break;
            case 11:
                sls slsVar = ((rp4) obj).O;
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 12:
                view.setOnClickListener(null);
                view.setClickable(false);
                ((BaseAddressSearchView) obj).onSearchAgain();
                break;
            case 13:
                b bVar = (b) obj;
                p4b p4bVar = bVar.g0;
                sfl0.a(bVar.O, new q6b(e520.d, (p4bVar != null ? p4bVar : null).k, null, null, null, 2097148), 6);
                break;
            case 14:
                com.yandex.messaging.input.b bVar2 = (com.yandex.messaging.input.b) obj;
                tt31 tt31Var = bVar2.g;
                wjm wjmVar = bVar2.f;
                if (tt31Var == null) {
                    ((a) bVar2.q.get()).C = new yfa(bVar2);
                    z83.i();
                    sr4 sr4Var = new sr4(2, bVar2);
                    UnderKeyboardLinearLayout underKeyboardLinearLayout = (UnderKeyboardLinearLayout) ((ViewStub) wjmVar.c).inflate();
                    underKeyboardLinearLayout.setSharedPreferences((SharedPreferences) wjmVar.b);
                    underKeyboardLinearLayout.setOnBackClickListener(new xen(24, wjmVar));
                    underKeyboardLinearLayout.setVisibilityListener(sr4Var);
                    bVar2.g = new tt31(bVar2.a, (ViewPager) underKeyboardLinearLayout.findViewById(e9h0.emoji_sticker_switcher_pager), (TabLayout) underKeyboardLinearLayout.findViewById(e9h0.emoji_sticker_switcher_strip), bVar2.c);
                    bVar2.b();
                    if (((UnderKeyboardLinearLayout) wjmVar.w) == null) {
                        wjmVar.w = underKeyboardLinearLayout;
                    }
                }
                UnderKeyboardLinearLayout underKeyboardLinearLayout2 = (UnderKeyboardLinearLayout) wjmVar.w;
                if (underKeyboardLinearLayout2 != null && underKeyboardLinearLayout2.isShown()) {
                    KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = (KeyboardAwareEmojiEditText) wjmVar.x;
                    if (keyboardAwareEmojiEditText != null) {
                        keyboardAwareEmojiEditText.requestFocusAndOpenKeyboard();
                        break;
                    } else {
                        wjmVar.d();
                        break;
                    }
                } else {
                    UnderKeyboardLinearLayout underKeyboardLinearLayout3 = (UnderKeyboardLinearLayout) wjmVar.w;
                    if (underKeyboardLinearLayout3 != null) {
                        underKeyboardLinearLayout3.show();
                        break;
                    }
                }
                break;
            case 15:
                i15 i15Var = (i15) obj;
                if (i15Var.B2) {
                    y2r y2rVar = i15Var.b0;
                    if ((y2rVar != null ? y2rVar.a : null) != null) {
                        l1r l1rVar = i15Var.N2;
                        if (!l1rVar.P) {
                            boolean a = l1rVar.x.a(l1rVar.H);
                            y2r y2rVar2 = i15Var.b0;
                            if (!a) {
                                if (y2rVar2 != null && (h0 = i15Var.h0()) != null) {
                                    i15Var.e0().f.l(i15Var.g0, i15Var.u0, y2rVar2, h0, new f02(22, i15Var));
                                    break;
                                }
                            } else if (y2rVar2 != null && (h02 = i15Var.h0()) != null) {
                                i15Var.e0().f.g(i15Var.g0, i15Var.u0, y2rVar2, h02);
                                break;
                            }
                        } else if (y2rVar != null && (str = y2rVar.a) != null && str.length() > 0) {
                            k0b k0bVar = i15Var.e0().c;
                            k0bVar.getClass();
                            tje.e();
                            b00 b00Var = k0bVar.a;
                            ((Handler) b00Var.a.get()).post(new lz(i2, b00Var, k0bVar.b, str));
                            break;
                        }
                    } else {
                        LocalMessageRef localMessageRef = i15Var.g0;
                        if (localMessageRef != null && (jcz0Var = i15Var.e0().f) != null) {
                            jcz0Var.w(localMessageRef);
                            break;
                        }
                    }
                }
                break;
            case 16:
                c cVar = (c) obj;
                String str5 = cVar.c0;
                jwf jwfVar = cVar.B0;
                if (str5 != null && (str2 = cVar.d0) != null) {
                    h3y h3yVar = (h3y) jwfVar.P;
                    sfl0 sfl0Var = (sfl0) jwfVar.g;
                    if (((pm50) h3yVar.get()).c && (((lqo) jwfVar.i).a(tz10.V) || ((x4b0Var = cVar.P0) != null && jl40.l(x4b0Var.k, "neophonish")))) {
                        new gm50(c720.d, str2, p8b.a(str5));
                        sfl0Var.getClass();
                    }
                    MessageData messageData = cVar.V1;
                    if (messageData != null && messageData.detentionReason == 7) {
                        new xz31(c720.d, str2, p8b.a(str5));
                        sfl0Var.getClass();
                        break;
                    } else {
                        Integer valueOf = messageData != null ? Integer.valueOf(messageData.detentionReason) : null;
                        if (valueOf != null && valueOf.intValue() == 3) {
                            bk51Var = bk51.c;
                        } else if (valueOf != null && valueOf.intValue() == 4) {
                            bk51Var = bk51.b;
                        } else if (valueOf != null && valueOf.intValue() == 5) {
                            bk51Var = bk51.d;
                        } else if (valueOf != null && valueOf.intValue() == 6) {
                            bk51Var = bk51.e;
                        }
                        if (bk51Var != null) {
                            cVar.F0().p(bk51Var);
                            break;
                        }
                    }
                }
                break;
            case 17:
                ((Runnable) obj).run();
                break;
            case 18:
                com.yandex.messaging.internal.view.timeline.poll.a aVar = (com.yandex.messaging.internal.view.timeline.poll.a) obj;
                z83.d(aVar.c0, null);
                if (aVar.l0) {
                    z83.d(aVar.j0, null);
                    l = aVar.j0;
                } else {
                    z83.d(aVar.W, null);
                    l = aVar.W;
                }
                c720 c720Var = c720.d;
                String str6 = aVar.c0;
                if (str6 != null && l != null) {
                    wwd0 wwd0Var = new wwd0(c720Var, str6, l.longValue(), aVar.a0, aVar.Z);
                    b0x b0xVar = (b0x) ((sfl0) aVar.x2.g);
                    j420 j420Var = b0xVar.e;
                    if (!((Boolean) j420Var.d.getValue()).booleanValue()) {
                        z83.i();
                        Toast.makeText(j420Var.a, oyh0.error_default, 0).show();
                        break;
                    } else {
                        FragmentActivity activity = b0xVar.b.getActivity();
                        if (activity != null) {
                            Intent intent = new Intent(activity, (Class<?>) PollInfoActivity.class);
                            Bundle c = wwd0Var.c();
                            c.putString("message_chat_id", wwd0Var.b);
                            c.putLong("message_timestamp", wwd0Var.c);
                            String str7 = wwd0Var.d;
                            if (str7 != null) {
                                c.putString("original_message_chat_id", str7);
                            }
                            Long l2 = wwd0Var.e;
                            if (l2 != null) {
                                c.putLong("original_message_timestamp", l2.longValue());
                            }
                            intent.putExtras(c);
                            activity.startActivity(intent);
                            break;
                        }
                    }
                }
                break;
            case 19:
                ((d85) ((gl) obj).c).invoke();
                break;
            case 20:
                pa5 pa5Var = (pa5) obj;
                if (!pa5Var.o0()) {
                    if (pa5Var.e0().f != null && (jcz0Var2 = pa5Var.e0().f) != null) {
                        jcz0Var2.p(pa5Var.T2);
                        break;
                    }
                } else {
                    pa5Var.m0(null, null);
                    break;
                }
                break;
            case 21:
                ((e) obj).m0(null, null);
                break;
            case 22:
                f fVar = (f) obj;
                if (!fVar.o0()) {
                    y2r y2rVar3 = fVar.b0;
                    if (y2rVar3 != null && fVar.N3 && (h03 = fVar.h0()) != null) {
                        fVar.e0().f.g(fVar.g0, fVar.u0, y2rVar3, h03);
                        break;
                    }
                } else {
                    fVar.m0(null, null);
                    break;
                }
                break;
            case 23:
                dd5 dd5Var = (dd5) obj;
                vhi0 vhi0Var = dd5Var.H2;
                if (!vhi0Var.z || !vhi0Var.b) {
                    dd5Var.m0(null, null);
                    break;
                } else {
                    vhi0Var.b();
                    dd5Var.v0(new cd5(dd5Var.T2.i, vhi0Var.b));
                    break;
                }
            case 24:
                BiometryInfoFragment.initView$lambda$3$lambda$2((BiometryInfoFragment) obj, view);
                break;
            case 25:
                BubbleTextComponent._init_$lambda$0((BubbleTextComponent) obj, view);
                break;
            case 26:
                BudgetChargesSearchStatusFragment.getViewBinding$lambda$3$lambda$1((BudgetChargesSearchStatusFragment) obj, view);
                break;
            case 27:
                BudgetChargesUinInputFragment.getViewBinding$lambda$5$lambda$3((BudgetChargesUinInputFragment) obj, view);
                break;
            case 28:
                ((wx7) obj).d.invoke();
                break;
            default:
                mh8 mh8Var = (mh8) obj;
                cp7 cp7Var = mh8Var.b;
                if (cp7Var != null) {
                    ((lg) cp7Var).g(mh8Var.h);
                    break;
                }
                break;
        }
    }
}
