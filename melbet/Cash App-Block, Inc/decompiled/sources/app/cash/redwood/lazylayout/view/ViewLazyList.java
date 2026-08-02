package app.cash.redwood.lazylayout.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.Modifier;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$Binding;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$Edit;
import app.cash.redwood.lazylayout.widget.SparseList;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ViewLazyList implements Widget, ChangeListener {
    public final LazyContentItemListAdapter adapter;
    public int crossAxisAlignment;
    public final double density;
    public boolean isDoingProgrammaticScroll;
    public final AndroidSvg items;
    public final ViewLazyList$linearLayoutManager$1 linearLayoutManager;
    public Modifier modifier;
    public final CallResult placeholder;
    public final ViewLazyList$processor$1 processor;
    public final RecyclerView recyclerView;
    public final ViewLazyList$scrollProcessor$1 scrollProcessor;

    public final class LazyContentItemListAdapter extends RecyclerView.Adapter {
        public LazyContentItemListAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            ViewLazyList$processor$1 viewLazyList$processor$1 = ViewLazyList.this.processor;
            return viewLazyList$processor$1.itemsAfter.getSize() + viewLazyList$processor$1.loadedItems.size() + viewLazyList$processor$1.itemsBefore.getSize();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding;
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            viewHolder2.getClass();
            viewHolder2.itemView.getHeight();
            ViewLazyList$processor$1 viewLazyList$processor$1 = ViewLazyList.this.processor;
            viewLazyList$processor$1.getClass();
            ArrayList arrayList = viewLazyList$processor$1.loadedItems;
            SparseList sparseList = viewLazyList$processor$1.itemsBefore;
            if (i < sparseList.getSize()) {
                Object obj = sparseList.get(i);
                Object obj2 = obj;
                if (obj == null) {
                    LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding2 = new LazyListUpdateProcessor$Binding(viewLazyList$processor$1, true);
                    Widget takePlaceholder = viewLazyList$processor$1.takePlaceholder();
                    if (takePlaceholder != null) {
                        lazyListUpdateProcessor$Binding2.setContent$redwood_lazylayout_widget(takePlaceholder);
                    }
                    sparseList.removeAt(i);
                    sparseList.add(i, lazyListUpdateProcessor$Binding2);
                    obj2 = lazyListUpdateProcessor$Binding2;
                }
                lazyListUpdateProcessor$Binding = (LazyListUpdateProcessor$Binding) obj2;
            } else {
                if (i < arrayList.size() + sparseList.getSize()) {
                    lazyListUpdateProcessor$Binding = (LazyListUpdateProcessor$Binding) arrayList.get(i - sparseList.getSize());
                } else {
                    SparseList sparseList2 = viewLazyList$processor$1.itemsAfter;
                    int size = (i - sparseList.getSize()) - arrayList.size();
                    Object obj3 = sparseList2.get(size);
                    Object obj4 = obj3;
                    if (obj3 == null) {
                        LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding3 = new LazyListUpdateProcessor$Binding(viewLazyList$processor$1, true);
                        Widget takePlaceholder2 = viewLazyList$processor$1.takePlaceholder();
                        if (takePlaceholder2 != null) {
                            lazyListUpdateProcessor$Binding3.setContent$redwood_lazylayout_widget(takePlaceholder2);
                        }
                        sparseList2.removeAt(size);
                        sparseList2.add(size, lazyListUpdateProcessor$Binding3);
                        obj4 = lazyListUpdateProcessor$Binding3;
                    }
                    lazyListUpdateProcessor$Binding = (LazyListUpdateProcessor$Binding) obj4;
                }
            }
            ViewLazyList$processor$1 viewLazyList$processor$12 = lazyListUpdateProcessor$Binding.processor;
            if (lazyListUpdateProcessor$Binding.view != null) {
                a$$ExternalSyntheticBUOutline0.m$3("already bound");
                return;
            }
            if (lazyListUpdateProcessor$Binding.isPlaceholder && lazyListUpdateProcessor$Binding.content == null) {
                lazyListUpdateProcessor$Binding.content = viewLazyList$processor$12.takePlaceholder();
            }
            lazyListUpdateProcessor$Binding.view = viewHolder2;
            Widget widget = lazyListUpdateProcessor$Binding.content;
            viewLazyList$processor$12.getClass();
            ViewLazyList$processor$1.setContent(viewHolder2, widget);
            viewHolder2.binding = lazyListUpdateProcessor$Binding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            viewGroup.getClass();
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) viewGroup).mLayout;
            layoutManager.getClass();
            frameLayout.setLayoutParams(layoutManager.generateDefaultLayoutParams());
            return ViewLazyList.this.new ViewHolder(frameLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            viewHolder2.getClass();
            LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding = viewHolder2.binding;
            if (lazyListUpdateProcessor$Binding != null) {
                lazyListUpdateProcessor$Binding.unbind();
            }
            viewHolder2.binding = null;
        }
    }

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public LazyListUpdateProcessor$Binding binding;
        public final FrameLayout container;
        public View content;

        public ViewHolder(FrameLayout frameLayout) {
            super(frameLayout);
            this.container = frameLayout;
        }
    }

    public ViewLazyList(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        this.recyclerView = recyclerView;
        this.adapter = new LazyContentItemListAdapter();
        this.modifier = Modifier.Companion.$$INSTANCE;
        CrossAxisAlignment.Companion.getClass();
        this.crossAxisAlignment = 0;
        Resources resources = recyclerView.getContext().getResources();
        resources.getClass();
        this.density = DensityKt.Density(resources);
        ViewLazyList$linearLayoutManager$1 viewLazyList$linearLayoutManager$1 = new ViewLazyList$linearLayoutManager$1(recyclerView.getContext());
        this.linearLayoutManager = viewLazyList$linearLayoutManager$1;
        ViewLazyList$processor$1 viewLazyList$processor$1 = new ViewLazyList$processor$1(this);
        this.processor = viewLazyList$processor$1;
        this.scrollProcessor = new ViewLazyList$scrollProcessor$1(this);
        this.items = viewLazyList$processor$1.items;
        this.placeholder = viewLazyList$processor$1.placeholder;
        recyclerView.setLayoutManager(viewLazyList$linearLayoutManager$1);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i = 1;
        RecyclerView.RecycledViewPool.ScrapData scrapDataForType = recyclerView.mRecycler.getRecycledViewPool().getScrapDataForType(1);
        scrapDataForType.mMaxScrap = 30;
        ArrayList arrayList = scrapDataForType.mScrapHeap;
        while (arrayList.size() > 30) {
            arrayList.remove(arrayList.size() - 1);
        }
        recyclerView.addOnScrollListener(new FastScroller.AnonymousClass2(this, i));
        this.recyclerView.setAdapter(this.adapter);
    }

    public final FrameLayout.LayoutParams createLayoutParams() {
        int i = this.crossAxisAlignment;
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        companion.getClass();
        FrameLayout.LayoutParams layoutParams = i == 3 ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        int i2 = this.crossAxisAlignment;
        companion.getClass();
        int i3 = 8388611;
        if (i2 != 0) {
            companion.getClass();
            if (i2 == 1) {
                i3 = 17;
            } else {
                companion.getClass();
                if (i2 == 2) {
                    i3 = 8388613;
                } else {
                    companion.getClass();
                    if (i2 != 3) {
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return null;
                    }
                }
            }
        }
        layoutParams.gravity = i3;
        return layoutParams;
    }

    /* renamed from: crossAxisAlignment-njEs0f8, reason: not valid java name */
    public final void m1365crossAxisAlignmentnjEs0f8(int i) {
        View view;
        this.crossAxisAlignment = i;
        ViewLazyList$processor$1 viewLazyList$processor$1 = this.processor;
        Iterator it = CollectionsKt.plus((Iterable) CollectionsKt.toList(viewLazyList$processor$1.itemsAfter.elements), (Collection) CollectionsKt.plus((Iterable) viewLazyList$processor$1.loadedItems, (Collection) CollectionsKt.toList(viewLazyList$processor$1.itemsBefore.elements))).iterator();
        while (it.hasNext()) {
            ViewHolder viewHolder = ((LazyListUpdateProcessor$Binding) it.next()).view;
            if (viewHolder != null && (view = viewHolder.content) != null) {
                view.setLayoutParams(createLayoutParams());
            }
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.recyclerView;
    }

    /* renamed from: height-DyLkt4w, reason: not valid java name */
    public final void m1366heightDyLkt4w(int i) {
        RecyclerView recyclerView = this.recyclerView;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        Constraint.Companion.getClass();
        layoutParams.height = i == 1 ? -1 : -2;
        recyclerView.setLayoutParams(layoutParams);
    }

    public final void margin(Margin margin) {
        margin.getClass();
        double d = margin.start;
        double d2 = this.density;
        this.recyclerView.setPaddingRelative(Density.m1402toPxIntmnpKzHI(d2, d), Density.m1402toPxIntmnpKzHI(d2, margin.top), Density.m1402toPxIntmnpKzHI(d2, margin.end), Density.m1402toPxIntmnpKzHI(d2, margin.bottom));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    @Override // app.cash.redwood.widget.ChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onEndChanges() {
        boolean z;
        LazyListUpdateProcessor$Edit.Remove remove;
        LazyListUpdateProcessor$Edit.Insert insert;
        int i;
        ViewLazyList$processor$1 viewLazyList$processor$1 = this.processor;
        ArrayList arrayList = viewLazyList$processor$1.loadedItems;
        ViewLazyList viewLazyList = viewLazyList$processor$1.this$0;
        SparseList sparseList = viewLazyList$processor$1.itemsAfter;
        SparseList sparseList2 = viewLazyList$processor$1.itemsBefore;
        ArrayList arrayList2 = viewLazyList$processor$1.edits;
        int i2 = 1;
        int size = arrayList2.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            LazyListUpdateProcessor$Edit lazyListUpdateProcessor$Edit = (LazyListUpdateProcessor$Edit) arrayList2.get(i3);
            int i4 = i3 + 1;
            LazyListUpdateProcessor$Edit lazyListUpdateProcessor$Edit2 = (LazyListUpdateProcessor$Edit) arrayList2.get(i4);
            if ((lazyListUpdateProcessor$Edit instanceof LazyListUpdateProcessor$Edit.Insert) && (lazyListUpdateProcessor$Edit2 instanceof LazyListUpdateProcessor$Edit.Remove)) {
                LazyListUpdateProcessor$Edit.Remove remove2 = (LazyListUpdateProcessor$Edit.Remove) lazyListUpdateProcessor$Edit2;
                int i5 = remove2.index;
                i = i2;
                LazyListUpdateProcessor$Edit.Insert insert2 = (LazyListUpdateProcessor$Edit.Insert) lazyListUpdateProcessor$Edit;
                ArrayList arrayList3 = insert2.widgets;
                if (i5 >= arrayList3.size() + insert2.index) {
                    remove2.index -= arrayList3.size();
                    arrayList2.set(i3, lazyListUpdateProcessor$Edit2);
                    arrayList2.set(i4, lazyListUpdateProcessor$Edit);
                }
            } else {
                i = i2;
            }
            i3 = i4;
            i2 = i;
        }
        int i6 = i2;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            LazyListUpdateProcessor$Edit lazyListUpdateProcessor$Edit3 = (LazyListUpdateProcessor$Edit) arrayList2.get(i7);
            if (viewLazyList$processor$1.newItemsBefore < sparseList2.getSize() && (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Insert)) {
                LazyListUpdateProcessor$Edit.Insert insert3 = (LazyListUpdateProcessor$Edit.Insert) lazyListUpdateProcessor$Edit3;
                ArrayList arrayList4 = insert3.widgets;
                if (insert3.index == 0) {
                    viewLazyList$processor$1.maybeShiftLoadedWindow(arrayList4.size());
                    int min = Math.min(arrayList4.size(), sparseList2.getSize() - viewLazyList$processor$1.newItemsBefore);
                    int size3 = arrayList4.size() - 1;
                    int size4 = arrayList4.size() - min;
                    if (size4 <= size3) {
                        while (true) {
                            arrayList.add(0, viewLazyList$processor$1.placeholderToLoaded((LazyListUpdateProcessor$Binding) sparseList2.removeLast(), (Widget) arrayList4.get(size3)));
                            arrayList4.remove(size3);
                            if (size3 == size4) {
                                break;
                            } else {
                                size3--;
                            }
                        }
                    }
                    if (viewLazyList$processor$1.newItemsAfter < sparseList.getSize() && (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Insert)) {
                        insert = (LazyListUpdateProcessor$Edit.Insert) lazyListUpdateProcessor$Edit3;
                        ArrayList arrayList5 = insert.widgets;
                        if (insert.index == arrayList.size()) {
                            viewLazyList$processor$1.maybeShiftLoadedWindow(arrayList.size() + viewLazyList$processor$1.newItemsBefore);
                            int min2 = Math.min(arrayList5.size(), sparseList.getSize() - viewLazyList$processor$1.newItemsAfter);
                            for (int i8 = 0; i8 < min2; i8++) {
                                arrayList.add(viewLazyList$processor$1.placeholderToLoaded((LazyListUpdateProcessor$Binding) sparseList.removeAt(0), (Widget) CollectionsKt__MutableCollectionsKt.removeFirst(arrayList5)));
                                insert.index++;
                            }
                            if (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Insert) {
                                LazyListUpdateProcessor$Edit.Insert insert4 = (LazyListUpdateProcessor$Edit.Insert) lazyListUpdateProcessor$Edit3;
                                ArrayList arrayList6 = insert4.widgets;
                                int size5 = arrayList6.size();
                                int i9 = 0;
                                while (i9 < size5) {
                                    int size6 = sparseList2.getSize() + insert4.index + i9;
                                    LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding = new LazyListUpdateProcessor$Binding(viewLazyList$processor$1, false);
                                    lazyListUpdateProcessor$Binding.setContent$redwood_lazylayout_widget((Widget) arrayList6.get(i9));
                                    arrayList.add(insert4.index + i9, lazyListUpdateProcessor$Binding);
                                    viewLazyList.adapter.notifyItemRangeInserted(size6, i6);
                                    i9++;
                                    i6 = 1;
                                }
                            } else {
                                if (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Move) {
                                    a$$ExternalSyntheticBUOutline0.m$1("move unsupported!");
                                    return;
                                }
                                if (!(lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Remove)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                LazyListUpdateProcessor$Edit.Remove remove3 = (LazyListUpdateProcessor$Edit.Remove) lazyListUpdateProcessor$Edit3;
                                int i10 = remove3.index;
                                int i11 = remove3.count + i10;
                                while (i10 < i11) {
                                    int size7 = sparseList2.getSize();
                                    int i12 = remove3.index;
                                    ((LazyListUpdateProcessor$Binding) arrayList.remove(i12)).unbind();
                                    viewLazyList.adapter.notifyItemRangeRemoved(size7 + i12, 1);
                                    i10++;
                                }
                            }
                            i7++;
                            i6 = 1;
                        }
                    }
                    if (viewLazyList$processor$1.newItemsAfter > sparseList.getSize() && (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Remove)) {
                        remove = (LazyListUpdateProcessor$Edit.Remove) lazyListUpdateProcessor$Edit3;
                        if (remove.index + remove.count == arrayList.size()) {
                            int min3 = Math.min(remove.count, viewLazyList$processor$1.newItemsAfter - sparseList.getSize());
                            int i13 = remove.count;
                            int i14 = i13 - 1;
                            int i15 = i13 - min3;
                            if (i15 <= i14) {
                                while (true) {
                                    sparseList.add(0, ViewLazyList$processor$1.loadedToPlaceholder((LazyListUpdateProcessor$Binding) CollectionsKt__MutableCollectionsKt.removeLast(arrayList)));
                                    remove.count--;
                                    if (i14 == i15) {
                                        break;
                                    } else {
                                        i14--;
                                    }
                                }
                            }
                        }
                    }
                    if (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Insert) {
                    }
                    i7++;
                    i6 = 1;
                }
            }
            if (viewLazyList$processor$1.newItemsBefore > sparseList2.getSize() && (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Remove)) {
                LazyListUpdateProcessor$Edit.Remove remove4 = (LazyListUpdateProcessor$Edit.Remove) lazyListUpdateProcessor$Edit3;
                if (remove4.index == 0) {
                    int min4 = Math.min(remove4.count, viewLazyList$processor$1.newItemsBefore - sparseList2.getSize());
                    for (int i16 = 0; i16 < min4; i16++) {
                        LazyListUpdateProcessor$Binding loadedToPlaceholder = ViewLazyList$processor$1.loadedToPlaceholder((LazyListUpdateProcessor$Binding) arrayList.remove(0));
                        ArrayList arrayList7 = sparseList2.externalIndexes;
                        if (loadedToPlaceholder != null) {
                            sparseList2.elements.add(loadedToPlaceholder);
                            arrayList7.add(Integer.valueOf(((Number) CollectionsKt.last((List) arrayList7)).intValue() + 1));
                        } else {
                            int size8 = arrayList7.size() - 1;
                            arrayList7.set(size8, Integer.valueOf(((Number) arrayList7.get(size8)).intValue() + 1));
                        }
                        remove4.count--;
                    }
                }
            }
            if (viewLazyList$processor$1.newItemsAfter < sparseList.getSize()) {
                insert = (LazyListUpdateProcessor$Edit.Insert) lazyListUpdateProcessor$Edit3;
                ArrayList arrayList52 = insert.widgets;
                if (insert.index == arrayList.size()) {
                }
            }
            if (viewLazyList$processor$1.newItemsAfter > sparseList.getSize()) {
                remove = (LazyListUpdateProcessor$Edit.Remove) lazyListUpdateProcessor$Edit3;
                if (remove.index + remove.count == arrayList.size()) {
                }
            }
            if (lazyListUpdateProcessor$Edit3 instanceof LazyListUpdateProcessor$Edit.Insert) {
            }
            i7++;
            i6 = 1;
        }
        if (viewLazyList$processor$1.newItemsBefore < sparseList2.getSize()) {
            int size9 = sparseList2.getSize() - viewLazyList$processor$1.newItemsBefore;
            sparseList2.removeRange(0, size9);
            viewLazyList.adapter.notifyItemRangeRemoved(0, size9);
        } else if (viewLazyList$processor$1.newItemsBefore > sparseList2.getSize()) {
            int size10 = viewLazyList$processor$1.newItemsBefore - sparseList2.getSize();
            sparseList2.addNulls(0, size10);
            viewLazyList.adapter.notifyItemRangeInserted(0, size10);
        }
        if (viewLazyList$processor$1.newItemsAfter < sparseList.getSize()) {
            int size11 = sparseList.getSize() - viewLazyList$processor$1.newItemsAfter;
            int size12 = (sparseList.getSize() + (arrayList.size() + sparseList2.getSize())) - size11;
            sparseList.removeRange(sparseList.getSize() - size11, sparseList.getSize());
            viewLazyList.adapter.notifyItemRangeRemoved(size12, size11);
        } else if (viewLazyList$processor$1.newItemsAfter > sparseList.getSize()) {
            int size13 = viewLazyList$processor$1.newItemsAfter - sparseList.getSize();
            int size14 = sparseList.getSize() + arrayList.size() + sparseList2.getSize();
            sparseList.addNulls(sparseList.getSize(), size13);
            viewLazyList.adapter.notifyItemRangeInserted(size14, size13);
        }
        arrayList2.clear();
        ViewLazyList$scrollProcessor$1 viewLazyList$scrollProcessor$1 = this.scrollProcessor;
        ViewLazyList viewLazyList2 = viewLazyList$scrollProcessor$1.this$0;
        if (viewLazyList$scrollProcessor$1.deferredProgrammaticScrollIndex == -1) {
            return;
        }
        ViewLazyList$processor$1 viewLazyList$processor$12 = viewLazyList2.processor;
        int size15 = viewLazyList$processor$12.itemsAfter.getSize() + viewLazyList$processor$12.loadedItems.size() + viewLazyList$processor$12.itemsBefore.getSize();
        int i17 = viewLazyList$scrollProcessor$1.deferredProgrammaticScrollIndex;
        if (size15 <= i17) {
            return;
        }
        boolean z2 = viewLazyList$scrollProcessor$1.deferredProgrammaticScrollAnimated;
        viewLazyList2.isDoingProgrammaticScroll = z2;
        ViewLazyList$linearLayoutManager$1 viewLazyList$linearLayoutManager$1 = viewLazyList2.linearLayoutManager;
        if (z2) {
            CarouselLayoutManager.AnonymousClass1 anonymousClass1 = new CarouselLayoutManager.AnonymousClass1(viewLazyList2.recyclerView.getContext(), 1);
            anonymousClass1.mTargetPosition = i17;
            viewLazyList$linearLayoutManager$1.startSmoothScroll(anonymousClass1);
            z = false;
        } else {
            z = false;
            viewLazyList$linearLayoutManager$1.scrollToPositionWithOffset(i17, 0);
        }
        viewLazyList$scrollProcessor$1.deferredProgrammaticScrollIndex = -1;
        viewLazyList$scrollProcessor$1.deferredProgrammaticScrollAnimated = z;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }

    /* renamed from: width-DyLkt4w, reason: not valid java name */
    public final void m1367widthDyLkt4w(int i) {
        RecyclerView recyclerView = this.recyclerView;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        Constraint.Companion.getClass();
        layoutParams.width = i == 1 ? -1 : -2;
        recyclerView.setLayoutParams(layoutParams);
    }
}
