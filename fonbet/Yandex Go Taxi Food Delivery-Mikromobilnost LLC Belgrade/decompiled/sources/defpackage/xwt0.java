package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public final /* synthetic */ class xwt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x920 b;
    public final /* synthetic */ ba20 c;
    public final /* synthetic */ hqg w;

    public /* synthetic */ xwt0(hqg hqgVar, x920 x920Var, ba20 ba20Var) {
        this.a = 6;
        this.w = hqgVar;
        this.b = x920Var;
        this.c = ba20Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        ba20 ba20Var = this.c;
        x920 x920Var = this.b;
        final hqg hqgVar = this.w;
        switch (i) {
            case 0:
                HashMap hashMap = ywt0.c;
                final z920 z920Var = new z920(x920Var, ba20Var);
                hqgVar.k(z920Var, new Runnable() { // from class: fqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i5;
                        boolean z = false;
                        wwt0 wwt0Var = null;
                        z920 z920Var2 = z920Var;
                        hqg hqgVar2 = hqgVar;
                        switch (i6) {
                            case 0:
                                x920 x920Var2 = z920Var2.b;
                                Integer num = (Integer) x920Var2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(x920Var2.a("cancel"));
                                if (rez.a(hqgVar2.d)) {
                                    hqgVar2.g();
                                }
                                HashMap hashMap2 = hqgVar2.g;
                                if (equals) {
                                    wwt0 wwt0Var2 = (wwt0) hashMap2.get(num);
                                    if (wwt0Var2 != null) {
                                        hqgVar2.a(wwt0Var2);
                                    }
                                    z920Var2.success(null);
                                    return;
                                }
                                wwt0 wwt0Var3 = (wwt0) hashMap2.get(num);
                                try {
                                    try {
                                        if (wwt0Var3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = wwt0Var3.c;
                                        HashMap b = hqg.b(cursor, Integer.valueOf(wwt0Var3.b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            b.put("cursorId", num);
                                        }
                                        z920Var2.success(b);
                                        if (z) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var3);
                                        return;
                                    } catch (Exception e) {
                                        hqgVar2.h(e, z920Var2);
                                        if (wwt0Var3 != null) {
                                            hqgVar2.a(wwt0Var3);
                                        } else {
                                            wwt0Var = wwt0Var3;
                                        }
                                        if (0 != 0 || wwt0Var == null) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && wwt0Var3 != null) {
                                        hqgVar2.a(wwt0Var3);
                                    }
                                    throw th;
                                }
                            case 1:
                                hqgVar2.d(z920Var2);
                                return;
                            case 2:
                                hqgVar2.e(z920Var2);
                                return;
                            case 3:
                                hqgVar2.c(z920Var2);
                                return;
                            default:
                                Object a = z920Var2.a("inTransaction");
                                Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                                if (Boolean.TRUE.equals(bool) && z920Var2.b.c("transactionId") && ((Integer) z920Var2.a("transactionId")) == null) {
                                    z = true;
                                }
                                if (z) {
                                    int i7 = hqgVar2.k + 1;
                                    hqgVar2.k = i7;
                                    hqgVar2.l = Integer.valueOf(i7);
                                }
                                if (!hqgVar2.f(z920Var2)) {
                                    if (z) {
                                        hqgVar2.l = null;
                                        return;
                                    }
                                    return;
                                } else if (z) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", hqgVar2.l);
                                    z920Var2.success(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        hqgVar2.l = null;
                                    }
                                    z920Var2.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = ywt0.c;
                final z920 z920Var2 = new z920(x920Var, ba20Var);
                hqgVar.k(z920Var2, new Runnable() { // from class: fqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i2;
                        boolean z = false;
                        wwt0 wwt0Var = null;
                        z920 z920Var22 = z920Var2;
                        hqg hqgVar2 = hqgVar;
                        switch (i6) {
                            case 0:
                                x920 x920Var2 = z920Var22.b;
                                Integer num = (Integer) x920Var2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(x920Var2.a("cancel"));
                                if (rez.a(hqgVar2.d)) {
                                    hqgVar2.g();
                                }
                                HashMap hashMap22 = hqgVar2.g;
                                if (equals) {
                                    wwt0 wwt0Var2 = (wwt0) hashMap22.get(num);
                                    if (wwt0Var2 != null) {
                                        hqgVar2.a(wwt0Var2);
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                                wwt0 wwt0Var3 = (wwt0) hashMap22.get(num);
                                try {
                                    try {
                                        if (wwt0Var3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = wwt0Var3.c;
                                        HashMap b = hqg.b(cursor, Integer.valueOf(wwt0Var3.b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            b.put("cursorId", num);
                                        }
                                        z920Var22.success(b);
                                        if (z) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var3);
                                        return;
                                    } catch (Exception e) {
                                        hqgVar2.h(e, z920Var22);
                                        if (wwt0Var3 != null) {
                                            hqgVar2.a(wwt0Var3);
                                        } else {
                                            wwt0Var = wwt0Var3;
                                        }
                                        if (0 != 0 || wwt0Var == null) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && wwt0Var3 != null) {
                                        hqgVar2.a(wwt0Var3);
                                    }
                                    throw th;
                                }
                            case 1:
                                hqgVar2.d(z920Var22);
                                return;
                            case 2:
                                hqgVar2.e(z920Var22);
                                return;
                            case 3:
                                hqgVar2.c(z920Var22);
                                return;
                            default:
                                Object a = z920Var22.a("inTransaction");
                                Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                                if (Boolean.TRUE.equals(bool) && z920Var22.b.c("transactionId") && ((Integer) z920Var22.a("transactionId")) == null) {
                                    z = true;
                                }
                                if (z) {
                                    int i7 = hqgVar2.k + 1;
                                    hqgVar2.k = i7;
                                    hqgVar2.l = Integer.valueOf(i7);
                                }
                                if (!hqgVar2.f(z920Var22)) {
                                    if (z) {
                                        hqgVar2.l = null;
                                        return;
                                    }
                                    return;
                                } else if (z) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", hqgVar2.l);
                                    z920Var22.success(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        hqgVar2.l = null;
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = ywt0.c;
                final z920 z920Var3 = new z920(x920Var, ba20Var);
                hqgVar.k(z920Var3, new Runnable() { // from class: fqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i4;
                        boolean z = false;
                        wwt0 wwt0Var = null;
                        z920 z920Var22 = z920Var3;
                        hqg hqgVar2 = hqgVar;
                        switch (i6) {
                            case 0:
                                x920 x920Var2 = z920Var22.b;
                                Integer num = (Integer) x920Var2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(x920Var2.a("cancel"));
                                if (rez.a(hqgVar2.d)) {
                                    hqgVar2.g();
                                }
                                HashMap hashMap22 = hqgVar2.g;
                                if (equals) {
                                    wwt0 wwt0Var2 = (wwt0) hashMap22.get(num);
                                    if (wwt0Var2 != null) {
                                        hqgVar2.a(wwt0Var2);
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                                wwt0 wwt0Var3 = (wwt0) hashMap22.get(num);
                                try {
                                    try {
                                        if (wwt0Var3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = wwt0Var3.c;
                                        HashMap b = hqg.b(cursor, Integer.valueOf(wwt0Var3.b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            b.put("cursorId", num);
                                        }
                                        z920Var22.success(b);
                                        if (z) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var3);
                                        return;
                                    } catch (Exception e) {
                                        hqgVar2.h(e, z920Var22);
                                        if (wwt0Var3 != null) {
                                            hqgVar2.a(wwt0Var3);
                                        } else {
                                            wwt0Var = wwt0Var3;
                                        }
                                        if (0 != 0 || wwt0Var == null) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && wwt0Var3 != null) {
                                        hqgVar2.a(wwt0Var3);
                                    }
                                    throw th;
                                }
                            case 1:
                                hqgVar2.d(z920Var22);
                                return;
                            case 2:
                                hqgVar2.e(z920Var22);
                                return;
                            case 3:
                                hqgVar2.c(z920Var22);
                                return;
                            default:
                                Object a = z920Var22.a("inTransaction");
                                Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                                if (Boolean.TRUE.equals(bool) && z920Var22.b.c("transactionId") && ((Integer) z920Var22.a("transactionId")) == null) {
                                    z = true;
                                }
                                if (z) {
                                    int i7 = hqgVar2.k + 1;
                                    hqgVar2.k = i7;
                                    hqgVar2.l = Integer.valueOf(i7);
                                }
                                if (!hqgVar2.f(z920Var22)) {
                                    if (z) {
                                        hqgVar2.l = null;
                                        return;
                                    }
                                    return;
                                } else if (z) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", hqgVar2.l);
                                    z920Var22.success(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        hqgVar2.l = null;
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = ywt0.c;
                try {
                    hqgVar.i.setLocale(Locale.forLanguageTag((String) x920Var.a("locale")));
                    ba20Var.success(null);
                    break;
                } catch (Exception e) {
                    ba20Var.error("sqlite_error", "Error calling setLocale: " + e.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = ywt0.c;
                final z920 z920Var4 = new z920(x920Var, ba20Var);
                final int i6 = 4;
                hqgVar.k(z920Var4, new Runnable() { // from class: fqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i62 = i6;
                        boolean z = false;
                        wwt0 wwt0Var = null;
                        z920 z920Var22 = z920Var4;
                        hqg hqgVar2 = hqgVar;
                        switch (i62) {
                            case 0:
                                x920 x920Var2 = z920Var22.b;
                                Integer num = (Integer) x920Var2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(x920Var2.a("cancel"));
                                if (rez.a(hqgVar2.d)) {
                                    hqgVar2.g();
                                }
                                HashMap hashMap22 = hqgVar2.g;
                                if (equals) {
                                    wwt0 wwt0Var2 = (wwt0) hashMap22.get(num);
                                    if (wwt0Var2 != null) {
                                        hqgVar2.a(wwt0Var2);
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                                wwt0 wwt0Var3 = (wwt0) hashMap22.get(num);
                                try {
                                    try {
                                        if (wwt0Var3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = wwt0Var3.c;
                                        HashMap b = hqg.b(cursor, Integer.valueOf(wwt0Var3.b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            b.put("cursorId", num);
                                        }
                                        z920Var22.success(b);
                                        if (z) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var3);
                                        return;
                                    } catch (Exception e2) {
                                        hqgVar2.h(e2, z920Var22);
                                        if (wwt0Var3 != null) {
                                            hqgVar2.a(wwt0Var3);
                                        } else {
                                            wwt0Var = wwt0Var3;
                                        }
                                        if (0 != 0 || wwt0Var == null) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && wwt0Var3 != null) {
                                        hqgVar2.a(wwt0Var3);
                                    }
                                    throw th;
                                }
                            case 1:
                                hqgVar2.d(z920Var22);
                                return;
                            case 2:
                                hqgVar2.e(z920Var22);
                                return;
                            case 3:
                                hqgVar2.c(z920Var22);
                                return;
                            default:
                                Object a = z920Var22.a("inTransaction");
                                Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                                if (Boolean.TRUE.equals(bool) && z920Var22.b.c("transactionId") && ((Integer) z920Var22.a("transactionId")) == null) {
                                    z = true;
                                }
                                if (z) {
                                    int i7 = hqgVar2.k + 1;
                                    hqgVar2.k = i7;
                                    hqgVar2.l = Integer.valueOf(i7);
                                }
                                if (!hqgVar2.f(z920Var22)) {
                                    if (z) {
                                        hqgVar2.l = null;
                                        return;
                                    }
                                    return;
                                } else if (z) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", hqgVar2.l);
                                    z920Var22.success(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        hqgVar2.l = null;
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = ywt0.c;
                final z920 z920Var5 = new z920(x920Var, ba20Var);
                hqgVar.k(z920Var5, new Runnable() { // from class: fqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i62 = i3;
                        boolean z = false;
                        wwt0 wwt0Var = null;
                        z920 z920Var22 = z920Var5;
                        hqg hqgVar2 = hqgVar;
                        switch (i62) {
                            case 0:
                                x920 x920Var2 = z920Var22.b;
                                Integer num = (Integer) x920Var2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(x920Var2.a("cancel"));
                                if (rez.a(hqgVar2.d)) {
                                    hqgVar2.g();
                                }
                                HashMap hashMap22 = hqgVar2.g;
                                if (equals) {
                                    wwt0 wwt0Var2 = (wwt0) hashMap22.get(num);
                                    if (wwt0Var2 != null) {
                                        hqgVar2.a(wwt0Var2);
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                                wwt0 wwt0Var3 = (wwt0) hashMap22.get(num);
                                try {
                                    try {
                                        if (wwt0Var3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = wwt0Var3.c;
                                        HashMap b = hqg.b(cursor, Integer.valueOf(wwt0Var3.b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            b.put("cursorId", num);
                                        }
                                        z920Var22.success(b);
                                        if (z) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var3);
                                        return;
                                    } catch (Exception e2) {
                                        hqgVar2.h(e2, z920Var22);
                                        if (wwt0Var3 != null) {
                                            hqgVar2.a(wwt0Var3);
                                        } else {
                                            wwt0Var = wwt0Var3;
                                        }
                                        if (0 != 0 || wwt0Var == null) {
                                            return;
                                        }
                                        hqgVar2.a(wwt0Var);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && wwt0Var3 != null) {
                                        hqgVar2.a(wwt0Var3);
                                    }
                                    throw th;
                                }
                            case 1:
                                hqgVar2.d(z920Var22);
                                return;
                            case 2:
                                hqgVar2.e(z920Var22);
                                return;
                            case 3:
                                hqgVar2.c(z920Var22);
                                return;
                            default:
                                Object a = z920Var22.a("inTransaction");
                                Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                                if (Boolean.TRUE.equals(bool) && z920Var22.b.c("transactionId") && ((Integer) z920Var22.a("transactionId")) == null) {
                                    z = true;
                                }
                                if (z) {
                                    int i7 = hqgVar2.k + 1;
                                    hqgVar2.k = i7;
                                    hqgVar2.l = Integer.valueOf(i7);
                                }
                                if (!hqgVar2.f(z920Var22)) {
                                    if (z) {
                                        hqgVar2.l = null;
                                        return;
                                    }
                                    return;
                                } else if (z) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", hqgVar2.l);
                                    z920Var22.success(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        hqgVar2.l = null;
                                    }
                                    z920Var22.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = ywt0.c;
                z920 z920Var6 = new z920(x920Var, ba20Var);
                boolean c = z920Var6.c();
                Boolean bool = Boolean.TRUE;
                x920 x920Var2 = z920Var6.b;
                boolean equals = bool.equals(x920Var2.a("continueOnError"));
                List list = (List) x920Var2.a("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ff5 ff5Var = new ff5((Map) it.next(), c);
                    String b = ff5Var.b();
                    b.getClass();
                    char c2 = 65535;
                    switch (b.hashCode()) {
                        case -1319569547:
                            if (b.equals("execute")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1183792455:
                            if (b.equals("insert")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -838846263:
                            if (b.equals("update")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 107944136:
                            if (b.equals("query")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    m2v m2vVar = ff5Var.b;
                    switch (c2) {
                        case 0:
                            if (!hqgVar.f(ff5Var)) {
                                if (!equals) {
                                    ba20Var.error((String) m2vVar.b, (String) m2vVar.c, m2vVar.w);
                                    break;
                                } else {
                                    ff5Var.e(arrayList);
                                    break;
                                }
                            } else {
                                ff5Var.success(null);
                                ff5Var.f(arrayList);
                                break;
                            }
                        case 1:
                            if (!hqgVar.c(ff5Var)) {
                                if (!equals) {
                                    ba20Var.error((String) m2vVar.b, (String) m2vVar.c, m2vVar.w);
                                    break;
                                } else {
                                    ff5Var.e(arrayList);
                                    break;
                                }
                            } else {
                                ff5Var.f(arrayList);
                                break;
                            }
                        case 2:
                            if (!hqgVar.e(ff5Var)) {
                                if (!equals) {
                                    ba20Var.error((String) m2vVar.b, (String) m2vVar.c, m2vVar.w);
                                    break;
                                } else {
                                    ff5Var.e(arrayList);
                                    break;
                                }
                            } else {
                                ff5Var.f(arrayList);
                                break;
                            }
                        case 3:
                            if (!hqgVar.d(ff5Var)) {
                                if (!equals) {
                                    ba20Var.error((String) m2vVar.b, (String) m2vVar.c, m2vVar.w);
                                    break;
                                } else {
                                    ff5Var.e(arrayList);
                                    break;
                                }
                            } else {
                                ff5Var.f(arrayList);
                                break;
                            }
                        default:
                            ba20Var.error("bad_param", oyr.p("Batch method '", b, "' not supported"), null);
                            break;
                    }
                }
                if (!c) {
                    ba20Var.success(arrayList);
                    break;
                } else {
                    ba20Var.success(null);
                    break;
                }
        }
    }

    public /* synthetic */ xwt0(x920 x920Var, hqg hqgVar, ba20 ba20Var) {
        this.a = 3;
        this.b = x920Var;
        this.w = hqgVar;
        this.c = ba20Var;
    }

    public /* synthetic */ xwt0(x920 x920Var, ba20 ba20Var, hqg hqgVar, int i) {
        this.a = i;
        this.b = x920Var;
        this.c = ba20Var;
        this.w = hqgVar;
    }
}
