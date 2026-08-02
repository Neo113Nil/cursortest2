package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.compose.ui.platform.ComposeView;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class exr extends txc {
    public static final /* synthetic */ int p = 0;
    public SeekBar k;
    public ComposeView l;
    public boolean m;
    public int n;
    public final eg2 j = (eg2) sk3.I(eg2.class);
    public final yyo o = new yyo(5, this);

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sync_progress, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        n7w.O().removeCallbacks(this.o);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ru.yandex.music.auth.progress", this.n);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.k = (SeekBar) view.findViewById(R.id.progress);
        this.l = (ComposeView) view.findViewById(R.id.sync_dialog_avatar_icon_view);
        mg2 a = this.j.a(getViewModelStore());
        ComposeView composeView = this.l;
        vdr O = pd.O();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        cce cceVar = (cce) qdcVar.C(I);
        bdt I2 = hag.I(q8r.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        q8r q8rVar = (q8r) qdcVar2.C(I2);
        composeView.getClass();
        y2x.B(composeView, a, O, cceVar, q8rVar, 4.0f, null, 3.0f);
        setCancelable(false);
        this.k.setMax(1000);
        this.k.setOnTouchListener(abe.b);
        if (bundle == null) {
            this.o.run();
            return;
        }
        int i = bundle.getInt("ru.yandex.music.auth.progress", 150);
        this.n = i;
        this.k.setProgress(i);
    }
}
