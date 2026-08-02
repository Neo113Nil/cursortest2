package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltpb;", "Ledu;", "Lwhk;", "Lqpb;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class tpb extends edu<whk> implements qpb {
    public final ybf h = new ybf(ern.a(u8q.class), new spb(this, 0), new spb(this, 2), new spb(this, 1));

    @Override // defpackage.qpb
    public final void m(ppb ppbVar) {
        ppbVar.getClass();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        whk a = whk.a(layoutInflater.inflate(R.layout.paymentsdk_layout_confirm_exit, viewGroup, false));
        this.g = a;
        ConstraintLayout constraintLayout = a.a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i = requireArguments().getBoolean("isPaymentContext", false) ? R.string.paymentsdk_cancel_payment_title : R.string.paymentsdk_exit_title;
        whk whkVar = (whk) x();
        whkVar.e.setText(i);
        whkVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: rpb
            public final /* synthetic */ tpb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ((u8q) this.b.h.getValue()).G();
                        break;
                    default:
                        ((u8q) this.b.h.getValue()).J();
                        break;
                }
            }
        });
        final int i2 = 1;
        whkVar.c.setOnClickListener(new View.OnClickListener(this) { // from class: rpb
            public final /* synthetic */ tpb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        ((u8q) this.b.h.getValue()).G();
                        break;
                    default:
                        ((u8q) this.b.h.getValue()).J();
                        break;
                }
            }
        });
        ImageView imageView = whkVar.b;
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        imageView.setVisibility(qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null) ? 8 : 0);
    }
}
