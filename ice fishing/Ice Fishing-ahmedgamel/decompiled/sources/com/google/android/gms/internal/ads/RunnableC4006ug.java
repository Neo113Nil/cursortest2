package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.widget.ImageView;
import java.util.Objects;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4006ug implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34557n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4114wg f34558u;

    public /* synthetic */ RunnableC4006ug(int i, C4114wg c4114wg, boolean z3) {
        this.f34557n = i;
        this.f34558u = c4114wg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34557n) {
            case 0:
                this.f34558u.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f34558u.c("surfaceDestroyed", new String[0]);
                break;
            case 2:
                this.f34558u.c("firstFrameRendered", new String[0]);
                break;
            default:
                C4114wg c4114wg = this.f34558u;
                if (c4114wg.f34847A) {
                    ImageView imageView = c4114wg.J;
                    if (imageView.getParent() != null) {
                        c4114wg.f34858u.removeView(imageView);
                    }
                }
                AbstractC3952tg abstractC3952tg = c4114wg.f34863z;
                if (abstractC3952tg != null && c4114wg.f34855I != null) {
                    C4835j c4835j = C4835j.f39733C;
                    c4835j.f39745k.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (abstractC3952tg.getBitmap(c4114wg.f34855I) != null) {
                        c4114wg.f34856K = true;
                    }
                    c4835j.f39745k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (u2.z.m()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
                        sb.append("Spinner frame grab took ");
                        sb.append(elapsedRealtime2);
                        sb.append("ms");
                        u2.z.k(sb.toString());
                    }
                    if (elapsedRealtime2 > c4114wg.f34862y) {
                        v2.i.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        c4114wg.f34850D = false;
                        c4114wg.f34855I = null;
                        C3785qa c3785qa = c4114wg.f34860w;
                        if (c3785qa != null) {
                            c3785qa.c("spinner_jank", Long.toString(elapsedRealtime2));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public RunnableC4006ug(C4114wg c4114wg, int i) {
        this.f34557n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c4114wg);
                this.f34558u = c4114wg;
                break;
            default:
                Objects.requireNonNull(c4114wg);
                this.f34558u = c4114wg;
                break;
        }
    }
}
