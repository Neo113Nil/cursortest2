package kotlin.text;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class CatchingFishJUnitCoroutine extends BaseAdapter {
    public final CatchingFishCardViewOkHttp CatchingFishCoroutine;
    public final CatchingFishLiveDataMVI CatchingFishParcelableFAB;
    public CatchingFishBundleGlide CatchingFishSnackbar;
    public static final int CatchingFishReduxKtor = CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null).getMaximum(4);
    public static final int CatchingFishDaggerWebsocket = (CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null).getMaximum(7) + CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null).getMaximum(5)) - 1;

    public CatchingFishJUnitCoroutine(CatchingFishLiveDataMVI catchingFishLiveDataMVI, CatchingFishCardViewOkHttp catchingFishCardViewOkHttp) {
        this.CatchingFishParcelableFAB = catchingFishLiveDataMVI;
        this.CatchingFishCoroutine = catchingFishCardViewOkHttp;
        throw null;
    }

    public final int CatchingFishCoroutine() {
        return (CatchingFishParcelableFAB() + this.CatchingFishParcelableFAB.CatchingFishViewModelFAB) - 1;
    }

    public final int CatchingFishParcelableFAB() {
        int i = this.CatchingFishCoroutine.CatchingFishViewModelFAB;
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = this.CatchingFishParcelableFAB;
        Calendar calendar = catchingFishLiveDataMVI.CatchingFishReduxKtor;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + catchingFishLiveDataMVI.CatchingFishViewModelScope : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: CatchingFishSnackbar, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < CatchingFishParcelableFAB() || i > CatchingFishCoroutine()) {
            return null;
        }
        int CatchingFishParcelableFAB = (i - CatchingFishParcelableFAB()) + 1;
        Calendar CatchingFishParcelableFAB2 = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(this.CatchingFishParcelableFAB.CatchingFishReduxKtor);
        CatchingFishParcelableFAB2.set(5, CatchingFishParcelableFAB);
        return Long.valueOf(CatchingFishParcelableFAB2.getTimeInMillis());
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return CatchingFishDaggerWebsocket;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.CatchingFishParcelableFAB.CatchingFishViewModelScope;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = new CatchingFishBundleGlide(context, 12);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int CatchingFishParcelableFAB = i - CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB >= 0) {
            CatchingFishLiveDataMVI catchingFishLiveDataMVI = this.CatchingFishParcelableFAB;
            if (CatchingFishParcelableFAB < catchingFishLiveDataMVI.CatchingFishViewModelFAB) {
                textView.setTag(catchingFishLiveDataMVI);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(CatchingFishParcelableFAB + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                CatchingFishDaggerHiltMVP.CatchingFishSnackbar().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            CatchingFishDaggerHiltMVP.CatchingFishSnackbar().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
