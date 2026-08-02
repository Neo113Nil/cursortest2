package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.views.TextSwitchView;
import defpackage.tls;

/* loaded from: classes15.dex */
public final class x0s extends x0 {
    public static final int R = olh0.msg_vh_create_poll_footer;
    public final TextSwitchView N;
    public final TextSwitchView O;
    public final TextSwitchView P;
    public final TextSwitchView Q;

    public x0s(View view, final j7f j7fVar, final j7f j7fVar2, final j7f j7fVar3, final j7f j7fVar4) {
        super(view);
        TextSwitchView textSwitchView = (TextSwitchView) view.findViewById(e9h0.anonymous_switch);
        this.N = textSwitchView;
        TextSwitchView textSwitchView2 = (TextSwitchView) view.findViewById(e9h0.multiselect_switch);
        this.O = textSwitchView2;
        TextSwitchView textSwitchView3 = (TextSwitchView) view.findViewById(e9h0.starred_switch);
        this.P = textSwitchView3;
        TextSwitchView textSwitchView4 = (TextSwitchView) view.findViewById(e9h0.silent_switch);
        this.Q = textSwitchView4;
        textSwitchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.messaging.ui.createpoll.FooterViewHolder$special$$inlined$onCheckedChange$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tls.this.invoke(Boolean.valueOf(z));
            }
        });
        textSwitchView2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.messaging.ui.createpoll.FooterViewHolder$special$$inlined$onCheckedChange$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tls.this.invoke(Boolean.valueOf(z));
            }
        });
        textSwitchView3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.messaging.ui.createpoll.FooterViewHolder$special$$inlined$onCheckedChange$3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tls.this.invoke(Boolean.valueOf(z));
            }
        });
        textSwitchView4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.messaging.ui.createpoll.FooterViewHolder$special$$inlined$onCheckedChange$4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tls.this.invoke(Boolean.valueOf(z));
            }
        });
    }
}
