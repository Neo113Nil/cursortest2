package defpackage;

import androidx.preference.PreferenceHeaderFragmentCompat;
import com.yandex.payment.sdk.ui.BaseActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class qw4 implements ucs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ucs
    public final void onBackStackChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BaseActivity.changeFragmentListener$lambda$0((BaseActivity) obj);
                break;
            default:
                PreferenceHeaderFragmentCompat.m101onViewCreated$lambda10((PreferenceHeaderFragmentCompat) obj);
                break;
        }
    }
}
