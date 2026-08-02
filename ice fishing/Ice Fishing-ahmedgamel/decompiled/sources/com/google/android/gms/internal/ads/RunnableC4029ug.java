package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.widget.ImageView;
import java.util.Objects;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4029ug implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35329n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4137wg f35330u;

    public /* synthetic */ RunnableC4029ug(int i, C4137wg c4137wg, boolean z6) {
        this.f35329n = i;
        this.f35330u = c4137wg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35329n) {
            case 0:
                this.f35330u.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f35330u.c("surfaceDestroyed", new String[0]);
                break;
            case 2:
                this.f35330u.c("firstFrameRendered", new String[0]);
                break;
            default:
                C4137wg c4137wg = this.f35330u;
                if (c4137wg.f35624A) {
                    ImageView imageView = c4137wg.J;
                    if (imageView.getParent() != null) {
                        c4137wg.f35635u.removeView(imageView);
                    }
                }
                AbstractC3975tg abstractC3975tg = c4137wg.f35640z;
                if (abstractC3975tg != null && c4137wg.f35632I != null) {
                    C4906k c4906k = C4906k.f40186C;
                    c4906k.f40198k.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (abstractC3975tg.getBitmap(c4137wg.f35632I) != null) {
                        c4137wg.f35633K = true;
                    }
                    c4906k.f40198k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (w2.z.m()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
                        sb.append("Spinner frame grab took ");
                        sb.append(elapsedRealtime2);
                        sb.append("ms");
                        w2.z.k(sb.toString());
                    }
                    if (elapsedRealtime2 > c4137wg.f35639y) {
                        x2.i.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        c4137wg.f35627D = false;
                        c4137wg.f35632I = null;
                        C3808qa c3808qa = c4137wg.f35637w;
                        if (c3808qa != null) {
                            c3808qa.c("spinner_jank", Long.toString(elapsedRealtime2));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public RunnableC4029ug(C4137wg c4137wg, int i) {
        this.f35329n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c4137wg);
                this.f35330u = c4137wg;
                break;
            default:
                Objects.requireNonNull(c4137wg);
                this.f35330u = c4137wg;
                break;
        }
    }
}
