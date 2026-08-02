package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.pay.ui.core.mobile.view.accordion.PlusPayAccordionView;
import com.yandex.plus.pay.ui.core.mobile.view.error.buttons.PlusPayErrorButtonsView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.pulse.metrics.o;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(FrameLayout frameLayout, int i) {
        this.a = i;
        this.b = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = view.findViewById(R.id.error_scroller);
                    if (findViewById != null) {
                        return (NestedScrollView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = view.findViewById(R.id.error_title);
                    if (findViewById2 != null) {
                        return (TextView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            case 2:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = view.findViewById(R.id.error_subtitle);
                    if (findViewById3 != null) {
                        return (TextView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            case 3:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = view.findViewById(R.id.error_accordion);
                    if (findViewById4 != null) {
                        return (PlusPayAccordionView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.accordion.PlusPayAccordionView");
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
            case 4:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById5 = view.findViewById(R.id.error_buttons);
                    if (findViewById5 != null) {
                        return (PlusPayErrorButtonsView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.error.buttons.PlusPayErrorButtonsView");
                } catch (ClassCastException e5) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar5, e5);
                    return null;
                }
            case 5:
                s9f s9fVar6 = (s9f) obj;
                s9fVar6.getClass();
                try {
                    View findViewById6 = view.findViewById(R.id.error_support_text);
                    if (findViewById6 != null) {
                        return (TextView) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e6) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar6, e6);
                    return null;
                }
            case 6:
                s9f s9fVar7 = (s9f) obj;
                s9fVar7.getClass();
                try {
                    View findViewById7 = view.findViewById(R.id.payment_loading_root);
                    if (findViewById7 != null) {
                        return (ViewGroup) findViewById7;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e7) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar7, e7);
                    return null;
                }
            case 7:
                s9f s9fVar8 = (s9f) obj;
                s9fVar8.getClass();
                try {
                    View findViewById8 = view.findViewById(R.id.payment_loading_progress_view);
                    if (findViewById8 != null) {
                        return findViewById8;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e8) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar8, e8);
                    return null;
                }
            case 8:
                s9f s9fVar9 = (s9f) obj;
                s9fVar9.getClass();
                try {
                    View findViewById9 = view.findViewById(R.id.payment_loading_title_text);
                    if (findViewById9 != null) {
                        return (TextView) findViewById9;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e9) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar9, e9);
                    return null;
                }
            case 9:
                s9f s9fVar10 = (s9f) obj;
                s9fVar10.getClass();
                try {
                    View findViewById10 = view.findViewById(R.id.payment_loading_subtitle_text);
                    if (findViewById10 != null) {
                        return (TextView) findViewById10;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e10) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar10, e10);
                    return null;
                }
            case 10:
                s9f s9fVar11 = (s9f) obj;
                s9fVar11.getClass();
                try {
                    View findViewById11 = view.findViewById(R.id.payment_loading_first_payment_text);
                    if (findViewById11 != null) {
                        return (TextView) findViewById11;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e11) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar11, e11);
                    return null;
                }
            case 11:
                s9f s9fVar12 = (s9f) obj;
                s9fVar12.getClass();
                try {
                    View findViewById12 = view.findViewById(R.id.payment_loading_next_payment_text);
                    if (findViewById12 != null) {
                        return (TextView) findViewById12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e12) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar12, e12);
                    return null;
                }
            case 12:
                s9f s9fVar13 = (s9f) obj;
                s9fVar13.getClass();
                try {
                    View findViewById13 = view.findViewById(R.id.payment_loading_footer_text);
                    if (findViewById13 != null) {
                        return (TextView) findViewById13;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e13) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar13, e13);
                    return null;
                }
            case 13:
                s9f s9fVar14 = (s9f) obj;
                s9fVar14.getClass();
                try {
                    View findViewById14 = view.findViewById(R.id.presale_root);
                    if (findViewById14 != null) {
                        return (ViewGroup) findViewById14;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e14) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar14, e14);
                    return null;
                }
            case 14:
                s9f s9fVar15 = (s9f) obj;
                s9fVar15.getClass();
                try {
                    View findViewById15 = view.findViewById(R.id.presale_toolbar);
                    if (findViewById15 != null) {
                        return (PlusPayToolbarView) findViewById15;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
                } catch (ClassCastException e15) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar15, e15);
                    return null;
                }
            case 15:
                s9f s9fVar16 = (s9f) obj;
                s9fVar16.getClass();
                try {
                    View findViewById16 = view.findViewById(R.id.presale_loading_layout);
                    if (findViewById16 != null) {
                        return (ViewGroup) findViewById16;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e16) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar16, e16);
                    return null;
                }
            case 16:
                s9f s9fVar17 = (s9f) obj;
                s9fVar17.getClass();
                try {
                    View findViewById17 = view.findViewById(R.id.presale_loading_text);
                    if (findViewById17 != null) {
                        return (TextView) findViewById17;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e17) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar17, e17);
                    return null;
                }
            case 17:
                s9f s9fVar18 = (s9f) obj;
                s9fVar18.getClass();
                try {
                    View findViewById18 = view.findViewById(R.id.presale_original_offer_button);
                    if (findViewById18 != null) {
                        return (Button) findViewById18;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e18) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar18, e18);
                    return null;
                }
            case 18:
                s9f s9fVar19 = (s9f) obj;
                s9fVar19.getClass();
                try {
                    View findViewById19 = view.findViewById(R.id.presale_legal_text);
                    if (findViewById19 != null) {
                        return (TextView) findViewById19;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e19) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar19, e19);
                    return null;
                }
            case 19:
                s9f s9fVar20 = (s9f) obj;
                s9fVar20.getClass();
                try {
                    View findViewById20 = view.findViewById(R.id.presale_scroll_view);
                    if (findViewById20 != null) {
                        return (NestedScrollView) findViewById20;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                } catch (ClassCastException e20) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar20, e20);
                    return null;
                }
            case 20:
                s9f s9fVar21 = (s9f) obj;
                s9fVar21.getClass();
                try {
                    View findViewById21 = view.findViewById(R.id.presale_offer_card);
                    if (findViewById21 != null) {
                        return (MaterialCardView) findViewById21;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
                } catch (ClassCastException e21) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar21, e21);
                    return null;
                }
            case 21:
                s9f s9fVar22 = (s9f) obj;
                s9fVar22.getClass();
                try {
                    View findViewById22 = view.findViewById(R.id.presale_offer_period_text);
                    if (findViewById22 != null) {
                        return (TextView) findViewById22;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e22) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar22, e22);
                    return null;
                }
            case 22:
                s9f s9fVar23 = (s9f) obj;
                s9fVar23.getClass();
                try {
                    View findViewById23 = view.findViewById(R.id.presale_offer_benefit_text);
                    if (findViewById23 != null) {
                        return (TextView) findViewById23;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e23) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar23, e23);
                    return null;
                }
            case 23:
                s9f s9fVar24 = (s9f) obj;
                s9fVar24.getClass();
                try {
                    View findViewById24 = view.findViewById(R.id.presale_offer_price_text);
                    if (findViewById24 != null) {
                        return (TextView) findViewById24;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e24) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar24, e24);
                    return null;
                }
            case 24:
                s9f s9fVar25 = (s9f) obj;
                s9fVar25.getClass();
                try {
                    View findViewById25 = view.findViewById(R.id.presale_offer_price_description_text);
                    if (findViewById25 != null) {
                        return (TextView) findViewById25;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e25) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar25, e25);
                    return null;
                }
            case 25:
                s9f s9fVar26 = (s9f) obj;
                s9fVar26.getClass();
                try {
                    View findViewById26 = view.findViewById(R.id.presale_offer_button);
                    if (findViewById26 != null) {
                        return (Button) findViewById26;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e26) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar26, e26);
                    return null;
                }
            case 26:
                s9f s9fVar27 = (s9f) obj;
                s9fVar27.getClass();
                try {
                    View findViewById27 = view.findViewById(R.id.presale_offer_additional_button_text);
                    if (findViewById27 != null) {
                        return (TextView) findViewById27;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e27) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar27, e27);
                    return null;
                }
            case 27:
                s9f s9fVar28 = (s9f) obj;
                s9fVar28.getClass();
                try {
                    View findViewById28 = view.findViewById(R.id.success_content_root);
                    if (findViewById28 != null) {
                        return (ViewGroup) findViewById28;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e28) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar28, e28);
                    return null;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                s9f s9fVar29 = (s9f) obj;
                s9fVar29.getClass();
                try {
                    View findViewById29 = view.findViewById(R.id.success_title);
                    if (findViewById29 != null) {
                        return (TextView) findViewById29;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e29) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar29, e29);
                    return null;
                }
            default:
                s9f s9fVar30 = (s9f) obj;
                s9fVar30.getClass();
                try {
                    View findViewById30 = view.findViewById(R.id.success_text);
                    if (findViewById30 != null) {
                        return (TextView) findViewById30;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e30) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar30, e30);
                    return null;
                }
        }
    }
}
