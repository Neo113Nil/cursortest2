package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.BiometricFragment;
import androidx.concurrent.futures.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.go.design.view.GoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title.RideCardDriverSectionTitleView;
import com.yandex.messaging.ChatRequest;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import com.ybsdk.widgets.common.rangedatepicker.RangeDatePickerCalendarView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.wheel.WheelView;

/* loaded from: classes15.dex */
public final class xz implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final /* synthetic */ Object w;

    public xz(int i, RideCardDriverSectionTitleView rideCardDriverSectionTitleView, b0y b0yVar) {
        this.a = 8;
        this.b = i;
        this.c = rideCardDriverSectionTitleView;
        this.w = b0yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        ArrayList arrayList;
        int decrementAndGet;
        a561 a561Var;
        Handler handler;
        int i = this.a;
        Object obj = this.w;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((i00) ((b00) obj2).j.getValue()).a(new v1j0((ChatRequest) obj, i2));
                return;
            case 1:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                return;
            case 2:
                ((BiometricFragment) obj).sendErrorAndDismiss(i2, (CharSequence) obj2);
                return;
            case 3:
                int i3 = BottomSheetBehavior.K0;
                ((BottomSheetBehavior) obj).Z(i2, (View) obj2, false);
                return;
            case 4:
                lry lryVar = (lry) obj;
                euy euyVar = (euy) obj2;
                boolean z = lryVar.c;
                AtomicInteger atomicInteger = lryVar.w;
                ArrayList arrayList2 = lryVar.b;
                if (lryVar.isDone() || arrayList2 == null) {
                    d6z.y("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    d6z.y("Tried to set value from future which is not done", euyVar.isDone());
                                    arrayList2.set(i2, ni91.e(euyVar));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    d6z.y("Less than 0 remaining futures", decrementAndGet >= 0);
                                } catch (RuntimeException e) {
                                    if (z) {
                                        lryVar.y.d(e);
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    d6z.y("Less than 0 remaining futures", decrementAndGet2 >= 0);
                                    if (decrementAndGet2 != 0) {
                                        return;
                                    }
                                    ArrayList arrayList3 = lryVar.b;
                                    if (arrayList3 != null) {
                                        bVar = lryVar.y;
                                        arrayList = new ArrayList(arrayList3);
                                    }
                                }
                            } catch (ExecutionException e2) {
                                if (z) {
                                    lryVar.y.d(e2.getCause());
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                d6z.y("Less than 0 remaining futures", decrementAndGet3 >= 0);
                                if (decrementAndGet3 != 0) {
                                    return;
                                }
                                ArrayList arrayList4 = lryVar.b;
                                if (arrayList4 != null) {
                                    bVar = lryVar.y;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z) {
                                lryVar.cancel(false);
                            }
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            d6z.y("Less than 0 remaining futures", decrementAndGet4 >= 0);
                            if (decrementAndGet4 != 0) {
                                return;
                            }
                            ArrayList arrayList5 = lryVar.b;
                            if (arrayList5 != null) {
                                bVar = lryVar.y;
                                arrayList = new ArrayList(arrayList5);
                            }
                        }
                    } catch (Error e3) {
                        lryVar.y.d(e3);
                        int decrementAndGet5 = atomicInteger.decrementAndGet();
                        d6z.y("Less than 0 remaining futures", decrementAndGet5 >= 0);
                        if (decrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = lryVar.b;
                        if (arrayList6 != null) {
                            bVar = lryVar.y;
                            arrayList = new ArrayList(arrayList6);
                        }
                    }
                    if (decrementAndGet == 0) {
                        ArrayList arrayList7 = lryVar.b;
                        if (arrayList7 != null) {
                            bVar = lryVar.y;
                            arrayList = new ArrayList(arrayList7);
                            bVar.b(arrayList);
                            return;
                        }
                        d6z.y(null, lryVar.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int decrementAndGet6 = atomicInteger.decrementAndGet();
                    d6z.y("Less than 0 remaining futures", decrementAndGet6 >= 0);
                    if (decrementAndGet6 == 0) {
                        ArrayList arrayList8 = lryVar.b;
                        if (arrayList8 != null) {
                            lryVar.y.b(new ArrayList(arrayList8));
                        } else {
                            d6z.y(null, lryVar.isDone());
                        }
                    }
                    throw th;
                }
            case 5:
                ((ModalViewBehavior) obj).E(i2, (View) obj2);
                return;
            case 6:
                if (((RecyclerView) obj2).isAttachedToWindow()) {
                    a561Var = ((RangeDatePickerCalendarView) obj).binding;
                    a561Var.b.scrollToPosition(i2);
                    return;
                }
                return;
            case 7:
                ((ResultReceiver) obj).onReceiveResult(i2, (Bundle) obj2);
                return;
            case 8:
                b0y b0yVar = (b0y) obj;
                RideCardDriverSectionTitleView rideCardDriverSectionTitleView = (RideCardDriverSectionTitleView) obj2;
                if (i2 >= rideCardDriverSectionTitleView.getMeasuredWidth()) {
                    GoView goView = b0yVar.c;
                    c.D(0, goView.getLayoutParams().height, goView);
                    return;
                } else {
                    if (b0yVar.c.getWidth() != rideCardDriverSectionTitleView.getMeasuredWidth() - i2) {
                        GoView goView2 = b0yVar.c;
                        c.D(rideCardDriverSectionTitleView.getMeasuredWidth() - i2, goView2.getLayoutParams().height, goView2);
                        return;
                    }
                    return;
                }
            default:
                handler = ((WheelView) obj2).handler;
                handler.postDelayed(this, i2);
                ((Runnable) obj).run();
                return;
        }
    }

    public /* synthetic */ xz(CoordinatorLayout.a aVar, View view, int i, int i2) {
        this.a = i2;
        this.w = aVar;
        this.c = view;
        this.b = i;
    }

    public /* synthetic */ xz(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ xz(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }

    public xz(WheelView wheelView, int i, Runnable runnable) {
        this.a = 9;
        this.c = wheelView;
        this.b = i;
        this.w = runnable;
    }
}
