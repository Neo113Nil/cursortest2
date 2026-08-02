package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.view.View;
import com.yandex.quark.webchat.i;

/* loaded from: classes.dex */
public final /* synthetic */ class sfs implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sfs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                ((nkw0) obj5).d(new yfs(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                i iVar = (i) obj5;
                View view = (View) obj;
                n751 n751Var = (n751) obj2;
                k751 k751Var = n751Var.a;
                iVar.b = k751Var.g(519);
                iVar.a();
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), k751Var.g(8).d);
                x651 x651Var = new x651(n751Var);
                u1w c = u1w.c(0, 0, 0, 0);
                y651 y651Var = x651Var.a;
                y651Var.b(8, c);
                return y651Var.h();
        }
    }
}
