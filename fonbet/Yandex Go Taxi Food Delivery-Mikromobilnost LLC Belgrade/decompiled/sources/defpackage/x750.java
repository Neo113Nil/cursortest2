package defpackage;

import com.ybsdk.navigation.NavigationFragment;

/* loaded from: classes3.dex */
public final class x750 extends mx60 {
    public final /* synthetic */ NavigationFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x750(NavigationFragment navigationFragment) {
        super(true);
        this.d = navigationFragment;
    }

    @Override // defpackage.mx60
    public final void d() {
        this.d.onBackPressed();
    }
}
