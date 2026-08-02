package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxpo;", "Ledu;", "Lthk;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class xpo extends edu<thk> {
    public final ybf h = new ybf(ern.a(jqo.class), new wpo(this, 0), new wpo(this, 2), new wpo(this, 1));

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_sbp_challenger, viewGroup, false);
        int i2 = R.id.closeButton;
        ImageView imageView = (ImageView) dag.v(R.id.closeButton, inflate);
        if (imageView != null) {
            i2 = R.id.descriptionTextView;
            TextView textView = (TextView) dag.v(R.id.descriptionTextView, inflate);
            if (textView != null) {
                i2 = R.id.headerLayout;
                if (((FrameLayout) dag.v(R.id.headerLayout, inflate)) != null) {
                    i2 = R.id.inputView;
                    ChallengerInputView challengerInputView = (ChallengerInputView) dag.v(R.id.inputView, inflate);
                    if (challengerInputView != null) {
                        i2 = R.id.subtitleTextView;
                        TextView textView2 = (TextView) dag.v(R.id.subtitleTextView, inflate);
                        if (textView2 != null) {
                            i2 = R.id.titleTextView;
                            TextView textView3 = (TextView) dag.v(R.id.titleTextView, inflate);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                this.g = new thk(constraintLayout, imageView, textView, challengerInputView, textView2, textView3);
                                imageView.setOnClickListener(new tpo(this, i));
                                y().p.f(getViewLifecycleOwner(), new uy6(8, new upo(this, 2)));
                                y().r.f(getViewLifecycleOwner(), new uy6(8, new upo(this, i)));
                                y().q.f(getViewLifecycleOwner(), new uy6(8, new upo(this, 1)));
                                constraintLayout.getClass();
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    public final jqo y() {
        return (jqo) this.h.getValue();
    }
}
