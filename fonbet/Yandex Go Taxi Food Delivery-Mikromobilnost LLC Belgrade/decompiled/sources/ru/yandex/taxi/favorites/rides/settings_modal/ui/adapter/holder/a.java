package ru.yandex.taxi.favorites.rides.settings_modal.ui.adapter.holder;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoView;
import defpackage.g0c;
import defpackage.he7;
import defpackage.hlq0;
import defpackage.iar0;
import defpackage.jar0;
import defpackage.mar0;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.xng0;
import defpackage.zxs;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public abstract class a {
    public static zxs a() {
        g0c a = qoi0.a(iar0.class);
        hlq0 hlq0Var = new hlq0(18);
        SettingsModalLineDividerViewHolder$Companion$itemLine$2 settingsModalLineDividerViewHolder$Companion$itemLine$2 = SettingsModalLineDividerViewHolder$Companion$itemLine$2.b;
        return new zxs(a.a(), 0, hlq0Var, EmptyList.a, new he7(1, settingsModalLineDividerViewHolder$Companion$itemLine$2), null);
    }

    public static zxs b() {
        g0c a = qoi0.a(jar0.class);
        hlq0 hlq0Var = new hlq0(19);
        SettingsModalLineDividerViewHolder$Companion$itemLineSlot$2 settingsModalLineDividerViewHolder$Companion$itemLineSlot$2 = SettingsModalLineDividerViewHolder$Companion$itemLineSlot$2.b;
        return new zxs(a.a(), 0, hlq0Var, EmptyList.a, new he7(1, settingsModalLineDividerViewHolder$Companion$itemLineSlot$2), null);
    }

    public static zxs c() {
        g0c a = qoi0.a(mar0.class);
        hlq0 hlq0Var = new hlq0(20);
        SettingsModalSpacerVerticalViewHolder$Companion$itemType$2 settingsModalSpacerVerticalViewHolder$Companion$itemType$2 = SettingsModalSpacerVerticalViewHolder$Companion$itemType$2.b;
        return new zxs(a.a(), 0, hlq0Var, EmptyList.a, new he7(1, settingsModalSpacerVerticalViewHolder$Companion$itemType$2), null);
    }

    public static GoView d(int i, Context context) {
        GoView goView = new GoView(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, tje.u(1, goView.getContext()));
        int u = tje.u(i, goView.getContext());
        int u2 = tje.u(16, goView.getContext());
        int i2 = marginLayoutParams.topMargin;
        int i3 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(u);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(u2);
        marginLayoutParams.bottomMargin = i3;
        goView.setLayoutParams(marginLayoutParams);
        goView.setBackgroundAttr(xng0.line);
        goView.setFocusable(false);
        goView.setImportantForAccessibility(4);
        return goView;
    }
}
