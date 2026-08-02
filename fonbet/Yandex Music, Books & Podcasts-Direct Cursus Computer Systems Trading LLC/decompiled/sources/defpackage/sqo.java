package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.HeaderView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsqo;", "Ledu;", "Ltqo;", "Llqo;", "<init>", "()V", "pqo", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class sqo extends edu<tqo> implements lqo {
    public rro i;
    public sbp j;
    public ol2 k;
    public final ybf h = new ybf(ern.a(u8q.class), new qqo(this, 2), new qqo(this, 4), new qqo(this, 3));
    public final jyr l = btf.b(new qqo(this, 0));

    @Override // defpackage.lqo
    public final void k(sbp sbpVar) {
        this.j = sbpVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tqo tqoVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        layoutInflater.getClass();
        boolean R = n7w.R(q6c.d);
        int i6 = R.id.search_input_layout;
        int i7 = R.id.banks_list_recycler_view;
        int i8 = R.id.loadingTitle;
        if (R) {
            View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_sbp_full, viewGroup, false);
            View v = dag.v(R.id.chooseBankContainer, inflate);
            if (v != null) {
                ImageView imageView = (ImageView) dag.v(R.id.bank_choose_back_button, v);
                if (imageView != null) {
                    RecyclerView recyclerView = (RecyclerView) dag.v(R.id.banks_list_recycler_view, v);
                    if (recyclerView != null) {
                        i7 = R.id.button_container_layout;
                        if (((LinearLayout) dag.v(R.id.button_container_layout, v)) != null) {
                            if (((TextInputEditText) dag.v(R.id.field, v)) != null) {
                                TextView textView = (TextView) dag.v(R.id.infoCard, v);
                                if (textView != null) {
                                    TextView textView2 = (TextView) dag.v(R.id.pay_text, v);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) v;
                                        TextInputLayout textInputLayout = (TextInputLayout) dag.v(R.id.search_input_layout, v);
                                        if (textInputLayout != null) {
                                            i6 = R.id.title_bank_choose_text;
                                            if (((TextView) dag.v(R.id.title_bank_choose_text, v)) != null) {
                                                mmo mmoVar = new mmo(constraintLayout, imageView, recyclerView, textView, textView2, textInputLayout, 16);
                                                View v2 = dag.v(R.id.emptyLoadingContainer, inflate);
                                                if (v2 != null) {
                                                    if (((TextView) dag.v(R.id.loadingTitle, v2)) != null) {
                                                        if (((ProgressBar) dag.v(R.id.progressBar, v2)) != null) {
                                                            g8c g8cVar = new g8c((LinearLayout) v2);
                                                            View v3 = dag.v(R.id.errorContainer, inflate);
                                                            if (v3 != null) {
                                                                TextView textView3 = (TextView) dag.v(R.id.errorChooseBankButton, v3);
                                                                if (textView3 != null) {
                                                                    TextView textView4 = (TextView) dag.v(R.id.errorDescription, v3);
                                                                    if (textView4 != null) {
                                                                        ImageView imageView2 = (ImageView) dag.v(R.id.errorImageView, v3);
                                                                        if (imageView2 != null) {
                                                                            TextView textView5 = (TextView) dag.v(R.id.errorRetryOpenBankButton, v3);
                                                                            if (textView5 != null) {
                                                                                TextView textView6 = (TextView) dag.v(R.id.errorTitle, v3);
                                                                                if (textView6 != null) {
                                                                                    mmo mmoVar2 = new mmo((ConstraintLayout) v3, textView3, textView4, imageView2, textView5, textView6, 17);
                                                                                    HeaderView headerView = (HeaderView) dag.v(R.id.header_view, inflate);
                                                                                    if (headerView != null) {
                                                                                        View v4 = dag.v(R.id.loadingContainer, inflate);
                                                                                        if (v4 != null) {
                                                                                            TextView textView7 = (TextView) dag.v(R.id.chooseBankButton, v4);
                                                                                            if (textView7 != null) {
                                                                                                TextView textView8 = (TextView) dag.v(R.id.infoCard, v4);
                                                                                                if (textView8 != null) {
                                                                                                    TextView textView9 = (TextView) dag.v(R.id.loadingTitle, v4);
                                                                                                    if (textView9 != null) {
                                                                                                        TextView textView10 = (TextView) dag.v(R.id.openPaymentButton, v4);
                                                                                                        if (textView10 != null) {
                                                                                                            ProgressBar progressBar = (ProgressBar) dag.v(R.id.progressBar, v4);
                                                                                                            if (progressBar != null) {
                                                                                                                mmo mmoVar3 = new mmo((ConstraintLayout) v4, textView7, textView8, textView9, textView10, progressBar, 18);
                                                                                                                LinearLayout linearLayout = (LinearLayout) inflate;
                                                                                                                if (((LinearLayout) dag.v(R.id.stateContainer, inflate)) != null) {
                                                                                                                    tqoVar = new tqo(new rdk(linearLayout, mmoVar, g8cVar, mmoVar2, headerView, mmoVar3, 16));
                                                                                                                } else {
                                                                                                                    i3 = R.id.stateContainer;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i5 = R.id.progressBar;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i5 = R.id.openPaymentButton;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i5 = R.id.loadingTitle;
                                                                                                    }
                                                                                                } else {
                                                                                                    i5 = R.id.infoCard;
                                                                                                }
                                                                                            } else {
                                                                                                i5 = R.id.chooseBankButton;
                                                                                            }
                                                                                            jj4.j("Missing required view with ID: ".concat(v4.getResources().getResourceName(i5)));
                                                                                            return null;
                                                                                        }
                                                                                        i3 = R.id.loadingContainer;
                                                                                    } else {
                                                                                        i3 = R.id.header_view;
                                                                                    }
                                                                                } else {
                                                                                    i4 = R.id.errorTitle;
                                                                                }
                                                                            } else {
                                                                                i4 = R.id.errorRetryOpenBankButton;
                                                                            }
                                                                        } else {
                                                                            i4 = R.id.errorImageView;
                                                                        }
                                                                    } else {
                                                                        i4 = R.id.errorDescription;
                                                                    }
                                                                } else {
                                                                    i4 = R.id.errorChooseBankButton;
                                                                }
                                                                jj4.j("Missing required view with ID: ".concat(v3.getResources().getResourceName(i4)));
                                                                return null;
                                                            }
                                                            i3 = R.id.errorContainer;
                                                        } else {
                                                            i8 = R.id.progressBar;
                                                        }
                                                    }
                                                    jj4.j("Missing required view with ID: ".concat(v2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                                i3 = R.id.emptyLoadingContainer;
                                            }
                                        }
                                    } else {
                                        i6 = R.id.pay_text;
                                    }
                                } else {
                                    i6 = R.id.infoCard;
                                }
                            } else {
                                i6 = R.id.field;
                            }
                        }
                    }
                    i6 = i7;
                } else {
                    i6 = R.id.bank_choose_back_button;
                }
                jj4.j("Missing required view with ID: ".concat(v.getResources().getResourceName(i6)));
                return null;
            }
            i3 = R.id.chooseBankContainer;
            jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.paymentsdk_fragment_sbp, viewGroup, false);
        int i9 = R.id.brand_icon;
        if (((ImageView) dag.v(R.id.brand_icon, inflate2)) != null) {
            View v5 = dag.v(R.id.chooseBankContainer, inflate2);
            if (v5 != null) {
                RecyclerView recyclerView2 = (RecyclerView) dag.v(R.id.banks_list_recycler_view, v5);
                if (recyclerView2 == null) {
                    i6 = R.id.banks_list_recycler_view;
                } else if (((TextInputEditText) dag.v(R.id.field, v5)) != null) {
                    TextView textView11 = (TextView) dag.v(R.id.infoCard, v5);
                    if (textView11 != null) {
                        TextView textView12 = (TextView) dag.v(R.id.pay_text, v5);
                        if (textView12 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) v5;
                            TextInputLayout textInputLayout2 = (TextInputLayout) dag.v(R.id.search_input_layout, v5);
                            if (textInputLayout2 != null) {
                                dn9 dn9Var = new dn9(linearLayout2, recyclerView2, textView11, textView12, textInputLayout2, 23);
                                i9 = R.id.close_button;
                                ImageView imageView3 = (ImageView) dag.v(R.id.close_button, inflate2);
                                if (imageView3 != null) {
                                    View v6 = dag.v(R.id.emptyLoadingContainer, inflate2);
                                    if (v6 != null) {
                                        if (((TextView) dag.v(R.id.loadingTitle, v6)) != null) {
                                            if (((ProgressBar) dag.v(R.id.progressBar, v6)) != null) {
                                                pv9 pv9Var = new pv9(29, (LinearLayout) v6);
                                                View v7 = dag.v(R.id.errorContainer, inflate2);
                                                if (v7 != null) {
                                                    int i10 = R.id.errorButtonsContainer;
                                                    if (((LinearLayout) dag.v(R.id.errorButtonsContainer, v7)) != null) {
                                                        int i11 = R.id.errorChooseBankButton;
                                                        TextView textView13 = (TextView) dag.v(R.id.errorChooseBankButton, v7);
                                                        if (textView13 != null) {
                                                            i10 = R.id.errorCloseButton;
                                                            if (((TextView) dag.v(R.id.errorCloseButton, v7)) != null) {
                                                                i11 = R.id.errorDescription;
                                                                TextView textView14 = (TextView) dag.v(R.id.errorDescription, v7);
                                                                if (textView14 != null) {
                                                                    i10 = R.id.errorImageView;
                                                                    ImageView imageView4 = (ImageView) dag.v(R.id.errorImageView, v7);
                                                                    if (imageView4 != null) {
                                                                        i11 = R.id.errorRetryOpenBankButton;
                                                                        TextView textView15 = (TextView) dag.v(R.id.errorRetryOpenBankButton, v7);
                                                                        if (textView15 != null) {
                                                                            i10 = R.id.errorTitle;
                                                                            TextView textView16 = (TextView) dag.v(R.id.errorTitle, v7);
                                                                            if (textView16 != null) {
                                                                                i10 = R.id.exitButtonContainer;
                                                                                if (((LinearLayout) dag.v(R.id.exitButtonContainer, v7)) != null) {
                                                                                    rdk rdkVar = new rdk((LinearLayout) v7, textView13, textView14, imageView4, textView15, textView16, 17);
                                                                                    i9 = R.id.headerLayout;
                                                                                    if (((ConstraintLayout) dag.v(R.id.headerLayout, inflate2)) != null) {
                                                                                        i = R.id.loadingContainer;
                                                                                        View v8 = dag.v(R.id.loadingContainer, inflate2);
                                                                                        if (v8 != null) {
                                                                                            int i12 = R.id.chooseBankButton;
                                                                                            TextView textView17 = (TextView) dag.v(R.id.chooseBankButton, v8);
                                                                                            if (textView17 != null) {
                                                                                                TextView textView18 = (TextView) dag.v(R.id.infoCard, v8);
                                                                                                if (textView18 != null) {
                                                                                                    TextView textView19 = (TextView) dag.v(R.id.loadingTitle, v8);
                                                                                                    if (textView19 != null) {
                                                                                                        TextView textView20 = (TextView) dag.v(R.id.openPaymentButton, v8);
                                                                                                        if (textView20 != null) {
                                                                                                            ProgressBar progressBar2 = (ProgressBar) dag.v(R.id.progressBar, v8);
                                                                                                            if (progressBar2 != null) {
                                                                                                                rdk rdkVar2 = new rdk((LinearLayout) v8, textView17, textView18, textView19, textView20, progressBar2, 18);
                                                                                                                LinearLayout linearLayout3 = (LinearLayout) inflate2;
                                                                                                                i9 = R.id.stateContainer;
                                                                                                                if (((LinearLayout) dag.v(R.id.stateContainer, inflate2)) != null) {
                                                                                                                    tqoVar = new tqo(new mmo(linearLayout3, dn9Var, imageView3, pv9Var, rdkVar, rdkVar2, 15));
                                                                                                                }
                                                                                                            } else {
                                                                                                                i12 = R.id.progressBar;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i12 = R.id.openPaymentButton;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i12 = R.id.loadingTitle;
                                                                                                    }
                                                                                                } else {
                                                                                                    i12 = R.id.infoCard;
                                                                                                }
                                                                                            }
                                                                                            jj4.j("Missing required view with ID: ".concat(v8.getResources().getResourceName(i12)));
                                                                                            return null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i2 = i11;
                                                        jj4.j("Missing required view with ID: ".concat(v7.getResources().getResourceName(i2)));
                                                        return null;
                                                    }
                                                    i2 = i10;
                                                    jj4.j("Missing required view with ID: ".concat(v7.getResources().getResourceName(i2)));
                                                    return null;
                                                }
                                                i = R.id.errorContainer;
                                            } else {
                                                i8 = R.id.progressBar;
                                            }
                                        }
                                        jj4.j("Missing required view with ID: ".concat(v6.getResources().getResourceName(i8)));
                                        return null;
                                    }
                                    i = R.id.emptyLoadingContainer;
                                }
                            }
                        } else {
                            i6 = R.id.pay_text;
                        }
                    } else {
                        i6 = R.id.infoCard;
                    }
                } else {
                    i6 = R.id.field;
                }
                jj4.j("Missing required view with ID: ".concat(v5.getResources().getResourceName(i6)));
                return null;
            }
            i = R.id.chooseBankContainer;
            jj4.j("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
            return null;
        }
        i = i9;
        jj4.j("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
        return null;
        this.g = tqoVar;
        View root = tqoVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        HeaderView headerView;
        ImageView imageView;
        boolean A;
        view.getClass();
        super.onViewCreated(view, bundle);
        sbp sbpVar = this.j;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (sbpVar.j) {
            return;
        }
        String string = requireArguments().getString("ARG_EMAIL");
        Parcelable parcelable = requireArguments().getParcelable("ARG_BIND_SBP_TOKEN");
        if (parcelable == null) {
            xq0.q("Required value was null.");
            return;
        }
        aro aroVar = (aro) parcelable;
        String string2 = requireArguments().getString("ARG_SELECTED_BANK_SCHEME");
        sbp sbpVar2 = this.j;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar2.b.f();
        sbp sbpVar3 = this.j;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        jek a = sbpVar3.c.a();
        SharedPreferences C = v5g.C(requireContext());
        C.getClass();
        pqo pqoVar = new pqo(f, a, string, aroVar, C, string2, y());
        jfu viewModelStore = getViewModelStore();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, pqoVar, defaultViewModelCreationExtras);
        lm4 a2 = ern.a(rro.class);
        String f2 = a2.f();
        if (f2 == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        rro rroVar = (rro) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2));
        this.i = rroVar;
        g0c g0cVar = rroVar.q;
        String str = rroVar.w;
        if (str == null) {
            str = "";
        }
        String concat = "Отображение кнопки Закрыть на экране ожидания ответа от банка ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("selected_bank", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        final int i = 1;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "sbp_waiting_payment-close_button-shown", "sbp_waiting_payment-close_button-shown", vtmVar);
        x60 x60Var = (x60) g0cVar;
        x60Var.getClass();
        x60Var.a(j);
        sbp sbpVar4 = this.j;
        if (sbpVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        final int i2 = 0;
        sbpVar4.H(false);
        tqo tqoVar = (tqo) x();
        switch (tqoVar.a) {
            case 0:
                headerView = (HeaderView) tqoVar.c;
                break;
            default:
                headerView = null;
                break;
        }
        if (headerView != null) {
            headerView.v(new qqo(this, i), true);
        }
        tqo tqoVar2 = (tqo) x();
        switch (tqoVar2.a) {
            case 0:
                imageView = null;
                break;
            default:
                imageView = (ImageView) tqoVar2.g;
                break;
        }
        final int i3 = 2;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: oqo
                public final /* synthetic */ sqo b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            rro rroVar2 = this.b.i;
                            if (rroVar2 != null) {
                                rroVar2.L();
                                return;
                            } else {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                        case 1:
                            rro rroVar3 = this.b.i;
                            if (rroVar3 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            rroVar3.K(new mro());
                            ((fjs) rroVar3.u.getValue()).c(3L, new qro(rroVar3, 1));
                            iro iroVar = rroVar3.x;
                            if (iroVar != null) {
                                rroVar3.s.m(iroVar);
                                return;
                            }
                            return;
                        case 2:
                            ((u8q) this.b.h.getValue()).K();
                            return;
                        case 3:
                            rro rroVar4 = this.b.i;
                            if (rroVar4 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            rroVar4.K(new mro());
                            ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                            iro iroVar2 = rroVar4.x;
                            if (iroVar2 != null) {
                                rroVar4.s.m(iroVar2);
                                return;
                            }
                            return;
                        case 4:
                            rro rroVar5 = this.b.i;
                            if (rroVar5 != null) {
                                rroVar5.L();
                                return;
                            } else {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                        case 5:
                            this.b.requireActivity().onBackPressed();
                            return;
                        default:
                            sqo sqoVar = this.b;
                            rro rroVar6 = sqoVar.i;
                            Integer num = null;
                            if (rroVar6 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            ol2 ol2Var = sqoVar.k;
                            if (ol2Var == null) {
                                Intrinsics.j("banksAdapter");
                                throw null;
                            }
                            if (!ol2Var.g.isEmpty()) {
                                Iterator it = ol2Var.f.iterator();
                                int i4 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i4 = -1;
                                    } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var.g.get(ol2Var.h)).b)) {
                                        i4++;
                                    }
                                }
                                num = Integer.valueOf(i4);
                            }
                            rroVar6.H(qdq.D(num));
                            return;
                    }
                }
            });
        }
        if (headerView != null) {
            headerView.setTitleText(null);
        }
        View view2 = getView();
        if (view2 != null && headerView != null) {
            t l = l();
            ddu dduVar = l instanceof ddu ? (ddu) l : null;
            if (qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null)) {
                A = false;
            } else {
                Resources.Theme theme = view2.getContext().getTheme();
                theme.getClass();
                A = ocg.A(theme, R.attr.paymentsdk_selectShowBrandIcon, true);
            }
            headerView.setBrandIconVisible(A);
        }
        kqo a3 = ((tqo) x()).a();
        ImageView G = a3.G();
        if (G != null) {
            G.setVisibility(getParentFragmentManager().H() > 1 ? 0 : 8);
        }
        ImageView G2 = a3.G();
        if (G2 != null) {
            final int i4 = 5;
            G2.setOnClickListener(new View.OnClickListener(this) { // from class: oqo
                public final /* synthetic */ sqo b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i4) {
                        case 0:
                            rro rroVar2 = this.b.i;
                            if (rroVar2 != null) {
                                rroVar2.L();
                                return;
                            } else {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                        case 1:
                            rro rroVar3 = this.b.i;
                            if (rroVar3 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            rroVar3.K(new mro());
                            ((fjs) rroVar3.u.getValue()).c(3L, new qro(rroVar3, 1));
                            iro iroVar = rroVar3.x;
                            if (iroVar != null) {
                                rroVar3.s.m(iroVar);
                                return;
                            }
                            return;
                        case 2:
                            ((u8q) this.b.h.getValue()).K();
                            return;
                        case 3:
                            rro rroVar4 = this.b.i;
                            if (rroVar4 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            rroVar4.K(new mro());
                            ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                            iro iroVar2 = rroVar4.x;
                            if (iroVar2 != null) {
                                rroVar4.s.m(iroVar2);
                                return;
                            }
                            return;
                        case 4:
                            rro rroVar5 = this.b.i;
                            if (rroVar5 != null) {
                                rroVar5.L();
                                return;
                            } else {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                        case 5:
                            this.b.requireActivity().onBackPressed();
                            return;
                        default:
                            sqo sqoVar = this.b;
                            rro rroVar6 = sqoVar.i;
                            Integer num = null;
                            if (rroVar6 == null) {
                                Intrinsics.j("viewModel");
                                throw null;
                            }
                            ol2 ol2Var = sqoVar.k;
                            if (ol2Var == null) {
                                Intrinsics.j("banksAdapter");
                                throw null;
                            }
                            if (!ol2Var.g.isEmpty()) {
                                Iterator it = ol2Var.f.iterator();
                                int i42 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i42 = -1;
                                    } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var.g.get(ol2Var.h)).b)) {
                                        i42++;
                                    }
                                }
                                num = Integer.valueOf(i42);
                            }
                            rroVar6.H(qdq.D(num));
                            return;
                    }
                }
            });
        }
        ol2 ol2Var = new ol2(y());
        ol2Var.s(true);
        rro rroVar2 = this.i;
        if (rroVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        ol2Var.j = new r9n(0, rroVar2, rro.class, "onShowFullListClick", "onShowFullListClick()V", 0, 10);
        rro rroVar3 = this.i;
        if (rroVar3 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        ol2Var.k = new w4i(2, rroVar3, rro.class, "onBankClick", "onBankClick(Ljava/lang/String;I)V", 0, 19);
        this.k = ol2Var;
        RecyclerView x0 = a3.x0();
        x0.setLayoutManager(new LinearLayoutManager(x0.getContext()));
        x0.setHasFixedSize(true);
        ol2 ol2Var2 = this.k;
        if (ol2Var2 == null) {
            Intrinsics.j("banksAdapter");
            throw null;
        }
        x0.setAdapter(ol2Var2);
        EditText editText = a3.t0().getEditText();
        final int i5 = 3;
        if (editText != null) {
            editText.addTextChangedListener(new ex3(i5, this, editText));
            editText.setOnFocusChangeListener(new cx3(12, this));
        }
        final int i6 = 6;
        a3.L().setOnClickListener(new View.OnClickListener(this) { // from class: oqo
            public final /* synthetic */ sqo b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i6) {
                    case 0:
                        rro rroVar22 = this.b.i;
                        if (rroVar22 != null) {
                            rroVar22.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        rro rroVar32 = this.b.i;
                        if (rroVar32 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar32.K(new mro());
                        ((fjs) rroVar32.u.getValue()).c(3L, new qro(rroVar32, 1));
                        iro iroVar = rroVar32.x;
                        if (iroVar != null) {
                            rroVar32.s.m(iroVar);
                            return;
                        }
                        return;
                    case 2:
                        ((u8q) this.b.h.getValue()).K();
                        return;
                    case 3:
                        rro rroVar4 = this.b.i;
                        if (rroVar4 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar4.K(new mro());
                        ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                        iro iroVar2 = rroVar4.x;
                        if (iroVar2 != null) {
                            rroVar4.s.m(iroVar2);
                            return;
                        }
                        return;
                    case 4:
                        rro rroVar5 = this.b.i;
                        if (rroVar5 != null) {
                            rroVar5.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 5:
                        this.b.requireActivity().onBackPressed();
                        return;
                    default:
                        sqo sqoVar = this.b;
                        rro rroVar6 = sqoVar.i;
                        Integer num = null;
                        if (rroVar6 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        ol2 ol2Var3 = sqoVar.k;
                        if (ol2Var3 == null) {
                            Intrinsics.j("banksAdapter");
                            throw null;
                        }
                        if (!ol2Var3.g.isEmpty()) {
                            Iterator it = ol2Var3.f.iterator();
                            int i42 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i42 = -1;
                                } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var3.g.get(ol2Var3.h)).b)) {
                                    i42++;
                                }
                            }
                            num = Integer.valueOf(i42);
                        }
                        rroVar6.H(qdq.D(num));
                        return;
                }
            }
        });
        wqo c = ((tqo) x()).c();
        qgg.l0(c.r0(), new rqo(this, i2));
        c.F().setOnClickListener(new View.OnClickListener(this) { // from class: oqo
            public final /* synthetic */ sqo b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i2) {
                    case 0:
                        rro rroVar22 = this.b.i;
                        if (rroVar22 != null) {
                            rroVar22.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        rro rroVar32 = this.b.i;
                        if (rroVar32 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar32.K(new mro());
                        ((fjs) rroVar32.u.getValue()).c(3L, new qro(rroVar32, 1));
                        iro iroVar = rroVar32.x;
                        if (iroVar != null) {
                            rroVar32.s.m(iroVar);
                            return;
                        }
                        return;
                    case 2:
                        ((u8q) this.b.h.getValue()).K();
                        return;
                    case 3:
                        rro rroVar4 = this.b.i;
                        if (rroVar4 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar4.K(new mro());
                        ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                        iro iroVar2 = rroVar4.x;
                        if (iroVar2 != null) {
                            rroVar4.s.m(iroVar2);
                            return;
                        }
                        return;
                    case 4:
                        rro rroVar5 = this.b.i;
                        if (rroVar5 != null) {
                            rroVar5.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 5:
                        this.b.requireActivity().onBackPressed();
                        return;
                    default:
                        sqo sqoVar = this.b;
                        rro rroVar6 = sqoVar.i;
                        Integer num = null;
                        if (rroVar6 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        ol2 ol2Var3 = sqoVar.k;
                        if (ol2Var3 == null) {
                            Intrinsics.j("banksAdapter");
                            throw null;
                        }
                        if (!ol2Var3.g.isEmpty()) {
                            Iterator it = ol2Var3.f.iterator();
                            int i42 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i42 = -1;
                                } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var3.g.get(ol2Var3.h)).b)) {
                                    i42++;
                                }
                            }
                            num = Integer.valueOf(i42);
                        }
                        rroVar6.H(qdq.D(num));
                        return;
                }
            }
        });
        c.o0().setOnClickListener(new View.OnClickListener(this) { // from class: oqo
            public final /* synthetic */ sqo b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i) {
                    case 0:
                        rro rroVar22 = this.b.i;
                        if (rroVar22 != null) {
                            rroVar22.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        rro rroVar32 = this.b.i;
                        if (rroVar32 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar32.K(new mro());
                        ((fjs) rroVar32.u.getValue()).c(3L, new qro(rroVar32, 1));
                        iro iroVar = rroVar32.x;
                        if (iroVar != null) {
                            rroVar32.s.m(iroVar);
                            return;
                        }
                        return;
                    case 2:
                        ((u8q) this.b.h.getValue()).K();
                        return;
                    case 3:
                        rro rroVar4 = this.b.i;
                        if (rroVar4 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar4.K(new mro());
                        ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                        iro iroVar2 = rroVar4.x;
                        if (iroVar2 != null) {
                            rroVar4.s.m(iroVar2);
                            return;
                        }
                        return;
                    case 4:
                        rro rroVar5 = this.b.i;
                        if (rroVar5 != null) {
                            rroVar5.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 5:
                        this.b.requireActivity().onBackPressed();
                        return;
                    default:
                        sqo sqoVar = this.b;
                        rro rroVar6 = sqoVar.i;
                        Integer num = null;
                        if (rroVar6 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        ol2 ol2Var3 = sqoVar.k;
                        if (ol2Var3 == null) {
                            Intrinsics.j("banksAdapter");
                            throw null;
                        }
                        if (!ol2Var3.g.isEmpty()) {
                            Iterator it = ol2Var3.f.iterator();
                            int i42 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i42 = -1;
                                } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var3.g.get(ol2Var3.h)).b)) {
                                    i42++;
                                }
                            }
                            num = Integer.valueOf(i42);
                        }
                        rroVar6.H(qdq.D(num));
                        return;
                }
            }
        });
        nqo b = ((tqo) x()).b();
        b.B().setOnClickListener(new View.OnClickListener(this) { // from class: oqo
            public final /* synthetic */ sqo b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i5) {
                    case 0:
                        rro rroVar22 = this.b.i;
                        if (rroVar22 != null) {
                            rroVar22.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        rro rroVar32 = this.b.i;
                        if (rroVar32 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar32.K(new mro());
                        ((fjs) rroVar32.u.getValue()).c(3L, new qro(rroVar32, 1));
                        iro iroVar = rroVar32.x;
                        if (iroVar != null) {
                            rroVar32.s.m(iroVar);
                            return;
                        }
                        return;
                    case 2:
                        ((u8q) this.b.h.getValue()).K();
                        return;
                    case 3:
                        rro rroVar4 = this.b.i;
                        if (rroVar4 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar4.K(new mro());
                        ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                        iro iroVar2 = rroVar4.x;
                        if (iroVar2 != null) {
                            rroVar4.s.m(iroVar2);
                            return;
                        }
                        return;
                    case 4:
                        rro rroVar5 = this.b.i;
                        if (rroVar5 != null) {
                            rroVar5.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 5:
                        this.b.requireActivity().onBackPressed();
                        return;
                    default:
                        sqo sqoVar = this.b;
                        rro rroVar6 = sqoVar.i;
                        Integer num = null;
                        if (rroVar6 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        ol2 ol2Var3 = sqoVar.k;
                        if (ol2Var3 == null) {
                            Intrinsics.j("banksAdapter");
                            throw null;
                        }
                        if (!ol2Var3.g.isEmpty()) {
                            Iterator it = ol2Var3.f.iterator();
                            int i42 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i42 = -1;
                                } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var3.g.get(ol2Var3.h)).b)) {
                                    i42++;
                                }
                            }
                            num = Integer.valueOf(i42);
                        }
                        rroVar6.H(qdq.D(num));
                        return;
                }
            }
        });
        final int i7 = 4;
        b.Z().setOnClickListener(new View.OnClickListener(this) { // from class: oqo
            public final /* synthetic */ sqo b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [arf, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i7) {
                    case 0:
                        rro rroVar22 = this.b.i;
                        if (rroVar22 != null) {
                            rroVar22.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 1:
                        rro rroVar32 = this.b.i;
                        if (rroVar32 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar32.K(new mro());
                        ((fjs) rroVar32.u.getValue()).c(3L, new qro(rroVar32, 1));
                        iro iroVar = rroVar32.x;
                        if (iroVar != null) {
                            rroVar32.s.m(iroVar);
                            return;
                        }
                        return;
                    case 2:
                        ((u8q) this.b.h.getValue()).K();
                        return;
                    case 3:
                        rro rroVar4 = this.b.i;
                        if (rroVar4 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        rroVar4.K(new mro());
                        ((fjs) rroVar4.u.getValue()).c(3L, new qro(rroVar4, 1));
                        iro iroVar2 = rroVar4.x;
                        if (iroVar2 != null) {
                            rroVar4.s.m(iroVar2);
                            return;
                        }
                        return;
                    case 4:
                        rro rroVar5 = this.b.i;
                        if (rroVar5 != null) {
                            rroVar5.L();
                            return;
                        } else {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                    case 5:
                        this.b.requireActivity().onBackPressed();
                        return;
                    default:
                        sqo sqoVar = this.b;
                        rro rroVar6 = sqoVar.i;
                        Integer num = null;
                        if (rroVar6 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        ol2 ol2Var3 = sqoVar.k;
                        if (ol2Var3 == null) {
                            Intrinsics.j("banksAdapter");
                            throw null;
                        }
                        if (!ol2Var3.g.isEmpty()) {
                            Iterator it = ol2Var3.f.iterator();
                            int i42 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i42 = -1;
                                } else if (!((hl2) it.next()).b.equals(((hl2) ol2Var3.g.get(ol2Var3.h)).b)) {
                                    i42++;
                                }
                            }
                            num = Integer.valueOf(i42);
                        }
                        rroVar6.H(qdq.D(num));
                        return;
                }
            }
        });
        rro rroVar4 = this.i;
        if (rroVar4 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        rroVar4.r.f(getViewLifecycleOwner(), new uy6(9, new rqo(this, i)));
        rro rroVar5 = this.i;
        if (rroVar5 != null) {
            rroVar5.s.f(getViewLifecycleOwner(), new uy6(9, new rqo(this, i3)));
        } else {
            Intrinsics.j("viewModel");
            throw null;
        }
    }

    public final g0c y() {
        return (g0c) this.l.getValue();
    }
}
