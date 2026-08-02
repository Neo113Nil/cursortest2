package com.plaid.internal;

import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class P7$$ExternalSyntheticLambda0 implements ActivityResultCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ P7 f$0;

    public /* synthetic */ P7$$ExternalSyntheticLambda0(P7 p7, int i) {
        this.$r8$classId = i;
        this.f$0 = p7;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        int i = this.$r8$classId;
        P7 p7 = this.f$0;
        switch (i) {
            case 0:
                P7.a(p7, (Boolean) obj);
                break;
            case 1:
                P7.a(p7, (List) obj);
                break;
            default:
                P7.a(p7, (Uri) obj);
                break;
        }
    }
}
