package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import com.yandex.messaging.ui.calls.feedback.RatingView;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import com.ybsdk.widgets.common.tabview.TabView;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;

/* loaded from: classes10.dex */
public final /* synthetic */ class wtn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wtn(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ytn ytnVar = (ytn) obj;
                ytnVar.b.invoke(Integer.valueOf(i2));
                int i3 = ytnVar.w;
                if (i2 != i3) {
                    ytnVar.notifyItemChanged(i3);
                    ytnVar.notifyItemChanged(i2);
                    ytnVar.w = i2;
                    break;
                }
                break;
            case 1:
                jxq jxqVar = (jxq) obj;
                boolean z = !jxqVar.W().isChecked();
                jxqVar.W().setChecked(z);
                jxqVar.N.invoke(Integer.valueOf(i2), Boolean.valueOf(z));
                break;
            case 2:
                ((FundIncomeWidgetView) obj).onChipClick(i2);
                break;
            case 3:
                eyc0 eyc0Var = (eyc0) obj;
                PlayerControlView playerControlView = eyc0Var.w;
                if (i2 != eyc0Var.c) {
                    playerControlView.setPlaybackSpeed(eyc0Var.b[i2]);
                }
                popupWindow = playerControlView.settingsWindow;
                popupWindow.dismiss();
                break;
            case 4:
                RatingBarComponent.createStarsViewsIfNeed$lambda$0((RatingBarComponent) obj, i2, view);
                break;
            case 5:
                ((RatingView) obj).setSelectedRating(i2);
                break;
            case 6:
                SegmentedControlView.render$lambda$4$lambda$3((SegmentedControlView) obj, i2, view);
                break;
            case 7:
                cnu0 cnu0Var = (cnu0) obj;
                l7s0 l7s0Var = cnu0Var.z;
                if (l7s0Var != null) {
                    ((StoriesPreviewsListView) l7s0Var.a).onStoryClicked(((rpu0) cnu0Var.x.get(i2)).a);
                    break;
                }
                break;
            default:
                TabView.render$lambda$3$lambda$2$lambda$1((TabView) obj, i2, view);
                break;
        }
    }
}
