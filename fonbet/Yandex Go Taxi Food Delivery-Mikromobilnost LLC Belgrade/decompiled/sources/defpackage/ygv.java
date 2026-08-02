package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class ygv implements ct31 {
    public final bhv a;
    public final ViewGroup b;
    public boolean c;
    public final LinkedHashMap w = new LinkedHashMap();
    public Integer x;
    public Float y;
    public final boolean z;

    public ygv(bhv bhvVar, ViewGroup viewGroup) {
        this.a = bhvVar;
        this.b = viewGroup;
        Locale locale = viewGroup.getContext().getResources().getConfiguration().getLocales().get(0);
        this.z = TextUtils.getLayoutDirectionFromLocale(locale == null ? Locale.getDefault() : locale) == 1;
    }

    public final Map a(mhv mhvVar) {
        LinkedHashMap linkedHashMap = this.w;
        Map map = (Map) linkedHashMap.get(mhvVar);
        if (map != null) {
            return map;
        }
        Integer valueOf = Integer.valueOf(e9h0.download);
        ru10 ru10Var = mhvVar.b;
        Map i = b.i(new Pair(valueOf, Boolean.valueOf(ru10Var != null ? ru10Var.v : true)), new Pair(Integer.valueOf(e9h0.share), Boolean.valueOf(ru10Var != null ? ru10Var.w : true)), new Pair(Integer.valueOf(e9h0.show_message), Boolean.valueOf((ru10Var != null ? ru10Var.k : null) != null)), new Pair(Integer.valueOf(e9h0.pin), Boolean.valueOf((ru10Var != null ? ru10Var.j : null) != null)), new Pair(Integer.valueOf(e9h0.forward), Boolean.valueOf((ru10Var != null ? ru10Var.f : null) != null)), new Pair(Integer.valueOf(e9h0.resend), Boolean.valueOf(ru10Var != null && ru10Var.t)), new Pair(Integer.valueOf(e9h0.reply), Boolean.valueOf((ru10Var != null ? ru10Var.g : null) != null)));
        ViewGroup viewGroup = this.b;
        int childCount = viewGroup.getChildCount();
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            Boolean bool = (Boolean) i.get(Integer.valueOf(viewGroup.getChildAt(i4).getId()));
            if (bool != null ? bool.booleanValue() : false) {
                i3++;
                if (i2 == -1) {
                    i2 = i4;
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int childCount2 = viewGroup.getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            Boolean bool2 = (Boolean) i.get(Integer.valueOf(childAt.getId()));
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
            int width = (viewGroup.getWidth() - (childAt.getWidth() * i3)) / (i3 + 1);
            int width2 = ((childAt.getWidth() + width) * (booleanValue ? i5 : i6 - i2)) + width;
            float f = booleanValue ? 1.0f : 0.0f;
            if (this.z) {
                width2 = (viewGroup.getWidth() - width2) - childAt.getWidth();
            }
            linkedHashMap2.put(Integer.valueOf(childAt.getId()), new xgv(f, width2));
            if (booleanValue) {
                i5++;
            }
        }
        linkedHashMap.put(mhvVar, linkedHashMap2);
        return linkedHashMap2;
    }

    public final void b(float f, int i) {
        bhv bhvVar = this.a;
        if (bhvVar.b() == 0) {
            return;
        }
        Integer num = this.x;
        if (num != null && num.intValue() == i && jl40.j(this.y, f)) {
            return;
        }
        this.x = Integer.valueOf(i);
        this.y = Float.valueOf(f);
        Map a = a((mhv) bhvVar.n(i));
        int b = bhvVar.b() - 1;
        ViewGroup viewGroup = this.b;
        if (i >= b) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                xgv xgvVar = (xgv) a.get(Integer.valueOf(childAt.getId()));
                childAt.setAlpha(xgvVar != null ? xgvVar.a : 0.0f);
                childAt.setX(((xgv) a.get(Integer.valueOf(childAt.getId()))) != null ? r12.b : 0.0f);
            }
            return;
        }
        Map a2 = a((mhv) bhvVar.n(i + 1));
        int childCount2 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = viewGroup.getChildAt(i3);
            xgv xgvVar2 = (xgv) a.get(Integer.valueOf(childAt2.getId()));
            int i4 = xgvVar2 != null ? xgvVar2.b : 0;
            xgv xgvVar3 = (xgv) a2.get(Integer.valueOf(childAt2.getId()));
            int i5 = xgvVar3 != null ? xgvVar3.b : 0;
            xgv xgvVar4 = (xgv) a.get(Integer.valueOf(childAt2.getId()));
            float f2 = xgvVar4 != null ? xgvVar4.a : 0.0f;
            xgv xgvVar5 = (xgv) a2.get(Integer.valueOf(childAt2.getId()));
            childAt2.setAlpha((((xgvVar5 != null ? xgvVar5.a : 0.0f) - f2) * f) + f2);
            childAt2.setX(((i5 - i4) * f) + i4);
        }
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        b(f, i);
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
    }
}
