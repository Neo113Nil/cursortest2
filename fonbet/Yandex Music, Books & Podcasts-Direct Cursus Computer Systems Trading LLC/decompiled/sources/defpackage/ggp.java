package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lggp;", "Lbf6;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ggp extends bf6 {
    public hgp k;

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("arg_message");
        string.getClass();
        if (StringsKt.U(string)) {
            su4.s(2, null, "feedback message can not be blank!", null);
        }
        Serializable serializable = arguments.getSerializable("arg_topic");
        serializable.getClass();
        Serializable serializable2 = arguments.getSerializable("arg_source");
        serializable2.getClass();
        String string2 = arguments.getString("arg_email");
        hgp hgpVar = new hgp();
        hgpVar.b = (x7c) serializable;
        hgpVar.c = (mrr) serializable2;
        hgpVar.d = string;
        hgpVar.e = string2;
        hgpVar.a = l18.b.b(hag.I(orr.class), true);
        hgpVar.g = new rjq(true);
        this.k = hgpVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_send_feedback, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        hgp hgpVar = this.k;
        if (hgpVar != null) {
            ((rjq) hgpVar.g).V();
            hgpVar.i = null;
        }
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        hgp hgpVar = this.k;
        if (hgpVar != null) {
            bundle.putString("token.request.bundle.key", (String) hgpVar.f);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        t l = l();
        l.getClass();
        hq0 hq0Var = (hq0) l;
        if (hq0Var.getSupportActionBar() != null) {
            new HashMap();
            qd supportActionBar = hq0Var.getSupportActionBar();
            Assertions.assertNonNull(supportActionBar, "hideToolbar(): actionBar is null");
            if (supportActionBar != null) {
                supportActionBar.f();
            }
        }
        hgp hgpVar = this.k;
        if (hgpVar != null) {
            hgpVar.h = new vtm(this);
        }
        if (hgpVar != null) {
            n3m n3mVar = new n3m(6);
            n3mVar.b = view.findViewById(R.id.feedback_sending_progress);
            n3mVar.c = (ImageView) view.findViewById(R.id.img_status);
            n3mVar.d = (TextView) view.findViewById(R.id.text_view_status);
            n3mVar.e = (Button) view.findViewById(R.id.btn_ok_retry);
            hgpVar.i = n3mVar;
            n3mVar.f = new gao(hgpVar);
        }
        hgp hgpVar2 = this.k;
        if (bundle == null) {
            if (hgpVar2 != null) {
                hgpVar2.y();
            }
        } else if (hgpVar2 != null) {
            String string = bundle.getString("token.request.bundle.key");
            hgpVar2.f = string;
            hgpVar2.B(string);
        }
    }
}
