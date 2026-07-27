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
import t0.AbstractC5019C;
import t0.AbstractC5022F;

/* loaded from: classes2.dex */
public final class i extends AbstractC5022F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f36118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f36119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f36120c;

    public i(k kVar, s sVar, MaterialButton materialButton) {
        this.f36120c = kVar;
        this.f36118a = sVar;
        this.f36119b = materialButton;
    }

    @Override // t0.AbstractC5022F
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f36119b.getText());
        }
    }

    @Override // t0.AbstractC5022F
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int K02;
        k kVar = this.f36120c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f36128G0.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            K02 = M02 == null ? -1 : AbstractC5019C.H(M02);
        } else {
            K02 = ((LinearLayoutManager) kVar.f36128G0.getLayoutManager()).K0();
        }
        b bVar = this.f36118a.f36178c;
        Calendar a9 = w.a(bVar.f36098n.f36162n);
        a9.add(2, K02);
        kVar.C0 = new o(a9);
        Calendar a10 = w.a(bVar.f36098n.f36162n);
        a10.add(2, K02);
        a10.set(5, 1);
        Calendar a11 = w.a(a10);
        a11.get(2);
        a11.get(1);
        a11.getMaximum(7);
        a11.getActualMaximum(5);
        a11.getTimeInMillis();
        long timeInMillis = a11.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = w.f36182a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f36119b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
