package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class kxt {
    public final ckj a = new ckj();

    public static String b(kxt kxtVar) {
        String str;
        if (kxtVar instanceof zwt) {
            str = "ArrayVariable";
        } else if (kxtVar instanceof axt) {
            str = "BooleanVariable";
        } else if (kxtVar instanceof bxt) {
            str = "ColorVariable";
        } else if (kxtVar instanceof cxt) {
            str = "DictVariable";
        } else if (kxtVar instanceof dxt) {
            str = "DoubleVariable";
        } else if (kxtVar instanceof ext) {
            str = "IntegerVariable";
        } else if (kxtVar instanceof gxt) {
            str = "PropertyVariable";
        } else if (kxtVar instanceof hxt) {
            str = "StringVariable";
        } else {
            if (!(kxtVar instanceof ixt)) {
                b6e.s();
                return null;
            }
            str = "UrlVariable";
        }
        StringBuilder m = tlm.m(str, "(name: '");
        m.append(kxtVar.c());
        m.append("')");
        return m.toString();
    }

    public void a(Function1 function1) {
        synchronized (this) {
            this.a.a(function1);
        }
    }

    public abstract String c();

    public final Object d() {
        Object d;
        if (this instanceof hxt) {
            return ((hxt) this).c;
        }
        if (this instanceof ext) {
            return Long.valueOf(((ext) this).c);
        }
        if (this instanceof axt) {
            return Boolean.valueOf(((axt) this).c);
        }
        if (this instanceof dxt) {
            return Double.valueOf(((dxt) this).c);
        }
        if (this instanceof bxt) {
            return new c85(((bxt) this).c);
        }
        if (this instanceof ixt) {
            return ((ixt) this).c;
        }
        if (this instanceof cxt) {
            return ((cxt) this).c;
        }
        if (this instanceof zwt) {
            return ((zwt) this).c;
        }
        if (!(this instanceof gxt)) {
            b6e.s();
            return null;
        }
        gxt gxtVar = (gxt) this;
        synchronized (gxtVar) {
            jac jacVar = gxtVar.d;
            d = ((eym) jacVar.f).d((szb) jacVar.c);
        }
        return d;
    }

    public final void e(kxt kxtVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(kxtVar);
        }
    }

    public void f(Function1 function1) {
        synchronized (this) {
            this.a.g(function1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void g(String str) {
        Object lptVar;
        if (this instanceof hxt) {
            ((hxt) this).j(str);
            return;
        }
        if (this instanceof ext) {
            try {
                ((ext) this).j(Long.parseLong(str));
                return;
            } catch (NumberFormatException e) {
                throw new wxt(f1d.g("Failed to convert value to Long: ", str), e);
            }
        }
        if (this instanceof axt) {
            axt axtVar = (axt) this;
            Boolean p0 = StringsKt.p0(str);
            if (p0 == null) {
                try {
                    p0 = pd.a0(Integer.parseInt(str));
                    if (p0 == null) {
                        wvs.e(2, null, "Failed to convert value to Boolean: ".concat(str));
                        return;
                    }
                } catch (NumberFormatException e2) {
                    throw new wxt("Failed to convert value to Int: ".concat(str), e2);
                }
            }
            axtVar.j(p0.booleanValue());
            return;
        }
        if (this instanceof dxt) {
            try {
                ((dxt) this).j(Double.parseDouble(str));
                return;
            } catch (NumberFormatException e3) {
                throw new wxt(f1d.g("Failed to convert value to Double: ", str), e3);
            }
        }
        if (this instanceof bxt) {
            bxt bxtVar = (bxt) this;
            try {
                if (str == null) {
                    throw new ClassCastException("Received value of wrong type");
                }
                bxtVar.j(bow.v(str));
                return;
            } catch (ClassCastException e4) {
                wvs.e(1, e4, null);
                return;
            }
        }
        if (this instanceof ixt) {
            try {
                ((ixt) this).j(Uri.parse(str));
                return;
            } catch (IllegalArgumentException e5) {
                wvs.e(1, e5, null);
                return;
            }
        }
        if (this instanceof cxt) {
            try {
                ((cxt) this).j(new JSONObject(str));
                return;
            } catch (JSONException e6) {
                wvs.e(1, e6, null);
                return;
            }
        }
        if (this instanceof zwt) {
            try {
                ((zwt) this).j(new JSONArray(str));
                return;
            } catch (JSONException e7) {
                wvs.e(1, e7, null);
                return;
            }
        }
        if (!(this instanceof gxt)) {
            b6e.s();
            return;
        }
        jac jacVar = ((gxt) this).d;
        Object obj = str;
        switch (((nx8) jacVar.b).ordinal()) {
            case 0:
                jacVar.t(obj);
                return;
            case 1:
                try {
                    obj = Long.valueOf(Long.parseLong(str));
                    jacVar.t(obj);
                    return;
                } catch (NumberFormatException e8) {
                    throw new wxt(f1d.g("Failed to convert value to Long: ", str), e8);
                }
            case 2:
                try {
                    obj = Double.valueOf(Double.parseDouble(str));
                    jacVar.t(obj);
                    return;
                } catch (NumberFormatException e9) {
                    throw new wxt(f1d.g("Failed to convert value to Double: ", str), e9);
                }
            case 3:
                Boolean p02 = StringsKt.p0(str);
                if (p02 == null) {
                    try {
                        p02 = pd.a0(Integer.parseInt(str));
                        if (p02 == null) {
                            wvs.e(2, null, "Failed to convert value to Boolean: ".concat(str));
                            return;
                        }
                    } catch (NumberFormatException e10) {
                        throw new wxt("Failed to convert value to Int: ".concat(str), e10);
                    }
                }
                obj = Boolean.valueOf(p02.booleanValue());
                jacVar.t(obj);
                return;
            case 4:
                wvs.e(2, null, "DateTime variables mutation from string is not supported.");
                return;
            case 5:
                try {
                    if (str == null) {
                        throw new ClassCastException("Received value of wrong type");
                    }
                    lptVar = new c85(bow.v(str));
                    obj = lptVar;
                    jacVar.t(obj);
                    return;
                } catch (ClassCastException e11) {
                    wvs.e(1, e11, null);
                    return;
                }
            case 6:
                try {
                    str.getClass();
                    try {
                        new URL(str);
                        lptVar = new lpt(str);
                        obj = lptVar;
                        jacVar.t(obj);
                        return;
                    } catch (MalformedURLException unused) {
                        throw new IllegalArgumentException("Invalid url ".concat(str));
                    }
                } catch (IllegalArgumentException e12) {
                    wvs.e(1, e12, null);
                    return;
                }
            case 7:
                try {
                    lptVar = new JSONObject(str);
                    obj = lptVar;
                    jacVar.t(obj);
                    return;
                } catch (JSONException e13) {
                    wvs.e(1, e13, null);
                    return;
                }
            case 8:
                try {
                    lptVar = new JSONArray(str);
                    obj = lptVar;
                    jacVar.t(obj);
                    return;
                } catch (JSONException e14) {
                    wvs.e(1, e14, null);
                    return;
                }
            default:
                b6e.s();
                return;
        }
    }

    public final void h(kxt kxtVar) {
        Object d;
        if ((this instanceof hxt) && (kxtVar instanceof hxt)) {
            ((hxt) this).j(((hxt) kxtVar).c);
            return;
        }
        if ((this instanceof ext) && (kxtVar instanceof ext)) {
            ((ext) this).j(((ext) kxtVar).c);
            return;
        }
        if ((this instanceof axt) && (kxtVar instanceof axt)) {
            ((axt) this).j(((axt) kxtVar).c);
            return;
        }
        if ((this instanceof dxt) && (kxtVar instanceof dxt)) {
            ((dxt) this).j(((dxt) kxtVar).c);
            return;
        }
        if ((this instanceof bxt) && (kxtVar instanceof bxt)) {
            ((bxt) this).j(((bxt) kxtVar).c);
            return;
        }
        if ((this instanceof ixt) && (kxtVar instanceof ixt)) {
            ((ixt) this).j(((ixt) kxtVar).c);
            return;
        }
        if ((this instanceof cxt) && (kxtVar instanceof cxt)) {
            ((cxt) this).j(((cxt) kxtVar).c);
            return;
        }
        if ((this instanceof zwt) && (kxtVar instanceof zwt)) {
            ((zwt) this).j(((zwt) kxtVar).c);
            return;
        }
        if ((this instanceof gxt) && (kxtVar instanceof gxt)) {
            gxt gxtVar = (gxt) this;
            gxt gxtVar2 = (gxt) kxtVar;
            synchronized (gxtVar2) {
                jac jacVar = gxtVar2.d;
                d = ((eym) jacVar.f).d((szb) jacVar.c);
            }
            gxtVar.j(d);
            return;
        }
        throw new wxt(2, null, "Setting value to " + b(this) + " from " + b(kxtVar) + " not supported!");
    }

    public final void i(Object obj) {
        try {
            if (this instanceof hxt) {
                ((hxt) this).j((String) obj);
                return;
            }
            if (this instanceof ext) {
                ((ext) this).j(((Number) obj).longValue());
                return;
            }
            if (this instanceof axt) {
                ((axt) this).j(((Boolean) obj).booleanValue());
                return;
            }
            if (this instanceof dxt) {
                ((dxt) this).j(((Number) obj).doubleValue());
                return;
            }
            if (this instanceof bxt) {
                ((bxt) this).j(((c85) obj).a);
                return;
            }
            if (this instanceof ixt) {
                ((ixt) this).j((Uri) obj);
                return;
            }
            if (this instanceof cxt) {
                ((cxt) this).j((JSONObject) obj);
            } else if (this instanceof zwt) {
                ((zwt) this).j((JSONArray) obj);
            } else {
                if (!(this instanceof gxt)) {
                    throw new x7j();
                }
                ((gxt) this).j(obj);
            }
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder("Unable to set value with type ");
            sb.append(obj.getClass());
            String b = b(this);
            sb.append(" to ");
            sb.append(b);
            throw new wxt(2, null, sb.toString());
        }
    }
}
