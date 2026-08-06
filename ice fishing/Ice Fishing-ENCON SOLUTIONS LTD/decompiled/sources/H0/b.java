package H0;

import C.j;
import R1.l;
import a1.InterfaceC0086b;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import com.yandex.varioqub.config.Varioqub;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0376e9;
import io.appmetrica.analytics.impl.C0395f2;
import io.appmetrica.analytics.impl.C0442gn;
import io.appmetrica.analytics.impl.C0647ol;
import io.appmetrica.analytics.impl.C0749sk;
import io.appmetrica.analytics.impl.C0783u2;
import io.appmetrica.analytics.impl.C0857wo;
import io.appmetrica.analytics.impl.C0883xo;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.impl.InterfaceC0285al;
import io.appmetrica.analytics.impl.InterfaceC0477i6;
import io.appmetrica.analytics.impl.InterfaceC0519jn;
import io.appmetrica.analytics.impl.N7;
import io.appmetrica.analytics.impl.Rd;
import io.appmetrica.analytics.impl.zo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import x0.e;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0086b, Rd, FunctionWithThrowable, InterfaceC0477i6, InterfaceC0519jn, zo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f655a;

    public /* synthetic */ b(int i2) {
        this.f655a = i2;
    }

    @Override // io.appmetrica.analytics.impl.Rd
    public InterfaceC0285al a(G0 g02) {
        switch (this.f655a) {
            case 12:
                return Id.a(g02);
            default:
                return Id.b(g02);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        List a2;
        Boolean a3;
        switch (this.f655a) {
            case 14:
                return N7.a((UiModeManager) obj);
            case 15:
            default:
                a3 = C0783u2.a((ActivityManager) obj);
                return a3;
            case 16:
                return C0442gn.b((Activity) obj);
            case 17:
                a2 = C0647ol.a((SubscriptionManager) obj);
                return a2;
        }
    }

    @Override // a1.InterfaceC0086b
    public void g(Object obj, e eVar) {
        Long valueOf;
        switch (this.f655a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    Varioqub.putClientFeature((String) arrayList2.get(0), (String) arrayList2.get(1));
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = l.J(th);
                }
                eVar.f(arrayList);
                break;
            case 1:
                ArrayList arrayList3 = new ArrayList();
                try {
                    Varioqub.clearClientFeatures();
                    arrayList3.add(0, null);
                } catch (Throwable th2) {
                    arrayList3 = l.J(th2);
                }
                eVar.f(arrayList3);
                break;
            case 2:
                ArrayList arrayList4 = new ArrayList();
                try {
                    arrayList4.add(0, new ArrayList(Varioqub.getAllKeys()));
                } catch (Throwable th3) {
                    arrayList4 = l.J(th3);
                }
                eVar.f(arrayList4);
                break;
            case 3:
                ArrayList arrayList5 = new ArrayList();
                try {
                    Varioqub.setDefaults((Map) ((ArrayList) obj).get(0));
                    arrayList5.add(0, null);
                } catch (Throwable th4) {
                    arrayList5 = l.J(th4);
                }
                eVar.f(arrayList5);
                break;
            case 4:
                Varioqub.fetchConfig(new j(6, new e(4, new ArrayList(), eVar)));
                break;
            case 5:
                ArrayList arrayList6 = new ArrayList();
                try {
                    Varioqub.activateConfig(null);
                    arrayList6.add(0, null);
                } catch (Throwable th5) {
                    arrayList6 = l.J(th5);
                }
                eVar.f(arrayList6);
                break;
            case 6:
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = (ArrayList) obj;
                try {
                    arrayList7.add(0, Varioqub.getString((String) arrayList8.get(0), (String) arrayList8.get(1)));
                } catch (Throwable th6) {
                    arrayList7 = l.J(th6);
                }
                eVar.f(arrayList7);
                break;
            case 7:
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = (ArrayList) obj;
                try {
                    arrayList9.add(0, Boolean.valueOf(Varioqub.getBoolean((String) arrayList10.get(0), ((Boolean) arrayList10.get(1)).booleanValue())));
                } catch (Throwable th7) {
                    arrayList9 = l.J(th7);
                }
                eVar.f(arrayList9);
                break;
            case 8:
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = (ArrayList) obj;
                String str = (String) arrayList12.get(0);
                Number number = (Number) arrayList12.get(1);
                if (number == null) {
                    valueOf = null;
                } else {
                    try {
                        valueOf = Long.valueOf(number.longValue());
                    } catch (Throwable th8) {
                        arrayList11 = l.J(th8);
                    }
                }
                arrayList11.add(0, Long.valueOf(Varioqub.getLong(str, valueOf.longValue())));
                eVar.f(arrayList11);
                break;
            case 9:
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = (ArrayList) obj;
                try {
                    arrayList13.add(0, Double.valueOf(Varioqub.getDouble((String) arrayList14.get(0), ((Double) arrayList14.get(1)).doubleValue())));
                } catch (Throwable th9) {
                    arrayList13 = l.J(th9);
                }
                eVar.f(arrayList13);
                break;
            default:
                ArrayList arrayList15 = new ArrayList();
                try {
                    arrayList15.add(0, Varioqub.getId());
                } catch (Throwable th10) {
                    arrayList15 = l.J(th10);
                }
                eVar.f(arrayList15);
                break;
        }
    }

    public /* synthetic */ b(int i2, Object obj) {
        this.f655a = i2;
    }

    @Override // io.appmetrica.analytics.impl.zo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f655a) {
            case C0376e9.f5883D /* 20 */:
                return C0857wo.a(jSONObject, jSONObject2);
            default:
                return C0883xo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0519jn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0749sk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0477i6
    public boolean a(Throwable th) {
        return C0395f2.a(th);
    }
}
