package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class n implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ n(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = oVar.findViewById(R.id.plus_sdk_btn_search_next);
                    if (findViewById != null) {
                        return (ImageButton) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = oVar.findViewById(R.id.plus_sdk_btn_search_clear);
                    if (findViewById2 != null) {
                        return (ImageButton) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            case 2:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = oVar.findViewById(R.id.plus_sdk_image_button_close_search);
                    if (findViewById3 != null) {
                        return findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            case 3:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = oVar.findViewById(R.id.plus_sdk_button_scroll);
                    if (findViewById4 != null) {
                        return (ImageButton) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
            case 4:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById5 = oVar.findViewById(R.id.plus_sdk_recycler_view_logs);
                    if (findViewById5 != null) {
                        return (RecyclerView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e5) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar5, e5);
                    return null;
                }
            case 5:
                s9f s9fVar6 = (s9f) obj;
                s9fVar6.getClass();
                try {
                    View findViewById6 = oVar.findViewById(R.id.plus_sdk_image_button_back_to_info);
                    if (findViewById6 != null) {
                        return (ImageButton) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e6) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar6, e6);
                    return null;
                }
            case 6:
                s9f s9fVar7 = (s9f) obj;
                s9fVar7.getClass();
                try {
                    View findViewById7 = oVar.findViewById(R.id.plus_sdk_text_view_back);
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
                    View findViewById8 = oVar.findViewById(R.id.plus_sdk_text_view_title_logs);
                    if (findViewById8 != null) {
                        return (TextView) findViewById8;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e8) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar8, e8);
                    return null;
                }
            case 8:
                s9f s9fVar9 = (s9f) obj;
                s9fVar9.getClass();
                try {
                    View findViewById9 = oVar.findViewById(R.id.plus_sdk_image_button_menu);
                    if (findViewById9 != null) {
                        return (ImageButton) findViewById9;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e9) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar9, e9);
                    return null;
                }
            case 9:
                s9f s9fVar10 = (s9f) obj;
                s9fVar10.getClass();
                try {
                    View findViewById10 = oVar.findViewById(R.id.plus_sdk_image_button_to_search);
                    if (findViewById10 != null) {
                        return (ImageButton) findViewById10;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e10) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar10, e10);
                    return null;
                }
            case 10:
                s9f s9fVar11 = (s9f) obj;
                s9fVar11.getClass();
                try {
                    View findViewById11 = oVar.findViewById(R.id.plus_sdk_view_search_header);
                    if (findViewById11 != null) {
                        return findViewById11;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e11) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar11, e11);
                    return null;
                }
            case 11:
                s9f s9fVar12 = (s9f) obj;
                s9fVar12.getClass();
                try {
                    View findViewById12 = oVar.findViewById(R.id.plus_sdk_et_search);
                    if (findViewById12 != null) {
                        return (EditText) findViewById12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
                } catch (ClassCastException e12) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar12, e12);
                    return null;
                }
            default:
                s9f s9fVar13 = (s9f) obj;
                s9fVar13.getClass();
                try {
                    View findViewById13 = oVar.findViewById(R.id.plus_sdk_btn_search_prev);
                    if (findViewById13 != null) {
                        return (ImageButton) findViewById13;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e13) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar13, e13);
                    return null;
                }
        }
    }
}
