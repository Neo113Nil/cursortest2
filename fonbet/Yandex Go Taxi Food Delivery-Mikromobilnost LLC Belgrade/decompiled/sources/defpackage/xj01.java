package defpackage;

import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class xj01 implements jt31 {
    public final /* synthetic */ int a;

    public /* synthetic */ xj01(int i) {
        this.a = i;
    }

    @Override // defpackage.jt31
    public final void c(float f, View view) {
        switch (this.a) {
            case 0:
                TransferMainFragment.getViewBinding$lambda$21$lambda$12$lambda$11(view, f);
                break;
            default:
                WebStoriesContainer._init_$lambda$4(view, f);
                break;
        }
    }
}
