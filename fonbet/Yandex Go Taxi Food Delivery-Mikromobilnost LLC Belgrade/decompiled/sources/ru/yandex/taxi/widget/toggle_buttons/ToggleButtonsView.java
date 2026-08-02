package ru.yandex.taxi.widget.toggle_buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.agh0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.ikz0;
import defpackage.jhu0;
import defpackage.jkz0;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.pkz0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.zrh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0019\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/yandex/taxi/widget/toggle_buttons/ToggleButtonsView;", "Lpkz0;", "T", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "fitButtonsWidth", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "position", "Lzy11;", "scrollToItem", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "models", "setModelsGroup", "(Ljava/util/List;)V", "Ljkz0;", "listener", "setButtonToggledListener", "(Ljkz0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Likz0;", "adapter", "Likz0;", "getAdapter", "()Likz0;", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "layoutManager", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "getLayoutManager", "()Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "buttonToggledListener", "Ljkz0;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Ll8x;", "scrollToItemJob", "Ll8x;", "onceUpdated", "Z", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ToggleButtonsView<T extends pkz0> extends DividerAwareComponent {
    public static final int $stable = 8;
    private final ikz0 adapter;
    private jkz0 buttonToggledListener;
    private final PositionLayoutManager layoutManager;
    private boolean onceUpdated;
    private final RecyclerView recyclerView;
    private final hbp0 scopeDelegate;
    private l8x scrollToItemJob;

    public ToggleButtonsView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        c.q(this, zrh0.toggle_buttons_view, true);
        int i2 = agh0.buttons_list;
        WeakHashMap weakHashMap = b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, i2));
        this.recyclerView = recyclerView;
        ikz0 ikz0Var = new ikz0(z);
        this.adapter = ikz0Var;
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        this.layoutManager = positionLayoutManager;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
        ikz0Var.setHasStableIds(true);
        ikz0Var.c = new jhu0(this);
        recyclerView.setLayoutManager(positionLayoutManager);
        recyclerView.setAdapter(ikz0Var);
        recyclerView.setItemAnimator(null);
    }

    private final void scrollToItem(int position) {
        l8x l8xVar = this.scrollToItemJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (this.recyclerView.isComputingLayout()) {
            this.scrollToItemJob = tje.N(this.scopeDelegate.c(), null, null, new ToggleButtonsView$scrollToItem$1(this, position, null), 3);
        } else if (this.onceUpdated) {
            this.recyclerView.smoothScrollToPosition(position);
        } else {
            this.onceUpdated = true;
            this.recyclerView.scrollToPosition(position);
        }
    }

    public final ikz0 getAdapter() {
        return this.adapter;
    }

    public final PositionLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.scrollToItemJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.scopeDelegate.b();
    }

    public final void setButtonToggledListener(jkz0 listener) {
        this.buttonToggledListener = listener;
    }

    public final void setModelsGroup(List<? extends T> models) {
        if (jl40.l(models, this.adapter.b)) {
            return;
        }
        ikz0 ikz0Var = this.adapter;
        ikz0Var.b.clear();
        ikz0Var.b = new ArrayList(models);
        ikz0Var.notifyDataSetChanged();
        Iterator<? extends T> it = models.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().b) {
                break;
            } else {
                i++;
            }
        }
        scrollToItem(i);
    }

    public ToggleButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
    }

    public ToggleButtonsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
    }

    public ToggleButtonsView(Context context) {
        this(context, null, 0, false, 14, null);
    }

    public /* synthetic */ ToggleButtonsView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
