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

    /* renamed from: e, reason: collision with root package name */
    public boolean f44e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45f;

    /* renamed from: g, reason: collision with root package name */
    public Cursor f46g;

    /* renamed from: h, reason: collision with root package name */
    public Context f47h;

    /* renamed from: i, reason: collision with root package name */
    public int f48i;

    /* renamed from: j, reason: collision with root package name */
    public a f49j;

    /* renamed from: k, reason: collision with root package name */
    public b f50k;

    /* renamed from: l, reason: collision with root package name */
    public d f51l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f46g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f49j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f50k;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f46g = cursor;
            if (cursor != null) {
                a aVar2 = this.f49j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f50k;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f48i = cursor.getColumnIndexOrThrow("_id");
                this.f44e = true;
                notifyDataSetChanged();
            } else {
                this.f48i = -1;
                this.f44e = false;
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
        if (!this.f44e || (cursor = this.f46g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f44e) {
            return null;
        }
        this.f46g.moveToPosition(i2);
        if (view == null) {
            f0 f0Var = (f0) this;
            view = f0Var.f2175o.inflate(f0Var.f2174n, viewGroup, false);
        }
        a(view, this.f46g);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f51l == null) {
            d dVar = new d();
            dVar.f52a = this;
            this.f51l = dVar;
        }
        return this.f51l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f44e || (cursor = this.f46g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f46g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f44e && (cursor = this.f46g) != null && cursor.moveToPosition(i2)) {
            return this.f46g.getLong(this.f48i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f44e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f46g.moveToPosition(i2)) {
            throw new IllegalStateException(h.e("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f46g);
        return view;
    }
}
