package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class vnx extends pww {
    public final /* synthetic */ int h;
    public final i8s i;

    public /* synthetic */ vnx(int i, i8s i8sVar) {
        this.h = i;
        this.i = i8sVar;
    }

    @Override // defpackage.pww
    public void N0(int i, boolean z) {
        switch (this.h) {
            case 0:
                uwf.B(new Status(i, null, null, null), Boolean.valueOf(z), this.i);
                break;
        }
    }

    @Override // defpackage.pww
    public void O0(Status status, kek kekVar) {
        switch (this.h) {
            case 1:
                int i = q92.b;
                boolean d = status.d();
                i8s i8sVar = this.i;
                if (!d) {
                    i8sVar.a(n7w.K(status));
                    break;
                } else {
                    i8sVar.b(kekVar);
                    break;
                }
        }
    }

    @Override // defpackage.pww
    public void P0(Status status, boolean z) {
        switch (this.h) {
            case 0:
                uwf.B(status, Boolean.valueOf(z), this.i);
                break;
        }
    }
}
