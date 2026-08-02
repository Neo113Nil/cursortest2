package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class wns implements v7p {
    public final /* synthetic */ int a;
    public final k6g b;

    public /* synthetic */ wns(k6g k6gVar, int i) {
        this.a = i;
        this.b = k6gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        k6g k6gVar = this.b;
        switch (i) {
            case 0:
                return new vns((Context) k6gVar.get());
            default:
                return new o7m0((Context) k6gVar.get());
        }
    }
}
