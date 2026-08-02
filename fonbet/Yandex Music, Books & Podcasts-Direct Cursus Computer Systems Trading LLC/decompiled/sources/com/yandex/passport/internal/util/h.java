package com.yandex.passport.internal.util;

import android.os.SystemClock;
import android.view.View;

/* loaded from: classes4.dex */
public final class h implements View.OnClickListener {
    public long a = 0;
    public short b = 0;
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.a < 500) {
            short s = (short) (this.b + 1);
            this.b = s;
            if (s == 10) {
                this.c.a(view.getContext());
                this.b = (short) 0;
            }
        } else {
            this.b = (short) 0;
        }
        this.a = elapsedRealtime;
    }
}
