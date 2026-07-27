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
import t0.AbstractC4990E;
import t0.AbstractC4993H;

/* loaded from: classes2.dex */
public final class i extends AbstractC4993H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f35955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f35956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f35957c;

    public i(j jVar, r rVar, MaterialButton materialButton) {
        this.f35957c = jVar;
        this.f35955a = rVar;
        this.f35956b = materialButton;
    }

    @Override // t0.AbstractC4993H
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f35956b.getText());
        }
    }

    @Override // t0.AbstractC4993H
    public final void b(RecyclerView recyclerView, int i, int i6) {
        int K02;
        j jVar = this.f35957c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f35963G0.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            K02 = M02 == null ? -1 : AbstractC4990E.H(M02);
        } else {
            K02 = ((LinearLayoutManager) jVar.f35963G0.getLayoutManager()).K0();
        }
        b bVar = this.f35955a.f36013c;
        Calendar a9 = v.a(bVar.f35935n.f35997n);
        a9.add(2, K02);
        jVar.C0 = new n(a9);
        Calendar a10 = v.a(bVar.f35935n.f35997n);
        a10.add(2, K02);
        a10.set(5, 1);
        Calendar a11 = v.a(a10);
        a11.get(2);
        a11.get(1);
        a11.getMaximum(7);
        a11.getActualMaximum(5);
        a11.getTimeInMillis();
        long timeInMillis = a11.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = v.f36017a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f35956b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
