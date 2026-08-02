package com.anythink.core.common.e;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.c.b.e;
import com.anythink.core.common.e.a;
import com.anythink.core.common.e.b;
import com.anythink.core.common.e.f;
import com.anythink.core.common.e.g;
import com.anythink.core.common.e.h;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.e.n;
import com.anythink.core.common.e.o;
import com.anythink.core.common.e.p;
import com.anythink.core.common.e.q;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    private static e f13722a;

    private e(Context context) {
        super(context);
    }

    public static e a(Context context) {
        if (f13722a == null) {
            synchronized (e.class) {
                try {
                    if (f13722a == null) {
                        f13722a = new e(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13722a;
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.e.d
    public final void b(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.e.d
    public final String c() {
        return "anythink.db";
    }

    @Override // com.anythink.core.common.e.d
    public final int d() {
        return 20;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f.a.f13730f);
            sQLiteDatabase.execSQL(k.a.i);
            a(sQLiteDatabase, 3, 20);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'placement_ad_impression'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'inspect_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'user_value_placement'");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.e.d
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.e.d
    public final void a(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        for (int i6 = i; i6 < i4; i6++) {
            switch (i6) {
                case 1:
                case 2:
                    d(sQLiteDatabase);
                    c(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(p.a.f13870j);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(n.a.f13848h);
                    sQLiteDatabase.execSQL(o.a.f13859j);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(i.a.f13790h);
                    sQLiteDatabase.execSQL(h.a.f13779f);
                    break;
                case 6:
                    sQLiteDatabase.execSQL(l.a.f13825g);
                    break;
                case 7:
                    sQLiteDatabase.execSQL(q.a.f13880h);
                    break;
                case 8:
                    sQLiteDatabase.execSQL(m.b.i);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
                    sQLiteDatabase.execSQL(k.a.i);
                    break;
                case 9:
                    sQLiteDatabase.execSQL(e.a.f12857l);
                    break;
                case 10:
                    try {
                        sQLiteDatabase.execSQL(e.a.f12857l);
                    } catch (Throwable unused) {
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                    sQLiteDatabase.execSQL(o.a.f13859j);
                    break;
                case 11:
                    sQLiteDatabase.execSQL(e.a.f12858m);
                    sQLiteDatabase.execSQL(e.a.f12859n);
                    break;
                case 12:
                    try {
                        sQLiteDatabase.execSQL(g.a.f13746O);
                        break;
                    } catch (Throwable th) {
                        th.getMessage();
                        break;
                    }
                case 13:
                    try {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                        sQLiteDatabase.execSQL(o.a.f13859j);
                        break;
                    } catch (SQLException e9) {
                        e9.getMessage();
                        break;
                    }
                case 14:
                    try {
                        sQLiteDatabase.execSQL(l.a.f13826h);
                        break;
                    } catch (Throwable th2) {
                        th2.getMessage();
                        break;
                    }
                case 15:
                    if (i == 15) {
                        try {
                            sQLiteDatabase.execSQL(l.a.i);
                            break;
                        } catch (Throwable th3) {
                            th3.getMessage();
                            break;
                        }
                    } else {
                        break;
                    }
                case 16:
                    try {
                        sQLiteDatabase.execSQL(j.a.f13799g);
                        sQLiteDatabase.execSQL(j.a.f13800h);
                        sQLiteDatabase.execSQL(j.a.i);
                        sQLiteDatabase.execSQL(j.a.f13801j);
                        sQLiteDatabase.execSQL(j.a.f13802k);
                        sQLiteDatabase.execSQL(j.a.f13803l);
                        break;
                    } catch (Throwable th4) {
                        th4.getMessage();
                        break;
                    }
                case 17:
                    try {
                        sQLiteDatabase.execSQL(b.a.f13718h);
                        break;
                    } catch (Throwable unused2) {
                        break;
                    }
                case 18:
                    try {
                        sQLiteDatabase.execSQL(a.C0077a.f13705r);
                        break;
                    } catch (Throwable th5) {
                        th5.getMessage();
                        break;
                    }
                case 19:
                    try {
                        sQLiteDatabase.execSQL(a.C0077a.f13706s);
                        sQLiteDatabase.execSQL(a.C0077a.f13707t);
                        sQLiteDatabase.execSQL(a.C0077a.f13708u);
                        break;
                    } catch (Throwable th6) {
                        th6.getMessage();
                        break;
                    }
            }
        }
    }
}
