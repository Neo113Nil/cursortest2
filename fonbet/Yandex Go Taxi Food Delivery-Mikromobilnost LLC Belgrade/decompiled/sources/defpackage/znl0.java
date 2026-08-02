package defpackage;

import com.caverock.androidsvg.m;

/* loaded from: classes10.dex */
public final class znl0 extends cwa1 {
    public float a = 0.0f;
    public final /* synthetic */ m b;

    public znl0(m mVar) {
        this.b = mVar;
    }

    @Override // defpackage.cwa1
    public final void c(String str) {
        this.a = this.b.c.d.measureText(str) + this.a;
    }
}
