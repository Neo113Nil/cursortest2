package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.LoadableInput;

/* loaded from: classes4.dex */
public final /* synthetic */ class txy implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadableInput b;

    public /* synthetic */ txy(LoadableInput loadableInput, int i) {
        this.a = i;
        this.b = loadableInput;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        LoadableInput loadableInput = this.b;
        switch (i) {
            case 0:
                loadableInput.onClear();
                break;
            default:
                LoadableInput.setupInteractive$lambda$57$lambda$56(loadableInput, view);
                break;
        }
    }
}
