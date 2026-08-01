package L0;

import android.content.Context;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public float f513c;

    /* renamed from: d, reason: collision with root package name */
    public float f514d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f515f;

    /* renamed from: g, reason: collision with root package name */
    public P0.d f516g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f511a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final G0.b f512b = new G0.b(1, this);
    public boolean e = true;

    public j(i iVar) {
        this.f515f = new WeakReference(null);
        this.f515f = new WeakReference(iVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f511a;
        float f2 = RecyclerView.f2111C0;
        this.f513c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            f2 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f514d = f2;
        this.e = false;
    }

    public final void b(P0.d dVar, Context context) {
        if (this.f516g != dVar) {
            this.f516g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f511a;
                G0.b bVar = this.f512b;
                dVar.f(context, textPaint, bVar);
                i iVar = (i) this.f515f.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.e = true;
            }
            i iVar2 = (i) this.f515f.get();
            if (iVar2 != null) {
                iVar2.a();
                iVar2.onStateChange(iVar2.getState());
            }
        }
    }
}
