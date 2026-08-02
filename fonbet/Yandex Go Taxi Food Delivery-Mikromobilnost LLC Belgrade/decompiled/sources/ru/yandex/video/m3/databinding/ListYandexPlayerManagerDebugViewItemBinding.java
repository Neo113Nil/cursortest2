package ru.yandex.video.m3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.zo31;
import ru.yandex.video.m3.R;

/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerDebugViewItemBinding implements zo31 {
    private final LinearLayout rootView;
    public final TextView tvEngine;
    public final TextView tvItemUuid;
    public final TextView tvPreload;

    private ListYandexPlayerManagerDebugViewItemBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.tvEngine = textView;
        this.tvItemUuid = textView2;
        this.tvPreload = textView3;
    }

    public static ListYandexPlayerManagerDebugViewItemBinding bind(View view) {
        int i = R.id.tv_engine;
        TextView textView = (TextView) cma1.O(i, view);
        if (textView != null) {
            i = R.id.tv_item_uuid;
            TextView textView2 = (TextView) cma1.O(i, view);
            if (textView2 != null) {
                i = R.id.tv_preload;
                TextView textView3 = (TextView) cma1.O(i, view);
                if (textView3 != null) {
                    return new ListYandexPlayerManagerDebugViewItemBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ListYandexPlayerManagerDebugViewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.list_yandex_player_manager_debug_view_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.zo31
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ListYandexPlayerManagerDebugViewItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
