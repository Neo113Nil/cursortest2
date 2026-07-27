package com.anythink.core.common.s.b;

import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.s.a.g;
import com.anythink.core.common.s.a.j;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16552a = "c";

    /* renamed from: b, reason: collision with root package name */
    private final String f16553b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16554c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.s.a.a f16555d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16556e;

    public c(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        j b9 = aVar.b();
        this.f16555d = b9;
        this.f16556e = cVar.d();
        String b10 = cVar.b();
        this.f16553b = b10;
        if (b10.endsWith(u.f12969a)) {
            this.f16554c = true;
        } else {
            this.f16554c = b9.getBoolean(u.a.f12979a, false);
        }
    }

    private static com.anythink.core.common.s.a.a a(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        return aVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v6) {
        com.anythink.core.common.s.a.a aVar;
        if (!TextUtils.isEmpty(str) && v6 != 0 && (aVar = this.f16555d) != null) {
            try {
                return v6 instanceof String ? (V) aVar.getString(str, (String) v6) : v6 instanceof Integer ? (V) Integer.valueOf(aVar.getInt(str, ((Integer) v6).intValue())) : v6 instanceof Long ? (V) Long.valueOf(aVar.getLong(str, ((Long) v6).longValue())) : v6 instanceof Double ? (V) Double.valueOf(aVar.a(str, ((Double) v6).doubleValue())) : v6 instanceof Float ? (V) Float.valueOf(aVar.getFloat(str, ((Float) v6).floatValue())) : v6 instanceof Boolean ? (V) Boolean.valueOf(aVar.getBoolean(str, ((Boolean) v6).booleanValue())) : (V) aVar.d(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v6;
    }

    public final boolean c() {
        return this.f16554c;
    }

    public final void d() {
        this.f16554c = true;
        a(u.a.f12979a, Boolean.TRUE);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v6) {
        a(str, v6, this.f16556e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v6, int i) {
        if (TextUtils.isEmpty(str) || v6 == 0 || this.f16555d == null) {
            return;
        }
        try {
            String obj = v6.toString();
            if (v6 instanceof String) {
                this.f16555d.putString(str, (String) v6);
            } else if (v6 instanceof Integer) {
                this.f16555d.putInt(str, Integer.parseInt(obj));
            } else if (v6 instanceof Long) {
                this.f16555d.putLong(str, Long.parseLong(obj));
            } else if (v6 instanceof Double) {
                this.f16555d.b(str, Double.parseDouble(obj));
            } else if (v6 instanceof Float) {
                this.f16555d.putFloat(str, Float.parseFloat(obj));
            } else if (v6 instanceof Boolean) {
                this.f16555d.putBoolean(str, Boolean.parseBoolean(obj));
            }
            a(i);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        com.anythink.core.common.s.a.a aVar = this.f16555d;
        if (aVar != null) {
            aVar.remove(str);
            a(this.f16556e);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        com.anythink.core.common.s.a.a aVar = this.f16555d;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        com.anythink.core.common.s.a.a aVar = this.f16555d;
        if (aVar != null) {
            return aVar.getAll();
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        com.anythink.core.common.s.a.a aVar = this.f16555d;
        return aVar != null && aVar.contains(str);
    }

    private void a(int i) {
        com.anythink.core.common.s.a.a aVar = this.f16555d;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof g) {
            i = ((g) aVar).j();
        } else if ((aVar instanceof j) && i == 0) {
            i = 1;
        }
        this.f16555d.getClass();
        if (i == 1) {
            this.f16555d.apply();
        } else if (i == 2) {
            this.f16555d.commit();
        }
    }
}
