package androidx.media3.common.util;

import androidx.recyclerview.widget.AdapterHelper;

/* loaded from: classes3.dex */
public final /* synthetic */ class BackgroundThreadStateHandler$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AdapterHelper f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BackgroundThreadStateHandler$$ExternalSyntheticLambda0(AdapterHelper adapterHelper, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = adapterHelper;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        AdapterHelper adapterHelper = this.f$0;
        switch (i) {
            case 0:
                if (adapterHelper.mExistingUpdateTypes == 0) {
                    adapterHelper.updateStateInForeground(obj);
                    break;
                }
                break;
            default:
                int i2 = adapterHelper.mExistingUpdateTypes - 1;
                adapterHelper.mExistingUpdateTypes = i2;
                if (i2 == 0) {
                    adapterHelper.updateStateInForeground(obj);
                    break;
                }
                break;
        }
    }
}
