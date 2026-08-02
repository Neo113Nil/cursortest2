package com.iab.omid.library.toponad.internal;

import android.content.Context;
import com.iab.omid.library.toponad.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f37000f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.toponad.utils.f f37001a = new com.iab.omid.library.toponad.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f37002b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37003c;

    /* renamed from: d, reason: collision with root package name */
    private d f37004d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37005e;

    private a(d dVar) {
        this.f37004d = dVar;
    }

    public static a a() {
        return f37000f;
    }

    private void c() {
        if (!this.f37003c || this.f37002b == null) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f37002b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a9 = this.f37001a.a();
        Date date = this.f37002b;
        if (date == null || a9.after(date)) {
            this.f37002b = a9;
            c();
        }
    }

    public void a(Context context) {
        if (this.f37003c) {
            return;
        }
        this.f37004d.a(context);
        this.f37004d.a(this);
        this.f37004d.e();
        this.f37005e = this.f37004d.c();
        this.f37003c = true;
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z6) {
        if (!this.f37005e && z6) {
            d();
        }
        this.f37005e = z6;
    }
}
