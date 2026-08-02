package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class hw6 extends ContentObserver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw6(rqr rqrVar) {
        super(new Handler());
        this.b = rqrVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                rqr rqrVar = (rqr) this.b;
                if (rqrVar.b && (cursor = rqrVar.c) != null && !cursor.isClosed()) {
                    rqrVar.a = rqrVar.c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw6(zi3 zi3Var, Handler handler) {
        super(handler);
        this.b = zi3Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((zi3) this.b).c(Unit.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
