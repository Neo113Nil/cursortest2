package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;

/* loaded from: classes15.dex */
public final class s3b extends Brick {
    public final ProgressBar A;
    public final Handler B = new Handler(Looper.getMainLooper());
    public final v4a C = new v4a(6, this);
    public qj21 D;
    public qj21 E;
    public final pu31 a;
    public final h9x b;
    public final ChatInputHeightState c;
    public final Resources w;
    public final rj21 x;
    public final View y;
    public final TextView z;

    public s3b(Activity activity, pu31 pu31Var, SelectedMessagesPanel selectedMessagesPanel, h9x h9xVar, ChatInputHeightState chatInputHeightState, rj21 rj21Var) {
        this.b = h9xVar;
        this.a = pu31Var;
        this.c = chatInputHeightState;
        this.w = activity.getResources();
        this.x = rj21Var;
        View inflate = inflate(activity, olh0.msg_b_input_single_button);
        this.y = inflate;
        TextView textView = (TextView) inflate.findViewById(e9h0.messaging_input_button);
        this.z = textView;
        this.A = (ProgressBar) inflate.findViewById(e9h0.messaging_input_progress);
        textView.setText(oyh0.chat_join_button);
        textView.setOnClickListener(new ci8(6, this));
        selectedMessagesPanel.insertInto((fk6) inflate.findViewById(e9h0.messaging_input_slot));
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.y;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.a.a(this.y, "join", null);
        this.c.a(this.w.getDimensionPixelSize(gvg0.chat_input_button_height));
        e48 e48Var = new e48(19, this);
        rj21 rj21Var = this.x;
        this.D = rj21Var.b(e48Var, 19);
        this.E = rj21Var.b(new e48(19, this), 22);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.B.removeCallbacks(this.C);
        qj21 qj21Var = this.D;
        if (qj21Var != null) {
            qj21Var.close();
        }
        qj21 qj21Var2 = this.E;
        if (qj21Var2 != null) {
            qj21Var2.close();
        }
        this.D = null;
        this.E = null;
    }

    public final void q() {
        this.B.removeCallbacks(this.C);
        TextView textView = this.z;
        textView.setVisibility(0);
        this.A.setVisibility(8);
        textView.setEnabled(true);
    }
}
