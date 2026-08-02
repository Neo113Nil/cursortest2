package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.k;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButtonGroup;
import com.google.android.material.textfield.i;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.legacy.widget.menu.a;
import com.yandex.go.user_profile.main_menu.profile.presentation.MainMenuUserProfileView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import com.yandex.messaging.internal.entities.ReplyData;
import com.yandex.messaging.internal.urlpreview.impl.c;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import com.ybsdk.feature.passes.widget.api.presentation.PassesWidgetErrorView;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;
import com.ybsdk.navigation.NavigationFragment;
import defpackage.rvo;
import defpackage.sls;
import defpackage.t3k;
import defpackage.v3k;
import defpackage.zy11;
import flex.logger.view.LoggerOverlayView;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.rt.ebs.cryptosdk.presentation.error.noInternetConnection.NoInternetConnectionFragment;
import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;
import ru.yandex.taxi.order.recenter.NextRecenterButtonView;

/* loaded from: classes15.dex */
public final /* synthetic */ class zgv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zgv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jcz0 jcz0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bhv bhvVar = (bhv) obj;
                jhv jhvVar = bhvVar.i;
                if (jhvVar != null) {
                    s14 s14Var = jhvVar.D;
                    if (((ViewGroup) s14Var.e).getVisibility() == 0 && ((ViewGroup) s14Var.c).getVisibility() == 0) {
                        jhv jhvVar2 = bhvVar.i;
                        if (jhvVar2 != null) {
                            s14 s14Var2 = jhvVar2.D;
                            ai91.c((ViewGroup) s14Var2.e, true);
                            ai91.c((ViewGroup) s14Var2.c, true);
                            break;
                        }
                    }
                }
                jhv jhvVar3 = bhvVar.i;
                if (jhvVar3 != null) {
                    s14 s14Var3 = jhvVar3.D;
                    ai91.f((ViewGroup) s14Var3.e, true);
                    ai91.f((ViewGroup) s14Var3.c, true);
                    break;
                }
                break;
            case 1:
                jhv jhvVar4 = (jhv) obj;
                boolean z = jhvVar4.B.a.a;
                FragmentActivity fragmentActivity = jhvVar4.a;
                if (z) {
                    fragmentActivity.finishAfterTransition();
                    break;
                } else {
                    fragmentActivity.finish();
                    break;
                }
            case 2:
                IntegrationInspectorActivity.a((IntegrationInspectorActivity) obj, view);
                break;
            case 3:
                h9x h9xVar = (h9x) obj;
                bo3 bo3Var = h9xVar.w;
                boolean z2 = h9xVar.z;
                jn3 jn3Var = bo3Var.a;
                ak3 ak3Var = new ak3(h9xVar, z2, r2);
                jn3Var.getClass();
                tje.e();
                AuthorizationObservable$AuthState authorizationObservable$AuthState = jn3Var.i;
                if (authorizationObservable$AuthState == null) {
                    authorizationObservable$AuthState = jn3Var.a();
                    jn3Var.i = authorizationObservable$AuthState;
                }
                jn3Var.b(authorizationObservable$AuthState, new g191(ak3Var));
                break;
            case 4:
                KycPhotoFragment.consumeSideEffect$lambda$21((KycPhotoFragment) obj, view);
                break;
            case 5:
                ((oew0) obj).invoke();
                break;
            case 6:
                LoggerOverlayView.lambda$6$lambda$5((LoggerOverlayView) obj, view);
                break;
            case 7:
                ((ilz) obj).N.invoke();
                break;
            case 8:
                MainMenuUserProfileView._init_$lambda$0((MainMenuUserProfileView) obj, view);
                break;
            case 9:
                ((MaterialButtonGroup) obj).lambda$initializeButtonOverflow$1(view);
                break;
            case 10:
                Me2MeDebitResultFragment.getViewBinding$lambda$3$lambda$1((Me2MeDebitResultFragment) obj, view);
                break;
            case 11:
                ((MerchantOffersFragment) obj).scrollUp();
                break;
            case 12:
                MerchantOffersSearchFragment.onViewCreated$lambda$9$lambda$6((j161) obj, view);
                break;
            case 13:
                ((Mesix) obj).onClick(view);
                break;
            case 14:
                zf0 zf0Var = (zf0) obj;
                if (!zf0Var.a) {
                    sls slsVar = (sls) zf0Var.g;
                    if (slsVar != null) {
                        slsVar.invoke();
                        break;
                    }
                } else {
                    String str = (String) zf0Var.e;
                    if (str != null && (jcz0Var = (jcz0) zf0Var.f) != null) {
                        jcz0Var.u(str);
                        break;
                    }
                }
                break;
            case 15:
                pv10 pv10Var = (pv10) obj;
                ReplyData replyData = pv10Var.K;
                if (replyData != null) {
                    pv10Var.w.invoke(Long.valueOf(replyData.getTimestamp()), replyData.getQuotedText());
                    break;
                }
                break;
            case 16:
                c cVar = (c) obj;
                jcz0 jcz0Var2 = cVar.A;
                ye0 ye0Var = (ye0) cVar.b;
                nh21 nh21Var = (nh21) ye0Var;
                jcz0Var2.o(nh21Var.a, nh21Var.z, new ServerMessageRef(nh21Var.y, nh21Var.c), cVar.D);
                cVar.C.a(ye0Var, UrlPreviewReporter$Element.OpenButton);
                break;
            case 17:
                ((ModalContentViewContainer) obj).hide();
                break;
            case 18:
                b450 b450Var = (b450) obj;
                b450Var.d(true);
                b450Var.c.a();
                break;
            case 19:
                ((NavigationFragment) obj).onBackPressed();
                break;
            case 20:
                NddRouteSelectorModalView.onAttachedToWindow$lambda$2((NddRouteSelectorModalView) obj, view);
                break;
            case 21:
                NextRecenterButtonView.onAttachedToWindow$lambda$0((NextRecenterButtonView) obj, view);
                break;
            case 22:
                NoInternetConnectionFragment.initView$lambda$0((NoInternetConnectionFragment) obj, view);
                break;
            case 23:
                ((uh60) obj).invoke();
                break;
            case 24:
                a aVar = (a) obj;
                k kVar = new k(view.getContext(), view, 83);
                uiz0 uiz0Var = aVar.f;
                if (uiz0Var != null) {
                    for (dil dilVar : uiz0Var.b) {
                        MenuBuilder menuBuilder = kVar.a;
                        menuBuilder.add(dilVar.a).setOnMenuItemClickListener(new qc2(uiz0Var, dilVar, menuBuilder.size()));
                    }
                }
                kVar.a();
                aVar.m = kVar;
                break;
            case 25:
                h090 h090Var = (h090) obj;
                h090Var.getClass();
                k kVar2 = new k(view.getContext(), view, 83);
                f5k f5kVar = h090Var.b;
                if (f5kVar != null) {
                    aw5 aw5Var = f5kVar.a;
                    final Div2View div2View = aw5Var.a;
                    final rvo rvoVar = aw5Var.b;
                    for (final t3k t3kVar : f5kVar.b) {
                        MenuBuilder menuBuilder2 = kVar2.a;
                        final int size = menuBuilder2.size();
                        MenuItem add = menuBuilder2.add((CharSequence) t3kVar.c.a(rvoVar));
                        final com.yandex.div.core.view2.divs.c cVar2 = f5kVar.c;
                        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.b
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                final t3k t3kVar2 = t3kVar;
                                final c cVar3 = cVar2;
                                final Div2View div2View2 = Div2View.this;
                                final rvo rvoVar2 = rvoVar;
                                final int i2 = size;
                                div2View2.bulkActions$div_release(new sls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        List list = t3k.this.b;
                                        List list2 = list;
                                        List<v3k> list3 = null;
                                        if (list2 == null || list2.isEmpty()) {
                                            list = null;
                                        }
                                        if (list == null) {
                                            v3k v3kVar = t3k.this.a;
                                            if (v3kVar != null) {
                                                list3 = Collections.singletonList(v3kVar);
                                            }
                                        } else {
                                            list3 = list;
                                        }
                                        List list4 = list3;
                                        if (list4 != null && !list4.isEmpty()) {
                                            com.yandex.div.core.c cVar4 = cVar3.a;
                                            Div2View div2View3 = div2View2;
                                            rvo rvoVar3 = rvoVar2;
                                            t3k t3kVar3 = t3k.this;
                                            cVar4.getClass();
                                            for (v3k v3kVar2 : list3) {
                                                if (((Boolean) v3kVar2.b.a(rvoVar3)).booleanValue()) {
                                                    cVar4.b.b(v3kVar2, rvoVar3);
                                                    com.yandex.div.core.c.b(cVar4, div2View3, rvoVar3, v3kVar2, "menu", null, 48);
                                                }
                                            }
                                            ref$BooleanRef.element = true;
                                        }
                                        return zy11.a;
                                    }
                                });
                                return ref$BooleanRef.element;
                            }
                        });
                    }
                }
                kVar2.a();
                h090Var.c = kVar2;
                break;
            case 26:
                bu0 bu0Var = (bu0) obj;
                ((View) bu0Var.d).setVisibility(8);
                ((ak80) bu0Var.b).invoke();
                break;
            case 27:
                PassesWidgetErrorView.lambda$1$lambda$0((PassesWidgetErrorView) obj, view);
                break;
            case 28:
                i iVar = (i) obj;
                EditText editText = iVar.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = iVar.f;
                    r2 = (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) ? 0 : 1;
                    EditText editText3 = iVar.f;
                    if (r2 != 0) {
                        editText3.setTransformationMethod(null);
                    } else {
                        editText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        iVar.f.setSelection(selectionEnd);
                    }
                    iVar.p();
                    break;
                }
                break;
            default:
                n8a0 n8a0Var = (n8a0) obj;
                ked0 ked0Var = n8a0Var.W;
                if (ked0Var != null) {
                    n8a0Var.P.invoke(ked0Var);
                    break;
                }
                break;
        }
    }
}
