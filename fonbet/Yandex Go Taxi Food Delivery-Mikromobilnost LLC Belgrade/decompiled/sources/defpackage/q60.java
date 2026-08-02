package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.DivMessageData;

/* loaded from: classes10.dex */
public final class q60 implements tzk {
    public final View a;

    public q60(Activity activity) {
        View inflate = LayoutInflater.from(activity).inflate(olh0.msg_vh_chat_other_div_stub, (ViewGroup) null, false);
        if (inflate != null) {
            this.a = inflate;
        } else {
            ny61.t("null cannot be cast to non-null type android.view.View");
            throw null;
        }
    }

    @Override // defpackage.tzk
    public void cleanup() {
    }

    @Override // defpackage.tzk
    public void d(yab yabVar) {
        ((TextView) this.a.findViewById(e9h0.unsupported_message_text)).setText(((DivMessageData) yabVar.R()).text);
    }

    @Override // defpackage.tzk
    public void e() {
    }

    @Override // defpackage.tzk
    public void f() {
    }

    @Override // defpackage.tzk
    public void g(ChatRequest chatRequest, w7b w7bVar) {
    }

    @Override // defpackage.tzk
    public View getView() {
        return this.a;
    }

    public q60(View view) {
        this(view, 0);
    }

    public q60(View view, int i) {
        this.a = view;
    }
}
