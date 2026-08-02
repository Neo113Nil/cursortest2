package com.anythink.expressad.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19282a = "a";

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f19283c;

    /* renamed from: b, reason: collision with root package name */
    SharedPreferences f19284b;

    private a() {
    }

    public static a a() {
        if (f19283c == null) {
            synchronized (a.class) {
                try {
                    if (f19283c == null) {
                        f19283c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19283c;
    }

    private int b(String str, int i) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return i;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            return this.f19284b.getInt(str, i);
        } catch (Exception e10) {
            e10.printStackTrace();
            return i;
        }
    }

    private int c(String str) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return 0;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            return this.f19284b.getInt(str, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private Long d(String str) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return 0L;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            return Long.valueOf(this.f19284b.getLong(str, 0L));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        Context e9 = com.anythink.expressad.foundation.b.a.c().e();
        if (e9 == null) {
            return null;
        }
        if (this.f19284b == null) {
            this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
        }
        Iterator<Map.Entry<String, ?>> it = this.f19284b.getAll().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            SharedPreferences.Editor edit = this.f19284b.edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b(String str) {
        Context e9 = com.anythink.expressad.foundation.b.a.c().e();
        if (e9 == null) {
            return;
        }
        if (this.f19284b == null) {
            this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
        }
        this.f19284b.edit().remove(str).apply();
    }

    private void a(String str, int i) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            SharedPreferences.Editor edit = this.f19284b.edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(String str, long j6) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            SharedPreferences.Editor edit = this.f19284b.edit();
            edit.putLong(str, j6);
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String a(String str) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            if (e9 == null) {
                return null;
            }
            if (this.f19284b == null) {
                this.f19284b = e9.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0);
            }
            return this.f19284b.getString(str, "");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
