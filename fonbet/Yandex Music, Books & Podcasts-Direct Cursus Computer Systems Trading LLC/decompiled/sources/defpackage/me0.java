package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final /* synthetic */ class me0 extends mpi {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // defpackage.p9f
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            default:
                return ((uoc) this.receiver).l;
        }
    }
}
