package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.dw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3130dw implements InterfaceC3292gw {

    /* renamed from: e, reason: collision with root package name */
    public static final C3130dw f30648e = new C3130dw(new C3346hw());

    /* renamed from: a, reason: collision with root package name */
    public boolean f30649a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30650b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30651c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30652d;

    public C3130dw(C3346hw c3346hw) {
        this.f30652d = c3346hw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3292gw
    public void a(boolean z6) {
        if (!this.f30650b && z6) {
            Date date = new Date();
            Date date2 = (Date) this.f30651c;
            if (date2 == null || date.after(date2)) {
                this.f30651c = date;
                if (this.f30649a) {
                    Iterator it = Collections.unmodifiableCollection(C3238fw.f31233c.f31235b).iterator();
                    while (it.hasNext()) {
                        AbstractC3722ow abstractC3722ow = ((Uv) it.next()).f28836d;
                        Date date3 = (Date) this.f30651c;
                        abstractC3722ow.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f30650b = z6;
    }

    public C3130dw(C4297ze c4297ze, C4201xq c4201xq, C3827qt c3827qt) {
        this.f30649a = false;
        this.f30650b = false;
        this.f30651c = c3827qt;
        P3.a B3 = ((C3717or) c4201xq.f35841u).B(c3827qt.f34198b, c3827qt.f34197a, null);
        C3219fd c3219fd = new C3219fd(this, c4201xq, c4297ze, c3827qt, 5);
        RD rd = c3827qt.f34201e;
        this.f30652d = QC.r(QC.t(B3, c3219fd, rd), Exception.class, new C4187xc(this, c4201xq), rd);
    }
}
