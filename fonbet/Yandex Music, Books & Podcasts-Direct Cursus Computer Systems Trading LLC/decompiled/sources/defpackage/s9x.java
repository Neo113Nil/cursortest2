package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class s9x extends pww implements IInterface {
    public final /* synthetic */ i8s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9x(i8s i8sVar) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", 3);
        this.h = i8sVar;
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) y4x.a(parcel, Status.CREATOR);
                bax baxVar = (bax) y4x.a(parcel, bax.CREATOR);
                y4x.b(parcel);
                hax haxVar = new hax(baxVar);
                u9x u9xVar = new u9x();
                u9xVar.a = haxVar;
                uwf.B(status, u9xVar, this.h);
                return true;
            case 3:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 4:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 5:
                y4x.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 6:
                parcel.createStringArrayList();
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 7:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 8:
                parcel.readInt();
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 9:
                y4x.b(parcel);
                xq0.q("Not implemented");
                return false;
            case 10:
                y4x.b(parcel);
                xq0.q("Not implemented");
                return false;
            case 11:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 12:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 13:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 14:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            case 15:
                y4x.b(parcel);
                xq0.q("Not implemented.");
                return false;
            default:
                return false;
        }
    }
}
