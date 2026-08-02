package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.google.android.material.tabs.e;
import com.google.android.material.tabs.f;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class tt31 {
    public final SharedPreferences a;
    public final ViewPager b;
    public final TabLayout c;
    public View d;
    public View e;

    public tt31(SharedPreferences sharedPreferences, ViewPager viewPager, TabLayout tabLayout, mp11 mp11Var) {
        this.a = sharedPreferences;
        this.b = viewPager;
        this.c = tabLayout;
        tabLayout.addOnTabSelectedListener((d) new f(viewPager));
        viewPager.addOnPageChangeListener(new e(tabLayout));
        tabLayout.addOnTabSelectedListener(new s4x0(mp11Var.a(), mp11Var.c(), new ke31(21, this)));
        c();
    }

    public static TextView b(TabLayout.a aVar) {
        return (TextView) aVar.e.findViewById(e9h0.switcher_tab_title);
    }

    public final void a(ArrayList arrayList, View view, int i) {
        TabLayout tabLayout = this.c;
        TabLayout.a newTab = tabLayout.newTab();
        boolean isEmpty = arrayList.isEmpty();
        newTab.e = LayoutInflater.from(newTab.g.getContext()).inflate(olh0.msg_v_emoji_sticker_switcher_tab, (ViewGroup) newTab.g, false);
        newTab.b();
        TextView textView = (TextView) newTab.e.findViewById(e9h0.switcher_tab_title);
        textView.setText(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        int b = kjs0.b(1);
        marginLayoutParams.setMargins(0, b, 0, b);
        if (isEmpty) {
            marginLayoutParams.setMarginEnd(b / 2);
        } else {
            marginLayoutParams.setMarginStart(b / 2);
        }
        textView.setTextColor(qke.m(ipg0.msg_text_selector, textView.getContext()));
        tabLayout.addTab(newTab);
        arrayList.add(view);
    }

    public final void c() {
        TabLayout tabLayout;
        ViewPager viewPager = this.b;
        if (viewPager == null || (tabLayout = this.c) == null) {
            return;
        }
        int i = this.a.getInt("emoji_sticker_current_position", 0);
        tabLayout.removeAllTabs();
        ArrayList arrayList = new ArrayList();
        View view = this.d;
        if (view != null) {
            a(arrayList, view, oyh0.emoji_sticker_switcher_emoji);
        }
        View view2 = this.e;
        if (view2 != null) {
            a(arrayList, view2, oyh0.emoji_sticker_switcher_stickers);
        }
        if (arrayList.size() < 2) {
            tabLayout.setVisibility(8);
        } else {
            tabLayout.setVisibility(0);
        }
        viewPager.setAdapter(new st31(arrayList));
        if (arrayList.isEmpty()) {
            return;
        }
        if (i < arrayList.size()) {
            viewPager.setCurrentItem(i);
        } else {
            viewPager.setCurrentItem(arrayList.size() - 1);
        }
    }
}
