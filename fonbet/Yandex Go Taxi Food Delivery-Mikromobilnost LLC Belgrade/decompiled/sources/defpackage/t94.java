package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.DialogCloseReason;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.analytics.ScrollDirection;
import ru.yandex.taxi.analytics.ViewEventType;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class t94 implements mq31 {
    public final lx4 a;

    public t94(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static void g(e32 e32Var, i iVar, Map map) {
        String str;
        int i = s94.a[e32Var.b().ordinal()];
        if (i == 1) {
            str = "card";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = MetaDataField.SCREEN_FIELD;
        }
        iVar.d("element_state", str);
        iVar.e("button_list", e32Var.a());
        if (map != null) {
            iVar.a.putAll(map);
        }
        iVar.m();
    }

    @Override // defpackage.mq31
    public final void a(e32 e32Var, Map map) {
        if (e32Var == null) {
            return;
        }
        g(e32Var, f(e32Var, ViewEventType.SHOWN), map);
    }

    @Override // defpackage.mq31
    public final void b(e32 e32Var, Map map) {
        if (e32Var == null) {
            return;
        }
        c(e32Var, "android_back_button", map);
    }

    @Override // defpackage.q37
    public final void c(e32 e32Var, String str, Map map) {
        if (e32Var == null) {
            return;
        }
        i f = f(e32Var, ViewEventType.TAPPED);
        f.d("button_name", str);
        g(e32Var, f, map);
    }

    @Override // defpackage.mq31
    public final void d(e32 e32Var, Map map, g5c g5cVar) {
        if (e32Var == null) {
            return;
        }
        i f = f(e32Var, ViewEventType.CLOSED);
        String str = "android_back_button";
        if (g5cVar instanceof ModalViewCloseReason) {
            int i = s94.d[((ModalViewCloseReason) g5cVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    str = "touch_outside";
                } else {
                    str = "roll_off";
                }
            }
            f.d("close_reason", str);
            g(e32Var, f, map);
        }
        if (g5cVar instanceof DialogCloseReason) {
            int i2 = s94.e[((DialogCloseReason) g5cVar).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        w511.b();
                        return;
                    }
                    str = "touch_outside";
                } else {
                    str = "button_tapped";
                }
            }
        } else if (g5cVar instanceof mys) {
            str = ((mys) g5cVar).a();
        } else {
            jst.e.r("unknown close reason type", new IllegalStateException());
            str = "";
        }
        f.d("close_reason", str);
        g(e32Var, f, map);
    }

    @Override // defpackage.ohp0
    public final void e(e32 e32Var, Map map, String str, ScrollDirection scrollDirection) {
        String str2;
        if (e32Var == null) {
            return;
        }
        i f = f(e32Var, ViewEventType.SCROLLED);
        int i = s94.b[scrollDirection.ordinal()];
        if (i == 1) {
            str2 = "up";
        } else if (i != 2) {
            jst.e.r("unknown scroll direction", new IllegalStateException());
            str2 = "";
        } else {
            str2 = "down";
        }
        f.d("direction_scroll", str2);
        if (str != null && str.length() != 0) {
            f.d("scrolled_element", str);
        }
        g(e32Var, f, map);
    }

    public final i f(e32 e32Var, ViewEventType viewEventType) {
        String str;
        String c = e32Var.c();
        int i = s94.c[viewEventType.ordinal()];
        if (i == 1) {
            str = "Shown";
        } else if (i == 2) {
            str = "Tapped";
        } else if (i == 3) {
            str = "Scrolled";
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            str = "Closed";
        }
        return ((j) this.a).d(g8e.p(c, Extension.DOT_CHAR, str));
    }
}
