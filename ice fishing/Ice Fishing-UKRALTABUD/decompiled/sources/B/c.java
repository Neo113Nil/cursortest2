package B;

import E0.h;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import h.f0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f44f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45g;

    /* renamed from: h, reason: collision with root package name */
    public Cursor f46h;

    /* renamed from: i, reason: collision with root package name */
    public Context f47i;

    /* renamed from: j, reason: collision with root package name */
    public int f48j;

    /* renamed from: k, reason: collision with root package name */
    public a f49k;

    /* renamed from: l, reason: collision with root package name */
    public b f50l;

    /* renamed from: m, reason: collision with root package name */
    public d f51m;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f46h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f49k;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f50l;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f46h = cursor;
            if (cursor != null) {
                a aVar2 = this.f49k;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f50l;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f48j = cursor.getColumnIndexOrThrow("_id");
                this.f44f = true;
                notifyDataSetChanged();
            } else {
                this.f48j = -1;
                this.f44f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f44f || (cursor = this.f46h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f44f) {
            return null;
        }
        this.f46h.moveToPosition(i2);
        if (view == null) {
            f0 f0Var = (f0) this;
            view = f0Var.f2168p.inflate(f0Var.f2167o, viewGroup, false);
        }
        a(view, this.f46h);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f51m == null) {
            d dVar = new d();
            dVar.f52a = this;
            this.f51m = dVar;
        }
        return this.f51m;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f44f || (cursor = this.f46h) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f46h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f44f && (cursor = this.f46h) != null && cursor.moveToPosition(i2)) {
            return this.f46h.getLong(this.f48j);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f44f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f46h.moveToPosition(i2)) {
            throw new IllegalStateException(h.e("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f46h);
        return view;
    }
}
