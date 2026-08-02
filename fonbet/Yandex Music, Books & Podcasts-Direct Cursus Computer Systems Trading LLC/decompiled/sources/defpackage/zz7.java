package defpackage;

import android.content.DialogInterface;
import java.util.Date;

/* loaded from: classes.dex */
public final class zz7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ gqt b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Date d;
    public final /* synthetic */ Date e;
    public final /* synthetic */ b08 f;

    public zz7(b08 b08Var, String str, gqt gqtVar, String str2, Date date, Date date2) {
        this.f = b08Var;
        this.a = str;
        this.b = gqtVar;
        this.c = str2;
        this.d = date;
        this.e = date2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b08.z(this.f, this.a, this.b, this.c, this.d, this.e);
    }
}
