package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import kotlin.text.CatchingFishJUnitCoroutine;
import kotlin.text.CatchingFishRetrofitRealm;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary implements AdapterView.OnItemClickListener {
    public final /* synthetic */ CatchingFishUnitTestingGson CatchingFishDaggerWebsocket;
    public final /* synthetic */ MaterialCalendarGridView CatchingFishReduxKtor;

    public CatchingFishPagingLibrary(CatchingFishUnitTestingGson catchingFishUnitTestingGson, MaterialCalendarGridView materialCalendarGridView) {
        this.CatchingFishDaggerWebsocket = catchingFishUnitTestingGson;
        this.CatchingFishReduxKtor = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.CatchingFishReduxKtor;
        CatchingFishJUnitCoroutine CatchingFishParcelableFAB = materialCalendarGridView.CatchingFishParcelableFAB();
        if (i < CatchingFishParcelableFAB.CatchingFishParcelableFAB() || i > CatchingFishParcelableFAB.CatchingFishCoroutine()) {
            return;
        }
        if (materialCalendarGridView.CatchingFishParcelableFAB().getItem(i).longValue() >= ((CatchingFishRetrofitRealm) this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket).CatchingFishMVVMAppCompat.CatchingFishWorkManager.CatchingFishReduxKtor) {
            throw null;
        }
    }
}
