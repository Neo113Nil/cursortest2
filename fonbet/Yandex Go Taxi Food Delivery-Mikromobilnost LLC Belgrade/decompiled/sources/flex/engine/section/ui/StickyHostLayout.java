package flex.engine.section.ui;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import core.flex.ui.OrientationAwareRecyclerView;
import core.flex.ui.contentaware.ContentAwareFrameLayout;
import defpackage.gki0;
import defpackage.neu0;
import defpackage.wdu0;
import just.adapter.scroll.ScrollDirection;
import just.adapter.sticky.StickyViewController$SavedState;
import just.adapter.sticky.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lflex/engine/section/ui/StickyHostLayout;", "Lcore/flex/ui/contentaware/ContentAwareFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", ClidProvider.STATE, "Lzy11;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lwdu0;", "instanceStateDelegate", "Lwdu0;", "getInstanceStateDelegate", "()Lwdu0;", "setInstanceStateDelegate", "(Lwdu0;)V", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StickyHostLayout extends ContentAwareFrameLayout {
    private wdu0 instanceStateDelegate;

    public /* synthetic */ StickyHostLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public wdu0 getInstanceStateDelegate() {
        return this.instanceStateDelegate;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        wdu0 instanceStateDelegate = getInstanceStateDelegate();
        if (instanceStateDelegate == null) {
            super.onRestoreInstanceState(state);
            return;
        }
        a aVar = ((neu0) instanceStateDelegate).a;
        if (state instanceof StickyViewController$SavedState) {
            StickyViewController$SavedState stickyViewController$SavedState = (StickyViewController$SavedState) state;
            aVar.k = stickyViewController$SavedState.getRestoredFirstVisibleItemPosition();
            aVar.l = stickyViewController$SavedState.getRestoredLastVisibleItemPosition();
            aVar.c(ScrollDirection.IGNORE, 0);
            state = stickyViewController$SavedState.getSuperState();
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Pair pair;
        wdu0 instanceStateDelegate = getInstanceStateDelegate();
        if (instanceStateDelegate == null) {
            return super.onSaveInstanceState();
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        OrientationAwareRecyclerView orientationAwareRecyclerView = ((neu0) instanceStateDelegate).a.b;
        Object layoutManager = orientationAwareRecyclerView != null ? orientationAwareRecyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            pair = new Pair(Integer.valueOf(linearLayoutManager.K1()), Integer.valueOf(linearLayoutManager.M1()));
        } else {
            if (!(layoutManager instanceof gki0)) {
                return onSaveInstanceState;
            }
            gki0 gki0Var = (gki0) layoutManager;
            pair = new Pair(Integer.valueOf(gki0Var.a()), Integer.valueOf(gki0Var.b()));
        }
        return new StickyViewController$SavedState(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), onSaveInstanceState);
    }

    public void setInstanceStateDelegate(wdu0 wdu0Var) {
        this.instanceStateDelegate = wdu0Var;
    }

    public StickyHostLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StickyHostLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickyHostLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
