package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lspo;", "Ledu;", "Luhk;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class spo extends edu<uhk> {
    public final ybf h = new ybf(ern.a(jqo.class), new rpo(this, 0), new rpo(this, 2), new rpo(this, 1));

    public static final void y(spo spoVar, int i) {
        if (i == 10) {
            ((uhk) spoVar.x()).a.setText(R.string.paymentsdk_challenger_no_attempts_error_desc);
        } else {
            if (i != 11) {
                return;
            }
            ((uhk) spoVar.x()).a.setText(R.string.paymentsdk_challenger_withdraw_error_desc);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_sbp_challenger_no_attemts, viewGroup, false);
        int i = R.id.errorCloseButton;
        TextView textView = (TextView) dag.v(R.id.errorCloseButton, inflate);
        if (textView != null) {
            i = R.id.errorDescription;
            TextView textView2 = (TextView) dag.v(R.id.errorDescription, inflate);
            if (textView2 != null) {
                i = R.id.errorImage;
                if (((ImageView) dag.v(R.id.errorImage, inflate)) != null) {
                    i = R.id.errorTitle;
                    if (((TextView) dag.v(R.id.errorTitle, inflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.g = new uhk(constraintLayout, textView, textView2);
                        textView.setOnClickListener(new xal(6, this));
                        ((jqo) this.h.getValue()).o.f(getViewLifecycleOwner(), new di6(new ybg(27, this), 4));
                        constraintLayout.getClass();
                        return constraintLayout;
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
