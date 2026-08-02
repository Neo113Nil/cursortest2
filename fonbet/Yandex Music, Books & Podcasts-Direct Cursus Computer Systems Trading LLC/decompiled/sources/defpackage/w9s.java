package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class w9s extends ixf {
    public final /* synthetic */ Context d;
    public final /* synthetic */ TextPaint e;
    public final /* synthetic */ ixf f;
    public final /* synthetic */ x9s g;

    public w9s(x9s x9sVar, Context context, TextPaint textPaint, ixf ixfVar) {
        this.g = x9sVar;
        this.d = context;
        this.e = textPaint;
        this.f = ixfVar;
    }

    @Override // defpackage.ixf
    public final void C(int i) {
        this.f.C(i);
    }

    @Override // defpackage.ixf
    public final void D(Typeface typeface, boolean z) {
        this.g.f(this.d, this.e, typeface);
        this.f.D(typeface, z);
    }
}
