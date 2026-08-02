package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.q;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class jzw extends pww implements IInterface {
    public final /* synthetic */ int h;
    public final /* synthetic */ lzw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(lzw lzwVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.h = i;
        this.i = lzwVar;
    }

    @Override // defpackage.pww
    public final boolean M0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                ezw.b(parcel);
                q.i();
                return false;
            case 102:
                Status status = (Status) ezw.a(parcel, Status.CREATOR);
                ezw.b(parcel);
                switch (this.h) {
                    case 0:
                        this.i.g(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status2 = (Status) ezw.a(parcel, Status.CREATOR);
                ezw.b(parcel);
                switch (this.h) {
                    case 1:
                        this.i.g(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
