package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bhp;
import defpackage.jtc;
import defpackage.jym;
import defpackage.kym;
import defpackage.lym;
import defpackage.xq0;
import defpackage.yyr;
import defpackage.zne;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();
    public final ArrayList a;
    public lym b;

    public ProtectionLayout(Context context, List<kym> list) {
        super(context);
        this.a = new ArrayList();
        setProtections(list);
    }

    private yyr getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof yyr) {
            return (yyr) tag;
        }
        yyr yyrVar = new yyr(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, yyrVar);
        return yyrVar;
    }

    public final void a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new lym(getOrInstallSystemBarStateMonitor(), arrayList);
        int childCount = getChildCount();
        int size = this.b.a.size();
        for (int i = 0; i < size; i++) {
            kym kymVar = (kym) this.b.a.get(i);
            Context context = getContext();
            int i2 = i + childCount;
            jym jymVar = kymVar.a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, jymVar.a, 48);
            zne zneVar = jymVar.b;
            layoutParams.leftMargin = zneVar.a;
            layoutParams.topMargin = zneVar.b;
            layoutParams.rightMargin = zneVar.c;
            layoutParams.bottomMargin = zneVar.d;
            View view = new View(context);
            view.setTag(c);
            view.setTranslationX(jymVar.e);
            view.setTranslationY(jymVar.f);
            view.setAlpha(jymVar.g);
            view.setVisibility(jymVar.c ? 0 : 4);
            view.setBackground(jymVar.d);
            jtc jtcVar = new jtc(layoutParams, view);
            if (jymVar.h != null) {
                xq0.q("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                jymVar.h = jtcVar;
                addView(view, i2, layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            lym lymVar = this.b;
            int childCount = getChildCount() - (lymVar != null ? lymVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        lym lymVar;
        if (this.b != null) {
            removeViews(getChildCount() - this.b.a.size(), this.b.a.size());
            int size = this.b.a.size();
            int i = 0;
            while (true) {
                lymVar = this.b;
                if (i >= size) {
                    break;
                }
                ((kym) lymVar.a.get(i)).a.h = null;
                i++;
            }
            ArrayList arrayList = lymVar.a;
            if (!lymVar.f) {
                lymVar.f = true;
                lymVar.b.b.remove(lymVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((kym) arrayList.get(size2)).d = null;
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof yyr) {
            yyr yyrVar = (yyr) tag;
            if (yyrVar.b.isEmpty()) {
                yyrVar.a.post(new bhp(9, yyrVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<kym> list) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.a = new ArrayList();
    }
}
