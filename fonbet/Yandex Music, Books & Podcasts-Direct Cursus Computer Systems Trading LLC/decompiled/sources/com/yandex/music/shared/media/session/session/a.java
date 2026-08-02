package com.yandex.music.shared.media.session.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.media3.session.MediaSessionService;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import defpackage.dmg;
import defpackage.qld;
import defpackage.ssg;

/* loaded from: classes3.dex */
public abstract class a {
    public static void a(Service service, int i, Notification notification) {
        notification.getClass();
        try {
            service.startForeground(i, notification, 2);
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !(e instanceof ForegroundServiceStartNotAllowedException) || !(service instanceof MediaSessionService)) {
                throw e;
            }
            ssg.a(7, "Media3SessionService", "Start foreground playback not allowed", new Media3SessionService.MusicBackgroundServiceStartNotAllowedException());
            qld.J(new dmg(10, service));
        }
    }
}
