package flex.logger.view;

import android.graphics.Rect;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ay31;
import defpackage.boj0;
import defpackage.by31;
import defpackage.cfx;
import defpackage.efx;
import defpackage.eqg0;
import defpackage.j2x;
import defpackage.l0x;
import defpackage.m1x;
import defpackage.m810;
import defpackage.n0x;
import defpackage.qyg0;
import defpackage.r3k0;
import defpackage.r7v;
import defpackage.rzo;
import defpackage.sb2;
import defpackage.tcc;
import defpackage.uvn;
import defpackage.vgz;
import defpackage.vsn;
import defpackage.w0x;
import defpackage.wgz;
import defpackage.zgv;
import defpackage.zjd;
import defpackage.zx31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006#"}, d2 = {"Lflex/logger/view/LoggerOverlayView;", "Landroid/widget/LinearLayout;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "isVisible", "Lzy11;", "changeChildrenVisibility", "(Z)V", "beginDelayedTransition", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lby31;", "repo", "setRepo", "(Lby31;)V", "Landroid/widget/TextView;", "counterView", "Landroid/widget/TextView;", "clearView", "counterContainer", "Landroid/widget/LinearLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "issuesView", "Landroidx/recyclerview/widget/RecyclerView;", "Lay31;", "subscription", "Lay31;", "Lby31;", "Companion", "a", "wgz", "flex-logger-view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoggerOverlayView extends LinearLayout {
    private static final int CONTAINER_PADDING = 32;
    public static final wgz Companion = new wgz();
    private static final long DURATION_DEFAULT = 150;
    private static final int SIZE_MEDIUM = 8;
    private static final int SIZE_SMALL = 4;
    public static final String TAG = "ISSUE_OVERLAY_VIEW_TAG";
    private final TextView clearView;
    private final LinearLayout counterContainer;
    private final TextView counterView;
    private final RecyclerView issuesView;
    private by31 repo;
    private ay31 subscription;

    public static final class a extends RecyclerView.d {
        @Override // androidx.recyclerview.widget.RecyclerView.d
        public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
            rect.top = m810.b(4.0f * recyclerView.getContext().getResources().getDisplayMetrics().density);
        }
    }

    public static final class b implements j2x {
        public static final b a = new b();
    }

    public LoggerOverlayView(ViewGroup viewGroup) {
        super(viewGroup.getContext(), null);
        setOrientation(1);
        setTag(TAG);
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        w0x[] w0xVarArr = {new w0x(b.a, new n0x())};
        uvn uvnVar = uvn.c;
        m1x m1xVar = new m1x(0);
        List asList = Arrays.asList(w0xVarArr);
        zjd zjdVar = new zjd();
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = zjdVar.a;
            if (!hasNext) {
                recyclerView.setAdapter(new efx(new boj0(linkedHashMap, uvnVar), EmptyList.a, m1xVar.b, m1xVar.a));
                sb2.M(recyclerView, 0, rzo.r(32.0f).w, 7);
                recyclerView.setVisibility(8);
                recyclerView.setClipToPadding(false);
                recyclerView.addItemDecoration(new a());
                this.issuesView = recyclerView;
                TextView textView = new TextView(getContext());
                int b2 = m810.b(textView.getResources().getDisplayMetrics().density * 8.0f);
                int b3 = m810.b(textView.getResources().getDisplayMetrics().density * 4.0f);
                textView.setPadding(b2, b3, b2, b3);
                textView.setTextColor(textView.getContext().getColor(eqg0.logger_white));
                textView.setBackgroundResource(qyg0.logger_toggle_background);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388613;
                textView.setLayoutParams(layoutParams);
                textView.setVisibility(8);
                textView.setOnClickListener(new vsn(26, this, textView));
                this.counterView = textView;
                TextView textView2 = new TextView(getContext());
                int b4 = m810.b(textView2.getResources().getDisplayMetrics().density * 8.0f);
                int b5 = m810.b(4.0f * textView2.getResources().getDisplayMetrics().density);
                textView2.setPadding(b4, b5, b4, b5);
                textView2.setTextColor(textView2.getContext().getColor(eqg0.logger_white));
                textView2.setText("Clear");
                textView2.setBackgroundResource(qyg0.logger_clear_background);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 8388611;
                textView2.setLayoutParams(layoutParams2);
                textView2.setVisibility(8);
                textView2.setOnClickListener(new zgv(6, this));
                this.clearView = textView2;
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setGravity(8388613);
                linearLayout.setOrientation(0);
                sb2.M(linearLayout, rzo.r(32.0f).w, 0, 13);
                linearLayout.addView(textView2);
                linearLayout.addView(textView);
                this.counterContainer = linearLayout;
                addView(linearLayout);
                addView(recyclerView);
                int b6 = m810.b(8.0f * getResources().getDisplayMetrics().density);
                setPadding(b6, 0, b6, 0);
                return;
            }
            w0x w0xVar = (w0x) it.next();
            linkedHashMap.put(w0xVar.a, w0xVar.b);
        }
    }

    private final void beginDelayedTransition() {
        TransitionManager.beginDelayedTransition(this, new AutoTransition().setDuration(150L));
    }

    private final void changeChildrenVisibility(boolean isVisible) {
        this.counterView.setSelected(isVisible);
        this.clearView.setVisibility(isVisible ? 0 : 8);
        beginDelayedTransition();
        this.issuesView.setVisibility(isVisible ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(LoggerOverlayView loggerOverlayView, TextView textView, View view) {
        loggerOverlayView.changeChildrenVisibility(!textView.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(LoggerOverlayView loggerOverlayView, View view) {
        by31 by31Var = loggerOverlayView.repo;
        if (by31Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = by31Var.c;
            copyOnWriteArrayList.clear();
            Iterator it = by31Var.b.iterator();
            while (it.hasNext()) {
                onAttachedToWindow$lambda$10(((vgz) it.next()).a, copyOnWriteArrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$10(LoggerOverlayView loggerOverlayView, List list) {
        loggerOverlayView.post(new r7v(25, list, loggerOverlayView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$10$lambda$9(List list, LoggerOverlayView loggerOverlayView) {
        int size = list.size();
        loggerOverlayView.beginDelayedTransition();
        loggerOverlayView.counterView.setText(size + " issues");
        List list2 = list;
        loggerOverlayView.counterView.setVisibility(!list2.isEmpty() ? 0 : 8);
        cfx cfxVar = (cfx) loggerOverlayView.issuesView.getAdapter();
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new l0x((zx31) it.next()));
        }
        cfxVar.g(arrayList);
        loggerOverlayView.issuesView.setVisibility((list2.isEmpty() || !loggerOverlayView.counterView.isSelected()) ? 8 : 0);
        loggerOverlayView.clearView.setVisibility(list2.isEmpty() ? 8 : 0);
        loggerOverlayView.counterView.setSelected(loggerOverlayView.issuesView.getVisibility() == 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        r3k0 r3k0Var;
        super.onAttachedToWindow();
        by31 by31Var = this.repo;
        if (by31Var != null) {
            vgz vgzVar = new vgz(this);
            by31Var.b.add(vgzVar);
            onAttachedToWindow$lambda$10(this, by31Var.c);
            r3k0Var = new r3k0(28, by31Var, vgzVar);
        } else {
            r3k0Var = null;
        }
        this.subscription = r3k0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ay31 ay31Var = this.subscription;
        if (ay31Var != null) {
            r3k0 r3k0Var = (r3k0) ay31Var;
            by31 by31Var = (by31) r3k0Var.b;
            by31Var.b.remove((vgz) r3k0Var.c);
        }
        this.subscription = null;
    }

    public final void setRepo(by31 repo) {
        this.repo = repo;
    }
}
