package com.anythink.expressad.widget;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes.dex */
public abstract class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int f23281d = 2000;

    /* renamed from: a, reason: collision with root package name */
    private long f23282a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f23282a > com.anythink.basead.exoplayer.i.a.f8669f) {
            this.f23282a = timeInMillis;
            a(view);
        }
    }
}
