package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.catchingfish.fishcatcherpro.R;
import java.util.Calendar;
import kotlin.text.CatchingFishCardViewOkHttp;
import kotlin.text.CatchingFishDaggerHiltMVP;
import kotlin.text.CatchingFishGradleDagger;
import kotlin.text.CatchingFishJUnitCoroutine;
import kotlin.text.CatchingFishLiveDataContext;
import kotlin.text.CatchingFishLiveDataMVI;
import kotlin.text.CatchingFishPayPalCardView;
import kotlin.text.CatchingFishToolbarBundle;
import kotlin.text.CatchingFishViewPagerMockk;

/* loaded from: classes.dex */
public final class CatchingFishUnitTestingGson extends CatchingFishToolbarBundle {
    public final CatchingFishViewPagerMockk CatchingFishDaggerWebsocket;
    public final CatchingFishCardViewOkHttp CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;

    public CatchingFishUnitTestingGson(ContextThemeWrapper contextThemeWrapper, CatchingFishCardViewOkHttp catchingFishCardViewOkHttp, CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = catchingFishCardViewOkHttp.CatchingFishReduxKtor;
        CatchingFishLiveDataMVI catchingFishLiveDataMVI2 = catchingFishCardViewOkHttp.CatchingFishDaggerWebsocket;
        CatchingFishLiveDataMVI catchingFishLiveDataMVI3 = catchingFishCardViewOkHttp.CatchingFishViewModelScope;
        if (catchingFishLiveDataMVI.CatchingFishReduxKtor.compareTo(catchingFishLiveDataMVI3.CatchingFishReduxKtor) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (catchingFishLiveDataMVI3.CatchingFishReduxKtor.compareTo(catchingFishLiveDataMVI2.CatchingFishReduxKtor) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.CatchingFishWorkManager = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * CatchingFishJUnitCoroutine.CatchingFishReduxKtor) + (CatchingFishLiveDataContext.CatchingFishSensorManager(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.CatchingFishReduxKtor = catchingFishCardViewOkHttp;
        this.CatchingFishDaggerWebsocket = catchingFishViewPagerMockk;
        if (this.CatchingFishParcelableFAB.CatchingFishParcelableFAB()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.CatchingFishSnackbar = true;
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final void CatchingFishCoroutine(CatchingFishPayPalCardView catchingFishPayPalCardView, int i) {
        CatchingFishViewPagerToast catchingFishViewPagerToast = (CatchingFishViewPagerToast) catchingFishPayPalCardView;
        CatchingFishCardViewOkHttp catchingFishCardViewOkHttp = this.CatchingFishReduxKtor;
        Calendar CatchingFishParcelableFAB = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishReduxKtor);
        CatchingFishParcelableFAB.add(2, i);
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = new CatchingFishLiveDataMVI(CatchingFishParcelableFAB);
        catchingFishViewPagerToast.CatchingFishCoroutineFlow.setText(catchingFishLiveDataMVI.CatchingFishCoroutine());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) catchingFishViewPagerToast.CatchingFishDaggerHiltFAB.findViewById(R.id.month_grid);
        if (materialCalendarGridView.CatchingFishParcelableFAB() == null || !catchingFishLiveDataMVI.equals(materialCalendarGridView.CatchingFishParcelableFAB().CatchingFishParcelableFAB)) {
            new CatchingFishJUnitCoroutine(catchingFishLiveDataMVI, catchingFishCardViewOkHttp);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.CatchingFishParcelableFAB().getClass();
        throw null;
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final CatchingFishPayPalCardView CatchingFishReduxKtor(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!CatchingFishLiveDataContext.CatchingFishSensorManager(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new CatchingFishViewPagerToast(linearLayout, false);
        }
        linearLayout.setLayoutParams(new CatchingFishGradleDagger(-1, this.CatchingFishWorkManager));
        return new CatchingFishViewPagerToast(linearLayout, true);
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final long CatchingFishSnackbar(int i) {
        Calendar CatchingFishParcelableFAB = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(this.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishReduxKtor);
        CatchingFishParcelableFAB.add(2, i);
        CatchingFishParcelableFAB.set(5, 1);
        Calendar CatchingFishParcelableFAB2 = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(CatchingFishParcelableFAB);
        CatchingFishParcelableFAB2.get(2);
        CatchingFishParcelableFAB2.get(1);
        CatchingFishParcelableFAB2.getMaximum(7);
        CatchingFishParcelableFAB2.getActualMaximum(5);
        CatchingFishParcelableFAB2.getTimeInMillis();
        return CatchingFishParcelableFAB2.getTimeInMillis();
    }
}
