package D;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import h.d0;

/* loaded from: classes.dex */
public final class d extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public c f209a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((d0) this.f209a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        d0 d0Var = (d0) this.f209a;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            d0Var.getClass();
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = d0Var.f3228l;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = d0Var.g(d0Var.f3229m, charSequence2);
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f209a;
        Cursor cursor = cVar.f203c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((d0) cVar).b((Cursor) obj);
    }
}
