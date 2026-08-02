package ru.yandex.taxi.stories.presentation.preview;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cnu0;
import defpackage.dnu0;
import defpackage.enu0;
import defpackage.fnu0;
import defpackage.gnu0;
import defpackage.jl40;
import defpackage.l7s0;
import defpackage.mrg0;
import defpackage.oe7;
import defpackage.pav;
import defpackage.qzx;
import defpackage.rpu0;
import defpackage.sn1;
import defpackage.tcc;
import defpackage.tls;
import defpackage.wls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0014¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u001cH\u0014¢\u0006\u0004\b(\u0010\u001eJ\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b/\u00100J)\u00103\u001a\u00020\u001c2\u001a\u00102\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u000101¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR*\u0010C\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/stories/presentation/preview/StoriesPreviewsListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Lgnu0;", "storiesProxy", "", "storyPreviewLayoutRes", "overrideStoryPreviewHeightPx", "overrideStoryPreviewWidthPx", "Lpav;", "imageLoader", "Lru/yandex/taxi/widget/c;", "converter", "Lru/yandex/taxi/stories/presentation/preview/StoriesPreviewsListViewType;", "storiesPreviewsListViewType", "<init>", "(Landroid/content/Context;Lgnu0;ILjava/lang/Integer;Ljava/lang/Integer;Lpav;Lru/yandex/taxi/widget/c;Lru/yandex/taxi/stories/presentation/preview/StoriesPreviewsListViewType;)V", "position", "", "isItemCompletelyVisible", "(I)Z", "", "Lrpu0;", "stories", "newStories", "preserveStoriesOrder", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lzy11;", "scrollToOpenedStory", "()V", "storyIndex", "Landroid/graphics/Rect;", "storyViewScreenBounds", "(I)Landroid/graphics/Rect;", "", "id", "onStoryClicked", "(Ljava/lang/String;)V", "onAttachedToWindow", "onDetachedFromWindow", "getCompletelyVisibleIds", "()Ljava/util/List;", "Ldnu0;", "delegate", "setUiDelegate", "(Ldnu0;)V", "setStories", "(Ljava/util/List;)V", "Lkotlin/Function1;", "listener", "setStoriesChangedListener", "(Ltls;)V", "Ljava/lang/Runnable;", "setLayoutCompleteListener", "(Ljava/lang/Runnable;)V", "Lgnu0;", "lastStories", "Ljava/util/List;", "Lcnu0;", "adapter", "Lcnu0;", "uiDelegate", "Ldnu0;", "Lfnu0;", "storyCardDelegate", "Lfnu0;", "storiesChangedListener", "Ltls;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoriesPreviewsListView extends RecyclerView {
    private final cnu0 adapter;
    private List<rpu0> lastStories;
    private tls storiesChangedListener;
    private final gnu0 storiesProxy;
    private fnu0 storyCardDelegate;
    private dnu0 uiDelegate;

    public StoriesPreviewsListView(Context context, gnu0 gnu0Var, int i, Integer num, Integer num2, pav pavVar, c cVar, StoriesPreviewsListViewType storiesPreviewsListViewType) {
        super(context);
        this.storiesProxy = gnu0Var;
        this.lastStories = EmptyList.a;
        setPadding(getResources().getDimensionPixelSize(mrg0.stories_left_padding), 0, getResources().getDimensionPixelSize(mrg0.stories_right_padding), 0);
        setClipToPadding(false);
        setClipChildren(false);
        setNestedScrollingEnabled(false);
        setLayoutManager(storiesPreviewsListViewType == StoriesPreviewsListViewType.GRID_TWO_COLUMN ? new GridStoriesPreviewsLinearLayoutManager(context, 2) : new StoriesPreviewsLinearLayoutManager(context, 0, false));
        cnu0 cnu0Var = new cnu0(i, num, num2, pavVar, cVar);
        this.adapter = cnu0Var;
        setAdapter(cnu0Var);
        cnu0Var.z = new l7s0(this);
    }

    private final boolean isItemCompletelyVisible(int position) {
        View X;
        RecyclerView.e layoutManager = getLayoutManager();
        return (layoutManager == null || (X = layoutManager.X(position)) == null || Math.min(getWidth(), X.getRight()) - Math.max(0, X.getLeft()) != X.getWidth()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStoryClicked(String id) {
        List<rpu0> list = this.lastStories;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rpu0) it.next()).a);
        }
        dnu0 dnu0Var = this.uiDelegate;
        if (dnu0Var != null) {
            dnu0Var.d(id, arrayList);
        }
    }

    private final List<rpu0> preserveStoriesOrder(List<rpu0> stories, List<rpu0> newStories) {
        if (!stories.containsAll(newStories) || !newStories.containsAll(stories)) {
            return newStories;
        }
        int i = 11;
        return kotlin.collections.a.x0(newStories, new oe7(i, new sn1(stories, i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int preserveStoriesOrder$lambda$0(List list, rpu0 rpu0Var, rpu0 rpu0Var2) {
        return jl40.q(list.indexOf(rpu0Var), list.indexOf(rpu0Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int preserveStoriesOrder$lambda$1(wls wlsVar, Object obj, Object obj2) {
        return ((Number) wlsVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToOpenedStory() {
        int f;
        cnu0 cnu0Var = this.adapter;
        String str = cnu0Var.A;
        if (str != null && (f = cnu0Var.f(str)) >= 0) {
            scrollToPosition(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect storyViewScreenBounds(int storyIndex) {
        View X;
        RecyclerView.e layoutManager = getLayoutManager();
        if (layoutManager == null || (X = layoutManager.X(storyIndex)) == null) {
            return null;
        }
        int[] iArr = new int[2];
        X.getLocationOnScreen(iArr);
        int scaleX = (int) (X.getScaleX() * X.getWidth());
        int scaleY = (int) (X.getScaleY() * X.getHeight());
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, scaleX + i, scaleY + i2);
    }

    public final List<String> getCompletelyVisibleIds() {
        ArrayList arrayList = new ArrayList();
        int size = this.adapter.x.size();
        for (int i = 0; i < size; i++) {
            if (isItemCompletelyVisible(i)) {
                arrayList.add(this.lastStories.get(i).a);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        enu0 enu0Var = new enu0(this);
        this.storyCardDelegate = enu0Var;
        gnu0 gnu0Var = this.storiesProxy;
        gnu0Var.c.add(enu0Var);
        String str = gnu0Var.b;
        if (str != null) {
            enu0Var.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fnu0 fnu0Var = this.storyCardDelegate;
        if (fnu0Var != null) {
            this.storiesProxy.c.remove(fnu0Var);
        }
    }

    public final void setLayoutCompleteListener(Runnable listener) {
        Object layoutManager = getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof qzx)) {
            ((qzx) layoutManager).p(listener);
        }
    }

    public final void setStories(List<rpu0> stories) {
        List<rpu0> preserveStoriesOrder = preserveStoriesOrder(this.lastStories, stories);
        tls tlsVar = this.storiesChangedListener;
        if (tlsVar != null) {
            tlsVar.invoke(preserveStoriesOrder);
        }
        cnu0 cnu0Var = this.adapter;
        cnu0Var.x = preserveStoriesOrder;
        cnu0Var.notifyDataSetChanged();
        this.lastStories = preserveStoriesOrder;
        scrollToOpenedStory();
    }

    public final void setStoriesChangedListener(tls listener) {
        this.storiesChangedListener = listener;
        if (listener != null) {
            listener.invoke(this.lastStories);
        }
    }

    public final void setUiDelegate(dnu0 delegate) {
        this.uiDelegate = delegate;
    }

    public StoriesPreviewsListView(Context context, gnu0 gnu0Var, int i, Integer num, Integer num2, pav pavVar, c cVar) {
        this(context, gnu0Var, i, num, num2, pavVar, cVar, null, 128, null);
    }

    public /* synthetic */ StoriesPreviewsListView(Context context, gnu0 gnu0Var, int i, Integer num, Integer num2, pav pavVar, c cVar, StoriesPreviewsListViewType storiesPreviewsListViewType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, gnu0Var, i, num, num2, pavVar, cVar, (i2 & 128) != 0 ? StoriesPreviewsListViewType.LINEAR : storiesPreviewsListViewType);
    }
}
