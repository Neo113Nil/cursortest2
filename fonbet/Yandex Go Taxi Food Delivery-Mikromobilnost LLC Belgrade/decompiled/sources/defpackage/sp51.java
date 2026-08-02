package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes4.dex */
public final /* synthetic */ class sp51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ YbButtonViewGroup b;
    public final /* synthetic */ YbButtonView c;
    public final /* synthetic */ sls w;

    public /* synthetic */ sp51(YbButtonViewGroup ybButtonViewGroup, YbButtonView ybButtonView, sls slsVar, int i) {
        this.a = i;
        this.b = ybButtonViewGroup;
        this.c = ybButtonView;
        this.w = slsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        sls slsVar = this.w;
        YbButtonView ybButtonView = this.c;
        YbButtonViewGroup ybButtonViewGroup = this.b;
        switch (i) {
            case 0:
                YbButtonViewGroup.setSecondaryButtonClickListener$lambda$8$lambda$7(ybButtonViewGroup, ybButtonView, slsVar, view);
                break;
            default:
                YbButtonViewGroup.setPrimaryButtonOnClickListener$lambda$5$lambda$4(ybButtonViewGroup, ybButtonView, slsVar, view);
                break;
        }
    }
}
