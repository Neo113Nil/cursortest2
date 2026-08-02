package defpackage;

import androidx.camera.view.PreviewView;

/* loaded from: classes6.dex */
public final class tp7 implements pq60 {
    public final /* synthetic */ y6f0 a;

    public tp7(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        ((x6f0) this.a).d(Boolean.valueOf(((PreviewView.StreamState) obj) == PreviewView.StreamState.STREAMING));
    }
}
