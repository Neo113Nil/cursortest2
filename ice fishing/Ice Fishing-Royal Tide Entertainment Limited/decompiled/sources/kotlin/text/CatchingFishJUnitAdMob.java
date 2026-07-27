package kotlin.text;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishJUnitAdMob extends BaseAdapter {
    public static final int CatchingFishReduxKtor;
    public final int CatchingFishCoroutine;
    public final Calendar CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    static {
        CatchingFishReduxKtor = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public CatchingFishJUnitAdMob() {
        Calendar CatchingFishCoroutine = CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
        this.CatchingFishParcelableFAB = CatchingFishCoroutine;
        this.CatchingFishSnackbar = CatchingFishCoroutine.getMaximum(7);
        this.CatchingFishCoroutine = CatchingFishCoroutine.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.CatchingFishSnackbar;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.CatchingFishSnackbar;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.CatchingFishCoroutine;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.CatchingFishCoroutine;
        int i3 = this.CatchingFishSnackbar;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.CatchingFishParcelableFAB;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, CatchingFishReduxKtor, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public CatchingFishJUnitAdMob(int i) {
        Calendar CatchingFishCoroutine = CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
        this.CatchingFishParcelableFAB = CatchingFishCoroutine;
        this.CatchingFishSnackbar = CatchingFishCoroutine.getMaximum(7);
        this.CatchingFishCoroutine = i;
    }
}
