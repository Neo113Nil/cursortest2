package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class dyd {
    public final String a;
    public final Object b;
    public boolean c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dyd(t5t t5tVar) {
        this(t5tVar, "trailer.intent.action");
        this.d = 1;
        t5tVar.getClass();
    }

    public static dyd a(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("urlplay.intent.action")) == null) {
            return null;
        }
        dyd dydVar = new dyd(xpt.b(bundle2));
        dydVar.c = bundle2.getBoolean("key.intent.action.executed", false);
        return dydVar;
    }

    public static void b(rf3 rf3Var, Intent... intentArr) {
        dyd dydVar = new dyd(new dw6(rf3Var));
        for (Intent intent : intentArr) {
            dydVar.c(intent);
        }
    }

    public final void c(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key.intent.action.executed", this.c);
        d(bundle, this.b);
        intent.putExtra(this.a, bundle);
    }

    public final void d(Bundle bundle, Object obj) {
        String str;
        String str2;
        switch (this.d) {
            case 0:
                bundle.putSerializable("CurrentTabHighlighter.key.tab", ((dw6) obj).a);
                return;
            case 1:
                t5t t5tVar = (t5t) obj;
                t5tVar.getClass();
                bundle.putBoolean("TrailerPlay.key.open", t5tVar.a);
                return;
            default:
                xpt xptVar = (xpt) obj;
                bundle.putBoolean("url.play.play", xptVar.a);
                Integer num = xptVar.b;
                bundle.putInt("url.play.play.track.position", num != null ? num.intValue() : -1);
                bundle.putString("url.play.play.track.id", xptVar.c);
                int i = xptVar.d;
                if (i == 0) {
                    str = null;
                } else if (i == 1) {
                    str = "ON";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str = "OFF";
                }
                bundle.putSerializable("url.play.play.shuffle", str);
                hyn hynVar = xptVar.e;
                bundle.putString("url.play.play.repeat.mode", hynVar != null ? hynVar.name() : null);
                bundle.putBoolean("url.play.play.open.player", xptVar.f);
                bundle.putString("url.play.play.alice.session.id", xptVar.g);
                int i2 = xptVar.h;
                if (i2 == 1) {
                    str2 = "ON";
                } else if (i2 == 2) {
                    str2 = "OFF";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    str2 = "NOT_SPECIFIED";
                }
                bundle.putString("url.play.play.lyrics.mode", str2);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dyd(dw6 dw6Var) {
        this(dw6Var, "HighlightBottomTabAction.tab.current");
        this.d = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dyd(xpt xptVar) {
        this(xptVar, "urlplay.intent.action");
        this.d = 2;
    }

    public dyd(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }
}
