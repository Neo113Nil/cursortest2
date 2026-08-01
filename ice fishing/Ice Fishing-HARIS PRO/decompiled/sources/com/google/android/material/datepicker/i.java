package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import k0.K;
import k0.N;

/* loaded from: classes.dex */
public final class i extends N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f2522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f2524c;

    public i(MaterialCalendar materialCalendar, o oVar, MaterialButton materialButton) {
        this.f2524c = materialCalendar;
        this.f2522a = oVar;
        this.f2523b = materialButton;
    }

    @Override // k0.N
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f2523b.getText());
        }
    }

    @Override // k0.N
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int O02;
        MaterialCalendar materialCalendar = this.f2524c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) materialCalendar.f2472d0.getLayoutManager();
            View Q02 = linearLayoutManager.Q0(0, linearLayoutManager.v(), false);
            O02 = Q02 == null ? -1 : K.H(Q02);
        } else {
            O02 = ((LinearLayoutManager) materialCalendar.f2472d0.getLayoutManager()).O0();
        }
        b bVar = this.f2522a.f2542d;
        Calendar a2 = r.a(bVar.f2504a.f2528a);
        a2.add(2, O02);
        materialCalendar.f2468Z = new k(a2);
        Calendar a3 = r.a(bVar.f2504a.f2528a);
        a3.add(2, O02);
        a3.set(5, 1);
        Calendar a4 = r.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = r.f2544a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f2523b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
