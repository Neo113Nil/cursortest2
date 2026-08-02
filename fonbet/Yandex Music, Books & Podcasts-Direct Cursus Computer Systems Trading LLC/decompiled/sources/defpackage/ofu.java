package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ofu implements View.OnClickListener {
    public static final HashSet e = new HashSet();
    public final View.OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public ofu(View view, View view2, String str) {
        this.a = qeu.f(view);
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        if (str == null) {
            jj4.j("null cannot be cast to non-null type java.lang.String");
            throw null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.d = c.r(lowerCase, "activity", "", false);
    }

    public final void a() {
        Set set = bp6.a;
        if (!set.contains(this)) {
            try {
                View view = (View) this.b.get();
                View view2 = (View) this.c.get();
                if (view != null && view2 != null) {
                    try {
                        String d = nqr.d(view2);
                        String b = qlm.b(view2, d);
                        if (b != null && !jkl.e(b, d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", nqr.b(view, view2));
                            jSONObject.put("screenname", this.d);
                            try {
                                if (!set.contains(this)) {
                                    try {
                                        try {
                                            j3c.d().execute(new t5(11, this, jSONObject, d, b, false));
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                bp6.a(this, th);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bp6.a(this, th);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
