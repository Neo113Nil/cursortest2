package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class t2s extends LinearLayout {
    public final v1s a;
    public final View b;
    public final ngu c;
    public final xxo d;
    public xo9 e;

    public t2s(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v1s v1sVar = new v1s(context, null, R.attr.divTabIndicatorLayoutStyle);
        v1sVar.setId(R.id.base_tabbed_title_container_scroller);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.title_tab_title_height));
        layoutParams.gravity = 8388611;
        v1sVar.setLayoutParams(layoutParams);
        int dimensionPixelSize = v1sVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = v1sVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_horizontal);
        v1sVar.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        v1sVar.setClipToPadding(false);
        this.a = v1sVar;
        View view = new View(context);
        view.setId(R.id.div_tabs_divider);
        Resources resources = context.getResources();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.div_separator_delimiter_height));
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.div_horizontal_padding);
        layoutParams2.leftMargin = dimensionPixelSize3;
        layoutParams2.rightMargin = dimensionPixelSize3;
        layoutParams2.topMargin = resources.getDimensionPixelSize(R.dimen.title_tab_title_separator_margin_top);
        layoutParams2.bottomMargin = resources.getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundResource(R.color.div_separator_color);
        this.b = view;
        ngu nguVar = new ngu(context, null, 0, 6, null);
        nguVar.setId(R.id.div_tabs_container_helper);
        nguVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nguVar.setCollapsiblePaddingBottom(0);
        this.c = nguVar;
        xxo xxoVar = new xxo(context);
        xxoVar.setId(R.id.div_tabs_pager_container);
        xxoVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        xxoVar.setOverScrollMode(2);
        WeakHashMap weakHashMap = wdu.a;
        ndu.m(xxoVar, true);
        this.d = xxoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        setId(R.id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        ngu pagerLayout = getPagerLayout();
        pagerLayout.addView(getViewPager());
        pagerLayout.addView(frameLayout);
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    public xo9 getDivTabsAdapter() {
        return this.e;
    }

    @NotNull
    public View getDivider() {
        return this.b;
    }

    @NotNull
    public ngu getPagerLayout() {
        return this.c;
    }

    @NotNull
    public v1s getTitleLayout() {
        return this.a;
    }

    @NotNull
    public xxo getViewPager() {
        return this.d;
    }

    public void setDivTabsAdapter(xo9 xo9Var) {
        this.e = xo9Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "android.widget.TabWidget";
    }

    public /* synthetic */ t2s(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t2s(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
