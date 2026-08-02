package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public final class xab implements Iterator, xfx {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public xab(d2b0 d2b0Var) {
        de11[] de11VarArr = new de11[8];
        for (int i = 0; i < 8; i++) {
            de11VarArr[i] = new ge11(this);
        }
        this.b = new e2b0(d2b0Var, de11VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yab yabVar = (yab) obj;
                Cursor cursor = yabVar.a;
                return (cursor.isClosed() || yabVar.getCount() <= 0 || cursor.isLast()) ? false : true;
            case 1:
                return ((e2b0) obj).c;
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yab yabVar = (yab) obj;
                yabVar.moveToNext();
                return yabVar;
            case 1:
                return (Map.Entry) ((e2b0) obj).next();
            default:
                return (d531) ((Iterator) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((e2b0) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xab(b531 b531Var) {
        this.b = b531Var.C.iterator();
    }

    public xab(yab yabVar) {
        this.b = yabVar;
    }
}
