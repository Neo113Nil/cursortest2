package defpackage;

import android.widget.EditText;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;

/* loaded from: classes4.dex */
public final /* synthetic */ class wxy implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadableInput b;

    public /* synthetic */ wxy(LoadableInput loadableInput, int i) {
        this.a = i;
        this.b = loadableInput;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 _init_$lambda$3;
        g onClear$lambda$9;
        int i = this.a;
        LoadableInput loadableInput = this.b;
        switch (i) {
            case 0:
                _init_$lambda$3 = LoadableInput._init_$lambda$3(loadableInput, (EditText) obj);
                return _init_$lambda$3;
            default:
                onClear$lambda$9 = LoadableInput.onClear$lambda$9(loadableInput, (g) obj);
                return onClear$lambda$9;
        }
    }
}
