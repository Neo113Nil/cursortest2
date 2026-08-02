package defpackage;

import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrvx;", "", "Companion", "pvx", "qvx", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class rvx {
    public static final qvx Companion = new qvx();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new vix(19)), null, null};
    public final String a;
    public final DriveState b;
    public final Calendar c;
    public final String d;

    public /* synthetic */ rvx(int i, String str, DriveState driveState, Calendar calendar, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = DriveState.SEARCH;
        } else {
            this.b = driveState;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = calendar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final DriveState getB() {
        return this.b;
    }

    public final String toString() {
        return "LaunchOrderResponse{orderId='" + this.a + "', status=" + this.b + ", due=" + this.c + ", parkId='" + this.d + "'}";
    }

    public rvx() {
        this(15, null, null);
    }

    public rvx(int i, String str, DriveState driveState) {
        str = (i & 1) != 0 ? "" : str;
        driveState = (i & 2) != 0 ? DriveState.SEARCH : driveState;
        this.a = str;
        this.b = driveState;
        this.c = null;
        this.d = null;
    }
}
