package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tlp {
    public ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c;
    public final av1 d;
    public final String e;

    public tlp(av1 av1Var, String str) {
        this.d = av1Var;
        this.e = str;
    }

    public final synchronized void a(ht0 ht0Var) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            ht0Var.getClass();
            if (this.a.size() + this.b.size() >= 1000) {
                this.c++;
            } else {
                this.a.add(ht0Var);
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final synchronized void b(boolean z) {
        if (bp6.a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.a.addAll(this.b);
            } catch (Throwable th) {
                bp6.a(this, th);
                return;
            }
        }
        this.b.clear();
        this.c = 0;
    }

    public final synchronized List c() {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.a;
            this.a = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final int d(ood oodVar, Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        boolean d;
        if (bp6.a.contains(this)) {
            return 0;
        }
        try {
            context.getClass();
            try {
                synchronized (this) {
                    try {
                        int i = this.c;
                        aib.b(this.a);
                        this.b.addAll(this.a);
                        this.a.clear();
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = this.b.iterator();
                        while (it.hasNext()) {
                            try {
                                ht0 ht0Var = (ht0) it.next();
                                String str = ht0Var.e;
                                if (str == null) {
                                    d = true;
                                } else {
                                    String jSONObject = ht0Var.a.toString();
                                    jSONObject.getClass();
                                    d = Intrinsics.d(ehv.b(jSONObject), str);
                                }
                                if (d) {
                                    if (!z && ht0Var.b) {
                                    }
                                    jSONArray.put(ht0Var.a);
                                } else {
                                    ht0Var.toString();
                                    HashSet hashSet = j3c.a;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            e(oodVar, context, i, jSONArray, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                            bp6.a(this, th);
                            return 0;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                bp6.a(this, th);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void e(ood oodVar, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (bp6.a.contains(this)) {
                return;
            }
            try {
                jSONObject = rt0.a(qt0.b, this.d, this.e, z, context);
                if (this.c > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            oodVar.c = jSONObject;
            Bundle bundle = oodVar.d;
            String jSONArray2 = jSONArray.toString();
            jSONArray2.getClass();
            bundle.putString("custom_events", jSONArray2);
            oodVar.d = bundle;
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
