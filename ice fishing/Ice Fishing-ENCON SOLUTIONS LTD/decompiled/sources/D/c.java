package D;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import h.d0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f201a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f202b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f203c;

    /* renamed from: d, reason: collision with root package name */
    public Context f204d;

    /* renamed from: e, reason: collision with root package name */
    public int f205e;

    /* renamed from: f, reason: collision with root package name */
    public a f206f;

    /* renamed from: g, reason: collision with root package name */
    public b f207g;

    /* renamed from: h, reason: collision with root package name */
    public d f208h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f203c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f206f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f207g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f203c = cursor;
            if (cursor != null) {
                a aVar2 = this.f206f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f207g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f205e = cursor.getColumnIndexOrThrow("_id");
                this.f201a = true;
                notifyDataSetChanged();
            } else {
                this.f205e = -1;
                this.f201a = false;
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
        if (!this.f201a || (cursor = this.f203c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f201a) {
            return null;
        }
        this.f203c.moveToPosition(i2);
        if (view == null) {
            d0 d0Var = (d0) this;
            view = d0Var.f3227k.inflate(d0Var.f3226j, viewGroup, false);
        }
        a(view, this.f203c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f208h == null) {
            d dVar = new d();
            dVar.f209a = this;
            this.f208h = dVar;
        }
        return this.f208h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f201a || (cursor = this.f203c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f203c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f201a && (cursor = this.f203c) != null && cursor.moveToPosition(i2)) {
            return this.f203c.getLong(this.f205e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f201a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f203c.moveToPosition(i2)) {
            throw new IllegalStateException(C1.a.f(i2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f203c);
        return view;
    }
}
