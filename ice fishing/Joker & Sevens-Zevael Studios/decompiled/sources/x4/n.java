package x4;

import android.content.Context;
import android.graphics.Typeface;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.work.impl.WorkDatabase_Impl;
import java.nio.ByteBuffer;
import q3.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements z0.e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8316a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8317b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8318c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8319d;

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f8316a = workDatabase_Impl;
        this.f8317b = new b(workDatabase_Impl, 4);
        this.f8318c = new h(workDatabase_Impl, 2);
        this.f8319d = new h(workDatabase_Impl, 3);
    }

    public n(Context context, a5.c cVar) {
        pc.j.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        pc.j.d(applicationContext, "context.applicationContext");
        v4.a aVar = new v4.a(applicationContext, cVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        pc.j.d(applicationContext2, "context.applicationContext");
        v4.a aVar2 = new v4.a(applicationContext2, cVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        pc.j.d(applicationContext3, "context.applicationContext");
        String str = v4.i.f7223a;
        v4.h hVar = new v4.h(applicationContext3, cVar);
        Context applicationContext4 = context.getApplicationContext();
        pc.j.d(applicationContext4, "context.applicationContext");
        v4.a aVar3 = new v4.a(applicationContext4, cVar, 2);
        this.f8316a = aVar;
        this.f8317b = aVar2;
        this.f8318c = hVar;
        this.f8319d = aVar3;
    }

    public n(y1.r rVar, z0.j jVar) {
        this.f8316a = rVar;
        this.f8317b = jVar;
        AutofillManager autofillManager = (AutofillManager) rVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f8318c = autofillManager;
            rVar.setImportantForAutofill(1);
            AutofillId autofillId = rVar.getAutofillId();
            if (autofillId != null) {
                this.f8319d = autofillId;
                return;
            }
            throw a4.d.e("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public n(Typeface typeface, r3.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f8319d = typeface;
        this.f8316a = bVar;
        this.f8318c = new q3.s(1024);
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i14 = a6 + bVar.f1310g;
            i10 = ((ByteBuffer) bVar.f1313j).getInt(((ByteBuffer) bVar.f1313j).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f8317b = new char[i10 * 2];
        int a8 = bVar.a(6);
        if (a8 != 0) {
            int i15 = a8 + bVar.f1310g;
            i11 = ((ByteBuffer) bVar.f1313j).getInt(((ByteBuffer) bVar.f1313j).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            t tVar = new t(this, i16);
            r3.a b2 = tVar.b();
            int a10 = b2.a(4);
            Character.toChars(a10 != 0 ? ((ByteBuffer) b2.f1313j).getInt(a10 + b2.f1310g) : 0, (char[]) this.f8317b, i16 * 2);
            r3.a b10 = tVar.b();
            int a11 = b10.a(16);
            if (a11 != 0) {
                int i17 = a11 + b10.f1310g;
                i12 = ((ByteBuffer) b10.f1313j).getInt(((ByteBuffer) b10.f1313j).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                q3.s sVar = (q3.s) this.f8318c;
                r3.a b11 = tVar.b();
                int a12 = b11.a(16);
                if (a12 != 0) {
                    int i18 = a12 + b11.f1310g;
                    i13 = ((ByteBuffer) b11.f1313j).getInt(((ByteBuffer) b11.f1313j).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(tVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }
}
