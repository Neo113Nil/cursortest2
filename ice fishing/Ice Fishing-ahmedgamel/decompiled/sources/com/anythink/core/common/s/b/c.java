package com.anythink.core.common.s.b;

import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.s.a.g;
import com.anythink.core.common.s.a.j;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17181a = "c";

    /* renamed from: b, reason: collision with root package name */
    private final String f17182b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17183c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.s.a.a f17184d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17185e;

    public c(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        j b9 = aVar.b();
        this.f17184d = b9;
        this.f17185e = cVar.d();
        String b10 = cVar.b();
        this.f17182b = b10;
        if (b10.endsWith(u.f13598a)) {
            this.f17183c = true;
        } else {
            this.f17183c = b9.getBoolean(u.a.f13608a, false);
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
        if (!TextUtils.isEmpty(str) && v9 != 0 && (aVar = this.f17184d) != null) {
            try {
                return v9 instanceof String ? (V) aVar.getString(str, (String) v9) : v9 instanceof Integer ? (V) Integer.valueOf(aVar.getInt(str, ((Integer) v9).intValue())) : v9 instanceof Long ? (V) Long.valueOf(aVar.getLong(str, ((Long) v9).longValue())) : v9 instanceof Double ? (V) Double.valueOf(aVar.a(str, ((Double) v9).doubleValue())) : v9 instanceof Float ? (V) Float.valueOf(aVar.getFloat(str, ((Float) v9).floatValue())) : v9 instanceof Boolean ? (V) Boolean.valueOf(aVar.getBoolean(str, ((Boolean) v9).booleanValue())) : (V) aVar.d(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v9;
    }

    public final boolean c() {
        return this.f17183c;
    }

    public final void d() {
        this.f17183c = true;
        a(u.a.f13608a, Boolean.TRUE);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9) {
        a(str, v9, this.f17185e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9, int i) {
        if (TextUtils.isEmpty(str) || v9 == 0 || this.f17184d == null) {
            return;
        }
        try {
            String obj = v9.toString();
            if (v9 instanceof String) {
                this.f17184d.putString(str, (String) v9);
            } else if (v9 instanceof Integer) {
                this.f17184d.putInt(str, Integer.parseInt(obj));
            } else if (v9 instanceof Long) {
                this.f17184d.putLong(str, Long.parseLong(obj));
            } else if (v9 instanceof Double) {
                this.f17184d.b(str, Double.parseDouble(obj));
            } else if (v9 instanceof Float) {
                this.f17184d.putFloat(str, Float.parseFloat(obj));
            } else if (v9 instanceof Boolean) {
                this.f17184d.putBoolean(str, Boolean.parseBoolean(obj));
            }
            a(i);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        com.anythink.core.common.s.a.a aVar = this.f17184d;
        if (aVar != null) {
            aVar.remove(str);
            a(this.f17185e);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        com.anythink.core.common.s.a.a aVar = this.f17184d;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        com.anythink.core.common.s.a.a aVar = this.f17184d;
        if (aVar != null) {
            return aVar.getAll();
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        com.anythink.core.common.s.a.a aVar = this.f17184d;
        return aVar != null && aVar.contains(str);
    }

    private void a(int i) {
        com.anythink.core.common.s.a.a aVar = this.f17184d;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof g) {
            i = ((g) aVar).j();
        } else if ((aVar instanceof j) && i == 0) {
            i = 1;
        }
        this.f17184d.getClass();
        if (i == 1) {
            this.f17184d.apply();
        } else if (i == 2) {
            this.f17184d.commit();
        }
    }
}
