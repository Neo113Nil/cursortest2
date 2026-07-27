package com.iab.omid.library.toponad.internal;

import android.content.Context;
import com.iab.omid.library.toponad.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f36395f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.toponad.utils.f f36396a = new com.iab.omid.library.toponad.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f36397b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36398c;

    /* renamed from: d, reason: collision with root package name */
    private d f36399d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36400e;

    private a(d dVar) {
        this.f36399d = dVar;
    }

    public static a a() {
        return f36395f;
    }

    private void c() {
        if (!this.f36398c || this.f36397b == null) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f36397b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a9 = this.f36396a.a();
        Date date = this.f36397b;
        if (date == null || a9.after(date)) {
            this.f36397b = a9;
            c();
        }
    }

    public void a(Context context) {
        if (this.f36398c) {
            return;
        }
        this.f36399d.a(context);
        this.f36399d.a(this);
        this.f36399d.e();
        this.f36400e = this.f36399d.c();
        this.f36398c = true;
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z8) {
        if (!this.f36400e && z8) {
            d();
        }
        this.f36400e = z8;
    }
}
