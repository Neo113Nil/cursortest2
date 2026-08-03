package z0;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import e2.p;
import s.v;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final m7.g f9050a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9051b;

    /* renamed from: c, reason: collision with root package name */
    public final r f9052c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.a f9053d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9054e;

    /* renamed from: f, reason: collision with root package name */
    public final AutofillId f9055f;

    /* renamed from: g, reason: collision with root package name */
    public final v f9056g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9057h;

    public b(m7.g gVar, p pVar, r rVar, f2.a aVar, String str) {
        this.f9050a = gVar;
        this.f9051b = pVar;
        this.f9052c = rVar;
        this.f9053d = aVar;
        this.f9054e = str;
        new Rect();
        rVar.setImportantForAutofill(1);
        AutofillId autofillId = rVar.getAutofillId();
        if (autofillId == null) {
            throw a4.d.e("Required value was null.");
        }
        this.f9055f = autofillId;
        this.f9056g = new v();
    }
}
