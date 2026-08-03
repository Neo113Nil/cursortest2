package m3;

import ac.o;
import ad.e;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m.i1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4860a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Handler handler) {
        super(handler);
        this.f4861b = eVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f4860a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        switch (this.f4860a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((e) this.f4861b).s(o.f277a);
                break;
            default:
                super.onChange(z10, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i1 i1Var) {
        super(new Handler());
        this.f4861b = i1Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f4860a) {
            case 0:
                i1 i1Var = (i1) this.f4861b;
                if (i1Var.f4863h && (cursor = i1Var.f4864i) != null && !cursor.isClosed()) {
                    i1Var.f4862g = i1Var.f4864i.requery();
                    break;
                }
                break;
            default:
                super.onChange(z10);
                break;
        }
    }
}
