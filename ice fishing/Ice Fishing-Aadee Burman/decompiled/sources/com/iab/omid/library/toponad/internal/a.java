package com.iab.omid.library.toponad.internal;

import android.content.Context;
import com.iab.omid.library.toponad.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f36233f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.toponad.utils.f f36234a = new com.iab.omid.library.toponad.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f36235b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36236c;

    /* renamed from: d, reason: collision with root package name */
    private d f36237d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36238e;

    private a(d dVar) {
        this.f36237d = dVar;
    }

    public static a a() {
        return f36233f;
    }

    private void c() {
        if (!this.f36236c || this.f36235b == null) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f36235b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a9 = this.f36234a.a();
        Date date = this.f36235b;
        if (date == null || a9.after(date)) {
            this.f36235b = a9;
            c();
        }
    }

    public void a(Context context) {
        if (this.f36236c) {
            return;
        }
        this.f36237d.a(context);
        this.f36237d.a(this);
        this.f36237d.e();
        this.f36238e = this.f36237d.c();
        this.f36236c = true;
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z3) {
        if (!this.f36238e && z3) {
            d();
        }
        this.f36238e = z3;
    }
}
