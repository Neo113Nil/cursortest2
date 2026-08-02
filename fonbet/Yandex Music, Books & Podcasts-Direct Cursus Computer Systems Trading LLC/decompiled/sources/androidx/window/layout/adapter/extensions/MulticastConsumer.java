package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.n1c;
import defpackage.rtc;
import defpackage.uqv;
import defpackage.xa6;
import defpackage.zqv;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lxa6;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", Constants.KEY_VALUE, "", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class MulticastConsumer implements xa6, Consumer<WindowLayoutInfo> {
    public final Context a;
    public uqv c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(rtc rtcVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            uqv uqvVar = this.c;
            if (uqvVar != null) {
                rtcVar.accept(uqvVar);
            }
            this.d.add(rtcVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.xa6
    public void accept(@NotNull WindowLayoutInfo value) {
        uqv b;
        value.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Context context = this.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                b = n1c.b(zqv.b.b(context), value);
            } else {
                if (i < 29 || !(context instanceof Activity)) {
                    throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
                }
                b = n1c.b(zqv.a((Activity) context), value);
            }
            this.c = b;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((xa6) it.next()).accept(b);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
