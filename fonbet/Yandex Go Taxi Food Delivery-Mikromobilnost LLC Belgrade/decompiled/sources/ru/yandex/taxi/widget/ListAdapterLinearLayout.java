package ru.yandex.taxi.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/widget/ListAdapterLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ListAdapter;", "adapter", "Lzy11;", "setAdapter", "(Landroid/widget/ListAdapter;)V", "getAdapter", "()Landroid/widget/ListAdapter;", "unregisterAdapter", "()V", "registerAdapter", "updateData", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/widget/AdapterView$OnItemClickListener;", "listener", "setOnItemClickListener", "(Landroid/widget/AdapterView$OnItemClickListener;)V", "Landroid/widget/ListAdapter;", "onItemClickListener", "Landroid/widget/AdapterView$OnItemClickListener;", "Landroid/database/DataSetObserver;", "observer", "Landroid/database/DataSetObserver;", "getObserver", "()Landroid/database/DataSetObserver;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ListAdapterLinearLayout extends LinearLayout implements View.OnClickListener {
    public static final int $stable = 8;
    private ListAdapter adapter;
    private final DataSetObserver observer;
    private AdapterView.OnItemClickListener onItemClickListener;

    public ListAdapterLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.observer = new DataSetObserver() { // from class: ru.yandex.taxi.widget.ListAdapterLinearLayout$observer$1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ListAdapterLinearLayout.this.updateData();
            }
        };
        setOrientation(1);
        setClickable(true);
    }

    public final ListAdapter getAdapter() {
        return this.adapter;
    }

    public DataSetObserver getObserver() {
        return this.observer;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        AdapterView.OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, v, v.getId(), 0L);
        }
    }

    public void registerAdapter() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(getObserver());
        }
    }

    public final void setAdapter(ListAdapter adapter) {
        unregisterAdapter();
        this.adapter = adapter;
        registerAdapter();
        updateData();
    }

    public final void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public void unregisterAdapter() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.unregisterDataSetObserver(getObserver());
        }
    }

    public void updateData() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter == null) {
            return;
        }
        int childCount = getChildCount();
        int count = listAdapter.getCount();
        for (int i = 0; i < count; i++) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                childAt = listAdapter.getView(i, null, this);
                addView(childAt);
            } else {
                View view = listAdapter.getView(i, childAt, this);
                if (!jl40.l(view, childAt)) {
                    removeViewAt(i);
                    addView(view, i);
                    childAt = view;
                }
            }
            childAt.setId(i);
            childAt.setOnClickListener(this);
        }
        if (childCount > count) {
            removeViews(count, childCount - count);
        }
    }

    public ListAdapterLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListAdapterLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListAdapterLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
