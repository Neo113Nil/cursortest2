package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.connectsdk.service.airplay.PListParser;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v5s implements ux8 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ v5s(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        Object obj;
        JSONObject jSONObject;
        boolean z;
        String str;
        Object obj2;
        JSONObject jSONObject2;
        String C;
        String str2;
        int i = this.a;
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        switch (i) {
            case 0:
                List n = dp8Var.n();
                if (n != null) {
                    Iterator it = n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.d(((rx8) obj).a, "tanker_string_variable")) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    rx8 rx8Var = (rx8) obj;
                    if (rx8Var != null && (jSONObject = rx8Var.b) != null) {
                        Iterator<String> keys = jSONObject.keys();
                        keys.getClass();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                            jSONObject3.getClass();
                            String C2 = wct.C("tanker_key", jSONObject3);
                            if (C2 == null) {
                                break;
                            } else {
                                try {
                                    z = jSONObject3.getBoolean("is_array");
                                } catch (JSONException unused) {
                                    z = false;
                                }
                                Context context = this.b;
                                int identifier = context.getResources().getIdentifier(C2, z ? PListParser.TAG_ARRAY : PListParser.TAG_STRING, context.getPackageName());
                                if (identifier == 0) {
                                    dfi.r("incorrect tanker key = ".concat(C2), "TankerStringVariableDivExtension");
                                    break;
                                } else {
                                    if (z) {
                                        try {
                                            int i2 = jSONObject3.getInt("index");
                                            str = context.getResources().getStringArray(identifier)[i2];
                                            if (str == null) {
                                                dfi.r(k5r.i(i2, "incorrect array index = "), "TankerStringVariableDivExtension");
                                                break;
                                            }
                                        } catch (JSONException unused2) {
                                            dfi.r("text from array but index = null, key = ".concat(C2), "TankerStringVariableDivExtension");
                                            return;
                                        }
                                    } else {
                                        str = context.getResources().getString(identifier);
                                        str.getClass();
                                    }
                                    next.getClass();
                                    gc8Var.N(next, str);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                List n2 = dp8Var.n();
                if (n2 != null) {
                    Iterator it2 = n2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (Intrinsics.d(((rx8) obj2).a, "tankerText")) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    rx8 rx8Var2 = (rx8) obj2;
                    if (rx8Var2 != null && (jSONObject2 = rx8Var2.b) != null && (C = wct.C("tanker_key", jSONObject2)) != null) {
                        Boolean z2 = fgq.z("is_array", jSONObject2);
                        boolean booleanValue = z2 != null ? z2.booleanValue() : false;
                        Context context2 = this.b;
                        int identifier2 = context2.getResources().getIdentifier(C, booleanValue ? PListParser.TAG_ARRAY : PListParser.TAG_STRING, context2.getPackageName());
                        if (identifier2 != 0) {
                            if (booleanValue) {
                                try {
                                    int i3 = jSONObject2.getInt("index");
                                    str2 = context2.getResources().getStringArray(identifier2)[i3];
                                    if (str2 == null) {
                                        dfi.r(k5r.i(i3, "incorrect array index = "), "TankerTextDivExtension");
                                        break;
                                    }
                                } catch (JSONException unused3) {
                                    dfi.r("text from array but index = null, key = ".concat(C), "TankerTextDivExtension");
                                    return;
                                }
                            } else {
                                str2 = context2.getResources().getString(identifier2);
                                str2.getClass();
                            }
                            TextView textView = view instanceof TextView ? (TextView) view : null;
                            if (textView != null) {
                                textView.setText(str2);
                                break;
                            }
                        } else {
                            dfi.r("incorrect tanker key = ".concat(C), "TankerTextDivExtension");
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        int i = this.a;
        dp8Var.getClass();
        switch (i) {
            case 0:
                return sj2.t(dp8Var, "tanker_string_variable");
            default:
                return sj2.t(dp8Var, "tankerText");
        }
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        int i = this.a;
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
    }
}
