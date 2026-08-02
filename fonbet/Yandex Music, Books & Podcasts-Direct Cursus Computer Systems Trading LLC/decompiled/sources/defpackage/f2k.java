package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f2k extends dgu {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;

    public f2k(String str, b1a b1aVar) {
        this.b = str;
        this.c = b1aVar;
    }

    @Override // defpackage.dgu
    public void a(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.dgu
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b;
                if (((egu) this.c) != null) {
                    float f2 = -f;
                    for (int i3 = 0; i3 < linearLayoutManager.Q(); i3++) {
                        View P = linearLayoutManager.P(i3);
                        if (P == null) {
                            Locale locale = Locale.US;
                            xq0.q(dfi.f("LayoutManager returned a null child at pos ", i3, linearLayoutManager.Q(), "/", " while transforming pages"));
                            break;
                        } else {
                            ((egu) this.c).c(P, (yon.f0(P) - i) + f2);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dgu
    public final void c(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (i != -1) {
                    b1a b1aVar = (b1a) this.c;
                    b1aVar.b.put((String) this.b, new n3k(i));
                    break;
                }
                break;
        }
    }

    public f2k(cgu cguVar) {
        this.b = cguVar;
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }
}
