package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class xth {
    public final wth a;

    public xth(String str, int i, int i2) {
        if (str == null) {
            jj4.j("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            xq0.x("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new wth(str, i, i2);
            return;
        }
        uth uthVar = new uth(str, i, i2);
        auh.a(i, i2, str);
        this.a = uthVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xth)) {
            return false;
        }
        return this.a.equals(((xth) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xth(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a = uth.a(remoteUserInfo);
        if (a != null) {
            if (!TextUtils.isEmpty(a)) {
                this.a = new uth(remoteUserInfo);
                return;
            } else {
                xq0.x("packageName should be nonempty");
                throw null;
            }
        }
        jj4.j("package shouldn't be null");
        throw null;
    }
}
