package defpackage;

import com.google.android.material.sidesheet.SideSheetDialog;

/* loaded from: classes11.dex */
public final class vas0 extends uas0 {
    public final /* synthetic */ SideSheetDialog a;

    public vas0(SideSheetDialog sideSheetDialog) {
        this.a = sideSheetDialog;
    }

    @Override // defpackage.uas0
    public final void a(int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }
}
