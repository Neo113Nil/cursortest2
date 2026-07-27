package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import com.anythink.expressad.video.module.AnythinkContainerView;

/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: n, reason: collision with root package name */
    private Activity f21837n;

    /* renamed from: o, reason: collision with root package name */
    private AnythinkContainerView f21838o;

    private o(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f21837n = activity;
        this.f21838o = anythinkContainerView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, String str) {
        Activity activity;
        super.a(i, str);
        int i6 = 1;
        if (i != 1) {
            if (i == 2 && (activity = this.f21837n) != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (this.f21838o != null) {
            try {
                i6 = Integer.valueOf(str).intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f21838o.showVideoClickView(i6);
        }
    }
}
