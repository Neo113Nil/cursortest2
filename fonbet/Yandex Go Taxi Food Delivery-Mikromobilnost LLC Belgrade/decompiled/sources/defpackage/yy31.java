package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.audio.d;
import com.yandex.messaging.views.WaveformView;
import kotlinx.coroutines.a;

/* loaded from: classes15.dex */
public final class yy31 extends Brick {
    public final rh3 a;
    public final View b;
    public final d c;

    public yy31(Activity activity, tyc0 tyc0Var, boolean z, rh3 rh3Var) {
        this.a = rh3Var;
        View inflate = inflate(activity, z ? olh0.msg_b_own_voice_reply : olh0.msg_b_other_voice_reply);
        this.b = inflate;
        this.c = new d(tyc0Var, (ImageView) inflate.findViewById(e9h0.play_button), (ImageView) inflate.findViewById(e9h0.pause_button), (ImageView) inflate.findViewById(e9h0.loading_button), (WaveformView) inflate.findViewById(e9h0.waveform), (TextView) inflate.findViewById(e9h0.duration));
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.b;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.c.a(new f69(j73.d0(new rh3[]{this.a})));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        d dVar = this.c;
        a.g(dVar.d.a, null);
        b1s b1sVar = dVar.g;
        if (b1sVar != null) {
            b1sVar.cancel();
        }
        dVar.g = null;
        dVar.e.i();
        dVar.i = null;
    }
}
