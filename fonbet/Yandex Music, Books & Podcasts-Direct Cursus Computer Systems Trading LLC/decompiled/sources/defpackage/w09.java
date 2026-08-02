package defpackage;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class w09 extends p9 {
    public final gp8 b;
    public final p0a c;
    public final szm d;
    public final xc9 e;
    public final float f;

    public w09(gp8 gp8Var, p0a p0aVar, szm szmVar, xc9 xc9Var, float f) {
        super(gp8Var);
        this.b = gp8Var;
        this.c = p0aVar;
        this.d = szmVar;
        this.e = xc9Var;
        this.f = f;
    }

    public final void G(hh9 hh9Var, e23 e23Var, s09 s09Var, u09 u09Var) {
        int i;
        int i2;
        i3k pagerSnapStartHelper;
        DisplayMetrics displayMetrics = hh9Var.getResources().getDisplayMetrics();
        xzb xzbVar = e23Var.b;
        szb szbVar = s09Var.x;
        szb szbVar2 = s09Var.t;
        int i3 = 1;
        int i4 = ((p09) szbVar.a(xzbVar)) == p09.HORIZONTAL ? 0 : 1;
        u09Var.o = i4;
        boolean z = s09Var.D.a(xzbVar) == r09.AUTO;
        hh9Var.setVerticalScrollBarEnabled(z && i4 == 1);
        hh9Var.setHorizontalScrollBarEnabled(z && i4 == 0);
        hh9Var.setScrollbarFadingEnabled(false);
        szb szbVar3 = s09Var.h;
        if (szbVar3 != null) {
            long longValue = ((Number) szbVar3.a(xzbVar)).longValue();
            long j = longValue >> 31;
            i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = 1;
        }
        u09Var.p = i;
        szb szbVar4 = s09Var.k;
        if (szbVar4 == null) {
            szbVar4 = szbVar2;
        }
        float y = bg3.y((Number) szbVar4.a(xzbVar), displayMetrics);
        u09Var.q = y;
        hh9Var.setClipChildren(false);
        l0k l0kVar = i == 1 ? new l0k(bg3.w((Long) szbVar2.a(xzbVar), displayMetrics), 0, i4, 61) : new l0k(bg3.w((Long) szbVar2.a(xzbVar), displayMetrics), eeh.b(y), i4, 57);
        for (int itemDecorationCount = hh9Var.getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
            hh9Var.v0(itemDecorationCount);
        }
        hh9Var.s(l0kVar);
        q09 q09Var = (q09) s09Var.C.a(xzbVar);
        hh9Var.setScrollMode(q09Var);
        int ordinal = q09Var.ordinal();
        if (ordinal == 0) {
            int w = bg3.w((Long) szbVar2.a(xzbVar), hh9Var.getResources().getDisplayMetrics());
            i3k pagerSnapStartHelper2 = hh9Var.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.e = w;
            } else {
                pagerSnapStartHelper2 = new i3k();
                pagerSnapStartHelper2.e = w;
                hh9Var.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.a(hh9Var);
        } else if (ordinal == 1 && (pagerSnapStartHelper = hh9Var.getPagerSnapStartHelper()) != null) {
            pagerSnapStartHelper.a(null);
        }
        y09 divLinearLayoutManager = i == 1 ? new DivLinearLayoutManager(e23Var, hh9Var, s09Var, i4) : new DivGridLayoutManager(e23Var, hh9Var, s09Var, i4);
        hh9Var.setLayoutManager(divLinearLayoutManager.i());
        hh9Var.setScrollInterceptionAngle(this.f);
        ArrayList arrayList = hh9Var.P0;
        if (arrayList != null) {
            arrayList.clear();
        }
        b1a currentState = e23Var.a.getCurrentState();
        if (currentState != null) {
            String str = s09Var.r;
            if (str == null) {
                str = String.valueOf(s09Var.hashCode());
            }
            a1a a1aVar = (a1a) currentState.b.get(str);
            b1d b1dVar = a1aVar instanceof b1d ? (b1d) a1aVar : null;
            if (b1dVar != null) {
                i2 = b1dVar.a;
            } else {
                long longValue2 = ((Number) s09Var.l.a(xzbVar)).longValue();
                long j2 = longValue2 >> 31;
                i2 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            int paddingStart = b1dVar != null ? b1dVar.b : i2 != 0 ? 0 : i4 == 0 ? hh9Var.getPaddingStart() : hh9Var.getPaddingTop();
            int ordinal2 = q09Var.ordinal();
            if (ordinal2 == 0) {
                i3 = 2;
            } else if (ordinal2 != 1) {
                b6e.s();
                return;
            }
            Object layoutManager = hh9Var.getLayoutManager();
            y09 y09Var = layoutManager instanceof y09 ? (y09) layoutManager : null;
            if (y09Var != null) {
                if (paddingStart == 0 && i2 == 0) {
                    y09Var.k(i2, i3);
                } else {
                    y09Var.g(i2, paddingStart, i3);
                }
            }
            hh9Var.t(new vnt(str, currentState, divLinearLayoutManager));
        }
        hh9Var.t(new e19(e23Var, hh9Var, divLinearLayoutManager, s09Var));
        hh9Var.setOnInterceptTouchEventListener(((Boolean) s09Var.z.a(xzbVar)).booleanValue() ? o6c.m : null);
    }
}
