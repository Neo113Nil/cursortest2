package m3;

import a4.d;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import m.i1;
import m.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: g, reason: collision with root package name */
    public boolean f4862g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4863h;

    /* renamed from: i, reason: collision with root package name */
    public Cursor f4864i;

    /* renamed from: j, reason: collision with root package name */
    public int f4865j;

    /* renamed from: k, reason: collision with root package name */
    public a f4866k;

    /* renamed from: l, reason: collision with root package name */
    public l0 f4867l;

    /* renamed from: m, reason: collision with root package name */
    public c f4868m;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f4864i;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f4866k;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                l0 l0Var = this.f4867l;
                if (l0Var != null) {
                    cursor2.unregisterDataSetObserver(l0Var);
                }
            }
            this.f4864i = cursor;
            if (cursor != null) {
                a aVar2 = this.f4866k;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                l0 l0Var2 = this.f4867l;
                if (l0Var2 != null) {
                    cursor.registerDataSetObserver(l0Var2);
                }
                this.f4865j = cursor.getColumnIndexOrThrow("_id");
                this.f4862g = true;
                notifyDataSetChanged();
            } else {
                this.f4865j = -1;
                this.f4862g = false;
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
        if (!this.f4862g || (cursor = this.f4864i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f4862g) {
            return null;
        }
        this.f4864i.moveToPosition(i10);
        if (view == null) {
            i1 i1Var = (i1) this;
            view = i1Var.f4349p.inflate(i1Var.f4348o, viewGroup, false);
        }
        a(view, this.f4864i);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4868m == null) {
            c cVar = new c();
            cVar.f4869a = this;
            this.f4868m = cVar;
        }
        return this.f4868m;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f4862g || (cursor = this.f4864i) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f4864i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f4862g && (cursor = this.f4864i) != null && cursor.moveToPosition(i10)) {
            return this.f4864i.getLong(this.f4865j);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f4862g) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f4864i.moveToPosition(i10)) {
            throw new IllegalStateException(d.g("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f4864i);
        return view;
    }
}
