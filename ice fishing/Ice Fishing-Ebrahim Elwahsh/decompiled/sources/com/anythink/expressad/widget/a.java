package com.anythink.expressad.widget;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes.dex */
public abstract class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22652d = 2000;

    /* renamed from: a, reason: collision with root package name */
    private long f22653a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f22653a > com.anythink.basead.exoplayer.i.a.f8040f) {
            this.f22653a = timeInMillis;
            a(view);
        }
    }
}
