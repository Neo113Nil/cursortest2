package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class iw6 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public hw6 e;
    public nr2 f;
    public lw6 g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                hw6 hw6Var = this.e;
                if (hw6Var != null) {
                    cursor2.unregisterContentObserver(hw6Var);
                }
                nr2 nr2Var = this.f;
                if (nr2Var != null) {
                    cursor2.unregisterDataSetObserver(nr2Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                hw6 hw6Var2 = this.e;
                if (hw6Var2 != null) {
                    cursor.registerContentObserver(hw6Var2);
                }
                nr2 nr2Var2 = this.f;
                if (nr2Var2 != null) {
                    cursor.registerDataSetObserver(nr2Var2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            rqr rqrVar = (rqr) this;
            view = rqrVar.j.inflate(rqrVar.i, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.g == null) {
            lw6 lw6Var = new lw6();
            lw6Var.a = this;
            this.g = lw6Var;
        }
        return this.g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            xq0.q("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            xq0.q(k5r.i(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            rqr rqrVar = (rqr) this;
            view = rqrVar.j.inflate(rqrVar.h, viewGroup, false);
            view.setTag(new qqr(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(rqrVar.o);
        }
        a(view, this.c);
        return view;
    }
}
