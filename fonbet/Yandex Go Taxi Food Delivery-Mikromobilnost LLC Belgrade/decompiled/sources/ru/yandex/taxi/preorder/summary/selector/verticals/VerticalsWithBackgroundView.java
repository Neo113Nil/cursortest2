package ru.yandex.taxi.preorder.summary.selector.verticals;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.aub;
import defpackage.cp1;
import defpackage.el11;
import defpackage.hf31;
import defpackage.ib31;
import defpackage.jb31;
import defpackage.kb31;
import defpackage.kk31;
import defpackage.kp50;
import defpackage.leq0;
import defpackage.mb31;
import defpackage.ob31;
import defpackage.oeq0;
import defpackage.og20;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00013B?\b\u0007\u0012\u001a\b\u0001\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/verticals/VerticalsWithBackgroundView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lkk31;", "Lnwy0;", "Lkotlin/Function2;", "", "Lob31;", "Lzy11;", "onVerticalClick", "Landroid/content/Context;", "context", "Lhf31;", "verticalNamesVisibilityRepository", "Lkb31;", "verticalHeaderBgLoader", "<init>", "(Lwls;Landroid/content/Context;Lhf31;Lkb31;)V", "oldItemsSize", "newItemsSize", "updateVerticalHeaderSelector", "(II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "verticals", "render", "(Ljava/util/List;)V", "position", "", "positionOffset", "updateHeaderState", "(IF)V", "smoothScrollToPosition", "(I)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "getVertical", "(I)Lob31;", "Lkb31;", "Ljb31;", "verticalsAdapter", "Ljb31;", "Lmb31;", "verticalHeaderDecoration", "Lmb31;", "Landroidx/recyclerview/widget/RecyclerView;", "verticalsView", "Landroidx/recyclerview/widget/RecyclerView;", "mk31", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerticalsWithBackgroundView extends GoFrameLayout implements kk31 {
    private final kb31 verticalHeaderBgLoader;
    private final mb31 verticalHeaderDecoration;
    private final jb31 verticalsAdapter;
    private final RecyclerView verticalsView;

    public VerticalsWithBackgroundView(wls wlsVar, Context context, hf31 hf31Var, kb31 kb31Var) {
        super(context, null, 0, 0, 14, null);
        this.verticalHeaderBgLoader = kb31Var;
        jb31 jb31Var = new jb31(new cp1(wlsVar, 19), hf31Var);
        this.verticalsAdapter = jb31Var;
        mb31 mb31Var = new mb31();
        this.verticalHeaderDecoration = mb31Var;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(tje.u(16, recyclerView.getContext()), tje.u(8, recyclerView.getContext()), tje.u(16, recyclerView.getContext()), tje.u(8, recyclerView.getContext()));
        recyclerView.setImportantForAccessibility(1);
        this.verticalsView = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(jb31Var);
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        positionLayoutManager.d0 = new el11(13, this);
        positionLayoutManager.e0 = hf31Var;
        recyclerView.setLayoutManager(positionLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(mb31Var);
        recyclerView.setAccessibilityDelegateCompat(new ib31(recyclerView));
        mb31Var.c = kb31Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oeq0 lambda$0$0$0(VerticalsWithBackgroundView verticalsWithBackgroundView, int i) {
        ob31 ob31Var = (ob31) a.S(i, verticalsWithBackgroundView.verticalsAdapter.c);
        return ob31Var != null ? ob31Var.d : leq0.a;
    }

    private final void updateVerticalHeaderSelector(int oldItemsSize, int newItemsSize) {
        boolean z = newItemsSize > 1;
        if (oldItemsSize != newItemsSize) {
            this.verticalsView.invalidateItemDecorations();
        }
        if ((getVisibility() == 0) == z) {
            return;
        }
        setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 verticalsAdapter$lambda$0(wls wlsVar, int i, ob31 ob31Var) {
        wlsVar.invoke(Integer.valueOf(i), ob31Var);
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.verticalHeaderDecoration.c = this.verticalHeaderBgLoader.a();
        this.verticalsView.setAdapter(this.verticalsAdapter);
    }

    @Override // defpackage.kk31
    public View asView() {
        return this;
    }

    @Override // defpackage.kk31
    public ob31 getVertical(int position) {
        return (ob31) a.S(position, this.verticalsAdapter.c);
    }

    @Override // defpackage.kk31
    public void render(List<ob31> verticals) {
        jb31 jb31Var = this.verticalsAdapter;
        if (jb31Var.c.isEmpty()) {
            jb31Var.c = verticals;
            jb31Var.notifyItemRangeInserted(0, verticals.size());
        } else {
            i f = kp50.f(new og20(jb31Var.c, verticals, new aub(22)), false);
            jb31Var.c = verticals;
            f.b(jb31Var);
        }
        Iterator<ob31> it = verticals.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().c) {
                break;
            } else {
                i++;
            }
        }
        updateHeaderState(i >= 0 ? i : 0, 0.0f);
        updateVerticalHeaderSelector(this.verticalsAdapter.c.size(), verticals.size());
    }

    @Override // defpackage.kk31
    public void smoothScrollToPosition(int position) {
        this.verticalsView.smoothScrollToPosition(position);
    }

    @Override // defpackage.kk31
    public void updateHeaderState(int position, float positionOffset) {
        mb31 mb31Var = this.verticalHeaderDecoration;
        mb31Var.a = position;
        mb31Var.b = positionOffset;
        smoothScrollToPosition(position);
        this.verticalsView.invalidate();
    }
}
