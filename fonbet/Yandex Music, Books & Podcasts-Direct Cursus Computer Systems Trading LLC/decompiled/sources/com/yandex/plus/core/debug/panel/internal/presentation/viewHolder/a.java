package com.yandex.plus.core.debug.panel.internal.presentation.viewHolder;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.services.DailyServicesView;
import com.yandex.pulse.metrics.o;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(View view, int i) {
        this.a = i;
        this.b = view;
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
                    View findViewById = view.findViewById(R.id.plus_sdk_title_custom_view);
                    if (findViewById != null) {
                        return (TextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = view.findViewById(R.id.plus_debug_panel_dialog_item_text);
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
                    View findViewById3 = view.findViewById(R.id.plus_debug_panel_dialog_item_checkbox);
                    if (findViewById3 != null) {
                        return (CheckBox) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.CheckBox");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            case 3:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = view.findViewById(R.id.plus_sdk_general_info_value);
                    if (findViewById4 != null) {
                        return (TextView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
            case 4:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById5 = view.findViewById(R.id.plus_sdk_divider_title);
                    if (findViewById5 != null) {
                        return (TextView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e5) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar5, e5);
                    return null;
                }
            case 5:
                s9f s9fVar6 = (s9f) obj;
                s9fVar6.getClass();
                try {
                    View findViewById6 = view.findViewById(R.id.plus_sdk_title_custom_view);
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
                    View findViewById7 = view.findViewById(R.id.plus_sdk_item_log);
                    if (findViewById7 != null) {
                        return (TextView) findViewById7;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e7) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar7, e7);
                    return null;
                }
            case 7:
                s9f s9fVar8 = (s9f) obj;
                s9fVar8.getClass();
                try {
                    View findViewById8 = view.findViewById(R.id.plus_sdk_quest_image_view);
                    if (findViewById8 != null) {
                        return (ImageView) findViewById8;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e8) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar8, e8);
                    return null;
                }
            case 8:
                s9f s9fVar9 = (s9f) obj;
                s9fVar9.getClass();
                try {
                    View findViewById9 = view.findViewById(R.id.plus_sdk_completed_image_view);
                    if (findViewById9 != null) {
                        return (ImageView) findViewById9;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e9) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar9, e9);
                    return null;
                }
            case 9:
                s9f s9fVar10 = (s9f) obj;
                s9fVar10.getClass();
                try {
                    View findViewById10 = view.findViewById(R.id.plus_sdk_title_text_view);
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
                    View findViewById11 = view.findViewById(R.id.plus_sdk_subtitle_text_view);
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
                    View findViewById12 = view.findViewById(R.id.plus_sdk_quest_image_view);
                    if (findViewById12 != null) {
                        return (ImageView) findViewById12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e12) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar12, e12);
                    return null;
                }
            case 12:
                s9f s9fVar13 = (s9f) obj;
                s9fVar13.getClass();
                try {
                    View findViewById13 = view.findViewById(R.id.plus_sdk_quests_toolbar_linear_layout);
                    if (findViewById13 != null) {
                        return (LinearLayoutCompat) findViewById13;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                } catch (ClassCastException e13) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar13, e13);
                    return null;
                }
            case 13:
                s9f s9fVar14 = (s9f) obj;
                s9fVar14.getClass();
                try {
                    View findViewById14 = view.findViewById(R.id.plus_sdk_toolbar_chain_text_view);
                    if (findViewById14 != null) {
                        return (TextView) findViewById14;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e14) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar14, e14);
                    return null;
                }
            case 14:
                s9f s9fVar15 = (s9f) obj;
                s9fVar15.getClass();
                try {
                    View findViewById15 = view.findViewById(R.id.plus_sdk_toolbar_reward_text_view);
                    if (findViewById15 != null) {
                        return (TextView) findViewById15;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e15) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar15, e15);
                    return null;
                }
            case 15:
                s9f s9fVar16 = (s9f) obj;
                s9fVar16.getClass();
                try {
                    View findViewById16 = view.findViewById(R.id.plus_sdk_title_text_view);
                    if (findViewById16 != null) {
                        return (TextView) findViewById16;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e16) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar16, e16);
                    return null;
                }
            case 16:
                s9f s9fVar17 = (s9f) obj;
                s9fVar17.getClass();
                try {
                    View findViewById17 = view.findViewById(R.id.plus_sdk_progress_bar);
                    if (findViewById17 != null) {
                        return (LinearProgressIndicator) findViewById17;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.progressindicator.LinearProgressIndicator");
                } catch (ClassCastException e17) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar17, e17);
                    return null;
                }
            case 17:
                s9f s9fVar18 = (s9f) obj;
                s9fVar18.getClass();
                try {
                    View findViewById18 = view.findViewById(R.id.plus_sdk_progress_hint_text_view);
                    if (findViewById18 != null) {
                        return (TextView) findViewById18;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e18) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar18, e18);
                    return null;
                }
            case 18:
                s9f s9fVar19 = (s9f) obj;
                s9fVar19.getClass();
                try {
                    View findViewById19 = view.findViewById(R.id.plus_sdk_progress_fallback_text_view);
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
                    View findViewById20 = view.findViewById(R.id.plus_sdk_time_left_text_view);
                    if (findViewById20 != null) {
                        return (TextView) findViewById20;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e20) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar20, e20);
                    return null;
                }
            case 20:
                s9f s9fVar21 = (s9f) obj;
                s9fVar21.getClass();
                try {
                    View findViewById21 = view.findViewById(R.id.plus_sdk_image_placeholder_view);
                    if (findViewById21 != null) {
                        return findViewById21;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e21) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar21, e21);
                    return null;
                }
            case 21:
                s9f s9fVar22 = (s9f) obj;
                s9fVar22.getClass();
                try {
                    View findViewById22 = view.findViewById(R.id.plus_sdk_title_placeholder_view);
                    if (findViewById22 != null) {
                        return findViewById22;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e22) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar22, e22);
                    return null;
                }
            case 22:
                s9f s9fVar23 = (s9f) obj;
                s9fVar23.getClass();
                try {
                    View findViewById23 = view.findViewById(R.id.plus_sdk_subtitle_placeholder_view);
                    if (findViewById23 != null) {
                        return findViewById23;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e23) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar23, e23);
                    return null;
                }
            case 23:
                s9f s9fVar24 = (s9f) obj;
                s9fVar24.getClass();
                try {
                    View findViewById24 = view.findViewById(R.id.plus_sdk_description_placeholder_view);
                    if (findViewById24 != null) {
                        return findViewById24;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e24) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar24, e24);
                    return null;
                }
            case 24:
                s9f s9fVar25 = (s9f) obj;
                s9fVar25.getClass();
                try {
                    View findViewById25 = view.findViewById(R.id.plus_sdk_daily_bottom_view_title);
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
                    View findViewById26 = view.findViewById(R.id.plus_sdk_daily_bottom_view_subtitle);
                    if (findViewById26 != null) {
                        return (TextView) findViewById26;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e26) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar26, e26);
                    return null;
                }
            case 26:
                s9f s9fVar27 = (s9f) obj;
                s9fVar27.getClass();
                try {
                    View findViewById27 = view.findViewById(R.id.plus_sdk_daily_services_view);
                    if (findViewById27 != null) {
                        return (DailyServicesView) findViewById27;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.services.DailyServicesView");
                } catch (ClassCastException e27) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar27, e27);
                    return null;
                }
            case 27:
                s9f s9fVar28 = (s9f) obj;
                s9fVar28.getClass();
                try {
                    View findViewById28 = view.findViewById(R.id.plus_sdk_daily_bottom_view_description);
                    if (findViewById28 != null) {
                        return (TextView) findViewById28;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e28) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar28, e28);
                    return null;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                s9f s9fVar29 = (s9f) obj;
                s9fVar29.getClass();
                try {
                    View findViewById29 = view.findViewById(R.id.plus_sdk_daily_bottom_view_button);
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
                    View findViewById30 = view.findViewById(R.id.plus_sdk_daily_bottom_view_left_confetti);
                    if (findViewById30 != null) {
                        return (ShapeableImageView) findViewById30;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.imageview.ShapeableImageView");
                } catch (ClassCastException e30) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar30, e30);
                    return null;
                }
        }
    }
}
