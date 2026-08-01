package com.anythink.expressad.foundation.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f18529a;

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f18529a == null) {
            synchronized (c.class) {
                try {
                    if (f18529a == null) {
                        f18529a = new c(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18529a;
    }

    private static void f() {
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void b(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final String c() {
        return "anythink_expressad.db";
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final int d() {
        return 72;
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void e() {
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }
}
