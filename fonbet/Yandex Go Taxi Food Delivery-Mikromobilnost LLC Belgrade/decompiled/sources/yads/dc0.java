package yads;

import android.media.AudioTrack;
import defpackage.cq71;
import defpackage.n371;
import defpackage.n671;
import defpackage.ny61;
import defpackage.sl81;
import defpackage.u191;

/* loaded from: classes7.dex */
public final class dc0 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ n371 a;

    public dc0(n371 n371Var) {
        this.a = n371Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        cq71 cq71Var;
        n671 n671Var = this.a.c;
        if (audioTrack != n671Var.r) {
            ny61.k();
            return;
        }
        sl81 sl81Var = n671Var.o;
        if (sl81Var == null || !n671Var.Q || (cq71Var = ((u191) sl81Var.a).X1) == null) {
            return;
        }
        cq71Var.a.i.a.sendEmptyMessage(2);
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        cq71 cq71Var;
        n671 n671Var = this.a.c;
        if (audioTrack != n671Var.r) {
            ny61.k();
            return;
        }
        sl81 sl81Var = n671Var.o;
        if (sl81Var == null || !n671Var.Q || (cq71Var = ((u191) sl81Var.a).X1) == null) {
            return;
        }
        cq71Var.a.i.a.sendEmptyMessage(2);
    }
}
