package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;

/* loaded from: classes3.dex */
public final class nnb extends j5 {
    public final o d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public nnb(lnb lnbVar) {
        super(lnbVar);
        this.d = (o) lnbVar;
    }

    public static Activity z(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return z(baseContext);
    }

    public final void w(o oVar, Bundle bundle, gfo gfoVar) {
        fnb s = knb.a.s(oVar, bundle, gfoVar);
        if (s != null) {
            this.b = s;
            this.e = true;
            return;
        }
        t requireActivity = oVar.requireActivity();
        requireActivity.getClass();
        Activity z = z(requireActivity);
        if (!(z instanceof gnb)) {
            z = null;
        }
        gnb gnbVar = (gnb) z;
        fnb g = gnbVar != null ? gnbVar.g() : null;
        if (g != null) {
            this.b = g;
            this.e = false;
        } else {
            Assertions.throwOrSkip$default(new FailedAssertionException(tlm.j("No evgen meta provided in non root screen ", this.d.getClass())), null, 2, null);
            this.b = new uqi(gfo.Unknown);
            this.e = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lnb] */
    public final void x(Bundle bundle) {
        bundle.getClass();
        if (this.e) {
            bundle.putParcelable("global.key.evgen.meta", this.a.g());
        }
    }

    public final void y(gfo gfoVar) {
        if ((m() instanceof uqi) && gfoVar != null && this.e && this.f) {
            uqi uqiVar = (uqi) m();
            uqiVar.a = gfoVar;
            uqiVar.b = avf.G(gfoVar.a);
            this.f = false;
        }
    }
}
