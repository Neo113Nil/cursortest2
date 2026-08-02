package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.d;

/* loaded from: classes15.dex */
public final class u3b extends d {
    public final TextView w;
    public final c x;

    public u3b(Activity activity) {
        super(activity, olh0.msg_b_input_single_button);
        TextView textView = (TextView) this.c.a(e9h0.messaging_input_button);
        textView.setText(oyh0.chat_unblock_button);
        this.w = textView;
        this.x = new c((BrickSlotView) this.b.findViewById(e9h0.messaging_input_slot));
    }
}
