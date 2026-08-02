package defpackage;

import android.net.Uri;
import com.yandex.div.data.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivEvaluableType;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class u991 {
    public static final z3k a = new z3k(8);

    public static final mbi a(gsi gsiVar) {
        return new mbi(gsiVar);
    }

    public static final void b(c231 c231Var, Object obj) {
        Object obj2;
        Object obj3;
        String str = "dict";
        if (c231Var instanceof t131) {
            t131 t131Var = (t131) c231Var;
            String str2 = t131Var.b;
            boolean z = obj instanceof JSONArray;
            JSONArray jSONArray = (JSONArray) (!z ? null : obj);
            if (jSONArray != null) {
                t131Var.k(jSONArray);
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (z) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str2));
            return;
        }
        if (c231Var instanceof u131) {
            u131 u131Var = (u131) c231Var;
            String str3 = u131Var.b;
            Boolean bool = (Boolean) (!(obj instanceof Boolean) ? null : obj);
            if (bool != null) {
                u131Var.j(bool.booleanValue());
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str3));
            return;
        }
        if (c231Var instanceof v131) {
            v131 v131Var = (v131) c231Var;
            String str4 = v131Var.b;
            Integer num = (Integer) (!(obj instanceof Integer) ? null : obj);
            if (num != null) {
                v131Var.j(((Number) b.b.invoke(new jdc(num.intValue()))).intValue());
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str4));
            return;
        }
        if (c231Var instanceof w131) {
            w131 w131Var = (w131) c231Var;
            String str5 = w131Var.b;
            boolean z2 = obj instanceof JSONObject;
            JSONObject jSONObject = (JSONObject) (!z2 ? null : obj);
            if (jSONObject != null) {
                w131Var.j(jSONObject);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!z2) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str5));
            return;
        }
        if (c231Var instanceof x131) {
            x131 x131Var = (x131) c231Var;
            String str6 = x131Var.b;
            boolean z3 = obj instanceof Double;
            Double d = (Double) (!z3 ? null : obj);
            if (d != null) {
                x131Var.j(d.doubleValue());
                return;
            }
            if (z3) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str6));
            return;
        }
        if (c231Var instanceof y131) {
            y131 y131Var = (y131) c231Var;
            String str7 = y131Var.b;
            Long l = (Long) (!(obj instanceof Long) ? null : obj);
            if (l != null) {
                y131Var.j(l.longValue());
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str7));
            return;
        }
        if (c231Var instanceof z131) {
            String str8 = ((z131) c231Var).b;
            String str9 = (String) (!(obj instanceof String) ? null : obj);
            if (str9 != null) {
                c231Var.g(str9);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str8));
            return;
        }
        if (c231Var instanceof a231) {
            a231 a231Var = (a231) c231Var;
            String str10 = a231Var.b;
            Uri uri = (Uri) (!(obj instanceof Uri) ? null : obj);
            if (uri != null) {
                a231Var.j(uri);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = "array";
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            }
            w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str10));
            return;
        }
        if (c231Var instanceof a) {
            a aVar = (a) c231Var;
            DivEvaluableType divEvaluableType = aVar.c;
            String str11 = aVar.b;
            switch (p231.a[divEvaluableType.ordinal()]) {
                case 1:
                    boolean z4 = obj instanceof JSONArray;
                    obj2 = (JSONArray) (!z4 ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (z4) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    obj3 = obj2;
                    aVar.o(obj3);
                    break;
                case 2:
                    obj3 = (Boolean) (!(obj instanceof Boolean) ? null : obj);
                    if (obj3 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    aVar.o(obj3);
                    break;
                case 3:
                    obj3 = (jdc) (!(obj instanceof jdc) ? null : obj);
                    if (obj3 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    aVar.o(obj3);
                    break;
                case 4:
                    obj3 = (com.yandex.div.evaluable.types.a) (!(obj instanceof com.yandex.div.evaluable.types.a) ? null : obj);
                    if (obj3 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    aVar.o(obj3);
                    break;
                case 5:
                    boolean z5 = obj instanceof JSONObject;
                    obj2 = (JSONObject) (!z5 ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!z5) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    obj3 = obj2;
                    aVar.o(obj3);
                    break;
                case 6:
                    obj3 = (Long) (!(obj instanceof Long) ? null : obj);
                    if (obj3 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    aVar.o(obj3);
                    break;
                case 7:
                    boolean z6 = obj instanceof Double;
                    obj2 = (Double) (!z6 ? null : obj);
                    if (obj2 == null) {
                        if (z6) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    obj3 = obj2;
                    aVar.o(obj3);
                    break;
                case 8:
                    obj3 = (String) (!(obj instanceof String) ? null : obj);
                    if (obj3 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    aVar.o(obj3);
                    break;
                case 9:
                    obj3 = (rg21) (!(obj instanceof rg21) ? null : obj);
                    if (obj3 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = "array";
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        w511.c(2, null, b64.l("Trying to set value with invalid type (", str, ") to variable ", str11));
                        break;
                    }
                    aVar.o(obj3);
                    break;
                default:
                    w511.b();
                    break;
            }
        }
    }

    public static h0a0 c() {
        return h0a0.c;
    }
}
