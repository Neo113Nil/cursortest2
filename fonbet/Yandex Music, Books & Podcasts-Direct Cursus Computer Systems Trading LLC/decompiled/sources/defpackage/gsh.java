package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class gsh extends esh {
    @Override // defpackage.esh
    public final yth b() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        yth ythVar = new yth();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            jj4.j("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            xq0.x("packageName should be nonempty");
            return null;
        }
        ythVar.a = new buh(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return ythVar;
    }

    @Override // defpackage.esh
    public final void d(yth ythVar) {
    }
}
