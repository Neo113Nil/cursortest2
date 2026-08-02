package ru.yandex.video.m3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.zo31;
import ru.yandex.video.m3.R;

/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerDebugViewBinding implements zo31 {
    public final ListView feedItems;
    private final LinearLayout rootView;
    public final TextView tvDecoders;
    public final TextView tvPreloadsInProgress;
    public final TextView tvVsid;

    private ListYandexPlayerManagerDebugViewBinding(LinearLayout linearLayout, ListView listView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.feedItems = listView;
        this.tvDecoders = textView;
        this.tvPreloadsInProgress = textView2;
        this.tvVsid = textView3;
    }

    public static ListYandexPlayerManagerDebugViewBinding bind(View view) {
        int i = R.id.feedItems;
        ListView listView = (ListView) cma1.O(i, view);
        if (listView != null) {
            i = R.id.tv_decoders;
            TextView textView = (TextView) cma1.O(i, view);
            if (textView != null) {
                i = R.id.tv_preloads_in_progress;
                TextView textView2 = (TextView) cma1.O(i, view);
                if (textView2 != null) {
                    i = R.id.tv_vsid;
                    TextView textView3 = (TextView) cma1.O(i, view);
                    if (textView3 != null) {
                        return new ListYandexPlayerManagerDebugViewBinding((LinearLayout) view, listView, textView, textView2, textView3);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ListYandexPlayerManagerDebugViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.list_yandex_player_manager_debug_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.zo31
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ListYandexPlayerManagerDebugViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
