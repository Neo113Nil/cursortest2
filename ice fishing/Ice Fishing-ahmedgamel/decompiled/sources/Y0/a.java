package Y0;

import android.app.Dialog;
import android.os.Bundle;
import com.IceFishing.LiveIceFishing.C5248R;

/* loaded from: classes.dex */
public final class a extends Dialog {
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C5248R.layout.adprogress_dialog);
    }
}
