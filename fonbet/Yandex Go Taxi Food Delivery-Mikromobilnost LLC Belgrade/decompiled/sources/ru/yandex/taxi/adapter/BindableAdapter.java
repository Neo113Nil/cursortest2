package ru.yandex.taxi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0010J)\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J'\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/adapter/BindableAdapter;", "T", "Landroid/widget/BaseAdapter;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "position", "getItem", "(I)Ljava/lang/Object;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/view/LayoutInflater;", "inflater", "newView", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroid/view/View;", "item", "Lzy11;", "bindView", "(Ljava/lang/Object;ILandroid/view/View;)V", "getDropDownView", "newDropDownView", "bindDropDownView", "Landroid/view/LayoutInflater;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BindableAdapter<T> extends BaseAdapter {
    public static final int $stable = 8;
    private final LayoutInflater inflater;

    public BindableAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void bindDropDownView(T item, int position, View view) {
        bindView(item, position, view);
    }

    public abstract void bindView(T item, int position, View view);

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int position, View view, ViewGroup container) {
        if (view == null && (view = newDropDownView(this.inflater, position, container)) == null) {
            ny61.r("newDropDownView result must not be null");
            return null;
        }
        bindDropDownView(getItem(position), position, view);
        return view;
    }

    @Override // android.widget.Adapter
    public abstract T getItem(int position);

    @Override // android.widget.Adapter
    public final View getView(int position, View view, ViewGroup container) {
        if (view == null && (view = newView(this.inflater, position, container)) == null) {
            ny61.r("newView result must not be null");
            return null;
        }
        bindView(getItem(position), position, view);
        return view;
    }

    public View newDropDownView(LayoutInflater inflater, int position, ViewGroup container) {
        return newView(inflater, position, container);
    }

    public abstract View newView(LayoutInflater inflater, int position, ViewGroup container);
}
