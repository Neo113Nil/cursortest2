package com.anythink.core.common.s.b;

import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.s.a.g;
import com.anythink.core.common.s.a.j;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16394a = "c";

    /* renamed from: b, reason: collision with root package name */
    private final String f16395b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16396c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.s.a.a f16397d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16398e;

    public c(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        j b9 = aVar.b();
        this.f16397d = b9;
        this.f16398e = cVar.d();
        String b10 = cVar.b();
        this.f16395b = b10;
        if (b10.endsWith(u.f12812a)) {
            this.f16396c = true;
        } else {
            this.f16396c = b9.getBoolean(u.a.f12822a, false);
        }
    }

    private static com.anythink.core.common.s.a.a a(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        return aVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v9) {
        com.anythink.core.common.s.a.a aVar;
        if (!TextUtils.isEmpty(str) && v9 != 0 && (aVar = this.f16397d) != null) {
            try {
                return v9 instanceof String ? (V) aVar.getString(str, (String) v9) : v9 instanceof Integer ? (V) Integer.valueOf(aVar.getInt(str, ((Integer) v9).intValue())) : v9 instanceof Long ? (V) Long.valueOf(aVar.getLong(str, ((Long) v9).longValue())) : v9 instanceof Double ? (V) Double.valueOf(aVar.a(str, ((Double) v9).doubleValue())) : v9 instanceof Float ? (V) Float.valueOf(aVar.getFloat(str, ((Float) v9).floatValue())) : v9 instanceof Boolean ? (V) Boolean.valueOf(aVar.getBoolean(str, ((Boolean) v9).booleanValue())) : (V) aVar.d(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v9;
    }

    public final boolean c() {
        return this.f16396c;
    }

    public final void d() {
        this.f16396c = true;
        a(u.a.f12822a, Boolean.TRUE);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9) {
        a(str, v9, this.f16398e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9, int i) {
        if (TextUtils.isEmpty(str) || v9 == 0 || this.f16397d == null) {
            return;
        }
        try {
            String obj = v9.toString();
            if (v9 instanceof String) {
                this.f16397d.putString(str, (String) v9);
            } else if (v9 instanceof Integer) {
                this.f16397d.putInt(str, Integer.parseInt(obj));
            } else if (v9 instanceof Long) {
                this.f16397d.putLong(str, Long.parseLong(obj));
            } else if (v9 instanceof Double) {
                this.f16397d.b(str, Double.parseDouble(obj));
            } else if (v9 instanceof Float) {
                this.f16397d.putFloat(str, Float.parseFloat(obj));
            } else if (v9 instanceof Boolean) {
                this.f16397d.putBoolean(str, Boolean.parseBoolean(obj));
            }
            a(i);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        com.anythink.core.common.s.a.a aVar = this.f16397d;
        if (aVar != null) {
            aVar.remove(str);
            a(this.f16398e);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        com.anythink.core.common.s.a.a aVar = this.f16397d;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        com.anythink.core.common.s.a.a aVar = this.f16397d;
        if (aVar != null) {
            return aVar.getAll();
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        com.anythink.core.common.s.a.a aVar = this.f16397d;
        return aVar != null && aVar.contains(str);
    }

    private void a(int i) {
        com.anythink.core.common.s.a.a aVar = this.f16397d;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof g) {
            i = ((g) aVar).j();
        } else if ((aVar instanceof j) && i == 0) {
            i = 1;
        }
        this.f16397d.getClass();
        if (i == 1) {
            this.f16397d.apply();
        } else if (i == 2) {
            this.f16397d.commit();
        }
    }
}
