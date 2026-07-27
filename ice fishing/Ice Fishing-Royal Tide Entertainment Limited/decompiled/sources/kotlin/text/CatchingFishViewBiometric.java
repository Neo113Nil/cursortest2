package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishViewBiometric extends ArrayAdapter {
    public final /* synthetic */ CatchingFishMVIMVPOkHttp CatchingFishCoroutine;
    public ColorStateList CatchingFishParcelableFAB;
    public ColorStateList CatchingFishSnackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewBiometric(CatchingFishMVIMVPOkHttp catchingFishMVIMVPOkHttp, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.CatchingFishCoroutine = catchingFishMVIMVPOkHttp;
        CatchingFishParcelableFAB();
    }

    public final void CatchingFishParcelableFAB() {
        ColorStateList colorStateList;
        CatchingFishMVIMVPOkHttp catchingFishMVIMVPOkHttp = this.CatchingFishCoroutine;
        ColorStateList colorStateList2 = catchingFishMVIMVPOkHttp.CatchingFishAnimationMockk;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.CatchingFishSnackbar = colorStateList;
        if (catchingFishMVIMVPOkHttp.CatchingFishUnitTesting != 0 && catchingFishMVIMVPOkHttp.CatchingFishAnimationMockk != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{CatchingFishLiveDataAdMob.CatchingFishSnackbar(catchingFishMVIMVPOkHttp.CatchingFishAnimationMockk.getColorForState(iArr3, 0), catchingFishMVIMVPOkHttp.CatchingFishUnitTesting), CatchingFishLiveDataAdMob.CatchingFishSnackbar(catchingFishMVIMVPOkHttp.CatchingFishAnimationMockk.getColorForState(iArr2, 0), catchingFishMVIMVPOkHttp.CatchingFishUnitTesting), catchingFishMVIMVPOkHttp.CatchingFishUnitTesting});
        }
        this.CatchingFishParcelableFAB = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            CatchingFishMVIMVPOkHttp catchingFishMVIMVPOkHttp = this.CatchingFishCoroutine;
            Drawable drawable = null;
            if (catchingFishMVIMVPOkHttp.getText().toString().contentEquals(textView.getText()) && catchingFishMVIMVPOkHttp.CatchingFishUnitTesting != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(catchingFishMVIMVPOkHttp.CatchingFishUnitTesting);
                if (this.CatchingFishSnackbar != null) {
                    colorDrawable.setTintList(this.CatchingFishParcelableFAB);
                    drawable = new RippleDrawable(this.CatchingFishSnackbar, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
