package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.ProgressUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class lvm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProgressUtil b;

    public /* synthetic */ lvm(ProgressUtil progressUtil, int i) {
        this.a = i;
        this.b = progressUtil;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$dismissProgress$4();
                break;
            default:
                this.b.lambda$showProgress$3();
                break;
        }
    }
}
