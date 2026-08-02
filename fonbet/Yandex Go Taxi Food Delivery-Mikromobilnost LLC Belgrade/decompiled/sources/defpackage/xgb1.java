package defpackage;

import android.graphics.Color;
import android.net.Uri;
import com.yandex.div.core.expression.storedvalues.StoredValueDeclarationException;
import com.yandex.div.core.expression.storedvalues.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue$Type;
import com.yandex.div.internal.parser.b;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.d;
import com.yandex.div.storage.f;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import com.ybsdk.feature.change.payment.method.internal.data.DefaultPaymentMethodUnifiedStatusEntity;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetStatus;
import defpackage.g9i0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes11.dex */
public abstract class xgb1 {
    public static final boolean a(String str) {
        return jl40.l(str, "set_stored_value");
    }

    public static vgb1 b(StoredValue$Type storedValue$Type, String str, String str2) {
        switch (hlu0.a[storedValue$Type.ordinal()]) {
            case 1:
                return new elu0(str, str2);
            case 2:
                try {
                    return new dlu0(str, Long.parseLong(str2));
                } catch (NumberFormatException e) {
                    throw new StoredValueDeclarationException(null, e, 1);
                }
            case 3:
                Boolean j0 = evu0.j0(str2);
                if (j0 == null) {
                    try {
                        j0 = wwg.W(Integer.parseInt(str2));
                        if (j0 == null) {
                            throw new StoredValueDeclarationException(oyr.p("Unable to convert ", str2, " to boolean"), null, 2);
                        }
                    } catch (NumberFormatException e2) {
                        throw new StoredValueDeclarationException(null, e2, 1);
                    }
                }
                return new zku0(str, j0.booleanValue());
            case 4:
                try {
                    return new clu0(str, Double.parseDouble(str2));
                } catch (NumberFormatException e3) {
                    throw new StoredValueDeclarationException(null, e3, 1);
                }
            case 5:
                return new alu0(str, ((Number) b.b.invoke(str2)).intValue());
            case 6:
                try {
                    try {
                        new URL(str2);
                        return new glu0(str, str2);
                    } catch (MalformedURLException unused) {
                        throw new IllegalArgumentException("Invalid url ".concat(str2));
                    }
                } catch (IllegalArgumentException e4) {
                    throw new StoredValueDeclarationException(null, e4, 1);
                }
            default:
                throw new StoredValueDeclarationException("Cannot create stored value of type = '" + storedValue$Type + "'.", null, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(vgb1 vgb1Var, long j, Div2View div2View, DivActionSetStoredValue$Scope divActionSetStoredValue$Scope) {
        Object obj;
        StoredValue$Type storedValue$Type;
        String str;
        a k = div2View.getDiv2Component().k();
        l6o a = div2View.getViewComponent().a().a(div2View.get_divData(), div2View.getDivTag());
        DivActionSetStoredValue$Scope divActionSetStoredValue$Scope2 = divActionSetStoredValue$Scope == null ? DivActionSetStoredValue$Scope.GLOBAL : divActionSetStoredValue$Scope;
        String str2 = div2View.getDivTag().a;
        k.getClass();
        g9i0.Companion companion = g9i0.INSTANCE;
        String o = g8e.o("stored_value_", vgb1Var.a());
        int i = ilu0.a[divActionSetStoredValue$Scope2.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return false;
            }
            o = ("card_" + str2 + '_').concat(o);
        }
        boolean z = vgb1Var instanceof elu0;
        if (z ? true : vgb1Var instanceof dlu0 ? true : vgb1Var instanceof zku0 ? true : vgb1Var instanceof yku0 ? true : vgb1Var instanceof blu0 ? true : vgb1Var instanceof clu0) {
            obj = vgb1Var.b();
        } else {
            if (!(vgb1Var instanceof glu0 ? true : vgb1Var instanceof alu0)) {
                w511.b();
                return false;
            }
            obj = vgb1Var.b().toString();
        }
        JSONObject jSONObject = new JSONObject();
        flu0 flu0Var = StoredValue$Type.Converter;
        if (z) {
            storedValue$Type = StoredValue$Type.STRING;
        } else if (vgb1Var instanceof dlu0) {
            storedValue$Type = StoredValue$Type.INTEGER;
        } else if (vgb1Var instanceof zku0) {
            storedValue$Type = StoredValue$Type.BOOLEAN;
        } else if (vgb1Var instanceof clu0) {
            storedValue$Type = StoredValue$Type.NUMBER;
        } else if (vgb1Var instanceof alu0) {
            storedValue$Type = StoredValue$Type.COLOR;
        } else if (vgb1Var instanceof glu0) {
            storedValue$Type = StoredValue$Type.URL;
        } else if (vgb1Var instanceof yku0) {
            storedValue$Type = StoredValue$Type.ARRAY;
        } else {
            if (!(vgb1Var instanceof blu0)) {
                w511.b();
                return false;
            }
            storedValue$Type = StoredValue$Type.DICT;
        }
        flu0Var.getClass();
        str = storedValue$Type.value;
        jSONObject.put("type", str);
        jSONObject.put(ClidProvider.TIMESTAMP, System.currentTimeMillis() / 1000);
        jSONObject.put("lifetime", j);
        jSONObject.put("value", obj);
        companion.getClass();
        f c = ((d) k.a.getValue()).c(new d.a(Collections.singletonList(new g9i0.b(o, jSONObject)), null, i2, 0 == true ? 1 : 0));
        Iterator<T> it = c.g().iterator();
        while (it.hasNext()) {
            a.e((RawJsonRepositoryException) it.next());
        }
        return c.g().isEmpty();
    }

    public static final boolean d(Uri uri, fpl fplVar) {
        Long m;
        DivActionSetStoredValue$Scope divActionSetStoredValue$Scope = null;
        Div2View div2View = fplVar instanceof Div2View ? (Div2View) fplVar : null;
        if (div2View == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("name");
        if (queryParameter == null) {
            queryParameter = null;
        }
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("value");
            if (queryParameter2 == null) {
                queryParameter2 = null;
            }
            if (queryParameter2 != null) {
                String queryParameter3 = uri.getQueryParameter("lifetime");
                if (queryParameter3 == null) {
                    queryParameter3 = null;
                }
                if (queryParameter3 != null && (m = bvu0.m(10, queryParameter3)) != null) {
                    long longValue = m.longValue();
                    String queryParameter4 = uri.getQueryParameter("type");
                    if (queryParameter4 == null) {
                        queryParameter4 = null;
                    }
                    if (queryParameter4 != null) {
                        StoredValue$Type.Converter.getClass();
                        StoredValue$Type a = flu0.a(queryParameter4);
                        if (a != null) {
                            String queryParameter5 = uri.getQueryParameter("scope");
                            if (queryParameter5 == null) {
                                queryParameter5 = null;
                            }
                            if (queryParameter5 != null) {
                                DivActionSetStoredValue$Scope.Converter.getClass();
                                DivActionSetStoredValue$Scope a2 = a9k.a(queryParameter5);
                                if (a2 == null) {
                                    div2View.logError(new StoredValueDeclarationException(oyr.p("Value ", queryParameter, " stored with default scope"), new IllegalArgumentException(unr0.l('\'', "Unknown scope '", queryParameter5))));
                                } else {
                                    divActionSetStoredValue$Scope = a2;
                                }
                            }
                            try {
                                return c(b(a, queryParameter, queryParameter2), longValue, div2View, divActionSetStoredValue$Scope);
                            } catch (StoredValueDeclarationException unused) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final int e(long j) {
        return Color.argb((int) ((j >> 24) & 255), (int) ((j >> 16) & 255), (int) ((j >> 8) & 255), (int) (j & 255));
    }

    public static final ahh f(DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus) {
        DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity;
        int i = zc9.a[defaultPaymentMethodUnifiedSetStatus.getStatus().ordinal()];
        if (i == 1) {
            defaultPaymentMethodUnifiedStatusEntity = DefaultPaymentMethodUnifiedStatusEntity.PENDING;
        } else if (i == 2) {
            defaultPaymentMethodUnifiedStatusEntity = DefaultPaymentMethodUnifiedStatusEntity.REQUIRED_3DS;
        } else if (i == 3) {
            defaultPaymentMethodUnifiedStatusEntity = DefaultPaymentMethodUnifiedStatusEntity.FINISHED;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            defaultPaymentMethodUnifiedStatusEntity = DefaultPaymentMethodUnifiedStatusEntity.FAILED;
        }
        return new ahh(defaultPaymentMethodUnifiedStatusEntity, defaultPaymentMethodUnifiedSetStatus.getUrl3ds(), defaultPaymentMethodUnifiedSetStatus.getPaymentUrl(), defaultPaymentMethodUnifiedSetStatus.getErrorCode());
    }
}
