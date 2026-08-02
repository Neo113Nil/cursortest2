package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class yp4 implements szm {
    public final /* synthetic */ zp4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ yp4(zp4 zp4Var, String str, String[] strArr) {
        this.a = zp4Var;
        this.b = str;
        this.c = strArr;
    }

    @Override // defpackage.szm
    public final Object get() {
        zp4 zp4Var = this.a;
        Cursor rawQuery = ((dg0) zp4Var.b).a.rawQuery(this.b, this.c);
        ((ArrayList) zp4Var.d).add(rawQuery);
        return rawQuery;
    }
}
