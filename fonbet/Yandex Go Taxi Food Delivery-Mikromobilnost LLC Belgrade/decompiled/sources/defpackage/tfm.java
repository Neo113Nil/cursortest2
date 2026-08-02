package defpackage;

import com.yandex.go.drive.sdkintegration.source.DriveStoredUserSession;
import com.yandex.go.utils.storage.json.b;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes.dex */
public final class tfm {
    public static final DriveStoredUserSession e = new DriveStoredUserSession(0);
    public final jtq0 a;
    public final fn21 b;
    public final kfm c;
    public final b d;

    public tfm(eex eexVar, jtq0 jtq0Var, fn21 fn21Var, kfm kfmVar) {
        this.a = jtq0Var;
        this.b = fn21Var;
        this.c = kfmVar;
        DriveStoredUserSession driveStoredUserSession = e;
        this.d = eexVar.c(new am2(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "drive_session_storage", driveStoredUserSession), DriveStoredUserSession.Companion.serializer());
    }
}
